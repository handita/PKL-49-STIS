/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.dao.Blok4Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pkl49.database.entity.Blok4;

/**
 *
 * @author Ken
 */
public class Blok4DaoImpl implements Blok4Dao{

    protected final String insert ="INSERT INTO blok4  VALUES (?,?,?,?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok4 SET B4K2=?,B4K3=?,B4K4=?,B4K5=?,B4K6=?,B4K7=?,B4K8=?,B4K9=? WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok4 WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok4 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok4 WHERE NKS=? AND NO_URUT=?";
    protected final String selectAll ="SELECT * FROM Blok4";
    private Connection connection;
    private PreparedStatement pst=null;
    public Blok4DaoImpl(Connection connection) {
        this.connection = connection;
    }
public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks,nilai);
        }
    }
    public void insertBlok4(Blok4 blok4) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, blok4.getNKS());
            cek(2, blok4.getNO_URUT());
            pst.setString(3, blok4.getB4K2());
            cek(4, blok4.getB4K3());
            cek(5, blok4.getB4K4());
            cek(6, blok4.getB4K5());
            cek(7, blok4.getB4K6());
            cek(8, blok4.getB4K7());
            cek(9, blok4.getB4K8());
            cek(10, blok4.getB4K9());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok4(Blok4 blok4) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
             pst.setString(9, blok4.getNKS());
            cek(10, blok4.getNO_URUT());
            pst.setString(1, blok4.getB4K2());
            cek(2, blok4.getB4K3());
            cek(3, blok4.getB4K4());
            cek(4, blok4.getB4K5());
            cek(5, blok4.getB4K6());
            cek(6, blok4.getB4K7());
            cek(7, blok4.getB4K8());
            cek(8, blok4.getB4K9());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok4(String NKS,int NO_URUT) throws SQLException {
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
    public Blok4 getBlok4(String NKS,int NO_URUT) throws SQLException {
        Blok4 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, NO_URUT);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok4();
             b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB4K2(set.getString(3));
            b.setB4K3(isNull(set,4));
            b.setB4K4(isNull(set,5));

            b.setB4K5(set.getInt(6));
            b.setB4K6(isNull(set,7));
            b.setB4K7(isNull(set,8));
            b.setB4K8(isNull(set,9));
            b.setB4K9(isNull(set,10));



            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok4> selectAllBlok4() throws SQLException {
        List<Blok4> list = new ArrayList<Blok4>();
        Blok4 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok4();
        b.setNKS(set.getString(1));
        b.setNO_URUT(isNull(set,2));
        b.setB4K2(set.getString(3));
        b.setB4K3(isNull(set,4));
        b.setB4K4(isNull(set,5));
        b.setB4K5(set.getInt(6));
        b.setB4K6(isNull(set,7));
        b.setB4K7(isNull(set,8));
        b.setB4K8(isNull(set,9));
        b.setB4K9(isNull(set,10));


            list.add(b);
        }
        return list;

    }

    public void deleteBlok4(String NKS) throws SQLException {
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
