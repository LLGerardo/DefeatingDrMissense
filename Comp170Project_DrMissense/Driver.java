import java.io.IOException;

public class Driver {

    public static void main(String[] args) throws IOException, InterruptedException {
        cutScene1(); //intro + tutorial for level 1
        LevelOne1 game = new LevelOne1(); // prints level 1
        game.start();
        cutScene2();// cut scene + tutorial for level 2
        LevelTwo2 game2 = new LevelTwo2(); // prints level 2
        game2.start();
        cutScene3(); // cut scene + tutorial for level 3
        LevelThree3 game3 = new LevelThree3(); // prints level 3
        game3.start();
        cutScene4();// cut scene + tutorial for level 4
        LevelFour4 game4 = new LevelFour4(); // prints level 4
        finalScene();// final scene + game ends
    }

    //Level 1
    public static void cutScene1() throws InterruptedException {
        System.out.println("Breaking news!");
        Thread.sleep(2000);
        System.out.println("This is Pepper Peptide live from the Tri State Area Valley Mall.");
        Thread.sleep(3500);
        System.out.println("Dozens of shoppers were shocked today when their shopping trip was interrupted by a mysterious attacks of substitutions.");
        Thread.sleep(4000);
        System.out.println("Luckily, no deadly mutations occurred this evening.");
        Thread.sleep(3000);
        System.out.println("Several bystanders claim to have seen a small man in a lab coat with no goggles!");
        Thread.sleep(3500);
        System.out.println("It does appear that this is another attempt by Dr. Missense to mutate the entire world.");
        Thread.sleep(3000);
        System.out.println("If anyone knows how to stop him or information regarding his whereabouts please call the KWQC news station hotline immediately!");
        Thread.sleep(5000);
        System.out.println("This is Pepper Peptide signing off!");
        Thread.sleep(3000);
        System.out.println("*TV turns off*");
        Thread.sleep(3000);
        System.out.println("Hey kid. What are you looking at? You think you have what it takes to beat him?");
        Thread.sleep(3500);
        System.out.println("You don't even know your right from left.");
        Thread.sleep(3500);
        System.out.println("*mumbled objections*");
        Thread.sleep(3500);
        System.out.println("Okay, fine. I'll help you train, but you have a long way to go");
        Thread.sleep(3500);
        System.out.println("Let's start out with something easy.");
        Thread.sleep(3500);
        System.out.println("You'll be given the name of an amino acid and you'll have to select the correct three-letter abbreviation.");
        Thread.sleep(3500);
        System.out.println("You'll will have three attempts before I just tell you the answer.");
        Thread.sleep(3500);
        System.out.println("Do well in this, then, maybe I'll consider this training seriously.");
        space();
    }

    //Level 2
    public static void cutScene2() throws InterruptedException {
        System.out.println("Good Evening Tri State Area!");
        Thread.sleep(2000);
        System.out.println("This is Pepper Peptide live with  a special message from Mayor Polly Peptide.");
        Thread.sleep(3500);
        System.out.println("Mayor: Our city is in turmoil");
        Thread.sleep(4000);
        System.out.println("Mayor: We need a hero in this city");
        Thread.sleep(3000);
        System.out.println("Mayor: If anyone is out there brave enough, please rise up and help us.");
        Thread.sleep(3500);
        System.out.println("Mayor: The city needs you.");
        Thread.sleep(3000);
        System.out.println("Mayor: Dr.Missense can't have the last laugh");
        Thread.sleep(3500);
        System.out.println("*Tv turns off*");
        Thread.sleep(5500);
        System.out.println("Okay you're doing pretty great!");
        Thread.sleep(2000);
        System.out.println("You have all those abbreviations down.");
        Thread.sleep(3500);
        System.out.println("Next I will train you in the polarity of these molecules.");
        Thread.sleep(4000);
        System.out.println("I'll give you the name and you give me the correct polarity.");
        Thread.sleep(3500);
        System.out.println("This is important stuff to get down.");
        Thread.sleep(3500);
        System.out.println("You need to know what you're up against as it comes your way!");
        Thread.sleep(3000);
        System.out.println("Same as before, you'll have three tries to get it right.");
        Thread.sleep(3500);
        System.out.println("Your effort is amazing, so let's keep it up!");
        Thread.sleep(3500);
        System.out.println("You might actually have a chance to beat that Missense chump.");
        space();
    }

