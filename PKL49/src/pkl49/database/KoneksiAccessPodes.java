/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ken
 */
public class KoneksiAccessPodes {

private  Connection connection;
    public  Connection getConnection() {
        try {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             connection= DriverManager.getConnection("jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ="+System.getProperty("user.dir")+"\\DbPKL49_Podes.mdb") ;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal!");
        }
        return connection;
    }


}
