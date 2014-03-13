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
 *
 * @author Ken
 */
public class ValidasiBlok7A extends AbstractValidasi{

    public ValidasiBlok7A(PanelKuesioner kues, List<TextField> l) {
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
                     if(checkEmpty(0, i))return;
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
            case 0:
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran bernilai lebih dari Rp0,00 dan kurang dari Rp100,00?Periksa kembali...");
                }else if(getNilai(list.get(i))<5000){
                    message("Yakin pengeluaran beras kurang dari Rp5.000,- per minggu? Periksa kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>1000000){
                    message("Yakin pengeluaran beras lebih dari Rp  1 juta per minggu? Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }break;
            case 6:
                int adaHewani = 0;
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5C().get(4).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5C().get(4).getInt()==2)
                            adaHewani++;
                    }
                }
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluarannya kurang dari Rp100,00?Periksa kembali...");
                }else if(adaHewani>2 && (getNilai(list.get(i)) + getNilai(list.get(5)) + getNilai(list.get(4)) + getNilai(list.get(3)))<7000){
                    message("Ada "+ adaHewani+" ART yang makan protein hewani lebih dari 14 kali.\nApa benar pengeluarannya kurang dari Rp7.000,00? Periksa kembali...");
                    next(list.get(i+1));
                }else if((getNilai(list.get(i)) + getNilai(list.get(5)) + getNilai(list.get(4)) + getNilai(list.get(3)))>500000){
                    message("Apa benar pengeluarannya lebih dari dari Rp500.000,00? Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 8:
                int adaSayur = 0;
                //Perika apakah ada yang merokok dalam ruta
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5C().get(1).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5C().get(1).getInt()==2)
                            adaSayur++;
                    }
                }
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran sayur kurang dari Rp100,00?Periksa kembali...");
                }else if(adaSayur>1 && getNilai(list.get(i))<5000){
                    message("Ada "+adaSayur +" ART yang makan sayur lebih dari 14 kali.\nApa benar pengeluarannya kurang dari Rp5.000,00?Periksa kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>200000){
                    message("Apa benar pengeluaran sayur lebih dari Rp200.000,00?Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 9:
                int adaNabati = 0;
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5C().get(3).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5C().get(3).getInt()==2)
                            adaNabati++;
                    }
                }
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran kacang-kacangan kurang dari Rp100,00?Periksa kembali...");
                }else if(adaNabati>2 && getNilai(list.get(i))<2000){
                    message("Ada "+adaNabati+" ART yang makan protein nabati lebih dari 14 kali.\nApa benar pengeluarannya kurang dari Rp2.000,00?Periksa kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>200000){
                    message("Apa benar pengeluarannya lebih dari Rp200.000,00?Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 10:
                int adaBuah = 0;
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5C().get(2).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5C().get(2).getInt()==2)
                            adaBuah++;
                    }
                }
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran buah kurang dari Rp100,00?Periksa kembali...");
                }else if(adaBuah>2 && getNilai(list.get(i))<2000){
                    message("Ada "+adaBuah+" ART yang makan buah lebih dari 14 kali.\nApa benar pengeluarannya kurang dari Rp2.000,00?Periksa kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>500000){
                    message("Apa benar pengeluarannya lebih dari Rp500.000,00?Periksa kembali...");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 16:
                int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
                if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran lebih dari Rp0,00 dan kurang dari Rp100,00?Periksa kembali...");
                }else if((getNilai(list.get(i))+getNilai(list.get(14))+ getNilai(list.get(0)))<7000){
                    message("Pengeluaran beras + mie Instans, mie basah/kering + makanan jadi tidak mungkin Rp7000,00!Periksa kembali...");
                }else if(jArt>1 && getNilai(list.get(i))<70000 && getNilai(list.get(0))==0 && getNilai(list.get(14))==0){
                    message("Yakin pengeluaran makanan jadi kurang dari Rp70.000,00!");
                    next(list.get(i+1));
                }else if(jArt==1 && getNilai(list.get(i))<50000 && getNilai(list.get(0))==0 && getNilai(list.get(14))==0){
                    message("Yakin pengeluaran makanan jadi kurang dari Rp50.000,00!");
                    next(list.get(i+1));
                }else{
                    next(list.get(i+1));
                }
                break;
            case 19:
                int adaPerokok = 0;
                int adaPerokokKadang = 0;
                int jmlRokok = 0;
                //Perika apakah ada yang merokok dalam ruta
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                    if(!kuesioner.getListHal3().get(j).getListBlok5D().get(9).getText().equals("")){
                        if(kuesioner.getListHal3().get(j).getListBlok5D().get(9).getInt()==1){
                            if(kuesioner.getListHal3().get(j).getListBlok5D().get(10).getInt()!=null){
                                if(kuesioner.getListHal3().get(j).getListBlok5D().get(10).getInt()>0){
                                    adaPerokok++;
                                    jmlRokok+=kuesioner.getListHal3().get(j).getListBlok5D().get(10).getInt();
                                }
                            }
                        }else if(kuesioner.getListHal3().get(j).getListBlok5D().get(9).getInt()==2){
                            adaPerokokKadang++;
                        }
                    }
                }
                if((adaPerokok>0 || adaPerokokKadang>0) && getNilai(list.get(19))<=0){
                    message("Ada ART yang merokok. Tidak mungkin pengeluaran untuk rokok Rp0,00");
                }else if(adaPerokok==0 && adaPerokokKadang==0 && getNilai(list.get(i))>0){
                    message("Tidak ada ART yang merokok. Tidak mungkin pengeluaran untuk rokok lebih dari Rp0,00");
                }else if(adaPerokok>0  && getNilai(list.get(i))/(jmlRokok*7)<150){
                    message("Apa benar harga satu batang rokok Rp"+getNilai(list.get(i))/(jmlRokok*7)+",00?\nRT ini menghabiskan rokok "+jmlRokok+" batang per hari.");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran rokok lebih dari Rp0,00 dan kurang dari Rp100,00?Periksa kembali...");
                }else{
                    next(list.get(i+1));
                }
                break;
            case 21:
                int jumlah = 0;
                for(int j=0;j<21;j++){
                    jumlah+=getNilai(list.get(j));
                }
                System.out.println(jumlah);
                if(jumlah!=getNilai(list.get(i))){
                    message("Jumlah pengeluaran makanan salah. Jumlah = Rp"+jumlah+",-.Periksa kembali...");
                    next(list.get(0));
                }else if(getNilai(list.get(i))==0){
                    message("Jumlah pengeluaran makanan tidak mungkin Rp0,00. Periksa kembali...");
                    next(list.get(0));
                }else if(getNilai(list.get(i))>0 && getNilai(list.get(i))<99){
                    message("Tidak mungkin pengeluaran bernilai lebih dari Rp0,00 dan kurang dari Rp100,00?Periksa kembali...");
                }else{
                    //Pindah ke halaman berikutnya(Blok 7B).
                    showPanel(kuesioner.getHalaman6(), "Halaman6");
                    Controller.setStatus(5);
                    next(kuesioner.getHalaman6().getListBlok7B().get(0));
                }
                break;
            default:
                if(getNilai(list.get(i))>1000000){
                    message("Yakin pengeluarannya lebih dari Rp  1 juta per minggu? Silakan cek kembali...");
                    next(list.get(i+1));
                }else if(getNilai(list.get(i))>0 && getNilai(list.get(i))<100){
                    message("Tidak mungkin pengeluaran bernilai lebih dari Rp0,00 dan kurang dari Rp100,00?Periksa kembali...");
                }else{
                    next(list.get(i+1));
                }
                break;
        }
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

    /**
     * Memberi format ribuan pada textField
     * @param t
     */
    private void setFormat(TextField t){
        try {
            t.commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(ValidasiBlok7A.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("#,##0"))));
    }

    @Override
    protected void moveUp(int from) {
        if(from==0){
            showPanel(kuesioner.getHalaman4(), "Halaman4");
            int i=22;
            boolean move=true;
            while(move && i>=0){
                if(kuesioner.getHalaman4().getListBlok6().get(i).isEnabled()){
                    kuesioner.getHalaman4().getListBlok6().get(i).requestFocusInWindow();
                    move = false;
                }else
                    i--;
            }
        }else{
            list.get(from-1).requestFocusInWindow();
        }

    }


}