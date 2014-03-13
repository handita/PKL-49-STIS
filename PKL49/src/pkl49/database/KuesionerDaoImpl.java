/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkl49.control.DataStatic;
import pkl49.database.entity.*;
import pkl49.database.dao.*;
import pkl49.validasi.ValidasiBlok8B;
import pkl49.validasi.ValidasiBlok8C;
import pkl49.view.PanelKuesioner;

/**
 *
 * @author Mr.Hands
 * 24-10-2010
 * Seksi pengolahan subseksi pemrograman
 * contact me at viyanatmail@gmail.com
 */
public class KuesionerDaoImpl {
    /**
     * ini adalah deklarasi dari tiap model dari tabel yang akan dimasukan ke dalam database
     * Tiap - tiap tabel disediakan dalam model - model entitas yang telah dibuat
     *
     */
    private Blok1 blok1;
    private Blok2 blok2;
    private List<Blok4> blok4;
    private List<Blok5a> blok5a;
    private List<Blok5b> blok5b;
    private List<Blok5c> blok5c;
    private List<Blok5de> blok5de;
    private Blok6 blok6;
    private Blok7a blok7a;
    private Blok7b blok7b;
    private List<Blok8a1> Blok8a1;
    private Blok8a2 Blok8a2;
    private List<Blok8a3> Blok8a3;
    private List<Blok8a4> Blok8a4;
    private List<Blok8a5> Blok8a5;
    private List<Blok8b> Blok8b;
    private List<Blok8c> Blok8c;
    private Blok1Dao blok1Dao;
    private Blok2Dao blok2Dao;
    private Blok4Dao blok4Dao;
    private Blok5aDao blok5aDao;
    private Blok5bDao blok5bDao;
    private Blok5cDao blok5cDao;
    private Blok5deDao blok5deDao;
    private Blok6Dao blok6Dao;
    private Blok7aDao blok7aDao;
    private Blok7bDao blok7bDao;
    private Blok8a1Dao blok8a1Dao;
    private Blok8a2Dao blok8a2Dao;
    private Blok8a3Dao blok8a3Dao;
    private Blok8a4Dao blok8a4Dao;
    private Blok8a5Dao blok8a5Dao;
    private Blok8bDao blok8bDao;
    private Blok8cDao blok8cDao;
    private Connection connection;
    PanelKuesioner panelKuesioner;
    private int jmlART;

    /**
     * konstruktor ini dipake di set form
     */
    public KuesionerDaoImpl() {
        connection = KoneksiMysQl.getConnectionRT();
        blok1=new Blok1();
        blok2=new Blok2();
        blok4=new ArrayList<Blok4>();
        blok5a=new ArrayList<Blok5a>();
        blok5b=new ArrayList<Blok5b>();
        blok5c=new ArrayList<Blok5c>();
        blok5de=new ArrayList<Blok5de>();
        blok6=new Blok6();
        blok7a=new Blok7a();
        blok7b=new Blok7b();
        Blok8a1=new ArrayList<Blok8a1>();
        Blok8a2=new Blok8a2();
        Blok8a3=new ArrayList<Blok8a3>();
        Blok8a4=new ArrayList<Blok8a4>();
        Blok8a5=new ArrayList<Blok8a5>();
        Blok8b=new ArrayList<Blok8b>();
        Blok8c=new ArrayList<Blok8c>();
        blok1Dao=new Blok1DaoImpl(connection);
        blok2Dao=new Blok2DaoImpl(connection);
        blok4Dao=new Blok4DaoImpl(connection);
        blok5aDao=new Blok5aDaoImpl(connection);
        blok5bDao=new Blok5bDaoImpl(connection);
        blok5cDao=new Blok5cDaoImpl(connection);
        blok5deDao=new Blok5deDaoImpl(connection);
        blok6Dao=new Blok6DaoImpl(connection);
        blok7aDao=new Blok7aDaoImpl(connection);
        blok7bDao=new Blok7bDaoImpl(connection);
        blok8a1Dao=new Blok8a1DaoImpl(connection);
        blok8a2Dao=new Blok8a2DaoImpl(connection);
        blok8a3Dao=new Blok8a3DaoImpl(connection);
        blok8a4Dao=new Blok8a4DaoImpl(connection);
        blok8a5Dao=new Blok8a5DaoImpl(connection);
        blok8bDao=new Blok8bDaoImpl(connection);
        blok8cDao=new Blok8cDaoImpl(connection);
    }

    /**
     * Dipakai di transfer
     * @param blok1
     * @param blok2
     * @param blok3
     * @param blok4
     * @param blok5a
     * @param blok5b
     * @param blok5c
     * @param blok5de
     * @param blok6
     * @param blok7a
     * @param blok7b
     * @param Blok8a1
     * @param Blok8a2
     * @param Blok8a3
     * @param Blok8a4
     * @param Blok8b
     * @param Blok8c
     */
    public KuesionerDaoImpl(Blok1 blok1, Blok2 blok2, Blok3 blok3, List<Blok4> blok4, List<Blok5a> blok5a, List<Blok5b> blok5b, List<Blok5c> blok5c, List<Blok5de> blok5de, Blok6 blok6, Blok7a blok7a, Blok7b blok7b, List<Blok8a1> Blok8a1, Blok8a2 Blok8a2, List<Blok8a3> Blok8a3, List<Blok8a4> Blok8a4, List<Blok8b> Blok8b, List<Blok8c> Blok8c) {
        this.blok1 = blok1;
        this.blok2 = blok2;
        this.blok4 = blok4;
        this.blok5a = blok5a;
        this.blok5b = blok5b;
        this.blok5c = blok5c;
        this.blok5de = blok5de;
        this.blok6 = blok6;
        this.blok7a = blok7a;
        this.blok7b = blok7b;
        this.Blok8a1 = Blok8a1;
        this.Blok8a2 = Blok8a2;
        this.Blok8a3 = Blok8a3;
        this.Blok8a4 = Blok8a4;
        this.Blok8b = Blok8b;
        this.Blok8c = Blok8c;
    }


