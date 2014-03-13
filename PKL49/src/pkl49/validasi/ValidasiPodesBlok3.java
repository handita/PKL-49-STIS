/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.event.KeyEvent;
import java.util.List;
import pkl49.component.TextField;
import pkl49.view.PanelKuesionerPodes;

/**
 *
 * @author Ken
 */
public class ValidasiPodesBlok3 extends AbstractValidasi{


    PanelKuesionerPodes podes;
    public ValidasiPodesBlok3(PanelKuesionerPodes podes,List<TextField> l) {
        setList(l);
        this.podes = podes;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        validasiInRelease(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        for(int i=54;i<list.size();i++)
        if(checkKey(e, list.get(i))==ENTER){
                cekValidasi(i);break;
        }
    }


    private void validasiInRelease(KeyEvent e){
        for(int i=0;i<list.size();i++){
            if(checkKey(e, list.get(i))==DIGIT){
                if(checkEmpty(0, i))return;
                    cekValidasi(i);break;
            }else if(checkKey(e, list.get(i))==DOWN){
                if(checkEmpty(0, i))return;
                    cekValidasi(i);break;
            }else if(checkKey(e, list.get(i))==UP){
                moveUp(i);break;
            }

        }

    }

    private void cekValidasi(int i){
        boolean ada=false;
        switch(i){
            case 6:
                //cek jika nilainya 2 semua skip ke R4
                int a =list.get(0).getInt()+list.get(1).getInt()+list.get(2).getInt()+list.get(3).getInt()+
                        list.get(4).getInt()+list.get(5).getInt()+list.get(6).getInt();
                
                if(a==14){
                    skipTo(list, 6, 49);
                    for(int j=21;j<49;j++){
                        list.get(j).setText("0");
                    }
                    System.out.println(21);
                    list.get(30).setText("0");
                }else{
                    for(int j=0;j<7;j++){
                        if(list.get(j).getInt()==1){
                            skipTo(list, i, 2*j+7);
                            ada=true;
                            break;
                        }
                    }
                    
                }
                break;
            case 8:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non Pemerintah isiannya tidak boleh 2 semua!");
                else{
                    for(int j=1;j<7;j++){
                        if(list.get(j).getInt()==1){
                            skipTo(list, i, 2*j+7);
                            ada=true;
                            break;
                        }
                    }
                    if(ada==false){
                        for(int j=7;j<i+2;j++){
                            if(list.get(j).getInt()==null)continue;
                            if(list.get(j).getInt()==1){
                               skipTo(list, i, 2*j+7);
                               break;
                            }
                        }
                    }
                }break;
            case 10:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non Pemerintah isiannya tidak boleh 2 semua!");
                else{
                    for(int j=2;j<7;j++){
                        if(list.get(j).getInt()==1){
                            skipTo(list, i, 2*j+7);
                            ada=true;
                            break;
                        }
                    }
                    if(ada==false){
                        for(int j=7;j<i+2;j++){
                            if(list.get(j).getInt()==null)continue;
                            if(list.get(j).getInt()==1){
                               skipTo(list, i, 2*j+7);
                               break;
                            }
                        }
                    }
                }break;
            case 12:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non pemerintah isiannya tidak boleh 2 semua!");
                else{
                    for(int j=3;j<7;j++){
                        if(list.get(j).getInt()==1){
                            skipTo(list, i, 2*j+7);
                            ada=true;
                            break;
                        }
                    }
                    if(ada==false){
                        for(int j=7;j<i+2;j++){
                            if(list.get(j).getInt()==null)continue;
                            if(list.get(j).getInt()==1){
                               skipTo(list, i, 2*j+7);
                               break;
                            }
                        }
                    }
                }break;
            case 14:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non pemerintah isiannya tidak boleh 2 semua!");
                else{
                    for(int j=4;j<7;j++){
                        if(list.get(j).getInt()==1){
                            skipTo(list, i, 2*j+7);
                            ada=true;
                            break;
                        }
                    }
                    if(ada==false){
                        for(int j=7;j<i+2;j++){
                            if(list.get(j).getInt()==null)continue;
                            if(list.get(j).getInt()==1){
                               skipTo(list, i, 2*j+7);
                               break;
                            }
                        }
                    }
                }break;
            case 16:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non pemerintah isiannya tidak boleh 2 semua!");
                else{
                    for(int j=5;j<7;j++){
                        if(list.get(j).getInt()==1){
                            skipTo(list, i, 2*j+7);
                            ada=true;
                            break;
                        }
                    }
                    if(ada==false){
                        for(int j=7;j<i+2;j++){
                            if(list.get(j).getInt()==null)continue;
                            if(list.get(j).getInt()==1){
                               skipTo(list, i, 2*j+7);
                               break;
                            }
                        }
                    }
                }break;
            case 18:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non pemerintah isiannya tidak boleh 2 semua!");
                else{
                    if(list.get(6).getInt()==1){
                        next(list.get(i+1));
                    }else{
                        for(int j=7;j<21;j++){
                            if(list.get(j).getInt()==null)continue;
                            if(list.get(j).getInt()==1){
                               skipTo(list, 18, 2*j+7);
                               break;
                            }
                            
                        }
                    }
                    
                }break;
            case 20:
                if(list.get(i-1).getInt()==2 && list.get(i).getInt()==2)
                    message("Pemerintah dan non pemerintah isiannya tidak boleh 2 semua!");
                else{
                     for(int j=7;j<21;j++){
                        if(list.get(j).getInt()==null)continue;
                        if(list.get(j).getInt()==1){
                           skipTo(list, 20, 2*j+7);
                           break;
                        }

                    }
                }break;
            case 22:
                for(int j=8;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 24:
                for(int j=9;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 26:
                for(int j=10;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 28:
                for(int j=11;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 30:
                for(int j=12;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 32:
                for(int j=13;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 34:
                for(int j=14;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 36:
                for(int j=15;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 38:
                for(int j=16;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 40:
                for(int j=17;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 42:
                for(int j=18;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 44:
                for(int j=19;j<21;j++){
                    if(list.get(j).getInt()==null)continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 46:
                for(int j=20;j<21;j++){
                    if(list.get(j).getInt()==null)
                        continue;
                    if(list.get(j).getInt()==1){
                       skipTo(list, i, 2*j+7);
                       ada=true;
                       break;
                    }
                }
                if(ada==false){
                    skipTo(list, i, 49);
                }
                break;
            case 49:
                if(list.get(i).getInt()==2){
                    next(list.get(55));
                }else{
                    list.get(55).setText(null);
                    list.get(55).setEnabled(false);
                    next(list.get(i+1));
                }
                break;
            case 50:
                if(list.get(i).getInt()==2){
                    next(list.get(56));
                }else{
                    list.get(56).setText(null);
                    list.get(56).setEnabled(false);
                    next(list.get(i+1));
                }break;
            case 51:
                if(list.get(i).getInt()==2){
                    skipTo(list, 51, 54);
                list.get(54).setText(null);
                list.get(54).setEnabled(false);
                    podes.getBtnSave().setEnabled(true);
                    podes.getBtnSave().requestFocusInWindow();
                }else
                    next(list.get(i+1));
                break;
            case 53:
                if(list.get(i).getInt()==2){
                    if(list.get(i-1).getInt()==2){
                        message("Sumber sponsor tidak boleh berkode 2 semua...");
                    }else{
                        list.get(54).setText(null);
                        list.get(54).setEnabled(false);
                        podes.getBtnSave().setEnabled(true);
                        podes.getBtnSave().requestFocusInWindow();
                        //Akhir. s
                    }
                }else
                    next(list.get(i+1));
                break;
            case 54:
                podes.getBtnSave().setEnabled(true);
                podes.getBtnSave().requestFocusInWindow();break;
            case 55://alasan
                skipTo(list, 49, 54);
                list.get(56).setText(null);
                list.get(56).setEnabled(false);
                list.get(54).setText(null);
                list.get(54).setEnabled(false);
                //Akhir
                podes.getBtnSave().setEnabled(true);
                podes.getBtnSave().requestFocusInWindow();break;
            case 56://alasan
                next(list.get(51));break;
            default:
                next(list.get(i+1));
                break;

        }
    }


    @Override
    protected void moveUp(int from) {
        super.moveUp(from);
        if(from==0){
            next(podes.getListBlok2().get(5));
        }
    }

}