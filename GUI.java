import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
  
  private Steuerung steuerung;
  // start attributes
  private JButton frageA = new JButton();
  private JButton frageB = new JButton();
  private JButton frageC = new JButton();
  private JButton frageD = new JButton();
  private JTextField fField = new JTextField();
  private JTextField endText = new JTextField();
  private JButton bRESTART1 = new JButton();

  private JButton[] fragen = {frageA, frageB, frageC, frageD};
  
  private JTextField winScreen = new JTextField();
  // end attributes
  public GUI() { 
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1170; 
    int frameHeight = 842;
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
    
    frageA.setBounds(88, 440, 328, 64);
    frageA.setMargin(new Insets(2, 2, 2, 2));
    frageA.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) { 
        FrageA_ActionPerformed(evt);
      }
    });
    cp.add(frageA);
    
    frageB.setBounds(528, 440, 328, 64);
    frageB.setMargin(new Insets(2, 2, 2, 2));
    frageB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) { 
        FrageB_ActionPerformed(evt);
      }
    });
    cp.add(frageB);
    
    frageC.setBounds(88, 528, 328, 64);
    frageC.setMargin(new Insets(2, 2, 2, 2));
    frageC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) { 
        FrageC_ActionPerformed(evt);
      }
    });
    cp.add(frageC);
    
    frageD.setBounds(528, 528, 328, 64);
    frageD.setMargin(new Insets(2, 2, 2, 2));
    frageD.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) { 
        FrageD_ActionPerformed(evt);
      }
    });
    cp.add(frageD);
    
    fField.setBounds(88, 336, 768, 80);
    fField.setEditable(false);
    cp.add(fField);
    
    endText.setBounds(152, 216, 656, 168);
    endText.setVisible(false);
    endText.setFont(new Font("Dialog", Font.PLAIN, 55));
    endText.setEditable(false);
    endText.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(endText);
    bRESTART1.setBounds(424, 512, 256, 72);
    bRESTART1.setText("RESTART");
    bRESTART1.setMargin(new Insets(2, 2, 2, 2));
    bRESTART1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRESTART1_ActionPerformed(evt);
      }
    });
    bRESTART1.setVisible(false);
    cp.add(bRESTART1);
    winScreen.setBounds(240, 240, 656, 256);
    winScreen.setVisible(false);    
    winScreen.setEditable(false);
    cp.add(winScreen);
    frageD.setBounds(696, 696, 328, 64);
    frageC.setBounds(88, 696, 328, 64);
    frageA.setBounds(88, 560, 328, 64);
    frageB.setBounds(704, 560, 328, 64);
    fField.setBounds(176, 440, 768, 80);
    endText.setBounds(240, 264, 656, 176);
    frageB.setBounds(696, 560, 328, 64);
    // end components
    setVisible(true);
    steuerung = new Steuerung(this);
    // Erste Frage anzeigen
    steuerung.aktualisiereFrage();
  }


  // !!!! PLEASE CHANGE
  public void FrageA_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(1);
    steuerung.aktualisiereFrage();
  } 
  // start methods
  
  public void FrageB_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(2);
    steuerung.aktualisiereFrage();
  } 
  
  public void FrageC_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(3);
    steuerung.aktualisiereFrage();
  } 
  
  public void FrageD_ActionPerformed(ActionEvent evt) {
    steuerung.checkAnswer(4);
    steuerung.aktualisiereFrage();
  }
    
  // Methode zur Aktualisierung des Frage-Textfelds
  public void updateQuestionText(String frage) {
    fField.setText(frage);
  }
    
  // Methode zur Aktualisierung der Antwort-Buttons
  public void updateAnswerButtons(String[] antworten) {
    for (int i=0; i<4; i++) {
      fragen[i].setText(antworten[i]);
    }
  } 
  
  public void hideEndMessage() {
    endText.setVisible(false);
    bRESTART1.setVisible(false); 
  }
  
  public void showEndMessage() {
    endText.setText("Oh dear");
    endText.setVisible(true);
    bRESTART1.setVisible(true);
    for (JButton frage : fragen) {
      frage.setVisible(false);
    }
    fField.setVisible(false);
  }
  
  public void hideWinMessage() {
    winScreen.setVisible(false);
    bRESTART1.setVisible(false);    
  }
  
  public void showWinMessage() {
    winScreen.setText("Glückwunsch, du hast gewonnen");
    winScreen.setVisible(true);
    bRESTART1.setVisible(true);
    for (JButton frage : fragen) {
      frage.setVisible(false);
    }
    fField.setVisible(false);
  }
  
  public void bRESTART1_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    endText.setVisible(false);
    bRESTART1.setVisible(false);
    for (JButton frage : fragen) {
      frage.setVisible(true);
    }
    fField.setVisible(true);
    steuerung.restart();
  } // end of bRESTART1_ActionPerformed
}
  // end methods
