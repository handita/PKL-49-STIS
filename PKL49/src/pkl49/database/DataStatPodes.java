/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

/**
 *
 * @author Ken
 */
public class DataStatPodes {

    private Connection connection;
    protected final String getKorwil = "SELECT nimkorwil,nimkortim FROM korwil";

    public DataStatPodes() {
        connection = KoneksiMysQl.getConnectionPodes();
    }

    public Hashtable<String,String> getKorwil(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getKorwil);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tabel;
    }


}
