import java.util.ArrayList;
import java.util.Collections;

// questions class used by Level 1, 2, and 3 only
public class Question {
    private String question; // question in string format
    private ArrayList<String> choices; // choices stored in Array List
    private String answer; // correct answer

    // make a Question constructor
    public Question(String question, String[] choices, String answer) {
        this.question = question; // calling the question
        this.choices = new ArrayList<String>();
        for (int i = 0; i < choices.length; i++) {
            this.choices.add(choices[i]); // add all choices from Array List
        }
        Collections.shuffle(this.choices); // shuffles choices using Collections class each time user plays the game
        this.answer = answer;
    }

    // getter method for each question
    public String getQuestion() {
        return question;
    }

    // getter method for choices
    public ArrayList<String> getChoices() {
        return choices;
    }

    // getter method for answers
    public String getAnswer() {
        return answer;
    }
}
