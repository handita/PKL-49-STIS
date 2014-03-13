/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;


import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import pkl49.component.TextField;
import pkl49.control.DataStatic;
import pkl49.view.PanelKuesionerPodes;
import pkl49.util.*;

/**
 *
 * @author Ken
 */
public class ValidasiPodesBlok1 extends AbstractValidasi{

    PanelKuesionerPodes podes;
    public ValidasiPodesBlok1(PanelKuesionerPodes podes,List<TextField> l) {
        this.podes =podes;
        setList(l);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        validasiOnPress(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        validasiOnRealease(e);
    }



    private void validasiOnPress(KeyEvent e){

        try{
            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==ENTER){
                    if(checkEmpty(0, i))return;
                    if(!list.get(i).getText().equals(""))
                        cekValidBlok1(i);
                    break;
                }else if(checkKey(e, list.get(i))==DOWN){
                    if(checkEmpty(0, i))return;
                    if(!list.get(i).getText().equals(""))
                        cekValidBlok1(i);
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
    private void validasiOnRealease(KeyEvent e){
        try{
            for(int i=0;i<list.size();i++){
                if(checkKey(e, list.get(i))==DIGIT){
                    cekValidBlok1(i);
                    break;
                }
            }

        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }

    private void cekValidBlok1(int i){
        switch(i){
            case 0:
                String kab=podes.getListBlok1().get(0).getText();
                podes.getTxtKab().setText(DataStatic.getTabelKabupaten().get(kab));
                if(podes.getTxtKab().getText().equals(""))
                    message("Apakah kode kabupaten anda benar? cek ulang!");
                if(kab.equals("71")){
                    list.get(1).setText("3");
                    list.get(2).requestFocusInWindow();
                }else if(kab.equals("02") || kab.equals("06")){
                   list.get(1).setText("1");
                   list.get(2).requestFocusInWindow();
                }else if(kab.equals("10") || kab.equals("03")|| kab.equals("08")){
                   list.get(1).setText("2");
                   list.get(2).requestFocusInWindow();
                }else{
                    message("Apakah kode kabupaten anda benar? cek ulang!");
                }
                break;
            case 2:
                podes.getTxtKecamatan().setText(DataStatic.getTabelKecamatan().get(podes.getListBlok1().get(0).getText()+podes.getListBlok1().get(2).getText()));
                if(podes.getTxtKecamatan().getText().equals(""))
                    message("Apakah kode kecamatan anda benar? cek ulang!");
                next(list.get(i+1));
                break;
            case 3:
                podes.getTxtDesa().setText(DataStatic.getTabelDesa().get(podes.getListBlok1().get(0).getText()+podes.getListBlok1().get(2).getText()+podes.getListBlok1().get(3).getText()));
                if(podes.getTxtDesa().getText().equals(""))
                    message("Apakah kode desa anda benar? cek ulang!");
                next(list.get(i+1));
                break;
            case 6:
                next(podes.getListBlok2().get(1));
                break;
            default:
                next(list.get(i+1));
                break;
        }
    }
    
}
