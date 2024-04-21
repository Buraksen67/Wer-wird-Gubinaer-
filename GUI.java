import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Description
 *
 * @version 1.0 from 11.03.2024
 * @author 
 */

public class GUI extends JFrame {
  // Assoziation
  // start attributes
  private Steuerung dieST;
  private JButton FrageA = new JButton();
  private JButton FrageC = new JButton();
  private JButton FrageD = new JButton();
  private JButton FrageB = new JButton();
  private JTextField Ffield = new JTextField();
  private JTextField jTextField1 = new JTextField();
  // end attributes
  
  public GUI() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 963; 
    int frameHeight = 672;
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
    FrageA.setText("Button");
    FrageA.setMargin(new Insets(2, 2, 2, 2));
    FrageA.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageA_ActionPerformed(evt);
      }
    });
    FrageA.setVisible(false);
    cp.add(FrageA);
    FrageC.setBounds(88, 528, 328, 64);
    FrageC.setText("");
    FrageC.setMargin(new Insets(2, 2, 2, 2));
    FrageC.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageC_ActionPerformed(evt);
      }
    });
    cp.add(FrageC);
    FrageD.setBounds(528, 528, 328, 64);
    FrageD.setText("Button");
    FrageD.setMargin(new Insets(2, 2, 2, 2));
    FrageD.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageD_ActionPerformed(evt);
      }
    });
    cp.add(FrageD);
    FrageB.setBounds(528, 440, 328, 64);
    FrageB.setText("Button");
    FrageB.setMargin(new Insets(2, 2, 2, 2));
    FrageB.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        FrageB_ActionPerformed(evt);
      }
    });
    cp.add(FrageB);
    Ffield.setBounds(88, 336, 768, 80);
    Ffield.setEditable(false);
    cp.add(Ffield);
    jTextField1.setBounds(176, 464, 9, 1);
    cp.add(jTextField1);
    // end components
    setVisible(true);
    dieST = new Steuerung(this);
  } // end of public GUI
  
  
  // start methods
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void FrageA_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of FrageA_ActionPerformed

  public void FrageC_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of FrageC_ActionPerformed

  public void FrageD_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of FrageD_ActionPerformed

  public void FrageB_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of FrageB_ActionPerformed

  // end methods
} // end of class GUI
