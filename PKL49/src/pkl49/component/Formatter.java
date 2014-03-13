/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.component;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Mr.Hands
 */
public class Formatter extends AbstractFormatterFactory{
    private MaskFormatter formatter;
    public Formatter(String string) {
        try {
            formatter = new MaskFormatter(string);
        } catch (ParseException ex) {
            Logger.getLogger(Formatter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public AbstractFormatter getFormatter(JFormattedTextField tf) {
    //    throw new UnsupportedOperationException("Not supported yet.");
        return formatter;
    }

}
