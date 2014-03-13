/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok8bDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok8b;

/**
 *
 * @author Ken
 */
public class Blok8bDaoImpl implements Blok8bDao{

 protected final String insert ="INSERT INTO Blok8b  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 protected final String update ="UPDATE Blok8b SET NKS=?,NO_URUT=?,B8BR1=?,B8BR2=?,B8BR3=?,B8BR4=?,B8BR5=?," +
         "B8BR6=?,B8BR7=?,B8BR8=?,B8BR9=?,B8BR10=?,B8BR11=?,B8BR12=?,B8BR13=?,B8BR14=?,B8BR15=?,B8BR16=?" +
         " WHERE NKS=? AND NO_URUT=?";
     protected final String delete ="DELETE FROM Blok8b WHERE NKS=? AND NO_URUT=?";
     protected final String deleteAll ="DELETE FROM Blok8b WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok8b WHERE NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok8b WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok8b";
    private Connection connection;

 
    public Blok8bDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok8b(Blok8b Blok8b) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, Blok8b.getNKS());
            cek(2, Blok8b.getNO_URUT());
            cek(3, Blok8b.getB8BR1());
            cek(4, Blok8b.getB8BR2());
            cek(5, Blok8b.getB8BR3());
            cek(6, Blok8b.getB8BR4());
            cek(7, Blok8b.getB8BR5());
            cek(8, Blok8b.getB8BR6());
            cek(9, Blok8b.getB8BR7());
            cek(10, Blok8b.getB8BR8());
            cek(11, Blok8b.getB8BR9());
            cek(12, Blok8b.getB8BR10());
            cek(13, Blok8b.getB8BR11());
            cek(14, Blok8b.getB8BR12());
            cek(15, Blok8b.getB8BR13());
            cek(16, Blok8b.getB8BR14());
            cek(17, Blok8b.getB8BR15());
            cek(18, Blok8b.getB8BR16());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok8b(Blok8b Blok8b) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            pst.setString(1, Blok8b.getNKS());
            pst.setInt(2, Blok8b.getNO_URUT());
            pst.setInt(3, Blok8b.getB8BR1());
            pst.setInt(4, Blok8b.getB8BR2());
            pst.setInt(5, Blok8b.getB8BR3());
            pst.setInt(6, Blok8b.getB8BR4());
            pst.setInt(7, Blok8b.getB8BR5());
            pst.setInt(8, Blok8b.getB8BR6());
            pst.setInt(9, Blok8b.getB8BR7());
            pst.setInt(10, Blok8b.getB8BR8());
            pst.setInt(11, Blok8b.getB8BR9());
            pst.setInt(12, Blok8b.getB8BR10());
            pst.setInt(13, Blok8b.getB8BR11());
            pst.setInt(14, Blok8b.getB8BR12());
            pst.setInt(15, Blok8b.getB8BR13());
            pst.setInt(16, Blok8b.getB8BR14());
            pst.setInt(17, Blok8b.getB8BR15());
            pst.setInt(18, Blok8b.getB8BR16());
            pst.setString(19, Blok8b.getNKS());
            pst.setInt(20, Blok8b.getNO_URUT());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok8b(String NKS,int NO_URUT)throws SQLException {
        try{
            pst = connection.prepareStatement(delete);
            pst.setString(1, NKS);
            pst.setInt(2, NO_URUT);
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public Blok8b getBlok8b(String NKS,int no_urut) throws SQLException {
        Blok8b b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, no_urut);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok8b();
           b.setNKS(set.getString(1));
            b.setNO_URUT(set.getInt(2));
            b.setB8BR1(set.getInt(3));
            b.setB8BR2(set.getInt(4));
            b.setB8BR3(set.getInt(5));
            b.setB8BR4(set.getInt(6));
            b.setB8BR5(set.getInt(7));
            b.setB8BR6(set.getInt(8));
            b.setB8BR7(set.getInt(9));
            b.setB8BR8(set.getInt(10));
            b.setB8BR9(set.getInt(11));
            b.setB8BR10(set.getInt(12));
            b.setB8BR11(set.getInt(13));
            b.setB8BR12(set.getInt(14));
            b.setB8BR13(set.getInt(15));
            b.setB8BR14(set.getInt(16));
            b.setB8BR15(set.getInt(17));
            b.setB8BR16(set.getInt(18));
           


            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok8b> selectAllBlok8b() throws SQLException {
        List<Blok8b> list = new ArrayList<Blok8b>();
        Blok8b b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok8b();
         b.setNKS(set.getString(1));
            b.setNO_URUT(set.getInt(2));
            b.setB8BR1(set.getInt(3));
            b.setB8BR2(set.getInt(4));
            b.setB8BR3(set.getInt(5));
            b.setB8BR4(set.getInt(6));
            b.setB8BR5(set.getInt(7));
            b.setB8BR6(set.getInt(8));
            b.setB8BR7(set.getInt(9));
            b.setB8BR8(set.getInt(10));
            b.setB8BR9(set.getInt(11));
            b.setB8BR10(set.getInt(12));
            b.setB8BR11(set.getInt(13));
            b.setB8BR12(set.getInt(14));
            b.setB8BR13(set.getInt(15));
            b.setB8BR14(set.getInt(16));
            b.setB8BR15(set.getInt(17));
            b.setB8BR16(set.getInt(18));
          

            list.add(b);
        }
        return list;

    }

    public List<Blok8b> getAllBlok8b(String NKS) throws SQLException {
        List<Blok8b> list = new ArrayList<Blok8b>();
        Blok8b b = null;
        try{
            pst = connection.prepareStatement(getAllData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            while (set.next()){
                b = new Blok8b();
               b.setNKS(set.getString(1));
                b.setNO_URUT(set.getInt(2));
                b.setB8BR1(set.getInt(3));
                b.setB8BR2(set.getInt(4));
                b.setB8BR3(set.getInt(5));
                b.setB8BR4(set.getInt(6));
                b.setB8BR5(set.getInt(7));
                b.setB8BR6(set.getInt(8));
                b.setB8BR7(set.getInt(9));
                b.setB8BR8(set.getInt(10));
                b.setB8BR9(set.getInt(11));
                b.setB8BR10(set.getInt(12));
                b.setB8BR11(set.getInt(13));
                b.setB8BR12(set.getInt(14));
                b.setB8BR13(set.getInt(15));
                b.setB8BR14(set.getInt(16));
                b.setB8BR15(set.getInt(17));
                b.setB8BR16(set.getInt(18));
               list.add(b);
            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return list;
    }

private PreparedStatement pst=null;
    public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks,nilai);
        }
    }
protected Integer isNull(ResultSet rs,int indeks){
      Integer a=null,b = null;
        try {
            b=rs.getInt(indeks);
            
            if (b == 0) {
                if (rs.wasNull()) {
                    a = 0;
                }
            } else {
                a = b;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Blok4DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println(a);
        return a;
    }

    public void deleteBlok8b(String NKS) throws SQLException {
        try{
            pst = connection.prepareStatement(deleteAll);
            pst.setString(1, NKS);
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }


}
