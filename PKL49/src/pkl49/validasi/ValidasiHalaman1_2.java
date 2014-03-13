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
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import pkl49.component.Formatter;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.control.DataStatic;
import pkl49.database.Blok1DaoImpl;
import pkl49.database.DataStat;
import pkl49.database.KoneksiMysQl;
import pkl49.util.*;
import pkl49.view.PanelKuesioner;

/**
 * Class validasi 
 * @author sie Pengolahan @ subsie Program
 * Klas ini digunakan untuk mengeset validasi untuk
 * blok di halaman 1 dan dua yaitu
 * blok 1 , blok 2, blok3, dan blok4
 */
public class ValidasiHalaman1_2 extends KeyAdapter {
    /**
     * lists digunakan untuk membuat list dari textfield yang dua dimensi
     * listTxt digunakan untuk membuat list dari textfield yang satu dimensi
     * namaHal digunakan untuk mendeteksi Halaman yang akan divalidasi
     * kolom3,kolom7,kolom8 dan kolom 9 digunakan untuk menyimpan nilai pada blok 4 untuk validasi
     * jumlahART digunakan untuk membatasi perulangan
     * panelKuesioner adalah panel utama yang nantinya digunakan untuk program utama kita
     */
    private List<List<TextField>> listHalaman2;
    private List<TextField> listHalaman1;
    private String namaHal;
    private int kolom3[], kolom7[],kolom8 [],kolom9[],kolom5[];
    private int jumlahART=1;
    private PanelKuesioner panelKuesioner;



    /**     
     * Construktor yang digunakan untuk textfield biasa untuk halaman 1
     * @param listTxt
     * @param namaBlok
     */

    public ValidasiHalaman1_2(List<TextField> listTxt,String namaHal,PanelKuesioner kuesioner) {
        this.panelKuesioner=kuesioner;
        jumlahART=0;
        this.listHalaman1 = listTxt;
        //set textfield untuk digunakan nim dan tanggal
        Formatter tanggal=new Formatter("##/##/2010");
        Formatter nim=new Formatter("0#.####");
        Formatter blok=new Formatter("###B");
        this.listHalaman1.get(16).setFormatterFactory(nim);
        this.listHalaman1.get(17).setFormatterFactory(tanggal);
        this.listHalaman1.get(19).setFormatterFactory(nim);
        this.listHalaman1.get(20).setFormatterFactory(tanggal);
        this.listHalaman1.get(4).setFormatterFactory(blok);
        this.namaHal=namaHal;
        for(int i = 0;i<listTxt.size();i++){
            listTxt.get(i).addKeyListener(this);
        }
    }

    /**
     * Construktor yang digunakan untuk textField dalam looping (halaman2)
     * @param namaBlok adalah nama halaman yang akan dilakukan validasinya
     * @param list menampung textfield yang berada dalam panel
     */
    public ValidasiHalaman1_2(String namaHal,List<List<TextField>> list,PanelKuesioner kuesioner) {
        this.panelKuesioner=kuesioner;
        this.namaHal=namaHal;
        if(namaHal.equals("Hal2")){
            kolom3=new int[25];
            kolom7=new int[25];
            kolom8=new int[25];
            kolom9=new int[25];
            kolom5=new int[25];
        }
        this.listHalaman2=list;
        for(int i=0;i<this.listHalaman2.size();i++){
            for(int j=0;j<this.listHalaman2.get(i).size();j++){
                list.get(i).get(j).addKeyListener(this);
            }
        }

    }

    public int getJumlahART() {
        return jumlahART;
    }

    public void setJumlahART(int jumlahART) {
        this.jumlahART = jumlahART;
    }
    
/**
 * Validasi tiap halaman dengan mengecek nama halaman
 * method validasiblok dipanggil tiap masing masing
 * method cekupdown digunakan untuk mengecek tombol atas dan bawahnya
 * @param e
 */

