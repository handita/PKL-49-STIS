/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.view.PanelKuesioner;

/**
 *
 * @author pengolahan_angkatan49
 */
/***********************************************************************************************************/
/***********************************************************************************************************/
/***********************************************************************************************************/
/***********************************************************************************************************/
/***********************************************************************************************************/
/****                                                                                                   ****/
/****                                                                                                   ****/
/****                       Jika ingin mempelajari source code program ini                              ****/
/****                  Diharapkan anda mempelajari kuesioner PKL STIS angkatan 49                       ****/
/****            Mengenai  : Kajian Strategis Kesehatan dan Pandidikan di Sumatera Selatan              ****/
/****           Karena semua hal yang ada dalam source code ini berhubungan dengan kuesioner            ****/
/****     Akan sangat sulit bagi anda jika belum mengerti dan memahami isi dari kuesioner tersebut      ****/
/****                                        Terima Kasih...^-^                                         ****/
/****                                                                                                   ****/
/****                                     PENGOLAHAN ANGKATAN 49                                        ****/
/****                                                                                                   ****/
/****                                                                                                   ****/
/****   GOOD MORNING TECHNOLOGY                                                                         ****/
/***********************************************************************************************************/
/***********************************************************************************************************/
/***********************************************************************************************************/
/***********************************************************************************************************/
/***********************************************************************************************************/




/**
 * Pada class ini, terdapat dua jenis validasi, yaitu validasi yang akan dieksekusi dengan
 * KeyReleased dan dieksekusi dengan KeyPressed
 * KeyPressed adalah validasi yang akan dieksekusi pada saat penekanan tombol di keyboard
 * Sedangkan Keyreleased adalah validasi yang akan dieksekusi yang akan dieksekusi pada
 * saat melepaskan tombol keyboard
 * Pada class ini, semua nama method yang diakhiri dengan huruf "E"(E besar, tidak berlaku dengan e kecil)
 * adalah method yang akan dieksekusi dengan keyPressed jika tidak, maka sebaliknya
 * Selamat belajar......
 * @author Pengolahan_angkatan49
 */

public class validasiBlok56UpGrade extends KeyAdapter{
    private List<TextField> listBlok5, listBlok5A, listBlok5B, listBlok5C, listBlok5D,listBlok5E, listBlok6;
    private PanelKuesioner kues;
    private String T="Data yang anda masukkan belum lengkap, silahkan lengkapi data anda";
    private String E="Nilai yang anda masukkan salah, silahkan perbaiki";
    private String K="Nilai yang anda masukkan tidak konsisten dengan data sebelumnya, silahkan perbaiki";
    private String B="Nilai yang anda masukkan melewati batas, silahkan perbaiki";
    private String JK="Jenis Kelamin Ibu tidak mungkin laki-laki";
    private String U="Umurnya tidak konsisten dengan umur anak";
    private static int JmlahART=1;
    private String namanya;

    /**
     * Mengembalikan nilai dari JmlahART
     * @return
     */
    public static int getJmlahART() {
        return JmlahART;
    }

    public static void setJmlahART(int JmlahART) {
        validasiBlok56UpGrade.JmlahART = JmlahART;
    }

    /**
     * Konstruktor
     * @param kues
     */
    public validasiBlok56UpGrade(PanelKuesioner kues) {
        this.kues = kues;
    }

    public validasiBlok56UpGrade(){

    }

    /**
     * Mendaftarkan objek-objek pada halaman 3 ke KeyListener
     * @param B5
     * @param B5A
     * @param B5B
     * @param B5C
     * @param B5D
     * @param B5E
     */
    public void Blok5(List<TextField> B5, List<TextField> B5A,List<TextField> B5B, List<TextField> B5C
            ,List<TextField> B5D, List<TextField> B5E){
        listBlok5=B5;
        listBlok5A=B5A;
        listBlok5B=B5B;
        listBlok5C=B5C;
        listBlok5D=B5D;
        listBlok5E=B5E;
        for(int i=0;i<listBlok5.size();i++)
            listBlok5.get(i).addKeyListener(this);
        for(int i=0;i<listBlok5A.size();i++)
            listBlok5A.get(i).addKeyListener(this);
        for(int i=0;i<listBlok5B.size();i++)
            listBlok5B.get(i).addKeyListener(this);
        for(int i=0;i<listBlok5C.size();i++)
            listBlok5C.get(i).addKeyListener(this);
        for(int i=0;i<listBlok5D.size();i++)
            listBlok5D.get(i).addKeyListener(this);
        for(int i=0;i<listBlok5E.size();i++)
            listBlok5E.get(i).addKeyListener(this);
    }

    /**
     * mendaftarkan objek-objek pada halaman 4/blok6 ke KeyListener
     * @param ini
     */
    public void Blok6(List<TextField> ini){
        listBlok6=ini;
        for(int i=0;i<listBlok6.size();i++)
            listBlok6.get(i).addKeyListener(this);
    }

