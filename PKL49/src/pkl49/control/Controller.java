/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.control;

import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pkl49.component.GlassPane;
import pkl49.component.TextField;
import pkl49.database.Blok1DaoImpl;
import pkl49.database.KoneksiMysQl;
import pkl49.database.KuesionerDaoImpl;
import pkl49.database.PodesDaoImpl;
import pkl49.database.dao.Blok1Dao;
import pkl49.database.entity.Blok1;
import pkl49.database.entity.Podes;
import pkl49.view.FormUtama;
import pkl49.view.LoginForm;
import pkl49.view.PanelInput;
import pkl49.view.PanelInputNKD;
import pkl49.view.PanelKuesioner;
import pkl49.view.PanelKuesionerPodes;
import pkl49.view.PanelProgress;

/**
 *
 * @author Ken
 */
public class Controller {

    //Ini buat forward n backward navigation
    private static int status = 0;
    private static int statusHal3 = 0;
    private static int statusHal8 = 0;
    private static int statusHal9 = 0;
    private static String nama[] = {"Halaman1","Halaman2","Halaman3_1","Halaman4","Halaman5","Halaman6","Halaman7","Halaman8_1","Halaman9_1",};
    private static String namaHal3[] = {"Halaman3_1","Halaman3_2","Halaman3_3","Halaman3_4",
            "Halaman3_5","Halaman3_6","Halaman3_7","Halaman3_8","Halaman3_9","Halaman3_10",
            "Halaman3_11","Halaman3_12","Halaman3_13","Halaman3_14","Halaman3_15","Halaman3_16",
            "Halaman3_17","Halaman3_18","Halaman3_19","Halaman3_20","Halaman3_21","Halaman3_22",
            "Halaman3_23","Halaman3_24","Halaman3_25"};
    private static String namaHal8[] = {"Halaman8_1","Halaman8_2","Halaman8_3","Halaman8_4",
            "Halaman8_5","Halaman8_6","Halaman8_7","Halaman8_8","Halaman8_9","Halaman8_10"};
    private static String namaHal9[] = {"Halaman9_1","Halaman9_2","Halaman9_3","Halaman9_4",
            "Halaman9_5"};
    private static int jumlahHal3=1;
    private static int jumlahHal8=1;
    private static int jumlahHal9=1;

    public static void setJumlahHal3(int jumlahHal3) {
        Controller.jumlahHal3 = jumlahHal3;
    }

    public static void setJumlahHal8(int jumlahHal8) {
        Controller.jumlahHal8 = jumlahHal8;
    }

    public static void setJumlahHal9(int jumlahHal9) {
        Controller.jumlahHal9 = jumlahHal9;
    }

    public static void setStatus(int status) {
        Controller.status = status;
    }

    public static void setStatusHal3(int statusHal3) {
        Controller.statusHal3 = statusHal3;
    }

    public static void setStatusHal8(int statusHal8) {
        Controller.statusHal8 = statusHal8;
    }

    public static void setStatusHal9(int statusHal9) {
        Controller.statusHal9 = statusHal9;
    }

    /**
     * Untuk login
     * @param login
     */
    public static void login(LoginForm login){
        String passwordUser = "apa";
        String nim = login.getTxtNim().getText();
        String password = new String(login.getTxtPassword().getPassword());
        if(DataStatic.getTabelPengentry().get(nim)==null){
            login.getLabelPesan().setText("NIM Anda Salah!");
            login.getTxtNim().requestFocusInWindow();
        } else if(!password.equals(passwordUser)){
            login.getLabelPesan().setText("Password Anda Salah!");
            login.getTxtPassword().requestFocusInWindow();
        } else{
            login.getLabelPesan().setText("Login successfull...");
            DataStatic.setNimPengentry(nim);
            login.dispose();
            login.getFormUtama().setVisible(true);
        }
    }

    /**
     *
     * @param form
     * @param kues
     * @param key
     */
    public static void showProgress(FormUtama form, PanelKuesioner kues, String key){
        PanelProgress progress = new PanelProgress();
        progress.setKuesioner(kues);
        progress.setKey(key);
        form.setGlassPane(progress);
        form.getGlassPane().setVisible(true);
        progress.execute();
    }


    /************************************/
    /*      KUESIONER RUMAH TANGGA      */
    /************************************/
    
