import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// special thanks to Klaud Rydzy for helping us to figure out how to upload images :)

// note: This level does not use question class due to use of JLabel
public class LevelFour4 {

    public LevelFour4() throws IOException {
        // declare 20 amino acid .png images of questions as BufferedImages
        BufferedImage img = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\tyrosine.png"));
        BufferedImage img2 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\serine.png"));
        BufferedImage img3 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\arginine.png"));
        BufferedImage img4 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\proline.png"));
        BufferedImage img5 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\glutamine.png"));
        BufferedImage img6 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\alanine.png"));
        BufferedImage img7 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\threonine.png"));
        BufferedImage img8 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\leucine.png"));
        BufferedImage img9 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\cysteine.png"));
        BufferedImage img10 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\methionine.png"));
        BufferedImage img11 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\histidine.png"));
        BufferedImage img12 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\phenylalanine.png"));
        BufferedImage img13 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\isoleucine.png"));
        BufferedImage img14 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\glutamicAcid.png"));
        BufferedImage img15 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\asparagine.png"));
        BufferedImage img16 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\asparticAcid.png"));
        BufferedImage img17 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\glycine.png"));
        BufferedImage img18 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\valine.png"));
        BufferedImage img19 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\tryptophan.png"));
        BufferedImage img20 = ImageIO.read(new File("C:\\COMP170+271\\COMP170+271\\_my_Java_programs\\src\\lysine.png"));

        // declare 20 new image icon objects for each amino acid
        ImageIcon icon = new ImageIcon(img); // Tyrosine
        ImageIcon icon2 = new ImageIcon(img2); // Serine
        ImageIcon icon3 = new ImageIcon(img3); // Arginine
        ImageIcon icon4 = new ImageIcon(img4); // Proline
        ImageIcon icon5 = new ImageIcon(img5); // Glutamine
        ImageIcon icon6 = new ImageIcon(img6); // Alanine
        ImageIcon icon7 = new ImageIcon(img7); // Threonine
        ImageIcon icon8 = new ImageIcon(img8); // Leucine
        ImageIcon icon9 = new ImageIcon(img9); // Cysteine
        ImageIcon icon10 = new ImageIcon(img10); // Methionine
        ImageIcon icon11 = new ImageIcon(img11); // Histidine
        ImageIcon icon12 = new ImageIcon(img12); // Phenylalanine
        ImageIcon icon13 = new ImageIcon(img13); // Isoleucine
        ImageIcon icon14 = new ImageIcon(img14); // Glutamic Acid
        ImageIcon icon15 = new ImageIcon(img15); // Asparagine
        ImageIcon icon16 = new ImageIcon(img16); // Aspartic Acid
        ImageIcon icon17 = new ImageIcon(img17); // Glycine
        ImageIcon icon18 = new ImageIcon(img18); // Valine
        ImageIcon icon19 = new ImageIcon(img19); // Tryptophan
        ImageIcon icon20 = new ImageIcon(img20); // Lysine


        JFrame frame = new JFrame(); // declare new JFrame object
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 350); // set size of JFrame
        frame.toFront(); // brings JLabel to front of main window
        frame.setAlwaysOnTop(true); // brings JLabel to front AND does not move to the back of the main window when user types response

        frame.setLocationByPlatform(true);

        JLabel lbl = new JLabel(); // create new JLabel object

        lbl.setIcon(icon); // 'Grab' image icon from above

        frame.add(lbl); // add icon to label and display to user

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JLabel closes when user hits x

        frame.setVisible(true);


        int score = 30; // scores starts from 30
        int maxAttempts = 3; // declare maxAttempts
        Scanner scan = new Scanner(System.in); // declare Scanner170 object to store user input
        boolean correct = false; // while the user has not yet answered the question correctly
        while (score != 40) { // user needs to answer at least 10 questions correctly
            while (!correct && score < 40) { // enter while loop for EACH question while the question is not yet answered correctly AND they do not have a score of 40 yet
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Tyrosine
                System.out.println("\na. Tryosine\nb. Serine\nc. Tryptophan\nd. Cysteine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("tyrosine") || playerAnswer.equalsIgnoreCase("a") || playerAnswer.equalsIgnoreCase("a.")) { // accounts for case insensitivity and predicting user input
                    lbl.setIcon(icon2); // Use .setIcon method to grab the next Image Icon object to display to the user when they move to the next while loop or question
                    score++; // user receives one point
                    correct = true; // answer is correct, exit out of while loop
                    System.out.println("\nScore: " + score); // prints out score to user
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) { // if the user has 1 or 2 attempts left
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else { // when user has used all 3 attempts
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Tyrosine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon2); // moves onto serine
                        break; // break out of while loop and move onto next question
                    }
                }
            }

