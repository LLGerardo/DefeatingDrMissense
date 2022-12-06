import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LevelTwo2 {
    private ArrayList<Question> questionSet; // questions, with choices, stored in questionSet Array List

    // Make Level 2 constructor
    public LevelTwo2() {
        questionSet = new ArrayList<Question>();
        String q = "\nPlease type the number for the correct side chain property for: Serine\n"; // Store each String question, q, in questionSet
        String[] a = {"Polar positive", "Polar negative", "Polar uncharged", "Special case", "Nonpolar"}; // Make new String Array List for answers, a, which includes the correct answer
        questionSet.add(new Question(q, a, "Polar uncharged")); // Add new String question, and String[] a, and correct answer to questionSet
        q = "\nPlease type the number for the correct side chain property for: Tryptophan\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Proline\n";
        questionSet.add(new Question(q, a, "Special case"));
        q = "\nPlease type the number for the correct side chain property for: Leucine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Arginine\n";
        questionSet.add(new Question(q, a, "Polar positive"));
        q = "\nPlease type the number for the correct side chain property for: Histidine\n";
        questionSet.add(new Question(q, a, "Polar positive"));
        q = "\nPlease type the number for the correct side chain property for: Lysine\n";
        questionSet.add(new Question(q, a, "Polar positive"));
        q = "\nPlease type the number for the correct side chain property for: Aspartic Acid\n";
        questionSet.add(new Question(q, a, "Polar negative"));
        q = "\nPlease type the number for the correct side chain property for: Glutamic Acid\n";
        questionSet.add(new Question(q, a, "Polar negative"));
        q = "\nPlease type the number for the correct side chain property for: Threonine\n";
        questionSet.add(new Question(q, a, "Polar uncharged"));
        q = "\nPlease type the number for the correct side chain property for: Asparagine\n";
        questionSet.add(new Question(q, a, "Polar uncharged"));
        q = "\nPlease type the number for the correct side chain property for: Glutamine\n";
        questionSet.add(new Question(q, a, "Polar uncharged"));
        q = "\nPlease type the number for the correct side chain property for: Cysteine\n";
        questionSet.add(new Question(q, a, "Special case"));
        q = "\nPlease type the number for the correct side chain property for: Glycine\n";
        questionSet.add(new Question(q, a, "Special case"));
        q = "\nPlease type the number for the correct side chain property for: Alanine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Valine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Isoleucine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Methionine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Phenylalanine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        q = "\nPlease type the number for the correct side chain property for: Tyrosine\n";
        questionSet.add(new Question(q, a, "Nonpolar"));
        Collections.shuffle(questionSet, new Random()); // shuffles questions to user each time the game is played using Collections and Random class
    }

    public void start() {
        int score = 10; // start from score of 10
        int maxAttempts; // declare int maxAttempts variable
        while (score != 20) { // will oblige player to answer at least 10 questions correctly out of 20 amino acids
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
                    // how can I allow the user to type the number for the number for the number for the number for the number for the number for the amino acid in letters as the correct answer?
                    if (playerAnswer == correctAnswerIndex + 1) { // + 1 because indexes start from 0
                        correct = true; // question is answered correctly, can exit while loop
                        score++; // user receives one point
                        maxAttempts = 3; // maxAttempts reverted to 3, exit while loop
                        System.out.println("\nScore: " + score); // prints score to user
                    } else {
                        maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                        if (maxAttempts != 0) { // allows user to try again before user reaches 0 attempts
                            System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                        } else { // if user reaches 0 attempts, prints out correct answer using String correctAnswer
                            System.out.print("\nYou are out of attempts.\nThe correct answer is: " + correctAnswer + "\nScore: " + score + "\n");
                        }
                    }

                }
                if (score == 20) { // if the user answers at least 10 questions correct, break if statement, and exit out of constructor
                    System.out.println("Great job! You passed level 2!");
                    break;
                }
            }
            if (score != 20) { // if the user does not answer at least 10 questions correctly, restart the loop and allow user to try again
                System.out.println("Practice makes perfect! Let's try again.\n");
            }
        }

    }
}

