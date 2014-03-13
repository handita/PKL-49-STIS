/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.event.KeyEvent;
import java.util.List;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.view.PanelKuesioner;

/**
 *
 * @author Ken
 */
public class ValidasiBlok8B extends AbstractValidasi{

    private static int jArt15;
    public static int loop = 0;
    public ValidasiBlok8B(PanelKuesioner kues, List<TextField> l) {
        super(kues);
        setList(l);
    }

    public static int getjArt15() {
        return jArt15;
    }

    public static void setjArt15(int jArt15) {
        ValidasiBlok8B.jArt15 = jArt15;
    }

    
    @Override
    public void keyReleased(KeyEvent e) {
        validasiBlok8B(e);
    }


    private void validasiBlok8B(KeyEvent e){
        try{
            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==DIGIT){
                    cekValidBlok8B(i);
                }else if(checkKey(e, list.get(i))==UP){
                    moveUp(i);break;
                }else if(checkKey(e, list.get(i))==DOWN){
                    if(!list.get(i).getText().equals(""))
                        cekValidBlok8B(i);
                    break;
                }else if(checkKey(e, list.get(i))==ENTER){
                    if(!list.get(i).getText().equals(""))
                        cekValidBlok8B(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }

    }

    private void cekValidBlok8B(int i){
        switch(i){
            case 1:
                boolean ada = false;
                int no=-1;
                //cek apakah art ini udah dientry pa belum
                for(int j=0;j<loop;j++){
                    if(kuesioner.getListHal8().get(j).getListBlok8B().get(i).getInt().intValue()==list.get(i).getInt().intValue()){
                        ada = true;
                        no = kuesioner.getListHal8().get(j).getListBlok8B().get(i).getInt();
                        break;
                    }
                }
                int jArt =kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
                //Cek no.urut apakah noUrutnya >= 15 th
                int noUrut = list.get(i).getInt();
                if(noUrut>jArt){
                    message("No. urut tidak boleh lebih dari banyaknya ART!");
                    list.get(i).setText(null);
                    list.get(i).requestFocusInWindow();
                }else if(kuesioner.getHalaman2().getListHalaman2().get(noUrut-1).get(3).getInt()<15){
                    message("Umur pemberi informasi kurang dari 15 tahun!");
                    list.get(i).setText(null);
                    list.get(i).requestFocusInWindow();
                }else if(ada){
                    message("Responden dengan no. urut "+no+" sudah dientri!");
                    list.get(i).setText(null);
                    list.get(i).requestFocusInWindow();
                    ada=false;
                }else{
                    list.get(0).setText(kuesioner.getHalaman2().getListHalaman2().get(noUrut-1).get(0).getText());
                    next(list.get(2));
                }
                break;
            case 17:
                loop++;
                int umur15 = jArt15;
                
                if(umur15>=4)
                    umur15=4;
                if(loop<umur15){
                    showPanel(kuesioner.getListHal8().get(loop), kuesioner.getNamaHal8().get(loop));
                    Controller.setStatus(7);
                    Controller.setJumlahHal8(umur15);
                    Controller.setStatusHal8(loop);
                    kuesioner.getListHal8().get(loop).getListBlok8B().get(1).requestFocusInWindow();
                }else{
                    int jml =kuesioner.getHalaman1().getListHalaman1().get(10).getInt().intValue();
                    if(jml>0){
                        showPanel(kuesioner.getListHal9().get(0), kuesioner.getNamaHal9().get(0));
                        Controller.setStatus(8);
                        Controller.setStatusHal9(0);
                        kuesioner.getListHal9().get(0).getListBlok8C().get(2).requestFocusInWindow();
                    }else{
                        //Akhir...........
                        kuesioner.getBtnSimpan().setEnabled(true);
                        kuesioner.getBtnSimpan().requestFocusInWindow();
                    }
                }
                break;
            default:
                next(list.get(i+1));
                break;
        }
    }

    @Override
    protected void moveUp(int from) {
        super.moveUp(from);
        if(from==1){
            if(loop==0){
                showPanel(kuesioner.getHalaman7(), "Halaman7");
                kuesioner.getHalaman7().getListBaris26().get(3).requestFocusInWindow();
            }else{
                loop--;
                showPanel(kuesioner.getListHal8().get(loop), kuesioner.getNamaHal8().get(loop));
                next(kuesioner.getListHal8().get(loop).getListBlok8B().get(17));
            }
        }
    }

    
}

