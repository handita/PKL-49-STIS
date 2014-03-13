/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.view.PanelKuesioner;

/**
 *
 * @author Ken
 */
public class ValidasiBlok8C extends AbstractValidasi{

    public static Set<Integer> noIbu;
    private List<Integer> listIbu;
    private List<Integer> listAnak;
    public static int loop=0;
    public ValidasiBlok8C(PanelKuesioner k, List<TextField> l) {
        super(k);
        setList(l);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        validasiInPress(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        validasiInRelease(e);
    }



    private void validasiInRelease(KeyEvent e){
        try{
            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==DIGIT){
                    cekValid(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
    private void validasiInPress(KeyEvent e){
        try{
            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==ENTER){
                    cekValid(i);
                    break;
                }else if(checkKey(e, list.get(i))==UP){

                    break;
                }else if(checkKey(e, list.get(i))==DOWN){
                    cekValid(i);
                    break;
                }
            }            
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
    private void cekValid(int i){
        if(i==2){//No.urut ART
            //if(loop==0)
                cekBayi();
            
            boolean ada=false;
            for(int j=0;j<loop;j++){
                if(list.get(i).getInt().intValue()==kuesioner.getListHal9().get(j).getListBlok8C().get(2).getInt().intValue()){
                    ada=true;
                    break;
                }
            }
            int jArt =kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            int noUrut = list.get(i).getInt().intValue();
            //Cek no.urut apakah noUrutnya >= 15 th
            if(ada){
                message("No. urut ibu "+list.get(i).getInt()+" sudah dientry!");
            }else if(noUrut>jArt){
                message("No. urut tidak boleh lebih dari banyaknya ART!");
                list.get(i).setText(null);
                list.get(i).requestFocusInWindow();
            }else{
                boolean ad=false;
//                
                for(int j=0;j<listIbu.size();j++){
                    if(noUrut==listIbu.get(j).intValue()){
                        ad=true;
                        break;
                    }else{
                        System.out.println("Gak ada!!!");

                    }
                }
                if(ad){
                    list.get(0).setText(kuesioner.getHalaman2().getListHalaman2().get(noUrut-1).get(0).getText());
                    next(list.get(i+1));
                }else{
                    message("No. Urut responden salah!");
                }
            }
        }else if(i==3){//No.Urut bayi
            int noUrut = list.get(i).getInt().intValue();
            boolean ada = false;
            for(int j=0;j<listAnak.size();j++){
                if(listIbu.get(j).intValue()==list.get(i-1).getInt().intValue()){
                    if(noUrut==listAnak.get(j).intValue()){
                        ada=true;break;
                    }
                }
            }
            if(ada){
                list.get(1).setText(kuesioner.getHalaman2().getListHalaman2().get(noUrut-1).get(0).getText());
                next(list.get(i+1));
            }else{
                message("No. urut bayi salah!!");
            }
        }else if(i==21){//akhir
            loop++;
            if(loop<noIbu.size()){
                showPanel(kuesioner.getListHal9().get(loop), kuesioner.getNamaHal9().get(loop));
                Controller.setStatus(8);
                Controller.setStatusHal9(loop);
                Controller.setJumlahHal9(noIbu.size());
                next(kuesioner.getListHal9().get(loop).getListBlok8C().get(2));//focus ke no urut ibu
            }else{
                //Akhir
                kuesioner.getBtnSimpan().setEnabled(true);
                kuesioner.getBtnSimpan().requestFocusInWindow();
            }
        }else{
            next(list.get(i+1));
        }
    }
    @Override
    protected void moveUp(int from){
        super.moveUp(from);
        if(from==0){
            if(loop==0){
                showPanel(kuesioner.getListHal8().get(ValidasiBlok8B.loop), kuesioner.getNamaHal8().get(ValidasiBlok8B.loop));
                kuesioner.getListHal8().get(ValidasiBlok8B.loop).getListBlok8B().get(17).requestFocusInWindow();
            }else{
                loop--;
                showPanel(kuesioner.getListHal9().get(loop), kuesioner.getNamaHal9().get(loop));
                next(kuesioner.getListHal9().get(loop).getListBlok8C().get(21));
            }
        }
    }
    /**
     * Cek ada bayi ato tidak.
     */
    private void cekBayi(){
        int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt().intValue();
        
        noIbu = new HashSet<Integer>();
        listIbu = new ArrayList<Integer>();
        listAnak = new ArrayList<Integer>();
        for(int j=0;j<jArt;j++){
            //cari umur 0 tahun
            if(kuesioner.getHalaman2().getListHalaman2().get(j).get(3).getInt()==0){
                if(kuesioner.getListHal3().get(j).getListBlok5().get(3).getInt()!=0){
                    
                    noIbu.add(kuesioner.getListHal3().get(j).getListBlok5().get(3).getInt());
                    listAnak.add(j+1);
                    listIbu.add(kuesioner.getListHal3().get(j).getListBlok5().get(3).getInt());
//                    System.out.println("No. Bayi Sebelum jumlah: "+listAnak.get(j));
//                    System.out.println("No. Ibu sebelum jumlah: "+listIbu.get(j));
                }else if(kuesioner.getListHal3().get(j).getListBlok5().get(3).getInt()==0 &&
                    kuesioner.getListHal3().get(j).getListBlok5().get(4).getInt()!=0){
                    
                    noIbu.add(kuesioner.getListHal3().get(j).getListBlok5().get(4).getInt());
                    listAnak.add(j+1);
                    listIbu.add(kuesioner.getListHal3().get(j).getListBlok5().get(4).getInt());

                }else if(kuesioner.getListHal3().get(j).getListBlok5().get(3).getInt()==0 &&
                        kuesioner.getListHal3().get(j).getListBlok5().get(4).getInt()==0 &&
                        kuesioner.getListHal3().get(j).getListBlok5().get(6).getInt()!=0){
                     
                    noIbu.add(kuesioner.getListHal3().get(j).getListBlok5().get(6).getInt());
                    listAnak.add(j+1);
                    listIbu.add(kuesioner.getListHal3().get(j).getListBlok5().get(6).getInt());
                    
                }
            }
        }
    }
}