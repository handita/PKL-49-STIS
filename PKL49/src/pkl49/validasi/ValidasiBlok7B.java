/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.view.PanelKuesioner;

/**
 * Validasi Blok 7B: Pengeluaran Bukan Makanan.
 * @author Ken
 */
public class ValidasiBlok7B extends AbstractValidasi{

    public ValidasiBlok7B(PanelKuesioner kues, List<TextField> l) {
        super(kues);
        setList(l);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        validasi(e);
    }


    private void validasi(KeyEvent e){
        try{
            for(int i=0;i<list.size();i++){
                 if(checkKey(e, list.get(i))==ENTER){
                    if(checkEmpty(0, i)) return;
                    if(!list.get(i).getText().equals(""))
                        cekValid(i);
                     break;
                }else if(checkKey(e, list.get(i))==UP){
                    moveUp(i);break;
                }else if(checkKey(e, list.get(i))==DOWN){
                    if(checkEmpty(0, i))return;
                    if(!list.get(i).getText().equals(""))
                        cekValid(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
        }

    }

    private void cekValid(int i){
        setFormat(list.get(i));
        switch(i){
            case 0://sewa rumah per bulan
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<25000){
                    message("Yakin pengeluaran sewa rumah/perkiraan sewa rumah per bulan kurang dari Rp25.000,00!");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 1://sewa rumah per tahun
                if(getNilai(list.get(i-1))==0 && getNilai(list.get(i))==0 ){
                    message("Pengeluaran sewa rumah/perkiraan sewa rumah tidak boleh Rp0,00!");
                }else if(getNilai(list.get(i))<getNilai(list.get(i-1))){
                    message("Pengeluaran 12 bulan terakhir tidak mungkin kurang dari pengeluaran 1 bulan terakhir!");
                }else if(getNilai(list.get(i))< 50000){
                    message("Pengeluaran sewa rumah/perkiraan sewa rumah per tahun tidak mungkin  kurang dari  per bulan!");
                }else if(getNilai(list.get(i))<300000 ){
                    message("Yakin pengeluaran sewa rumah/perkiraan sewa rumah per tahun kurang dari Rp300.000,00!");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 4:
                if(getNilai(list.get(i))==0){
                    message("Yakin pengeluaran rekening listrik,air,gas,dll Rp0,00 sebulan??Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 5:
                if(getNilai(list.get(i))==0){
                    message("Apa benar pengeluaran rekening listrik,air,gas,dll Rp0,00 setahun??Periksa kembali...");
                }else if(getNilai(list.get(i))<getNilai(list.get(i-1))){
                    message("Pengeluaran 12 bulan terakhir tidak mungkin kurang dari pengeluaran 1 bulan terakhir!");
                }else{
                    next(list.get(i+1));
                }
                break;
            case 8:
                if(getNilai(list.get(i))==0){
                    message("Apa benar pengeluaran sabun mandi/cuci, kosmetik,dll Rp0,00 sebulan??Periksa kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))<100 && getNilai(list.get(i))>0){
                    message("Pengeluarannya tidak mungkin Rp"+list.get(i).getText()+",00");
                }else{
                    next(list.get(i+1));
                }
                break;
            case 9:
                if(getNilai(list.get(i))==0){
                    message("Apa benar pengeluaran sabun mandi/cuci, kosmetik,dll Rp0,00 setahun??Periksa kembali...");
                }else if(getNilai(list.get(i))<getNilai(list.get(i-1))){
                    message("Pengeluaran 12 bulan terakhir tidak mungkin kurang dari pengeluaran 1 bulan terakhir!");
                }else if(getNilai(list.get(i))<100 && getNilai(list.get(i))>0){
                    message("Pengeluaran 12 bulan terakhir tidak mungkin Rp"+list.get(i).getText()+",00");
                }else if(getNilai(list.get(i))<10000){
                    message("Apa benar pengeluaran sabun mandi/cuci, kosmetik,dll Rp10000,00 setahun??Periksa kembali...");
                }else if(getNilai(list.get(i))<120000){
                    message("Apa benar pengeluaran sabun mandi/cuci, kosmetik,dll kurang dari Rp120.000,00 setahun??Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 10://kesehatan sebulan
                int adaBerobat = 0;
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5A().get(16).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5A().get(16).getInt()==1){
                            adaBerobat++;
                        }
                    }
                }
                if(adaBerobat>0 && getNilai(list.get(i))==0){
                    message("Apa benar pengeluaran kesehatan Rp0,00?\nSebulan ini ada ART yang berobat jalan. Periksa kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluarannya Rp"+list.get(i).getText()+",00?");
                }else{
                    next(list.get(i+1));
                }
                break;
            case 11://kesehatan setahun
                int adaRawatInap = 0;
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5A().get(25).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5A().get(25).getInt()==1){
                            adaRawatInap++;
                        }
                    }
                }
                if(adaRawatInap>0 && getNilai(list.get(i))==0){
                    message("Apa benar pengeluaran kesehatan setahun Rp0,00?\nSetahun ini ada ART yang rawat inap. Periksa kembali...");
                }else if(getNilai(list.get(i))<getNilai(list.get(i-1))){
                    message("Pengeluaran 12 bulan terakhir tidak mungkin kurang dari pengeluaran 1 bulan terakhir!");
                }else if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluarannya Rp"+list.get(i).getText()+",00?");
                }else{
                    next(list.get(i+1));
                }
                break;
            case 32:
                //@B7AR22_2: Jumlah bukan makanan per bulan
                int jumlahBulan = 0;
                for(int j=0;j<32;j++){
                    if(j%2==0)
                        jumlahBulan+=getNilai(list.get(j));
                }
                if(jumlahBulan!=getNilai(list.get(i))){
                    message("Jumlah pengeluaran bukan makanan per bulan salah. Jumlah = Rp"+jumlahBulan+",-.\nPeriksa kembali...");
                    next(list.get(0));
                }else if(jumlahBulan==0){
                    message("Jumlah pengeluaran bukan makanan per bulan tidak mungkin Rp"+jumlahBulan+",-.\nPeriksa kembali...");
                    next(list.get(0));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 33:
                //@B7AR22_3: Jumlah bulan makanan per tahun
                int jumlahTahun = 0;
                for(int j=0;j<32;j++){
                    if(j%2==1)
                        jumlahTahun+=getNilai(list.get(j));
                }
                if(jumlahTahun!=getNilai(list.get(i))){
//                    setFormat(list.get(i));
                    message("Jumlah pengeluaran bukan makanan per tahun salah. Jumlah = Rp"+jumlahTahun+",-.\nPeriksa kembali...");
                    next(list.get(0));
                }else if(jumlahTahun==0){
//                    setFormat(list.get(i));
                    message("Jumlah pengeluaran bukan makanan per tahun tidak mungkin  Rp"+jumlahTahun+",-.\nPeriksa kembali...");
                    next(list.get(0));
                }else{
                    //Hitung Rata-rata
                    double rata23 = getNilai(kuesioner.getHalaman5().getListBlok7A().get(21))*30.0/7.0;
                    double rata24 = jumlahTahun/12.0;
                    long l =(int)Math.round(rata23*100);
                    rata23 = l/100.0;
                    long k =(int)Math.round(rata24*100);
                    rata24 = k/100.0;
                    double rata25 = rata23+rata24;
                    list.get(34).setText(String.valueOf(rata23));
                    list.get(35).setText(String.valueOf(rata24));
                    list.get(36).setText(String.valueOf(rata25));
                    list.get(34).requestFocusInWindow();
                    list.get(35).requestFocusInWindow();
                    list.get(36).requestFocusInWindow();
                    //pindah halaman berikutnya
                    showPanel(kuesioner.getHalaman7(), "Halaman7");
                    Controller.setStatus(6);
                        //disable dulu textFiel yg tidak dipakai sebelum ke hal7
                        int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
                        for(int j=jArt;j<25;j++){
                            kuesioner.getHalaman7().getListBlok8AKol2().get(j).setEnabled(false);
                            for(int m=0;m<8;m++){
                                kuesioner.getHalaman7().getListBlok8AKol5().get(j).get(m).setEnabled(false);
                            }
                            for(int m=0;m<2;m++){
                                kuesioner.getHalaman7().getListBlok8AKol13().get(j).get(m).setEnabled(false);
                            }
                        }
                        //Pindah halaman
                        kuesioner.getHalaman7().getListBlok8AKol2().get(0).requestFocusInWindow();
                }
                break;
            default:
                //@B7BR16-B7BR21
                if(i%2==1 && getNilai(list.get(i))<getNilai(list.get(i-1))){
                    message("Pengeluaran 12 bulan terakhir tidak mungkin kurang dari pengeluaran 1 bulan terakhir!");
                }else if(getNilai(list.get(i))<100 && getNilai(list.get(i))>0){
                    message("Tidak mungkin pengeluarannya diantara Rp0,00 dan Rp100,00!!Cek lagi...");
                }else{
//                    setFormat(list.get(i));
                    next(list.get(i+1));
                }
                break;
        }
    }

    private void setFormat(TextField t){
        try {
            t.commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(ValidasiBlok7A.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("#,##0"))));
    }

    /**
     * Mendapatkan nilai int dari formatted text
     * @param t
     * @return
     */
    private int getNilai(TextField t){
        int a = Integer.parseInt(t.getValue().toString());
        return a;
    }

    @Override
    protected void moveUp(int from) {
        if(from==0){
            showPanel(kuesioner.getHalaman5(), "Halaman5");
            kuesioner.getHalaman5().getListBlok7A().get(21).requestFocusInWindow();
        }else{
            list.get(from-1).requestFocusInWindow();
        }
    }
}
