/**
 *
 *
 * @version 1.0 from 11.03.2024
 */
public class Fragen {
    // Attributes
    private String[] questions;
    private String[][] answers;
    private int[] correctAnswers;

    public Fragen() {
     // Initialisierung des Arrays 
    questions = new String[]{
    "What is the capital of France?",
    "Which planet is called the red planet?",
    "What animal is the largest one on earth?",
    "Which of the following historical figures had the greatest influence on modern physics?",
    "Wer ist der Hurensohn?"
    };

    answers = new String[][]{
    {"Rome", "Madrid", "Paris", "Berlin"},
    {"Venus", "Mars", "Jupiter", "Earth"},
    {"Elephant", "Blue Whale", "Lion", "Rhino"},
    {"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Marie Curie"},
    {"Hans", "Peter", "Max", "Juliane Becker"}
    };

    correctAnswers = new int[]{2, 1, 1, 1, 3};
    }

    // Getter und Setter
    public String[] getQuestions() {
    return questions;
    }

    public void setQuestions(String[] questions) {
    this.questions = questions;
    }

    public String[][] getAnswers() {
    return answers;
    }

    public void setAnswers(String[][] answers) {
    this.answers = answers;
    }

    public int[] getCorrectAnswers() {
    return correctAnswers;
    }

    public void setCorrectAnswers(int[] correctAnswers) {
    this.correctAnswers = correctAnswers;
    }

    // Fürs Testen 
    public static void main(String[] args) {
    Fragen quiz = new Fragen();

    // ausgeben Fragen und Antworten
        for (int i = 0; i < quiz.getQuestions().length; i++) {
      System.out.println("Question " + (i + 1) + ": " + quiz.getQuestions()[i]);
      for (int j = 0; j < quiz.getAnswers()[i].length; j++) {
        System.out.println("  Option " + (j + 1) + ": " + quiz.getAnswers()[i][j]);
        }
      System.out.println("Correct Answer: Option " + quiz.getCorrectAnswers()[i]);
      System.out.println();
        }
    }
} 
