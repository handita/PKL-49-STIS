/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok5aDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok5a;

/**
 *
 * @author Ken
 */
public class Blok5aDaoImpl implements Blok5aDao{

    protected final String insert ="INSERT INTO Blok5a  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok5a SET B5R1A=?,B5R2=?,B5R3=?,B5R4A1=?,B5R4A2=?,B5R4B=?,B5R4BLain=?," +
            "B5R5=?,B5AR6A=?,B5AR6B=?,B5AR6C=?,B5AR6D=?,B5AR6E=?,B5AR6F=?,B5AR6G=?,B5AR6H=?,B5AR6HLain=?,B5AR7=?,B5AR8=?," +
            "B5AR9A=?,B5AR9B1=?,B5AR9B2=?,B5AR9B3=?,B5AR9B3Lain=?,B5AR10=?,B5AR11A=?,B5AR11B=?,B5AR11C=?,B5AR11D=?,B5AR11E=?," +
            "B5AR11F=?,B5AR11G=?,B5AR11H=?,B5AR11Lain=?,B5AR12=?,B5AR13A=?,B5AR13B=?,B5AR13C=?,B5AR13D=?,B5AR13E=?,B5AR13F=?," +
            "B5AR13Lain=? WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok5a WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok5a WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok5a WHERE  NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok5a WHERE  NKS=?";
    protected final String selectAll ="SELECT * FROM Blok5a";
    private Connection connection;
    private PreparedStatement pst=null;

    public Blok5aDaoImpl(Connection connection) {
        this.connection = connection;
    }

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
    