     /**
     * Menampilkaun pesan error
     * @param itu pesan yang akan ditampilkan
     */
    public void Pesan(String itu){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, itu);
    }

    /**
     * Mengetahui apakah user sedang memencet enter/ bawah/atas
     * Jika ya, maka akan dikembalikan nilai false
     * @param e
     * @return
     */
    public boolean pencet(KeyEvent e){
       if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN||e.getKeyCode()==KeyEvent.VK_UP)
           return false;
       else
           return true;
    }

    /**
     * Untuk mengetahui apakah ada data yang kosong
     * @param ini
     * @param indeks
     * @return
     */
    public Integer periksa(List<TextField> ini, int indeks){
        Integer lokasi=null;
        for(int i=0;i<indeks;i++){
            if(ini.get(i).isEnabled() && ini.get(i).getText().equals("")){
                lokasi=i;
                break;
            }
        }
        return lokasi;
    }

    public void setKosong(List<TextField> ini, int indeks, int tujuan){
        for(int i=indeks+1;i<tujuan;i++){
            ini.get(i).setText("");
            ini.get(i).setEnabled(false);
        }
        ini.get(tujuan).requestFocusInWindow();
    }

    public void setKosongBlok(List<TextField> ini, int indeks, List<TextField> itu){
        for(int i=indeks+1;i<ini.size();i++){
            ini.get(i).setText("");
            ini.get(i).setEnabled(false);
        }
        itu.get(0).requestFocusInWindow();

    }

    /**
     * Untuk melakukan perpindahan ke halaman sebelumnya
     * @param e
     * @param ini
     */
    public void halAtas(KeyEvent e, List<TextField> ini){
        if(e.getComponent().equals(ini.get(0))){
            if(e.getKeyCode()==KeyEvent.VK_UP){
                if(ini.equals(listBlok5)){
                    if(JmlahART==1){
                        showPanel(kues.getHalaman2(), "Halaman2");
                        kues.getHalaman2().getListHalaman2().get(0).get(1).requestFocusInWindow();
                    }
                    else{
                        namanya="Halaman3_"+(JmlahART-1);
                        showPanel(kues.getListHal3().get(JmlahART), namanya);
                        JmlahART--;
                        kues.getListHal3().get(JmlahART-1).getListBlok5().get(0).requestFocusInWindow();
                    }
                }
                else if(ini.equals(listBlok6)){
                    namanya="Halaman3_"+JmlahART;
                    showPanel(kues.getListHal3().get(JmlahART+1),namanya);
                    kues.getListHal3().get(JmlahART-1).getListBlok5().get(0).requestFocusInWindow();
                }
            }
        }
    }

    /**
     * Validasi jika panjang textField=panjang hurufnya
     * @param e
     * @param awal
     * @param tujuan
     */
    public void Biasa(KeyEvent e,List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyChar()>=ini.get(indeks).getMinDigit() && e.getKeyChar()<=ini.get(indeks).getMaxDigit()){
                if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&& pencet(e))
                    ini.get(indeks+1).requestFocusInWindow();
            }
        }
    }

    public void skip1Method(List<TextField> ini, int indeks, int tujuan, String kondisi){
        if(ini.get(indeks).getText().equals(kondisi)){
            setKosong(ini, indeks, tujuan);
        }
        else{
            for(int i=indeks+1;i<tujuan;i++)
                ini.get(i).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }
    /**
     * Melakukan skip jika kondisinya memenuhi
     * @param e
     * @param ini
     * @param indeks
     * @param tujuan
     * @param kondisi
     */
    public void skip1(KeyEvent e, List<TextField> ini, int indeks, int tujuan, String kondisi){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                skip1Method(ini, indeks, tujuan, kondisi);
            }
        }
    }

    /**
     * Melakukan skip jika kondisinya memenuhi
     * Dilakukan jika tekan Enter/bawah
     * @param e
     * @param ini
     * @param indeks
     * @param tujuan
     * @param kondisi
     */
    public void skip1E(KeyEvent e, List<TextField> ini, int indeks, int tujuan, String kondisi){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                skip1Method(ini, indeks, tujuan, kondisi);
            }
        }
    }

    public void skip2Method(List<TextField> ini, int indeks, int tujuan, String kondisi)
    {
        if(!ini.get(indeks).getText().equals(kondisi)){
            setKosong(ini, indeks, tujuan);
        }
        else{
            for(int i=indeks+1;i<tujuan;i++)
                ini.get(i).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }
     /**
     * Melakukan skip jika kondisinya tidak memenuhi
     * @param e
     * @param ini
     * @param indeks
     * @param tujuan
     * @param kondisi
     */
    public void skip2(KeyEvent e, List<TextField> ini, int indeks, int tujuan, String kondisi){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                skip2Method(ini, indeks, tujuan, kondisi);
            }
        }
    }

     /**
     * Melakukan skip jika kondisinya tidak memenuhi
      * Dilakukan jika melakukan penekanan enter/bawah
     * @param e
     * @param ini
     * @param indeks
     * @param tujuan
     * @param kondisi
     */
    public void skip2E(KeyEvent e, List<TextField> ini, int indeks, int tujuan, String kondisi){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                skip2Method(ini, indeks, tujuan, kondisi);
            }
        }
    }


    public void skip2LainMethod(List<TextField> ini, int indeks, int tujuan, String kondisi, int indeksNoUrut){
        int noUrut=ini.get(indeksNoUrut).getInt();
        int jKelamin=kues.getHalaman2().getListHalaman2().get(noUrut-1).get(2).getInt();
        if(!ini.get(indeks).getText().equals(kondisi)){
            if(ini.get(indeks).getInt()==5){
                if(kues.getHalaman2().getListHalaman2().get(noUrut-1).get(1).getInt()!=8){
                    Pesan(K);
                    ini.get(indeks).requestFocusInWindow();
                }
                else{
                    for(int i=indeks+1;i<tujuan-1;i++){
                        ini.get(i).setText("");
                        ini.get(i).setEnabled(false);
                    }
                    ini.get(tujuan).requestFocusInWindow();
                }
            }
            else{
                if(jKelamin==2&& ini.get(indeks).getText().equals("2")){
                    Pesan(K);
                    ini.get(indeks).requestFocusInWindow();
                }
                else if(jKelamin==1&&ini.get(indeks).getText().equals("1")){
                    Pesan(K);
                    ini.get(indeks).requestFocusInWindow();
                }
                ////////////////////////////////////////////
                else if(kues.getHalaman2().getListHalaman2().get(noUrut-1).get(1).getInt()==8){
                    if(ini.get(indeks).getInt()!=5){
                        Pesan(K);
                        ini.get(indeks).requestFocusInWindow();
                    }
                }
                /////////////////////////////////////////////
                else{
                    for(int i=indeks+1;i<tujuan-1;i++){
                        ini.get(i).setText("");
                        ini.get(i).setEnabled(false);
                    }
                    ini.get(tujuan).requestFocusInWindow();
                }
            }
        }
        else{
            for(int i=indeks+1;i<tujuan;i++)
                ini.get(i).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }
     /**
     * Melakukan skip jika kondisinya tidak memenuhi
     * @param e
     * @param ini
     * @param indeks
     * @param tujuan
     * @param kondisi
     */
    public void skip2lain(KeyEvent e, List<TextField> ini, int indeks, int tujuan, String kondisi, int indeksNoUrut){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
               skip2LainMethod(ini, indeks, tujuan, kondisi, indeksNoUrut);
            }
        }
    }

     /**
     * Melakukan skip jika kondisinya tidak memenuhi
      * Dilakukan jika melakukan penekanan enter/bawah
     * @param e
     * @param ini
     * @param indeks
     * @param tujuan
     * @param kondisi
     */
    public void skip2lainE(KeyEvent e, List<TextField> ini, int indeks, int tujuan, String kondisi,int indeksNoUrut){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                skip2LainMethod(ini, indeks, tujuan, kondisi, indeksNoUrut);
            }
        }
    }

    /**
     * Untuk melakukan perpindahan ke blok selanjutnya
     * Dilakukan jika panjang text==panjang textField
     * @param e
     * @param ini
     * @param indeks
     * @param itu
     */
    public void BiasaBlok(KeyEvent e, List<TextField> ini, int indeks, List<TextField> itu){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getText().length()==ini.get(indeks).getLength() && pencet(e)){
                if(periksa(ini, indeks)!=null){
                    Pesan(T);
                    ini.get(periksa(ini, indeks)).requestFocusInWindow();
                }
                else{
                    setKosongBlok(ini, indeks, itu);
                }
            }
        }
    }

    /**
     * Untuk melakukan perpindahan ke blok selanjutnya
     * Dilakukan jika melakukan penekanan pada enter/tombol bawah
     * @param e
     * @param ini
     * @param indeks
     * @param itu
     */
    public void BiasaBlokE(KeyEvent e, List<TextField> ini, int indeks,List<TextField> itu){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                if(!ini.get(indeks).getText().equals("")){
                    if(periksa(ini, indeks)!=null){
                        Pesan(T);
                        ini.get(periksa(ini, indeks)).requestFocusInWindow();
                    }
                    else{
                        setKosongBlok(ini, indeks, itu);
                    }
                }
            }
        }
    }

    public void endB5CMethod(List<TextField> ini, int indeks){
        int umur=listBlok5.get(1).getInt();
        if(umur>=15){
            listBlok5D.get(0).requestFocusInWindow();
        }
        else{
            if(periksa(ini, indeks)==null){
                int banding=Integer.parseInt(kues.getHalaman1().getTxtB2R1().getText());
                if(JmlahART<banding){
                    // simpan data
                    ///////////////////////////////////////////////////////////
//                        kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
//                        kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
                    namanya="Halaman3_"+(JmlahART+1);
                      showPanel(kues.getListHal3().get(JmlahART), namanya);
                      Controller.setStatus(2);
                      Controller.setStatusHal3(JmlahART);
                      Controller.setJumlahHal3(banding);
                     // Controller.cleartHal3_4(kues);
                        kues.getListHal3().get(JmlahART).getListBlok5().get(0).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(0).getText());
                        kues.getListHal3().get(JmlahART).getListBlok5().get(1).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(3).getText());
                        JmlahART++;
                        kues.getListHal3().get(JmlahART-1).getListBlok5().get(2).setText(String.valueOf(JmlahART));
                        kues.getListHal3().get(JmlahART-1).getListBlok5().get(3).requestFocusInWindow();
                }
                else{
                    //Simpan data
                   // kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
                   // kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
                    showPanel(kues.getHalaman4(), "Halaman4");
                    Controller.setStatus(3);
                    kues.getHalaman4().getListBlok6().get(0).requestFocusInWindow();
                }
            }
            else{
                Pesan(T);
                ini.get(periksa(ini, indeks)).requestFocusInWindow();
            }
        }
    }
    /**
     * validasi untuk mengakhiri blok 5C
     * Dilakukan jika panjang TextField==panjang text
     * @param e
     * @param ini
     * @param indeks
     */
    public void endB5C(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e)){
                endB5CMethod(ini, indeks);
            }
        }
    }

    /**
     * validasi untuk mengakhiri blok 5C
     * Dilakukan jika melakukan penekanan enter/tombol bawah
     * @param e
     * @param ini
     * @param indeks
     */
    public void endB5CE(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e)){
                endB5CMethod(ini, indeks);
            }
        }
    }

    public void cekDuluBlokMethod(List<TextField> ini, int indeks, int indeksnama, List<TextField> itu){
        int atas=kues.getHalaman1().getTxtB2R1().getInt();
        int sekarang=ini.get(indeks).getInt();
        String nama=ini.get(indeksnama).getText();
        if(sekarang>atas || sekarang<=0){
            Pesan(K);
            ini.get(indeks).requestFocusInWindow();
        }
        else{
//                    if(!kues.getHalaman2().getList().get(0).get(sekarang-1).getText().equals(nama)){
//                        Pesan(K);
//                        ini.get(indeksnama).requestFocusInWindow();
//                    }
//                    else{

                ini.get(indeksnama).setText(kues.getHalaman2().getListHalaman2().get(sekarang-1).get(0).getText());
                if(periksa(ini, indeks)==null){
                    itu.get(0).requestFocusInWindow();
                }
                else{
                    Pesan(T);
                    ini.get(periksa(ini, indeks)).requestFocusInWindow();
                }
//                    }
        }
    }
    /**
     * Melakukan skip ke blok selanjutnya
     * Tapi mengecek nilai yang ada pada TextField tsb
     * Jika nilai nya cocok/ konsisten baru bisa di skip
     * @param ini
     * @param indeks
     * @param itu
     */
    public void cekDuluBlok(KeyEvent e,List<TextField> ini,int indeks,int indeksnama,List<TextField> itu){
       if(e.getComponent().equals(ini.get(indeks))){
           if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                cekDuluBlokMethod(ini, indeks, indeksnama, itu);
            }
       }
    }

    /**
     * Melakukan skip ke blok selanjutnya
     * Tapi mengecek nilai yang ada pada TextField tsb
     * Jika nilai nya cocok/ konsisten baru bisa di skip
     * Dilakukan bila menekan enter/bawah
     * @param ini
     * @param indeks
     * @param itu
     */
    public void cekDuluBlokE(KeyEvent e,List<TextField> ini,int indeks,int indeksnama,List<TextField> itu){
       if(e.getComponent().equals(ini.get(indeks))){
           if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                cekDuluBlokMethod(ini, indeks, indeksnama, itu);
            }
       }
    }


    public void cekARTBiasaMethod(List<TextField> ini, int indeks, int indeksnama){
      int atas=kues.getHalaman1().getTxtB2R1().getInt();
        int sekarang=ini.get(indeks).getInt();
    //                String nama=ini.get(indeksnama).getText();
        if(sekarang>atas){
            Pesan(K);
            ini.get(indeks).requestFocusInWindow();
        }
        else if(sekarang<=0){
            if(ini.get(indeks-1).getText().equals(""))
                ini.get(indeks-1).requestFocusInWindow();
            else
                ini.get(indeks+1).requestFocusInWindow();
        }
        else{
    //                    if(!kues.getHalaman2().getList().get(0).get(sekarang-1).getText().equals(nama)){
    //                        Pesan(K);
    //                        ini.get(indeksnama).requestFocusInWindow();
    //                    }
    //                    else{
                ini.get(indeksnama).setText(kues.getHalaman2().getListHalaman2().get(sekarang-1).get(0).getText());
                if(periksa(ini, indeks)==null){
                    ini.get(indeks+1).requestFocusInWindow();
                }
                else{
                    Pesan(T);
                    ini.get(periksa(ini, indeks)).requestFocusInWindow();
                }
    //                    }
        }
    }
     /**
     *
     * mengecek nilai yang ada pada TextField tsb
     * Jika nilai nya cocok/ konsisten baru bisa di skip
     * @param ini
     * @param indeks
     * @param itu
     */
    public void cekARTBiasa(KeyEvent e,List<TextField> ini,int indeks,int indeksnama){
       if(e.getComponent().equals(ini.get(indeks))){
           if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                cekARTBiasaMethod(ini, indeks, indeksnama);
            }
       }
    }

    /**
     * Melakukan skip ke blok selanjutnya
     * Tapi mengecek nilai yang ada pada TextField tsb
     * Jika nilai nya cocok/ konsisten baru bisa di skip
     * Dilakukan bila menekan enter/bawah
     * @param ini
     * @param indeks
     * @param itu
     */
    public void cekARTBiasaE(KeyEvent e,List<TextField> ini,int indeks,int indeksnama){
       if(e.getComponent().equals(ini.get(indeks))){
           if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                cekARTBiasaMethod(ini, indeks, indeksnama);
            }
       }
    }

    public void validasiCekAngkaMethod(List<TextField> ini, int indeks){
        if(ini.get(indeks).getInt()==0){
            ini.get(indeks+1).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
        else{
            ini.get(indeks+1).setText("");
            ini.get(indeks+1).setEnabled(false);
            ini.get(indeks+2).requestFocusInWindow();
        }
    }
    /**
     * Melakukan skip dan men disablekan textField yang di skip
     * Dilakukan jika nilai yang di input berisi 0
     * @param ini
     * @param indeks
     */
    public void validasiCekAngka(KeyEvent e,List<TextField> ini,  int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                validasiCekAngkaMethod(ini, indeks);
            }
        }
    }

    /**
     * Melakukan skip dan men disablekan textField yang di skip
     * Dilakukan jika nilai yang di input berisi 0
     * dilakukan jika dilakukan penekanan ENTER/ tombol bawah
     * @param ini
     * @param indeks
     */
    public void validasiCekAngkaE(KeyEvent e,List<TextField> ini,  int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                validasiCekAngkaMethod(ini, indeks);
            }
        }
    }

    public void validasiSkipINTMethod(List<TextField> ini, int indeks, int kondisi, int acuan, int tujuan){
        TextField apa=ini.get(indeks);
        int titikAcuan=Integer.parseInt(ini.get(acuan).getText());
        if(titikAcuan>=kondisi){
            setKosong(ini, indeks, tujuan);
        }
        else if(titikAcuan<kondisi){
            for(int i=indeks+1;i<tujuan;i++)
                ini.get(i).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }
     /**
     * Validasi untuk melakukan skip
     * Sama seperti validasiSkip yang di atas
     * Hanya berbeda pada parameternya, disini bertipe integer
     * Yang berfungsi untuk perbandingan nilai lebih besar/lebih kecil
     * @param ini Blok yang dieksekusi
     * @param indeks indeks yang dieksekusi
     * @param kondisi kondisi integer yang akan menjadi acuan parameternya
     * @param tujuan indeks skip yang menjadi tujuan
     */
    public void validasiSkipINT(KeyEvent e, List<TextField> ini,  int indeks,  int kondisi,  int acuan,  int tujuan){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                validasiSkipINTMethod(ini, indeks, kondisi, acuan, tujuan);
            }
        }
    }

     /**
     * Validasi untuk melakukan skip
     * Sama seperti validasiSkip yang di atas
     * Hanya berbeda pada parameternya, disini bertipe integer
     * Yang berfungsi untuk perbandingan nilai lebih besar/lebih kecil
      * Dilakukan jika dilakukan penekanan enter/bawah
     * @param ini Blok yang dieksekusi
     * @param indeks indeks yang dieksekusi
     * @param kondisi kondisi integer yang akan menjadi acuan parameternya
     * @param tujuan indeks skip yang menjadi tujuan
     */
    public void validasiSkipINTE(KeyEvent e, List<TextField> ini,  int indeks,  int kondisi,  int acuan,  int tujuan){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                validasiSkipINTMethod(ini, indeks, kondisi, acuan, tujuan);
            }
        }
    }


    public void kondisiBlok5No2Method(List<TextField> ini, int indeks, int kondisi, int kondisi2, int acuan, int tujuan){
        TextField apa=ini.get(indeks);
        int titikAcuan=Integer.parseInt(ini.get(acuan).getText());
        int jumlahRT=kues.getHalaman1().getTxtB2R1().getInt();
        if(apa.getInt()<= jumlahRT){
            if(titikAcuan>=kondisi){
                for(int i=indeks+1;i<tujuan-1;i++){
                    ini.get(i).setText("");
                    ini.get(i).setEnabled(false);
                }
                ini.get(tujuan).requestFocusInWindow();
            }
            else if(titikAcuan<kondisi&&titikAcuan>=kondisi2){
                if(ini.get(indeks).getInt()!=0){
                    int indeksTua=ini.get(indeks).getInt();
                    int indeksAnak=listBlok5.get(2).getInt();
                     int umurTua=kues.getHalaman2().getListHalaman2().get(indeksTua-1).get(3).getInt();
                 int umurAnak=kues.getHalaman2().getListHalaman2().get(indeksAnak-1).get(3).getInt();
                    if(umurTua<=umurAnak){
                     Pesan(U);
                        ini.get(indeks).requestFocusInWindow();
                     }
                    else{
                    for(int i=indeks+1;i<tujuan-1;i++){
                        ini.get(i).setText("");
                        ini.get(i).setEnabled(false);
                    }
                    ini.get(tujuan).requestFocusInWindow();
                    }
                }
                else if(ini.get(indeks).getInt()==0){
                    ini.get(indeks+1).setEnabled(true);
                    ini.get(indeks+1).requestFocusInWindow();
                }
            }
            else if(titikAcuan<kondisi2){
                for(int i=indeks;i<9;i++){
                    ini.get(indeks).setEnabled(true);
                }
                if(ini.get(indeks).getInt()!=0){
                    int indeksTua=ini.get(indeks).getInt();
                     int indeksAnak=listBlok5.get(2).getInt();
                     int umurTua=kues.getHalaman2().getListHalaman2().get(indeksTua-1).get(3).getInt();
                     int umurAnak=kues.getHalaman2().getListHalaman2().get(indeksAnak-1).get(3).getInt();
                     if(umurTua<=umurAnak){
                         Pesan(U);
                         ini.get(indeks).requestFocusInWindow();
                     }
                     else{
                        ini.get(indeks+1).setText("");
                        ini.get(indeks+1).setEnabled(false);
                        ini.get(indeks+3).requestFocusInWindow();
                     }
                }
                else if(ini.get(indeks).getInt()==0){
                    ini.get(indeks+1).setEnabled(true);
                    ini.get(indeks+1).requestFocusInWindow();
                }
            }
        }
        else{
            Pesan(K);
            apa.requestFocusInWindow();
        }
    }
     /**
     * Validasi tersendiri untuk Blok 5 no 2
     * dilakukan jika panjang text sudah sama dengan panjang TextField
     * @param ini
     * @param indeks
     * @param kondisi
     * @param acuan
     * @param tujuan
     */
    public void kondisiBlok5No2(KeyEvent e, List<TextField> ini,  int indeks,  int kondisi,  int kondisi2,  int acuan,  int tujuan){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&& pencet(e)){
                kondisiBlok5No2Method(ini, indeks, kondisi, kondisi2, acuan, tujuan);
            }
        }
    }

     /**
     * Validasi tersendiri untuk Blok 5 no 2
     * dilakukan jika melakukan penekanan enter atau tombol bawah
     * @param ini
     * @param indeks
     * @param kondisi
     * @param acuan
     * @param tujuan
     */
    public void kondisiBlok5No2E(KeyEvent e, List<TextField> ini,  int indeks,  int kondisi,  int kondisi2,  int acuan,  int tujuan){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER ||e.getKeyCode()==KeyEvent.VK_DOWN && !ini.get(indeks).getText().equals("")){
                kondisiBlok5No2Method(ini, indeks, kondisi, kondisi2, acuan, tujuan);
            }
        }
    }

    public void kondisiAdaGaAdaMethod(List<TextField> ini, int indeks, int awal){
        if(ini.get(indeks).getText().equals("2")){
            int success=0;
            for(int i=awal;i<indeks;i++){
                if(ini.get(i).getText().equals("1")){
                    success+=1;
                }
            }
            if(success==0)
            {
                Pesan(K);
                ini.get(awal).requestFocusInWindow();
            }
            else{
                ini.get(indeks+1).setText("");
                ini.get(indeks+1).setEnabled(false);
                ini.get(indeks+2).requestFocusInWindow();
            }
        }
        else if(ini.get(indeks).getText().equals("1")){
            ini.get(indeks+1).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }

    public void kondisiAdaGaAda(KeyEvent e, List<TextField> ini, int indeks,int awal){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&&pencet(e)){
                kondisiAdaGaAdaMethod(ini, indeks, awal);
            }
        }
    }


    public void kondisiAdaGaAdaE(KeyEvent e, List<TextField> ini, int indeks, int awal){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                kondisiAdaGaAdaMethod(ini, indeks, awal);
            }
        }
    }


    public void kondisiAdaGaAdaBlokMethod(List<TextField> ini, int indeks, int awal){
        if(ini.get(indeks).getText().equals("2")){
            int success=0;
            for(int i=awal;i<indeks;i++){
                if(ini.get(i).getText().equals("1")){
                    success+=1;
                }
            }
            if(success==0)
            {
                Pesan(K);
                ini.get(awal).requestFocusInWindow();
            }
            else{
                ini.get(indeks+1).setText("");
                ini.get(indeks+1).setEnabled(false);
                listBlok5E.get(0).requestFocusInWindow();
            }
        }
        else if(ini.get(indeks).getText().equals("1")){
            ini.get(indeks+1).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }

    public void kondisiAdaGaAdaBlok(KeyEvent e, List<TextField> ini, int indeks,int awal){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&&pencet(e)){
                kondisiAdaGaAdaBlokMethod(ini, indeks, awal);
            }
        }
    }


    public void kondisiAdaGaAdaBlokE(KeyEvent e, List<TextField> ini, int indeks, int awal){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                kondisiAdaGaAdaBlokMethod(ini, indeks, awal);
            }
        }
    }

    public void kondisiBlok5no3Method(List<TextField> ini, int indeks){
        int umur=listBlok5.get(1).getInt();
        int jumlahRT=kues.getHalaman1().getTxtB2R1().getInt();
        if(ini.get(indeks).getInt()<=jumlahRT){
            int indeksTua=ini.get(indeks).getInt();
         int indeksAnak=listBlok5.get(2).getInt();
         int umurTua=kues.getHalaman2().getListHalaman2().get(indeksTua-1).get(3).getInt();
         int umurAnak=kues.getHalaman2().getListHalaman2().get(indeksAnak-1).get(3).getInt();
         if(umurTua<=umurAnak){
             Pesan(U);
             ini.get(indeks).requestFocusInWindow();
         }
         else{
            if(umur<1){
                for(int i=5;i<9;i++){
                    ini.get(i).setText("");
                    ini.get(i).setEnabled(true);
                }
                ini.get(6).requestFocusInWindow();
            }
            else{
            for(int i=5;i<9;i++){
                ini.get(i).setText("");
                ini.get(i).setEnabled(false);
            }
            ini.get(10).requestFocusInWindow();
            }
         }
        }
        else{
            Pesan(K);
            ini.get(indeks).requestFocusInWindow();
        }
    }
    /**
     * Validasi untuk kondisi pada Blok 5 no 3
     * Dilakukan jika panjang text==panjang textField
     * @param e
     * @param ini
     * @param indeks
     */
    public void kondisiBlok5no3(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e)){
                kondisiBlok5no3Method(ini, indeks);
            }
        }
    }

    /**
     *  Validasi untuk kondisi pada Blok 5 no 3
     * Dilakukan jika melakukan penekanan enter/tombol bawah
     * @param e
     * @param ini
     * @param indeks
     */
    public void kondisiBlok5no3E(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                kondisiBlok5no3Method(ini, indeks);
            }
        }
    }

     /**
     * Validasi untuk blok 5A
     * Dimana pada blok tersebut akan dilakukan pengecekan umur ART
     * Jika umurnya >=5 tahun, maka akan ke halaman selanjutnya
     * Jika tidak, maka akan ke blok selanjutnya
     * Dilakukan jika panjang textField == panjang inputan
     * @param ini
     * @param indeks
     * @param acuan
     */
    public void kondisi5A(KeyEvent e,List<TextField> ini,  int indeks,  String acuan){
       if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
           int umur=Integer.parseInt(listBlok5.get(1).getText());
                if(ini.get(indeks).getText().equals(acuan)){
                    if(periksa(ini, indeks)==null){
                        for(int i=indeks+1;i<listBlok5A.size();i++){
                            ini.get(i).setText("");
                            ini.get(i).setEnabled(false);
                        }
                        if(umur>=5){
                            for(int i=0;i<listBlok5B.size();i++){
                                listBlok5B.get(i).setText("");
                                listBlok5B.get(i).setEnabled(false);
                            }
                            listBlok5C.get(0).requestFocusInWindow();
                        }
                        else if(umur<5){
                            BiasaBlok(e,ini,indeks,listBlok5B);
                        }
                    }
                    else{
                        Pesan(T);
                        ini.get(periksa(ini, indeks)).requestFocusInWindow();
                    }
                }
                else if(!ini.get(indeks).getText().equals(acuan)){
                    for(int i=indeks+1;i<listBlok5A.size();i++)
                        ini.get(i).setEnabled(true);
                    ini.get(indeks+1).requestFocusInWindow();
                }
            }
       }
    }

     /**
     * Validasi untuk blok 5A
     * Dimana pada blok tersebut akan dilakukan pengecekan umur ART
     * Jika umurnya >=5 tahun, maka akan ke halaman selanjutnya
     * Jika tidak, maka akan ke blok selanjutnya
     * Dilakukan jika dilakukan penekanan enter/bawah
     * @param ini
     * @param indeks
     * @param acuan
     */
    public void kondisi5AE(KeyEvent e,List<TextField> ini, int indeks, String acuan){
       if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
           int umur=Integer.parseInt(listBlok5.get(1).getText());
                if(ini.get(indeks).getText().equals(acuan)){
                    if(periksa(ini, indeks)==null){
                        for(int i=indeks+1;i<listBlok5A.size();i++){
                            ini.get(i).setText("");
                            ini.get(i).setEnabled(false);
                        }
                        if(umur>=5){
                            for(int i=0;i<listBlok5B.size();i++){
                                listBlok5B.get(i).setText("");
                                listBlok5B.get(i).setEnabled(false);
                            }
                            listBlok5C.get(0).requestFocusInWindow();
                        }
                        else if(umur<5){
                            BiasaBlokE(e,ini,indeks,listBlok5B);
                        }
                    }
                    else{
                        Pesan(T);
                        ini.get(periksa(ini, indeks)).requestFocusInWindow();
                    }
                }
                else if(!ini.get(indeks).getText().equals(acuan)){
                    for(int i=indeks+1;i<listBlok5A.size();i++)
                        ini.get(i).setEnabled(true);
                    ini.get(indeks+1).requestFocusInWindow();
                }
            }
       }
    }

    /**
     * Untuk memenuhi kondisi blok 5B no 15a
     * Silahkan lihata kuesionet kembali
     * @param e
     */
    public void kondisi5B15a(KeyEvent e){
        if(e.getComponent().equals(listBlok5B.get(3))){
            if(listBlok5B.get(3).getLength()==listBlok5B.get(3).getText().length() && pencet(e)){
                int umur=listBlok5.get(1).getInt();
                if(umur==0)
                    validasiNilai(e, listBlok5B, 3, 11);
                else if(umur==1)
                    validasiNilai(e, listBlok5B, 3, 23,12);
                else if(umur==2)
                    validasiNilai(e, listBlok5B, 3, 35,24);
                else if(umur==3)
                    validasiNilai(e, listBlok5B, 3, 47,36);
                else
                    validasiNilai(e, listBlok5B, 3, 59,48);
            }
        }
    }

    /**
     * Untuk memenuhi kondisi blok 5b no 15a
     * Silahkan lihat kuesioner kembali
     * @param e
     */
    public void kondisi5B15aE(KeyEvent e){
        if(e.getComponent().equals(listBlok5B.get(3))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                int umur=listBlok5.get(1).getInt();
                if(umur==0)
                    validasiNilai(e, listBlok5B, 3, 11);
                else if(umur==1)
                    validasiNilai(e, listBlok5B, 3, 23);
                else if(umur==2)
                    validasiNilai(e, listBlok5B, 3, 35);
                else if(umur==3)
                    validasiNilai(e, listBlok5B, 3, 47);
                else
                    validasiNilai(e, listBlok5B, 3, 59);
            }
        }
    }

    public void validasiEnterDownMethod(List<TextField> ini, int indeks, Component panel, String nama){
        if(periksa(ini, indeks)==null){
            int banding=Integer.parseInt(kues.getHalaman1().getTxtB2R1().getText());
            if(JmlahART<banding){
                // simpan data
                ///////////////////////////////////////////////////////////
//                        kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
//                        kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
                namanya="Halaman3_"+(JmlahART+1);
                  showPanel(kues.getListHal3().get(JmlahART), namanya);
                  Controller.setStatus(2);
                      Controller.setStatusHal3(JmlahART);
                      Controller.setJumlahHal3(banding);
                 // Controller.cleartHal3_4(kues);
                    kues.getListHal3().get(JmlahART).getListBlok5().get(0).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(0).getText());
                    kues.getListHal3().get(JmlahART).getListBlok5().get(1).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(3).getText());
                    JmlahART++;
                    kues.getListHal3().get(JmlahART-1).getListBlok5().get(2).setText(String.valueOf(JmlahART));
                    kues.getListHal3().get(JmlahART-1).getListBlok5().get(3).requestFocusInWindow();
            }
            else{
                //Simpan data
               // kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
               // kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
                showPanel(panel, nama);
                Controller.setStatus(3);
                kues.getHalaman4().getListBlok6().get(0).requestFocusInWindow();
            }
        }
        else{
            Pesan(T);
            ini.get(periksa(ini, indeks)).requestFocusInWindow();
        }
    }
     /**
     * Melakukan perpindahan ke halaman selanjutnya
     * Namun akan mengecek nilai terlebih dahulu
     * Jika semua ART sudah diinput, maka lanjut ke halaman selanjutnya
     * jika tidak, maka akan kembali lagi ke atas
     * @param ini
     * @param indeks
     * @param panel
     * @param nama
     */
    public void validasiEnterDown(KeyEvent e,List<TextField> ini,  int indeks, Component panel,  String nama){
       if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&& pencet(e)){
                validasiEnterDownMethod(ini, indeks, panel, nama);
             }
       }
    }

 /**
     * Melakukan perpindahan ke halaman selanjutnya
     * Namun akan mengecek nilai terlebih dahulu
     * Jika semua ART sudah diinput, maka lanjut ke halaman selanjutnya
     * jika tidak, maka akan kembali lagi ke atas
  * Dilakukan jika menekan enter/bawah
     * @param ini
     * @param indeks
     * @param panel
     * @param nama
     */
    public void validasiEnterDownE(KeyEvent e,List<TextField> ini,  int indeks, Component panel,  String nama){
       if(e.getComponent().equals(ini.get(indeks))){
         if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&& pencet(e)){
            validasiEnterDownMethod(ini, indeks, panel, nama);
         }
       }
    }

    public void validasiEnterDown2Method(List<TextField> ini, int indeks, Component panel, String nama){
        if(periksa(ini, indeks)==null){
            int umur=Integer.parseInt(listBlok5.get(1).getText());
            if(umur>=5){
                setKosongBlok(listBlok5B, 0, listBlok5C);
            }
            else if(umur<5){
                for(int i=0;i<listBlok5B.size();i++)
                    listBlok5B.get(i).setEnabled(true);
                listBlok5B.get(0).requestFocusInWindow();
            }
        }
        else{
            Pesan(T);
            ini.get(periksa(ini, indeks)).requestFocusInWindow();
        }
    }
    /**
     * validasi untuk dua kemungkinan
     * akan mengecek umur ART terlebih dahulu
     * Salah satu nilai akan mengirimkan kursor ke halaman berikutnya
     * tapi nilai yang satunya akan memindahkan kursor ke tempat selanjutnya
     * @param ini blok yang sedang dieksekusi
     * @param indeks indeks blok yang sedang dieksekusi
     * @param panel halaman yang akan dituju jika memang akan pindah halaman
     * @param nama nama halaman yang dituju
     */
    public void validasiEnterDown2(KeyEvent e,List<TextField> ini,  int indeks, Component panel,  String nama){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                validasiEnterDown2Method(ini, indeks, panel, nama);
            }
        }
    }

     /**
     * validasi untuk dua kemungkinan
     * akan mengecek umur ART terlebih dahulu
     * Salah satu nilai akan mengirimkan kursor ke halaman berikutnya
     * tapi nilai yang satunya akan memindahkan kursor ke tempat selanjutnya
     * @param ini blok yang sedang dieksekusi
     * @param indeks indeks blok yang sedang dieksekusi
     * @param panel halaman yang akan dituju jika memang akan pindah halaman
     * @param nama nama halaman yang dituju
     */
    public void validasiEnterDown2E(KeyEvent e,List<TextField> ini,int indeks, Component panel, String nama){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                validasiEnterDown2Method(ini, indeks, panel, nama);
          }
        }
    }

    public void validasiSkipBlokMethod(List<TextField> ini, int indeks, String kondisi, List<TextField> itu){
        if(ini.get(indeks).getText().equals(kondisi)){
            if(periksa(ini, indeks)==null){
                setKosongBlok(ini, indeks, itu);
            }
            else{
                Pesan(T);
                ini.get(periksa(ini, indeks)).requestFocusInWindow();
            }
        }
        else if(!ini.get(indeks).getText().equals(kondisi)){
            for(int i=indeks+1;i<ini.size();i++)
                ini.get(i).setEnabled(true);
            ini.get(indeks+1).requestFocusInWindow();
        }
    }
     /** Validasi untuk melakukan skip ke blok selanjutnya
      * Jika kondisinya memenuhi
      * @param ini BLok  yang dieksekusi
      * @param indeks indeks yang sedang dieksekusi
      * @param kondisi kondisi nilai string yang dimaksud
      * @param itu Blok yang dituju
      */
     public void validasiSkipBlok(KeyEvent e,List<TextField> ini,  int indeks,  String kondisi,  List<TextField> itu){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                validasiSkipBlokMethod(ini, indeks, kondisi, itu);
            }
        }
    }

      /** Validasi untuk melakukan skip ke blok selanjutnya
      * Jika kondisinya memenuhi
      * @param ini BLok  yang dieksekusi
      * @param indeks indeks yang sedang dieksekusi
      * @param kondisi kondisi nilai string yang dimaksud
      * @param itu Blok yang dituju
      */
     public void validasiSkipBlokE(KeyEvent e,List<TextField> ini,  int indeks,  String kondisi,  List<TextField> itu){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                validasiSkipBlokMethod(ini, indeks, kondisi, itu);
            }
        }
    }


     public void validasiSkipBlok2Method(List<TextField> ini, int indeks, String kondisi, List<TextField> itu){
         if(periksa(ini, indeks)==null){
            if(ini.get(indeks).getText().equals(kondisi)){
                for(int i=indeks+1;i<ini.size();i++)
                    ini.get(i).setEnabled(true);
                ini.get(indeks+1).requestFocusInWindow();
            }
            else if(!ini.get(indeks).getText().equals(kondisi)){
                for(int i=indeks+1;i<ini.size();i++){
                    ini.get(i).setText("");
                    ini.get(i).setEnabled(false);
                }
                itu.get(0).requestFocusInWindow();
            }
        }
        else{
            Pesan(T);
            ini.get(periksa(ini, indeks)).requestFocusInWindow();
        }
     }
     /** Validasi untuk melakukan skip ke blok selanjutnya
      * Jika kondisinya tidak dipenuhi
      * "Kebalikan dari metode validasiSkipBlok2"
      * @param ini BLok  yang dieksekusi
      * @param indeks indeks yang sedang dieksekusi
      * @param kondisi kondisi nilai string yang dimaksud
      * @param itu Blok yang dituju
      */
     public void validasiSkipBlok2(KeyEvent e,List<TextField> ini,  int indeks,  String kondisi,  List<TextField> itu){
       if(e.getComponent().equals(ini.get(indeks))){
           if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&& pencet(e)){
                validasiSkipBlok2Method(ini, indeks, kondisi, itu);
            }
       }
    }

     /** Validasi untuk melakukan skip ke blok selanjutnya
      * Jika kondisinya tidak dipenuhi
      * "Kebalikan dari metode validasiSkipBlok2"
      * Dilakukan jika melakukan penekanan enter/bawah
      * @param ini BLok  yang dieksekusi
      * @param indeks indeks yang sedang dieksekusi
      * @param kondisi kondisi nilai string yang dimaksud
      * @param itu Blok yang dituju
      */
     public void validasiSkipBlok2E(KeyEvent e,List<TextField> ini,  int indeks,  String kondisi,  List<TextField> itu){
       if(e.getComponent().equals(ini.get(indeks))){
           if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                validasiSkipBlok2Method(ini, indeks, kondisi, itu);
            }
       }
    }

     public void SkipHalamanMethod(List<TextField> ini, int indeks, Component panel, String nama){
         if(periksa(ini, indeks)==null){
            int banding=Integer.parseInt(kues.getHalaman1().getTxtB2R1().getText());
            if(JmlahART < banding){
//                        if(ini.equals(listBlok5B)){
//                            kues.getListBlok5a().add(new GetDataForm(kues).getBlok5a());
//                            kues.getListBlok5b().add(new GetDataForm(kues).getBlok5b());
//                        }else{
//
//                        }
                namanya="Halaman3_"+(JmlahART+1);
                    showPanel(kues.getListHal3().get(JmlahART), namanya);
                    Controller.setStatus(2);
                      Controller.setStatusHal3(JmlahART);
                      Controller.setJumlahHal3(banding);
//                            Controller.cleartHalaman3_4(kues);
                    kues.getListHal3().get(JmlahART).getListBlok5().get(0).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(0).getText());
                    kues.getListHal3().get(JmlahART).getListBlok5().get(1).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(3).getText());
                    JmlahART++;
                    kues.getListHal3().get(JmlahART-1).getListBlok5().get(2).setText(String.valueOf(JmlahART));
                    kues.getListHal3().get(JmlahART-1).getListBlok5().get(3).requestFocusInWindow();
            }
            else{
//                        if(ini.equals(listBlok5B)){
//                            kues.getListBlok5a().add(new GetDataForm(kues).getBlok5a());
//                            kues.getListBlok5b().add(new GetDataForm(kues).getBlok5b());
//                        }else{
//
//                        }
                showPanel(panel, nama);
                if(nama.equals("Halaman4")){
                    kues.getHalaman4().getListBlok6().get(0).requestFocusInWindow();
                    Controller.setStatus(3);
                }
                else if(nama.equals("Halaman5")){
                    kues.getHalaman5().getListBlok7A().get(0).requestFocusInWindow();
                    Controller.setStatus(4);
                }
            }
         }
        else{
         Pesan(T);
            ini.get(periksa(ini, indeks)).requestFocusInWindow();
        }
     }
     /**
     * Malakukan pergantian halaman pada panel utama
     * Jika pada blok 5 belum selesai diinput semua anggota RT, maka akan kembali ke atasnya
     * Sekaligus memeriksa apakah ada halaman yang kosong atau tidak
     * @param ini Blok yang sedang dieksekusi
     * @param indeks blok yang sedang dieksekusi
     * @param panel halaman tujuan
     * @param nama nama halaman tujuan
     */
     public void SkipHalaman(KeyEvent e, List<TextField> ini,  int indeks,  Component panel,  String nama){
         if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                SkipHalamanMethod(ini, indeks, panel, nama);
            }
         }
     }


     /**
     * Malakukan pergantian halaman pada panel utama
     * Jika pada blok 5 belum selesai diinput semua anggota RT, maka akan kembali ke atasnya
     * Sekaligus memeriksa apakah ada halaman yang kosong atau tidak
      * Dilakukan jika menekan enter/bawah
     * @param ini Blok yang sedang dieksekusi
     * @param indeks blok yang sedang dieksekusi
     * @param panel halaman tujuan
     * @param nama nama halaman tujuan
     */
     public void SkipHalamanE(KeyEvent e, List<TextField> ini,  int indeks,  Component panel,  String nama){
         if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                SkipHalamanMethod(ini, indeks, panel, nama);
            }
         }
     }

    /**
      * Sama dengan yang diatas, hanya saja pada method ini
      * akan dilakukan perpindahan halaman jika suatu kondisi memenuhi suatu keadaan tertentu
      * @param ini Blok yang sedang dieksekusi
      * @param indeks indeks blok yang sedang dieksekusi
      * @param kondisi dimana jika dipenuhi maka akan dilakukan perpindahan halaman
      * @param panel halaman yang dituju
      * @param nama nama halaman yang dituju
      */
     public void SkipHalaman2(KeyEvent e, List<TextField> ini,  int indeks,  String kondisi, Component panel,  String nama){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                if(ini.get(indeks).getText().equals(kondisi)){
                    if(periksa(ini, indeks)==null){
                        for(int i=indeks+1;i<ini.size();i++){
                            ini.get(i).setText("");
                            ini.get(i).setEnabled(false);
                        }
                        int banding= Integer.parseInt(kues.getHalaman1().getTxtB2R1().getText());
                        if(JmlahART < banding){
//                                if(ini.equals(listBlok5B)){
//                                    kues.getListBlok5a().add(new GetDataForm(kues).getBlok5a());
//                                    kues.getListBlok5b().add(new GetDataForm(kues).getBlok5b());
//                                }else if(ini.equals(listBlok5E)){
//                                    kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
//                                    kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
//                                }
                            namanya="Halaman3_"+(JmlahART+1);
                            showPanel(kues.getListHal3().get(JmlahART), namanya);
                            Controller.setStatus(2);
                              Controller.setStatusHal3(JmlahART);
                              Controller.setJumlahHal3(banding);
//                                Controller.cleartHalaman3_4(kues);
                            kues.getListHal3().get(JmlahART).getListBlok5().get(0).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(0).getText());
                            kues.getListHal3().get(JmlahART).getListBlok5().get(1).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(3).getText());
                            JmlahART++;
                            kues.getListHal3().get(JmlahART-1).getListBlok5().get(2).setText(String.valueOf(JmlahART));
                            kues.getListHal3().get(JmlahART-1).getListBlok5().get(3).requestFocusInWindow();
                        }
                        else{
                            //simpan
//                                if(ini.equals(listBlok5B)){
//                                    kues.getListBlok5a().add(new GetDataForm(kues).getBlok5a());
//                                    kues.getListBlok5b().add(new GetDataForm(kues).getBlok5b());
//                                }else if(ini.equals(listBlok5E)){
//                                    kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
//                                    kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
//                                }
                            showPanel(panel, nama);
                            if(nama.equals("Halaman4")){
                                kues.getHalaman4().getListBlok6().get(0).requestFocusInWindow();
                                Controller.setStatus(3);
                            }
                            else if(nama.equals("Halaman5")){
                                kues.getHalaman5().getListBlok7A().get(0).requestFocusInWindow();
                                Controller.setStatus(4);
                            }
                        }
                    }
                    else{
                        Pesan(T);
                        ini.get(periksa(ini, indeks)).requestFocusInWindow();
                    }
                }
                else if(!ini.get(indeks).getText().equals(kondisi)){
                    for(int i=indeks+1;i<ini.size();i++)
                        ini.get(i).setEnabled(true);
                    Biasa(e, ini,indeks);
                }
             }
         }
     }


      /**
      * Sama dengan yang diatas, hanya saja pada method ini
      * akan dilakukan perpindahan halaman jika suatu kondisi memenuhi suatu keadaan tertentu
       * Dilakukan jika melakukan penekanan enter/bawah
      * @param ini Blok yang sedang dieksekusi
      * @param indeks indeks blok yang sedang dieksekusi
      * @param kondisi dimana jika dipenuhi maka akan dilakukan perpindahan halaman
      * @param panel halaman yang dituju
      * @param nama nama halaman yang dituju
      */
     public void SkipHalaman2E(KeyEvent e, List<TextField> ini,  int indeks,  String kondisi, Component panel,  String nama){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                if(ini.get(indeks).getText().equals(kondisi)){
                    if(periksa(ini, indeks)==null){
                        for(int i=indeks+1;i<ini.size();i++){
                            ini.get(i).setText("");
                            ini.get(i).setEnabled(true);
                        }
                        int banding= Integer.parseInt(kues.getHalaman1().getTxtB2R1().getText());
                        if(JmlahART < banding){
//                                if(ini.equals(listBlok5B)){
//                                    kues.getListBlok5a().add(new GetDataForm(kues).getBlok5a());
//                                    kues.getListBlok5b().add(new GetDataForm(kues).getBlok5b());
//                                }else if(ini.equals(listBlok5E)){
//                                    kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
//                                    kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
//                                }
                            namanya="Halaman3_"+(JmlahART+1);
                            showPanel(kues.getListHal3().get(JmlahART), namanya);
                            Controller.setStatus(2);
                              Controller.setStatusHal3(JmlahART);
                              Controller.setJumlahHal3(banding);
//                                Controller.cleartHalaman3_4(kues);
                            kues.getListHal3().get(JmlahART).getListBlok5().get(0).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(0).getText());
                            kues.getListHal3().get(JmlahART).getListBlok5().get(1).setText(kues.getHalaman2().getListHalaman2().get(JmlahART).get(3).getText());
                            JmlahART++;
                            kues.getListHal3().get(JmlahART-1).getListBlok5().get(2).setText(String.valueOf(JmlahART));
                            kues.getListHal3().get(JmlahART-1).getListBlok5().get(3).requestFocusInWindow();
                        }
                        else{
                            //simpan
//                                if(ini.equals(listBlok5B)){
//                                    kues.getListBlok5a().add(new GetDataForm(kues).getBlok5a());
//                                    kues.getListBlok5b().add(new GetDataForm(kues).getBlok5b());
//                                }else if(ini.equals(listBlok5E)){
//                                    kues.getListBlok5c().add(new GetDataForm(kues).getBlok5c());
//                                    kues.getListBlok5de().add(new GetDataForm(kues).getBlok5de());
//                                }
                            showPanel(panel, nama);
                            if(nama.equals("Halaman4")){
                                kues.getHalaman4().getListBlok6().get(0).requestFocusInWindow();
                                Controller.setStatus(3);
                            }
                            else if(nama.equals("Halaman5")){
                                kues.getHalaman5().getListBlok7A().get(0).requestFocusInWindow();
                                Controller.setStatus(4);
                            }
                        }
                    }
                    else{
                        Pesan(T);
                        ini.get(periksa(ini, indeks)).requestFocusInWindow();
                    }
                }
                else if(!ini.get(indeks).getText().equals(kondisi)){
                    for(int i=indeks+1;i<ini.size();i++)
                        ini.get(i).setEnabled(true);
                    bawahE(e, ini,indeks);
                }
             }
         }
     }


      /**
      * Melakukan pengecekan terhadap suatu nilai suatu textField
      * Jika nilai nya melebihi nilai batas, maka akan error dan menampilkan pesan
      * @param ini Blok yang sedang dieksekusi
      * @param indeks indeks dari blok yang sedang dieksekusi
      * @param batasAtas batas dari nilai yang dijadikan nilai batas
      */
     public void validasiNilai(KeyEvent e,List<TextField> ini,  int indeks,  int batasAtas){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&& pencet(e)){
                if(ini.get(indeks).getInt()>batasAtas){
                    Pesan(B);
                    ini.get(indeks).requestFocusInWindow();
                }
             }
         }
     }

         /**
      * Melakukan pengecekan terhadap suatu nilai suatu textField
      * Jika nilai nya melebihi nilai batas, maka akan error dan menampilkan pesan
          * Dilakukan jika melakukan penekanan enter/ bawah
      * @param ini Blok yang sedang dieksekusi
      * @param indeks indeks dari blok yang sedang dieksekusi
      * @param batasAtas batas dari nilai yang dijadikan nilai batas
      */
     public void validasiNilaiE(KeyEvent e,List<TextField> ini,  int indeks,  int batasAtas){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                if(ini.get(indeks).getText().length()!=0&& ini.get(indeks).getInt()>batasAtas){
                    Pesan(B);
                    ini.get(indeks).requestFocusInWindow();
                }
             }
         }
     }

      /**
      * Sama dengan validasi di atas
      * Tapi pada method ini, dugunakan dua acuan nilai
      * Jika nilai lebih besar dari batas atas, atau lebih kecil dari batas bawah, maka akan error
      * @param ini blok yang sedang dieksekusi
      * @param indeks indeks dari blok yang sedang dieksekusi
      * @param batasAtas batas atas dari nilai persyaratannya
      * @param batasBawah batas bawah dari nilai persyaratannya
      */
     public void validasiNilai(KeyEvent e,List<TextField> ini,  int indeks,  int batasAtas,  int batasBawah){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                 if((ini.get(indeks).getInt()>batasAtas || ini.get(indeks).getInt()<batasBawah) && ini.get(indeks).getInt()!=9999){
                        Pesan(B);
                        ini.get(indeks).requestFocusInWindow();
                 }
             }
         }
     }


      /**
      * Sama dengan validasi di atas
      * Tapi pada method ini, dugunakan dua acuan nilai
      * Jika nilai lebih besar dari batas atas, atau lebih kecil dari batas bawah, maka akan error
       * Dilakukan jika dilakukan penekanan enter
      * @param ini blok yang sedang dieksekusi
      * @param indeks indeks dari blok yang sedang dieksekusi
      * @param batasAtas batas atas dari nilai persyaratannya
      * @param batasBawah batas bawah dari nilai persyaratannya
      */
     public void validasiNilaiE(KeyEvent e,List<TextField> ini,  int indeks,  int batasAtas,  int batasBawah){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                 if((ini.get(indeks).getInt()>batasAtas || ini.get(indeks).getInt()<batasBawah) && ini.get(indeks).getInt()!=9999){
                        Pesan(B);
                        ini.get(indeks).requestFocusInWindow();
                 }
             }
         }
     }


     public void validasiNilaiUrutAngkaMethod(List<TextField> ini, int indeks){
         int jART=kues.getHalaman1().getTxtB2R1().getInt();
        if(ini.get(indeks).getInt()>jART ){
            Pesan(B);
            ini.get(indeks).requestFocusInWindow();
        }
        else if(ini.get(indeks).getInt()<=jART){
            ini.get(indeks+1).requestFocusInWindow();
        }
     }
      /**
      * Untuk mencocokan nilai inputan dengan jumlah ART
      * Karena tidak mungkin no urut ART melebihi jumlah ART
      * Dilakukan jika panjang textField sama dengan panjang text
      * @param ini
      * @param indeks
      */
     public void validasiNilaiUrutAngka(KeyEvent e,List<TextField> ini,  int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                validasiNilaiUrutAngkaMethod(ini, indeks);
            }
         }
     }

      /**
      * Untuk mencocokan nilai inputan dengan jumlah ART
      * Karena tidak mungkin no urut ART melebihi jumlah ART
      * Dilakukan jika dilakukan penekanan enter/tombol bawah
      * @param ini
      * @param indeks
      */
     public void validasiNilaiUrutAngkaE(KeyEvent e,List<TextField> ini,  int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER|| e.getKeyCode()==KeyEvent.VK_DOWN){
                validasiNilaiUrutAngkaMethod(ini, indeks);
            }
         }
     }


     public void cekUmurMethod(List<TextField> ini, int indeks){
         int umur=listBlok5.get(1).getInt();
        if(ini.get(indeks).getInt()>umur && ini.get(indeks).getInt()!=99){
            Pesan(B);
            ini.get(indeks).requestFocusInWindow();
        }
     }
     /**
      * Mencocokkan nilai inputan dengan umurnya
      * Nilainya tidak boleh lebih daripada umurnya
      * Dijalankan jika nilai yang ada pada TextField sudah sama panjang dengan
      * panjang maksimum dari textFieldnya
      * @param ini
      * @param indeks
      */
     public void cekUmur(KeyEvent e,List<TextField> ini,  int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                cekUmurMethod(ini, indeks);
            }
         }
     }

     /**
      * Mencocokkan nilai inputan dengan umurnya
      * Nilainya tidak boleh lebih daripada umurnya
      * Dijalankan jika melakukan penekanan enter/bawah
      * @param ini
      * @param indeks
      */
     public void cekUmurE(KeyEvent e,List<TextField> ini,  int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                cekUmurMethod(ini, indeks);
            }
         }
     }      

     public void cekKonsistenARTMethod(List<TextField> ini, int indeks, int indeksNama){
         int urutan=ini.get(indeks).getInt();
        String nama=ini.get(indeksNama).getText();

        if(!kues.getHalaman2().getListHalaman2().get(0).get(urutan-1).getText().equals(nama)){
            Pesan(K);
            ini.get(indeksNama).requestFocusInWindow();
        }
     }
       /**
      * Mengecek konsistensi nilai no urut ART dan Nama nya sesuai dengan blok 4
      * Dilakukan jika panjang textFieldnya sudah sama panjang dengan panjang TextFieldnya
      * @param ini
      * @param indeks
      * @param indeksNama
      */
     public void cekKonsistenART(KeyEvent e,List<TextField> ini,  int indeks,  int indeksNama){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                cekKonsistenARTMethod(ini, indeks, indeksNama);
            }
         }
     }


       /**
      * Mengecek konsistensi nilai no urut ART dan Nama nya sesuai dengan blok 4
      * Dilakukan jika melakukan penekanan enter/bawah
      * @param ini
      * @param indeks
      * @param indeksNama
      */
     public void cekKonsistenARTE(KeyEvent e,List<TextField> ini,  int indeks,  int indeksNama){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                cekKonsistenARTMethod(ini, indeks, indeksNama);
            }
         }
     }

     public void cekTanggalMethod(List<TextField> ini, int indeks, int batas){
          if(ini.get(indeks).getInt()>batas && ini.get(indeks).getInt()!=99){
                Pesan("Nilai yang anda masukkan salah, silahkan perbaiki");
                ini.get(indeks).requestFocusInWindow();
            }
     }
      /**
      * Untuk mengecek tanggal, jika non response, maka diisi 99
      * Di jalankan jika panjang panjang nilainya sama dengan panjang textField
      * @param ini
      * @param indeks
      * @param batas
      */
     public void cekTanggal(KeyEvent e,List<TextField> ini,  int indeks,  int batas){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
               cekTanggalMethod(ini, indeks, batas);
            }
         }
     }

     /**
      * Untuk mengecek tanggal, jika non response, maka diisi 99
      * Di jalankan jika melakukan penekanan enter/bawah
      * @param ini
      * @param indeks
      * @param batas
      */
     public void cekTanggalE(KeyEvent e,List<TextField> ini,  int indeks,  int batas){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                cekTanggalMethod(ini, indeks, batas);
            }
         }
     }

     public void kondisi5Ano6Method(List<TextField> ini, int indeks){
         TextField apa[]={listBlok5A.get(0),listBlok5A.get(1),listBlok5A.get(2),listBlok5A.get(3),listBlok5A.get(4),listBlok5A.get(5),listBlok5A.get(6),listBlok5A.get(7)};
        if(apa[7].getText().equals("1")){
            for(int i=7;i<26;i++)
                listBlok5A.get(i).setEnabled(true);
            listBlok5A.get(8).requestFocusInWindow();
        }
        else if(apa[7].getText().equals("2")){
            boolean itu=true;
            for(int i=0;i<7;i++){
                if(apa[i].getText().equals("1")){
                    itu=false;
                    break;
                }
            }
            if(itu){
                for(int i=8;i<26;i++){
                    listBlok5A.get(i).setText("");
                    listBlok5A.get(i).setEnabled(false);
                }
                listBlok5A.get(26).requestFocusInWindow();
            }
            else if(!itu){
                listBlok5A.get(8).setEnabled(false);
                for(int i=9;i<26;i++)
                    listBlok5A.get(i).setEnabled(true);
                listBlok5A.get(9).requestFocusInWindow();
            }
        }
     }
     /**
      * Melakukan validasi pada blok5A no 6
      * Silahkan lihat lagi kuesioner
      * @param e
      * @param ini
      * @param indeks
      */
     public void kondisi5Ano6(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getText().length()==ini.get(indeks).getLength()&&pencet(e)){
                kondisi5Ano6Method(ini, indeks);
            }
         }
     }

      /**
      * Melakukan validasi pada blok5A no 6
      * Silahkan lihat lagi kuesioner
       * Dilakukan jika melakukan penekanan enter/bawah
      * @param e
      * @param ini
      * @param indeks
      */
     public void kondisi5Ano6E(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                kondisi5Ano6Method(ini, indeks);
            }
         }
     }


     public void kondisiB5Ano11Method(){
         int i=0;
         for(int j=17;j<25;j++){
             if(listBlok5A.get(j).getText().length()==0)
                     i++;
         }
         if(i==0){
        int a=listBlok5A.get(17).getInt();
        int a1=listBlok5A.get(18).getInt();
        int a2=listBlok5A.get(19).getInt();
        int a3=listBlok5A.get(20).getInt();
        int a4=listBlok5A.get(21).getInt();
        int a5=listBlok5A.get(22).getInt();
        int a6=listBlok5A.get(23).getInt();
        int a7=listBlok5A.get(24).getInt();
        int jumlah=a+a1+a2+a3+a4+a5+a6+a7;
        if(jumlah>31){
          Pesan("Jumlah kali berobat jalan dalam sebulan maksimal 31 kali");
          listBlok5A.get(17).requestFocusInWindow();
        }
        else if(jumlah==0){
            Pesan("Jika pernah berobat jalan, maka jumlah berobat jalannya tidak boleh 0(nol)!");
            listBlok5A.get(17).requestFocusInWindow();
        }
        else{
            if(a7==0){
                listBlok5A.get(25).setEnabled(false);
                listBlok5A.get(26).requestFocusInWindow();
            }
            else{
                listBlok5A.get(25).setEnabled(true);
                listBlok5A.get(25).requestFocusInWindow();
            }
        }
         }
         else{
             Pesan("Masih ada data yang kosong, silahkan lengkapi lagi");
             listBlok5A.get(17).requestFocusInWindow();
         }
     }
     /**
      * kondisi Blok 5A no11
      * Silahkan lihat kembali kuesioner
      * Dilakukan jika panjang textField==panjang text
      * @param e
      */
     public void kondisiB5Ano11(KeyEvent e){
         if(e.getComponent().equals(listBlok5A.get(24))){
             if(listBlok5A.get(24).getLength()==listBlok5A.get(24).getText().length() && pencet(e)){
                 kondisiB5Ano11Method();
            }
         }
     }


     /**
      * kondisi Blok 5A no11
      * Silahkan lihat kembali kuesioner
      * Dilakukan jika melakukan penekanan Enter/bawah
      * @param e
      */
     public void kondisiB5Ano11E(KeyEvent e){
         if(e.getComponent().equals(listBlok5A.get(24))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                 kondisiB5Ano11Method();
            }
         }
     }


     /**
      * Validasi Blok 5A no 13
      * Silahkan lihat kembali kuesioner
      * Dilakukan jika panjang text==penjang textField
      * @param e
      */
     public void kondisiB5Ano13(KeyEvent e){
         if(e.getComponent().equals(listBlok5A.get(32))){
             if(listBlok5A.get(32).getLength()==listBlok5A.get(32).getText().length()&& pencet(e)){
                 int j=0;
                 for(int i=27;i<33;i++){
                     if(listBlok5A.get(i).getText().length()==0)
                         j++;
                 }

                 if(j==0){
                int a=listBlok5A.get(27).getInt();
                int a1=listBlok5A.get(28).getInt();
                int a2=listBlok5A.get(29).getInt();
                int a3=listBlok5A.get(30).getInt();
                int a4=listBlok5A.get(31).getInt();
                int a5=listBlok5A.get(32).getInt();
                int jumlah=a+a1+a2+a3+a4+a5;
                if(jumlah>365){
                    Pesan("Jumlah hari rawat inap dalam setahun maksimal 365 hari");
                    listBlok5A.get(27).requestFocusInWindow();
                }

                else if(jumlah==0){
                    Pesan("Jika pernah rawat inap, maka jumlah rawat inap tidak boleh 0(nol)!");
                    listBlok5A.get(27).requestFocusInWindow();
                }
                else{
                    if(a5==0){
                        int umur=listBlok5.get(1).getInt();
                        if(periksa(listBlok5A, 32)==null){
                            if(umur>=5){
                                for(int i=33;i<listBlok5A.size();i++){
                                    listBlok5A.get(i).setText("");
                                    listBlok5A.get(i).setEnabled(false);
                                }
                                for(int i=0;i<listBlok5B.size();i++){
                                    listBlok5B.get(i).setText("");
                                    listBlok5B.get(i).setEnabled(false);
                                }
                                listBlok5C.get(0).requestFocusInWindow();
                            }
                            else{
                                for(int i=33;i<listBlok5A.size();i++){
                                    listBlok5A.get(i).setText("");
                                    listBlok5A.get(i).setEnabled(false);
                                }
                                for(int i=0;i<listBlok5B.size();i++)
                                    listBlok5B.get(i).setEnabled(true);
                                BiasaBlok(e,listBlok5A,32,listBlok5B);
                            }
                        }
                        else{
                            Pesan(T);
                            listBlok5A.get(periksa(listBlok5A, 32)).requestFocusInWindow();
                        }
                    }
                    else{
                        listBlok5A.get(33).requestFocusInWindow();
                    }
                }
                 }
                 else{
                     Pesan(T);
                     listBlok5A.get(27).requestFocusInWindow();
                 }
            }
         }
     }


     /**
      * Validasi Blok 5A no 13
      * Silahkan lihat kembali kuesioner
      * Dilakukan jika melakukan penekanan enter/bawah
      * @param e
      */
     public void kondisiB5Ano13E(KeyEvent e){
         if(e.getComponent().equals(listBlok5A.get(32))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                 int j=0;
                 for(int i=27;i<33;i++){
                     if(listBlok5A.get(i).getText().length()==0)
                         j++;
                 }

                 if(j==0){
                int a=listBlok5A.get(27).getInt();
                int a1=listBlok5A.get(28).getInt();
                int a2=listBlok5A.get(29).getInt();
                int a3=listBlok5A.get(30).getInt();
                int a4=listBlok5A.get(31).getInt();
                int a5=listBlok5A.get(32).getInt();
                int jumlah=a+a1+a2+a3+a4+a5;
                if(jumlah>365){
                    Pesan("Jumlah hari rawat inap dalam setahun maksimal 365 hari");
                    listBlok5A.get(27).requestFocusInWindow();
                }


                else if(jumlah==0){
                    Pesan("Jika pernah rawat inap, maka jumlah rawat inap tidak boleh 0(nol)!");
                    listBlok5A.get(27).requestFocusInWindow();
                }
                else{
                    if(a5==0){
                        int umur=listBlok5.get(1).getInt();
                        if(periksa(listBlok5A, 32)==null){
                            if(umur>=5){
                                for(int i=33;i<listBlok5A.size();i++){
                                    listBlok5A.get(i).setText("");
                                    listBlok5A.get(i).setEnabled(false);
                                }
                                for(int i=0;i<listBlok5B.size();i++){
                                    listBlok5B.get(i).setText("");
                                    listBlok5B.get(i).setEnabled(false);
                                }
                                listBlok5C.get(0).requestFocusInWindow();
                            }
                            else{
                                for(int i=33;i<listBlok5A.size();i++){
                                    listBlok5A.get(i).setText("");
                                    listBlok5A.get(i).setEnabled(false);
                                }
                                for(int i=0;i<listBlok5B.size();i++)
                                    listBlok5B.get(i).setEnabled(true);
                                BiasaBlok(e,listBlok5A,32,listBlok5B);
                            }
                        }
                        else{
                            Pesan(T);
                            listBlok5A.get(periksa(listBlok5A, 32)).requestFocusInWindow();
                        }
                    }
                    else{
                        listBlok5A.get(33).requestFocusInWindow();
                    }
                }
                 }
                 else{
                     Pesan(T);
                     listBlok5A.get(27).requestFocusInWindow();
                 }
            }
         }
     }

     public void kondisi5D23Method(){
         if(listBlok5D.get(0).getText().equals("2")&&listBlok5D.get(1).getText().equals("2")&&listBlok5D.get(2).getText().equals("2")&&
                listBlok5D.get(3).getText().equals("2")&&listBlok5D.get(4).getText().equals("2")){
            Pesan("Tidak mungkin ART tidak mengerjakan apa-apa");
            listBlok5D.get(0).requestFocusInWindow();
        }
     }
     /**
      * Validasi pada blok 5D no 23
      * Dilakukan jika panjang text==panjang textField
      * @param e
      */
     public void kondisi5D23(KeyEvent e){
        if(e.getComponent().equals(listBlok5D.get(4))){
            if(listBlok5D.get(4).getLength()==listBlok5D.get(4).getText().length() && pencet(e)){
                kondisi5D23Method();
            }
        }
     }

     /**
      * Validasi untuk Blok 5D no 23
      * Dilakukan jika melakukan penekanan enter/bawah
      * @param e
      */
      public void kondisi5D23E(KeyEvent e){
        if(e.getComponent().equals(listBlok5D.get(4))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                kondisi5D23Method();
            }
        }
     }

      public void kondisi5Dno24Method()
      {
           TextField itu[]={listBlok5D.get(0),listBlok5D.get(1),listBlok5D.get(2),listBlok5D.get(3),listBlok5D.get(4)};
            if(listBlok5D.get(6).getText().equals("1")&& itu[0].getText().equals("2")){
                Pesan(K);
                listBlok5D.get(6).requestFocusInWindow();
            }
            else if(listBlok5D.get(6).getText().equals("2")&& itu[1].getText().equals("2")){
                Pesan(K);
                listBlok5D.get(6).requestFocusInWindow();
            }
            else if(listBlok5D.get(6).getText().equals("3")&& itu[2].getText().equals("2")){
                Pesan(K);
                listBlok5D.get(6).requestFocusInWindow();
            }
            else if(listBlok5D.get(6).getText().equals("4")&& itu[3].getText().equals("2")){
                Pesan(K);
                listBlok5D.get(6).requestFocusInWindow();
            }
            else if(listBlok5D.get(6).getText().equals("5")&& itu[4].getText().equals("2")){
                Pesan(K);
                listBlok5D.get(6).requestFocusInWindow();
            }
            else{
                if(!(listBlok5D.get(0).getText().equals("1"))){
                    listBlok5D.get(7).setText("");
                    listBlok5D.get(8).setText("");
                    listBlok5D.get(7).setEnabled(false);
                    listBlok5D.get(8).setEnabled(false);
                    listBlok5D.get(9).requestFocusInWindow();
                }
                else{
                    listBlok5D.get(7).setEnabled(true);
                    listBlok5D.get(8).setEnabled(true);
                    listBlok5D.get(7).requestFocusInWindow();
                }
            }
      }
      /**
       * validasi blok 5D no 24
       * @param e
       */
     public void kondisi5Dno24(KeyEvent e){
         if(e.getComponent().equals(listBlok5D.get(6))){
            if(listBlok5D.get(6).getLength()==listBlok5D.get(6).getText().length() && pencet(e)){
               kondisi5Dno24Method();
             }
         }
     }

     /**
      * validasi untuk blok 5D no 24
      * Dilakukan jika melakukan penekanan enter/bawah
      * @param e
      */
     public void kondisi5Dno24E(KeyEvent e){
         if(e.getComponent().equals(listBlok5D.get(6))){
            if(e.getKeyCode()==KeyEvent.VK_DOWN||e.getKeyCode()==KeyEvent.VK_ENTER){
                kondisi5Dno24Method();
             }
         }
     }

     /**
      * validasi untuk blok 5D no 26a
      * Silahkan lihat kuesioner lagi
      * @param e
      */
     public void kondisi5Dno26a(KeyEvent e){
         if(e.getComponent().equals(listBlok5D.get(9))){
             if(listBlok5D.get(9).getLength()==listBlok5D.get(9).getText().length() && pencet(e)){
                 if(listBlok5D.get(9).getText().equals("4")){
                    for(int i=10;i<13;i++){
                        listBlok5D.get(i).setText("");
                        listBlok5D.get(i).setEnabled(false);
                    }
                    listBlok5D.get(13).requestFocusInWindow();
                }
                else if(listBlok5D.get(9).getText().equals("2")||listBlok5D.get(9).getText().equals("3")){
                    listBlok5D.get(10).setText("");
                    listBlok5D.get(11).setText("");
                    listBlok5D.get(10).setEnabled(false);
                    listBlok5D.get(11).setEnabled(false);
                    listBlok5D.get(12).setEnabled(true);
                    listBlok5D.get(12).requestFocusInWindow();
                }
                else if(listBlok5D.get(9).getText().equals("1")){
                    for(int i=10;i<13;i++)
                        listBlok5D.get(i).setEnabled(true);
                    listBlok5D.get(10).requestFocusInWindow();
                }
             }
         }
     }

     /**
      * Melakukan pengecekan pada umur bayi
      * Jika umurnya kurang dari bulan maka akan langsung skip
      * Dilakukan jika panjang textField==panjang text
      * @param e
      * @param ini
      * @param indeks
      * @param bulan
      */
     public void makananBayi(KeyEvent e, List<TextField> ini, int indeks, int bulan){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e)){
                 int umur=listBlok5B.get(3).getInt();
         if(umur<=bulan){
             for(int i=indeks+1;i<ini.size();i++){
                 ini.get(i).setText("");
                 ini.get(i).setEnabled(false);
             }
             SkipHalaman(e, ini, indeks, kues.getHalaman4(), "Halaman4");
         }
         else{
             for(int i=indeks+1;i<ini.size();i++){
                 ini.get(i).setText("");
                 ini.get(i).setEnabled(true);
             }
             ini.get(indeks+1).requestFocusInWindow();
         }
             }
         }
     }

     /**
      * Melakukan pengecekan pada umur bayi
      * Jika umurnya kurang dari bulan maka akan langsung skip
      * Dilakukan jika menekan enter/bawah
      * @param e
      * @param ini
      * @param indeks
      * @param bulan
      */
     public void makananBayiE(KeyEvent e, List<TextField> ini, int indeks, int bulan){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                 int umur=listBlok5B.get(3).getInt();
         if(umur<=bulan){
             for(int i=indeks+1;i<ini.size();i++){
                 ini.get(i).setText("");
                 ini.get(i).setEnabled(false);
             }
             SkipHalaman(e, ini, indeks, kues.getHalaman4(), "Halaman4");
         }
         else{
             for(int i=indeks+1;i<ini.size();i++){
                 ini.get(i).setText("");
                 ini.get(i).setEnabled(true);
             }
             ini.get(indeks+1).requestFocusInWindow();
         }
             }
         }
     }

     public void frekuensiMethod(){
         int frek=listBlok5E.get(2).getInt();
        if(frek==1){
            listBlok5E.get(4).setText("");
            listBlok5E.get(5).setText("");
            listBlok5E.get(4).setEnabled(false);
            listBlok5E.get(5).setEnabled(false);
            listBlok5E.get(3).requestFocusInWindow();
        }
        else if(frek==2){
            listBlok5E.get(4).setEnabled(true);
            listBlok5E.get(5).setText("");
            listBlok5E.get(5).setEnabled(false);
            listBlok5E.get(3).requestFocusInWindow();
        }
        else{
            listBlok5E.get(4).setEnabled(true);
            listBlok5E.get(5).setEnabled(true);
            listBlok5E.get(3).requestFocusInWindow();
        }
     }
     /**
      * Melakukan validasi pada blok 5E,
      * Jika frekuensinya 0, maka akan langsung skip,
      * Jika tidak, akan sesuai dngan yang lainnya
      * @param e
      */
     public void frekuensi(KeyEvent e){
         if(e.getComponent().equals(listBlok5E.get(2))){
             if(listBlok5E.get(2).getText().length()==listBlok5E.get(2).getLength() && pencet(e)){
                frekuensiMethod();
             }
         }
     }

     /**
      * Sama dengan yang di atas,
      * Tapi baru dijalankan jika melakukan penekanan enter/bawah
      * @param e
      */
     public void frekuensiE(KeyEvent e){
         if(e.getComponent().equals(listBlok5E.get(2))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                frekuensiMethod();
             }
         }
     }

     /**
      * validasi untuk blok 5E no 30c
      * dilakukan jika panjang textField==panjang text
      * @param e
      * @param ini
      * @param indeks
      */
     public void penyuluhan(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e)){
         if(!ini.get(indeks+1).isEnabled())
            SkipHalamanE(e, ini, indeks, kues.getHalaman4(), "Halaman4");
        else
            ini.get(indeks+1).requestFocusInWindow();
            }
        }
     }

     /**
      * validasi untuk blok 5E no 30c
      * dilakukan jika melakukan penekanan enter/bawah
      * @param e
      * @param ini
      * @param indeks
      */
     public void penyuluhanE(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
         if(!ini.get(indeks+1).isEnabled())
            SkipHalamanE(e, ini, indeks, kues.getHalaman4(), "Halaman4");
        else
            ini.get(indeks+1).requestFocusInWindow();
            }
        }
     }

     public void cekUmurKandungMethod(List<TextField> ini, int indeks){
         int noUrutIbuKandung=listBlok5.get(3).getInt();
         int tahun=ini.get(indeks).getInt();
         if(noUrutIbuKandung!=0 && !ini.get(indeks).getText().equals("9999")){
             int umur=kues.getHalaman2().getListHalaman2().get(noUrutIbuKandung-1).get(3).getInt();
             int hUmur1=2010-tahun;
             int hUmur2=2010-tahun-1;
             if(umur!=hUmur1 && umur!=hUmur2){
                 Pesan(K);
                 ini.get(indeks).requestFocusInWindow();
             }
         }
     }
     /**
      * validasi untuk mengecek umur ibu kandung
      * @param e
      * @param ini
      * @param indeks
      */
     public void cekUmurIbuKandung(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() &&pencet(e)){
                cekUmurKandungMethod(ini, indeks);
             }
         }
     }

     /**
      * validasi untuk mengecek umur ibu kandung
      * @param e
      * @param ini
      * @param indeks
      */
     public void cekUmurIbuKandungE(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                 cekUmurKandungMethod(ini, indeks);
             }
         }
     }

     public void cekKonsistenUmurAnakMethod(List<TextField> ini, int indeks){
        int indeksTua=ini.get(indeks).getInt();
         int indeksAnak=listBlok5.get(2).getInt();
         int umurTua=kues.getHalaman2().getListHalaman2().get(indeksTua-1).get(3).getInt();
         int umurAnak=kues.getHalaman2().getListHalaman2().get(indeksAnak-1).get(3).getInt();
         if(umurTua<=umurAnak){
             Pesan(U);
             ini.get(indeks).requestFocusInWindow();
         }
     }
     /**
      * Untuk mengecek umur anak dan orang yang sedang dimaksud
      * Jika umur anaknya lebih besar dari orang yang dimaksud, maka akan salah
      * @param e
      * @param ini
      * @param indeks
      */
     public void cekKonsistenUmurAnak(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e) && ini.get(indeks).getInt()!=0){
                cekKonsistenUmurAnakMethod(ini, indeks);
             }
         }
     }


     /**
      * Untuk mengecek umur anak dan orang yang sedang dimaksud
      * Jika umur anaknya lebih besar dari orang yang dimaksud, maka akan salah
      * @param e
      * @param ini
      * @param indeks
      */
     public void cekKonsistenUmurAnakE(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if((e.getKeyCode()==KeyEvent.VK_ENTER|| e.getKeyCode()==KeyEvent.VK_DOWN) && ini.get(indeks).getInt()!=0){
                 cekKonsistenUmurAnakMethod(ini, indeks);
             }
         }
     }


     public void konsistenJKIbuMethod(List<TextField> ini, int indeks){
           if(ini.get(indeks).getInt()!=0){
                 int indeksIbu=ini.get(indeks).getInt();
                 if(kues.getHalaman2().getListHalaman2().get(indeksIbu-1).get(2).getInt()!=2){
                     Pesan(JK);
                     ini.get(indeks).requestFocusInWindow();
                 }
             }
     }
     /**
      * Mengecek jenis kelamin ibu kandung
      * Jika jenis kelaminnya laki2, maka salah
      * Dilakukan jika panjang text==panjang textField
      * @param e
      * @param ini
      * @param indeks
      */
     public void konsistenJKIbu(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length() && pencet(e)){
               konsistenJKIbuMethod(ini, indeks);
             }
         }
     }
     /**
      * Mengecek jenis kelamin ibu kandung
      * Jika jenis kelaminnya laki2, maka salah
      * Dilakukan jika melakukan penekanan enter/bawah
      * @param e
      * @param ini
      * @param indeks
      */
     public void konsistenJKIbuE(KeyEvent e, List<TextField> ini, int indeks){
         if(e.getComponent().equals(ini.get(indeks))){
             if(e.getKeyCode()==KeyEvent.VK_ENTER|| e.getKeyCode()==KeyEvent.VK_DOWN){
                 konsistenJKIbuMethod(ini, indeks);
             }
         }
     }

     public void konsistenUmurMethod(List<TextField> ini, int indeks){
         int umur=listBlok5.get(1).getInt();
         if(ini.get(indeks).getInt()>umur){
             Pesan(T);
             ini.get(indeks).requestFocusInWindow();
         }
         else{
             ini.get(indeks+1).requestFocusInWindow();
         }
     }

     public void konsistenUmur(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&&pencet(e))
                konsistenUmurMethod(ini, indeks);
        }
     }

     public void konsistenUmurE(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN)
                konsistenUmurMethod(ini, indeks);
        }
     }

     /**
      * Validasi untuk skip ke blok selajutnya
      * Tapi melakukan pengecekan terlebih dahulu terhadap umurnya
      * Jika umurnya memenuhi, maka akan ke blok selanjutnya
      * Jika tidak, maka akan pindah halaman
      * @param e
      * @param ini
      * @param indeks
      * @param itu
      */
     public void cekBlok(KeyEvent e, List<TextField> ini, int indeks, List<TextField> itu){
         if(e.getComponent().equals(ini.get(indeks))){
             if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()){
                 int umur=listBlok5.get(1).getInt();
                 if(periksa(ini, indeks)==null){
                    if(umur>=15){
                        itu.get(0).requestFocusInWindow();
                    }
                    else{
                    }
                 }
                 else{
                     Pesan(T);
                     ini.get(periksa(ini, indeks)).requestFocusInWindow();
                 }
             }
         }
     }


     /**
      * Melakukan perpindahan ke blok selanjutnya
      * @param e
      * @param ini
      * @param itu
      */
    public void atasBlokE(KeyEvent e, List<TextField> ini, List<TextField> itu){
        if(e.getComponent().equals(itu.get(0))){
            if(e.getKeyCode()==KeyEvent.VK_UP){
                if(ini.get(ini.size()-1).isEnabled())
                    ini.get(ini.size()-1).requestFocusInWindow();
                else{
                    for(int i=ini.size()-1;i>=0;i--){
                        if(ini.get(i).isEnabled()){
                            ini.get(i).requestFocusInWindow();
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Melakukan skip ke tujuan selanjutnya
     * Dilakukan jika panjang text==panjang textField
     * @param e
     * @param ini
     * @param indeks
     */
    public void LangsungSkip(KeyEvent e, List<TextField> ini, int indeks,int indeks2){
        if(e.getComponent().equals(ini.get(indeks))){
            if(ini.get(indeks).getLength()==ini.get(indeks).getText().length()&& pencet(e)){
                setKosong(ini, indeks, indeks2);
            }
        }
    }

    /**
     * Melakukan skip ke tujuan selanjutnya
     * Dilakukan jika melakukan penekanan enter/bawah
     * @param e
     * @param ini
     * @param indeks
     */
    public void LangsungSkipE(KeyEvent e, List<TextField> ini, int indeks,int indeks2){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                setKosong(ini, indeks, indeks2);
            }
        }
    }

    /**
     * Melakukan validasi ke textFieldselanjutnya jika tekan bawah/enter
     * Dan ke TextField sebelumnya jika tekan atas
     * @param e
     * @param ini
     */
    public void atasBawahEnterE(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                if(indeks!=ini.size()-1){
                    if(!ini.get(indeks+1).isEnabled()){
                        for(int j=indeks+2;j<ini.size();j++){
                            if(ini.get(j).isEnabled()){
                                ini.get(j).requestFocusInWindow();
                                break;
                            }
                        }
                    }
                    else
                        ini.get(indeks+1).requestFocusInWindow();
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_UP){
                if(indeks!=0){
                    if(!ini.get(indeks-1).isEnabled()){
                        for(int j=indeks-2;j>=0;j--){
                            if(ini.get(j).isEnabled()){
                                ini.get(j).requestFocusInWindow();
                                break;
                            }
                        }
                    }
                    else
                        ini.get(indeks-1).requestFocusInWindow();
                }
            }
        }
    }

    /**
     * Jika ditekan atas, maka akan ke atas
     * @param e
     * @param ini
     * @param indeks
     */
    public void atasE(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_UP){
                if(indeks!=0){
                    if(!ini.get(indeks-1).isEnabled()){
                        for(int j=indeks-2;j>=0;j--){
                            if(ini.get(j).isEnabled()){
                                ini.get(j).requestFocusInWindow();
                                break;
                            }
                        }
                    }
                    else
                        ini.get(indeks-1).requestFocusInWindow();
                }
            }
        }
    }

    /**
     * Jika ditekan bawah/enter , maka akan ke bawah
     * @param e
     * @param ini
     * @param indeks
     */
    public void bawahE(KeyEvent e, List<TextField> ini, int indeks){
        if(e.getComponent().equals(ini.get(indeks))){
            if(e.getKeyCode()==KeyEvent.VK_ENTER||e.getKeyCode()==KeyEvent.VK_DOWN){
                if(indeks!=ini.size()-1){
                    if(!ini.get(indeks+1).isEnabled()){
                        for(int j=indeks+2;j<ini.size();j++){
                            if(ini.get(j).isEnabled()){
                                ini.get(j).requestFocusInWindow();
                                break;
                            }
                        }
                    }
                    else
                        ini.get(indeks+1).requestFocusInWindow();
                }
            }
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * validasi blok 5
     * @param e
     */
     public void validasiB5(KeyEvent e){
         for(int i=0;i<3;i++)
            Biasa(e, listBlok5, i);
         kondisiBlok5No2(e,listBlok5, 3, 15, 1, 1, 10);
//         cekKonsistenUmurAnak(e, listBlok5, 4);
         cekKonsistenUmurAnak(e, listBlok5, 6);
//         Biasa(e, listBlok5, 4);
         kondisiBlok5no3(e, listBlok5, 4);
         Biasa(e, listBlok5, 5);
//        cekKonsistenART(e,listBlok5, 6, 5);
        cekARTBiasa(e, listBlok5, 6, 5);
       konsistenJKIbu(e, listBlok5, 3);
         skip2lain(e, listBlok5, 7, 10, "6",6);
         LangsungSkip(e, listBlok5, 8,10);
//        Biasa(e, listBlok5, 8);
        Biasa(e, listBlok5, 9);
        cekDuluBlok(e, listBlok5, 10, 9, listBlok5A);
    }

     /**
      * validasi blok 5
      * @param e
      */
      public void validasiB5Enter(KeyEvent e){
         halAtas(e,listBlok5);
         bawahE(e, listBlok5, 0);
         for(int i=1;i<3;i++)
            atasBawahEnterE(e, listBlok5,i);
         kondisiBlok5No2E(e,listBlok5, 3, 15, 1, 1, 10);
         atasE(e, listBlok5, 3);
         atasE(e, listBlok5, 4);
         kondisiBlok5no3E(e, listBlok5, 4);
//         atasBawahEnterE(e, listBlok5, 4);
         atasBawahEnterE(e, listBlok5, 5);
//        cekKonsistenARTE(e,listBlok5, 6, 5);
         skip2lainE(e, listBlok5, 7, 10, "6",6);
         konsistenJKIbuE(e, listBlok5, 3);
//         cekKonsistenUmurAnakE(e, listBlok5, 3);
         cekKonsistenUmurAnakE(e, listBlok5, 4);
         cekKonsistenUmurAnakE(e, listBlok5, 6);
        cekARTBiasaE(e, listBlok5, 6, 5);
         atasE(e, listBlok5, 7);
         atasE(e, listBlok5, 8);
         LangsungSkipE(e, listBlok5,8,10);
//         atasBawahEnterE(e, listBlok5, 8);
        atasBawahEnterE(e, listBlok5, 9);
        cekDuluBlokE(e, listBlok5, 10, 9, listBlok5A);
        atasE(e, listBlok5, 10);
     }

      /**
       * validasi blok 5A
       * @param e
       */
     public void validasiB5A(KeyEvent e){
         for(int i=0;i<7;i++)
             Biasa(e, listBlok5A, i);
         kondisi5Ano6(e, listBlok5A, 7);
         Biasa(e, listBlok5A, 8);
         skip1(e, listBlok5A, 9, 11, "2");
         Biasa(e, listBlok5A, 10);
         validasiNilai(e, listBlok5A,10 , 30);
         skip1(e,listBlok5A, 11,16,"2");
         Biasa(e, listBlok5A, 12);
         Biasa(e, listBlok5A, 13);
//         skip2(e,listBlok5A, 14, 16, "1");
         kondisiAdaGaAda(e, listBlok5A, 14, 12);
         Biasa(e, listBlok5A, 15);
         skip1(e,listBlok5A, 16,26,"2");
         for(int i=17;i<24;i++){
            Biasa(e,listBlok5A, i);
             validasiNilai(e, listBlok5A, i, 31);
         }
         Biasa(e,listBlok5A, 25);
         kondisi5A(e, listBlok5A, 26, "2");
         atasE(e, listBlok5A, 26);
         for(int i=27;i<32;i++){
            Biasa(e,listBlok5A, i);
             validasiNilai(e, listBlok5A, i, 365);
         }
         kondisiB5Ano11(e);
         kondisiB5Ano13(e);
         namanya="Halaman3_"+(JmlahART+1);
         validasiEnterDown2(e,listBlok5A, 33, kues.getListHal3().get(JmlahART), namanya);
    }

     /**
      * validasi blok 5A
      * @param e
      */
     public void validasiB5AE(KeyEvent e){
         atasBlokE(e, listBlok5, listBlok5A);
         for(int i=0;i<9;i++)
             atasBawahEnterE(e, listBlok5A, i);
         skip1E(e, listBlok5A, 9, 11, "2");
         atasE(e, listBlok5A, 9);
         atasBawahEnterE(e, listBlok5A, 10);
         skip1E(e,listBlok5A, 11,16,"2");
         atasE(e, listBlok5A, 11);
         validasiNilaiE(e, listBlok5A,10 , 30);
         atasBawahEnterE(e, listBlok5A, 12);
         atasBawahEnterE(e, listBlok5A, 13);
         atasE(e, listBlok5A, 14);
//         skip2E(e,listBlok5A, 14, 16, "1");
         kondisiAdaGaAdaE(e, listBlok5A, 14, 12);
         atasBawahEnterE(e, listBlok5A, 15);
         atasE(e, listBlok5A, 16);
         skip1E(e,listBlok5A, 16,26,"2");
         for(int i=17;i<24;i++){
             atasBawahEnterE(e, listBlok5A, i);
             validasiNilaiE(e, listBlok5A, i, 31);
         }
         atasBawahEnterE(e, listBlok5A, 25);
         kondisi5AE(e, listBlok5A, 26, "2");
         atasE(e, listBlok5A, 26);
         for(int i=27;i<32;i++){
             atasBawahEnterE(e, listBlok5A, i);
             validasiNilaiE(e, listBlok5A, i, 365);
         }
         kondisiB5Ano11E(e);
         kondisiB5Ano13E(e);
         namanya="Halaman3_"+(JmlahART+1);
         validasiEnterDown2E(e,listBlok5A, 33, kues.getListHal3().get(JmlahART), namanya);
    }


     /**
      * validasi blok 5B
      * @param e
      */
    public void validasiB5B(KeyEvent e){
        for(int i=0;i<5;i++)
            Biasa(e, listBlok5B, i);
        cekTanggal(e, listBlok5B, 0, 31);
        cekTanggal(e, listBlok5B, 1, 12);
        cekUmurIbuKandung(e, listBlok5B, 2);
        validasiNilai(e,listBlok5B, 2, 1998, 1945);
        validasiCekAngka(e,listBlok5B, 3);
        kondisi5B15a(e);
        validasiNilai(e,listBlok5B, 4, 30);
        skip2(e,listBlok5B, 5, 7,"6");
        for(int i=6;i<12;i++)
            Biasa(e,listBlok5B, i);
        skip1(e,listBlok5B, 12,14, "0");
        Biasa(e,listBlok5B, 13);
        SkipHalaman2(e,listBlok5B, 14, "2", kues.getHalaman4() ,"Halaman4");
        makananBayi(e, listBlok5B, 15, 6);
        makananBayi(e, listBlok5B, 16, 11);
        SkipHalaman(e,listBlok5B, 17,kues.getHalaman4() , "Halaman4");
    }

    /**
     * validasi blok 5B
     * @param e
     */
     public void validasiB5BE(KeyEvent e){
        atasBlokE(e, listBlok5A, listBlok5B);
         for(int i=0;i<5;i++)
             atasBawahEnterE(e, listBlok5B, i);
        cekTanggalE(e, listBlok5B, 0, 31);
        cekTanggalE(e, listBlok5B, 1, 12);
        cekUmurIbuKandungE(e, listBlok5B, 2);
        validasiNilaiE(e,listBlok5B, 2, 1998, 1945);
//        skip2E(e,listBlok5B, 3, 5,"00");
        validasiCekAngkaE(e,listBlok5B, 3);
        kondisi5B15aE(e);
        validasiNilaiE(e,listBlok5B, 4, 30);
        skip2E(e,listBlok5B, 5, 7,"6");
        atasE(e, listBlok5B, 5);
        for(int i=6;i<12;i++)
            atasBawahEnterE(e, listBlok5B,i);
        skip1E(e,listBlok5B, 12,14, "0");
        atasE(e, listBlok5B, 12);
        atasBawahEnterE(e, listBlok5B, 13);
        SkipHalaman2E(e,listBlok5B, 14, "2", kues.getHalaman4() ,"Halaman4");
        for(int i=14;i<17;i++)
        atasE(e, listBlok5B, i);
        makananBayiE(e, listBlok5B, 15, 6);
        makananBayiE(e, listBlok5B, 16, 11);
        SkipHalamanE(e,listBlok5B, 17,kues.getHalaman5() , "Halaman4");
        atasE(e, listBlok5B, 17);
    }

     /**
      * validasi blok 5C
      * @param e
      */
    public void validasiB5C(KeyEvent e){
        for(int i=0;i<4;i++)
            Biasa(e, listBlok5C, i);
        endB5C(e, listBlok5C, 4);
    }

    /**
     * validasi blok 5C
     * @param e
     */
     public void validasiB5CE(KeyEvent e){
         atasBlokE(e, listBlok5A, listBlok5C);
        for(int i=0;i<4;i++)
            atasBawahEnterE(e, listBlok5C, i);
        atasE(e, listBlok5C, 4);
        endB5CE(e, listBlok5C, 4);
    }

     /**
      * validasi blok 5D
      * @param e
      */
    public void validasiB5D(KeyEvent e){
        atasBlokE(e, listBlok5D, listBlok5C);
        for(int i=0;i<4;i++)
            Biasa(e,listBlok5D, i);
        kondisi5D23(e);
        skip1(e,listBlok5D, 4,6, "2");
        Biasa(e, listBlok5D, 5);
        kondisi5Dno24(e);
        Biasa(e, listBlok5D, 7);
        Biasa(e, listBlok5D, 8);
        kondisi5Dno26a(e);
        for(int i=10;i<11;i++)
            Biasa(e, listBlok5D, i);
        konsistenUmur(e, listBlok5D, 11);
        konsistenUmur(e, listBlok5D, 12);
        skip1(e,listBlok5D, 13,15, "1");
        LangsungSkip(e, listBlok5D, 14, 27);
        skip2(e,listBlok5D, 15,17, "4");
        for(int i=16;i<23;i++)
            Biasa(e, listBlok5D, i);
//        skip1(e, listBlok5D, 23, 25, "2");
        kondisiAdaGaAda(e, listBlok5D, 23, 19);
        Biasa(e, listBlok5D, 24);
        validasiNilai(e, listBlok5D,25, 12);
        skip2(e, listBlok5D, 25, 27, "12");
//        Biasa(e, listBlok5D, 24);
        Biasa(e, listBlok5D, 26);
        skip1(e, listBlok5D, 27, 29, "1");
//        validasiSkipBlok(e, listBlok5D, 27, "2", listBlok5E);
        BiasaBlok(e, listBlok5D, 28, listBlok5E);
        for(int i=29;i<32;i++)
            Biasa(e, listBlok5D, i);
//        validasiSkipBlok(e, listBlok5D, 32, "2", listBlok5E);
        kondisiAdaGaAdaBlok(e, listBlok5D, 32, 29);
        BiasaBlok(e, listBlok5D, 33, listBlok5E);
    }

    /**
     * validasi blok 5d
     * @param e
     */
     public void validasiB5DE(KeyEvent e){
         atasBlokE(e, listBlok5C, listBlok5D);
        for(int i=0;i<4;i++)
            atasBawahEnterE(e,listBlok5D, i);
        kondisi5D23E(e);
        skip1E(e,listBlok5D, 4,6, "2");
        atasE(e, listBlok5D, 4);
        for(int i=5;i<11;i++)
            atasBawahEnterE(e, listBlok5D, i);
        atasE(e, listBlok5D, 11);
        atasE(e, listBlok5D, 12);
        konsistenUmurE(e, listBlok5D, 11);
        konsistenUmurE(e, listBlok5D, 12);
//        for(int i=10;i<13;i++)
//            atasBawahEnterE(e, listBlok5D, i);
        kondisi5Dno24E(e);
        skip1E(e,listBlok5D, 13,15, "1");
        LangsungSkipE(e, listBlok5D, 14,27);
        skip2E(e,listBlok5D, 15,17, "4");
        for(int i=13;i<16;i++)
            atasE(e, listBlok5D, i);
        for(int i=16;i<23;i++)
            atasBawahEnterE(e, listBlok5D, i);
        atasE(e, listBlok5D, 23);
//        skip1E(e, listBlok5D, 23, 25, "2");
        kondisiAdaGaAdaE(e, listBlok5D, 23, 19);
        atasBawahEnterE(e, listBlok5D, 24);
        validasiNilaiE(e, listBlok5D,25, 12);
        skip2E(e, listBlok5D, 25, 27, "12");
        atasE(e, listBlok5D, 25);
//        atasBawahEnterE(e, listBlok5D, 24);
        atasBawahEnterE(e, listBlok5D, 26);
        validasiSkipBlokE(e, listBlok5D, 27, "2", listBlok5E);
        atasE(e, listBlok5D, 27);
        BiasaBlokE(e, listBlok5D, 28, listBlok5E);
        atasE(e, listBlok5D, 28);
        for(int i=29;i<32;i++)
            atasBawahEnterE(e, listBlok5D, i);
//        validasiSkipBlokE(e, listBlok5D, 32, "2", listBlok5E);
        atasE(e, listBlok5D, 32);
        kondisiAdaGaAdaBlokE(e, listBlok5D, 32, 29);
        atasE(e, listBlok5D, 33);
        BiasaBlokE(e, listBlok5D, 33, listBlok5E);
    }

     /**
      * validasi blok 5e
      * @param e
      */
    public void validasiB5E(KeyEvent e){
        skip1(e, listBlok5E, 0, 2, "1");
        SkipHalaman(e, listBlok5E, 1, kues.getHalaman4(),"Halaman4");
        validasiNilai(e, listBlok5E, 2, 365);
        frekuensi(e);
        penyuluhan(e, listBlok5E, 3);
        penyuluhan(e, listBlok5E, 4);
        SkipHalaman(e, listBlok5E, 5, kues.getHalaman4(), "Halaman4");
    }

    /**
     * validasi blok 5e
     * @param e
     */
    public void validasiB5EE(KeyEvent e){
        atasBlokE(e, listBlok5D, listBlok5E);
        for(int i=1;i<6;i++)
            atasE(e, listBlok5E, i);
        skip1E(e, listBlok5E, 0, 2, "1");
        SkipHalamanE(e, listBlok5E, 1, kues.getHalaman4(), "Halaman4");
        validasiNilaiE(e, listBlok5E, 2, 365);
        frekuensiE(e);
        penyuluhanE(e, listBlok5E, 3);
        penyuluhanE(e, listBlok5E, 4);
        SkipHalamanE(e, listBlok5E, 5, kues.getHalaman4(), "Halaman4");
    }

    /**
     * validasi blok 6
     * @param e
     */
    public void validasiB6(KeyEvent e){
        skip2(e,listBlok6, 0,2, "1");
        for(int i=1;i<6;i++)
            Biasa(e,listBlok6, i);
        skip2(e,listBlok6, 6,8, "6");
        Biasa(e,listBlok6, 7);
        skip2(e,listBlok6, 8,10, "8");
//        if(e.getComponent().equals(listBlok6.get(8))){
//            if(listBlok6.get(8).getText().equals("1")||listBlok6.get(8).getText().equals("2")){
//                listBlok6.get(10).setText("1");
//                listBlok6.get(11).requestFocusInWindow();
//            }
//            else{
//                listBlok6.get(10).setText("");
//            }
//        }
        for(int i=9;i<15;i++)
            Biasa(e,listBlok6, i);
        if(e.getComponent().equals(listBlok6.get(10))){
            if(listBlok6.get(10).getText().equals("2")||listBlok6.get(10).getText().equals("3")){
                if(listBlok6.get(8).getText().equals("1")){
                    Pesan(T);
                    listBlok6.get(8).requestFocusInWindow();
                }
            }
        }
//        if(e.getComponent().equals(listBlok6.get(13))){
//            if(listBlok6.get(13).getText().equals("3")){
//                listBlok6.get(14).setText("4");
//                listBlok6.get(15).requestFocusInWindow();
//            }
//            else{
//                listBlok6.get(14).setText("");
//            }
//        }
        if(e.getComponent().equals(listBlok6.get(14))){
            if(listBlok6.get(14).getText().equals("1")||listBlok6.get(14).getText().equals("2")||listBlok6.get(10).getText().equals("3")){
                if(listBlok6.get(13).getText().equals("3")){
                    Pesan(T);
                    listBlok6.get(13).requestFocusInWindow();
                }
            }
        }


        skip2(e,listBlok6, 15, 17,"7");
        Biasa(e,listBlok6, 16);
        Biasa(e,listBlok6, 17);
        SkipHalaman2(e, listBlok6, 18, "2", kues.getHalaman5(), "Halaman5");
        SkipHalaman2(e, listBlok6, 19, "2", kues.getHalaman5(), "Halaman5");
        Biasa(e,listBlok6, 20);
        Biasa(e,listBlok6, 21);
        SkipHalaman(e,listBlok6, 22, kues.getHalaman5(),"Halaman5");
    }

    /**
     * validasi blok 6
     * @param e
     */
    public void validasiB6E(KeyEvent e){
        halAtas(e,listBlok6);
        skip2E(e,listBlok6, 0,2, "1");
        for(int i=1;i<6;i++)
            atasBawahEnterE(e,listBlok6, i);
        skip2E(e,listBlok6, 6,8, "6");
        atasE(e, listBlok6, 6);
        atasBawahEnterE(e,listBlok6, 7);
        skip2E(e,listBlok6, 8,10, "8");
        atasE(e, listBlok6,8);
        for(int i=9;i<15;i++)
            atasBawahEnterE(e,listBlok6, i);
        skip2E(e,listBlok6, 15, 17,"7");
        atasE(e, listBlok6, 15);
        atasBawahEnterE(e,listBlok6, 16);
        atasBawahEnterE(e,listBlok6, 17);
        SkipHalaman2E(e, listBlok6, 18, "2", kues.getHalaman5(), "Halaman5");
        SkipHalaman2E(e, listBlok6, 19, "2", kues.getHalaman5(), "Halaman5");
        atasE(e, listBlok6, 18);
        atasE(e, listBlok6, 19);
        atasBawahEnterE(e,listBlok6, 20);
        atasBawahEnterE(e,listBlok6, 21);
        SkipHalamanE(e,listBlok6, 22, kues.getHalaman5(),"Halaman5");
        atasE(e, listBlok6, 22);
    }


    /**
     * Semua validasi yang ada di dalam akan dieksekusi saat melakukan
     * penekanan tombol pada keyboard dan akan eksekusi saat melepaskan
     * tombol yang ditekan
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {
       if(kues.getHalaman4().isVisible())
           validasiB6(e);
       else{
           validasiB5(e);
           validasiB5A(e);
           validasiB5B(e);
           validasiB5C(e);
           validasiB5D(e);
           validasiB5E(e);
       }
    }


    /**
     * Semua validasi yang ada di dalam akan dieksekusi saat melakukan
     * penekanan tombol pada keyboard dan akan eksekusi langsung saat menekan tombol
     * tombol yang ditekan
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if(kues.getHalaman4().isVisible())
            validasiB6E(e);
        else{
            validasiB5Enter(e);
            validasiB5AE(e);
            validasiB5BE(e);
            validasiB5CE(e);
            validasiB5DE(e);
            validasiB5EE(e);
        }
    }

      /**
      * Mengganti tampilan panel dengan halaman yang dituju pada panel utama
      * @param panel halaman yang akan dituju
      * @param nama Nama dari halaman yang akan dituju
      */
    protected   void showPanel(Component panel, String nama){
        if (panel.isVisible()){
            return;
        }
        ((CardLayout)kues.getPanelInduk().getLayout()).show(kues.getPanelInduk(), nama);
    }
}