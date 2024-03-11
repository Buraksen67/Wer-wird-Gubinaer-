import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Description
 *
 * @version 1.0 from 10.03.2024
 * @author 
 */

public class GUI extends JFrame {
  // Assoziationen
  Steuerung DieST;
  // end attributes
  
  //Components
  private JLabel questionLabeL;
  private JButton[] answerButtons;
  private JButton quitButton;
  private int currentQuestionIndex;
  
  // Questions and answers (simplified)
  private String[] questions = {
          "What is the capital of France?",
          "Which planet is known as the Red Planet?",
          "What is the largest mammal on Earth?"
    };
  
  private String[][] answers = {
          {"Berlin", "Madrid", "Paris", "Rome" },
          {"Venus", "Mars", "Jupiter", "Saturn"},
          {"Elephant", "Blue Whale", "Giraffe", "Lion"}
    };
  
  public GUI() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 500;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Wer wird Gubinär");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    questionLabeL = new JLabel();
    questionLabeL.setBounds(50,20,400,30);
    questionLabeL.setHorizontalAlignment(JLabel.CENTER);
    
    answerButtons = new JButton[4];
    for (int i = 0; i < 4; i++) {
      answerButtons[i] = new JButton();
      answerButtons[i].setBounds(50, 70 + i * 40, 400, 30);
      answerButtons[i].addActionListener(new AnswerButtonListener());
      cp.add(answerButtons[i]);
    } // end of for
    
    quitButton = new JButton("Quit");
    quitButton.setBounds(200, 230, 100, 30);
    quitButton.addActionListener(new ActionListener(){;
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(GUI.this, "Thanks for playing!");
        System.exit(0);
      }
    });
    
    cp.add(questionLabeL);
    cp.add(quitButton);
    
    setVisible(true);
    DieST = new Steuerung(this);
    
    // Start the game with the first question
    nextQuestion();
  } // end of public GUI
    
    // start methods
  private void nextQuestion() {
    if (currentQuestionIndex < questions.length) {
      questionLabeL.setText(questions[currentQuestionIndex]);
      
      for (int i = 0; i < 4; i++) {
        answerButtons[i].setText(answers[currentQuestionIndex][i]);
      } // end of for
      currentQuestionIndex++;
    } else {
      JOptionPane.showMessageDialog(this, "Congratulations! You've answered all questions. ");
      System.exit(0);
    } // end of if-else 
  }
  
  private class AnswerButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JButton sourceButton = (JButton) e.getSource();
      String selectedAnswer = sourceButton.getText();
      JOptionPane.showMessageDialog(GUI.this, "Your answer: " + selectedAnswer);
      
      // Move to the next question
      nextQuestion();
    }
  }  
  
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {;
      public void run() {
        new GUI();
      }
    });
  } // end of main
    // end methods
  } // end of class GUI
