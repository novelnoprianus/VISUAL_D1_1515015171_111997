import java.awt.*;
import java.awt.event.*;


//package Modul5;

/**
 *
 * @author asus
 */
public abstract class KeyListenerTester extends Frame implements KeyListener
{
    TextField t1;
    Label l1;
    
    public KeyListenerTester(String s){
        super(s);
        Panel p = new Panel();
        l1 = new Label ("Key Listener!");
        p.add(l1);
        addKeyListener (this);
        setSize (200,100);
        setVisible(true);
        addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                    
                }
                });
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        l1.setText("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        l1.setText("Key Pressed");
    }
    
    public void keyRealeased(KeyEvent ke) {
        l1.setText("Key Released");
    }

    public static void main (String[]args) {
         new KeyListenerTester ("Key Listener Tester") {
             @Override
             public void keyReleased(KeyEvent ke) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };
    }
}
