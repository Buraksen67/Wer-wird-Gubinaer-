import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {
  // Assoziationen
  // Anfang Attribute
  Steuerung DieST;
  // end attributes
  
  //Components
  private JLabel questionLabel;
  private JButton[] answerButtons;
  //private JLabel[] priceLabel;
  private JLabel[] priceLabel;
  private JButton quitButton;
  private JLabel timerLabel;
  private int currentQuestionIndex = 0;
  private Timer timer;
  private int secondsLeft = 15;
  
  public String Questions[] = {
    "What is the capital of France?",
    "Which planet is called the red planet?",
    "What animal is the largest one on earth?",
    "Which of the following historical figures had the greatest influence on modern physics?"
  };
  public String Answers[][] = {
    {"Rome", "Madrid", "Paris", "Berlin"},
    {"Venus", "Mars", "Jupiter", "Earth"},
    {"Elephant", "Blue Whale", "Lion", "Rhino"},
    {"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Marie Curie"}
  };
  public int CorrectAnswers[] = {
    2, 1, 1, 1
  };
  private String priceText[] = {
  "50€",
  "100€",
  "200€",
  "300€"
  };

  // Ende Attribute
  public GUI() {
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 900;
    int frameHeight = 400;
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
    questionLabel = new JLabel();
    questionLabel.setBounds(15, 30, 475, 30);
    questionLabel.setHorizontalAlignment(JLabel.CENTER);
    
    answerButtons = new JButton[4];
    for (int i = 0; i < 4; i++) {
      answerButtons[i] = new JButton();
      answerButtons[i].setBounds(50, 100 + i * 40, 700, 30);
      answerButtons[i].addActionListener(new AnswerButtonListener());
      cp.add(answerButtons[i]);
    } // end of for
    
    priceLabel = new JLabel[4];
    questionLabel.setHorizontalAlignment(JLabel.RIGHT);
    for (int i = 0; i < 4 ; i++ ) {
      priceLabel[i] = new JLabel();
      priceLabel[i].setBounds(800, 70 - 20 * i, 100, 300);
      priceLabel[i].setText(priceText[i]);
      cp.add(priceLabel[i]);
      setVisible(false);
    } // end of for
    
    
    quitButton = new JButton("Quit");
    quitButton.setBounds(350, 300, 100, 30);
    quitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(GUI.this, "Thanks for playing!");
        System.exit(0);
      }
    });
    
    timerLabel = new JLabel();
    timerLabel.setBounds(10, 10, 80, 20);
    timerLabel.setHorizontalAlignment(JLabel.RIGHT);
    timerLabel.setText("Time: " + secondsLeft);
    
    cp.add(questionLabel);
    cp.add(quitButton);
    cp.add(timerLabel);
    
    setVisible(true);
    DieST = new Steuerung(this);
    
    // Start the game with the first question
    nextQuestion();
    
    // Start the timer
    timer = new Timer(1000, new TimerListener());
    timer.start();
  } // end of public GUI
    // Anfang Komponenten
    // Ende Komponenten
  // Anfang Methoden

    // start methods
  private void nextQuestion() {
    if (currentQuestionIndex < Questions.length) {
      questionLabel.setText(Questions[currentQuestionIndex]);
      
      for (int i = 0; i < 4; i++) {
        answerButtons[i].setText(Answers[currentQuestionIndex][i]); //answers[currentQuestionIndex][i]);
      } // end of for
      
      for (int i = 0; i < 4 ; i++) {
        if (i== currentQuestionIndex) {
          priceLabel[i].setFont(new Font("Courier", Font.BOLD, 25));
        } // end of if
        else {
          priceLabel[i].setFont(new Font("Courier", Font.BOLD, 15));
        } // end of if-else
      } // end of for
    } else {
      JOptionPane.showMessageDialog(this, "Congratulations! You've answered all questions. ");
      System.exit(0);
    } // end of if-else
  }

  private class AnswerButtonListener implements ActionListener {
  // Anfang Attribute1
  // Ende Attribute1
  // Anfang Methoden1
  
    public void OnRightAnswer() {
      timer.stop();
      JOptionPane.showMessageDialog(GUI.this, "You are right!");
      currentQuestionIndex++;
      secondsLeft = 15; // Reset the timer
      timer.start();
    };
    
    public void OnWrongAnswer() {
      timer.stop();
      JOptionPane.showMessageDialog(GUI.this, "You are wrong!");
    };
    
    public void actionPerformed(ActionEvent e) {
      JButton sourceButton = (JButton) e.getSource();
      if(sourceButton.getText() == Answers[currentQuestionIndex][CorrectAnswers[currentQuestionIndex]])
      {
        OnRightAnswer();
      }
      else 
      {
        OnWrongAnswer();  
      } // end of if-else
      
      // Move to the next question
      nextQuestion();
    }
    // Anfang Komponenten1
    // Ende Komponenten1
  // Ende Methoden1
  }

  private class TimerListener implements ActionListener {
  // Anfang Attribute2
  // Ende Attribute2
  // Anfang Methoden2
    public void actionPerformed(ActionEvent e) {
      secondsLeft--;
      timerLabel.setText("Time: " + secondsLeft);
      if (secondsLeft == 0) {
        timer.stop();
        JOptionPane.showMessageDialog(GUI.this, "Time's up!");
      }
    }
    // Anfang Komponenten2
    // Ende Komponenten2
  // Ende Methoden2
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new GUI();
      }
    });
  } // end of main
  // Ende Methoden
    // end methods
} // end of class GUI
