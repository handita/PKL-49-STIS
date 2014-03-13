/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok8cDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok8c;

/**
 *
 * @author Ken
 */
public class Blok8cDaoImpl implements Blok8cDao{

    protected final String insert ="INSERT INTO Blok8c  VALUES (?,?,?,?,?,?,?,?,?,?," +
             "?,?,?,?,?,?,?,?,?,?,?)" ;
    protected final String update ="UPDATE Blok8c SET NO_URUTBAYI=?,B8CR1=?,B8CR2=?,B8CR3=?,B8CR4=?,B8CR5=?,B8CR6=?,B8CR7=?,B8CR8=?,B8CR9=?,B8CR10=?,B8CR11=?,B8CR12=?,B8CR13=?,B8CR14=?,B8CR15=?,B8CR16=?,B8CR17=?,B8CR18=? WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok8c WHERE NKS=?  AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok8c WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok8c WHERE NKS=?  AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok8c WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok8c";
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
    public Blok8cDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok8c(Blok8c Blok8c) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, Blok8c.getNKS());
            cek(2, Blok8c.getNO_URUT());
            cek(3, Blok8c.getNO_URUTBAYI());
            cek(4, Blok8c.getB8CR1());
            cek(5, Blok8c.getB8CR2());
            cek(6, Blok8c.getB8CR3());
            cek(7, Blok8c.getB8CR4());
            cek(8, Blok8c.getB8CR5());
            cek(9, Blok8c.getB8CR6());
            cek(10, Blok8c.getB8CR7());
            cek(11, Blok8c.getB8CR8());
            cek(12, Blok8c.getB8CR9());
            cek(13, Blok8c.getB8CR10());
            cek(14, Blok8c.getB8CR11());
            cek(15, Blok8c.getB8CR12());
            cek(16, Blok8c.getB8CR13());
            cek(17, Blok8c.getB8CR14());
            cek(18, Blok8c.getB8CR15());
            cek(19, Blok8c.getB8CR16());
            cek(20, Blok8c.getB8CR17());
            cek(21, Blok8c.getB8CR18());
       


            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok8c(Blok8c Blok8c) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
           cek(1, Blok8c.getNO_URUTBAYI());
            cek(2, Blok8c.getB8CR1());
            cek(3, Blok8c.getB8CR2());
            cek(4, Blok8c.getB8CR3());
            cek(5, Blok8c.getB8CR4());
            cek(6, Blok8c.getB8CR5());
            cek(7, Blok8c.getB8CR6());
            cek(8, Blok8c.getB8CR7());
            cek(9, Blok8c.getB8CR8());
            cek(10, Blok8c.getB8CR9());
            cek(11, Blok8c.getB8CR10());
            cek(12, Blok8c.getB8CR11());
            cek(13, Blok8c.getB8CR12());
            cek(14, Blok8c.getB8CR13());
            cek(15, Blok8c.getB8CR14());
            cek(16, Blok8c.getB8CR15());
            cek(17, Blok8c.getB8CR16());
            cek(18, Blok8c.getB8CR17());
            cek(19, Blok8c.getB8CR18());
       

            pst.setString(20, Blok8c.getNKS());
            cek(21, Blok8c.getNO_URUT());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok8c(String NKS,int NO_URUT) throws SQLException {
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

    public Blok8c getBlok8c(String NKS,int no_urut) throws SQLException {
        Blok8c b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, no_urut);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok8c();
            b.setNKS(set.getString(1));
            b.setNO_URUT(set.getInt(2));
            b.setNO_URUTBAYI(set.getInt(3));
            b.setB8CR1(set.getInt(4));
            b.setB8CR2(set.getInt(5));
            b.setB8CR3(set.getInt(6));
            b.setB8CR4(set.getInt(7));
            b.setB8CR5(set.getInt(8));
            b.setB8CR6(set.getInt(9));
            b.setB8CR7(set.getInt(10));
            b.setB8CR8(set.getInt(11));
            b.setB8CR9(set.getInt(12));
            b.setB8CR10(set.getInt(13));
            b.setB8CR11(set.getInt(14));
            b.setB8CR12(set.getInt(15));
            b.setB8CR13(set.getInt(16));
            b.setB8CR14(set.getInt(17));
            b.setB8CR15(set.getInt(18));
            b.setB8CR16(set.getInt(19));
            b.setB8CR17(set.getInt(20));
            b.setB8CR18(set.getInt(21));
         
            }

        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok8c> selectAllBlok8c() throws SQLException {
        List<Blok8c> list = new ArrayList<Blok8c>();
        Blok8c b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok8c();
          b.setNKS(set.getString(1));
            b.setNO_URUT(set.getInt(2));
            b.setNO_URUTBAYI(set.getInt(3));
            b.setB8CR1(set.getInt(4));
            b.setB8CR2(set.getInt(5));
            b.setB8CR3(set.getInt(6));
            b.setB8CR4(set.getInt(7));
            b.setB8CR5(set.getInt(8));
            b.setB8CR6(set.getInt(9));
            b.setB8CR7(set.getInt(10));
            b.setB8CR8(set.getInt(11));
            b.setB8CR9(set.getInt(12));
            b.setB8CR10(set.getInt(13));
            b.setB8CR11(set.getInt(14));
            b.setB8CR12(set.getInt(15));
            b.setB8CR13(set.getInt(16));
            b.setB8CR14(set.getInt(17));
            b.setB8CR15(set.getInt(18));
            b.setB8CR16(set.getInt(19));
            b.setB8CR17(set.getInt(20));
            b.setB8CR18(set.getInt(21));
         


            list.add(b);
        }
        return list;

    }

    public List<Blok8c> getAllBlok8c(String NKS) throws SQLException {
        List<Blok8c> list = new ArrayList<Blok8c>();
        Blok8c b = null;
        try{
            pst = connection.prepareStatement(getAllData);
            pst.setString(1, NKS);

            ResultSet set = pst.executeQuery();
            while (set.next()){
                b = new Blok8c();
                b.setNKS(set.getString(1));
                b.setNO_URUT(set.getInt(2));
                b.setNO_URUTBAYI(set.getInt(3));
                b.setB8CR1(set.getInt(4));
                b.setB8CR2(set.getInt(5));
                b.setB8CR3(set.getInt(6));
                b.setB8CR4(set.getInt(7));
                b.setB8CR5(set.getInt(8));
                b.setB8CR6(set.getInt(9));
                b.setB8CR7(set.getInt(10));
                b.setB8CR8(set.getInt(11));
                b.setB8CR9(set.getInt(12));
                b.setB8CR10(set.getInt(13));
                b.setB8CR11(set.getInt(14));
                b.setB8CR12(set.getInt(15));
                b.setB8CR13(set.getInt(16));
                b.setB8CR14(set.getInt(17));
                b.setB8CR15(set.getInt(18));
                b.setB8CR16(set.getInt(19));
                b.setB8CR17(set.getInt(20));
                b.setB8CR18(set.getInt(21));
                list.add(b);
            }

        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return list;

    }

    public void deleteBlok8c(String NKS) throws SQLException {
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
