/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;


import pkl49.database.dao.Blok5deDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.database.entity.Blok5de;

/**
 *
 * @author Ken
 */
public class Blok5deDaoImpl implements Blok5deDao{
   protected final String insert ="INSERT INTO Blok5de  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     protected final String update ="UPDATE Blok5de SET B5DR23_1=?,B5DR23_2=?,B5DR23_3=?,B5DR23_4=?,B5DR23_5=?,B5DR23Lain=?,B5DR24=?,B5DR25=?,B5DR25Lengkap=?," +
             "B5DR26a=?,B5DR26b=?,B5DR26c=?,B5DR26d=?,B5DR27A=?,B5DR27ALS=?,B5DR27B=?,B5DR27BLain=?,B5DR27C=?,B5DR27D=?,B5DR27E1=?,B5DR27E2=?,B5DR27E3=?,B5DR27E4=?,B5DR27E5=?,B5DR27E5Lain=?," +
             "B5DR28=?,B5DR28Lain=?,B5DR29A=?,B5DR29ALS=?,B5DR29B1=?,B5DR29B2=?,B5DR29B3=?,B5DR29B4=?,B5DR29BLain=?,B5ER30A=?,B5ER30ALS=?,B5ER30B=?,B5ER30C1=?,B5ER30C2=?,B5ER30C3=?" +
             " WHERE NKS=? AND NO_URUT=?";
    protected final String delete ="DELETE FROM Blok5de WHERE  NKS=? AND NO_URUT=?";
    protected final String deleteAll ="DELETE FROM Blok5de WHERE  NKS=?";
    protected final String getData ="SELECT * FROM Blok5de WHERE  NKS=? AND NO_URUT=?";
    protected final String getAllData ="SELECT * FROM Blok5de WHERE  NKS=?";
    protected final String selectAll ="SELECT * FROM Blok5de";
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
    public Blok5deDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public void insertBlok5de(Blok5de Blok5de) throws SQLException {
        try{
            pst = connection.prepareStatement(insert);
              pst.setString(1, Blok5de.getNKS());
            cek(2, Blok5de.getNO_URUT());
            cek(3, Blok5de.getB5DR23_1());
            cek(4, Blok5de.getB5DR23_2());
            cek(5, Blok5de.getB5DR23_3());
            cek(6, Blok5de.getB5DR23_4());
            cek(7, Blok5de.getB5DR23_5());
            cek(8, Blok5de.getB5DR23Lain());
            cek(9, Blok5de.getB5DR24());
            cek(10, Blok5de.getB5DR25());
            pst.setString(11, Blok5de.getB5DR25Lengkap());
            cek(12, Blok5de.getB5DR26a());
            cek(13, Blok5de.getB5DR26b());
            cek(14, Blok5de.getB5DR26c());
            cek(15, Blok5de.getB5DR26d());
            cek(16, Blok5de.getB5DR27A());
            cek(17, Blok5de.getB5DR27ALS());
            cek(18, Blok5de.getB5DR27B());
            cek(19, Blok5de.getB5DR27BLain());
            cek(20, Blok5de.getB5DR27C());
            cek(21, Blok5de.getB5DR27D());
            cek(22, Blok5de.getB5DR27E1());
            cek(23, Blok5de.getB5DR27E2());
            cek(24, Blok5de.getB5DR27E3());
            cek(25, Blok5de.getB5DR27E4());
            cek(26, Blok5de.getB5DR27E5());
            cek(27, Blok5de.getB5DR27E5Lain());
            cek(28, Blok5de.getB5DR28());
            cek(29, Blok5de.getB5DR28Lain());
            cek(30, Blok5de.getB5DR29A());
            cek(31, Blok5de.getB5DR29ALS());
            cek(32, Blok5de.getB5DR29B1());
            cek(33, Blok5de.getB5DR29B2());
            cek(34, Blok5de.getB5DR29B3());
            cek(35, Blok5de.getB5DR29B4());
            cek(36, Blok5de.getB5DR29BLain());
            cek(37, Blok5de.getB5ER30A());
            cek(38, Blok5de.getB5ER30ALS());
            cek(39, Blok5de.getB5ER30B());
            pst.setString(40, Blok5de.getB5ER30C1());
            pst.setString(41, Blok5de.getB5ER30C2());
            pst.setString(42, Blok5de.getB5ER30C3());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updateBlok5de(Blok5de Blok5de) throws SQLException {
      try{
            pst = connection.prepareStatement(update);

            cek(1, Blok5de.getB5DR23_1());
            cek(2, Blok5de.getB5DR23_2());
            cek(3, Blok5de.getB5DR23_3());
            cek(4, Blok5de.getB5DR23_4());
            cek(5, Blok5de.getB5DR23_5());
            cek(6, Blok5de.getB5DR23Lain());
            cek(7, Blok5de.getB5DR24());
            cek(8, Blok5de.getB5DR25());
            pst.setString(9, Blok5de.getB5DR25Lengkap());
            cek(10, Blok5de.getB5DR26a());
            cek(11, Blok5de.getB5DR26b());
            cek(12, Blok5de.getB5DR26c());
            cek(13, Blok5de.getB5DR26d());
            cek(14, Blok5de.getB5DR27A());
            cek(15, Blok5de.getB5DR27ALS());
            cek(16, Blok5de.getB5DR27B());
            cek(17, Blok5de.getB5DR27BLain());
            cek(18, Blok5de.getB5DR27C());
            cek(19, Blok5de.getB5DR27D());
            cek(20, Blok5de.getB5DR27E1());
            cek(21, Blok5de.getB5DR27E2());
            cek(22, Blok5de.getB5DR27E3());
            cek(23, Blok5de.getB5DR27E4());
            cek(24, Blok5de.getB5DR27E5());
            cek(25, Blok5de.getB5DR27E5Lain());
            cek(26, Blok5de.getB5DR28());
            cek(27, Blok5de.getB5DR28Lain());
            cek(28, Blok5de.getB5DR29A());
            cek(29, Blok5de.getB5DR29ALS());
            cek(30, Blok5de.getB5DR29B1());
            cek(31, Blok5de.getB5DR29B2());
            cek(32, Blok5de.getB5DR29B3());
            cek(33, Blok5de.getB5DR29B4());
            cek(34, Blok5de.getB5DR29BLain());
            cek(35, Blok5de.getB5ER30A());
            cek(36, Blok5de.getB5ER30ALS());
            cek(37, Blok5de.getB5ER30B());
            pst.setString(38, Blok5de.getB5ER30C1());
            pst.setString(39, Blok5de.getB5ER30C2());
            pst.setString(40, Blok5de.getB5ER30C3());
            pst.setString(41, Blok5de.getNKS());
            cek(42, Blok5de.getNO_URUT());

            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deleteBlok5de(String NKS,int NO_URUT) throws SQLException {
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

    public Blok5de getBlok5de(String NKS,int NO_URUT) throws SQLException {
        Blok5de b = null;
        try{
            pst = connection.prepareStatement(getData);
            pst.setString(1, NKS);
            cek(2, NO_URUT);
            ResultSet set = pst.executeQuery();
            if (set.next()){
                b = new Blok5de();
                b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB5DR23_1(isNull(set,3));
                b.setB5DR23_2(isNull(set,4));
                b.setB5DR23_3(isNull(set,5));
                b.setB5DR23_4(isNull(set,6));
                b.setB5DR23_5(isNull(set,7));
                b.setB5DR23Lain(isNull(set, 8));
                b.setB5DR24(isNull(set,9));
                b.setB5DR25(isNull(set,10));
                b.setB5DR25Lengkap(set.getString(11));
                b.setB5DR26a(isNull(set,12));
                b.setB5DR26b(isNull(set,13));
                b.setB5DR26c(isNull(set,14));
                b.setB5DR26d(isNull(set,15));
                b.setB5DR27A(isNull(set,16));
                b.setB5DR27ALS(isNull(set,17));
                b.setB5DR27B(isNull(set,18));
                b.setB5DR27BLain(isNull(set, 19));
                b.setB5DR27C(isNull(set,20));
                b.setB5DR27D(isNull(set,21));
                b.setB5DR27E1(isNull(set,22));
                b.setB5DR27E2(isNull(set,23));
                b.setB5DR27E3(isNull(set,24));
                b.setB5DR27E4(isNull(set,25));
                b.setB5DR27E5(isNull(set,26));
                b.setB5DR27E5Lain(isNull(set, 27));
                b.setB5DR28(isNull(set,28));
                b.setB5DR28Lain(isNull(set, 29));
                b.setB5DR29A(isNull(set,30));
                b.setB5DR29ALS(isNull(set,31));
                b.setB5DR29B1(isNull(set,32));
                b.setB5DR29B2(isNull(set,33));
                b.setB5DR29B3(isNull(set,34));
                b.setB5DR29B4(isNull(set,35));
                b.setB5DR29BLain(isNull(set, 36));
                b.setB5ER30A(isNull(set,37));
                b.setB5ER30ALS(isNull(set,38));
                b.setB5ER30B(isNull(set,39));
                b.setB5ER30C1(set.getString(40));
                b.setB5ER30C2(set.getString(41));
                b.setB5ER30C3(set.getString(42));
            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return b;
    }

    public List<Blok5de> selectAllBlok5de() throws SQLException {
        List<Blok5de> list = new ArrayList<Blok5de>();
        Blok5de b;
        Statement st = null;
        st = connection.createStatement();

        ResultSet set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Blok5de();
            b.setNKS(set.getString(1));
            b.setNO_URUT(isNull(set,2));
            b.setB5DR23_1(isNull(set,3));
            b.setB5DR23_2(isNull(set,4));
            b.setB5DR23_3(isNull(set,5));
            b.setB5DR23_4(isNull(set,6));
            b.setB5DR23_5(isNull(set,7));
            b.setB5DR23Lain(isNull(set, 8));
            b.setB5DR24(isNull(set,9));
            b.setB5DR25(isNull(set,10));
            b.setB5DR25Lengkap(set.getString(11));
            b.setB5DR26a(isNull(set,12));
            b.setB5DR26b(isNull(set,13));
            b.setB5DR26c(isNull(set,14));
            b.setB5DR26d(isNull(set,15));
            b.setB5DR27A(isNull(set,16));
            b.setB5DR27ALS(isNull(set,17));
            b.setB5DR27B(isNull(set,18));
            b.setB5DR27BLain(isNull(set, 19));
            b.setB5DR27C(isNull(set,20));
            b.setB5DR27D(isNull(set,21));
            b.setB5DR27E1(isNull(set,22));
            b.setB5DR27E2(isNull(set,23));
            b.setB5DR27E3(isNull(set,24));
            b.setB5DR27E4(isNull(set,25));
            b.setB5DR27E5(isNull(set,26));
            b.setB5DR27E5Lain(isNull(set, 27));
            b.setB5DR28(isNull(set,28));
            b.setB5DR28Lain(isNull(set, 29));
            b.setB5DR29A(isNull(set,30));
            b.setB5DR29ALS(isNull(set,31));
            b.setB5DR29B1(isNull(set,32));
            b.setB5DR29B2(isNull(set,33));
            b.setB5DR29B3(isNull(set,34));
            b.setB5DR29B4(isNull(set,35));
            b.setB5DR29BLain(isNull(set, 36));
            b.setB5ER30A(isNull(set,37));
            b.setB5ER30ALS(isNull(set,38));
            b.setB5ER30B(isNull(set,39));
            b.setB5ER30C1(set.getString(40));
            b.setB5ER30C2(set.getString(41));
            b.setB5ER30C3(set.getString(42));
            list.add(b);
        }
        return list;

    }

    public List<Blok5de> getAllBlok5de(String NKS) throws SQLException {
        List<Blok5de> list = new ArrayList<Blok5de>();
        Blok5de b = null;
        try{
            pst = connection.prepareStatement(getAllData);
            pst.setString(1, NKS);
            ResultSet set = pst.executeQuery();
            while (set.next()){
                b = new Blok5de();
                b.setNKS(set.getString(1));
                b.setNO_URUT(isNull(set,2));
                b.setB5DR23_1(isNull(set,3));
                b.setB5DR23_2(isNull(set,4));
                b.setB5DR23_3(isNull(set,5));
                b.setB5DR23_4(isNull(set,6));
                b.setB5DR23_5(isNull(set,7));
                b.setB5DR23Lain(isNull(set, 8));
                b.setB5DR24(isNull(set,9));
                b.setB5DR25(isNull(set,10));
                b.setB5DR25Lengkap(set.getString(11));
                b.setB5DR26a(isNull(set,12));
                b.setB5DR26b(isNull(set,13));
                b.setB5DR26c(isNull(set,14));
                b.setB5DR26d(isNull(set,15));
                b.setB5DR27A(isNull(set,16));
                b.setB5DR27ALS(isNull(set,17));
                b.setB5DR27B(isNull(set,18));
                b.setB5DR27BLain(isNull(set, 19));
                b.setB5DR27C(isNull(set,20));
                b.setB5DR27D(isNull(set,21));
                b.setB5DR27E1(isNull(set,22));
                b.setB5DR27E2(isNull(set,23));
                b.setB5DR27E3(isNull(set,24));
                b.setB5DR27E4(isNull(set,25));
                b.setB5DR27E5(isNull(set,26));
                b.setB5DR27E5Lain(isNull(set, 27));
                b.setB5DR28(isNull(set,28));
                b.setB5DR28Lain(isNull(set, 29));
                b.setB5DR29A(isNull(set,30));
                b.setB5DR29ALS(isNull(set,31));
                b.setB5DR29B1(isNull(set,32));
                b.setB5DR29B2(isNull(set,33));
                b.setB5DR29B3(isNull(set,34));
                b.setB5DR29B4(isNull(set,35));
                b.setB5DR29BLain(isNull(set, 36));
                b.setB5ER30A(isNull(set,37));
                b.setB5ER30ALS(isNull(set,38));
                b.setB5ER30B(isNull(set,39));
                b.setB5ER30C1(set.getString(40));
                b.setB5ER30C2(set.getString(41));
                b.setB5ER30C3(set.getString(42));
                list.add(b);
            }
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
        return list;
    }

    public void deleteBlok5de(String NKS) throws SQLException {
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
