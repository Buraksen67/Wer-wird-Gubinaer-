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
  
  public GUI() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
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
    
    // end components
    
    setVisible(true);
    DieST = new Steuerung(this);
  } // end of public GUI
  
  // start methods
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  // end methods
} // end of class GUI
