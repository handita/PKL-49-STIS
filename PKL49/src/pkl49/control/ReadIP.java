/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.control;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ken
 */
public class ReadIP {

    public static String readIP(){
        String IP = null;
        File file = new File("IPAddress.txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            IP = bufferedReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ReadIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bufferedReader.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return IP;
    }
}
