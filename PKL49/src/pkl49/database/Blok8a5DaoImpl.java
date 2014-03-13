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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.dao.Blok8a5Dao;
import pkl49.database.entity.Blok8a5;

/**
 *
 * @author Ken
 */
public class Blok8a5DaoImpl implements Blok8a5Dao {

    protected final String insert ="INSERT INTO Blok8a5  VALUES (?,?,?,?)";
    protected final String update ="UPDATE Blok8a5 SET B8AK5=?,B8AK5ALS=? WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok8a5 WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok8a5 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok8a5 WHERE NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok8a5 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok8a5";
    private Connection connection;
     private PreparedStatement pst=null;

    public Blok8a5DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok8a5(Blok8a5 Blok8a5) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, Blok8a5.getNKS());
            cek(2, Blok8a5.getNO_URUT());
            cek(3, Blok8a5.getB8AK5());
            cek(4, Blok8a5.getB8AK5ALS());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok8a5(Blok8a5 Blok8a5) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            cek(1, Blok8a5.getB8AK5());
            cek(2, Blok8a5.getB8AK5ALS());
            pst.setString(3, Blok8a5.getNKS());
            cek(4, Blok8a5.getNO_URUT());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok8a5(String NKS,int NO_URUT) throws SQLException {
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

    public Blok8a5 getBlok8a5(String NKS,int no_urut) throws SQLException {
        Blok8a5 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, no_urut);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok8a5();
                 b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB8AK5(isNull(set,3));
                b.setB8AK5ALS(isNull(set,4));
            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok8a5> selectAllBlok8a5() throws SQLException {
        List<Blok8a5> list = new ArrayList<Blok8a5>();
        Blok8a5 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok8a5();
            b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB8AK5(isNull(set,3));
            b.setB8AK5ALS(isNull(set,4));

            list.add(b);
        }
        return list;

    }

    public List<Blok8a5> getAllBlok8a5(String NKS) throws SQLException {
        List<Blok8a5> list = new ArrayList<Blok8a5>();
        Blok8a5 b = null;
        try{
            pst = connection.prepareStatement(getAllData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            while (set.next()){
                b = new Blok8a5();
                b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB8AK5(isNull(set,3));
                b.setB8AK5ALS(isNull(set,4));
                list.add(b);

            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return list;
    }

public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks,nilai);
        }
    }

protected Integer isNull(ResultSet rs,int indeks){
      Integer a = null,b = null;
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

    public void deleteBlok8a5(String NKS) throws SQLException {
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
