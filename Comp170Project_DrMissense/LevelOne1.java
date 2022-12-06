import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LevelOne1 {
    private ArrayList<Question> questionSet; // questions, with choices, stored in questionSet Array List

    // Make Level 1 constructor
    public LevelOne1() {
        questionSet = new ArrayList<Question>();
        String q = "\nPlease type the number for the correct 3-letter abbreviation for: Serine\n"; // Store each String question, q, in questionSet
        String[] a = {"Ser", "Val", "Leu", "Pro"}; // Make new String Array List for answers, a, which includes the correct answer
        questionSet.add(new Question(q, a, "Ser")); // Add new String question, and String[] a, and correct answer to questionSet
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Tryptophan\n";
        a = new String[]{"Trp", "Met", "Glu", "Gln"};
        questionSet.add(new Question(q, a, "Trp"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Proline\n";
        a = new String[]{"Pro", "Gln", "Glu", "Leu"};
        questionSet.add(new Question(q, a, "Pro"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Leucine\n";
        a = new String[]{"Ala", "Cys", "Leu", "Asp"};
        questionSet.add(new Question(q, a, "Leu"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Arginine\n";
        a = new String[]{"Arg", "His", "Ile", "Tyr"};
        questionSet.add(new Question(q, a, "Arg"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Histidine\n";
        a = new String[]{"His", "Phe", "Lys", "Asn"};
        questionSet.add(new Question(q, a, "His"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Lysine\n";
        a = new String[]{"Lys", "Cys", "Leu", "Asp"};
        questionSet.add(new Question(q, a, "Lys"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Aspartic Acid\n";
        a = new String[]{"Asp", "Ser", "Gln", "Trp"};
        questionSet.add(new Question(q, a, "Asp"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Glutamic Acid\n";
        a = new String[]{"Glu", "Gln", "Gly", "Asp"};
        questionSet.add(new Question(q, a, "Glu"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Threonine\n";
        a = new String[]{"Thr", "Tyr", "Leu", "Trp"};
        questionSet.add(new Question(q, a, "Thr"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Asparagine\n";
        a = new String[]{"Asn", "Ala", "Asp", "Arg"};
        questionSet.add(new Question(q, a, "Asn"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Glutamine\n";
        a = new String[]{"Gln", "Glu", "Gly", "Phe"};
        questionSet.add(new Question(q, a, "Gln"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Cysteine\n";
        a = new String[]{"Cys", "Tyr", "Gln", "Thr"};
        questionSet.add(new Question(q, a, "Cys"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Glycine\n";
        a = new String[]{"Gly", "Glu", "Gln", "Cys"};
        questionSet.add(new Question(q, a, "Gly"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Alanine\n";
        a = new String[]{"Ala", "Asn", "Asp", "His"};
        questionSet.add(new Question(q, a, "Ala"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Valine\n";
        a = new String[]{"Val", "Met", "Arg", "Trp"};
        questionSet.add(new Question(q, a, "Val"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Isoleucine\n";
        a = new String[]{"Ile", "Glu", "Leu", "Val"};
        questionSet.add(new Question(q, a, "Ile"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Methionine\n";
        a = new String[]{"Met", "Asn", "Ser", "Phe"};
        questionSet.add(new Question(q, a, "Met"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Phenylalanine\n";
        a = new String[]{"Phe", "Pro", "Ala", "Lys"};
        questionSet.add(new Question(q, a, "Phe"));
        q = "\nPlease type the number for the correct 3-letter abbreviation for: Tyrosine\n";
        a = new String[]{"Tyr", "Trp", "Thr", "Ile"};
        questionSet.add(new Question(q, a, "Tyr"));
        Collections.shuffle(questionSet, new Random()); // shuffles questions to user each time the game is played using Collections and Random class
    }

    public void start() {
        int score = 0; // start from score of 0
        int maxAttempts; // declare maxAttempts variable
        while (score != 10) { // will oblige player to answer at least 10 questions correctly out of 20 amino acids
            Scanner scan = new Scanner(System.in); // declare Scanner170 object to store user input
            for (int question = 0; question < questionSet.size(); question++) {
                maxAttempts = 3; // user has 3 maximum attempts to answer question correctly
                String q = questionSet.get(question).getQuestion(); // declare String q that gets question from questionSet
                int numChoices = questionSet.get(question).getChoices().size(); // declare int numChoices by getting choices from specific question using Question class
                boolean correct = false; // while the user has not correctly answered the question correctly
                String correctAnswer = questionSet.get(question).getAnswer(); // declare String correctAnswer by getting answer from specific question using Question class
                while (!correct && maxAttempts != 0) { // enter while loop while the question is not answered correctly and maxAttempts is more than 0
                    System.out.println(q); // prints String q from questionSet. Prints the same question again if the user does not answer the question correctly AND the user still has over 0 attempts
                    for (int choice = 0; choice < numChoices; choice++) {
                        System.out.println((choice + 1) + ": " + questionSet.get(question).getChoices().get(choice));
                    }
                    int playerAnswer = scan.nextInt();
                    ArrayList<String> choiceSet = questionSet.get(question).getChoices(); // declare choiceSet array
                    int correctAnswerIndex = choiceSet.indexOf(correctAnswer); // indexes correct answer from choiceSet array
                    // how can I allow the user to type the number for the amino acid in letters as the correct answer?
                    if (playerAnswer == correctAnswerIndex + 1) { // + 1 because indexes start from 0
                        correct = true; // question is answered correctly, can exit while loop
                        score++; // user receives one point
                        maxAttempts = 3; // maxAttempts reverted to 3, exit while loop
                        System.out.println("\nScore: " + score); // prints score to user
                    } else {
                        choiceSet.indexOf(correctAnswer);
                        maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                        if (maxAttempts != 0) { // allows user to try again before user reaches 0 attempts
                            System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                        } else { // if user reaches 0 attempts, prints out correct answer using String correctAnswer
                            System.out.print("\nYou are out of attempts.\nThe correct answer is: " + correctAnswer + "\nScore: " + score + "\n"); // if the user runs out of attemt
                        }
                    }

                }
                if (score == 10) { // if the user answers at least 10 questions correct, break if statement, and exit out of constructor
                    System.out.println("Great job! You passed level 1!");
                    break;
                }
            }
            if (score != 10) { // if the user does not answer at least 10 questions correctly, restart the loop and allow user to try again
                System.out.println("Practice makes perfect! Let's try again.\n");
            }
        }

    }
}


