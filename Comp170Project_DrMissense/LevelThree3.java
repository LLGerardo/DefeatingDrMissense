import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LevelThree3 {
    private ArrayList<Question> questionSet; // questions, with choices, stored in questionSet Array List

    // Make Level 3 constructor
    public LevelThree3() {
        questionSet = new ArrayList<Question>();
        String q = "\nPlease type the number for the correct 1-letter abbreviation for: Serine\n"; // Store each String question, q, in questionSet
        String[] a = {"S", "L", "P", "W"}; // Make new String Array List for answers, a, which includes the correct answer
        questionSet.add(new Question(q, a, "S")); // Add new String question, and String[] a, and correct answer to questionSet
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Tryptophan\n";
        a = new String[]{"W", "L", "T", "C"};
        questionSet.add(new Question(q, a, "W"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Proline\n";
        a = new String[]{"P", "L", "Y", "R"};
        questionSet.add(new Question(q, a, "P"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Leucine\n";
        a = new String[]{"L", "N", "E", "K"};
        questionSet.add(new Question(q, a, "L"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Arginine\n";
        a = new String[]{"R", "A", "N", "Q"};
        questionSet.add(new Question(q, a, "R"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Histidine\n";
        a = new String[]{"H", "I", "S", "T"};
        questionSet.add(new Question(q, a, "H"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Lysine\n";
        a = new String[]{"K", "L", "Y", "S"};
        questionSet.add(new Question(q, a, "K"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Aspartic Acid\n";
        a = new String[]{"D", "A", "F", "C"};
        questionSet.add(new Question(q, a, "D"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Glutamic Acid\n";
        a = new String[]{"E", "G", "Q", "A"};
        questionSet.add(new Question(q, a, "E"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Threonine\n";
        a = new String[]{"T", "Y", "W", "V"};
        questionSet.add(new Question(q, a, "T"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Asparagine\n";
        a = new String[]{"N", "A", "L", "E"};
        questionSet.add(new Question(q, a, "N"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Glutamine\n";
        a = new String[]{"Q", "G", "Y", "C"};
        questionSet.add(new Question(q, a, "Q"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Cysteine\n";
        a = new String[]{"C", "S", "Y", "T"};
        questionSet.add(new Question(q, a, "C"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Glycine\n";
        a = new String[]{"G", "Q", "N", "P"};
        questionSet.add(new Question(q, a, "G"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Alanine\n";
        a = new String[]{"A", "N", "L", "I"};
        questionSet.add(new Question(q, a, "A"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Valine\n";
        a = new String[]{"V", "M", "A", "T"};
        questionSet.add(new Question(q, a, "V"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Isoleucine\n";
        a = new String[]{"I", "L", "K", "F"};
        questionSet.add(new Question(q, a, "I"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Methionine\n";
        a = new String[]{"M", "Q", "S", "P"};
        questionSet.add(new Question(q, a, "M"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Phenylalanine\n";
        a = new String[]{"F", "P", "A", "E"};
        questionSet.add(new Question(q, a, "F"));
        q = "\nPlease type the number for the correct 1-letter abbreviation for: Tyrosine\n";
        a = new String[]{"Y", "T", "R", "D"};
        questionSet.add(new Question(q, a, "Y"));
        Collections.shuffle(questionSet, new Random()); // shuffles questions to user each time the game is played using Collections and Random class
    }

    public void start() {
        int score = 20; // start from score of 10
        int maxAttempts; // declare int maxAttempts variable
        while (score != 30) { // will oblige player to answer at least 10 questions correctly out of 20 amino acids
            Scanner scan = new Scanner(System.in); // declare Scanner170 object to store user input
            for (int question = 0; question < questionSet.size(); question++) {
                maxAttempts = 3; // user has 3 maximum attempts to answer question correctly
                String q = questionSet.get(question).getQuestion(); // declare String q that gets question from questionSet
                int numChoices = questionSet.get(question).getChoices().size(); // declare int numChoices by getting choices from specific question using Question class
                boolean correct = false; // while the user has not yet answered the question correctly
                String correctAnswer = questionSet.get(question).getAnswer(); // declare String correctAnswer by getting answer from specific question using Question class
                while (!correct && maxAttempts != 0) { // enter while loop while the question is not answered correctly and maxAttempts is more than 0
                    System.out.println(q); // prints String q from questionSet. Prints the same question again if the user does not answer the question correctly AND the user still has over 0 attempts left
                    for (int choice = 0; choice < numChoices; choice++) {
                        System.out.println((choice + 1) + ": " + questionSet.get(question).getChoices().get(choice));
                    }
                    int playerAnswer = scan.nextInt();
                    ArrayList<String> choiceSet = questionSet.get(question).getChoices(); // declare choiceSet array
                    int correctAnswerIndex = choiceSet.indexOf(correctAnswer); // indexes correct answer from choiceSet array
                    // how can I allow the user to type the amino acid in letters as the correct answer?
                    if (playerAnswer == correctAnswerIndex + 1) { // + 1 because indexes start from 0
                        correct = true; // question is answered correctly, can exit while loop
                        score++; // user receives one point
                        maxAttempts = 3; // maxAttempts reverted to 3, can exit while loop
                        System.out.println("\nScore: " + score); // prints score to user
                    } else {
                        maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                        if (maxAttempts != 0) { // allows user to try again before user reaches 0 attempts
                            System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                        } else { // if user reaches 0 attempts, prints out correct answer using String correctAnswer
                            System.out.print("\nYou are out of attempts.\nThe correct answer is: " + correctAnswer + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        }
                    }

                }
                if (score == 30) { // if the user answers at least 10 questions correct, break if statement, and exit out of constructor
                    System.out.println("Great job! You passed level 3!\n");
                    break;
                }
            }
            if (score != 30) { // if the user does not answer at least 10 questions correctly, restart the loop and allow user to try again
                System.out.println("Practice makes perfect! Let's try again.\n");
            }
        }

    }
}