    /**
     * construktor untuk memasukkan semua data ke database
     *
     */
    public KuesionerDaoImpl(PanelKuesioner kuesioner) {
        connection = KoneksiMysQl.getConnectionRT();
        panelKuesioner=kuesioner;
        jmlART=value(getText(9, "Hal1"));
        blok1=new Blok1();
        blok2=new Blok2();
        blok4=new ArrayList<Blok4>();
        blok5a=new ArrayList<Blok5a>();
        blok5b=new ArrayList<Blok5b>();
        blok5c=new ArrayList<Blok5c>();
        blok5de=new ArrayList<Blok5de>();
        blok6=new Blok6();
        blok7a=new Blok7a();
        blok7b=new Blok7b();
        Blok8a1=new ArrayList<Blok8a1>();
        Blok8a2=new Blok8a2();
        Blok8a3=new ArrayList<Blok8a3>();
        Blok8a4=new ArrayList<Blok8a4>();
        Blok8a5=new ArrayList<Blok8a5>();
        Blok8b=new ArrayList<Blok8b>();
        Blok8c=new ArrayList<Blok8c>();
        blok1Dao=new Blok1DaoImpl(connection);
        blok2Dao=new Blok2DaoImpl(connection);
        blok4Dao=new Blok4DaoImpl(connection);
        blok5aDao=new Blok5aDaoImpl(connection);
        blok5bDao=new Blok5bDaoImpl(connection);
        blok5cDao=new Blok5cDaoImpl(connection);
        blok5deDao=new Blok5deDaoImpl(connection);
        blok6Dao=new Blok6DaoImpl(connection);
        blok7aDao=new Blok7aDaoImpl(connection);
        blok7bDao=new Blok7bDaoImpl(connection);
        blok8a1Dao=new Blok8a1DaoImpl(connection);
        blok8a2Dao=new Blok8a2DaoImpl(connection);
        blok8a3Dao=new Blok8a3DaoImpl(connection);
        blok8a4Dao=new Blok8a4DaoImpl(connection);
        blok8a5Dao=new Blok8a5DaoImpl(connection);
        blok8bDao=new Blok8bDaoImpl(connection);
        blok8cDao=new Blok8cDaoImpl(connection);
        getBlok1();
        getBlok2();
        for(int i=0;i<jmlART;i++)
            getBlok4(i);
        for(int i=0;i<jmlART;i++){
           int umur=panelKuesioner.getHalaman2().getListHalaman2().get(i).get(3).getInt();
           getBlok5a(i);
           if(umur<5)
               getBlok5b(i);
           if(umur>=5)
               getBlok5c(i);
            if(umur>=15){
               getBlok5de(i);
               
            }
        }
        getBlok6();
        getBlok7a();
        getBlok7b();
        for(int j=0;j<jmlART;j++)
            getBlok8a1(j);
        getBlok8a2();
        for(int j=0;j<jmlART;j++)
            getBlok8a3_5(j);
        for(int j=0;j<jmlART;j++){
            getBlok8a4(j);
        }
        for(int i=0;i<ValidasiBlok8B.getjArt15();i++)
            getBlok8b(i);
        for(int i=0;i<ValidasiBlok8C.loop;i++)
            getBlok8c(i);
   }


    
   /**
    * Fungsi ini digunakan untuk memasukan nilai yang ada di dalam panel ke database yang telah di set
    *
    */

     public int insertToDatabase(){
        int status;
        try {
            connection.setAutoCommit(false);
            System.out.println("ProsesAwal");
            blok1Dao.insertBlok1(blok1);
            blok2Dao.insertBlok2(blok2);
            for(int i=0;i<blok4.size();i++)
                blok4Dao.insertBlok4(blok4.get(i));
            for(int i=0;i<blok5a.size();i++)
                blok5aDao.insertBlok5a(blok5a.get(i));
            for(int i=0;i<blok5b.size();i++)
                blok5bDao.insertBlok5b(blok5b.get(i));
            for(int i=0;i<blok5c.size();i++)
                 blok5cDao.insertBlok5c(blok5c.get(i));
            for(int i=0;i<blok5de.size();i++)
                 blok5deDao.insertBlok5de(blok5de.get(i));
           blok6Dao.insertBlok6(blok6);
           blok7aDao.insertBlok7a(blok7a);
           blok7bDao.insertBlok7b(blok7b);
           for(int j=0;j<Blok8a1.size();j++){
                blok8a1Dao.insertBlok8a1(Blok8a1.get(j));
           }
           blok8a2Dao.insertBlok8a2(Blok8a2);
           for(int k=0;k<Blok8a3.size();k++){
               if(!Blok8a3.get(k).isNull())
                   blok8a3Dao.insertBlok8a3(Blok8a3.get(k));
           }
           for(int l=0;l<Blok8a4.size();l++){
               if(!Blok8a4.get(l).isNull())
                   blok8a4Dao.insertBlok8a4(Blok8a4.get(l));
           }
           for(int l=0;l<Blok8a5.size();l++){
               if(!Blok8a5.get(l).isNull())
                   blok8a5Dao.insertBlok8a5(Blok8a5.get(l));
           }
           for(int m=0;m<Blok8b.size();m++){
               blok8bDao.insertBlok8b(Blok8b.get(m));
           }
           for(int n=0;n<Blok8c.size();n++){
               blok8cDao.insertBlok8c(Blok8c.get(n));
           }
           connection.commit();
           status=1;
//           JOptionPane.showMessageDialog(panelKuesioner, "Data berhasil disimpan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            status = 0;
        }
        return status;
     }

