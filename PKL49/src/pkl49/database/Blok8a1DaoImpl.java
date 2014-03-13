/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok8a1Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok8a1;

/**
 *
 * @author Ken
 */
public class Blok8a1DaoImpl implements Blok8a1Dao{

    protected final String insert ="INSERT INTO Blok8a1  VALUES (?,?,?)";
    protected final String update ="UPDATE Blok8a1 SET B8AK2=? WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok8a1 WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok8a1 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok8a1 WHERE NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok8a1 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok8a1";
    private Connection connection;
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

    public Blok8a1DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok8a1(Blok8a1 Blok8a1) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, Blok8a1.getNKS());
            cek(2, Blok8a1.getNO_URUT());
            cek(3, Blok8a1.getB8AK2());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok8a1(Blok8a1 Blok8a1) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
           cek(3, Blok8a1.getNO_URUT());
            cek(1, Blok8a1.getB8AK2());
            pst.setString(2, Blok8a1.getNKS());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok8a1(String NKS,int NO_URUT) throws SQLException {
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

    public Blok8a1 getBlok8a1(String NKS,int NO_URUT) throws SQLException {
        Blok8a1 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, NO_URUT);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok8a1();
            b.setNKS(set.getString(1));
            b.setNO_URUT(set.getInt(2));
            b.setB8AK2(set.getInt(3));

            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok8a1> selectAllBlok8a1() throws SQLException {
        List<Blok8a1> list = new ArrayList<Blok8a1>();
        Blok8a1 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok8a1();
         b.setNKS(set.getString(1));
            b.setNO_URUT(set.getInt(2));
            b.setB8AK2(set.getInt(3));


            list.add(b);
        }
        return list;

    }

    public List<Blok8a1> getAllBlok8a1(String NKS) throws SQLException {
        List<Blok8a1> list = new ArrayList<Blok8a1>();
        Blok8a1 b = null;
        try{
            pst = connection.prepareStatement(getAllData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            while (set.next()){
                b = new Blok8a1();
                b.setNKS(set.getString(1));
                b.setNO_URUT(set.getInt(2));
                b.setB8AK2(set.getInt(3));
                list.add(b);
            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return list;
    }

    public void deleteBlok8a1(String NKS) throws SQLException {
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
