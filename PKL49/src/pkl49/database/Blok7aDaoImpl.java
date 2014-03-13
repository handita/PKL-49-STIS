/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok7aDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok7a;

/**
 *
 * @author Ken
 */
public class Blok7aDaoImpl implements Blok7aDao{

   protected final String insert ="INSERT INTO Blok7a  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok7a SET B7AR1A=?,B7AR1B=?,B7AR2=?,B7AR3A=?,B7AR3B=?,B7AR4=?,B7AR5A=?," +
            "B7AR5B=?,B7AR6=?,B7AR7=?,B7AR8=?,B7AR9=?,B7AR10=?,B7AR11=?,B7AR12A=?,B7AR12B=?,B7AR13A=?,B7AR13B=?,B7AR13C=?," +
            "B7AR14A=?,B7AR14B=?,B7AR15=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok7a WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok7a WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok7a";
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
    public Blok7aDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok7a(Blok7a Blok7a) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, Blok7a.getNKS());
            cek(2, Blok7a.getB7AR1A());
            cek(3, Blok7a.getB7AR1B());
            cek(4, Blok7a.getB7AR2());
            cek(5, Blok7a.getB7AR3A());
            cek(6, Blok7a.getB7AR3B());
            cek(7, Blok7a.getB7AR4());
            cek(8, Blok7a.getB7AR5A());
            cek(9, Blok7a.getB7AR5B());
            cek(10, Blok7a.getB7AR6());
            cek(11, Blok7a.getB7AR7());
            cek(12, Blok7a.getB7AR8());
            cek(13, Blok7a.getB7AR9());
            cek(14, Blok7a.getB7AR10());
            cek(15, Blok7a.getB7AR11());
            cek(16, Blok7a.getB7AR12A());
            cek(17, Blok7a.getB7AR12B());
            cek(18, Blok7a.getB7AR13A());
            cek(19, Blok7a.getB7AR13B());
            cek(20, Blok7a.getB7AR13C());
            cek(21, Blok7a.getB7AR14A());
            cek(22, Blok7a.getB7AR14B());
            cek(23, Blok7a.getB7AR15());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok7a(Blok7a Blok7a) throws SQLException {
         try{
            pst = connection.prepareStatement(update);
           cek(1, Blok7a.getB7AR1A());
            cek(2, Blok7a.getB7AR1B());
            cek(3, Blok7a.getB7AR2());
            cek(4, Blok7a.getB7AR3A());
            cek(5, Blok7a.getB7AR3B());
            cek(6, Blok7a.getB7AR4());
            cek(7, Blok7a.getB7AR5A());
            cek(8, Blok7a.getB7AR5B());
            cek(9, Blok7a.getB7AR6());
            cek(10, Blok7a.getB7AR7());
            cek(11, Blok7a.getB7AR8());
            cek(12, Blok7a.getB7AR9());
            cek(13, Blok7a.getB7AR10());
            cek(14, Blok7a.getB7AR11());
            cek(15, Blok7a.getB7AR12A());
            cek(16, Blok7a.getB7AR12B());
            cek(17, Blok7a.getB7AR13A());
            cek(18, Blok7a.getB7AR13B());
            cek(19, Blok7a.getB7AR13C());
            cek(20, Blok7a.getB7AR14A());
            cek(21, Blok7a.getB7AR14B());
            cek(22, Blok7a.getB7AR15());

            pst.setString(23, Blok7a.getNKS());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok7a(String NKS) throws SQLException {
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

    public Blok7a getBlok7a(String NKS) throws SQLException {
        Blok7a b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok7a();
             b.setNKS(set.getString(1));
            b.setB7AR1A(set.getInt(2));
            b.setB7AR1B(set.getInt(3));
            b.setB7AR2(set.getInt(4));
            b.setB7AR3A(set.getInt(5));
            b.setB7AR3B(set.getInt(6));
            b.setB7AR4(set.getInt(7));
            b.setB7AR5A(set.getInt(8));
            b.setB7AR5B(set.getInt(9));
            b.setB7AR6(set.getInt(10));
            b.setB7AR7(set.getInt(11));
            b.setB7AR8(set.getInt(12));
            b.setB7AR9(set.getInt(13));
            b.setB7AR10(set.getInt(14));
            b.setB7AR11(set.getInt(15));
            b.setB7AR12A(set.getInt(16));
            b.setB7AR12B(set.getInt(17));
            b.setB7AR13A(set.getInt(18));
            b.setB7AR13B(set.getInt(19));
            b.setB7AR13C(set.getInt(20));
            b.setB7AR14A(set.getInt(21));
            b.setB7AR14B(set.getInt(22));
            b.setB7AR15(set.getInt(23));


            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok7a> selectAllBlok7a() throws SQLException {
        List<Blok7a> list = new ArrayList<Blok7a>();
        Blok7a b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok7a();
            b.setNKS(set.getString(1));
            b.setB7AR1A(set.getInt(2));
            b.setB7AR1B(set.getInt(3));
            b.setB7AR2(set.getInt(4));
            b.setB7AR3A(set.getInt(5));
            b.setB7AR3B(set.getInt(6));
            b.setB7AR4(set.getInt(7));
            b.setB7AR5A(set.getInt(8));
            b.setB7AR5B(set.getInt(9));
            b.setB7AR6(set.getInt(10));
            b.setB7AR7(set.getInt(11));
            b.setB7AR8(set.getInt(12));
            b.setB7AR9(set.getInt(13));
            b.setB7AR10(set.getInt(14));
            b.setB7AR11(set.getInt(15));
            b.setB7AR12A(set.getInt(16));
            b.setB7AR12B(set.getInt(17));
            b.setB7AR13A(set.getInt(18));
            b.setB7AR13B(set.getInt(19));
            b.setB7AR13C(set.getInt(20));
            b.setB7AR14A(set.getInt(21));
            b.setB7AR14B(set.getInt(22));
            b.setB7AR15(set.getInt(23));

            list.add(b);
        }
        return list;

    }


}
