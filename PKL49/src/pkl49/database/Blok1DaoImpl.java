/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import pkl49.database.dao.Blok1Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pkl49.database.entity.Blok1;

/**
 *
 * @author Ken
 */
public class Blok1DaoImpl implements Blok1Dao{
    protected final String insert ="INSERT INTO blok1  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok1 SET B1R1=?,B1R3=?,B1R4=?,B1R5=?,B1R6=?,B1R7=?,B1R8=?,B1R9=?,B3R2=?,B3R3=?,B3R7=?,Pengentri=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok1 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok1 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok1";
    private Connection connection;


    public Blok1DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok1(Blok1 blok1) throws SQLException {
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(insert);
            ps.setString(1, blok1.getNKS());
            ps.setString(2, blok1.getB1R1());
            ps.setString(3, blok1.getB1R3());
            ps.setString(4, blok1.getB1R4());
            ps.setString(5, blok1.getB1R5());
            ps.setString(6, blok1.getB1R6());
            ps.setString(7, blok1.getB1R7());
            ps.setString(8, blok1.getB1R8());
            ps.setString(9, blok1.getB1R9());
            ps.setString(10, blok1.getB3R2());
            ps.setString(11, blok1.getB3R3());
            ps.setString(12, blok1.getB3R7());
            ps.setString(13, blok1.getPengentri());
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
    }

    public void updateBlok1(Blok1 blok1) throws SQLException {
        PreparedStatement ps=null;
      try{
            ps = connection.prepareStatement(update);
            ps.setString(1, blok1.getB1R1());
            ps.setString(2, blok1.getB1R3());
            ps.setString(3, blok1.getB1R4());
            ps.setString(4, blok1.getB1R5());
            ps.setString(5, blok1.getB1R6());
            ps.setString(6, blok1.getB1R7());
            ps.setString(7, blok1.getB1R8());
            ps.setString(8, blok1.getB1R9());
            ps.setString(9, blok1.getB3R2());
            ps.setString(10, blok1.getB3R3());
            ps.setString(11, blok1.getB3R7());
            ps.setString(12, blok1.getPengentri());
            ps.setString(13, blok1.getNKS());
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }

    }

    public void deleteBlok1(String NKS) throws SQLException {
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

    public Blok1 getBlok1(String NKS) throws SQLException {
        Blok1 b = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(getData);
            ps.setString(1, NKS);
            ResultSet set = ps.executeQuery();
            if (set.next()){
                b = new Blok1();
                b.setNKS(set.getString(1));
                b.setB1R1(set.getString(2));
                b.setB1R3(set.getString(3));
                b.setB1R4(set.getString(4));
                b.setB1R5(set.getString(5));
                b.setB1R6(set.getString(6));
                b.setB1R7(set.getString(7));
                b.setB1R8(set.getString(8));
                b.setB1R9(set.getString(9));
                b.setB3R2(set.getString(10));
                b.setB3R3(set.getString(11));
                b.setB3R7(set.getString(12));
                b.setPengentri(set.getString(13));
            }
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
        return b;
    }

    public List<Blok1> selectAllBlok1() throws SQLException {
        List<Blok1> list = new ArrayList<Blok1>();
        Blok1 b;
        Statement st = null;
        st = connection.createStatement();
        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok1();
            b.setNKS(set.getString(1));
            b.setB1R1(set.getString(2));
            b.setB1R3(set.getString(3));
            b.setB1R4(set.getString(4));
            b.setB1R5(set.getString(5));
            b.setB1R6(set.getString(6));
            b.setB1R7(set.getString(7));
            b.setB1R8(set.getString(8));
            b.setB1R9(set.getString(9));
            b.setB3R2(set.getString(10));
            b.setB3R3(set.getString(11));
            b.setB3R7(set.getString(12));
            b.setPengentri(set.getString(13));
            list.add(b);
        }
        return list;

    }

}