     public int updateToDatabase(){
        int status = 1;
        try {
            connection.setAutoCommit(false);
            //Data yang berulang hapus dulu. Lalu insert data yang baru
            blok4Dao.deleteBlok4(DataStatic.getNKSForUpdate());
            blok5aDao.deleteBlok5a(DataStatic.getNKSForUpdate());
            blok5bDao.deleteBlok5b(DataStatic.getNKSForUpdate());
            blok5cDao.deleteBlok5c(DataStatic.getNKSForUpdate());
            blok5deDao.deleteBlok5de(DataStatic.getNKSForUpdate());
            blok8a1Dao.deleteBlok8a1(DataStatic.getNKSForUpdate());
            blok8a3Dao.deleteBlok8a3(DataStatic.getNKSForUpdate());
            blok8a4Dao.deleteBlok8a4(DataStatic.getNKSForUpdate());
            blok8a5Dao.deleteBlok8a5(DataStatic.getNKSForUpdate());
            blok8bDao.deleteBlok8b(DataStatic.getNKSForUpdate());
            blok8cDao.deleteBlok8c(DataStatic.getNKSForUpdate());


            blok1Dao.updateBlok1(blok1);
            blok2Dao.updateBlok2(blok2);
            for(int i=0;i<blok4.size();i++)
                blok4Dao.insertBlok4(blok4.get(i));
            for(int i=0;i<blok5a.size();i++)
                blok5aDao.insertBlok5a(blok5a.get(i));
            for(int i=0;i<blok5b.size();i++)
                blok5bDao.insertBlok5b(blok5b.get(i));
            for(int i=0;i<blok5c.size();i++)
                 blok5cDao.insertBlok5c(blok5c.get(i));
            for(int i=0;i<blok5de.size();i++)
                 blok5deDao.insertBlok5de(blok5de.get(i));
           blok6Dao.updateBlok6(blok6);
           blok7aDao.updateBlok7a(blok7a);
           blok7bDao.updateBlok7b(blok7b);
           for(int j=0;j<Blok8a1.size();j++){
                blok8a1Dao.insertBlok8a1(Blok8a1.get(j));
           }
           blok8a2Dao.updateBlok8a2(Blok8a2);
           for(int k=0;k<Blok8a3.size();k++){
               if(!Blok8a3.get(k).isNull())
                   blok8a3Dao.insertBlok8a3(Blok8a3.get(k));
           }
           for(int l=0;l<Blok8a4.size();l++){
               if(!Blok8a4.get(l).isNull())
                   blok8a4Dao.insertBlok8a4(Blok8a4.get(l));
           }
           for(int l=0;l<Blok8a5.size();l++){
               if(!Blok8a5.get(l).isNull())
                   blok8a5Dao.insertBlok8a5(Blok8a5.get(l));
           }
           
           
           for(int n=0;n<Blok8b.size();n++){
               blok8bDao.insertBlok8b(Blok8b.get(n));
           }
           for(int m=0;m<Blok8c.size();m++){
               blok8cDao.insertBlok8c(Blok8c.get(m));
           }
           connection.commit();
//           JOptionPane.showMessageDialog(panelKuesioner, "Data berhasil diupdate!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            status = 0;
        }
        return status;
    }

     /**
      * Untuk menghapus data satu rumah tangga
      * @return
      */
     public int deleteData(){
        int status = 1;
        String NKS = DataStatic.getNKSForUpdate();
        try {
            connection.setAutoCommit(false);
            //Delete data dulu
            blok1Dao.deleteBlok1(NKS);
            blok2Dao.deleteBlok2(NKS);
            blok4Dao.deleteBlok4(NKS);
            blok5aDao.deleteBlok5a(NKS);
            blok5bDao.deleteBlok5b(NKS);
            blok5cDao.deleteBlok5c(NKS);
            blok5deDao.deleteBlok5de(NKS);
            blok6Dao.deleteBlok6(NKS);
            blok7aDao.deleteBlok7a(NKS);
            blok7bDao.deleteBlok7b(NKS);
            blok8a1Dao.deleteBlok8a1(NKS);
            blok8a2Dao.deleteBlok8a2(NKS);
            blok8a3Dao.deleteBlok8a3(NKS);
            blok8a4Dao.deleteBlok8a4(NKS);
            blok8a5Dao.deleteBlok8a5(NKS);
            blok8bDao.deleteBlok8b(NKS);
            blok8cDao.deleteBlok8c(NKS);
           connection.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            status = 0;
        }
        return status;
    }



    /**
     * Fungsi yang digunakakn untuk mendapatkan nilai dari nks gabungan
     * dari propinsi, kabupaten, kecamatan, bloksensus, nomor sampel
     * @return NKS
     */
    public String getNks() {
        String B1R1,B1R3,B1R4,B1R5,B1R7,NKS;
        B1R1=getText(0, "Hal1");
        B1R3=getText(2, "Hal1");
        B1R4=getText(3, "Hal1");
        B1R5=getText(4, "Hal1");
        B1R7=getText(6, "Hal1");
        NKS=B1R1+B1R3+B1R4+B1R5+B1R7;
        return NKS;
    }


    public int getJmlART() {
        return jmlART;
    }

    public void setJmlART(int jmlART) {
        this.jmlART = jmlART;
    }

