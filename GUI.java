import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
  // start attributes
  private Steuerung steuerung;
  private JButton frageA = new JButton();
  private JButton frageB = new JButton();
  private JButton frageC = new JButton();
  private JButton frageD = new JButton();
  private JTextField fField = new JTextField();
  private JTextField endText = new JTextField();
  private JButton bRESTART1 = new JButton();
  private JButton[] fragen = { frageA, frageB, frageC, frageD };
  private JTextField winScreen = new JTextField();
  private JLabel preisList = new JLabel();
  private JTextField nfHighscore = new JTextField();
  private JLabel lHighscore1 = new JLabel();
  private JButton bFiftyFifty = new JButton("50/50");
  private JButton bTelefon = new JButton("T");
  private JButton bPublikum = new JButton("P");
  private boolean fiftyFiftyUsed = false; // Flag, um zu prüfen, ob der 50/50 Joker verwendet wurde
  private boolean telephoneJokerUsed = false;
  private JTextField tfTelefon = new JTextField();
  // end attributes
  
  public GUI() {
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1170;
    int frameHeight = 833;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    frageA.setBounds(104, 584, 400, 64);
    frageA.setMargin(new Insets(2, 2, 2, 2));
    frageA.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageA_ActionPerformed(evt);
      }
    });
    frageA.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(frageA);
    
    frageB.setBounds(640, 592, 400, 64);
    frageB.setMargin(new Insets(2, 2, 2, 2));
    frageB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageB_ActionPerformed(evt);
      }
    });
    frageB.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(frageB);
    
    frageC.setBounds(104, 696, 400, 64);
    frageC.setMargin(new Insets(2, 2, 2, 2));
    frageC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageC_ActionPerformed(evt);
      }
    });
    frageC.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(frageC);
    
    frageD.setBounds(640, 696, 400, 64);
    frageD.setMargin(new Insets(2, 2, 2, 2));
    frageD.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageD_ActionPerformed(evt);
      }
    });
    frageD.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(frageD);
    
    fField.setBounds(128, 480, 888, 80);
    fField.setEditable(false);
    fField.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(fField);
    
    endText.setBounds(248, 264, 656, 176);
    endText.setVisible(false);
    endText.setFont(new Font("Dialog", Font.PLAIN, 55));
    endText.setEditable(false);
    endText.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(endText);
    
    bRESTART1.setBounds(448, 544, 256, 72);
    bRESTART1.setText("RESTART");
    bRESTART1.setMargin(new Insets(2, 2, 2, 2));
    bRESTART1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bRESTART1_ActionPerformed(evt);
      }
    });
    bRESTART1.setVisible(false);
    cp.add(bRESTART1);
    
    winScreen.setBounds(248, 208, 656, 256);
    winScreen.setVisible(false);
    winScreen.setEditable(false);
    winScreen.setHorizontalAlignment(SwingConstants.CENTER);
    winScreen.setFont(new Font("Dialog", Font.PLAIN, 44));
    cp.add(winScreen);
    
    fField.setFont(new Font("Dialog", Font.PLAIN, 22));
    
    preisList.setBounds(968, 32, 144, 344);
    preisList.setText("<html><br>1.000.000€<br>500.000€<br>125.000€<br>64.000€<br>32.000€<br>16.000€<br>8.000€<br>4.000€<br>2.000€<br>1.000€<br>500€<br>300€<br>200€<br>100€<br>50€</html>");
    preisList.setFont(new Font("Dialog", Font.PLAIN, 17));
    preisList.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(138, 43, 226), 2), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    preisList.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(preisList);
    
    nfHighscore.setBounds(96, 24, 240, 40);
    nfHighscore.setEnabled(true);
    nfHighscore.setEditable(false);
    nfHighscore.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(nfHighscore);
    
    lHighscore1.setBounds(8, 32, 80, 24);
    lHighscore1.setText("Highscore");
    lHighscore1.setFont(new Font("Dialog", Font.BOLD, 14));
    cp.add(lHighscore1);
    
    bFiftyFifty.setBounds(128, 416, 56, 64);
    bFiftyFifty.setMargin(new Insets(2, 2, 2, 2));
    bFiftyFifty.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bFiftyFifty_ActionPerformed(evt);
      }
    });
    cp.add(bFiftyFifty);
    
    bTelefon.setBounds(184, 416, 56, 64);
    bTelefon.setMargin(new Insets(2, 2, 2, 2));
    bTelefon.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bTelefon_ActionPerformed(evt);
      }
    });
    cp.add(bTelefon);
    
    bPublikum.setBounds(240, 416, 56, 64);
    bPublikum.setMargin(new Insets(2, 2, 2, 2));
    bPublikum.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bPublikum_ActionPerformed(evt);
      }
    });
    cp.add(bPublikum);
    
    tfTelefon.setBounds(376, 368, 408, 80);
    cp.add(tfTelefon);
    // end components
    setVisible(true);
    
    steuerung = new Steuerung(this);
    steuerung.aktualisiereFrage(); // Erste Frage anzeigen
  }

  // start methods
  public void frageA_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(1);
    steuerung.aktualisiereFrage();
  }

  public void frageB_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(2);
    steuerung.aktualisiereFrage();
  }

  public void frageC_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(3);
    steuerung.aktualisiereFrage();
  }

  public void frageD_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(4);
    steuerung.aktualisiereFrage();
  }

  public void updateQuestionText(String frage) {
    fField.setText(frage);
  }

  public void updateAnswerButtons(String[] antworten) {
    for (int i = 0; i < 4; i++) {
      fragen[i].setText(antworten[i]);
      fragen[i].setEnabled(true); // Stellen Sie sicher, dass alle Buttons standardmäßig aktiv sind
    }
  }

  public void hideEndMessage() {
    endText.setVisible(false);
    bRESTART1.setVisible(false);
    preisList.setVisible(true);
  }

  public void showEndMessage() {
    endText.setText("Oh dear");
    endText.setVisible(true);
    bRESTART1.setVisible(true);
    for (JButton frage : fragen) {
      frage.setVisible(false);
    }
    fField.setVisible(false);
    preisList.setVisible(false);
  }

  public void hideWinMessage() {
    winScreen.setVisible(false);
    bRESTART1.setVisible(false);
    preisList.setVisible(true);
  }

  public void showWinMessage() {
    winScreen.setText("DU BIST GUBINAER");
    winScreen.setVisible(true);
    bRESTART1.setVisible(true);
    for (JButton frage : fragen) {
      frage.setVisible(false);
    }
    fField.setVisible(false);
    preisList.setVisible(false);
  }

  public void bRESTART1_ActionPerformed(ActionEvent evt) {
    endText.setVisible(false);
    bRESTART1.setVisible(false);
    for (JButton frage : fragen) {
      frage.setVisible(true);
    }
    fField.setVisible(true);
    steuerung.restart();
    fiftyFiftyUsed = false;
  }

  public void updatePrizeList(int questionIndex) {
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
      preisList.setOpaque(true);
      preisList.setBackground(new Color(137, 207, 240));
      preisList.setHorizontalAlignment(SwingConstants.CENTER);
      preisList.setText(markedPrizeList.toString());
    }
  }

  public void updateHighscore(String highscore) {
    nfHighscore.setText(highscore);
  }

  public void bFiftyFifty_ActionPerformed(ActionEvent evt) {
    if (!fiftyFiftyUsed) {
      steuerung.useFiftyFifty();
      fiftyFiftyUsed = true;
    }
  }
  
  public void setFiftyFiftyVisible(boolean visible) {
    bFiftyFifty.setVisible(visible);
  }

  public void bTelefon_ActionPerformed(ActionEvent evt) {
    
  }

  public void bPublikum_ActionPerformed(ActionEvent evt) {
    // Hier können Sie die Logik für den Publikums-Joker hinzufügen, wenn gewünscht
  }
  
  public void setAnswerButtonEnabled(int index, boolean enabled) {
    fragen[index].setEnabled(enabled);
  }
  // end methods
}
