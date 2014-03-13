/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok5cDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok5c;

/**
 *
 * @author Ken
 */
public class Blok5cDaoImpl implements Blok5cDao{
    protected final String insert ="INSERT INTO Blok5c  VALUES (?,?,?,?,?,?,?)";
    protected final String update ="UPDATE Blok5c SET B5CR19=?,B5CR20=?,B5CR21=?,B5CR22A=?,B5CR22B=?" +
           " WHERE NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok5c WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok5c WHERE NKS=? AND NO_URUT=?";
    protected final String getData ="SELECT * FROM Blok5c WHERE NKS=? AND NO_URT=?";
    protected final String getAllData ="SELECT * FROM Blok5c WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok5c";
    private Connection connection;
    private PreparedStatement pst=null;


    public Blok5cDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok5c(Blok5c blok5c) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, blok5c.getNKS());
            cek(2, blok5c.getNO_URUT());
            cek(3, blok5c.getB5CR19());
            cek(4, blok5c.getB5CR20());
            cek(5, blok5c.getB5CR21());
            cek(6, blok5c.getB5CR22A());
            cek(7, blok5c.getB5CR22B());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok5c(Blok5c blok5c) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
            cek(1, blok5c.getB5CR19());
            cek(2, blok5c.getB5CR20());
            cek(3, blok5c.getB5CR21());
            cek(4, blok5c.getB5CR22A());
            cek(5, blok5c.getB5CR22B());
            pst.setString(6, blok5c.getNKS());
            cek(7, blok5c.getNO_URUT());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok5c(String NKS,int NO_URUT) throws SQLException {
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

    public Blok5c getBlok5c(String NKS,int NO_URUT) throws SQLException {
        Blok5c b = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(getData);
            ps.setString(1, NKS);
            cek(2, NO_URUT);
            ResultSet set = ps.executeQuery();
            if (set.next()){
                b = new Blok5c();
             b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB5CR19(isNull(set,3));
            b.setB5CR20(isNull(set,4));
            b.setB5CR21(isNull(set,5));
            b.setB5CR22A(isNull(set,6));
            b.setB5CR22B(isNull(set,7));
       



            }
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
        return b;
    }

    public List<Blok5c> selectAllBlok5c() throws SQLException {
        List<Blok5c> list = new ArrayList<Blok5c>();
        Blok5c b;
        Statement st = null;
        st = connection.createStatement();
        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok5c();
         b.setNKS(set.getString(1));
            b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB5CR19(isNull(set,3));
            b.setB5CR20(isNull(set,4));
            b.setB5CR21(isNull(set,5));
            b.setB5CR22A(isNull(set,6));
            b.setB5CR22B(isNull(set,7));
         

            list.add(b);
        }
        return list;

    }

    public List<Blok5c> getAllBlok5c(String NKS) throws SQLException {
        List<Blok5c> list = new ArrayList<Blok5c>();
        Blok5c b = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(getAllData);
            ps.setString(1, NKS);
            ResultSet set = ps.executeQuery();
            while (set.next()){
                b = new Blok5c();
                b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB5CR19(isNull(set,3));
                b.setB5CR20(isNull(set,4));
                b.setB5CR21(isNull(set,5));
                b.setB5CR22A(isNull(set,6));
                b.setB5CR22B(isNull(set,7));
                list.add(b);
            }
        }finally{
            if (ps!=null){
                ps.close();
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

    public void deleteBlok5c(String NKS) throws SQLException {
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
