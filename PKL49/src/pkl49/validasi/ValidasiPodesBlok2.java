/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import pkl49.component.Formatter;
import pkl49.component.TextField;
import pkl49.util.PencacahIdentity;
import pkl49.view.PanelKuesionerPodes;

/**
 *
 * @author Mahasiswa
 */
public class ValidasiPodesBlok2 extends AbstractValidasi{

    PanelKuesionerPodes podes;
    public ValidasiPodesBlok2(PanelKuesionerPodes podes,List<TextField> l) {
        this.podes =podes;
        setList(l);
        //setFormat tanggal dna nim
        Formatter tanggal=new Formatter("##/##/2010");
        Formatter nim=new Formatter("0#.####");
        list.get(1).setFormatterFactory(nim);
        list.get(2).setFormatterFactory(tanggal);
        list.get(4).setFormatterFactory(nim);
        list.get(5).setFormatterFactory(tanggal);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        validasiOnPress(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        validasiOnRealease(e);
    }



    /**
     * Validasi yang akan diset pada event keyPressed. Penekanan enter, panah atas, dan panah bawah.
     * @param e
     */
    private void validasiOnPress(KeyEvent e){
        try{

            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==ENTER){
                    if(i!=1 && i!=4)
                    if(checkEmpty(0, i))return;
//                    if(!list.get(i).getText().equals(""))
                        cekValidBlok2(i);
                    break;
                }else if(checkKey(e, list.get(i))==DOWN){
                    if(checkEmpty(0, i))return;
//                    if(!list.get(i).getText().equals(""))
                        cekValidBlok2(i);
                    break;
                }else if(checkKey(e, list.get(i))==UP){
                    moveUp(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
    /**
     * Validasi yang akan diset pada keyRelease
     * @param e
     */
    private void validasiOnRealease(KeyEvent e){
        try{
            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==DIGIT){
                    cekValidBlok2(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Mengecek validasi setiap textfield
     * @param i index textfield
     */
    private void cekValidBlok2(int i){

        if(i==1 || i==4){
            if(!list.get(i).getText().contains(" ")){
                if(cekNIM(list.get(i).getText())){
                    next(list.get(i+1));
                    list.get(i-1).setText(new PencacahIdentity().getPencacahDic().get(list.get(i).getText()));
                }
            }
        }else if(i==2){
            if(!list.get(i).getText().contains(" ")){
                if(cekTanggal(list.get(i).getText())){
                    message("Maaf tanggal Anda salah mohon perbaiki lagi!");
                }else{
                    next(list.get(4));
                }
            }
        }else if(i==5){
            if(!list.get(i).getText().contains(" ")){
                if(cekTanggal(list.get(i).getText())){
                    message("Maaf tanggal Anda salah mohon perbaiki lagi!");
                }else if(compareDate()){
                    next(podes.getListBlok3().get(0));
                }
            }
        }else{
            next(list.get(i+1));
        }
    }

    /**
     * Memindahkan focus ke textfield diatasnya dengan tomboh panah atas
     * @param from
     */
    @Override
    protected void moveUp(int from) {
        super.moveUp(from);
        if(from==0){
            next(podes.getListBlok1().get(6));
        }
    }
    /**
     * Fungsi yang digunakan untuk mengecek tanggal sesudah pencacahan harus < tanggal pemeriksaan
     * @return <code>true</code> jika yang tanggal yang dimasukan benar
     */
    protected boolean compareDate(){
        Date a = getDatePeriksaCacah(list.get(2));
        Date b = getDatePeriksaCacah(list.get(5));
        if(a.after(b)){
            message("Tanggal pemeriksaan harus setelah tanggal pencacahan!");
            return false;
        }
        return true;
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
        Date date=new Date(value[0]+1900,value[1]-1,value[2]);
        return date;

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
     * Cek apabila nim yang diketik salah
     * @param NIM
     * @return <code>true</code> jika yang nim yang dimasukan benar
     */
    public boolean cekNIM(String NIM){
        String prefix=NIM.substring(0, 2);
        if(!(prefix.equals("07") || prefix.equals("06"))){
            message("Maaf NIM anda salah perbaiki lagi!");
            return false;
        }
        return true;
    }
}


