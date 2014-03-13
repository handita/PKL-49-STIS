/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok8a2Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok8a2;

/**
 *
 * @author Ken
 */
public class Blok8a2DaoImpl implements Blok8a2Dao{

    protected final String insert ="INSERT INTO Blok8a2  VALUES (?,?,?,?,?)";
    protected final String update ="UPDATE Blok8a2 SET B8AK3=?,B8AK3Lain=?,B8AK4=?,B8AK12=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok8a2 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok8a2 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok8a2";
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

    public Blok8a2DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok8a2(Blok8a2 Blok8a2) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, Blok8a2.getNKS());
            cek(2, Blok8a2.getB8AK3());
            cek(3, Blok8a2.getB8AK3Lain());
            cek(4, Blok8a2.getB8AK4());
            cek(5, Blok8a2.getB8AK12());


            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok8a2(Blok8a2 Blok8a2) throws SQLException {

      try{
            pst = connection.prepareStatement(update);
           cek(1, Blok8a2.getB8AK3());
           cek(2, Blok8a2.getB8AK3Lain());
           cek(3, Blok8a2.getB8AK4());
           cek(4, Blok8a2.getB8AK12());
           pst.setString(5, Blok8a2.getNKS());
           pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok8a2(String NKS) throws SQLException {
            try{
            pst = connection.prepareStatement(delete);
            pst.setString(1, NKS);
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public Blok8a2 getBlok8a2(String NKS) throws SQLException {
        Blok8a2 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok8a2();
             b.setNKS(set.getString(1));
            b.setB8AK3(isNull(set,2));
            b.setB8AK3Lain(isNull(set, 3));
            b.setB8AK4(isNull(set,4));
            b.setB8AK12(isNull(set,5));


            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok8a2> selectAllBlok8a2() throws SQLException {
        List<Blok8a2> list = new ArrayList<Blok8a2>();
        Blok8a2 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok8a2();
         b.setNKS(set.getString(1));
            b.setB8AK3(isNull(set,2));
            b.setB8AK3Lain(isNull(set, 3));
            b.setB8AK4(isNull(set,4));
            b.setB8AK12(isNull(set,5));
            list.add(b);
        }
        return list;

    }




}
