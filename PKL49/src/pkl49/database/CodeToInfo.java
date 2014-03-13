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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ken
 */
public class CodeToInfo {

    private Connection connection;
    private final String getKab = "SELECT B1R1, NAMAKAB " +
            "FROM kabupaten";
    private final String getStrata = "SELECT B1R1, STRATA " +
            "FROM kabupaten";
    private final String getKec = "SELECT B1R3, NAMAKECA " +
            "FROM kecamatan";
    private final String getDesa = "SELECT B1R4, NAMADESA " +
            "FROM desa";
    private final String getPengentry = "SELECT nim, nama " +
            "FROM pengentri";

    public CodeToInfo() {
        connection = KoneksiMysQl.getConnection();
    }

    /**
     * Mendapatkan kode kabupaten dan nama kabupaten. Hasilnya disimpan dalam HashTable
     * @return
     */
    public Hashtable<String, String> getKab(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getKab);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeToInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }
    /**
     * Mendapatkan kode kabupaten dan strata. Hasilnya disimpan dalam HashTable
     * @return
     */
    public Hashtable<String, String> getStrata(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getStrata);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeToInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }

    /**
     * Mendapatkan kode kecamatan dan nama kecamatan. Hasilnya disimpan dalam HashTable
     * @return
     */
    public Hashtable<String, String> getKec(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getKec);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeToInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }

    /**
     * Mendapatkan kode desa dan nama desa. Hasilnya disimpan dalam HashTable
     * @return
     */
    public Hashtable<String, String> getDesa(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getDesa);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeToInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }

    /**
     * Mendapatkan nim pengentry dan nama pengentry. Hasilnya disimpan dalam HashTable
     * @return
     */
    public Hashtable<String, String> getPengentry(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getPengentry);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CodeToInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }
}
