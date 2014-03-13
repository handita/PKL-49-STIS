/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class LabelWaktu extends Label implements Runnable{

    private pkl49.util.Time t;
    public LabelWaktu() {
        super("Time");
    }

    public void start(){
        Thread thread = new Thread(this, "TimeThread");
        thread.start();
    }
    public void run() {
        while(true){
            
            t.setTime();
            setText(t.getJamHuruf());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LabelWaktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
