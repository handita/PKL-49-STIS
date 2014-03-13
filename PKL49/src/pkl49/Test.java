/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pkl49.control.DataStatic;
import pkl49.database.*;
import pkl49.database.DatabaseProperty;
import pkl49.database.KoneksiMysQl;
import pkl49.database.dao.*;
import pkl49.database.entity.Blok8b;
import pkl49.view.FormUtama;

/**
 *
 * @author Ken
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DatabaseProperty.setHost("localhost");
        DatabaseProperty.setPort("3306");
        DatabaseProperty.setNama("pkl49");
        DatabaseProperty.setUsername("root");
        DatabaseProperty.setPassword("");
        DataStatic.setData();
        Blok7bDao dao = new Blok7bDaoImpl(KoneksiMysQl.getConnectionRT());
        String a = dao.getBlok7b("02131006003B02").getB7BR23().toString();
        System.out.println(a);
    }
}