    //Level 3
    public static void cutScene3() throws InterruptedException {
        System.out.println("Pepper Peptide coming at you with some disturbing news!!");
        Thread.sleep(2000);
        System.out.println("Dr. Missense has replaced all T's in plants with U's now all the pollen is blue!");
        Thread.sleep(3500);
        System.out.println("It is staining all of the Tri State Area!");
        Thread.sleep(4000);
        System.out.println("Dr Missense: You're mistaken if you think this is the best I can do.");
        Thread.sleep(3000);
        System.out.println("Pepper Peptide: Oh no! We really need a hero right about now.");
        Thread.sleep(3500);
        System.out.println("Someone needs to save our city!");
        System.out.println("*tv turns off*");
        Thread.sleep(3500);
        System.out.println("Your growth is amazing!");
        Thread.sleep(3500);
        System.out.println("Next, we need to get the slang down!");
        Thread.sleep(3500);
        System.out.println("You'll need to give me the one letter abbreviation for the amino acid given.");
        Thread.sleep(3500);
        System.out.println("As you might have guessed, you have three tries to get it right.");
        Thread.sleep(3500);
        System.out.println("You're almost ready to face Dr. Missense.");
        space();
    }

    //Level 4
    public static void cutScene4() throws InterruptedException {
        System.out.println("Pepper Peptide coming at you from the KWQC studios!");
        Thread.sleep(3500);
        System.out.println("The new children's park is opening this evening");
        Thread.sleep(3500);
        System.out.println("While a growing anxiety of Dr. Missense continues to grow, today seems to be going well.");
        Thread.sleep(3500);
        System.out.println("Hopefully this trend continues");
        Thread.sleep(3500);
        System.out.println("That's all from me for now. Have an acidic day! ");
        System.out.println("*TV turns off*");
        Thread.sleep(3500);
        System.out.println("You’re so close to becoming a master of amino acids!");
        Thread.sleep(2000);
        System.out.println("This next section might be a little harder.");
        Thread.sleep(3500);
        System.out.println("You'll be shown a picture and need to respond with its full name.");
        Thread.sleep(4000);
        System.out.println("No worries though, you still have three tries to get it right!");
        Thread.sleep(3000);
        System.out.println("It's important to know what Dr.Missense is throwing at you so you \nneed to master this skill");
        Thread.sleep(3500);
        System.out.println("I believe in you!");
        Thread.sleep(3500);
        System.out.println("Once you've complete this, you'll be able to defeat Dr. Missense.");
        space();

    }

    //Final Scene
    public static void finalScene() throws InterruptedException {
        System.out.println("This just in!");
        Thread.sleep(2000);
        System.out.println("This is Pepper Peptide reporting live!");
        Thread.sleep(3500);
        System.out.println("A new hero has risen and is ready to face Dr. Missense.");
        Thread.sleep(4000);
        System.out.println("*insane fight scene ensues*");
        Thread.sleep(3000);
        System.out.println("*A flying Valine nearly blinds Pepper Peptide*");
        Thread.sleep(3500);
        System.out.println("*It's like that scene from avatar the last air bender as you use all your knowledge against Dr. Missense*");
        Thread.sleep(5000);
        System.out.println("*A photo representation of you and Dr. Missense*");
        System.out.println(" |you|------------{knowledge powers colliding}------------|Dr. Missense|");
        Thread.sleep(5000);
        System.out.println("Random Police Officer: You've done it! You defeated Dr. Missense! He's going away for a very long time, kid.");
        System.out.println("*Where was he this whole time?*");
        Thread.sleep(5500);
        System.out.println("Mayor Polly Peptide: We are all finally safe from Dr. Missense! The city would like to " +
                "honor you with a statue in our honor," +
                "\nto commemorate your bravery and dedication to our city!");
        Thread.sleep(8000);
        System.out.println("*Two weeks later*");
        Thread.sleep(3000);
        System.out.println("Mayor Polly Peptide: And with this unveiling marks a new era for the Tri State Area. " +
                "\nAn era without fear of deletions or substitutions. It is an era of peace.");
        Thread.sleep(8000);
        System.out.println("Thank you again for your bravery! You will always be welcomed in our city!");
        space();
        System.out.println("Thanks for playing!\nThe end.");
    }

    public static void space() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i <= 3; i++) { // create space between the level and scene
            System.out.println();
        }
    }

}
