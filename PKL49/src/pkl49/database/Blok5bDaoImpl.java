/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok5bDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok5b;

/**
 *
 * @author Ken
 */
public class Blok5bDaoImpl implements Blok5bDao{

     protected final String insert ="INSERT INTO Blok5b  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok5b SET B5BR14A=?,B5BR14B=?,B5BR14C=?,B5BR15A=?," +
                                  "B5BR15B=?,B5BR16=?,B5BR16Lain=?,B5BR17_1=?,B5BR17_2=?,B5BR17_3=?,B5BR17_4=?," +
                                  "B5BR17_5=?,B5BR17_6=?,B5BR17_6Lain=?,B5BR18A=?,B5BR18B1=?,B5BR18B2=?,B5BR18B3=? " +
                                   "WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok5b WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok5b WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok5b WHERE NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok5b WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok5b";
    private Connection connection;

 private PreparedStatement pst=null;
    public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks,nilai);
        }
    }

    public Blok5bDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok5b(Blok5b blok5b) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, blok5b.getNKS());
            cek(2, blok5b.getNO_URUT());
            pst.setString(3, blok5b.getB5BR14A());
            pst.setString(4, blok5b.getB5BR14B());
            pst.setString(5, blok5b.getB5BR14C());
            cek(6, blok5b.getB5BR15A());
            cek(7, blok5b.getB5BR15B());
            cek(8, blok5b.getB5BR16());
            cek(9, blok5b.getB5BR16Lain());
            cek(10, blok5b.getB5BR17_1());
            cek(11, blok5b.getB5BR17_2());
            cek(12, blok5b.getB5BR17_3());
            cek(13, blok5b.getB5BR17_4());
            cek(14, blok5b.getB5BR17_5());
            cek(15, blok5b.getB5BR17_6());
            cek(16, blok5b.getB5BR17_6Lain());
            cek(17, blok5b.getB5BR18A());
            cek(18, blok5b.getB5BR18B1());
            cek(19, blok5b.getB5BR18B2());
            cek(20, blok5b.getB5BR18B3());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok5b(Blok5b blok5b) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            pst.setString(1, blok5b.getB5BR14A());
            pst.setString(2, blok5b.getB5BR14B());
            pst.setString(3, blok5b.getB5BR14C());
            cek(4, blok5b.getB5BR15A());
            cek(5, blok5b.getB5BR15B());
            cek(6, blok5b.getB5BR16());
            cek(7, blok5b.getB5BR16Lain());
            cek(8, blok5b.getB5BR17_1());
            cek(9, blok5b.getB5BR17_2());
            cek(10, blok5b.getB5BR17_3());
            cek(11, blok5b.getB5BR17_4());
            cek(12, blok5b.getB5BR17_5());
            cek(13, blok5b.getB5BR17_6());
            cek(14, blok5b.getB5BR17_6Lain());
            cek(15, blok5b.getB5BR18A());
            cek(16, blok5b.getB5BR18B1());
            cek(17, blok5b.getB5BR18B2());
            cek(18, blok5b.getB5BR18B3());
            pst.setString(21, blok5b.getNKS());
            cek(22, blok5b.getNO_URUT());

             pst.setString(19, blok5b.getNKS());
            cek(20, blok5b.getNO_URUT());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok5b(String NKS,int NO_URUT) throws SQLException {
            try{
            pst = connection.prepareStatement(delete);
            pst.setString(1, NKS);
            cek(2, NO_URUT);
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public Blok5b getBlok5b(String NKS,int NO_URUT) throws SQLException {
        Blok5b b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, NO_URUT);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok5b();
                 b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB5BR14A(set.getString(3));
                b.setB5BR14B(set.getString(4));
                b.setB5BR14C(set.getString(5));
                b.setB5BR15A(isNull(set,6));
                b.setB5BR15B(isNull(set,7));
                b.setB5BR16(isNull(set,8));
                b.setB5BR16Lain(isNull(set,9));
                b.setB5BR17_1(isNull(set,10));
                b.setB5BR17_2(isNull(set,11));
                b.setB5BR17_3(isNull(set,12));
                b.setB5BR17_4(isNull(set,13));
                b.setB5BR17_5(isNull(set,14));
                b.setB5BR17_6(isNull(set,15));
                b.setB5BR17_6Lain(isNull(set,16));
                b.setB5BR18A(isNull(set,17));
                b.setB5BR18B1(isNull(set,18));
                b.setB5BR18B2(isNull(set,19));
                b.setB5BR18B3(isNull(set,20));


            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok5b> selectAllBlok5b() throws SQLException {
        List<Blok5b> list = new ArrayList<Blok5b>();
        Blok5b b;
        Statement st = null;
        st = connection.createStatement();
        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok5b();
            b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB5BR14A(set.getString(3));
            b.setB5BR14B(set.getString(4));
            b.setB5BR14C(set.getString(5));
            b.setB5BR15A(isNull(set,6));
            b.setB5BR15B(isNull(set,7));
            b.setB5BR16(isNull(set,8));
            b.setB5BR16Lain(isNull(set,9));
            b.setB5BR17_1(isNull(set,10));
            b.setB5BR17_2(isNull(set,11));
            b.setB5BR17_3(isNull(set,12));
            b.setB5BR17_4(isNull(set,13));
            b.setB5BR17_5(isNull(set,14));
            b.setB5BR17_6(isNull(set,15));
            b.setB5BR17_6Lain(isNull(set,16));
            b.setB5BR18A(isNull(set,17));
            b.setB5BR18B1(isNull(set,18));
            b.setB5BR18B2(isNull(set,19));
            b.setB5BR18B3(isNull(set,20));
            list.add(b);
        }
        return list;

    }

    protected Integer isNull(ResultSet rs,int indeks){
      Integer a=null,b = null;
        try {
            b=rs.getInt(indeks);
            if (b == 0) {
                if (rs.wasNull()) {
                    a = null;
                }
            } else {
                a = b;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Blok4DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public List<Blok5b> getAllBlok5b(String NKS) throws SQLException {
        List<Blok5b> list = new ArrayList<Blok5b>();
        Blok5b b;
        pst = connection.prepareStatement(getAllData);
        pst.setString(1, NKS);
        ResultSet set = pst.executeQuery();
        while(set.next()){
            b = new Blok5b();
            b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB5BR14A(set.getString(3));
            b.setB5BR14B(set.getString(4));
            b.setB5BR14C(set.getString(5));
            b.setB5BR15A(isNull(set,6));
            b.setB5BR15B(isNull(set,7));
            b.setB5BR16(isNull(set,8));
            b.setB5BR16Lain(isNull(set,9));
            b.setB5BR17_1(isNull(set,10));
            b.setB5BR17_2(isNull(set,11));
            b.setB5BR17_3(isNull(set,12));
            b.setB5BR17_4(isNull(set,13));
            b.setB5BR17_5(isNull(set,14));
            b.setB5BR17_6(isNull(set,15));
            b.setB5BR17_6Lain(isNull(set,16));
            b.setB5BR18A(isNull(set,17));
            b.setB5BR18B1(isNull(set,18));
            b.setB5BR18B2(isNull(set,19));
            b.setB5BR18B3(isNull(set,20));
            list.add(b);
        }
        return list;
    }

    public void deleteBlok5b(String NKS) throws SQLException {
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
