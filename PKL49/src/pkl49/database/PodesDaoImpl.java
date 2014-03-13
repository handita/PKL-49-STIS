/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkl49.control.DataStatic;
import pkl49.database.dao.PodesDao;
import pkl49.database.entity.Podes;
import pkl49.view.PanelKuesionerPodes;

/**
 *
 * @author Mr.Hands
 */
public class PodesDaoImpl  implements PodesDao{
    protected final String insert ="INSERT INTO Podes VALUES (?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?,?,?,?,?,?," +
            "?,?,?,?,?);";
    protected final String update ="UPDATE Podes SET B1R5=?,B2R2=?,B2R3=?,B2R7=?,B3R1A=?,B3R1B=?,B3R1C=?,B3R1D=?,B3R1E=?,B3R1F=?,B3R1G=?,B3R2A1=?,B3R2A2=?,B3R2B1=?,B3R2B2=?,B3R2C1=?,B3R2C2=?,B3R2D1=?,B3R2D2=?,B3R2E1=?,B3R2E2=?,B3R2F1=?,B3R2F2=?,B3R2G1=?,B3R2G2=?,B3R3A1=?,B3R3A2=?,B3R3A3=?,B3R3A4=?,B3R3B1=?,B3R3B2=?,B3R3B3=?,B3R3B4=?,B3R3C1=?,B3R3C2=?,B3R3C3=?,B3R3C4=?,B3R3D1=?,B3R3D2=?,B3R3D3=?,B3R3D4=?,B3R3E1=?,B3R3E2=?,B3R3E3=?,B3R3E4=?,B3R3F1=?,B3R3F2=?,B3R3F3=?,B3R3F4=?,B3R3G1=?,B3R3G2=?,B3R3G3=?,B3R3G4=?,B3R4A=?,B3R4A_ALS=?,B3R4B=?,B3R4B_ALS=?,B3R4C=?,B3R4D1=?,B3R4D2=?,B3R4DLain=?,B1R6=?,B1R7=? WHERE NKD=?";
    protected final String delete ="DELETE FROM Podes WHERE NKD=?";
    protected final String getData ="SELECT NKD,B1R5,B1R6,B1R7,B2R2,B2R3,B2R7,B3R1A,B3R1B,B3R1C,B3R1D,B3R1E,B3R1F,B3R1G,B3R2A1,B3R2A2,B3R2B1,B3R2B2,B3R2C1,B3R2C2,B3R2D1,B3R2D2,B3R2E1,B3R2E2,B3R2F1,B3R2F2,B3R2G1,B3R2G2,B3R3A1,B3R3A2,B3R3A3,B3R3A4,B3R3B1,B3R3B2,B3R3B3,B3R3B4,B3R3C1,B3R3C2,B3R3C3,B3R3C4,B3R3D1,B3R3D2,B3R3D3,B3R3D4,B3R3E1,B3R3E2,B3R3E3,B3R3E4,B3R3F1,B3R3F2,B3R3F3,B3R3F4,B3R3G1,B3R3G2,B3R3G3,B3R3G4,B3R4A,B3R4A_ALS,B3R4B,B3R4B_ALS,B3R4C,B3R4D1,B3R4D2,B3R4DLain FROM Podes WHERE NKD=?";
    protected final String selectAll ="SELECT * FROM Podes";
    private Connection connection;
    private PanelKuesionerPodes kuesionerPodes;
    private PreparedStatement pst;
    private ResultSet set;

    public PodesDaoImpl(PanelKuesionerPodes kuesionerPodes) {
        this.kuesionerPodes = kuesionerPodes;
    }

    public PodesDaoImpl(PanelKuesionerPodes kuesionerPodes, Connection con) {
            this.connection = con;
            this.kuesionerPodes = kuesionerPodes;
    }
    public void cek(int indeks,Integer nilai) throws SQLException{
        if(nilai==null){
          pst.setNull(indeks, 4);
        }else{
           pst.setInt(indeks,nilai);
        }
    }