    @Override
    public void keyReleased(KeyEvent e) {
        if(namaHal.equals("Hal1")){
            validasiBlok1(e);
             cekUpDown(e, listHalaman1);
        }
        else if(namaHal.equals("Hal2")){
            validasiBlok2(e);
            cekUpDownLoop(e, listHalaman2);
        }
    }
    /**
     * Cek jumlah ART tiap rumah tangga 
     * @param e
     * @return
     */
    protected boolean cekJumlahART(KeyEvent e){
        boolean cek = true;
         try{
            if(e.getComponent().equals(listHalaman1.get(14)) && !(e.getKeyCode()==KeyEvent.VK_UP )){
                int A,B,C,D,E,F;
                A=listHalaman1.get(9).getInt();
                B=listHalaman1.get(10).getInt();
                C=listHalaman1.get(11).getInt();
                D=listHalaman1.get(12).getInt();
                E=listHalaman1.get(13).getInt();
                F=listHalaman1.get(14).getInt();
                if(A!=B+C+D+E+F){
                    pesan("Maaf Jumlah ART tidak sesuai ulangi lagi");
                    listHalaman1.get(9).requestFocusInWindow();
                    cek = false;
                }else{
                    cekNilai(e, listHalaman1.get(14), listHalaman1.get(16));
                    cek=true;
                }

            }
            }catch(Exception ex){

            }
        return cek;
    }
    /**
     * Digunakan untuk mengecek nilai tiap textfield
     * @param e
     * @param text1 adalah textfield pertama yang akan dicek
     * @param text2 adalah textfield kedua yang akan dicek
     */
    public void cekNilai(KeyEvent e,TextField text1,TextField text2){
        if (e.getComponent().equals(text1)){
            if (e.getKeyChar()>=text1.getMinDigit() && e.getKeyChar()<=text1.getMaxDigit()){
                if(text1.getText().length()==text1.getLength()){
                   text2.requestFocusInWindow();
                }
            }
            
        }
    }
    /**
     * Cek apabila nim yang diketik salah
     * @param NIM
     * @return <code>true</code> jika yang nim yang dimasukan benar
     */
    public boolean cekNIM(String NIM){
        boolean cek = true;
    try{
        String prefix=NIM.substring(0, 2);
        if(!(prefix.equals("07") || prefix.equals("06"))){
            pesan("Maaf NIM anda salah perbaiki lagi!");
            cek= false;
        }
        cek =true;
   }catch(Exception ex){}
        return cek;

    }
    /**
     * Validasi Halaman 1 sampai dengan dengan Blok3
     * @param e
     */
    protected void validasiBlok1(KeyEvent e){
         //Cek kalau jumlah dalam art tidak sama yang dimasukan
          cekJumlahART(e);

        // Skip ke textfield selanjutnya jika pemasukan data benar
            for(int i=0;i<15;i++){
              if(i!=9 && i!=4 && i!=14 &&i!=listHalaman1.size()-1)
                   cekNilai(e, listHalaman1.get(i),listHalaman1.get(i+1));
            }
             //Masukan nama kabupaten secara otomatis
                if(e.getComponent().equals(listHalaman1.get(0)) && listHalaman1.get(0).getText().length()==listHalaman1.get(0).getLength()){
                    //tambahan dari mutaqin
                    String kabu = DataStatic.getTabelKabupaten().get(listHalaman1.get(0).getText());//Set data dengan nama kab sesuai kode
                    panelKuesioner.getHalaman1().getLabelKab().setText(kabu);
                    String kab=listHalaman1.get(0).getText();
                    if(kab.equals("71")){
                        listHalaman1.get(1).setText("3");
                        listHalaman1.get(2).requestFocusInWindow();
                    }else if(kab.equals("02") || kab.equals("06")){
                        listHalaman1.get(1).setText("1");
                        listHalaman1.get(2).requestFocusInWindow();
                    }else if(kab.equals("10") || kab.equals("03")|| kab.equals("08")){
                        listHalaman1.get(1).setText("2");
                        listHalaman1.get(2).requestFocusInWindow();
                    }
                    if(listHalaman1.get(0).getText().length()==listHalaman1.get(0).getLength() && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                        //tambahan dari mutaqin
                        if(kabu==null){
                            pesan("Apakah kode kabupaten anda benar? Cek ulang!");
                            listHalaman1.get(0).requestFocusInWindow();
                        }
                    }

                }
          //Masukan nama kecamatan secara otomatis
          if(e.getComponent().equals(listHalaman1.get(2)) && !listHalaman1.get(2).getText().contains(" ")){
                //tambahan dari mutaqin
                String keca = DataStatic.getTabelKecamatan().get(listHalaman1.get(0).getText()+listHalaman1.get(2).getText());
                panelKuesioner.getHalaman1().getLabelKec().setText(keca);
                if(listHalaman1.get(2).getText().length()==listHalaman1.get(2).getLength() && !(e.getKeyCode()==KeyEvent.VK_ENTER))
                if(keca==null){
                    JOptionPane.showMessageDialog(null, "Apakah kode kecamatan anda benar? Cek ulang!");
                    listHalaman1.get(3).requestFocusInWindow();
                }
            }
          //Masukan nama desa secara otomatis
           if(e.getComponent().equals(listHalaman1.get(3)) && !listHalaman1.get(3).getText().contains(" ")){
               //tambahan dari mutaqin
               String gabung=listHalaman1.get(0).getText()+listHalaman1.get(2).getText()+listHalaman1.get(3).getText();
                    String desa = DataStatic.getTabelDesa().get(gabung);
                    panelKuesioner.getHalaman1().getLabelDesa().setText(desa);
                    if(listHalaman1.get(3).getText().length()==listHalaman1.get(3).getLength() && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                        if(desa==null){
                            JOptionPane.showMessageDialog(null, "Apakah kode desa anda benar? Cek ulang!");
                            listHalaman1.get(3).requestFocusInWindow();
                        }

                    }
                }
            if(e.getComponent().equals(listHalaman1.get(4))){
                if(!listHalaman1.get(4).getText().contains(" ")){
                    listHalaman1.get(5).requestFocusInWindow();
                }
            }
          try{
              if(e.getComponent().equals(listHalaman1.get(6)) && !(listHalaman1.get(6).getText().contains(" ")) ){

                  if(!(e.getKeyCode()==KeyEvent.VK_ENTER) && listHalaman1.get(6).getText().length()>1 ){
                      //tambahan mutaqin
                      String NKS = listHalaman1.get(0).getText()+listHalaman1.get(2).getText()+
                              listHalaman1.get(3).getText()+listHalaman1.get(4).getText()+listHalaman1.get(6).getText();
                      if(listHalaman1.get(6).getInt()>16){
                          pesan("No sampel yang anda masukan salah, maksimal 16 Sampel!");
                          listHalaman1.get(6).requestFocusInWindow();
                      }else if(new DataStat().getNKS(NKS)==null){//Cek apakah NKS ada di daftar NKS di database
                          pesan("Nomor kode sampel tidak ada dalam daftar kode sampel!");
                          listHalaman1.get(6).requestFocusInWindow();
                      }else if(new Blok1DaoImpl(KoneksiMysQl.getConnectionRT()).getBlok1(NKS)!=null){ //cek apakah sudah dientry
                          pesan("Data sudah dientry");
                          listHalaman1.get(6).requestFocusInWindow();
                      }
                  }
              }
          }catch(Exception ex){}
            //cek jika ditekan tombol ke bawah tapi jumlah art masih salah
            if(e.getComponent().equals(listHalaman1.get(14)) && e.getKeyCode()==KeyEvent.VK_DOWN && !cekJumlahART(e)){
                listHalaman1.get(9).requestFocusInWindow();
            }
              //penekanan enter untuk jumlah art jika kurang dari 10
            try{
            for(int k=9;k<=14;k++){
                if(k==9 && listHalaman1.get(9).getInt()>25)
                    listHalaman1.get(k).requestFocusInWindow();
                 else if(e.getComponent().equals(listHalaman1.get(k))&&e.getKeyCode()==KeyEvent.VK_ENTER && !listHalaman1.get(k).getText().equals("")){
                   if(k==14)
                       listHalaman1.get(16).requestFocusInWindow();
                   else
                     listHalaman1.get(k+1).requestFocusInWindow();
                    break;
                 }
            }
            }catch(Exception ex){

            }
            //Cek jika nilai ART tidak sesuai
            try{
            if(e.getComponent().equals(listHalaman1.get(9)) && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                 if (e.getKeyChar()>=listHalaman1.get(9).getMinDigit() && e.getKeyChar()<=listHalaman1.get(9).getMaxDigit()){
                    if(listHalaman1.get(9).getInt()>20 && listHalaman1.get(9).getInt()<=25){
                        pesan("Anda yakin jumlah ART Lebih dari 20 Orang?");
                        listHalaman1.get(10).requestFocusInWindow();
                    }else if(listHalaman1.get(9).getInt()>25){
                        pesan("Tidak mungkin Jumlah ART lebih 25 Orang Cek kembali");
                        listHalaman1.get(9).requestFocusInWindow();
                    }else{
                        cekNilai(e, listHalaman1.get(9), listHalaman1.get(10));
                 }
                 }else{
                     if(e.getKeyCode()==KeyEvent.VK_ENTER && listHalaman1.get(9).getInt()<10){
                         listHalaman1.get(10).requestFocusInWindow();
                     }
                }
            }
            } catch(Exception ex){

            }
           

            /**
             * jika sudah terletak pada halaman akhir maka pindah ke halaman ke 2
             * nama krt langsung otomatis diganti dengan nama krt yang ada di halaman1
             * hubungan juga langsung di set angka 1
             */
            
            if(e.getComponent().equals(listHalaman1.get(20))){
                if(!listHalaman1.get(20).getText().contains(" ") && cekTanggal(listHalaman1.get(20).getText())  ){
                    if(!(e.getKeyCode()==KeyEvent.VK_ENTER)){
                        pesan("Maaf tanggal anda salah mohon perbaiki lagi!");
                        listHalaman1.get(20).requestFocusInWindow();
                    }
                }else if(!listHalaman1.get(20).getText().contains(" ") && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                   if(!compareDate())
                         pesan("Tanggal pemeriksaan harus setelah tanggal pencacahan!");
                }
                else if(!listHalaman1.get(20).getText().contains(" ") && !(e.getKeyCode()==KeyEvent.VK_UP)){
                    //cek jika isian masih ada yang kosong
                    boolean cek=true;
                        for(int i=0;i<=20;i++){
                            if(listHalaman1.get(i).getText().equals("")){
                                pesan("Isian masih ada yang kosong !");
                                listHalaman1.get(i).requestFocusInWindow();
                                cek=false;
                                break;

                            }
                        }
                    if(cek==true && compareDate()){
                       showPanel(panelKuesioner.getHalaman2(), "Halaman2");
                       disableTextField();
                       Controller.setStatus(1);
                       panelKuesioner.getHalaman2().getTxtB4K2_1().setText(listHalaman1.get(7).getText());
                       panelKuesioner.getHalaman2().getTxtB4K3_1().setText("1");
                       panelKuesioner.getHalaman2().getTxtB4K4_1().requestFocusInWindow();
                       panelKuesioner.getHalaman2().getTxtB4K2_1().setContain(true);
                       panelKuesioner.getHalaman2().getTxtB4K3_1().setContain(true);
                    }

                    }
            }
            //penekanan enter untuk nama dan alamat
            if(e.getComponent().equals(listHalaman1.get(7)))
                if(e.getKeyCode()==KeyEvent.VK_ENTER && !listHalaman1.get(7).getText().equals("")){
                    listHalaman1.get(8).requestFocusInWindow();
                }
            if(e.getComponent().equals(listHalaman1.get(8)))
                        if(e.getKeyCode()==KeyEvent.VK_ENTER && !listHalaman1.get(8).getText().equals("")){
                       listHalaman1.get(9).requestFocusInWindow();
                }

            //cek penekanan enter untuk keterangan petugas
            for(int l=15;l<20;l++){
                if(l==17 || l==20){
                    if(e.getComponent().equals(listHalaman1.get(l))&& !(e.getKeyCode()==KeyEvent.VK_ENTER) && !listHalaman1.get(l).getText().contains(" "))
                          if(cekTanggal(listHalaman1.get(l).getText()) ){
                              pesan("Maaf tanggal yang anda masukan salah!");
                              listHalaman1.get(l).requestFocusInWindow();
                          }else{
                                listHalaman1.get(19).requestFocusInWindow();
                                   break;
                          }
                   }else if(l==16){
                      if(e.getComponent().equals(listHalaman1.get(l)) && !(e.getKeyCode()==KeyEvent.VK_ENTER) && !listHalaman1.get(l).getText().contains(" ")){
                          if(!cekNIM(listHalaman1.get(16).getText())){
                              listHalaman1.get(l).requestFocusInWindow();
                              listHalaman1.get(l).setText("");
                          }
                          else if(!listHalaman1.get(l).getText().contains(" ")){
                                listHalaman1.get(l+1).requestFocusInWindow();
                                String nama=new PencacahIdentity().getPencacahDic().get(listHalaman1.get(16).getText());
                                if(nama!=null)
                                    listHalaman1.get(15).setText(nama);
                                else{
                                    pesan("NIM yang anda masukan bukan mahasiswa STIS!");
                                    listHalaman1.get(16).requestFocusInWindow();
                                     listHalaman1.get(16).setText("");
                                }
                              break;
                             }
                      }
                    }else if(l==19){
                      if(e.getComponent().equals(listHalaman1.get(l)) && !(e.getKeyCode()==KeyEvent.VK_ENTER) && !listHalaman1.get(l).getText().contains(" ")){
                          if(!cekNIM(listHalaman1.get(19).getText())){
                              listHalaman1.get(l).requestFocusInWindow();
                              listHalaman1.get(l).setText("");
                          }
                          else if(!listHalaman1.get(l).getText().contains(" ")){
                                listHalaman1.get(l+1).requestFocusInWindow();
                                String nama=new PencacahIdentity().getPencacahDic().get(listHalaman1.get(19).getText());
                                if(nama!=null){
                                    //tambahan mutaqin.
                                    //cek dulu apa bener nim ini kortim?
                                    //klo ya cek nim pencacah
                                    listHalaman1.get(18).setText(nama);
                                    if(DataStatic.cekKortim(listHalaman1.get(19).getText())){
                                        if(DataStatic.getTabelKortimPencacah().get(listHalaman1.get(16).getText())==null){
                                            pesan("Pencacah bukan anggota kortim ini!");
                                            listHalaman1.get(16).requestFocusInWindow();
                                        }
                                    }else{
                                        pesan(nama+" bukan kortim!");
                                        listHalaman1.get(19).requestFocusInWindow();
                                        listHalaman1.get(19).setText("");
                                    }
                                }
                                else{
                                    pesan("NIM yang anda masukan bukan mahasiswa STIS!");
                                    listHalaman1.get(19).setText("");
                                    listHalaman1.get(19).requestFocusInWindow();
                                }
                                   break;
                         }
                      
                    }else{
                         if(e.getComponent().equals(listHalaman1.get(l)))
                          if(e.getKeyCode()==KeyEvent.VK_ENTER && !listHalaman1.get(l).getText().equals("")){
                                listHalaman1.get(l+1).requestFocusInWindow();
                                   break;
                             }
                    }

            }
          
            }
    }
    /**
     * Fungsi yang digunakan untuk mengecek konsistensi umur
     * true bila tidak ada yang salah
     * false ada yang salah
     * dan sudah ada warning teks
     * @return
     */
    protected boolean cekUmur(){
        boolean cek = true;
        int jmlKrg1 = 0,jml1_4 = 0,jml5_14 = 0,jml15_64 = 0,jmlLbh65 = 0;
        for(int i=0;i<jumlahART;i++){
           if(kolom5[i]<1){
               jmlKrg1++;
           }else if(kolom5[i]>=1 && kolom5[i]<=4){
               jml1_4++;
           }else if(kolom5[i]>=5 && kolom5[i]<=14){
                jml5_14++;
           }else if(kolom5[i]>=15 && kolom5[i]<=64){
               jml15_64++;
           }else if(kolom5[i]>=65){
               jmlLbh65++;
           }
        }

   //     System.out.printf("%s  %s  %s  %s  %s", jmlKrg1,jml1_4,jml5_14,jml15_64,jmlLbh65);
        if(jmlKrg1!=panelKuesioner.getHalaman1().getListHalaman1().get(10).getInt())   {
            pesan("Maaf jumlah ART kurang dari 1 tahun jumlahnya tidak sama \n perbaiki lagi");
            showPanel(panelKuesioner.getHalaman1(), "Halaman1");
            panelKuesioner.getHalaman1().getListHalaman1().get(10).requestFocusInWindow();
            cek=false;
        }else if(jml1_4!=panelKuesioner.getHalaman1().getListHalaman1().get(11).getInt()){
            pesan("Maaf jumlah ART 1 - 4 tahun jumlahnya tidak sama \n perbaiki lagi");
           showPanel(panelKuesioner.getHalaman1(), "Halaman1");
             panelKuesioner.getHalaman1().getListHalaman1().get(11).requestFocusInWindow();
             cek=false;
        }else if(jml5_14!=panelKuesioner.getHalaman1().getListHalaman1().get(12).getInt()){
            pesan("Maaf jumlah ART dari 5 - 14 tahun jumlahnya tidak sama \n perbaiki lagi");
            showPanel(panelKuesioner.getHalaman1(), "Halaman1");
          panelKuesioner.getHalaman1().getListHalaman1().get(12).requestFocusInWindow();
          cek=false;
        }else if(jml15_64!=panelKuesioner.getHalaman1().getListHalaman1().get(13).getInt()){
            pesan("Maaf jumlah ART dari 15 - 64 tahun jumlahnya tidak sama \n perbaiki lagi");
            showPanel(panelKuesioner.getHalaman1(), "Halaman1");
         panelKuesioner.getHalaman1().getListHalaman1().get(13).requestFocusInWindow();
         cek=false;
        }else if(jmlLbh65!=panelKuesioner.getHalaman1().getListHalaman1().get(14).getInt()){
             pesan("Maaf jumlah ART dari 14 - 64 tahun jumlahnya tidak sama \n perbaiki lagi");
            showPanel(panelKuesioner.getHalaman1(), "Halaman1");
          panelKuesioner.getHalaman1().getListHalaman1().get(14).requestFocusInWindow();
          cek=false;
        }
        return cek;
    }
    /**
     * Cek nilai dari tanggal apakah sudah sesuai dengan tanggal pencacahan
     * @param nilai
     * @return true jika tanggal yang dimasukan salah
     */
    protected boolean cekTanggal(String nilai){
            StringTokenizer cek=new StringTokenizer(nilai,"/");
            String [] str=new String[3];
            Integer [] value=new Integer[3];
            int i=0;
            while(cek.hasMoreElements()){
                str[i]=new String();
                str[i]=cek.nextToken();
                i++;
            }
            for(int j=0;j<3;j++){
                value[j]=new Integer(str[j]);
            }
            if(value[0]<=0 || value[0]>31 || value[1]>12 || value[2]!=2010)
               return true;
            else
                return false;
    }
    /**
     * Fungsi yang digunakan untuk mendapatkan Nilai Date
     * dari sebuah string yang berformat "DD/MM/YYYY"
     * @param t
     * @return <code>Date</code> yang telah diconvert
     */
    protected Date getDatePeriksaCacah(TextField t){
        StringTokenizer cek=new StringTokenizer(t.getText(),"/");
        String [] str=new String[3];
        Integer value[]=new Integer[3];
        int i=0;
        while(cek.hasMoreElements()){
            str[i]=new String();
            str[i]=cek.nextToken();
            i++;
        }
        for(int j=0;j<3;j++){
            value[j]=new Integer(str[j]);
        }
        Date date=new Date(value[0],value[1],value[2]);
        return date;

    }
    /**
     * Fungsi yang digunakan untuk mengecek tanggal sesudah pencacahan harus < tanggal pemeriksaan
     * @return <code>true</code> jika yang tanggal yang dimasukan benar
     */
    protected boolean compareDate(){
        Date a=getDatePeriksaCacah(listHalaman1.get(17));
        Date b=getDatePeriksaCacah(listHalaman1.get(20));
        System.out.println(a);
        System.out.println(b);
        if(a.after(b)){
            listHalaman1.get(20).requestFocusInWindow();
            return false;
        }
        return true;
    }
    /**
     * Digunakan untuk mendisable blok4 yang tidak digunakan
     */
        protected void disableTextField(){
          for(int i=0;i<panelKuesioner.getHalaman1().getTxtB2R1().getInt();i++){
                for(int j=0;j<panelKuesioner.getHalaman2().getListHalaman2().get(i).size();j++){
                        panelKuesioner.getHalaman2().getListHalaman2().get(i).get(j).setEnabled(true);
                }
           }
          jumlahART=panelKuesioner.getHalaman1().getTxtB2R1().getInt();
            for(int i=jumlahART;i<panelKuesioner.getHalaman2().getListHalaman2().size();i++){
                for(int j=0;j<panelKuesioner.getHalaman2().getListHalaman2().get(i).size();j++){
                    panelKuesioner.getHalaman2().getListHalaman2().get(i).get(j).setEnabled(false);
                }
            }
        
}
/**
     * Validasi BLok 2 masih banyak perulangan coba dikasih break
     * @param e
     */
    protected void validasiBlok2(KeyEvent e){
        boolean benar=true;
          jumlahART=panelKuesioner.getHalaman1().getTxtB2R1().getInt();
       
       
        //memberikann skip otomatis ke setiap textfield
            for(int i=0;i<jumlahART;i++){
                for(int j=0;j<listHalaman2.get(i).size();j++){
                    //jika sudah kolom terakhir pada baris tertentu skip ke baris berikutnya
                    if(j==listHalaman2.get(i).size()-1){
                        if(i!=jumlahART-1){
                            cekNilai(e, listHalaman2.get(i).get(j), listHalaman2.get(i+1).get(0));
                        }
                    //skip ke selanjutnya kecuali baris terakhir kolom terakhir
                    } else if(!(i==jumlahART-1 && j==listHalaman2.get(i).size()-1)){
                        cekNilai(e, listHalaman2.get(i).get(j), listHalaman2.get(i).get(j+1));
                    }

                }


            }

        for(int i=0;i<jumlahART;i++){
              //cek penekanan enter untuk pemasukan nama
               if(e.getComponent().equals(listHalaman2.get(i).get(0))){
                   if(e.getKeyCode()==KeyEvent.VK_ENTER && !listHalaman2.get(i).get(0).getText().equals(""))
                       listHalaman2.get(i).get(1).requestFocusInWindow();
               }
                //cek jika kode partisipasi sekolah =1 maka pindah ke baris berikutnya
                if(e.getComponent().equals(listHalaman2.get(i).get(4)))
                    try{
                    if(listHalaman2.get(i).get(4).getInt()==1 && i!=jumlahART-1){
                        listHalaman2.get(i).get(5).setText("");listHalaman2.get(i).get(5).setContain(false);listHalaman2.get(i).get(5).setEnabled(false);
                        listHalaman2.get(i).get(6).setText("");listHalaman2.get(i).get(6).setContain(false);listHalaman2.get(i).get(6).setEnabled(false);
                        listHalaman2.get(i).get(7).setText("");listHalaman2.get(i).get(7).setContain(false);listHalaman2.get(i).get(7).setEnabled(false);
                        listHalaman2.get(i+1).get(0).requestFocusInWindow();
                    }
                    if(listHalaman2.get(i).get(4).getInt()==2 && !listHalaman2.get(i).get(5).isEnabled()){
                        listHalaman2.get(i).get(5).setText("");listHalaman2.get(i).get(5).setContain(false);listHalaman2.get(i).get(5).setEnabled(true);
                        listHalaman2.get(i).get(6).setText("");listHalaman2.get(i).get(6).setContain(false);listHalaman2.get(i).get(6).setEnabled(true);
                        listHalaman2.get(i).get(7).setText("");listHalaman2.get(i).get(7).setContain(false);listHalaman2.get(i).get(7).setEnabled(true);
     
                    }
                    if(listHalaman2.get(i).get(4).getInt()==1 && i==jumlahART-1){
                        pindahHalaman3();
                    }
                    } catch(Exception ex){
                      //  ex.printStackTrace();
                    }
               
               //Kolom3 digunakan untuk menyimpan variabel hubungan ART
                 if(e.getComponent().equals(listHalaman2.get(i).get(1))){
                        if(listHalaman2.get(i).get(1).getInt()!=null)
                           kolom3[i]=listHalaman2.get(i).get(1).getInt();
                          
                 }
               //kolom7 digunakan untuk menyimpan variabel pendidikan yang pernah dijalankan
                if(e.getComponent().equals(listHalaman2.get(i).get(5))){
                        if(listHalaman2.get(i).get(5).getInt()!=null)
                           kolom7[i]=listHalaman2.get(i).get(5).getInt();

                 }
               //kolom8 digunakan untuk menyimpan variabel tingkat kelas tertinggi yang pernah diduduki
                if(e.getComponent().equals(listHalaman2.get(i).get(6))){
                        if(listHalaman2.get(i).get(6).getInt()!=null)
                           kolom8[i]=listHalaman2.get(i).get(6).getInt();

                 }
               ////kolom9 digunakan untuk menyimpan pendidikan tertinggi yang pernah ditamatkan
                if(e.getComponent().equals(listHalaman2.get(i).get(7))){
                        if(listHalaman2.get(i).get(7).getInt()!=null)
                           kolom9[i]=listHalaman2.get(i).get(7).getInt();

                 }
               //kolom3 digunakan untuk menyimpan umur
                if(e.getComponent().equals(listHalaman2.get(i).get(3)))
                    if(listHalaman2.get(i).get(3).getInt()!=null)
                        kolom5[i]=listHalaman2.get(i).get(3).getInt();
         
               //perulangan yang ini berfungsi untuk mengecek Hubungan Kode ART
               if(e.getComponent().equals(listHalaman2.get(i).get(1))){
                   if(kolom3!=null && kolom3.length>1 && !(e.getKeyCode()==KeyEvent.VK_ENTER))
                       for(int k=0;k<i;k++){
                           if( kolom3[i]==1){
                              pesan("KRT Harus berada pada urutan pertama!");
                              listHalaman2.get(i).get(1).requestFocusInWindow();
                              break;
                           }
                           if(kolom3[k]>kolom3[k+1] && !(e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==KeyEvent.VK_DOWN)){
                               pesan("Maaf Kode Hubungan ART Harus Urut!");
                               listHalaman2.get(i).get(1).requestFocusInWindow();
                               break;
                           }
                       }
               }
               //cek penekanan enter jika umur dimasukan kurang dari 10 tahun
                if(e.getComponent().equals(listHalaman2.get(i).get(3)))
                    if(i==0){
                         //Cek KRT Harus berumur lebih dari 12 tahun
                         if(listHalaman2.get(0).get(3).getInt()!=null)
                           if(listHalaman2.get(0).get(3).getInt()<12 && !(e.getKeyCode()==KeyEvent.VK_ENTER) && listHalaman2.get(0).get(3).getLength()==listHalaman2.get(0).get(3).getText().length()){
                               pesan("Umur KRT Harus Lebih besar dari 12 Tahun!");
                               listHalaman2.get(0).get(3).requestFocusInWindow();
                               break;
                           }
                    }else{
                         if(listHalaman2.get(i).get(3).getInt()!=null){
                             if(e.getKeyCode()==KeyEvent.VK_ENTER)
                                 //cek jika umur kurang dari 5 tahun tidak ditanyakan partisipasi sekolah
                                   if(listHalaman2.get(i).get(3).getInt()<5){
                                       if(i!=jumlahART-1){
                                               for(int p=4;p<=7;p++){
                                                    listHalaman2.get(i).get(p).setEnabled(false);
                                                    listHalaman2.get(i).get(p).setText("");
                                               }
                                                listHalaman2.get(i+1).get(0).requestFocusInWindow();
                                                break;
                                       }else {
                                           pindahHalaman3();
                                           
                                       }

                                   }else if(listHalaman2.get(i).get(3).getInt()>=5 && listHalaman2.get(i).get(3).getInt()<=9 )
                                        listHalaman2.get(i).get(4).requestFocusInWindow();
                                   else if(listHalaman2.get(i).get(3).getInt()<5 && i!=jumlahART-1)
                                       pindahHalaman3();
                         }
                    }

        
                //   digunakan untuk mengecek konsistensi dari data yang masuk mengenai hubungan sekolah
               if(e.getComponent().equals(listHalaman2.get(i).get(6))){
                
                   switch(kolom7[i]){
                       case 1:
                           if(kolom8[i]==7 && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                               pesan("Tingkatan SD tidak boleh melebihi 6!");
                               listHalaman2.get(i).get(6).requestFocusInWindow();
                           }
                           break;
                       case 2:
                           if(kolom8[i]>3 && kolom8[i]<8 && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                               pesan("Tingkatan SMP tidak boleh melebihi 3!");
                               listHalaman2.get(i).get(6).requestFocusInWindow();
                           }
                           break;
                       case 3:
                           if(kolom8[i]>3 && kolom8[i]<8 && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                               pesan("Tingkatan SMA tidak boleh melebihi 3!");
                               listHalaman2.get(i).get(6).requestFocusInWindow();
                           }
                           break;
                       case 4:
                           if(!(kolom8[i]==7 || kolom8[i]==8 )&& !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                               pesan("Perguruan tinggi harus berkode 7 atau 8!");
                               listHalaman2.get(i).get(6).requestFocusInWindow();
                           }
                           break;
                       default:
                   }
               }

               //Untuk mengecek jenis kelamin dari suami dan istri harus beda
               try{
               if(e.getComponent().equals(listHalaman2.get(i).get(2)) && i!=0 &&!(e.getKeyCode()==KeyEvent.VK_ENTER)){
                   if(listHalaman2.get(i).get(2).getInt().equals(listHalaman2.get(0).get(2).getInt()) && listHalaman2.get(i).get(1).getText().equals("2")){
                       pesan("Jenis Kelamin Suami istri harus berbeda!");
                       listHalaman2.get(i).get(2).requestFocusInWindow();
                   }

               }
               } catch(Exception ex){

               }
            

               //   digunakan untuk mengecek konsistensi dari data yang masuk mengenai hubungan sekolah
               if(e.getComponent().equals(listHalaman2.get(i).get(7))){
                   switch(kolom7[i]){
                       case 1:
                           if(kolom9[i]>2 && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                               pesan("Pendidikan yang pernah / sedang dijalankan \n adalah SD maka kode harus 1 atau 2!");
                               listHalaman2.get(i).get(7).requestFocusInWindow();
                               benar=false;
                           }
                           break;
                       case 2:
                           if(kolom9[i]!=2 &&kolom9[i]!=3  && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                           pesan("Pendidikan yang pernah / sedang dijalankan \n adalah SMP maka kode harus 2 - 3!");
                            listHalaman2.get(i).get(7).requestFocusInWindow();
                            benar=false;
                           }
                           break;
                       case 3:
                           if(kolom9[i]!=3 && kolom9[i]!=4 && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                             pesan("Pendidikan yang pernah / sedang dijalankan \n adalah SMA maka kode harus 3 - 4!");
                            listHalaman2.get(i).get(7).requestFocusInWindow();
                            benar=false;
                           }
                           break;
                       case 4:
                            if(kolom9[i]<4 && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                             pesan("Pendidikan yang pernah / sedang dijalankan \n adalah Perguruan tinggi maka kode harus 4 - 8!");
                            listHalaman2.get(i).get(7).requestFocusInWindow();
                            benar=false;
                            }
                           break;
                       default:
                   }
                    //skip ke panel selanjutnya jika sudah sampai pada baris terakhir
                   if(e.getComponent().equals(listHalaman2.get(jumlahART-1).get(7)) && benar==true && !(e.getKeyCode()==KeyEvent.VK_ENTER)){
                       if(listHalaman2.get(jumlahART-1).get(7).getInt()!=null)
                          pindahHalaman3();
                   }
               }
                 //cek konsistensi antara blok2 dengan blok 4 untuk jumlah masing masing ART
               if(e.getComponent().equals(listHalaman2.get(jumlahART-1).get(4))){
                    if(!cekUmur())
                        break;

               }
               //cek umur jika yang yang dimasukan kurang dari 10 tahun dan posisi akhir maka pindah
               try{
               if(i==jumlahART-1 && e.getComponent().equals(listHalaman2.get(i).get(3)) && listHalaman2.get(i).get(3).getText().substring(0, 1).equals("0"))
                   if(listHalaman2.get(i).get(3).getInt()<5 && cekUmur()){
                       pindahHalaman3();
                       for(int j=4;j<=7;j++){
                           listHalaman2.get(i).get(j).setText("");
                           listHalaman2.get(i).get(j).setEnabled(false);
                       }
                   }
               }catch(Exception ex){}
               //enablekan lagi textfield jika seebelumnya telah didisable
             if(e.getComponent().equals(listHalaman2.get(i).get(3))){
                   if(!listHalaman2.get(i).get(4).isEnabled()){
                       for(int p=4;p<=7;p++){
                        listHalaman2.get(i).get(p).setEnabled(true);
                        listHalaman2.get(i).get(p).setText("");
                       }
                   }

               }
        }
      

    }
    public void pindahHalaman3(){
        showPanel(panelKuesioner.getHalaman3_1(), "Halaman3_1");
        Controller.setStatus(2);
        Controller.setStatusHal3(0);
        panelKuesioner.getHalaman3_1().getListBlok5().get(0).setText(listHalaman2.get(0).get(0).getText());
        panelKuesioner.getHalaman3_1().getListBlok5().get(1).setText(listHalaman2.get(0).get(3).getText());
        panelKuesioner.getHalaman3_1().getListBlok5().get(2).setText("01");
        panelKuesioner.getHalaman3_1().getListBlok5().get(3).requestFocusInWindow();

    }
    /**
     * Method ini digunakan untuk perpindahan  tombol atas dan bawah dari satu texfield ke textfield yang lain
     * @param e
     * @param list
     */
    public void cekUpDown(KeyEvent e,List<TextField> list){
        for(int i=0;i<list.size();i++){
            if(e.getComponent().equals(list.get(i)) ){
                if(e.getKeyCode()==KeyEvent.VK_DOWN && i!=list.size()-1 && !list.get(i).getText().equals("")){
                    list.get(i+1).requestFocusInWindow();
                }else if(e.getKeyCode()==KeyEvent.VK_UP && i!=0){
                    list.get(i-1).requestFocusInWindow();
                }
                break;
            }
        }
    }
    /**
     * Cek penekanan tombol up dan down untuk pindah
     * @param e
     * @param list
     */
    public void cekUpDownLoop(KeyEvent e,List<List<TextField>> list){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                    if(e.getComponent().equals(list.get(i).get(j))){
                        //Jika ditekan Tombol UP
                        if(e.getKeyCode()==KeyEvent.VK_UP){
                            //jika kursor pada kolom pertama dan tidak pada baris pertama
                            if(j==0 && i!=0){
                                int l=list.get(i).size()-1;
                                while(!list.get(i-1).get(l).isEnabled())
                                    l--;
                                list.get(i-1).get(l).requestFocusInWindow();
                            //Jika kursor pada baris pertama kolom pertama
                            }else if(i==0 && j==0){
                                showPanel(panelKuesioner.getHalaman1(), "Halaman1");
                                panelKuesioner.getHalaman1().getListHalaman1().get(20).requestFocusInWindow();
                            }else
                                //lanjut ke textfield selanjutnya
                                list.get(i).get(j-1).requestFocusInWindow();
                        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
                            //Jika kursor pada baris terkhir kolom terakhir
                            if(i==list.size()-1 && j==list.get(i).size()-1)
                                list.get(list.size()-1).get(list.get(i).size()-1);
                            //Jika kursor terletak pada kolom terakhir baris tertentu lanjut baris berikutnya
                            else if(j==list.get(i).size()-1)
                                list.get(i+1).get(0).requestFocusInWindow();
                            //Jika tidak maka langsung lanjut ke textfield selanjutnya
                            else{
                                int k=j+1;
                                try{
                                while(!listHalaman2.get(i).get(k).isEnabled())
                                    k++;
                                 list.get(i).get(k).requestFocusInWindow();
                                }catch(Exception ex){

                                }
           
                                
                            }
                        }

                     }

                }
        }
    }
   
    /**
     * Menampilkan pesan kesalahan
     * @param p : pesan kesalahan
     */
    protected void pesan(String p){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, p);
    }

    /**
     * Menampilkan panel pada cardLayout
     * @param panel
     * @param nama
     * @param induk
     */
     protected  void showPanel(Component panel, String nama){
        if (panel.isVisible()){
            return;
        }
        ((CardLayout)panelKuesioner.getPanelInduk().getLayout()).show(panelKuesioner.getPanelInduk(), nama);
    }
}
