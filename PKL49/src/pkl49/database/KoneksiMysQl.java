/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Mr.Hands
 */
public class KoneksiMysQl {

    private static  Connection connectionRT;
    private static  Connection connectionPodes;

    public static Connection getConnectionRT() {
        if (connectionRT==null){
            MysqlDataSource source = new MysqlDataSource();
            source.setUrl("jdbc:mysql://"+DatabaseProperty.getHost()+":"+DatabaseProperty.getPort()+"/DB_PKL49_RT");
            source.setUser(DatabaseProperty.getUsername());
            source.setPassword(DatabaseProperty.getPassword());
            try {
                connectionRT = source.getConnection();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal");
            }
        }
        return connectionRT;
    }
    public static void closeConnectionRT(){
        if(connectionRT!=null){
            try {
                connectionRT.close();
            } catch (SQLException ex) {
                Logger.getLogger(KoneksiMysQl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static Connection getConnectionPodes() {
        if (connectionPodes==null){
            MysqlDataSource source = new MysqlDataSource();
            source.setUrl("jdbc:mysql://"+DatabaseProperty.getHost()+":"+DatabaseProperty.getPort()+"/DB_PKL49_PODES");
            source.setUser(DatabaseProperty.getUsername());
            source.setPassword(DatabaseProperty.getPassword());
            try {
                connectionPodes = source.getConnection();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal");
            }
        }
        return connectionPodes;
    }

}