    /**
     * Menyimpan data ke dbms
     * @param k
     */
    public static int simpanKuesioner(PanelKuesioner k){
        KuesionerDaoImpl dao = new KuesionerDaoImpl(k);
        int stat = dao.insertToDatabase();
        if(stat==1){
            reset(k);
            showPanel(k, "Halaman1");
        }
        return stat;
    }
    
    /**
     * Update data ke database
     * @param k
     */
    public static int update(PanelKuesioner k){
        return new KuesionerDaoImpl(k).updateToDatabase();
    }

    /**
     * Fungsi untuk menampilkan data dalam kuesioner
     * @param k
     * @param i
     */
    public static void setForm(PanelKuesioner kuesioner, PanelInput panelInput){
        String nks = panelInput.getNKS();

        //Cek dulu apakah dalam database ada data dengan NKS di atas.
        Blok1Dao blok1Dao = new Blok1DaoImpl(KoneksiMysQl.getConnectionRT());
        Blok1 blok1 = null;
        try {
            blok1 = blok1Dao.getBlok1(nks);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(nks.equals("")){
            JOptionPane.showMessageDialog(kuesioner, "Isi Dulu nomor kode sampel!");
            panelInput.getTxtB1R1().requestFocusInWindow();
        }else if(blok1==null){
            JOptionPane.showMessageDialog(kuesioner, "Nomor kode sampel salah!");
            panelInput.getTxtB1R1().requestFocusInWindow();
        }else{
            DataStatic.setNKSForUpdate(nks);
            FormUtil.setKuesioner(kuesioner, nks);
            kuesioner.getBtnSimpan().setText("Update");
            panelInput.showPanel(kuesioner, "KuesionerRT");
            panelInput.getParent().setVisible(false);
            kuesioner.getHalaman1().getListHalaman1().get(0).requestFocusInWindow();
        }
    }

    /**
     * mereset form
     * @param k
     */
    public static void reset(PanelKuesioner k){
        FormUtil.resetKuesioner(k);
        k.getHalaman1().getListHalaman1().get(0).requestFocusInWindow();
        k.getBtnSimpan().setEnabled(false);
        k.getBtnSimpan().setText("Save");
        
    }
  

    /*******************************************/
    /*                  PODES                  */
    /*******************************************/
     /**
     * reset form podes
     * @param podes
     */
    public static void resetPodes(PanelKuesionerPodes podes){
        FormUtil.resetKuesionerPodes(podes);
        podes.getBtnSave().setText("Save");
        podes.setEnabled(false);
        podes.getListBlok1().get(0).requestFocusInWindow();
    }
   /**
     * Menyimpan data podes ke dalama dbms
     * @param podes
     */
    public static void simpanPodes(PanelKuesionerPodes podes){
        PodesDaoImpl p = new PodesDaoImpl(podes,KoneksiMysQl.getConnectionPodes());//pake dua konstruktor
        try {
            p.insertPodes();
            JOptionPane.showMessageDialog(podes, "Data berhasil disimpan!");
            resetPodes(podes);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * set form podes dengan data dri dbms
     * @param podes
     * @param NKD
     */
    public static void setFormPodes(PanelKuesionerPodes podes, PanelInputNKD NKD){
        if(NKD.getNKD().equals("")){
            JOptionPane.showMessageDialog(podes, "Isi Dulu nomor kode desa!");
            NKD.getTxtB1R1().requestFocusInWindow();
            return;
        }
        try {
            Podes p = null;
            PodesDaoImpl dao = new PodesDaoImpl(podes,KoneksiMysQl.getConnectionPodes());
            p = dao.getPodes(NKD.getNKD());
            if(p==null){
                JOptionPane.showMessageDialog(podes, "Nomor kode desa tidak ada/belum dientry!");
                return;
            }
            NKD.setVisible(false);
            ControlMenu.entryPodes(NKD.getFormUtama());
            FormUtil.setHalamanPodes(podes, p);
            podes.getBtnSave().setText("Update");
            podes.getBtnSave().setEnabled(true);
            podes.getListBlok1().get(0).requestFocusInWindow();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * update data podes ke database
     * @param podes
     */
    public static void updatePodes(PanelKuesionerPodes podes){
        PodesDaoImpl dao = new PodesDaoImpl(podes,KoneksiMysQl.getConnectionPodes());
        try {
            dao.updatePodes();
            JOptionPane.showMessageDialog(podes, "Data berhasil diupdate!");
            podes.getListBlok1().get(0).requestFocusInWindow();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    /********************************************************/
    /*              CONTROL MENU                           */
    /********************************************************/

    /**
     * Untuk pindah ke halaman selanjutnya
     * @param k
     */
    public static void forward(PanelKuesioner k){
        try{
            if(status==0){
                if(!cekEmpty(k.getHalaman2().getListHalaman2().get(0).get(0))){
                    status++;
                    showPanel(k, nama[status]);
                }
            }else if(status==1){
                if(!cekEmpty(k.getHalaman3_1().getListBlok5().get(0))){
                    status++;
                    showPanel(k,namaHal3[0]);
                }
            }else if(status==2){
                if(!cekEmpty(k.getListHal3().get(statusHal3).getListBlok5().get(0))){
                    if(statusHal3<jumlahHal3-1 ){
                        statusHal3++;
                        showPanel(k, namaHal3[statusHal3]);
                    }else{
                        if(!cekEmpty(k.getHalaman4().getListBlok6().get(0))){
                            status++;
                            showPanel(k, nama[status]);
                        }
                    }
                }
            }else if(status==3){
                if(!cekEmpty(k.getHalaman5().getListBlok7A().get(0))){
                    status++;
                    showPanel(k,nama[status]);
                }
            }else if(status==4){
                if(!cekEmpty(k.getHalaman6().getListBlok7B().get(0))){
                    status++;
                    showPanel(k,nama[status]);
                }
            }else if(status==5){
                if(!cekEmpty(k.getHalaman7().getListBlok8AKol2().get(0))){
                    status++;
                    showPanel(k,nama[status]);
                }
            }else if(status==6){
                if(!cekEmpty(k.getListHal8().get(0).getListBlok8B().get(2))){
                    status++;
                    showPanel(k,namaHal8[0]);
                }
            }else if(status==7){
                if(!cekEmpty(k.getListHal9().get(0).getListBlok8C().get(2))){
                    if(statusHal8<jumlahHal8-1){
                        statusHal8++;
                        showPanel(k,namaHal8[statusHal8]);
                    }else{
                        if(!cekEmpty(k.getListHal9().get(0).getListBlok8C().get(0))){
                            status++;
                            showPanel(k,namaHal9[0]);
                        }
                    }
                }
            }else if(status==8){
                if(!cekEmpty(k.getHalaman9().getListBlok8C().get(1))){
                    if(statusHal9<jumlahHal9-1){
                        statusHal9++;
                        showPanel(k,namaHal9[statusHal9]);
                    }else{

                    }
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        

    }
    /**
     * untuk pindah ke halaman sebelumnya
     * @param k
     */
    public static void backward(PanelKuesioner k){
        try{
            if(status==8){
                if(statusHal9==0){
                    status=7;
                    showPanel(k,namaHal8[jumlahHal8-1]);
                    statusHal8=jumlahHal8-1;
                }else{
                    statusHal9--;
                    showPanel(k, namaHal9[statusHal9]);
                }
            }else if(status==7){
                if(statusHal8==0){
                    status=6;
                    showPanel(k,nama[status]);
                }else{
                    statusHal8--;
                    showPanel(k, namaHal8[statusHal8]);
                }
                System.out.println(statusHal8);
            }else if(status==6 || status==5||status==4){
                status--;
                showPanel(k,nama[status]);
            }else if(status==3){
                status--;
                showPanel(k,namaHal3[jumlahHal3-1]);
            }else if(status==2){
                if(statusHal3==0){
                    status--;
                    showPanel(k, nama[status]);
                }else{
                    statusHal3--;
                    showPanel(k, namaHal3[statusHal3]);
                }
            }else if(status==1){
                status--;
                showPanel(k,nama[status]);
            }else if(status==0){

            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        
    }

    //Fungsi-fungsi bantu

    /**
     * Cek apakah textfield t kosong ato tidak
     * @param t TextField
     * @return bernilai benar jika kosong
     */
    private static boolean cekEmpty(TextField t){
        if(t.getText().trim().equals(""))
            return true;
        else return false;
    }
    /**
     * Menampilkan halaman pada cardLayout
     * @param panel
     * Panel yang akan ditampilkan
     * @param nama
     * Nama panel
     */
    public static void showPanel(PanelKuesioner kuesioner, String nama){
        ((CardLayout)kuesioner.getPanelInduk().getLayout()).show(kuesioner.getPanelInduk(), nama);
    }

}
