import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JLabel;

public class GUI extends JFrame {
  // Start attributes
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
  private boolean fiftyFiftyUsed = false; 
  private boolean telephoneJokerUsed = false;
  private JTextField tfTelefon = new JTextField();
  private JButton startButton = new JButton("Start");
  private JLabel jTitel = new JLabel ("Wer Wird Gubinär?");
  // End attributes
  
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
    
    JPanel backgroundPanel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(0, 0, Color.BLACK, 0, getHeight(), new Color(75, 0, 130));
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
      }
    };
    backgroundPanel.setLayout(null); 
    add(backgroundPanel); 
    
    // Start components
    frageA.setBounds(104, 584, 400, 64);
    frageA.setMargin(new Insets(2, 2, 2, 2));
    frageA.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageA_ActionPerformed(evt);
      }
    });
    frageA.setFont(new Font("Dialog", Font.BOLD, 22)); 
    frageA.setBackground(new Color(0, 0, 139));
    frageA.setForeground(Color.WHITE); 
    backgroundPanel.add(frageA);
    
    frageB.setBounds(640, 592, 400, 64);
    frageB.setMargin(new Insets(2, 2, 2, 2));
    frageB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageB_ActionPerformed(evt);
      }
    });
    frageB.setFont(new Font("Dialog", Font.BOLD, 22)); 
    frageB.setBackground(new Color(0, 0, 139));
    frageB.setForeground(Color.WHITE);
    backgroundPanel.add(frageB);
    
    frageC.setBounds(104, 696, 400, 64);
    frageC.setMargin(new Insets(2, 2, 2, 2));
    frageC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageC_ActionPerformed(evt);
      }
    });
    frageC.setFont(new Font("Dialog", Font.BOLD, 22)); 
    frageC.setBackground(new Color(0, 0, 139));
    frageC.setForeground(Color.WHITE);
    backgroundPanel.add(frageC);
    
    frageD.setBounds(640, 696, 400, 64);
    frageD.setMargin(new Insets(2, 2, 2, 2));
    frageD.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        frageD_ActionPerformed(evt);
      }
    });
    frageD.setFont(new Font("Dialog", Font.BOLD, 22)); 
    frageD.setBackground(new Color(0, 0, 139));
    frageD.setForeground(Color.WHITE);
    backgroundPanel.add(frageD);
    
    fField.setBounds(128, 480, 888, 80);
    fField.setEditable(false);
    fField.setHorizontalAlignment(SwingConstants.CENTER);
    fField.setFont(new Font("Dialog", Font.PLAIN, 26)); 
    fField.setBackground(new Color(220, 220, 220)); 
    fField.setForeground(Color.BLACK); 
    backgroundPanel.add(fField);
    
    endText.setBounds(248, 264, 656, 176);
    endText.setVisible(false);
    endText.setFont(new Font("Dialog", Font.PLAIN, 55));
    endText.setEditable(false);
    endText.setHorizontalAlignment(SwingConstants.CENTER);
    endText.setBackground(new Color(220, 220, 220)); 
    endText.setForeground(Color.BLACK); 
    backgroundPanel.add(endText);
    
    bRESTART1.setBounds(448, 544, 256, 72);
    bRESTART1.setText("RESTART");
    bRESTART1.setMargin(new Insets(2, 2, 2, 2));
    bRESTART1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bRESTART1_ActionPerformed(evt);
      }
    });
    bRESTART1.setVisible(false);
    bRESTART1.setFont(new Font("Dialog", Font.BOLD, 24)); 
    bRESTART1.setBackground(new Color(0, 139, 0)); 
    bRESTART1.setForeground(Color.WHITE); 
    backgroundPanel.add(bRESTART1);
    
    winScreen.setBounds(248, 208, 656, 256);
    winScreen.setVisible(false);
    winScreen.setEditable(false);
    winScreen.setHorizontalAlignment(SwingConstants.CENTER);
    winScreen.setFont(new Font("Dialog", Font.PLAIN, 44));
    winScreen.setBackground(new Color(220, 220, 220)); 
    winScreen.setForeground(Color.BLACK); 
    backgroundPanel.add(winScreen);
    
    preisList.setBounds(968, 32, 144, 344);
    preisList.setText("<html><br>1.000.000€<br>500.000€<br>125.000€<br>64.000€<br>32.000€<br>16.000€<br>8.000€<br>4.000€<br>2.000€<br>1.000€<br>500€<br>300€<br>200€<br>100€<br>50€</html>");
    preisList.setFont(new Font("Dialog", Font.PLAIN, 17));
    preisList.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(138, 43, 226), 2), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    preisList.setHorizontalAlignment(SwingConstants.CENTER);
    preisList.setOpaque(true);
    preisList.setBackground(Color.WHITE); 
    preisList.setForeground(Color.WHITE);
    backgroundPanel.add(preisList);
    
    nfHighscore.setBounds(96, 24, 240, 40);
    nfHighscore.setEnabled(true);
    nfHighscore.setEditable(false);
    nfHighscore.setFont(new Font("Dialog", Font.BOLD, 20));
    nfHighscore.setBackground(new Color(0, 0, 139)); 
    nfHighscore.setForeground(Color.WHITE); 
    backgroundPanel.add(nfHighscore);
    
    lHighscore1.setBounds(8, 32, 80, 24);
    lHighscore1.setText("Highscore");
    lHighscore1.setFont(new Font("Dialog", Font.BOLD, 14));
    lHighscore1.setForeground(Color.WHITE); 
    backgroundPanel.add(lHighscore1);
    
    bFiftyFifty.setBounds(128, 416, 65, 64);
    bFiftyFifty.setMargin(new Insets(2, 2, 2, 2));
    bFiftyFifty.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bFiftyFifty_ActionPerformed(evt);
      }
    });
    bFiftyFifty.setFont(new Font("Dialog", Font.BOLD, 20)); 
    bFiftyFifty.setBackground(new Color(0, 0, 139)); 
    bFiftyFifty.setForeground(Color.WHITE); 
    backgroundPanel.add(bFiftyFifty);
    
    bTelefon.setBounds(205, 416, 65, 64);
    bTelefon.setMargin(new Insets(2, 2, 2, 2));
    bTelefon.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bTelefon_ActionPerformed(evt);
      }
    });
    bTelefon.setFont(new Font("Dialog", Font.BOLD, 20));
    bTelefon.setBackground(new Color(0, 0, 139));
    bTelefon.setForeground(Color.WHITE);
    backgroundPanel.add(bTelefon);
    
    bPublikum.setBounds(848, 416, 56, 64);
    bPublikum.setMargin(new Insets(2, 2, 2, 2));
    bPublikum.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bPublikum_ActionPerformed(evt);
      }
    });
    bPublikum.setFont(new Font("Dialog", Font.BOLD, 20)); 
    bPublikum.setBackground(new Color(0, 0, 139));
    bPublikum.setForeground(Color.WHITE);
    bPublikum.setVisible(false);
    
    tfTelefon.setBounds(400, 350, 400, 64);
    tfTelefon.setEditable(false);
    tfTelefon.setHorizontalAlignment(SwingConstants.CENTER);
    tfTelefon.setFont(new Font("Dialog", Font.PLAIN, 24));
    tfTelefon.setBackground(new Color(220, 220, 220));
    tfTelefon.setForeground(Color.BLACK); 
    tfTelefon.setVisible(false);
    backgroundPanel.add(tfTelefon);
    // end components
    setVisible(true);
    
    startButton.setBounds(448, 470, 256, 72);
    startButton.setFont(new Font("Dialog", Font.BOLD, 24));
    startButton.setBackground(new Color(0, 139, 0));
    startButton.setForeground(Color.WHITE);
    startButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        startButton_ActionPerformed(evt);
      }
    });
    backgroundPanel.add(startButton);
    
    jTitel.setFont(new Font("Dialog", Font.BOLD, 55)); 
    jTitel.setForeground(new Color(138, 43, 226)); // Lila Farbe
    jTitel.setHorizontalAlignment(SwingConstants.CENTER);
    jTitel.setOpaque(true);
    jTitel.setBackground(new Color(0, 0, 0, 150)); // Transparent black background for shadow effect
    jTitel.setBorder(BorderFactory.createLineBorder(new Color(138, 43, 226), 2)); // Border
    jTitel.setBounds(100, 150, 970, 100); 
    backgroundPanel.add(jTitel);
    
    setComponentsVisible(false);
    steuerung = new Steuerung(this);
    steuerung.aktualisiereFrage(); // Erste Frage anzeigen
  }

  // start methods
  public void frageA_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(1);
    steuerung.aktualisiereFrage();
    tfTelefon.setVisible(false);
  }

  public void frageB_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(2);
    steuerung.aktualisiereFrage();
    tfTelefon.setVisible(false);
  }

  public void frageC_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(3);
    steuerung.aktualisiereFrage();
    tfTelefon.setVisible(false);
  }

  public void frageD_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(4);
    steuerung.aktualisiereFrage();
    tfTelefon.setVisible(false);
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
    bFiftyFifty.setVisible(false);
    bTelefon.setVisible(false);
    bPublikum.setVisible(false);
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
    bFiftyFifty.setVisible(false);
    bTelefon.setVisible(false);
    bPublikum.setVisible(false);
  }

  public void bRESTART1_ActionPerformed(ActionEvent evt) {
    endText.setVisible(false);
    bRESTART1.setVisible(false);
    for (JButton frage : fragen) {
      frage.setVisible(true);
    }
    fField.setVisible(true);
    bTelefon.setVisible(true);
    bPublikum.setVisible(true);
    steuerung.restart();
    fiftyFiftyUsed = false;
    tfTelefon.setVisible(false);
  }

  public void updatePrizeList(String markedPrizeList) {
    preisList.setOpaque(true);
    preisList.setBackground(new Color(137, 207, 240));
    preisList.setHorizontalAlignment(SwingConstants.CENTER);
    preisList.setText(markedPrizeList);
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
    if (!telephoneJokerUsed) {
      steuerung.useTelefon();
      telephoneJokerUsed = true;
      tfTelefon.setVisible(true);
    } 
  }
  
  public void updatetelefonJokerMessage(String message) {
    tfTelefon.setText(message);
  }
  
  public void setTelefonVisible(boolean visible) {
    bTelefon.setVisible(visible);
  }

  public void bPublikum_ActionPerformed(ActionEvent evt) {
    
  }
  
  public void setAnswerButtonEnabled(int index, boolean enabled) {
    fragen[index].setEnabled(enabled);
  }
  
  private void setComponentsVisible(boolean visible) {
    for (JButton frage : fragen) {
      frage.setVisible(visible);
    }
    fField.setVisible(visible);
    bFiftyFifty.setVisible(visible);
    bTelefon.setVisible(visible);
    bPublikum.setVisible(visible);
    preisList.setVisible(visible);
    nfHighscore.setVisible(visible);
    lHighscore1.setVisible(visible);
  }
  
  private void startButton_ActionPerformed(ActionEvent evt) {
    startButton.setVisible(false); // Start-Button ausblenden
    setComponentsVisible(true);    // Andere Komponenten anzeigen
    jTitel.setVisible(false); // Versteckt den Schriftzug
  }
  // end methods
}