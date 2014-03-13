/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok3Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pkl49.database.entity.Blok3;

/**
 *
 * @author Ken
 */
public class Blok3DaoImpl implements Blok3Dao{

     protected final String insert ="INSERT INTO Blok3  VALUES (?,?,?,?,?)";
    protected final String update ="UPDATE Blok3 SET B3R2=?, B3R3=?, B3R6=?, B3R7=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok3  WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok3 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok3";
    private Connection connection;


    public Blok3DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok3(Blok3 blok3) throws SQLException {
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(insert);
            ps.setString(1, blok3.getNKS());
            ps.setString(2, blok3.getB3R2());
            ps.setString(3, blok3.getB3R3());
            ps.setString(4, blok3.getB3R6());
            ps.setString(5, blok3.getB3R7());
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
    }

    public void updateBlok3(Blok3 blok3) throws SQLException {
        PreparedStatement ps=null;
      try{
            ps = connection.prepareStatement(update);
            ps.setString(1, blok3.getB3R2());
            ps.setString(2, blok3.getB3R3());
            ps.setString(3, blok3.getB3R6());
            ps.setString(4, blok3.getB3R7());
            System.out.println(blok3.getNKS());
            ps.setString(5, blok3.getNKS());
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }

    }

    public void deleteBlok3(String NKS) throws SQLException {
        PreparedStatement ps=null;
            try{
            ps = connection.prepareStatement(delete);
            ps.setString(1, NKS);
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
    }

    public Blok3 getBlok3(String NKS) throws SQLException {
        Blok3 b = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(getData);
            ps.setString(1, NKS);
            ResultSet set = ps.executeQuery();
            if (set.next()){
                b = new Blok3();
             b.setNKS(set.getString(1));
            b.setB3R2(set.getString(2));
            b.setB3R3(set.getString(3));
            b.setB3R6(set.getString(4));
            b.setB3R7(set.getString(5));


            }
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
        return b;
    }

    public List<Blok3> selectAllBlok3() throws SQLException {
        List<Blok3> list = new ArrayList<Blok3>();
        Blok3 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok3();
         b.setNKS(set.getString(1));
        b.setB3R2(set.getString(2));
        b.setB3R3(set.getString(3));
        b.setB3R6(set.getString(4));
        b.setB3R7(set.getString(5));


            list.add(b);
        }
        return list;

    }


}
