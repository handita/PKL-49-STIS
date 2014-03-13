/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ken
 */
public class DataStat {

    private Connection connection;
    private final String getKab = "SELECT B1R1, NAMAKAB " +
            "FROM kabupaten";
    private final String getStrata = "SELECT B1R1, STRATA " +
            "FROM kabupaten";
    private final String getKec = "SELECT B1R1, B1R3, NAMAKECA " +
            "FROM kecamatan";
    private final String getDesa = "SELECT B1R1, B1R3, B1R4, NAMADESA " +
            "FROM desa";
    private final String getPengentry = "SELECT nim, nama " +
            "FROM pengentri";
    private final String getNKS = "SELECT nks " +
            "FROM nks WHERE nks=?";
    private final String getNIMKortimAndPencacah = "SELECT nimkortim, nimpencacah " +
            "FROM kortim";
    private final String getNIMKortim = "SELECT DISTINCT nimkortim " +
            "FROM kortim";

    public DataStat() {
        connection = KoneksiMysQl.getConnectionRT();
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
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
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
                String kabAndKec = rs.getString(1)+rs.getString(2);
                tabel.put(kabAndKec, rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
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
                String kabKecDesa = rs.getString(1)+rs.getString(2)+rs.getString(3);
                tabel.put(kabKecDesa, rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }
    /**
     * Mendapatkan nim pencacah dan nim kortim. Hasilnya disimpan dalam HashTable
     * @return
     */
    public Hashtable<String, String> getPencacah(){
        Hashtable<String, String> tabel = new Hashtable<String, String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getNIMKortimAndPencacah);
            while(rs.next()){
                tabel.put(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }
    /**
     * Mendapatkan daftar nim kortim. Hasilnya disimpan dalam ArrayList
     * @return
     */
    public List<String> getKortim(){
        List<String> tabel = new ArrayList<String>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getNIMKortim);
            while(rs.next()){
                tabel.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel;
    }

    /**
     * Mendapatkan master NKS
     * @param NKS
     * @return
     */
    public String getNKS(String NKS){
        PreparedStatement ps = null;
        String str = null;
        try {
            ps = connection.prepareStatement(getNKS);
            ps.setString(1, NKS);
            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next())
                str = resultSet.getString(1);

        } catch (SQLException ex) {
            Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataStat.class.getName()).log(Level.SEVERE, null, ex);
            }
            return str;
        }
    }
}
