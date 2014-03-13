/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok7bDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok7b;

/**
 *
 * @author Ken
 */
public class Blok7bDaoImpl implements Blok7bDao{

     protected final String insert ="INSERT INTO Blok7b  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     protected final String update ="UPDATE Blok7b SET B7BR16A2=?,B7BR16A3=?,B7BR16B2=?,B7BR16B3=?,B7BR16C2=?,B7BR16C3=?,B7BR16D2=?,B7BR16D3=?,B7BR17A2=?," +
             "B7BR17A3=?,B7BR17B2=?,B7BR17B3=?,B7BR17C2=?,B7BR17C3=?,B7BR17D2=?,B7BR17D3=?,B7BR17E2=?,B7BR17E3=?,B7BR18_2=?,B7BR18_3=?,B7BR19_2=?,B7BR19_3=?," +
             "B7BR20A2=?,B7BR20A3=?,B7BR20B2=?,B7BR20B3=?,B7BR20C2=?,B7BR20C3=?,B7BR20D2=?,B7BR20D3=?,B7BR21_2=?,B7BR21_3=?,B7BR22_2=?,B7BR22_3=?,B7BR23=?," +
             "B7BR24=?,B7BR25=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok7b WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok7b WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok7b";
    private Connection connection;
     private PreparedStatement pst=null;

