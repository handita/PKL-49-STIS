/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.view.FormUtama;
import pkl49.view.PanelInputBlok8B;
import pkl49.view.PanelKuesioner;

/**
 *
 * @author kean
 */
public class ValidasiBlok8A extends AbstractValidasi{

    private FormUtama form;
    public static final int KOLOM2 =0;
    public static final int BARIS26 =1;
    public static final int KOLOM5 =2;
    public static final int KOLOM13 =3;
    private int kolom;

    public ValidasiBlok8A(FormUtama form,PanelKuesioner kues, List<TextField> l, int kolom) {
        super(kues);
        this.kolom = kolom;
        this.form = form;
        setList(l);
    }
    public ValidasiBlok8A(FormUtama form,PanelKuesioner kues, int kolom, List<List<TextField>> l ) {
        super(kues);
        this.kolom = kolom;
        this.form = form;
        setList2D(l);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(kolom==KOLOM2)
            validasiKolom2Press(e);
        else if(kolom==BARIS26)
            validasiBaris26Press(e);
        else if(kolom==KOLOM5)
            validasiKolom5Press(e);
        else if(kolom==KOLOM13)
            validasiKolom13Press(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(kolom==KOLOM2)
            validasiKolom2Release(e);
        else if(kolom==BARIS26)
            validasiBaris26Released(e);
        else if(kolom==KOLOM5)
            validasiKolom5Released(e);
        else if(kolom==KOLOM13)
            validasiKolom13Release(e);
    }

    /**
     * Validasi ini akan terbaca pada event key released
     * @param e
     */
    private void validasiKolom2Release(KeyEvent e){
        try{
            int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            for(int i=0;i<jArt;i++){
                if(checkKey(e, list.get(i))==DIGIT){
                    if(checkEmpty(0, i)) return;
                        cekValidKolom2(i);
                     break;
                }
            }
        }catch(IndexOutOfBoundsException ex){}
    }
    /**
     * Validasi ini akan terbaca pada event key pressed
     * @param e
     */
    private void validasiKolom2Press(KeyEvent e){
        try{
            int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            for(int i=0;i<jArt;i++){
                 if(checkKey(e, list.get(i))==ENTER){
                    if(checkEmpty(0, i)) return;
                    if(!list.get(i).getText().equals(""))
                        cekValidKolom2(i);
                     break;
                }else if(checkKey(e, list.get(i))==UP){
                    moveUpKolom2(i);break;
                }else if(checkKey(e, list.get(i))==DOWN){
                    if(checkEmpty(0, i))return;
                    if(!list.get(i).getText().equals(""))
                        cekValidKolom2(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
        }
    }
    /**
     * Validasi blok 8A kolom 2
     * @param i Index textfield
     */
    private void cekValidKolom2(int i){
        if(list.get(i).getInt()>63)
            message("Isian melebihi tidak boleh 64!");
        else if (i==kuesioner.getHalaman1().getListHalaman1().get(9).getInt()-1)
            next(kuesioner.getHalaman7().getListBaris26().get(0));
        else
            next(list.get(i+1));
    }

    private void validasiBaris26Press(KeyEvent e){
        try{
            for(int i=0;i<4;i++){
                 if(checkKey(e, list.get(i))==ENTER){
                    if(!list.get(i).getText().equals(""))
                        cekValidBaris26(i);
                     break;
                }else if(checkKey(e, list.get(i))==LEFT){
                    moveLeftBaris26(i);break;
                }else if(checkKey(e, list.get(i))==RIGHT){
                    if(!list.get(i).getText().equals(""))
                        cekValidBaris26(i);
                    break;
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
    private void validasiBaris26Released(KeyEvent e){
        try{
            
            for(int i=0;i<4;i++){
                 if(checkKey(e, list.get(i))==DIGIT){
                        cekValidBaris26(i);
                     break;
                }
            }
        }catch(IndexOutOfBoundsException ex){

        }
    }


    /**
     * Validasi blok 8A baris 26
     * @param i Index textfield
     */
    private void cekValidBaris26(int i){
        
        switch(i){
            case 0:
                if(list.get(0).getInt()==2){
                    for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++)
                        skipTo(kuesioner.getHalaman7().getListBlok8AKol5(), -1, 8, j);// skip kolom 5-11
                    skipTo(list, 0, 3);//skip kolom4
                }else if(list.get(0).getInt()==1){
                    next(list.get(1));
                }
                break;
            case 1:
                next(list.get(i+1));
                break;
            case 2:
                int index=-1;
                //mencari no. urut yang kolom 2 isiannya nol
                for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){//j< jumlah art
                    if(kuesioner.getHalaman7().getListBlok8AKol2().get(j).getInt()==0){
                       index=j;
                       break;
                    }
                }
                //jika ada lanjut ke kolom 5
                if(index==-1){
                    for(int k=0;k<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();k++){
                        skipTo(kuesioner.getHalaman7().getListBlok8AKol5(), -1, 8, k);
                    }
                   next(list.get(i+1));
                }else{
                    for(int k=0;k<index;k++){
                        skipTo(kuesioner.getHalaman7().getListBlok8AKol5(), -1, 8, k);
                    }
                    next(kuesioner.getHalaman7().getListBlok8AKol5().get(index).get(0));
                }
                break;
            case 3:
                if(list.get(3).getInt()==1){
                    List<List<TextField>> l = kuesioner.getHalaman2().getListHalaman2();
                    int idx =-1;
                    //cari usia 7-18th
                    for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++){
                        if(l.get(j).get(3).getInt()>=7 && l.get(j).get(3).getInt()<=18){
                            idx=j;break;
                        }
                    }
                    //klo g ada lanjut ke hal8
                    if(idx==-1){
                        for(int j=0;j<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();j++)
                            skipTo(kuesioner.getHalaman7().getListBlok8AKol13(), -1, 2, j);
                        //Pindah halaman berikutnya
//                        if(kuesioner.getListHal8().get(0).getListBlok8B().get(1).getText().equals("")){
                            setInputDialog();
//                        }else{
//                            showPanel(kuesioner.getListHal8().get(0), "Halaman8_1");
//                            Controller.setStatus(7);
//                            Controller.setStatusHal8(0);
//                            next(kuesioner.getListHal8().get(0).getListBlok8B().get(1));
//                        }
                    }else{
                        for(int j=0;j<idx;j++)
                            skipTo(kuesioner.getHalaman7().getListBlok8AKol13(), -1, 2, j);
                        next(kuesioner.getHalaman7().getListBlok8AKol13().get(idx).get(0));
                    }
                }else if(list.get(3).getInt()==2){
                    //Pindah halaman berikutnya
//                    /Pindah halaman berikutnya
//                    if(kuesioner.getListHal8().get(0).getListBlok8B().get(1).getText().equals("")){
                        setInputDialog();
//                    }else{
//                        showPanel(kuesioner.getListHal8().get(0), "Halaman8_1");
//                        Controller.setStatus(7);
//                        Controller.setStatusHal8(0);
//                        next(kuesioner.getListHal8().get(0).getListBlok8B().get(1));
//                    }
                }
                break;
                default:
        }
    }
    private void validasiKolom5Press(KeyEvent e){
        try{
            int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            for(int i=0;i<jArt;i++){
                for(int j=0;j<8;j++){
                     if(checkKey(e, list2D.get(i).get(j))==ENTER){
                        if(!list2D.get(i).get(j).getText().equals(""))
                            cekValidKolom5(i, j);
                         break;
                    }else if(checkKey(e, list2D.get(i).get(j))==LEFT){
                        moveLeftKolom5(i,j);break;
                    }else if(checkKey(e, list2D.get(i).get(j))==RIGHT){
                        if(!list2D.get(i).get(j).getText().equals(""))
                            cekValidKolom5(i, j);
                        break;
                    }
                }
            }
        }catch(IndexOutOfBoundsException ex){
        }
    }
    private void validasiKolom5Released(KeyEvent e){
        try{
            int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            for(int i=0;i<jArt;i++){
                 for(int j=0;j<8;j++){
                     if(checkKey(e, list2D.get(i).get(j))==DIGIT){
                            cekValidKolom5(i, j);
                         break;
                    }
                }
            }
        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
    /**
     * Validasi Kolom5
     * @param i
     * @param j
     */
    private void cekValidKolom5(int i, int j){
        int index=-1;
        int jArt =kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
        //mencari no. urut yang kolom 2 isiannya nol
        for(int k=i+1;k<jArt;k++){//k< jumlah art
            if(kuesioner.getHalaman7().getListBlok8AKol2().get(k).getInt()==0){
               index=k;
               break;
            }
        }
        switch(j){
            case 0:
                if(list2D.get(i).get(0).getInt()==1){
                    skipTo(list2D, 0, 2,i); //skip ke kolom 6
                    next(list2D.get(i).get(2));
                }
                else
                    next(list2D.get(i).get(1));
                break;//ke alasan
            case 1:
                //jika ada lanjut ke kolom 5
                if(index==-1){
                    skipTo(list2D,1,8,i);
                    for(int k=i+1;k<8;k++)
                        skipTo(list2D, -1, 8, k);
                    next(kuesioner.getHalaman7().getListBaris26().get(3));//lanjut ke kolom 12
                }else{
                    skipTo(list2D,1,8,i);
                    for(int k=i+1;k<index;k++){
                        skipTo(list2D, -1, 8, k);
                    }
                    next(list2D.get(index).get(0));
                }
                break;
            case 2:
                if(list2D.get(i).get(j).getInt()==1)
                    next(list2D.get(i).get(j+1));
                else{
                    skipTo(list2D,j,j+2,i);
                    next(list2D.get(i).get(4));
                }
                break;
            case 4:
                if(list2D.get(i).get(j).getInt()==1)
                    next(list2D.get(i).get(j+1));
                else{
                    skipTo(list2D,j,j+2,i);
                    next(list2D.get(i).get(6));
                }
                break;
            case 7:
                //jika ada lanjut ke kolom 5
                if(index==-1){
                    for(int k=i+1;k<8;k++)
                        skipTo(list2D, -1, 8, k);
                    next(kuesioner.getHalaman7().getListBaris26().get(3));//lanjut ke kolom 12
                }else{
                    for(int k=i+1;k<index;k++){
                        skipTo(list2D, -1, 8, k);
                    }
                    next(list2D.get(index).get(0));
                }
                break;
            default:next(list2D.get(i).get(j+1));break;

        }
    }


    private void validasiKolom13Press(KeyEvent e){
        try{
            int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            for(int i=0;i<jArt;i++){
                for(int j=0;j<2;j++){
                     if(checkKey(e, list2D.get(i).get(j))==ENTER){
                        if(!list2D.get(i).get(j).getText().equals(""))
                            cekValidKolom13(i, j);
                         break;
                    }else if(checkKey(e, list2D.get(i).get(j))==UP){
//                        moveUp(i);break;
                    }else if(checkKey(e, list2D.get(i).get(j))==DOWN){
                        if(!list2D.get(i).get(j).getText().equals(""))
                            cekValidKolom13(i, j);
                        break;
                    }
                }
            }
        }catch(IndexOutOfBoundsException ex){
        }
    }
    private void validasiKolom13Release(KeyEvent e){
        try{
            int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
            for(int i=0;i<jArt;i++){
                 for(int j=0;j<2;j++){
                     if(checkKey(e, list2D.get(i).get(j))==DIGIT){
                         cekValidKolom13(i, j);
                         break;
                    }
                }
            }
        }catch(IndexOutOfBoundsException ex){
        }
    }

    private void cekValidKolom13(int i,int j){
        if(j==0){
            if(list2D.get(i).get(j).getInt()==1){
                List<List<TextField>> l = kuesioner.getHalaman2().getListHalaman2();
                int idx =-1;
                //cari usia 7-18th
                for(int k=i+1;k<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();k++){
                    if(l.get(k).get(3).getInt()>=7 && l.get(k).get(3).getInt()<=18){
                        idx=k;break;
                    }
                }
                //klo g ada lanjut ke hal8
                if(idx==-1){
                    skipTo(list2D, 0, 2, i);
                    for(int k=i+1;k<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();k++)
                        skipTo(list2D, -1, 2, k);
                    //Pindah halaman berikutnya

//                    if(kuesioner.getListHal8().get(0).getListBlok8B().get(1).getText().equals("")){
                        setInputDialog();
//                    }else{
//                        showPanel(kuesioner.getListHal8().get(0), "Halaman8_1");
//                        Controller.setStatus(7);
//                        Controller.setStatusHal8(0);
//                        next(kuesioner.getListHal8().get(0).getListBlok8B().get(1));
//                    }
                }else{
                    skipTo(list2D, 0, 2, i);
                    for(int k=i+1;k<idx;k++)
                        skipTo(list2D, -1, 2, k);
                    next(list2D.get(idx).get(0));
                }
            }else
                next(list2D.get(i).get(j+1));
        }else if(j==1){
            List<List<TextField>> l = kuesioner.getHalaman2().getListHalaman2();
            int idx =-1;
            //cari usia 7-18th
            for(int k=i+1;k<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();k++){
                if(l.get(k).get(3).getInt()>=7 && l.get(k).get(3).getInt()<=18){
                    idx=k;break;
                }
            }
            //klo g ada lanjut ke hal8
            if(idx==-1){
                for(int k=i+1;k<kuesioner.getHalaman1().getListHalaman1().get(9).getInt();k++)
                    skipTo(list2D, -1, 2, k);
                //Pindah halaman berikutnya
//                if(kuesioner.getListHal8().get(0).getListBlok8B().get(1).getText().equals("")){
                    setInputDialog();
//                }else{
//                    showPanel(kuesioner.getListHal8().get(0), "Halaman8_1");
//                    Controller.setStatus(7);
//                    Controller.setStatusHal8(0);
//                    next(kuesioner.getListHal8().get(0).getListBlok8B().get(1));
//                }
            }else{
                for(int k=i+1;k<idx;k++)
                    skipTo(list2D, -1, 2, k);
                next(list2D.get(idx).get(0));
            }
        }
    }


    private void moveUpKolom2(int from){
        if(from==0){
            showPanel(kuesioner.getHalaman6(), "Halaman6");
            next(kuesioner.getHalaman6().getListBlok7B().get(36));
        }else{
            next(list.get(from-1));
        }
    }
    private void moveLeftKolom5(int i,int j){
        if(i!=0){
            boolean b=true;
            int k=i,l=j-1;
            while(b){
                if(list2D.get(k).get(l).isEnabled()){
                    list2D.get(k).get(l).requestFocusInWindow();
                    b=false;
                }
                else{
                    if(l==0){
                        l=7;k--;
                    }else{
                        l--;
                    }
                    if(l==-1 && k==-1){
                        kuesioner.getHalaman7().getListBaris26().get(2).requestFocusInWindow();
                        b=false;
                    }
                }
            }
        }else if(i==0 && j ==0 )
            kuesioner.getHalaman7().getListBaris26().get(2).requestFocusInWindow();
        
    }

    private void moveLeftBaris26(int i){
        int jArt = kuesioner.getHalaman1().getListHalaman1().get(9).getInt();
        if(i==0)
            kuesioner.getHalaman7().getListBlok8AKol2().get(jArt-1).requestFocusInWindow();
        else if (i==3){
             boolean b=true;
            int k=jArt-1,l=7;
            while(b){
                if(kuesioner.getHalaman7().getListBlok8AKol5().get(k).get(l).isEnabled()){
                    kuesioner.getHalaman7().getListBlok8AKol5().get(k).get(l).requestFocusInWindow();
                    b=false;
                }
                else{
                    if(l==0){
                        l=7;k--;
                    }else{
                        l--;
                    }
                    if(l==-1 && k==-1){
                        kuesioner.getHalaman7().getListBaris26().get(2).requestFocusInWindow();
                        b=false;
                    }
                }
            }
        }else
            list.get(i-1).requestFocusInWindow();
    }

    private void setInputDialog(){
        final PanelInputBlok8B pi = new PanelInputBlok8B();
        pi.getBtnOK().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pi.getJumlah()<1){
                    JOptionPane.showMessageDialog(kuesioner, "Banyaknya Blok8C yang harus dientry minimal satu!");
                }else if(pi.getJumlah()>kuesioner.getHalaman1().getListHalaman1().get(13).getInt()+kuesioner.getHalaman1().getListHalaman1().get(14).getInt()){
                    JOptionPane.showMessageDialog(kuesioner, "Banyaknya Blok8C yang harus dientry tidak boleh lebih dari\nbanyaknya ART yang berumur 15 tahun ke atas!");
                }else{
                    ValidasiBlok8B.setjArt15(pi.getJumlah());
                    showPanel(kuesioner.getListHal8().get(0), "Halaman8_1");
                    Controller.setStatus(7);
                    Controller.setStatusHal8(0);
                    next(kuesioner.getListHal8().get(0).getListBlok8B().get(1));
                    pi.setVisible(false);
                }
            }
        });
        form.setGlassPane(pi);
        form.getGlassPane().setVisible(true);
        pi.getTxtJumlah().requestFocusInWindow();
    }
}


