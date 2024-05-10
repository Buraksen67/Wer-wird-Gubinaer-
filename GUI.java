import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {
  
  // start attributes
  private Steuerung dieST;
  private JButton FrageA = new JButton();
  private JButton FrageB = new JButton();
  private JButton FrageC = new JButton();
  private JButton FrageD = new JButton();
  private JTextField Ffield = new JTextField();
  private JTextField jTextFieldEnd = new JTextField();
  private JButton bRESTART1 = new JButton();
  // end attributes
  
  public GUI() { 
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 963; 
    int frameHeight = 684;
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
    
    FrageA.setBounds(88, 440, 328, 64);
    FrageA.setMargin(new Insets(2, 2, 2, 2));
    FrageA.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageA_ActionPerformed(evt);
      }
    });
    cp.add(FrageA);
    
    FrageB.setBounds(528, 440, 328, 64);
    FrageB.setMargin(new Insets(2, 2, 2, 2));
    FrageB.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageB_ActionPerformed(evt);
      }
    });
    cp.add(FrageB);
    
    FrageC.setBounds(88, 528, 328, 64);
    FrageC.setMargin(new Insets(2, 2, 2, 2));
    FrageC.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageC_ActionPerformed(evt);
      }
    });
    cp.add(FrageC);
    
    FrageD.setBounds(528, 528, 328, 64);
    FrageD.setMargin(new Insets(2, 2, 2, 2));
    FrageD.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageD_ActionPerformed(evt);
      }
    });
    cp.add(FrageD);
    
    Ffield.setBounds(88, 336, 768, 80);
    Ffield.setEditable(false);
    cp.add(Ffield);
    
    jTextFieldEnd.setBounds(152, 216, 656, 168);
    jTextFieldEnd.setVisible(false);
    jTextFieldEnd.setFont(new Font("Dialog", Font.PLAIN, 55));
    jTextFieldEnd.setEditable(false);
    jTextFieldEnd.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jTextFieldEnd);
    bRESTART1.setBounds(336, 480, 256, 72);
    bRESTART1.setText("RESTART");
    bRESTART1.setMargin(new Insets(2, 2, 2, 2));
    bRESTART1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRESTART1_ActionPerformed(evt);
      }
    });
    bRESTART1.setVisible(false);
    cp.add(bRESTART1);
    // end components
    setVisible(true);
    dieST = new Steuerung(this);
    // Erste Frage anzeigen
    dieST.aktualisiereFrage(null);
  } 
  
  // start methods
  public static void main(String[] args) {
    new GUI();
  } 
  
  public void FrageA_ActionPerformed(ActionEvent evt) {
    dieST.checkAnswer(1);
    dieST.aktualisiereFrage(null);
  } 
  
  public void FrageB_ActionPerformed(ActionEvent evt) {
    dieST.checkAnswer(2);
    dieST.aktualisiereFrage(null);
  } 
  
  public void FrageC_ActionPerformed(ActionEvent evt) {
    dieST.checkAnswer(3);
    dieST.aktualisiereFrage(null);
  } 
  
  public void FrageD_ActionPerformed(ActionEvent evt) {
    dieST.checkAnswer(4);
    dieST.aktualisiereFrage(null);
  }
    
  // Methode zur Aktualisierung des Frage-Textfelds
  public void updateQuestionText(String frage) {
    Ffield.setText(frage);
  }
    
  // Methode zur Aktualisierung der Antwort-Buttons
  public void updateAnswerButtons(String[] antworten) {
    FrageA.setText(antworten[0]);
    FrageB.setText(antworten[1]);
    FrageC.setText(antworten[2]);
    FrageD.setText(antworten[3]);
  } 
  
  public void hideEndMessage() {
    jTextFieldEnd.setVisible(false);
    bRESTART1.setVisible(false); 
  }
  
  public void showEndMessage() {
    jTextFieldEnd.setText("Oh dear");
    jTextFieldEnd.setVisible(true);
    bRESTART1.setVisible(true);
    FrageA.setVisible(false);
    FrageB.setVisible(false);
    FrageC.setVisible(false);
    FrageD.setVisible(false);
    Ffield.setVisible(false);
  }
  
  public void bRESTART1_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    jTextFieldEnd.setVisible(false);
    bRESTART1.setVisible(false);
    FrageA.setVisible(true);
    FrageB.setVisible(true);
    FrageC.setVisible(true);
    FrageD.setVisible(true);
    Ffield.setVisible(true);
    dieST.restart();
  } // end of bRESTART1_ActionPerformed

  // end methods
}
