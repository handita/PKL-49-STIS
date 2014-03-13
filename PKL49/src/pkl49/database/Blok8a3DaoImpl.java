/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok8a3Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok8a3;

/**
 *
 * @author Ken
 */
public class Blok8a3DaoImpl implements Blok8a3Dao{

     protected final String insert ="INSERT INTO Blok8a3  VALUES (?,?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok8a3 SET B8AK6=?,B8AK7=?,B8AK8=?,B8AK9=?,B8AK10=?,B8AK11=? WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok8a3 WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok8a3 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok8a3 WHERE NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok8a3 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok8a3";
    private Connection connection;
     private PreparedStatement pst=null;
    
    public Blok8a3DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok8a3(Blok8a3 Blok8a3) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, Blok8a3.getNKS());
            cek(2, Blok8a3.getNO_URUT());
            cek(3, Blok8a3.getB8AK6());
            cek(4, Blok8a3.getB8AK7());
            cek(5, Blok8a3.getB8AK8());
            cek(6, Blok8a3.getB8AK9());
            cek(7, Blok8a3.getB8AK10());
            cek(8, Blok8a3.getB8AK11());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok8a3(Blok8a3 Blok8a3) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            cek(1, Blok8a3.getB8AK6());
            cek(2, Blok8a3.getB8AK7());
            cek(3, Blok8a3.getB8AK8());
            cek(4, Blok8a3.getB8AK9());
            cek(5, Blok8a3.getB8AK10());
            cek(6, Blok8a3.getB8AK11());
            pst.setString(7, Blok8a3.getNKS());
            cek(8, Blok8a3.getNO_URUT());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok8a3(String NKS,int NO_URUT) throws SQLException {
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

    public Blok8a3 getBlok8a3(String NKS,int no_urut) throws SQLException {
        Blok8a3 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, no_urut);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok8a3();
                 b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB8AK6(isNull(set,3));
                b.setB8AK7(isNull(set,4));
                b.setB8AK8(isNull(set,5));
                b.setB8AK9(isNull(set,6));
                b.setB8AK10(isNull(set,7));
                b.setB8AK11(isNull(set,8));
            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok8a3> selectAllBlok8a3() throws SQLException {
        List<Blok8a3> list = new ArrayList<Blok8a3>();
        Blok8a3 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok8a3();
             b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB8AK6(isNull(set,3));
            b.setB8AK7(isNull(set,4));
            b.setB8AK8(isNull(set,5));
            b.setB8AK9(isNull(set,6));
            b.setB8AK10(isNull(set,7));
            b.setB8AK11(isNull(set,8));


            list.add(b);
        }
        return list;

    }

    public List<Blok8a3> getAllBlok8a3(String NKS) throws SQLException {
        List<Blok8a3> list = new ArrayList<Blok8a3>();
        Blok8a3 b = null;
        try{
            pst = connection.prepareStatement(getAllData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            while (set.next()){
                b = new Blok8a3();
                 b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB8AK6(isNull(set,3));
                b.setB8AK7(isNull(set,4));
                b.setB8AK8(isNull(set,5));
                b.setB8AK9(isNull(set,6));
                b.setB8AK10(isNull(set,7));
                b.setB8AK11(isNull(set,8));

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

    public void deleteBlok8a3(String NKS) throws SQLException {
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