            // repeat for 19 more questions

            maxAttempts = 3; // maxAttempts reverts to 3 each time a user moves onto a new question
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Serine
                System.out.println("\na. Arginine\nb. Serine\nc. Lysine\nd. Isoleucine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("serine") || playerAnswer.equalsIgnoreCase("b") || playerAnswer.equalsIgnoreCase("b.")) {
                    lbl.setIcon(icon3); // moves onto arginine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Serine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon3); // moves onto arginine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Arginine
                System.out.println("\na. Phenylalanine\nb. Histidine\nc. Arginine\nd. Proline");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("arginine") || playerAnswer.equalsIgnoreCase("c") || playerAnswer.equalsIgnoreCase("c.")) {
                    lbl.setIcon(icon4); // moves onto proline
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Arginine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon4); // moves onto proline
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Proline
                System.out.println("\na. Phenylalanine\nb. Histidine\nc. Arginine\nd. Proline");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("proline") || playerAnswer.equalsIgnoreCase("d") || playerAnswer.equalsIgnoreCase("d.")) {
                    lbl.setIcon(icon5); // moves onto Glutamine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Proline" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon5); // moves onto Glutamine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Glutamine
                System.out.println("\na. Glutamine\nb. Glutamic Acid\nc. Aspartic Acid\nd. Glycine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Glutamine") || playerAnswer.equalsIgnoreCase("a") || playerAnswer.equalsIgnoreCase("a.")) {
                    lbl.setIcon(icon6); // moves onto alanine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Glutamine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon6); // moves onto alanine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Alanine
                System.out.println("\na. Methionine\nb. Valine\nc. Alanine\nd. Threonine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Alanine") || playerAnswer.equalsIgnoreCase("c") || playerAnswer.equalsIgnoreCase("c.")) {
                    lbl.setIcon(icon7); // moves onto threonine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Alanine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon7); // moves onto threonine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Threonine
                System.out.println("\na. Phenylalanine\nb. Threonine\nc. Asparagine\nd. Cysteine ");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Threonine") || playerAnswer.equalsIgnoreCase("b") || playerAnswer.equalsIgnoreCase("b.")) {
                    lbl.setIcon(icon8); // moves onto leucine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Threonine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon8); // moves onto leucine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Leucine
                System.out.println("\na. Phenylalanine\nb. Leucine\nc. Asparagine\nd. Cysteine ");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Leucine") || playerAnswer.equalsIgnoreCase("b") || playerAnswer.equalsIgnoreCase("b.")) {
                    lbl.setIcon(icon9); // moves onto cysteine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Leucine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon9); // moves onto cysteine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Cysteine
                System.out.println("\na. Tryptophan\nb. Isoleucine\nc. Glycine\nd. Cysteine ");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Cysteine") || playerAnswer.equalsIgnoreCase("d") || playerAnswer.equalsIgnoreCase("d.")) {
                    lbl.setIcon(icon10); // moves onto methionine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Cysteine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon10); // moves onto methionine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Methionine
                System.out.println("\na. Valine\nb. Glycine\nc. Methionine\nd. Glutamic Acid");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Methionine") || playerAnswer.equalsIgnoreCase("c") || playerAnswer.equalsIgnoreCase("c.")) {
                    lbl.setIcon(icon11); // moves onto Histidine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Methionine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon11); // moves onto Histidine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Histidine
                System.out.println("\na. Histidine\nb. Isoleucine\nc. Proline\nd. Aspartic Acid");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Histidine") || playerAnswer.equalsIgnoreCase("a") || playerAnswer.equalsIgnoreCase("a.")) {
                    lbl.setIcon(icon12); // moves onto Phenylalanine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Histidine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon12); // moves onto Phenylalanine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Phenylalanine
                System.out.println("\na. Arginine\nb. Lysine\nc. Phenylalanine\nd. Tryptophan");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Phenylalanine") || playerAnswer.equalsIgnoreCase("c") || playerAnswer.equalsIgnoreCase("c.")) {
                    lbl.setIcon(icon13); // moves onto Isoleucine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Phenylalanine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon13); // moves onto Isoleucine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Isoleucine
                System.out.println("\na. Valine\nb. Serine\nc. Asparagine\nd. Isoleucine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Isoleucine") || playerAnswer.equalsIgnoreCase("d") || playerAnswer.equalsIgnoreCase("d.")) {
                    lbl.setIcon(icon14); // moves onto Glutamic Acid
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Isoleucine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon14); // moves onto Glutamic Acid
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Glutamic Acid
                System.out.println("\na. Glutamic Acid\nb. Aspartic Acid\nc. Valine\nd. Alanine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Glutamic Acid") || playerAnswer.equalsIgnoreCase("a") || playerAnswer.equalsIgnoreCase("a.")) {
                    lbl.setIcon(icon15); // moves onto Asparagine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Glutamic Acid" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon15); // moves onto Asparagine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Asparagine
                System.out.println("\na. Valine\nb. Glycine\nc. Lysine\nd. Asparagine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Asparagine") || playerAnswer.equalsIgnoreCase("d") || playerAnswer.equalsIgnoreCase("d.")) {
                    lbl.setIcon(icon16); // moves onto Aspartic Acid
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Asparagine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon16); // moves onto Aspartic Acid
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Aspartic Acid
                System.out.println("\na. Arginine\nb. Tryptophan\nc. Valine\nd. Aspartic Acid");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Aspartic Acid") || playerAnswer.equalsIgnoreCase("d") || playerAnswer.equalsIgnoreCase("d.")) {
                    lbl.setIcon(icon17); // moves onto Glycine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Aspartic Acid" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon17); // moves onto Glycine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Glycine
                System.out.println("\na. Lysine\nb. Glycine\nc. Tryptophan\nd. Histidine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Glycine") || playerAnswer.equalsIgnoreCase("b") || playerAnswer.equalsIgnoreCase("b.")) {
                    lbl.setIcon(icon18); // moves onto Valine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Glycine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon18); // moves onto Valine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Valine
                System.out.println("\na. Leucine\nb. Methionine\nc. Valine\nd. Tyrosine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Valine") || playerAnswer.equalsIgnoreCase("c") || playerAnswer.equalsIgnoreCase("c.")) {
                    lbl.setIcon(icon19); // moves onto Tryptophan
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Valine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon19); // moves onto Tryptophan
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Tryptophan
                System.out.println("\na. Isoleucine\nb. Cysteine\nc. Glycine\nd. Tryptophan");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Tryptophan") || playerAnswer.equalsIgnoreCase("d") || playerAnswer.equalsIgnoreCase("d.")) {
                    lbl.setIcon(icon20); // moves onto Lysine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Tryptophan" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon20); // moves onto Lysine
                        break;
                    }
                }
            }

            maxAttempts = 3;
            correct = false; // while the user has not yet answered the question correctly
            while (!correct && score < 40) {
                System.out.println("Please type the correct amino acid given the structure:"); // answer = Lysine
                System.out.println("\na. Lysine\nb. Alanine\nc. Glutamic Acid\nd. Phenylalanine");
                String playerAnswer = scan.next();
                if (playerAnswer.equalsIgnoreCase("Lysine") || playerAnswer.equalsIgnoreCase("a") || playerAnswer.equalsIgnoreCase("a.")) {
                    lbl.setIcon(icon); // moves back to first image, tyrosine
                    score++;
                    correct = true;
                    System.out.println("\nScore: " + score);
                } else {
                    maxAttempts--; // decrements attempts by 1 until the user reaches 0 attempts
                    if (maxAttempts != 0) {
                        System.out.println("\nNot quite. Try again.\nScore: " + score + "\nAttempts: " + maxAttempts + "\n");
                    } else {
                        System.out.print("\nYou are out of attempts.\nThe correct answer is: Lysine" + "\nScore: " + score + "\n"); // if the user runs out of attempts
                        lbl.setIcon(icon); // If the user got all questions wrong, moves back to first image, tyrosine. Restarts level until user reach score of 40.
                        break;
                    }
                }
            }

            if (score == 40) { // if the user reaches 40 points
                System.out.println("Great job! You passed level 4!\n");
                frame.setVisible(false); // closes out of JLabel
            }
            if (score != 40) {
                System.out.println("Practice makes perfect. Let's try again!\n"); // restarts loop
                maxAttempts = 3;
            }
        }
    }
}





