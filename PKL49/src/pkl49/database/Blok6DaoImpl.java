/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok6Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok6;

/**
 *
 * @author Ken
 */
public class Blok6DaoImpl implements Blok6Dao{

    protected final String insert ="INSERT IntO Blok6  VALUES (?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?)";
    protected final String update ="UPDATE Blok6 SET B6R1=?,B6R1BTanah=?,B6R2=?,B6R3A=?,B6R3B=?,B6R4=?,B6R5=?,B6R5Lain=?," +
            "B6R6=?,B6R6Lain=?,B6R7=?,B6R8=?,B6R9=?,B6R10=?,B6R11=?,B6R12=?,B6R12Lain=?,B6R13=?,B6R14A=?,B6R14B=?,B6R14C1=?," +
            "B6R14C2=?,B6R14C3=? WHERE NKS=?";
    protected final String delete ="DELETE FROM Blok6 WHERE NKS=?";
    protected final String getData ="SELECT * FROM Blok6 WHERE NKS=?";
    protected final String selectAll ="SELECT * FROM Blok6";
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
    public Blok6DaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok6(Blok6 blok6) throws SQLException {
  
        try{
            pst = connection.prepareStatement(insert);
           pst.setString(1, blok6.getNKS());
        cek(2, blok6.getB6R1());
            cek(3, blok6.getB6R1BTanah());
            cek(4, blok6.getB6R2());
            cek(5, blok6.getB6R3A());
            cek(6, blok6.getB6R3B());
            cek(7, blok6.getB6R4());
            cek(8, blok6.getB6R5());
            cek(9, blok6.getB6R5Lain());
            cek(10, blok6.getB6R6());
            cek(11, blok6.getB6R6Lain());
            cek(12, blok6.getB6R7());
            cek(13, blok6.getB6R8());
            cek(14, blok6.getB6R9());
            cek(15, blok6.getB6R10());
            cek(16, blok6.getB6R11());
            cek(17, blok6.getB6R12());
            cek(18, blok6.getB6R12Lain());
            cek(19, blok6.getB6R13());
            cek(20, blok6.getB6R14A());
            cek(21, blok6.getB6R14B());
            cek(22, blok6.getB6R14C1());
            cek(23, blok6.getB6R14C2());
            cek(24, blok6.getB6R14C3());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok6(Blok6 blok6) throws SQLException {
      try{
            pst = connection.prepareStatement(update);
           cek(1, blok6.getB6R1());
            cek(2, blok6.getB6R1BTanah());
            cek(3, blok6.getB6R2());
            cek(4, blok6.getB6R3A());
            cek(5, blok6.getB6R3B());
            cek(6, blok6.getB6R4());
            cek(7, blok6.getB6R5());
            cek(8, blok6.getB6R5Lain());
            cek(9, blok6.getB6R6());
            cek(10, blok6.getB6R6Lain());
            cek(11, blok6.getB6R7());
            cek(12, blok6.getB6R8());
            cek(13, blok6.getB6R9());
            cek(14, blok6.getB6R10());
            cek(15, blok6.getB6R11());
            cek(16, blok6.getB6R12());
            cek(17, blok6.getB6R12Lain());
            cek(18, blok6.getB6R13());
            cek(19, blok6.getB6R14A());
            cek(20, blok6.getB6R14B());
            cek(21, blok6.getB6R14C1());
            cek(22, blok6.getB6R14C2());
            cek(23, blok6.getB6R14C3());

            pst.setString(24, blok6.getNKS());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok6(String NKS) throws SQLException {
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

    public Blok6 getBlok6(String NKS) throws SQLException {
        Blok6 b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok6();
        b.setNKS(set.getString(1));
            b.setB6R1(isNull(set,2));
            b.setB6R1BTanah(isNull(set, 3));
            b.setB6R2(isNull(set,4));
            b.setB6R3A(isNull(set,5));
            b.setB6R3B(isNull(set,6));
            b.setB6R4(isNull(set,7));
            b.setB6R5(isNull(set,8));
            b.setB6R5Lain(isNull(set,9));
            b.setB6R6(isNull(set,10));
            b.setB6R6Lain(isNull(set,11));
            b.setB6R7(isNull(set,12));
            b.setB6R8(isNull(set,13));
            b.setB6R9(isNull(set,14));
            b.setB6R10(isNull(set,15));
            b.setB6R11(isNull(set,16));
            b.setB6R12(isNull(set,17));
            b.setB6R12Lain(isNull(set, 18));
            b.setB6R13(isNull(set,19));
            b.setB6R14A(isNull(set,20));
            b.setB6R14B(isNull(set,21));
            b.setB6R14C1(isNull(set,22));
            b.setB6R14C2(isNull(set,23));
            b.setB6R14C3(isNull(set,24));


            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok6> selectAllBlok6() throws SQLException {
        List<Blok6> list = new ArrayList<Blok6>();
        Blok6 b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok6();
          b.setNKS(set.getString(1));
            b.setB6R1(isNull(set,2));
            b.setB6R1BTanah(isNull(set, 3));
            b.setB6R2(isNull(set,4));
            b.setB6R3A(isNull(set,5));
            b.setB6R3B(isNull(set,6));
            b.setB6R4(isNull(set,7));
            b.setB6R5(isNull(set,8));
            b.setB6R5Lain(isNull(set, 9));
            b.setB6R6(isNull(set,10));
            b.setB6R6Lain(isNull(set, 11));
            b.setB6R7(isNull(set,12));
            b.setB6R8(isNull(set,13));
            b.setB6R9(isNull(set,14));
            b.setB6R10(isNull(set,15));
            b.setB6R11(isNull(set,16));
            b.setB6R12(isNull(set,17));
            b.setB6R12Lain(isNull(set, 18));
            b.setB6R13(isNull(set,19));
            b.setB6R14A(isNull(set,20));
            b.setB6R14B(isNull(set,21));
            b.setB6R14C1(isNull(set,22));
            b.setB6R14C2(isNull(set,23));
            b.setB6R14C3(isNull(set,24));
            list.add(b);
        }
        return list;

    }


}