   /**
    * Fungsi yang digunakan untuk mendapatkan setiap teks yang ada di form
    * @param indeks untuk mendapatkan posisi dari list textfield
    * @param halaman untuk menentukan halaman dimana textfield berada
    * @return hasil dari text dari textfield yang kita inginkan
    */
    protected String getText(int indeks,String halaman){
            String isiText = null;
        if(halaman.equals("Hal1"))
             isiText= panelKuesioner.getHalaman1().getListHalaman1().get(indeks).getText();
        else if(halaman.equals("B5A"))
             isiText=panelKuesioner.getHalaman3_1().getListBlok5A().get(indeks).getText();
        else if(halaman.equals("B5B"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5B().get(indeks).getText();
        else if(halaman.equals("B5"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5().get(indeks).getText();
        else if(halaman.equals("B5C"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5C().get(indeks).getText();
        else if(halaman.equals("B5DE"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5D().get(indeks).getText();
        else if(halaman.equals("B5E"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5E().get(indeks).getText();
        else if(halaman.equals("B6"))
            isiText=panelKuesioner.getHalaman4().getListBlok6().get(indeks).getText();
        else if(halaman.equals("B7A"))
            isiText= panelKuesioner.getHalaman5().getListBlok7A().get(indeks).getValue().toString();
        else if(halaman.equals("B7B"))
            isiText= panelKuesioner.getHalaman6().getListBlok7B().get(indeks).getValue().toString();
        else if(halaman.equals("B8A1"))
            isiText=panelKuesioner.getHalaman7().getListBlok8AKol2().get(indeks).getText();
        else if(halaman.equals("B8A2"))
            isiText=panelKuesioner.getHalaman7().getListBaris26().get(indeks).getText();
        else if(halaman.equals("B8B"))
            isiText=panelKuesioner.getHalaman8().getListBlok8B().get(indeks).getText();
        else if(halaman.equals("B8C"))
            isiText=panelKuesioner.getHalaman9().getListBlok8C().get(indeks).getText();

        return isiText;
    }
    /**
     * Hampir sama dengan fungsi getText dengan 2 parameter
     * @param i digunakan untuk mengacu pada deretan list ke berapa
     * @param j digunakan untuk mengakses dari textfield yang telah dibuat list sebelumnya
     * @param halaman mengacu pada halaman dimana textfield berada
     * @return text dari textfield yang diinginkan
     */
    protected String getText(int i,int j,String halaman){
        String isiText=null;
        if(halaman.equals("Hal2"))
                isiText=panelKuesioner.getHalaman2().getListHalaman2().get(i).get(j).getText();
        else if(halaman.equals("B8A3"))
            isiText=panelKuesioner.getHalaman7().getListBlok8AKol5().get(i).get(j).getText();
        else if(halaman.equals("B8A4"))
           isiText=panelKuesioner.getHalaman7().getListBlok8AKol13().get(i).get(j).getText();
        else if(halaman.equals("B5A"))
             isiText=panelKuesioner.getListHal3().get(i).getListBlok5A().get(j).getText();
        else if(halaman.equals("B5B"))
            isiText= panelKuesioner.getListHal3().get(i).getListBlok5B().get(j).getText();
        else if(halaman.equals("B5"))
            isiText= panelKuesioner.getListHal3().get(i).getListBlok5().get(j).getText();
        else if(halaman.equals("B5C"))
            isiText= panelKuesioner.getListHal3().get(i).getListBlok5C().get(j).getText();
        else if(halaman.equals("B5D"))
            isiText= panelKuesioner.getListHal3().get(i).getListBlok5D().get(j).getText();
        else if(halaman.equals("B5E"))
            isiText= panelKuesioner.getListHal3().get(i).getListBlok5E().get(j).getText();
        else if(halaman.equals("B8B"))
            isiText= panelKuesioner.getListHal8().get(i).getListBlok8B().get(j).getText();
        else if(halaman.equals("B8C"))
            isiText=panelKuesioner.getListHal9().get(i).getListBlok8C().get(j).getText();
        return isiText;

    }

    /**
     * Untuk mendapatkan nilai dari setiap item di halaman pertama blok1
     */
    public void getBlok1(){
        String B1R1,B1R3,B1R4,B1R5,B1R6,B1R7,B1R8,B1R9;
        B1R1=getText(0, "Hal1");
        B1R3=getText(2, "Hal1");
        B1R4=getText(3, "Hal1");
        B1R5=getText(4, "Hal1");
        B1R6=getText(5, "Hal1");
        B1R7=getText(6, "Hal1");
        B1R8=getText(7, "Hal1");
        B1R9=getText(8, "Hal1");
        blok1.setB1R1(B1R1);
        blok1.setB1R3(B1R3);
        blok1.setB1R4(B1R4);
        blok1.setB1R5(B1R5);
        blok1.setB1R6(B1R6);
        blok1.setB1R7(B1R7);
        blok1.setB1R8(B1R8);
        blok1.setB1R9(B1R9);
        blok1.setNKS(getNks());
        blok1.setB3R2(getText(16, "Hal1"));
        blok1.setB3R3(getText(17, "Hal1"));
        blok1.setB3R7(getText(20, "Hal1"));
        blok1.setPengentri(DataStatic.getNimPengentry());

    }
    /**
     * Mengubah String menjadi integer
     * @param nilai
     * @return
     */
    public Integer value(String nilai){
        if (nilai==null){
            return null;
        }
        if(nilai.equals(""))
            return null;
        Integer data = new Integer(nilai);
        return data;
    }
    /**
     * Mendapatkan nilai dari setiap item di blok2 dan
     * dimasukan ke dalam model blok2
     */
    public void getBlok2(){
        blok2.setB2R1(value(getText(9, "Hal1")));
        blok2.setB2R2(value(getText(10, "Hal1")));
        blok2.setB2R3(value(getText(11, "Hal1")));
        blok2.setB2R4(value(getText(12, "Hal1")));
        blok2.setB2R5(value(getText(13, "Hal1")));
        blok2.setB2R6(value(getText(14, "Hal1")));
        blok2.setNKS(getNks());

    }
    
    /**
     * Mendapatkan nilai dari setiap item di blok4 dan
     * dimasukan ke dalam model blok4
     * @param baris digunakan untuk memasukan ke dalam baris
     */
    public void getBlok4(int baris){
        Blok4 baru=new Blok4();
        baru.setB4K2(getText(baris, 0, "Hal2"));
        baru.setB4K3(value(getText(baris, 1, "Hal2")));
        baru.setB4K4(value(getText(baris, 2, "Hal2")));
        baru.setB4K5(value(getText(baris, 3, "Hal2")));
        baru.setB4K6(value(getText(baris, 4, "Hal2")));
        baru.setB4K7(value(getText(baris, 5, "Hal2")));
        baru.setB4K8(value(getText(baris, 6, "Hal2")));
        baru.setB4K9(value(getText(baris, 7, "Hal2")));
        baru.setNKS(getNks());
        baru.setNO_URUT(baris+1);
        blok4.add(baru);
    }
    /**
     * Mendapatkan blok5a
     * @return
     */
    public void getBlok5a(int Ke){
        Blok5a baru=new Blok5a();
        //dimulai dari 1 karena 0 nama gak usah dimasukan lagi
        baru.setNKS(getNks());
        baru.setB5R1A(value(getText(Ke,1, "B5")));
        baru.setNO_URUT(value(getText(Ke,2,"B5")));
        baru.setB5R2(value(getText(Ke,3, "B5")));
        baru.setB5R3(value(getText(Ke,4, "B5")));
        baru.setB5R4A1(getText(Ke,5, "B5"));
        baru.setB5R4A2 (value(getText(Ke,6,"B5")));
        baru.setB5R4B(value(getText(Ke,7, "B5")));
        baru.setB5R4BLain(value(getText(Ke,8, "B5")));
       //untuk list 9 di skip karena nama gak usah
        baru.setB5R5(value(getText(Ke,10, "B5")));


        baru.setB5AR6A(value(getText(Ke,0, "B5A")));
        baru.setB5AR6B(value(getText(Ke,1, "B5A")));
        baru.setB5AR6C(value(getText(Ke, 2, "B5A")));
        baru.setB5AR6D(value(getText(Ke, 3, "B5A")));
        baru.setB5AR6E(value(getText(Ke, 4, "B5A")));
        baru.setB5AR6F(value(getText(Ke, 5, "B5A")));
        baru.setB5AR6G(value(getText(Ke,6, "B5A")));
        baru.setB5AR6H(value(getText(Ke,7, "B5A")));
        baru.setB5AR6HLain(value(getText(Ke,8, "B5A")));
        baru.setB5AR7(value(getText(Ke,9, "B5A")));
        baru.setB5AR8(value(getText(Ke,10, "B5A")));
        baru.setB5AR9A(value(getText(Ke,11, "B5A")));
        baru.setB5AR9B1(value(getText(Ke,12, "B5A")));
        baru.setB5AR9B2(value(getText(Ke,13, "B5A")));
        baru.setB5AR9B3(value(getText(Ke,14, "B5A")));
        baru.setB5AR9B3Lain(value(getText(Ke,15, "B5A")));
        baru.setB5AR10(value(getText(Ke,16, "B5A")));
        baru.setB5AR11A(value(getText(Ke,17, "B5A")));
        baru.setB5AR11B(value(getText(Ke,18, "B5A")));
        baru.setB5AR11C(value(getText(Ke,19, "B5A")));
        baru.setB5AR11D(value(getText(Ke,20, "B5A")));
        baru.setB5AR11E(value(getText(Ke,21, "B5A")));
        baru.setB5AR11F(value(getText(Ke,22, "B5A")));
        baru.setB5AR11G(value(getText(Ke,23, "B5A")));
        baru.setB5AR11H(value(getText(Ke,24, "B5A")));
        baru.setB5AR11Lain(value(getText(Ke,25, "B5A")));
        baru.setB5AR12(value(getText(Ke,26, "B5A")));
        baru.setB5AR13A(value(getText(Ke, 27, "B5A")));
        baru.setB5AR13B(value(getText(Ke,28, "B5A")));
        baru.setB5AR13C(value(getText(Ke,29, "B5A")));
        baru.setB5AR13D(value(getText(Ke,30, "B5A")));
        baru.setB5AR13E(value(getText(Ke,31, "B5A")));
        baru.setB5AR13F(value(getText(Ke,32, "B5A")));
        baru.setB5AR13Lain(value(getText(Ke,33, "B5A")));
        this.blok5a.add(baru);
      }
    /**
     * Mendapatkan nilai dari blok5b kemudian ditambahkan ke list blok5b
     * @param Ke
     */
    public void getBlok5b(int Ke){
        Blok5b baru=new Blok5b();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(Ke,2,"B5")));
        baru.setB5BR14A(getText(Ke, 0, "B5B"));
        baru.setB5BR14B(getText(Ke, 1, "B5B"));
        baru.setB5BR14C(getText(Ke, 2, "B5B"));
        baru.setB5BR15A(value(getText(Ke, 3, "B5B")));
        baru.setB5BR15B(value(getText(Ke, 4, "B5B")));
        baru.setB5BR16(value(getText(Ke, 5, "B5B")));
        baru.setB5BR16Lain(value(getText(Ke, 6, "B5B")));
        baru.setB5BR17_1(value(getText(Ke, 7, "B5B")));
        baru.setB5BR17_2(value(getText(Ke, 8, "B5B")));
        baru.setB5BR17_3(value(getText(Ke, 9, "B5B")));
        baru.setB5BR17_4(value(getText(Ke, 10, "B5B")));
        baru.setB5BR17_5(value(getText(Ke, 11, "B5B")));
        baru.setB5BR17_6(value(getText(Ke, 12, "B5B")));
        baru.setB5BR17_6Lain(value(getText(Ke, 13, "B5B")));
        baru.setB5BR18A(value(getText(Ke, 14, "B5B")));
        baru.setB5BR18B1(value(getText(Ke, 15, "B5B")));
        baru.setB5BR18B2(value(getText(Ke, 16, "B5B")));
        baru.setB5BR18B3(value(getText(Ke, 17, "B5B")));
        this.blok5b.add(baru);

    }
    /**
     * Mendapatkan nilai dari blok5c kemudian ditambahkan ke list blok5c
     * @param Ke
     */
    public void getBlok5c(int Ke){
        Blok5c baru=new Blok5c();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(Ke,2,"B5")));
        baru.setB5CR19(value(getText(Ke,0, "B5C")));
        baru.setB5CR20(value(getText(Ke, 1, "B5C")));
        baru.setB5CR21(value(getText(Ke, 2, "B5C")));
        baru.setB5CR22A(value(getText(Ke, 3, "B5C")));
        baru.setB5CR22B(value(getText(Ke, 4, "B5C")));
        this.blok5c.add(baru);

    }
    /**
     * Mendapatkan nilai dari blok5de kemudian ditambahkan ke list blok5de
     * @param Ke
     */
    public void getBlok5de(int Ke){
        Blok5de baru=new Blok5de();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(Ke,2,"B5")));
        baru.setB5DR23_1(value(getText(Ke,0,"B5D")));
        baru.setB5DR23_2(value(getText(Ke,1,"B5D")));
        baru.setB5DR23_3(value(getText(Ke,2,"B5D")));
        baru.setB5DR23_4(value(getText(Ke,3,"B5D")));
        baru.setB5DR23_5(value(getText(Ke,4,"B5D")));
        baru.setB5DR23Lain(value(getText(Ke,5,"B5D")));
        baru.setB5DR24(value(getText(Ke,6,"B5D")));
        baru.setB5DR25(value(getText(Ke,7,"B5D")));
        baru.setB5DR25Lengkap(getText(Ke,8,"B5D"));
        baru.setB5DR26a(value(getText(Ke,9,"B5D")));
        baru.setB5DR26b(value(getText(Ke,10,"B5D")));
        baru.setB5DR26c(value(getText(Ke,11,"B5D")));
        baru.setB5DR26d(value(getText(Ke,12,"B5D")));
        baru.setB5DR27A(value(getText(Ke,13,"B5D")));
        baru.setB5DR27ALS(value(getText(Ke,14,"B5D")));
        baru.setB5DR27B(value(getText(Ke,15,"B5D")));
        baru.setB5DR27BLain(value(getText(Ke,16,"B5D")));
        baru.setB5DR27C(value(getText(Ke,17,"B5D")));
        baru.setB5DR27D(value(getText(Ke,18,"B5D")));
        baru.setB5DR27E1(value(getText(Ke,19,"B5D")));
        baru.setB5DR27E2(value(getText(Ke,20,"B5D")));
        baru.setB5DR27E3(value(getText(Ke,21,"B5D")));
        baru.setB5DR27E4(value(getText(Ke,22,"B5D")));
        baru.setB5DR27E5(value(getText(Ke,23,"B5D")));
        baru.setB5DR27E5Lain(value(getText(Ke,24,"B5D")));
        baru.setB5DR28(value(getText(Ke,25,"B5D")));
        baru.setB5DR28Lain(value(getText(Ke,26,"B5D")));
        baru.setB5DR29A(value(getText(Ke,27,"B5D")));
        baru.setB5DR29ALS(value(getText(Ke,28,"B5D")));
        baru.setB5DR29B1(value(getText(Ke,29,"B5D")));
        baru.setB5DR29B2(value(getText(Ke,30,"B5D")));
        baru.setB5DR29B3(value(getText(Ke,31,"B5D")));
        baru.setB5DR29B4(value(getText(Ke,32,"B5D")));
        baru.setB5DR29BLain(value(getText(Ke,33,"B5D")));

        baru.setB5ER30A(value(getText(Ke,0,"B5E")));
        baru.setB5ER30ALS(value(getText(Ke,1,"B5E")));
        baru.setB5ER30B(value(getText(Ke,2,"B5E")));
        baru.setB5ER30C1(getText(Ke,3,"B5E"));
        baru.setB5ER30C2(getText(Ke,4,"B5E"));
        baru.setB5ER30C3(getText(Ke,5,"B5E"));
         this.blok5de.add(baru);
    }
/**
     * Mendapatkan nilai dari setiap item di blok6 dan
     * dimasukan ke dalam model blok6
     *
     */
    public void getBlok6(){
        blok6.setNKS(getNks());
        blok6.setB6R1(value(getText(0, "B6")));
        blok6.setB6R1BTanah(value(getText(1, "B6")));
        blok6.setB6R2(value(getText(2, "B6")));
        blok6.setB6R3A(value(getText(3, "B6")));
        blok6.setB6R3B(value(getText(4, "B6")));
        blok6.setB6R4(value(getText(5, "B6")));
        blok6.setB6R5(value(getText(6, "B6")));
        blok6.setB6R5Lain(value(getText(7, "B6")));
        blok6.setB6R6(value(getText(8, "B6")));
        blok6.setB6R6Lain(value(getText(9, "B6")));
        blok6.setB6R7(value(getText(10, "B6")));
        blok6.setB6R8(value(getText(11, "B6")));
        blok6.setB6R9(value(getText(12, "B6")));
        blok6.setB6R10(value(getText(13, "B6")));
        blok6.setB6R11(value(getText(14, "B6")));
        blok6.setB6R12(value(getText(15, "B6")));
        blok6.setB6R12Lain(value(getText(16, "B6")));
        blok6.setB6R13(value(getText(17, "B6")));
        blok6.setB6R14A(value(getText(18, "B6")));
        blok6.setB6R14B(value(getText(19, "B6")));
        blok6.setB6R14C1(value(getText(20, "B6")));
        blok6.setB6R14C2(value(getText(21, "B6")));
        blok6.setB6R14C3(value(getText(22, "B6")));
    }
    /**
     * Mendapatkan nilai dari setiap item di bloka dan
     * dimasukan ke dalam model blok8a
     *
     */
    public void getBlok7a(){
            blok7a.setNKS(getNks());
            blok7a.setB7AR1A(value(getText(0, "B7A")));
            blok7a.setB7AR1B(value(getText(1, "B7A")));
            blok7a.setB7AR2(value(getText(2, "B7A")));
            blok7a.setB7AR3A(value(getText(3, "B7A")));
            blok7a.setB7AR3B(value(getText(4, "B7A")));
            blok7a.setB7AR4(value(getText(5, "B7A")));
            blok7a.setB7AR5A(value(getText(6, "B7A")));
            blok7a.setB7AR5B(value(getText(7, "B7A")));
            blok7a.setB7AR6(value(getText(8, "B7A")));
            blok7a.setB7AR7(value(getText(9, "B7A")));
            blok7a.setB7AR8(value(getText(10, "B7A")));
            blok7a.setB7AR9(value(getText(11, "B7A")));
            blok7a.setB7AR10(value(getText(12, "B7A")));
            blok7a.setB7AR11(value(getText(13, "B7A")));
            blok7a.setB7AR12A(value(getText(14, "B7A")));
            blok7a.setB7AR12B(value(getText(15, "B7A")));
            blok7a.setB7AR13A(value(getText(16, "B7A")));
            blok7a.setB7AR13B(value(getText(17, "B7A")));
            blok7a.setB7AR13C(value(getText(18, "B7A")));
            blok7a.setB7AR14A(value(getText(19, "B7A")));
            blok7a.setB7AR14B(value(getText(20, "B7A")));
            blok7a.setB7AR15(value(getText(21, "B7A")));


    }
    /**
     * Mendapatkan nilai dari setiap item di blok8b dan
     * dimasukan ke dalam model blok8b
     *
     */
    public void getBlok7b(){
        blok7b.setNKS(getNks());
        blok7b.setB7BR16A2(value(getText(0, "B7B")));
        blok7b.setB7BR16A3(value(getText(1, "B7B")));
        blok7b.setB7BR16B2(value(getText(2, "B7B")));
        blok7b.setB7BR16B3(value(getText(3, "B7B")));
        blok7b.setB7BR16C2(value(getText(4, "B7B")));
        blok7b.setB7BR16C3(value(getText(5, "B7B")));
        blok7b.setB7BR16D2(value(getText(6, "B7B")));
        blok7b.setB7BR16D3(value(getText(7, "B7B")));
        blok7b.setB7BR17A2(value(getText(8, "B7B")));
        blok7b.setB7BR17A3(value(getText(9, "B7B")));
        blok7b.setB7BR17B2(value(getText(10, "B7B")));
        blok7b.setB7BR17B3(value(getText(11, "B7B")));
        blok7b.setB7BR17C2(value(getText(12, "B7B")));
        blok7b.setB7BR17C3(value(getText(13, "B7B")));
        blok7b.setB7BR17D2(value(getText(14, "B7B")));
        blok7b.setB7BR17D3(value(getText(15, "B7B")));
        blok7b.setB7BR17E2(value(getText(16, "B7B")));
        blok7b.setB7BR17E3(value(getText(17, "B7B")));
        blok7b.setB7BR18_2(value(getText(18, "B7B")));
        blok7b.setB7BR18_3(value(getText(19, "B7B")));
        blok7b.setB7BR19_2(value(getText(20, "B7B")));
        blok7b.setB7BR19_3(value(getText(21, "B7B")));
        blok7b.setB7BR20A2(value(getText(22, "B7B")));
        blok7b.setB7BR20A3(value(getText(23, "B7B")));
        blok7b.setB7BR20B2(value(getText(24, "B7B")));
        blok7b.setB7BR20B3(value(getText(25, "B7B")));
        blok7b.setB7BR20C2(value(getText(26, "B7B")));
        blok7b.setB7BR20C3(value(getText(27, "B7B")));
        blok7b.setB7BR20D2(value(getText(28, "B7B")));
        blok7b.setB7BR20D3(value(getText(29, "B7B")));
        blok7b.setB7BR21_2(value(getText(30, "B7B")));
        blok7b.setB7BR21_3(value(getText(31, "B7B")));
        blok7b.setB7BR22_2(value(getText(32, "B7B")));
        blok7b.setB7BR22_3(value(getText(33, "B7B")));
        //masalah
        blok7b.setB7BR23(parseDouble(panelKuesioner.getHalaman6().getListBlok7B().get(34).getText()));
        blok7b.setB7BR24(parseDouble(panelKuesioner.getHalaman6().getListBlok7B().get(35).getText()));
        blok7b.setB7BR25(parseDouble(panelKuesioner.getHalaman6().getListBlok7B().get(36).getText()));

    }
    protected Double parseDouble(String s){
        if(s.equals(""))
            return null;
       Double d=new Double(s);
       return d;
    }
      /**
     * Mendapatkan nilai dari setiap item di Blok8a1 dan
     * dimasukan ke dalam model Blok8a1
     * @param baris digunakan untuk memasukan ke dalam baris
     */
    public void getBlok8a1(int baris){
        Blok8a1 baru=new Blok8a1();
        baru.setNO_URUT(baris+1);
        baru.setNKS(getNks());
        baru.setB8AK2(value(getText(baris,"B8A1")));
        Blok8a1.add(baru);
    }
      /**
     * Mendapatkan nilai dari setiap item di Blok8a2 dan
     * dimasukan ke dalam model Blok8a2
     * @param baris digunakan untuk memasukan ke dalam baris
     */
    public void getBlok8a2(){
        Blok8a2.setNKS(getNks());
        Blok8a2.setB8AK3(value(panelKuesioner.getHalaman7().getListBaris26().get(0).getText()));
        Blok8a2.setB8AK3Lain(value(panelKuesioner.getHalaman7().getListBaris26().get(1).getText()));
        Blok8a2.setB8AK4(value(panelKuesioner.getHalaman7().getListBaris26().get(2).getText()));
        Blok8a2.setB8AK12(value(panelKuesioner.getHalaman7().getListBaris26().get(3).getText()));
    }
      /**
     * Mendapatkan nilai dari setiap item di Blok8a3&Blok8a5  dan
     * dimasukan ke dalam model Blok8a3 dan Blok8a5
     * @param baris digunakan untuk memasukan ke dalam baris
     */
   public void getBlok8a3_5(int baris){
       Blok8a3 baru=new Blok8a3();

       baru.setNKS(getNks());
       baru.setNO_URUT(baris+1);
       baru.setB8AK6(value(getText(baris, 2, "B8A3")));
       baru.setB8AK7(value(getText(baris, 3, "B8A3")));
       baru.setB8AK8(value(getText(baris, 4, "B8A3")));
       baru.setB8AK9(value(getText(baris, 5, "B8A3")));
       baru.setB8AK10(value(getText(baris, 6, "B8A3")));
       baru.setB8AK11(value(getText(baris, 7, "B8A3")));
       Blok8a3.add(baru);

       Blok8a5 baru5=new Blok8a5();
       baru5.setNKS(getNks());
       baru5.setNO_URUT(baris+1);
       baru5.setB8AK5(value(getText(baris, 0, "B8A3")));
       baru5.setB8AK5ALS(value(getText(baris, 1, "B8A3")));
       Blok8a5.add(baru5);
   }
     /**
     * Mendapatkan nilai dari setiap item di Blok8a4 dan
     * dimasukan ke dalam model Blok8a4
     * @param baris digunakan untuk memasukan ke dalam baris
     */
    public void getBlok8a4(int baris){
        Blok8a4 baru=new Blok8a4();
        baru.setNKS(getNks());
        baru.setNO_URUT(baris+1);
        baru.setB8AK13(value(getText(baris, 0, "B8A4")));
        baru.setB8AK13ALS(value(getText(baris, 1, "B8A4")));
        Blok8a4.add(baru);
    }
  /**
     * Mendapatkan nilai dari setiap item di Blok8b dan
     * dimasukan ke dalam model Blok8b
     * @param baris digunakan untuk memasukan ke dalam baris
     */
    public void getBlok8b(int Ke){
        Blok8b baru=new Blok8b();
        baru.setNO_URUT(value(getText(Ke,1,"B8B")));
        baru.setNKS(getNks());
        baru.setB8BR1(value(getText(Ke,2,"B8B")));
        baru.setB8BR2(value(getText(Ke,3,"B8B")));
        baru.setB8BR3(value(getText(Ke,4,"B8B")));
        baru.setB8BR4(value(getText(Ke,5,"B8B")));
        baru.setB8BR5(value(getText(Ke,6,"B8B")));
        baru.setB8BR6(value(getText(Ke,7,"B8B")));
        baru.setB8BR7(value(getText(Ke,8,"B8B")));
        baru.setB8BR8(value(getText(Ke,9,"B8B")));
        baru.setB8BR9(value(getText(Ke,10,"B8B")));
        baru.setB8BR10(value(getText(Ke,11,"B8B")));
        baru.setB8BR11(value(getText(Ke,12,"B8B")));
        baru.setB8BR12(value(getText(Ke,13,"B8B")));
        baru.setB8BR13(value(getText(14,"B8B")));
        baru.setB8BR14(value(getText(15,"B8B")));
        baru.setB8BR15(value(getText(16,"B8B")));
        baru.setB8BR16(value(getText(17,"B8B")));
        Blok8b.add(baru);
}
/**
     * Mendapatkan nilai dari setiap item di Blok8c dan
     * dimasukan ke dalam model Blok8c
     * @param baris digunakan untuk memasukan ke dalam baris
     */
public void getBlok8c(int Ke){
        Blok8c baru=new Blok8c();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(Ke,2,"B8C")));
        baru.setNO_URUTBAYI(value(getText(Ke,3,"B8C")));
        baru.setB8CR1(value(getText(Ke,4,"B8C")));
        baru.setB8CR2(value(getText(Ke,5,"B8C")));
        baru.setB8CR3(value(getText(Ke,6,"B8C")));
        baru.setB8CR4(value(getText(Ke,7,"B8C")));
        baru.setB8CR5(value(getText(Ke,8,"B8C")));
        baru.setB8CR6(value(getText(Ke,9,"B8C")));
        baru.setB8CR7(value(getText(Ke,10,"B8C")));
        baru.setB8CR8(value(getText(Ke,11,"B8C")));
        baru.setB8CR9(value(getText(Ke,12,"B8C")));
        baru.setB8CR10(value(getText(Ke,13,"B8C")));
        baru.setB8CR11(value(getText(Ke,14,"B8C")));
        baru.setB8CR12(value(getText(Ke,15,"B8C")));
        baru.setB8CR13(value(getText(Ke,16,"B8C")));
        baru.setB8CR14(value(getText(Ke,17,"B8C")));
        baru.setB8CR15(value(getText(Ke,18,"B8C")));
        baru.setB8CR16(value(getText(Ke,19,"B8C")));
        baru.setB8CR17(value(getText(Ke,20,"B8C")));
        baru.setB8CR18(value(getText(Ke,21,"B8C")));
        Blok8c.add(baru);
}

    public List<Blok8a3> getBlok8a3() {
        return Blok8a3;
    }

    public void setBlok8a3(List<Blok8a3> Blok8a3) {
        this.Blok8a3 = Blok8a3;
    }

    public void setBlok8c(List<Blok8c> Blok8c) {
        this.Blok8c = Blok8c;
    }

    /**
     * Memyimpan object entity dan list entity ke dalam List<Object>
     * untuk dipakai dalam setForm
     * @return
     */
    public List<Object> getListEntity(){
        List<Object> list = new ArrayList<Object>();
        list.add(blok1);
        list.add(blok2);
        list.add(blok4);
        list.add(blok5a);
        list.add(blok5b);
        list.add(blok5c);
        list.add(blok5de);
        list.add(blok6);
        list.add(blok7a);
        list.add(blok7b);
        list.add(Blok8a1);
        list.add(Blok8a2);
        list.add(Blok8a3);
        list.add(Blok8a4);
        list.add(Blok8a5);
        list.add(Blok8b);
        list.add(Blok8c);
        return list;
    }

    /**
     * Memdapatkan data dari database
     * @param NKS
     */
    public void getDataFromDB(String NKS){

        try {
            connection.setAutoCommit(false);
            blok1 = blok1Dao.getBlok1(NKS);
            blok2 = blok2Dao.getBlok2(NKS);
            for(int i=0;i<blok2.getB2R1();i++){
                blok4.add(blok4Dao.getBlok4(NKS, i+1));
                blok5a.add(blok5aDao.getBlok5a(NKS, i+1));
            }
            blok5b = blok5bDao.getAllBlok5b(NKS);
            blok5c = blok5cDao.getAllBlok5c(NKS);
            blok5de = blok5deDao.getAllBlok5de(NKS);
            blok6 = blok6Dao.getBlok6(NKS);
            blok7a = blok7aDao.getBlok7a(NKS);
            blok7b = blok7bDao.getBlok7b(NKS);
            Blok8a1 = blok8a1Dao.getAllBlok8a1(NKS);
            Blok8a2 = blok8a2Dao.getBlok8a2(NKS);
            Blok8a3 = blok8a3Dao.getAllBlok8a3(NKS);
            Blok8a4 = blok8a4Dao.getAllBlok8a4(NKS);
            Blok8a5 = blok8a5Dao.getAllBlok8a5(NKS);
            Blok8b = blok8bDao.getAllBlok8b(NKS);
            Blok8c = blok8cDao.getAllBlok8c(NKS);
            connection.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
