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
    if (pIndex < 15) { // Quiz soll nur 15 Fragen haben 
      int minRange, maxRange;
      // Bestimmen des Bereichs der Fragen basierend auf pIndex
      if (pIndex < 5) {
        minRange = 0;
        maxRange = 20;
      } else if (pIndex < 10) {
        minRange = 20;
        maxRange = 40;
      } else {
        minRange = 40;
        maxRange = 59;
      }
      int fIndex;
      // Zufälligen Index innerhalb des Bereichs auswählen
      do {
        fIndex = random.nextInt(maxRange - minRange) + minRange;
      } while (gestellteFragen.contains(fIndex)); // Solange wiederholen, bis eine neue Frage gefunden wird
      gestellteFragen.add(fIndex); // Füge den Index zur Liste der gestellten Fragen hinzu
      String frage = dieFragen.getQuestions()[fIndex];
      String[] antworten = dieFragen.getAnswers()[fIndex];    
      if (frage != null) {
        dieGUI.updateQuestionText(frage);
        dieGUI.updateAnswerButtons(antworten);
        pIndex++; // Inkrementiere pIndex um 1 für die nächste Frage
      } else {
        aktualisiereFrage(); // Falls die Frage null ist, erneut aktualisieren
      }
    } else {
      dieGUI.showWinMessage(); // Das Quiz ist beendet, zeige eine Siegesnachricht an
    }
  }
  
  public void checkAnswer(int selectedAnswer) {
    if (!gestellteFragen.isEmpty()) {
      int lastQuestionIndex = gestellteFragen.get(gestellteFragen.size() - 1);
      int correctAnswer = dieFragen.getCorrectAnswers()[lastQuestionIndex];
      if (selectedAnswer == correctAnswer) {
        System.out.println("Richtig");
      } else {
        System.out.println("Falsch");
        dieGUI.showEndMessage();
      }
    } else {
      System.out.println("Fehler: Keine Fragen gestellt");
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
