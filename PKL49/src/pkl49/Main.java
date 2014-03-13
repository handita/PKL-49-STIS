/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pkl49.control.ReadIP;
import pkl49.database.DatabaseProperty;
import pkl49.view.LoginForm;

/**
 *
 * @author Kean
 */
public class Main {

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {


        DatabaseProperty.setHost(ReadIP.readIP());
        DatabaseProperty.setPort("3306");
        DatabaseProperty.setUsername("root");
        DatabaseProperty.setPassword("");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
        

    }
}