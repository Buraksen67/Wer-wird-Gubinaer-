import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Steuerung {
  
  private GUI dieGUI;
  private Fragen dieFragen = new Fragen();
  private int pIndex = 0;
  private List<Integer> gestellteFragen = new ArrayList<>();
  private Random random = new Random();
  
  public Steuerung(GUI pGUI) {
    dieGUI = pGUI;
  }
  
  public void aktualisiereFrage() {
    if (pIndex < 15) { // Nur bis zur 15. Frage gehen
      int maxRange = dieFragen.getQuestions().length; // Maximaler Bereich für Fragen
      int fIndex;
      
      do {
        fIndex = random.nextInt(maxRange); // Zufälligen Index auswählen
      } while (gestellteFragen.contains(fIndex)); // Solange wiederholen, bis eine neue Frage gefunden wird      
      gestellteFragen.add(fIndex); // Füge den Index zur Liste der gestellten Fragen hinzu      
      String frage = dieFragen.getQuestions()[fIndex];
      String[] antworten = dieFragen.getAnswers()[fIndex];     
      if (frage != null) {
        dieGUI.updateQuestionText(frage);
        dieGUI.updateAnswerButtons(antworten);
      } else {
        aktualisiereFrage(); // Falls die Frage null ist, erneut aktualisieren
        return;
      }  
      pIndex++; // Inkrementiere pIndex um 1 für die nächste Frage
    } else {
      dieGUI.showWinMessage(); // Das Quiz ist beendet, zeige eine Siegesnachricht an 
    }
  }
  
  public void checkAnswer(int selectedAnswer) {
    int fIndex = gestellteFragen.get(pIndex - 1); // Index der aktuellen Frage aus der Liste der gestellten Fragen
    int correctAnswer = dieFragen.getCorrectAnswers()[fIndex];
    if (selectedAnswer == correctAnswer) {
      System.out.println("Pro");
    } else {
      System.out.println("No");
      dieGUI.showEndMessage();
    }
  } 
  
  public void restart() {
    pIndex = 0; // Setze den Index auf den Startwert zurück
    gestellteFragen.clear(); // Lösche die Liste der gestellten Fragen
    dieGUI.hideEndMessage();
    dieGUI.hideWinMessage();
    aktualisiereFrage();
  } 
}