    public void insertBlok5a(Blok5a blok5a) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, blok5a.getNKS());
            cek(2, blok5a.getB5R1A());
            cek(3, blok5a.getNO_URUT());
            cek(4, blok5a.getB5R2());
            cek(5, blok5a.getB5R3());
            pst.setString(6, blok5a.getB5R4A1());
            cek(7, blok5a.getB5R4A2());
            cek(8, blok5a.getB5R4B());
            cek(9, blok5a.getB5R4BLain());
            cek(10, blok5a.getB5R5());
            cek(11, blok5a.getB5AR6A());
            cek(12, blok5a.getB5AR6B());
            cek(13, blok5a.getB5AR6C());
            cek(14, blok5a.getB5AR6D());
            cek(15, blok5a.getB5AR6E());
            cek(16, blok5a.getB5AR6F());
            cek(17, blok5a.getB5AR6G());
            cek(18, blok5a.getB5AR6H());
            cek(19, blok5a.getB5AR6HLain());
            cek(20, blok5a.getB5AR7());
            cek(21, blok5a.getB5AR8());
            cek(22, blok5a.getB5AR9A());
            cek(23, blok5a.getB5AR9B1());
            cek(24, blok5a.getB5AR9B2());
            cek(25, blok5a.getB5AR9B3());
            cek(26, blok5a.getB5AR9B3Lain());
            cek(27, blok5a.getB5AR10());
            cek(28, blok5a.getB5AR11A());
            cek(29, blok5a.getB5AR11B());
            cek(30, blok5a.getB5AR11C());
            cek(31, blok5a.getB5AR11D());
            cek(32, blok5a.getB5AR11E());
            cek(33, blok5a.getB5AR11F());
            cek(34, blok5a.getB5AR11G());
            cek(35, blok5a.getB5AR11H());
            cek(36, blok5a.getB5AR11Lain());
            cek(37, blok5a.getB5AR12());
            cek(38, blok5a.getB5AR13A());
            cek(39, blok5a.getB5AR13B());
            cek(40, blok5a.getB5AR13C());
            cek(41, blok5a.getB5AR13D());
            cek(42, blok5a.getB5AR13E());
            cek(43, blok5a.getB5AR13F());
            cek(44, blok5a.getB5AR13Lain());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok5a(Blok5a blok5a) throws SQLException {
      try{
            pst=null;
            pst = connection.prepareStatement(update);
            pst.setString(1, blok5a.getNKS());
            cek(2, blok5a.getB5R1A());
            cek(3, blok5a.getNO_URUT());
            cek(4, blok5a.getB5R2());
            cek(5, blok5a.getB5R3());
            pst.setString(6, blok5a.getB5R4A1());
            cek(7, blok5a.getB5R4A2());
            cek(8, blok5a.getB5R4B());
            cek(9, blok5a.getB5R4BLain());
            cek(10, blok5a.getB5R5());
            cek(11, blok5a.getB5AR6A());
            cek(12, blok5a.getB5AR6B());
            cek(13, blok5a.getB5AR6C());
            cek(14, blok5a.getB5AR6D());
            cek(15, blok5a.getB5AR6E());
            cek(16, blok5a.getB5AR6F());
            cek(17, blok5a.getB5AR6G());
            cek(18, blok5a.getB5AR6H());
            cek(19, blok5a.getB5AR6HLain());
            cek(20, blok5a.getB5AR7());
            cek(21, blok5a.getB5AR8());
            cek(22, blok5a.getB5AR9A());
            cek(23, blok5a.getB5AR9B1());
            cek(24, blok5a.getB5AR9B2());
            cek(25, blok5a.getB5AR9B3());
            cek(26, blok5a.getB5AR9B3Lain());
            cek(27, blok5a.getB5AR10());
            cek(28, blok5a.getB5AR11A());
            cek(29, blok5a.getB5AR11B());
            cek(30, blok5a.getB5AR11C());
            cek(31, blok5a.getB5AR11D());
            cek(32, blok5a.getB5AR11E());
            cek(33, blok5a.getB5AR11F());
            cek(34, blok5a.getB5AR11G());
            cek(35, blok5a.getB5AR11H());
            cek(36, blok5a.getB5AR11Lain());
            cek(37, blok5a.getB5AR12());
            cek(38, blok5a.getB5AR13A());
            cek(39, blok5a.getB5AR13B());
            cek(40, blok5a.getB5AR13C());
            cek(41, blok5a.getB5AR13D());
            cek(42, blok5a.getB5AR13E());
            cek(43, blok5a.getB5AR13F());
            cek(44, blok5a.getB5AR13Lain());
            pst.setString(1, blok5a.getNKS());
            cek(3, blok5a.getNO_URUT());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok5a(String NKS,int NO_URUT) throws SQLException {
        PreparedStatement ps=null;
            try{
            ps = connection.prepareStatement(delete);
            ps.setString(1, NKS);
            cek(2, NO_URUT);
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
    }

    public Blok5a getBlok5a(String NKS,int NO_URUT) throws SQLException {
        Blok5a b = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(getData);
            ps.setString(1, NKS);
            ps.setInt(2, NO_URUT);
            ResultSet set = ps.executeQuery();
            if (set.next()){
                b = new Blok5a();
                 b.setNKS(set.getString(1));
                b.setB5R1A(isNull(set,2));
                b.setNO_URUT(isNull(set,3));
                b.setB5R2(set.getInt(4));
                b.setB5R3(isNull(set,5));
                b.setB5R4A1(set.getString(6));
                b.setB5R4A2(isNull(set,7));
                b.setB5R4B(isNull(set,8));
                b.setB5R4BLain(isNull(set,9));
                b.setB5R5(isNull(set,10));
                b.setB5AR6A(isNull(set,11));
                b.setB5AR6B(isNull(set,12));
                b.setB5AR6C(isNull(set,13));
                b.setB5AR6D(isNull(set,14));
                b.setB5AR6E(isNull(set,15));
                b.setB5AR6F(isNull(set,16));
                b.setB5AR6G(isNull(set,17));
                b.setB5AR6H(isNull(set,18));
                b.setB5AR6HLain(isNull(set, 19));
                b.setB5AR7(isNull(set,20));
                b.setB5AR8(isNull(set,21));
                b.setB5AR9A(isNull(set,22));
                b.setB5AR9B1(isNull(set,23));
                b.setB5AR9B2(isNull(set,24));
                b.setB5AR9B3(isNull(set,25));
                b.setB5AR9B3Lain(isNull(set, 26));
                b.setB5AR10(isNull(set,27));
                b.setB5AR11A(isNull(set,28));
                b.setB5AR11B(isNull(set,29));
                b.setB5AR11C(isNull(set,30));
                b.setB5AR11D(isNull(set,31));
                b.setB5AR11E(isNull(set,32));
                b.setB5AR11F(isNull(set,33));
                b.setB5AR11G(isNull(set,34));
                b.setB5AR11H(isNull(set,35));
                b.setB5AR11Lain(isNull(set, 36));
                b.setB5AR12(isNull(set,37));
                b.setB5AR13A(isNull(set,38));
                b.setB5AR13B(isNull(set,39));
                b.setB5AR13C(isNull(set,40));
                b.setB5AR13D(isNull(set,41));
                b.setB5AR13E(isNull(set,42));
                b.setB5AR13F(isNull(set,43));
                b.setB5AR13Lain(isNull(set, 44));
            }
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
        return b;
    }

    public List<Blok5a> selectAllBlok5a() throws SQLException {
        List<Blok5a> list = new ArrayList<Blok5a>();
        Blok5a b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok5a();
       b.setNKS(set.getString(1));
            b.setB5R1A(isNull(set,2));
            b.setNO_URUT(isNull(set,3));
            b.setB5R2(set.getInt(4));
            b.setB5R3(isNull(set,5));
            b.setB5R4A1(set.getString(6));
            b.setB5R4A2(isNull(set,7));
            b.setB5R4B(isNull(set,8));
            b.setB5R4BLain(isNull(set,9));
            b.setB5R5(isNull(set,10));
            b.setB5AR6A(isNull(set,11));
            b.setB5AR6B(isNull(set,12));
            b.setB5AR6C(isNull(set,13));
            b.setB5AR6D(isNull(set,14));
            b.setB5AR6E(isNull(set,15));
            b.setB5AR6F(isNull(set,16));
            b.setB5AR6G(isNull(set,17));
            b.setB5AR6H(isNull(set,18));
            b.setB5AR6HLain(isNull(set, 19));
            b.setB5AR7(isNull(set,20));
            b.setB5AR8(isNull(set,21));
            b.setB5AR9A(isNull(set,22));
            b.setB5AR9B1(isNull(set,23));
            b.setB5AR9B2(isNull(set,24));
            b.setB5AR9B3(isNull(set,25));
            b.setB5AR9B3Lain(isNull(set, 26));
            b.setB5AR10(isNull(set,27));
            b.setB5AR11A(isNull(set,28));
            b.setB5AR11B(isNull(set,29));
            b.setB5AR11C(isNull(set,30));
            b.setB5AR11D(isNull(set,31));
            b.setB5AR11E(isNull(set,32));
            b.setB5AR11F(isNull(set,33));
            b.setB5AR11G(isNull(set,34));
            b.setB5AR11H(isNull(set,35));
            b.setB5AR11Lain(isNull(set, 36));
            b.setB5AR12(isNull(set,37));
            b.setB5AR13A(isNull(set,38));
            b.setB5AR13B(isNull(set,39));
            b.setB5AR13C(isNull(set,40));
            b.setB5AR13D(isNull(set,41));
            b.setB5AR13E(isNull(set,42));
            b.setB5AR13F(isNull(set,43));
            b.setB5AR13Lain(isNull(set, 44));
            list.add(b);
        }
        return list;

    }

    public List<Blok5a> getAllBlok5a(String NKS) throws SQLException {
        List<Blok5a> list = new ArrayList<Blok5a>();
        PreparedStatement ps = null;
        Blok5a b;
            ps = connection.prepareStatement(getAllData);
            ps.setString(1, NKS);
            ResultSet set = ps.executeQuery();
        while(set.next()){
            b = new Blok5a();
           b.setNKS(set.getString(1));
            b.setB5R1A(isNull(set,2));
            b.setNO_URUT(isNull(set,3));
            b.setB5R2(set.getInt(4));
            b.setB5R3(isNull(set,5));
            b.setB5R4A1(set.getString(6));
            b.setB5R4A2(isNull(set,7));
            b.setB5R4B(isNull(set,8));
            b.setB5R4BLain(isNull(set,9));
            b.setB5R5(isNull(set,10));
            b.setB5AR6A(isNull(set,11));
            b.setB5AR6B(isNull(set,12));
            b.setB5AR6C(isNull(set,13));
            b.setB5AR6D(isNull(set,14));
            b.setB5AR6E(isNull(set,15));
            b.setB5AR6F(isNull(set,16));
            b.setB5AR6G(isNull(set,17));
            b.setB5AR6H(isNull(set,18));
            b.setB5AR6HLain(isNull(set, 19));
            b.setB5AR7(isNull(set,20));
            b.setB5AR8(isNull(set,21));
            b.setB5AR9A(isNull(set,22));
            b.setB5AR9B1(isNull(set,23));
            b.setB5AR9B2(isNull(set,24));
            b.setB5AR9B3(isNull(set,25));
            b.setB5AR9B3Lain(isNull(set, 26));
            b.setB5AR10(isNull(set,27));
            b.setB5AR11A(isNull(set,28));
            b.setB5AR11B(isNull(set,29));
            b.setB5AR11C(isNull(set,30));
            b.setB5AR11D(isNull(set,31));
            b.setB5AR11E(isNull(set,32));
            b.setB5AR11F(isNull(set,33));
            b.setB5AR11G(isNull(set,34));
            b.setB5AR11H(isNull(set,35));
            b.setB5AR11Lain(isNull(set, 36));
            b.setB5AR12(isNull(set,37));
            b.setB5AR13A(isNull(set,38));
            b.setB5AR13B(isNull(set,39));
            b.setB5AR13C(isNull(set,40));
            b.setB5AR13D(isNull(set,41));
            b.setB5AR13E(isNull(set,42));
            b.setB5AR13F(isNull(set,43));
            b.setB5AR13Lain(isNull(set, 44));
            list.add(b);
        }
            return list;

    }

    public void deleteBlok5a(String NKS) throws SQLException {
        PreparedStatement ps=null;
            try{
            ps = connection.prepareStatement(deleteAll);
            ps.setString(1, NKS);
            ps.executeUpdate();
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
    }
}