    protected Integer isNull(int indeks){
      Integer a = null;
      Integer b=null;
        try {
            b=set.getInt(indeks);
            if (b == 0) {
                if (set.wasNull()) {
                    a = null;
                } else {
                    a = 0;
                }
            } else {
               a=b;
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(PodesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

      
      return a;
        
      
    }
   public String getNKD(){
       String a,b,c,d,NKD;

       a=kuesionerPodes.getListBlok1().get(0).getText();
        c=kuesionerPodes.getListBlok1().get(2).getText();
        d=kuesionerPodes.getListBlok1().get(3).getText();
        NKD=a+c+d;
        return NKD;
    }
    public Podes getPodesForm(){
        Podes baru=new Podes();

        baru.setNKD(getNKD());
        baru.setPengentry(DataStatic.getNimPengentry());
        baru.setB1R5(kuesionerPodes.getListBlok1().get(4).getText());
        baru.setB1R6(kuesionerPodes.getListBlok1().get(5).getText());
        baru.setB1R7(kuesionerPodes.getListBlok1().get(6).getText());
        baru.setB2R2(kuesionerPodes.getListBlok2().get(1).getText());
        baru.setB2R3(kuesionerPodes.getListBlok2().get(2).getText());
        baru.setB2R7(kuesionerPodes.getListBlok2().get(5).getText());
       baru.setB3R1A(kuesionerPodes.getListBlok3().get(0).getInt());
        baru.setB3R1B(kuesionerPodes.getListBlok3().get(1).getInt());
        baru.setB3R1C(kuesionerPodes.getListBlok3().get(2).getInt());
        baru.setB3R1D(kuesionerPodes.getListBlok3().get(3).getInt());
        baru.setB3R1E(kuesionerPodes.getListBlok3().get(4).getInt());
        baru.setB3R1F(kuesionerPodes.getListBlok3().get(5).getInt());
        baru.setB3R1G(kuesionerPodes.getListBlok3().get(6).getInt());
        baru.setB3R2A1(kuesionerPodes.getListBlok3().get(7).getInt());
        baru.setB3R2A2(kuesionerPodes.getListBlok3().get(8).getInt());
        baru.setB3R2B1(kuesionerPodes.getListBlok3().get(9).getInt());
        baru.setB3R2B2(kuesionerPodes.getListBlok3().get(10).getInt());
        baru.setB3R2C1(kuesionerPodes.getListBlok3().get(11).getInt());
        baru.setB3R2C2(kuesionerPodes.getListBlok3().get(12).getInt());
        baru.setB3R2D1(kuesionerPodes.getListBlok3().get(13).getInt());
        baru.setB3R2D2(kuesionerPodes.getListBlok3().get(14).getInt());
        baru.setB3R2E1(kuesionerPodes.getListBlok3().get(15).getInt());
        baru.setB3R2E2(kuesionerPodes.getListBlok3().get(16).getInt());
        baru.setB3R2F1(kuesionerPodes.getListBlok3().get(17).getInt());
        baru.setB3R2F2(kuesionerPodes.getListBlok3().get(18).getInt());
        baru.setB3R2G1(kuesionerPodes.getListBlok3().get(19).getInt());
        baru.setB3R2G2(kuesionerPodes.getListBlok3().get(20).getInt());

        baru.setB3R3A1(kuesionerPodes.getListBlok3().get(21).getNol());
        baru.setB3R3A2(kuesionerPodes.getListBlok3().get(22).getNol());
        baru.setB3R3A3(kuesionerPodes.getListBlok3().get(23).getNol());
        baru.setB3R3A4(kuesionerPodes.getListBlok3().get(24).getNol());
        baru.setB3R3B1(kuesionerPodes.getListBlok3().get(25).getNol());
        baru.setB3R3B2(kuesionerPodes.getListBlok3().get(26).getNol());
        baru.setB3R3B3(kuesionerPodes.getListBlok3().get(27).getNol());
        baru.setB3R3B4(kuesionerPodes.getListBlok3().get(28).getNol());
        baru.setB3R3C1(kuesionerPodes.getListBlok3().get(29).getNol());
        baru.setB3R3C2(kuesionerPodes.getListBlok3().get(30).getNol());
        baru.setB3R3C3(kuesionerPodes.getListBlok3().get(31).getNol());
        baru.setB3R3C4(kuesionerPodes.getListBlok3().get(32).getNol());
        baru.setB3R3D1(kuesionerPodes.getListBlok3().get(33).getNol());
        baru.setB3R3D2(kuesionerPodes.getListBlok3().get(34).getNol());
        baru.setB3R3D3(kuesionerPodes.getListBlok3().get(35).getNol());
        baru.setB3R3D4(kuesionerPodes.getListBlok3().get(36).getNol());
        baru.setB3R3E1(kuesionerPodes.getListBlok3().get(37).getNol());
        baru.setB3R3E2(kuesionerPodes.getListBlok3().get(38).getNol());
        baru.setB3R3E3(kuesionerPodes.getListBlok3().get(39).getNol());
        baru.setB3R3E4(kuesionerPodes.getListBlok3().get(40).getNol());
        baru.setB3R3F1(kuesionerPodes.getListBlok3().get(41).getNol());
        baru.setB3R3F2(kuesionerPodes.getListBlok3().get(42).getNol());
        baru.setB3R3F3(kuesionerPodes.getListBlok3().get(43).getNol());
        baru.setB3R3F4(kuesionerPodes.getListBlok3().get(44).getNol());
        baru.setB3R3G1(kuesionerPodes.getListBlok3().get(45).getNol());
        baru.setB3R3G2(kuesionerPodes.getListBlok3().get(46).getNol());
        baru.setB3R3G3(kuesionerPodes.getListBlok3().get(47).getNol());
        baru.setB3R3G4(kuesionerPodes.getListBlok3().get(48).getNol());
        baru.setB3R4A(kuesionerPodes.getListBlok3().get(49).getInt());
        baru.setB3R4AAlasan(kuesionerPodes.getListBlok3().get(55).getInt());
        baru.setB3R4B(kuesionerPodes.getListBlok3().get(50).getInt());
        baru.setB3R4BAlasan(kuesionerPodes.getListBlok3().get(56).getInt());
        baru.setB3R4C(kuesionerPodes.getListBlok3().get(51).getInt());
        baru.setB3R4D1(kuesionerPodes.getListBlok3().get(52).getInt());
        baru.setB3R4D2(kuesionerPodes.getListBlok3().get(53).getInt());
        baru.setB3R4DLain(kuesionerPodes.getListBlok3().get(54).getInt());
        return baru;

    }
    public void insertPodes() throws SQLException {
       pst = null;
        Podes Podes =getPodesForm();
        try{
            pst = connection.prepareStatement(insert);
            pst.setString(1, Podes.getNKD());
            pst.setString(2, Podes.getPengentry());
            pst.setString(3, Podes.getB1R5());
            pst.setString(4, Podes.getB1R6());
            pst.setString(5, Podes.getB1R7());
            pst.setString(6, Podes.getB2R2());
            pst.setString(7, Podes.getB2R3());
            pst.setString(8, Podes.getB2R7());

            cek(9, Podes.getB3R1A());
            cek(10, Podes.getB3R1B());
            cek(11, Podes.getB3R1C());
            cek(12, Podes.getB3R1D());
            cek(13, Podes.getB3R1E());
            cek(14, Podes.getB3R1F());
            cek(15, Podes.getB3R1G());
            cek(16, Podes.getB3R2A1());
            cek(17, Podes.getB3R2A2());
            cek(18, Podes.getB3R2B1());
            cek(19, Podes.getB3R2B2());
            cek(20, Podes.getB3R2C1());
            cek(21, Podes.getB3R2C2());
            cek(22, Podes.getB3R2D1());
            cek(23, Podes.getB3R2D2());
            cek(24, Podes.getB3R2E1());
            cek(25, Podes.getB3R2E2());
            cek(26, Podes.getB3R2F1());
            cek(27, Podes.getB3R2F2());
            cek(28, Podes.getB3R2G1());
            cek(29, Podes.getB3R2G2());
            cek(30, Podes.getB3R3A1());
            cek(31, Podes.getB3R3A2());
            cek(32, Podes.getB3R3A3());
            cek(33, Podes.getB3R3A4());
            cek(34, Podes.getB3R3B1());
            cek(35, Podes.getB3R3B2());
            cek(36, Podes.getB3R3B3());
            cek(37, Podes.getB3R3B4());
            cek(38, Podes.getB3R3C1());
            cek(39, Podes.getB3R3C2());
            cek(40, Podes.getB3R3C3());
            cek(41, Podes.getB3R3C4());
            cek(42, Podes.getB3R3D1());
            cek(43, Podes.getB3R3D2());
            cek(44, Podes.getB3R3D3());
            cek(45, Podes.getB3R3D4());
            cek(46, Podes.getB3R3E1());
            cek(47, Podes.getB3R3E2());
            cek(48, Podes.getB3R3E3());
            cek(49, Podes.getB3R3E4());
            cek(50, Podes.getB3R3F1());
            cek(51, Podes.getB3R3F2());
            cek(52, Podes.getB3R3F3());
            cek(53, Podes.getB3R3F4());
            cek(54, Podes.getB3R3G1());
            cek(55, Podes.getB3R3G2());
            cek(56, Podes.getB3R3G3());
            cek(57, Podes.getB3R3G4());
            cek(58, Podes.getB3R4A());
            cek(59, Podes.getB3R4AAlasan());
            cek(60, Podes.getB3R4B());
            cek(61, Podes.getB3R4BAlasan());
            cek(62, Podes.getB3R4C());
            cek(63, Podes.getB3R4D1());
            cek(64, Podes.getB3R4D2());
            cek(65, Podes.getB3R4DLain());


            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }
    }

    public void updatePodes() throws SQLException {
         pst=null;
        Podes Podes =getPodesForm();
      try{
            pst = connection.prepareStatement(update);
            pst.setString(1, Podes.getB1R5());
            pst.setString(2, Podes.getB2R2());
            pst.setString(3, Podes.getB2R3());
            pst.setString(4, Podes.getB2R7());
            cek(5, Podes.getB3R1A());
            cek(6, Podes.getB3R1B());
            cek(7, Podes.getB3R1C());
            cek(8, Podes.getB3R1D());
            cek(9, Podes.getB3R1E());
            cek(10, Podes.getB3R1F());
            cek(11, Podes.getB3R1G());
            cek(12, Podes.getB3R2A1());
            cek(13, Podes.getB3R2A2());
            cek(14, Podes.getB3R2B1());
            cek(15, Podes.getB3R2B2());
            cek(16, Podes.getB3R2C1());
            cek(17, Podes.getB3R2C2());
            cek(18, Podes.getB3R2D1());
            cek(19, Podes.getB3R2D2());
            cek(20, Podes.getB3R2E1());
            cek(21, Podes.getB3R2E2());
            cek(22, Podes.getB3R2F1());
            cek(23, Podes.getB3R2F2());
            cek(24, Podes.getB3R2G1());
            cek(25, Podes.getB3R2G2());
            cek(26, Podes.getB3R3A1());
            cek(27, Podes.getB3R3A2());
            cek(28, Podes.getB3R3A3());
            cek(29, Podes.getB3R3A4());
            cek(30, Podes.getB3R3B1());
            cek(31, Podes.getB3R3B2());
            cek(32, Podes.getB3R3B3());
            cek(33, Podes.getB3R3B4());
            cek(34, Podes.getB3R3C1());
            cek(35, Podes.getB3R3C2());
            cek(36, Podes.getB3R3C3());
            cek(37, Podes.getB3R3C4());
            cek(38, Podes.getB3R3D1());
            cek(39, Podes.getB3R3D2());
            cek(40, Podes.getB3R3D3());
            cek(41, Podes.getB3R3D4());
            cek(42, Podes.getB3R3E1());
            cek(43, Podes.getB3R3E2());
            cek(44, Podes.getB3R3E3());
            cek(45, Podes.getB3R3E4());
            cek(46, Podes.getB3R3F1());
            cek(47, Podes.getB3R3F2());
            cek(48, Podes.getB3R3F3());
            cek(49, Podes.getB3R3F4());
            cek(50, Podes.getB3R3G1());
            cek(51, Podes.getB3R3G2());
            cek(52, Podes.getB3R3G3());
            cek(53, Podes.getB3R3G4());
            cek(54, Podes.getB3R4A());
            cek(55, Podes.getB3R4AAlasan());
            cek(56, Podes.getB3R4B());
            cek(57, Podes.getB3R4BAlasan());
            cek(58, Podes.getB3R4C());
            cek(59, Podes.getB3R4D1());
            cek(60, Podes.getB3R4D2());
            cek(61, Podes.getB3R4DLain());
            pst.setString(62, Podes.getB1R6());
            pst.setString(63, Podes.getB1R7());
            pst.setString(64, Podes.getNKD());
            pst.executeUpdate();
        }finally{
            if (pst!=null){
                pst.close();
            }
        }

    }

    public void deletePodes(String NKS) throws SQLException {
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

    public ResultSet getSet() {
        return set;
    }

    public Podes getPodes(String NKS) throws SQLException {
        Podes b = null;
        PreparedStatement ps = null;
        set=null;
        try{
            ps = connection.prepareStatement(getData);
            ps.setString(1, NKS);
            set = ps.executeQuery();
            if (set.next()){
                b = new Podes();
                b.setNKD(set.getString(1));
                b.setB1R5(set.getString(2));
                b.setB1R6(set.getString(3));
                b.setB1R7(set.getString(4));
                b.setB2R2(set.getString(5));
                b.setB2R3(set.getString(6));
                b.setB2R7(set.getString(7));
                b.setB3R1A(isNull(8));
                
                b.setB3R1B(isNull(9));
                b.setB3R1C(isNull(10));
                b.setB3R1D(isNull(11));
                b.setB3R1E(isNull(12));
                b.setB3R1F(isNull(13));
                b.setB3R1G(isNull(14));
                b.setB3R2A1(isNull(15));
                b.setB3R2A2(isNull(16));
                b.setB3R2B1(isNull(17));
                b.setB3R2B2(isNull(18));
                b.setB3R2C1(isNull(19));
                b.setB3R2C2(isNull(20));
                b.setB3R2D1(isNull(21));
                b.setB3R2D2(isNull(22));
                b.setB3R2E1(isNull(23));
                b.setB3R2E2(isNull(24));
                b.setB3R2F1(isNull(25));
                b.setB3R2F2(isNull(26));
                b.setB3R2G1(isNull(27));
                b.setB3R2G2(isNull(28));
                b.setB3R3A1(isNull(29));
                b.setB3R3A2(isNull(30));
                b.setB3R3A3(isNull(31));
                b.setB3R3A4(isNull(32));
                b.setB3R3B1(isNull(33));
                b.setB3R3B2(isNull(34));
                b.setB3R3B3(isNull(35));
                b.setB3R3B4(isNull(36));
                b.setB3R3C1(isNull(37));
                b.setB3R3C2(isNull(38));
                b.setB3R3C3(isNull(39));
                b.setB3R3C4(isNull(40));
                b.setB3R3D1(isNull(41));
                b.setB3R3D2(isNull(42));
                b.setB3R3D3(isNull(43));
                b.setB3R3D4(isNull(44));
                b.setB3R3E1(isNull(45));
                b.setB3R3E2(isNull(46));
                b.setB3R3E3(isNull(47));
                b.setB3R3E4(isNull(48));
                b.setB3R3F1(isNull(49));
                b.setB3R3F2(isNull(50));
                b.setB3R3F3(isNull(51));
                b.setB3R3F4(isNull(52));
                b.setB3R3G1(isNull(53));
                b.setB3R3G2(isNull(54));
                b.setB3R3G3(isNull(55));
                b.setB3R3G4(isNull(56));
                b.setB3R4A(isNull(57));
                b.setB3R4AAlasan(isNull(58));
                b.setB3R4B(isNull(59));
                b.setB3R4BAlasan(isNull(60));
                b.setB3R4C(isNull(61));
                b.setB3R4D1(isNull(62));
                b.setB3R4D2(isNull(63));
                b.setB3R4DLain(isNull(64));
            }
        }finally{
            if (ps!=null){
                ps.close();
            }
        }
        return b;
    }

    public List<Podes> selectAllPodes() throws SQLException {
        List<Podes> list = new ArrayList<Podes>();
        Podes b;
        Statement st = null;
        st = (Statement) connection.createStatement();
        set = st.executeQuery(selectAll);
        while(set.next()){
            b = new Podes();
            b.setNKD(set.getString(1));
            b.setB1R5(set.getString(6));
            b.setB2R2(set.getString(9));
            b.setB2R3(set.getString(10));
            b.setB2R7(set.getString(12));
            b.setB3R1A(isNull(13));
            b.setB3R1B(isNull(14));
            b.setB3R1C(isNull(15));
            b.setB3R1D(isNull(16));
            b.setB3R1E(isNull(17));
            b.setB3R1F(isNull(18));
            b.setB3R1G(isNull(19));
            b.setB3R2A1(isNull(20));
            b.setB3R2A2(isNull(21));
            b.setB3R2B1(isNull(22));
            b.setB3R2B2(isNull(23));
            b.setB3R2C1(isNull(24));
            b.setB3R2C2(isNull(25));
            b.setB3R2D1(isNull(26));
            b.setB3R2D2(isNull(27));
            b.setB3R2E1(isNull(28));
            b.setB3R2E2(isNull(29));
            b.setB3R2F1(isNull(30));
            b.setB3R2F2(isNull(31));
            b.setB3R2G1(isNull(32));
            b.setB3R2G2(isNull(33));
            b.setB3R3A1(isNull(34));
            b.setB3R3A2(isNull(35));
            b.setB3R3A3(isNull(36));
            b.setB3R3A4(isNull(37));
            b.setB3R3B1(isNull(38));
            b.setB3R3B2(isNull(39));
            b.setB3R3B3(isNull(40));
            b.setB3R3B4(isNull(41));
            b.setB3R3C1(isNull(42));
            b.setB3R3C2(isNull(43));
            b.setB3R3C3(isNull(44));
            b.setB3R3C4(isNull(45));
            b.setB3R3D1(isNull(46));
            b.setB3R3D2(isNull(47));
            b.setB3R3D3(isNull(48));
            b.setB3R3D4(isNull(49));
            b.setB3R3E1(isNull(50));
            b.setB3R3E2(isNull(51));
            b.setB3R3E3(isNull(52));
            b.setB3R3E4(isNull(53));
            b.setB3R3F1(isNull(54));
            b.setB3R3F2(isNull(55));
            b.setB3R3F3(isNull(56));
            b.setB3R3F4(isNull(57));
            b.setB3R3G1(isNull(58));
            b.setB3R3G2(isNull(59));
            b.setB3R3G3(isNull(60));
            b.setB3R3G4(isNull(61));
            b.setB3R4A(isNull(62));
            b.setB3R4B(isNull(63));
            b.setB3R4C(isNull(64));
            b.setB3R4D1(isNull(65));
            b.setB3R4D2(isNull(66));
            b.setB3R4DLain(isNull(67));
            list.add(b);
        }
        return list;

    }

    

}
