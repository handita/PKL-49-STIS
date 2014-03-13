/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok2Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok2;

/**
 *
 * @author Ken
 */
public class Blok2DaoImpl implements Blok2Dao{
   protected final String insert ="INSERT INTO blok2  VALUES (?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok2 SET B2R1=?,B2R2=?,B2R3=?,B2R4=?,B2R5=?,B2R6=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok2 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok2 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok2";
    private Connection connection;
    private PreparedStatement pst=null;

     public Blok2DaoImpl(Connection connection) {
        this.connection = connection;
    }
    public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks, nilai);
        }
    }
    public void insertBlok2(Blok2   blok2) throws SQLException {
        try{
           pst =  connection.prepareStatement(insert);
           pst.setString(1, blok2.getNKS());
           cek(2, blok2.getB2R1());
           cek(3, blok2.getB2R2());
           cek(4, blok2.getB2R3());
           cek(5, blok2.getB2R4());
           cek(6, blok2.getB2R5());
           cek(7, blok2.getB2R6());
           pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok2(Blok2 blok2) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            cek(1, blok2.getB2R1());
            cek(2, blok2.getB2R2());
            cek(3, blok2.getB2R3());
            cek(4, blok2.getB2R4());
            cek(5, blok2.getB2R5());
            cek(6, blok2.getB2R6());
            pst.setString(7, blok2.getNKS());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok2(String NKS) throws SQLException {
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

    public Blok2 getBlok2(String NKS) throws SQLException {
        Blok2 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok2();
                b.setNKS(set.getString(1));
                b.setB2R1(set.getInt(2));
                b.setB2R2(set.getInt(3));
                b.setB2R3(set.getInt(4));
                b.setB2R4(set.getInt(5));
                b.setB2R5(set.getInt(6));
                b.setB2R6(set.getInt(7));

            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok2> selectAllBlok2() throws SQLException {
        List<Blok2> list = new ArrayList<Blok2>();
        Blok2 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok2();
         b.setNKS(set.getString(1));
        b.setB2R1(set.getInt(2));
        b.setB2R2(set.getInt(3));
        b.setB2R3(set.getInt(4));
        b.setB2R4(set.getInt(5));
        b.setB2R5(set.getInt(6));


            list.add(b);
        }
        return list;

    }


}
