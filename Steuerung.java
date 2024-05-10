import java.util.Random;

public class Steuerung {
  
  private GUI dieGUI;
  private Fragen dieFragen = new Fragen();
  private int FIndex = 0;
  private int PIndex = 0;
  private int FBereich = 0; 
  private Random random = new Random();
  
  public Steuerung(GUI pGUI) {
    dieGUI = pGUI;
  }
  
  public void aktualisiereFrage(String pAntwort) {
    if (PIndex >= 0 && PIndex <= 5) {
      FBereich = 10;
    } else if (PIndex >= 6 && PIndex <= 10) {
      FBereich = 20;
    } else if (PIndex >= 11 && PIndex <= 15) {
      FBereich = 30;
    }                                          
    
    FIndex = random.nextInt(FBereich);
    
    // Holen der Frage und der Antworten
    String frage = dieFragen.getQuestions()[FIndex];
    String[] antworten = dieFragen.getAnswers()[FIndex];
    
    // Anzeigen der Frage in der GUI
    dieGUI.updateQuestionText(frage);
    dieGUI.updateAnswerButtons(antworten);
  }
  
  public void checkAnswer(int selectedAnswer) {
    int correctAnswer = dieFragen.getCorrectAnswers()[FIndex];
    if (selectedAnswer == correctAnswer) {
      System.out.println("Pro");
    } else {
      System.out.println("Denkschte");
      dieGUI.showEndMessage();
    }
  } 
  
  public void restart() {
    PIndex = 0;
    dieGUI.hideEndMessage();
    aktualisiereFrage(null);
  } 
}
