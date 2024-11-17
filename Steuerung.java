import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Steuerung {
  
  // start attributes
  private GUI dieGUI;
  private Fragen dieFragen = new Fragen();
  private int pIndex = 0;
  private List<Integer> gestellteFragen = new ArrayList<>();
  private Random random = new Random();
  private boolean fiftyFiftyUsed = false;
  private boolean telephoneJokerUsed;
  // end attributes
  
  public Steuerung(GUI pGUI) {
    dieGUI = pGUI;
  }
  
  // start methods
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
        dieGUI.updatePrizeList(getMarkedPrizeList(pIndex));
        pIndex++; // Inkrementiere pIndex um 1 für die nächste Frage
      } else {
        aktualisiereFrage();
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
        updateHighscore(); // Aktualisiere den Highscore
        dieGUI.showEndMessage();
      }
    }
  }
  
  private void updateHighscore() {
    String[] prizeList = {
    "50€", "100€", "200€", "300€", "500€",
    "1.000€", "2.000€", "4.000€", "8.000€", "16.000€",
    "32.000€", "64.000€", "125.000€", "500.000€", "1.000.000€"
    };
    String highscoreAmount = "0€"; // Wenn 1.Frage falsch
    if (pIndex > 1) { // Nur wenn pIndex > 1, setze den Highscore aus der Liste
      highscoreAmount = prizeList[Math.min(pIndex - 2, prizeList.length - 1)];
    }
    dieGUI.updateHighscore(highscoreAmount); // Aktualisiere die Anzeige des Highscores
  }
  
  private String getMarkedPrizeList(int questionIndex) {
    String[] prizeList = { "50€", "100€", "200€", "300€", "500€", "1.000€", "2.000€", "4.000€", "8.000€", "16.000€",
    "32.000€", "64.000€", "125.000€", "500.000€", "1.000.000€" };
    
    if (questionIndex >= 0 && questionIndex < prizeList.length) {
      StringBuilder markedPrizeList = new StringBuilder("<html><div style='text-align: center; background-color: #89CFF0; padding: 5px;'>");
      for (int i = prizeList.length - 1; i >= 0; i--) {
        if (i == questionIndex) {
          markedPrizeList.append("<font color='#FF6347'>").append(prizeList[i]).append("</font><br>");
        } else {
          markedPrizeList.append(prizeList[i]).append("<br>");
        }
      }
      markedPrizeList.append("</div></html>");
      return markedPrizeList.toString();
    }
    return "";
  }
  
  public void useFiftyFifty() {
    if (!gestellteFragen.isEmpty() && !fiftyFiftyUsed) {
      int lastQuestionIndex = gestellteFragen.get(gestellteFragen.size() - 1);
      int correctAnswerIndex = dieFragen.getCorrectAnswers()[lastQuestionIndex] - 1; // Korrekte Antwort als Index
      // Finden von zwei falschen Antworten, die entfernt werden sollen
      List<Integer> falscheAntworten = new ArrayList<>();
      for (int i = 0; i < 4; i++) {
        if (i != correctAnswerIndex) {
          falscheAntworten.add(i);
        }
      }
      Collections.shuffle(falscheAntworten); // Zufällige Reihenfolge der falschen Antworten
      // Deaktiviere die beiden falschen Antwort-Buttons
      dieGUI.setAnswerButtonEnabled(falscheAntworten.get(0), false);
      dieGUI.setAnswerButtonEnabled(falscheAntworten.get(1), false);
      fiftyFiftyUsed = true; // Setze den 50/50 Button auf benutzt
      dieGUI.setFiftyFiftyVisible(false); // Mache den 50/50 Button in der GUI unsichtbar
    }
  }
  
  public void useTelefon() {
    if (!gestellteFragen.isEmpty() && !telephoneJokerUsed) {
      int lastQuestionIndex = gestellteFragen.get(gestellteFragen.size() - 1);
      int correctAnswerIndex = dieFragen.getCorrectAnswers()[lastQuestionIndex] - 1; // Korrekte Antwort als Index
      // Beispiel: Annahme, dass die korrekte Antwort in Form eines Buchstabens vorliegt (A, B, C, D)
      char correctAnswer = (char) ('A' + correctAnswerIndex);
      // Erstelle die Telefonjoker-Antwort
      String message = "Ich glaube die richtige Antwort ist: " + correctAnswer;
      // Zeige die Telefonjoker-Antwort in der GUI an
      dieGUI.updatetelefonJokerMessage(message);
      // Setze den Telefonjoker-Button auf benutzt
      telephoneJokerUsed = true;
      // Mache den Telefonjoker-Button in der GUI unsichtbar
      dieGUI.setTelefonVisible(false);
    }
  }
  
  public void restart() {
    pIndex = 0; // Setze den Index auf den Startwert zurück
    gestellteFragen.clear(); // Lösche die Liste der gestellten Fragen
    fiftyFiftyUsed = false; // 50/50 Button ist wieder verfügbar
    telephoneJokerUsed = false; // Telefonjoker ist wieder verfügbar
    dieGUI.hideEndMessage(); // Endscreen wird unsichtbar
    dieGUI.hideWinMessage(); // Winscreen wird unsichtbar
    dieGUI.setFiftyFiftyVisible(true); // Mache den 50/50 Button wieder sichtbar
    dieGUI.setTelefonVisible(true); // Mache den Telefonjoker-Button wieder sichtbar
    aktualisiereFrage();
  }
  // end methods
}