    public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks,nilai);
        }
    }
    public void cekDouble(int indeks,Double nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 8);
        }else{
         pst.setDouble(indeks,nilai);
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
    public Blok7bDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok7b(Blok7b Blok7b) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, Blok7b.getNKS());
            cek(2, Blok7b.getB7BR16A2());
            cek(3, Blok7b.getB7BR16A3());
            cek(4, Blok7b.getB7BR16B2());
            cek(5, Blok7b.getB7BR16B3());
            cek(6, Blok7b.getB7BR16C2());
            cek(7, Blok7b.getB7BR16C3());
            cek(8, Blok7b.getB7BR16D2());
            cek(9, Blok7b.getB7BR16D3());
            cek(10, Blok7b.getB7BR17A2());
            cek(11, Blok7b.getB7BR17A3());
            cek(12, Blok7b.getB7BR17B2());
            cek(13, Blok7b.getB7BR17B3());
            cek(14, Blok7b.getB7BR17C2());
            cek(15, Blok7b.getB7BR17C3());
            cek(16, Blok7b.getB7BR17D2());
            cek(17, Blok7b.getB7BR17D3());
            cek(18, Blok7b.getB7BR17E2());
            cek(19, Blok7b.getB7BR17E3());
            cek(20, Blok7b.getB7BR18_2());
            cek(21, Blok7b.getB7BR18_3());
            cek(22, Blok7b.getB7BR19_2());
            cek(23, Blok7b.getB7BR19_3());
            cek(24, Blok7b.getB7BR20A2());
            cek(25, Blok7b.getB7BR20A3());
            cek(26, Blok7b.getB7BR20B2());
            cek(27, Blok7b.getB7BR20B3());
            cek(28, Blok7b.getB7BR20C2());
            cek(29, Blok7b.getB7BR20C3());
            cek(30, Blok7b.getB7BR20D2());
            cek(31, Blok7b.getB7BR20D3());
            cek(32, Blok7b.getB7BR21_2());
            cek(33, Blok7b.getB7BR21_3());
            cek(34, Blok7b.getB7BR22_2());
            cek(35, Blok7b.getB7BR22_3());
            cekDouble(36, Blok7b.getB7BR23());
            cekDouble(37, Blok7b.getB7BR24());
            cekDouble(38, Blok7b.getB7BR25());
         
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok7b(Blok7b Blok7b) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            cek(1, Blok7b.getB7BR16A2());
            cek(2, Blok7b.getB7BR16A3());
            cek(3, Blok7b.getB7BR16B2());
            cek(4, Blok7b.getB7BR16B3());
            cek(5, Blok7b.getB7BR16C2());
            cek(6, Blok7b.getB7BR16C3());
            cek(7, Blok7b.getB7BR16D2());
            cek(8, Blok7b.getB7BR16D3());
            cek(9, Blok7b.getB7BR17A2());
            cek(10, Blok7b.getB7BR17A3());
            cek(11, Blok7b.getB7BR17B2());
            cek(12, Blok7b.getB7BR17B3());
            cek(13, Blok7b.getB7BR17C2());
            cek(14, Blok7b.getB7BR17C3());
            cek(15, Blok7b.getB7BR17D2());
            cek(16, Blok7b.getB7BR17D3());
            cek(17, Blok7b.getB7BR17E2());
            cek(18, Blok7b.getB7BR17E3());
            cek(19, Blok7b.getB7BR18_2());
            cek(20, Blok7b.getB7BR18_3());
            cek(21, Blok7b.getB7BR19_2());
            cek(22, Blok7b.getB7BR19_3());
            cek(23, Blok7b.getB7BR20A2());
            cek(24, Blok7b.getB7BR20A3());
            cek(25, Blok7b.getB7BR20B2());
            cek(26, Blok7b.getB7BR20B3());
            cek(27, Blok7b.getB7BR20C2());
            cek(28, Blok7b.getB7BR20C3());
            cek(29, Blok7b.getB7BR20D2());
            cek(30, Blok7b.getB7BR20D3());
            cek(31, Blok7b.getB7BR21_2());
            cek(32, Blok7b.getB7BR21_3());
            cek(33, Blok7b.getB7BR22_2());
            cek(34, Blok7b.getB7BR22_3());
          cekDouble(35, Blok7b.getB7BR23());
          cekDouble(36, Blok7b.getB7BR24());
          cekDouble(37, Blok7b.getB7BR25());
            pst.setString(38, Blok7b.getNKS());
             
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok7b(String NKS) throws SQLException {
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

    public Blok7b getBlok7b(String NKS) throws SQLException {
        Blok7b b = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(getData);
            ps.setString(1, NKS);
            ResultSet set = ps.executeQuery();
            if (set.next()){
                b = new Blok7b();
             b.setNKS(set.getString(1));
            b.setB7BR16A2(set.getInt(2));
            b.setB7BR16A3(set.getInt(3));
            b.setB7BR16B2(set.getInt(4));
            b.setB7BR16B3(set.getInt(5));
            b.setB7BR16C2(set.getInt(6));
            b.setB7BR16C3(set.getInt(7));
            b.setB7BR16D2(set.getInt(8));
            b.setB7BR16D3(set.getInt(9));
            b.setB7BR17A2(set.getInt(10));
            b.setB7BR17A3(set.getInt(11));
            b.setB7BR17B2(set.getInt(12));
            b.setB7BR17B3(set.getInt(13));
            b.setB7BR17C2(set.getInt(14));
            b.setB7BR17C3(set.getInt(15));
            b.setB7BR17D2(set.getInt(16));
            b.setB7BR17D3(set.getInt(17));
            b.setB7BR17E2(set.getInt(18));
            b.setB7BR17E3(set.getInt(19));
            b.setB7BR18_2(set.getInt(20));
            b.setB7BR18_3(set.getInt(21));
            b.setB7BR19_2(set.getInt(22));
            b.setB7BR19_3(set.getInt(23));
            b.setB7BR20A2(set.getInt(24));
            b.setB7BR20A3(set.getInt(25));
            b.setB7BR20B2(set.getInt(26));
            b.setB7BR20B3(set.getInt(27));
            b.setB7BR20C2(set.getInt(28));
            b.setB7BR20C3(set.getInt(29));
            b.setB7BR20D2(set.getInt(30));
            b.setB7BR20D3(set.getInt(31));
            b.setB7BR21_2(set.getInt(32));
            b.setB7BR21_3(set.getInt(33));
            b.setB7BR22_2(set.getInt(34));
            b.setB7BR22_3(set.getInt(35));
            b.setB7BR23(set.getDouble(36));
            b.setB7BR24(set.getDouble(37));
            b.setB7BR25(set.getDouble(38));
          

            }
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
        return b;
    }

    public List<Blok7b> selectAllBlok7b() throws SQLException {
        List<Blok7b> list = new ArrayList<Blok7b>();
        Blok7b b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok7b();
         b.setNKS(set.getString(1));
            b.setB7BR16A2(set.getInt(2));
            b.setB7BR16A3(set.getInt(3));
            b.setB7BR16B2(set.getInt(4));
            b.setB7BR16B3(set.getInt(5));
            b.setB7BR16C2(set.getInt(6));
            b.setB7BR16C3(set.getInt(7));
            b.setB7BR16D2(set.getInt(8));
            b.setB7BR16D3(set.getInt(9));
            b.setB7BR17A2(set.getInt(10));
            b.setB7BR17A3(set.getInt(11));
            b.setB7BR17B2(set.getInt(12));
            b.setB7BR17B3(set.getInt(13));
            b.setB7BR17C2(set.getInt(14));
            b.setB7BR17C3(set.getInt(15));
            b.setB7BR17D2(set.getInt(16));
            b.setB7BR17D3(set.getInt(17));
            b.setB7BR17E2(set.getInt(18));
            b.setB7BR17E3(set.getInt(19));
            b.setB7BR18_2(set.getInt(20));
            b.setB7BR18_3(set.getInt(21));
            b.setB7BR19_2(set.getInt(22));
            b.setB7BR19_3(set.getInt(23));
            b.setB7BR20A2(set.getInt(24));
            b.setB7BR20A3(set.getInt(25));
            b.setB7BR20B2(set.getInt(26));
            b.setB7BR20B3(set.getInt(27));
            b.setB7BR20C2(set.getInt(28));
            b.setB7BR20C3(set.getInt(29));
            b.setB7BR20D2(set.getInt(30));
            b.setB7BR20D3(set.getInt(31));
            b.setB7BR21_2(set.getInt(32));
            b.setB7BR21_3(set.getInt(33));
            b.setB7BR22_2(set.getInt(34));
            b.setB7BR22_3(set.getInt(35));
            b.setB7BR23(set.getDouble(36));
            b.setB7BR24(set.getDouble(37));
            b.setB7BR25(set.getDouble(38));
         
            list.add(b);
        }
        return list;

    }


}
