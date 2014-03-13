/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.control;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import pkl49.component.TextField;
import pkl49.util.PencacahIdentity;
import pkl49.database.KuesionerDaoImpl;
import pkl49.validasi.ValidasiBlok8B;
import pkl49.validasi.ValidasiBlok8C;
import pkl49.validasi.validasiBlok56UpGrade;
import pkl49.view.PanelKuesioner;
import pkl49.view.PanelKuesionerPodes;
import pkl49.database.entity.*;

/**
 *
 * @author Ken
 */
public class FormUtil {


    /*****************************************************/
    /*         Hapus data dari Form Kuesioner            */
    /*****************************************************/

    public static void resetKuesioner(PanelKuesioner k){
       try{
            resetHalaman1(k);
            resetHalaman2(k);
            resetHalaman3(k);
            resetHalaman4(k);
            resetHalaman5(k);
            resetHalaman6(k);
            resetHalaman7(k);
            resetHalaman8(k);
            resetHalaman9(k);
            Controller.setStatus(0);
            Controller.setStatusHal3(0);
            Controller.setStatusHal8(0);
            Controller.setStatusHal9(0);
            ValidasiBlok8B.loop = 0;
            ValidasiBlok8C.loop = 0;
            validasiBlok56UpGrade.setJmlahART(1);
            k.getHalaman1().getListHalaman1().get(0).requestFocusInWindow();
       }catch(IndexOutOfBoundsException ex){
           ex.printStackTrace();
       }
        
    }

    private static void resetHalaman1(PanelKuesioner k){
        for(int i=0;i<k.getHalaman1().getListHalaman1().size();i++){
            if(i==15)break;
            k.getHalaman1().getListHalaman1().get(i).setText(null);
            k.getHalaman1().getListHalaman1().get(i).setContain(false);
        }
        k.getHalaman1().getLabelKab().setText(" ");
        k.getHalaman1().getLabelKec().setText(" ");
        k.getHalaman1().getLabelDesa().setText(" ");
    }
    private static void resetHalaman2(PanelKuesioner k){
        for(int i=0;i<k.getHalaman2().getListHalaman2().size();i++)
            for(int j=0;j<8;j++){
                if(!k.getHalaman2().getListHalaman2().get(i).get(j).isEnabled())
                    k.getHalaman2().getListHalaman2().get(i).get(j).setEnabled(true);
                k.getHalaman2().getListHalaman2().get(i).get(j).setText(null);
                k.getHalaman2().getListHalaman2().get(i).get(j).setContain(false);
        }
    }
    private static void resetHalaman3(PanelKuesioner k){
        for(int i=0;i<25;i++){
            for(int j=0;j<k.getListHal3().get(i).getListBlok5().size();j++){
                if(!k.getListHal3().get(i).getListBlok5().get(j).isEnabled())
                    k.getListHal3().get(i).getListBlok5().get(j).setEnabled(true);
                k.getListHal3().get(i).getListBlok5().get(j).setContain(false);
                k.getListHal3().get(i).getListBlok5().get(j).setText(null);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5A().size();j++){
                if(!k.getListHal3().get(i).getListBlok5A().get(j).isEnabled())
                    k.getListHal3().get(i).getListBlok5A().get(j).setEnabled(true);
                k.getListHal3().get(i).getListBlok5A().get(j).setContain(false);
                k.getListHal3().get(i).getListBlok5A().get(j).setText(null);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5B().size();j++){
                if(!k.getListHal3().get(i).getListBlok5B().get(j).isEnabled())
                    k.getListHal3().get(i).getListBlok5B().get(j).setEnabled(true);
                k.getListHal3().get(i).getListBlok5B().get(j).setContain(false);
                k.getListHal3().get(i).getListBlok5B().get(j).setText(null);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5C().size();j++){
                if(!k.getListHal3().get(i).getListBlok5C().get(j).isEnabled())
                    k.getListHal3().get(i).getListBlok5C().get(j).setEnabled(true);
                k.getListHal3().get(i).getListBlok5C().get(j).setContain(false);
                k.getListHal3().get(i).getListBlok5C().get(j).setText(null);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5D().size();j++){
                if(!k.getListHal3().get(i).getListBlok5D().get(j).isEnabled())
                    k.getListHal3().get(i).getListBlok5D().get(j).setEnabled(true);
                k.getListHal3().get(i).getListBlok5D().get(j).setContain(false);
                k.getListHal3().get(i).getListBlok5D().get(j).setText(null);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5E().size();j++){
                if(!k.getListHal3().get(i).getListBlok5E().get(j).isEnabled())
                    k.getListHal3().get(i).getListBlok5E().get(j).setEnabled(true);
                k.getListHal3().get(i).getListBlok5E().get(j).setContain(false);
                k.getListHal3().get(i).getListBlok5E().get(j).setText(null);
            }
        }
    }
    private static void resetHalaman4(PanelKuesioner k){
        for(int i=0;i<k.getHalaman4().getListBlok6().size();i++){
            if(!k.getHalaman4().getListBlok6().get(i).isEnabled())
                k.getHalaman4().getListBlok6().get(i).setEnabled(true);
            k.getHalaman4().getListBlok6().get(i).setText(null);
            k.getHalaman4().getListBlok6().get(i).setContain(false);
        }
    }
    private static void resetHalaman5(PanelKuesioner k){
        for(int i=0;i<k.getHalaman5().getListBlok7A().size();i++){
            if(!k.getHalaman5().getListBlok7A().get(i).isEnabled())
                k.getHalaman5().getListBlok7A().get(i).setEnabled(true);
            k.getHalaman5().getListBlok7A().get(i).setText(null);
            k.getHalaman5().getListBlok7A().get(i).setContain(false);
        }
    }
    private static void resetHalaman6(PanelKuesioner k){
        for(int i=0;i<k.getHalaman6().getListBlok7B().size();i++){
            if(!k.getHalaman6().getListBlok7B().get(i).isEnabled())
                k.getHalaman6().getListBlok7B().get(i).setEnabled(true);
            k.getHalaman6().getListBlok7B().get(i).setText(null);
            k.getHalaman6().getListBlok7B().get(i).setContain(false);
        }
    }
    private static void resetHalaman7(PanelKuesioner k){
        for(int i=0;i<k.getHalaman7().getListBlok8AKol2().size();i++){
            if(!k.getHalaman7().getListBlok8AKol2().get(i).isEnabled())
                k.getHalaman7().getListBlok8AKol2().get(i).setEnabled(true);
            k.getHalaman7().getListBlok8AKol2().get(i).setText(null);
            k.getHalaman7().getListBlok8AKol2().get(i).setContain(false);
        }
        for(int i=0;i<k.getHalaman7().getListBaris26().size();i++){
            if(!k.getHalaman7().getListBaris26().get(i).isEnabled())
                k.getHalaman7().getListBaris26().get(i).setEnabled(true);
            k.getHalaman7().getListBaris26().get(i).setText(null);
            k.getHalaman7().getListBaris26().get(i).setContain(false);
        }
        for(int i=0;i<k.getHalaman7().getListBlok8AKol5().size();i++){
            for(int j=0;j<8;j++){
                if(!k.getHalaman7().getListBlok8AKol5().get(i).get(j).isEnabled())
                    k.getHalaman7().getListBlok8AKol5().get(i).get(j).setEnabled(true);
                k.getHalaman7().getListBlok8AKol5().get(i).get(j).setText(null);
                k.getHalaman7().getListBlok8AKol5().get(i).get(j).setContain(false);
            }
        }
        for(int i=0;i<k.getHalaman7().getListBlok8AKol13().size();i++){
            for(int j=0;j<2;j++){
                if(!k.getHalaman7().getListBlok8AKol13().get(i).get(j).isEnabled())
                    k.getHalaman7().getListBlok8AKol13().get(i).get(j).setEnabled(true);
                k.getHalaman7().getListBlok8AKol13().get(i).get(j).setText(null);
                k.getHalaman7().getListBlok8AKol13().get(i).get(j).setContain(false);
            }
        }
    }
    private static void resetHalaman8(PanelKuesioner k){
        for(int i=0;i<10;i++){
            for(int j=0;j<k.getListHal8().get(i).getListBlok8B().size();j++){
                if(!k.getListHal8().get(i).getListBlok8B().get(j).isEnabled())
                    k.getListHal8().get(i).getListBlok8B().get(j).setEnabled(true);
                k.getListHal8().get(i).getListBlok8B().get(j).setContain(false);
                k.getListHal8().get(i).getListBlok8B().get(j).setText(null);
            }
        }
    }
    private static void resetHalaman9(PanelKuesioner k){
        for(int i=0;i<5;i++){
            for(int j=0;j<k.getListHal9().get(i).getListBlok8C().size();j++){
                k.getListHal9().get(i).getListBlok8C().get(j).setContain(false);
                k.getListHal9().get(i).getListBlok8C().get(j).setText(null);
            }
        }
    }

    public static void resetKuesionerPodes(PanelKuesionerPodes p){
        for(int i=0;i<p.getListBlok1().size();i++){
            p.getListBlok1().get(i).setContain(false);
            p.getListBlok1().get(i).setText(null);
        }
        for(int i=0;i<p.getListBlok3().size();i++){
            if(!p.getListBlok3().get(i).isEnabled())
                p.getListBlok3().get(i).setEnabled(true);
            p.getListBlok3().get(i).setContain(false);
            p.getListBlok3().get(i).setText(null);
        }
    }
    /*****************************************************/
    /*       Set Form Kuesioner dengan data dari DBMS    */
    /*****************************************************/

    /**
     * Mengeset form kuesioner dengan data
     * @param k panelKuesioner
     * @param NKS NKS(Primary Key)
     */
    public static void setKuesioner(PanelKuesioner k, String NKS){
        KuesionerDaoImpl kues = new KuesionerDaoImpl();
        kues.getDataFromDB(NKS);
        List<Object> l = kues.getListEntity();
        Blok1 b1 = (Blok1) l.get(0);
        Blok2 b2 = (Blok2) l.get(1);
        List<Blok4> b4 = (List<Blok4>) l.get(2);
        List<Blok5a> b5 = (List<Blok5a>) l.get(3);
        List<Blok5b> b5b = (List<Blok5b>) l.get(4);
        List<Blok5c> b5c = (List<Blok5c>) l.get(5);
        List<Blok5de> b5d = (List<Blok5de>) l.get(6);
        Blok6 b6 = (Blok6) l.get(7);
        Blok7a b7a = (Blok7a) l.get(8);
        Blok7b b7b = (Blok7b) l.get(9);
        List<Blok8a1> b8a1 = (List<Blok8a1>) l.get(10);
        Blok8a2 b8a2 = (Blok8a2) l.get(11);
        List<Blok8a3> b8a3 = (List<Blok8a3>) l.get(12);
        List<Blok8a4> b8a4 = (List<Blok8a4>) l.get(13);
        List<Blok8a5> b8a5 = (List<Blok8a5>) l.get(14);
        List<Blok8b> b8b = (List<Blok8b>) l.get(15);
        List<Blok8c> b8c = (List<Blok8c>) l.get(16);

        //Jumlah ART disimpan dulu sebelum update.
        //ini unutk menghandle klo ada perubahan jumlah ART
        DataStatic.setJmlArtSblmUpdate(b4.size());
        DataStatic.setJmlBlok8a3SblmUpdate(b8a3.size());
        DataStatic.setJmlBlok8a4SblmUpdate(b8a4.size());
        DataStatic.setJmlBlok8a5SblmUpdate(b8a5.size());
        DataStatic.setJmlBlok8bSblmUpdate(b8b.size());
        DataStatic.setJmlBlok8cSblmUpdate(b8c.size());

        Controller.setJumlahHal3(b2.getB2R1());
        Controller.setJumlahHal8(b8b.size());
        Controller.setJumlahHal9(b8c.size());
        setHalaman1(k, b1, b2);
        setHalaman2(k, b4);
        setHalaman3(k, b5, b5b, b5c, b5d);
        setHalaman4(k, b6);
        setHalaman5(k, b7a);
        setHalaman6(k, b7b);
        setHalaman7(k, b8a1, b8a2, b8a3, b8a4, b8a5);
        setHalaman8(k, b8b);
        setHalaman9(k, b8c);
    }

    public static void setHalaman1(PanelKuesioner k, Blok1 b1, Blok2 b2){
        k.getHalaman1().getListHalaman1().get(0).setText(b1.getB1R1());
        k.getHalaman1().getListHalaman1().get(1).setText(DataStatic.getTabelStrata().get(b1.getB1R1()));//setStrata
        k.getHalaman1().getListHalaman1().get(2).setText(b1.getB1R3());
        k.getHalaman1().getListHalaman1().get(3).setText(b1.getB1R4());
        k.getHalaman1().getLabelKab().setText(DataStatic.getTabelKabupaten().get(b1.getB1R1()));//set namakab
        k.getHalaman1().getLabelKec().setText(DataStatic.getTabelKecamatan().get(b1.getB1R1()+b1.getB1R3()));//set namakec
        k.getHalaman1().getLabelDesa().setText(DataStatic.getTabelDesa().get(b1.getB1R1()+b1.getB1R3()+b1.getB1R4()));//set namaDesa
        k.getHalaman1().getListHalaman1().get(4).setText(b1.getB1R5());
        k.getHalaman1().getListHalaman1().get(5).setText(b1.getB1R6());
        k.getHalaman1().getListHalaman1().get(6).setText(b1.getB1R7());
        k.getHalaman1().getListHalaman1().get(7).setText(b1.getB1R8());
        k.getHalaman1().getListHalaman1().get(8).setText(b1.getB1R9());
        //set Blok 2
        if(b2.getB2R1()<10)
            k.getHalaman1().getListHalaman1().get(9).setText("0"+b2.getB2R1());
        else
            k.getHalaman1().getListHalaman1().get(9).setInt(b2.getB2R1());
        if(b2.getB2R2()<10)
            k.getHalaman1().getListHalaman1().get(10).setText("0"+b2.getB2R2());
        else
            k.getHalaman1().getListHalaman1().get(10).setInt(b2.getB2R2());
        if(b2.getB2R3()<10)
            k.getHalaman1().getListHalaman1().get(11).setText("0"+b2.getB2R3());
        else
            k.getHalaman1().getListHalaman1().get(11).setInt(b2.getB2R3());
        if(b2.getB2R4()<10)
            k.getHalaman1().getListHalaman1().get(12).setText("0"+b2.getB2R4());
        else
            k.getHalaman1().getListHalaman1().get(12).setInt(b2.getB2R4());
        if(b2.getB2R5()<10)
            k.getHalaman1().getListHalaman1().get(13).setText("0"+b2.getB2R5());
        else
            k.getHalaman1().getListHalaman1().get(13).setInt(b2.getB2R5());
        if(b2.getB2R6()<10)
            k.getHalaman1().getListHalaman1().get(14).setInt(b2.getB2R6());
        else
            k.getHalaman1().getListHalaman1().get(14).setInt(b2.getB2R6());
        //set blok 3
        k.getHalaman1().getListHalaman1().get(15).setText(new PencacahIdentity().getPencacahDic().get(b1.getB3R2()));//Nama Pencacah
        k.getHalaman1().getListHalaman1().get(16).setText(b1.getB3R2());
        k.getHalaman1().getListHalaman1().get(17).setText(b1.getB3R3());
//        k.getHalaman1().getListHalaman1().get(18).setText(new PencacahIdentity().getPencacahDic().get(b3.getB3R6()));//Nama Kortim
//        k.getHalaman1().getListHalaman1().get(19).setText(b3.getB3R6());//nim kortim
        k.getHalaman1().getListHalaman1().get(20).setText(b1.getB3R7());
        for(int i=0;i<k.getHalaman1().getListHalaman1().size();i++){
            if(!k.getHalaman1().getListHalaman1().get(i).getText().equals(""))
                k.getHalaman1().getListHalaman1().get(i).setContain(true);
        }
    }
    private static void setHalaman2(PanelKuesioner k, List<Blok4> b4){
        for(int i=0;i<k.getHalaman1().getListHalaman1().get(9).getInt();i++){
            k.getHalaman2().getListHalaman2().get(i).get(0).setText(b4.get(i).getB4K2());
            k.getHalaman2().getListHalaman2().get(i).get(1).setInt(b4.get(i).getB4K3());
            k.getHalaman2().getListHalaman2().get(i).get(2).setInt(b4.get(i).getB4K4());
            k.getHalaman2().getListHalaman2().get(i).get(3).setInt(b4.get(i).getB4K5());
            k.getHalaman2().getListHalaman2().get(i).get(4).setInt(b4.get(i).getB4K6());
            k.getHalaman2().getListHalaman2().get(i).get(5).setInt(b4.get(i).getB4K7());
            k.getHalaman2().getListHalaman2().get(i).get(6).setInt(b4.get(i).getB4K8());
            k.getHalaman2().getListHalaman2().get(i).get(7).setInt(b4.get(i).getB4K9());
            for(int j=0;j<8;j++){
                if(k.getHalaman2().getListHalaman2().get(i).get(j).getText().equals(""))
                    k.getHalaman2().getListHalaman2().get(i).get(j).setEnabled(false);
                else
                    k.getHalaman2().getListHalaman2().get(i).get(j).setContain(true);
            }
        }
        //set disable yg g kepake
        for(int i=k.getHalaman1().getListHalaman1().get(9).getInt();i<25;i++){
            for(int j=0;j<8;j++)
                k.getHalaman2().getListHalaman2().get(i).get(j).setEnabled(false);
        }
    }
    private static void setHalaman3(PanelKuesioner k, List<Blok5a> b5, List<Blok5b> b5b,List<Blok5c> b5c,List<Blok5de> b5d){
        for(int i=0;i<k.getHalaman1().getListHalaman1().get(9).getInt();i++){
            //Set Blok 5
            k.getListHal3().get(i).getListBlok5().get(0).setText(k.getHalaman2().getListHalaman2().get(b5.get(i).getNO_URUT()-1).get(0).getText());
            k.getListHal3().get(i).getListBlok5().get(1).setInt(b5.get(i).getB5R1A());
            k.getListHal3().get(i).getListBlok5().get(2).setInt(b5.get(i).getNO_URUT());
            k.getListHal3().get(i).getListBlok5().get(3).setInt(b5.get(i).getB5R2());//ibu
            k.getListHal3().get(i).getListBlok5().get(4).setInt(b5.get(i).getB5R3());
            k.getListHal3().get(i).getListBlok5().get(5).setText(b5.get(i).getB5R4A1());
            k.getListHal3().get(i).getListBlok5().get(6).setInt(b5.get(i).getB5R4A2());
            k.getListHal3().get(i).getListBlok5().get(7).setInt(b5.get(i).getB5R4B());
            k.getListHal3().get(i).getListBlok5().get(8).setInt(b5.get(i).getB5R4BLain());
            k.getListHal3().get(i).getListBlok5().get(9).setText(k.getHalaman2().getListHalaman2().get(b5.get(i).getB5R5()-1).get(0).getText());
            k.getListHal3().get(i).getListBlok5().get(10).setInt(b5.get(i).getB5R5());
            //Set Blok 5A
            k.getListHal3().get(i).getListBlok5A().get(0).setInt(b5.get(i).getB5AR6A());
            k.getListHal3().get(i).getListBlok5A().get(1).setInt(b5.get(i).getB5AR6B());
            k.getListHal3().get(i).getListBlok5A().get(2).setInt(b5.get(i).getB5AR6C());
            k.getListHal3().get(i).getListBlok5A().get(3).setInt(b5.get(i).getB5AR6D());
            k.getListHal3().get(i).getListBlok5A().get(4).setInt(b5.get(i).getB5AR6E());
            k.getListHal3().get(i).getListBlok5A().get(5).setInt(b5.get(i).getB5AR6F());
            k.getListHal3().get(i).getListBlok5A().get(6).setInt(b5.get(i).getB5AR6G());
            k.getListHal3().get(i).getListBlok5A().get(7).setInt(b5.get(i).getB5AR6H());
            k.getListHal3().get(i).getListBlok5A().get(8).setInt(b5.get(i).getB5AR6HLain());
            k.getListHal3().get(i).getListBlok5A().get(9).setInt(b5.get(i).getB5AR7());
            k.getListHal3().get(i).getListBlok5A().get(10).setInt(b5.get(i).getB5AR8());
            k.getListHal3().get(i).getListBlok5A().get(11).setInt(b5.get(i).getB5AR9A());
            k.getListHal3().get(i).getListBlok5A().get(12).setInt(b5.get(i).getB5AR9B1());
            k.getListHal3().get(i).getListBlok5A().get(13).setInt(b5.get(i).getB5AR9B2());
            k.getListHal3().get(i).getListBlok5A().get(14).setInt(b5.get(i).getB5AR9B3());
            k.getListHal3().get(i).getListBlok5A().get(15).setInt(b5.get(i).getB5AR9B3Lain());
            k.getListHal3().get(i).getListBlok5A().get(16).setInt(b5.get(i).getB5AR10());
            k.getListHal3().get(i).getListBlok5A().get(17).setInt(b5.get(i).getB5AR11A());
            k.getListHal3().get(i).getListBlok5A().get(18).setInt(b5.get(i).getB5AR11B());
            k.getListHal3().get(i).getListBlok5A().get(19).setInt(b5.get(i).getB5AR11C());
            k.getListHal3().get(i).getListBlok5A().get(20).setInt(b5.get(i).getB5AR11D());
            k.getListHal3().get(i).getListBlok5A().get(21).setInt(b5.get(i).getB5AR11E());
            k.getListHal3().get(i).getListBlok5A().get(22).setInt(b5.get(i).getB5AR11F());
            k.getListHal3().get(i).getListBlok5A().get(23).setInt(b5.get(i).getB5AR11G());
            k.getListHal3().get(i).getListBlok5A().get(24).setInt(b5.get(i).getB5AR11H());
            k.getListHal3().get(i).getListBlok5A().get(25).setInt(b5.get(i).getB5AR11Lain());
            k.getListHal3().get(i).getListBlok5A().get(26).setInt(b5.get(i).getB5AR12());
            k.getListHal3().get(i).getListBlok5A().get(27).setInt(b5.get(i).getB5AR13A());
            k.getListHal3().get(i).getListBlok5A().get(28).setInt(b5.get(i).getB5AR13B());
            k.getListHal3().get(i).getListBlok5A().get(29).setInt(b5.get(i).getB5AR13C());
            k.getListHal3().get(i).getListBlok5A().get(30).setInt(b5.get(i).getB5AR13D());
            k.getListHal3().get(i).getListBlok5A().get(31).setInt(b5.get(i).getB5AR13E());
            k.getListHal3().get(i).getListBlok5A().get(32).setInt(b5.get(i).getB5AR13F());
            k.getListHal3().get(i).getListBlok5A().get(33).setInt(b5.get(i).getB5AR13Lain());
            //set Blok 5C
            //cari data blok 5c yang sesuai dg no urut
//            if(k.getHalaman2().getListHalaman2().get(i).get(3).getInt()>=5){
                for(int j=0;j<b5c.size();j++){
                    if(b5c.get(j).getNO_URUT()==i+1){
                        k.getListHal3().get(i).getListBlok5C().get(0).setInt(b5c.get(j).getB5CR19());
                        k.getListHal3().get(i).getListBlok5C().get(1).setInt(b5c.get(j).getB5CR20());
                        k.getListHal3().get(i).getListBlok5C().get(2).setInt(b5c.get(j).getB5CR21());
                        k.getListHal3().get(i).getListBlok5C().get(3).setInt(b5c.get(j).getB5CR22A());
                        k.getListHal3().get(i).getListBlok5C().get(4).setInt(b5c.get(j).getB5CR22B());
                        break;
                    }
                }
//            }
//            if(k.getHalaman2().getListHalaman2().get(i).get(3).getInt()>14){
                for(int j=0;j<b5d.size();j++){
                    if(b5d.get(j).getNO_URUT()==i+1){
                        k.getListHal3().get(i).getListBlok5D().get(0).setInt(b5d.get(j).getB5DR23_1());
                        k.getListHal3().get(i).getListBlok5D().get(1).setInt(b5d.get(j).getB5DR23_2());
                        k.getListHal3().get(i).getListBlok5D().get(2).setInt(b5d.get(j).getB5DR23_3());
                        k.getListHal3().get(i).getListBlok5D().get(3).setInt(b5d.get(j).getB5DR23_4());
                        k.getListHal3().get(i).getListBlok5D().get(4).setInt(b5d.get(j).getB5DR23_5());
                        k.getListHal3().get(i).getListBlok5D().get(5).setInt(b5d.get(j).getB5DR23Lain());
                        k.getListHal3().get(i).getListBlok5D().get(6).setInt(b5d.get(j).getB5DR24());
                        k.getListHal3().get(i).getListBlok5D().get(7).setInt(b5d.get(j).getB5DR25());
                        k.getListHal3().get(i).getListBlok5D().get(8).setText(b5d.get(j).getB5DR25Lengkap());
                        k.getListHal3().get(i).getListBlok5D().get(9).setInt(b5d.get(j).getB5DR26a());
                        k.getListHal3().get(i).getListBlok5D().get(10).setInt(b5d.get(j).getB5DR26b());
                        k.getListHal3().get(i).getListBlok5D().get(11).setInt(b5d.get(j).getB5DR26c());
                        k.getListHal3().get(i).getListBlok5D().get(12).setInt(b5d.get(j).getB5DR26d());
                        k.getListHal3().get(i).getListBlok5D().get(13).setInt(b5d.get(j).getB5DR27A());
                        k.getListHal3().get(i).getListBlok5D().get(14).setInt(b5d.get(j).getB5DR27ALS());
                        k.getListHal3().get(i).getListBlok5D().get(15).setInt(b5d.get(j).getB5DR27B());
                        k.getListHal3().get(i).getListBlok5D().get(16).setInt(b5d.get(j).getB5DR27BLain());
                        k.getListHal3().get(i).getListBlok5D().get(17).setInt(b5d.get(j).getB5DR27C());
                        k.getListHal3().get(i).getListBlok5D().get(18).setInt(b5d.get(j).getB5DR27D());
                        k.getListHal3().get(i).getListBlok5D().get(19).setInt(b5d.get(j).getB5DR27E1());
                        k.getListHal3().get(i).getListBlok5D().get(20).setInt(b5d.get(j).getB5DR27E2());
                        k.getListHal3().get(i).getListBlok5D().get(21).setInt(b5d.get(j).getB5DR27E3());
                        k.getListHal3().get(i).getListBlok5D().get(22).setInt(b5d.get(j).getB5DR27E4());
                        k.getListHal3().get(i).getListBlok5D().get(23).setInt(b5d.get(j).getB5DR27E5());
                        k.getListHal3().get(i).getListBlok5D().get(24).setInt(b5d.get(j).getB5DR27E5Lain());
                        k.getListHal3().get(i).getListBlok5D().get(25).setInt(b5d.get(j).getB5DR28());
                        k.getListHal3().get(i).getListBlok5D().get(26).setInt(b5d.get(j).getB5DR28Lain());
                        k.getListHal3().get(i).getListBlok5D().get(27).setInt(b5d.get(j).getB5DR29A());
                        k.getListHal3().get(i).getListBlok5D().get(28).setInt(b5d.get(j).getB5DR29ALS());
                        k.getListHal3().get(i).getListBlok5D().get(29).setInt(b5d.get(j).getB5DR29B1());
                        k.getListHal3().get(i).getListBlok5D().get(30).setInt(b5d.get(j).getB5DR29B2());
                        k.getListHal3().get(i).getListBlok5D().get(31).setInt(b5d.get(j).getB5DR29B3());
                        k.getListHal3().get(i).getListBlok5D().get(32).setInt(b5d.get(j).getB5DR29B4());
                        k.getListHal3().get(i).getListBlok5D().get(33).setInt(b5d.get(j).getB5DR29BLain());
                        k.getListHal3().get(i).getListBlok5E().get(0).setInt(b5d.get(j).getB5ER30A());
                        k.getListHal3().get(i).getListBlok5E().get(1).setInt(b5d.get(j).getB5ER30ALS());
                        k.getListHal3().get(i).getListBlok5E().get(2).setInt(b5d.get(j).getB5ER30B());
                        k.getListHal3().get(i).getListBlok5E().get(3).setText(b5d.get(j).getB5ER30C1());
                        k.getListHal3().get(i).getListBlok5E().get(4).setText(b5d.get(j).getB5ER30C2());
                        k.getListHal3().get(i).getListBlok5E().get(5).setText(b5d.get(j).getB5ER30C3());
                        break;
                    }
                }
//            }
        }
        //set untuk umur < 4th
        for(int i=0;i<k.getHalaman1().getListHalaman1().get(9).getInt();i++){
//            if(k.getHalaman2().getListHalaman2().get(i).get(3).getInt().intValue()<5){
                //mencari data bayi yang sesuai dengan no urut
                for(int j=0;j<b5b.size();j++){
                    if(b5b.get(j).getNO_URUT().intValue()==i+1){
                        k.getListHal3().get(i).getListBlok5B().get(0).setText(b5b.get(j).getB5BR14A());
                        k.getListHal3().get(i).getListBlok5B().get(1).setText(b5b.get(j).getB5BR14B());
                        k.getListHal3().get(i).getListBlok5B().get(2).setText(b5b.get(j).getB5BR14C());
                        k.getListHal3().get(i).getListBlok5B().get(3).setInt(b5b.get(j).getB5BR15A());
                        k.getListHal3().get(i).getListBlok5B().get(4).setInt(b5b.get(j).getB5BR15B());
                        k.getListHal3().get(i).getListBlok5B().get(5).setInt(b5b.get(j).getB5BR16());
                        k.getListHal3().get(i).getListBlok5B().get(6).setInt(b5b.get(j).getB5BR16Lain());
                        k.getListHal3().get(i).getListBlok5B().get(7).setInt(b5b.get(j).getB5BR17_1());
                        k.getListHal3().get(i).getListBlok5B().get(8).setInt(b5b.get(j).getB5BR17_2());
                        k.getListHal3().get(i).getListBlok5B().get(9).setInt(b5b.get(j).getB5BR17_3());
                        k.getListHal3().get(i).getListBlok5B().get(10).setInt(b5b.get(j).getB5BR17_4());
                        k.getListHal3().get(i).getListBlok5B().get(11).setInt(b5b.get(j).getB5BR17_5());
                        k.getListHal3().get(i).getListBlok5B().get(12).setInt(b5b.get(j).getB5BR17_6());
                        k.getListHal3().get(i).getListBlok5B().get(13).setInt(b5b.get(j).getB5BR17_6Lain());
                        k.getListHal3().get(i).getListBlok5B().get(14).setInt(b5b.get(j).getB5BR18A());
                        k.getListHal3().get(i).getListBlok5B().get(15).setInt(b5b.get(j).getB5BR18B1());
                        k.getListHal3().get(i).getListBlok5B().get(16).setInt(b5b.get(j).getB5BR18B2());
                        k.getListHal3().get(i).getListBlok5B().get(17).setInt(b5b.get(j).getB5BR18B3());
                        break;
                    }
                }
//            }
        }

        for(int i=0;i<k.getHalaman1().getListHalaman1().get(9).getInt();i++){
            for(int j=0;j<k.getListHal3().get(i).getListBlok5().size();j++){
                if(k.getListHal3().get(i).getListBlok5().get(j).getText().equals(""))
                    k.getListHal3().get(i).getListBlok5().get(j).setEnabled(false);
                else
                    k.getListHal3().get(i).getListBlok5().get(j).setContain(true);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5A().size();j++){
                if(k.getListHal3().get(i).getListBlok5A().get(j).getText().equals(""))
                    k.getListHal3().get(i).getListBlok5A().get(j).setEnabled(false);
                else
                    k.getListHal3().get(i).getListBlok5A().get(j).setContain(true);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5B().size();j++){
                if(k.getListHal3().get(i).getListBlok5B().get(j).getText().equals(""))
                    k.getListHal3().get(i).getListBlok5B().get(j).setEnabled(false);
                else
                    k.getListHal3().get(i).getListBlok5B().get(j).setContain(true);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5C().size();j++){
                if(k.getListHal3().get(i).getListBlok5C().get(j).getText().equals(""))
                    k.getListHal3().get(i).getListBlok5C().get(j).setEnabled(false);
                else
                    k.getListHal3().get(i).getListBlok5C().get(j).setContain(true);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5D().size();j++){
                if(k.getListHal3().get(i).getListBlok5D().get(j).getText().equals(""))
                    k.getListHal3().get(i).getListBlok5D().get(j).setEnabled(false);
                else
                    k.getListHal3().get(i).getListBlok5D().get(j).setContain(true);
            }
            for(int j=0;j<k.getListHal3().get(i).getListBlok5E().size();j++){
                if(k.getListHal3().get(i).getListBlok5E().get(j).getText().equals(""))
                    k.getListHal3().get(i).getListBlok5E().get(j).setEnabled(false);
                else
                    k.getListHal3().get(i).getListBlok5E().get(j).setContain(true);
            }
        }
    }
    private static void setHalaman4(PanelKuesioner k, Blok6 b6){
            k.getHalaman4().getListBlok6().get(0).setInt(b6.getB6R1());
            k.getHalaman4().getListBlok6().get(1).setInt(b6.getB6R1BTanah());
            k.getHalaman4().getListBlok6().get(2).setInt(b6.getB6R2());
            k.getHalaman4().getListBlok6().get(3).setInt(b6.getB6R3A());
            k.getHalaman4().getListBlok6().get(4).setInt(b6.getB6R3B());
            k.getHalaman4().getListBlok6().get(5).setInt(b6.getB6R4());
            k.getHalaman4().getListBlok6().get(6).setInt(b6.getB6R5());
            k.getHalaman4().getListBlok6().get(7).setInt(b6.getB6R5Lain());
            k.getHalaman4().getListBlok6().get(8).setInt(b6.getB6R6());
            k.getHalaman4().getListBlok6().get(9).setInt(b6.getB6R6Lain());
            k.getHalaman4().getListBlok6().get(10).setInt(b6.getB6R7());
            k.getHalaman4().getListBlok6().get(11).setInt(b6.getB6R8());
            k.getHalaman4().getListBlok6().get(12).setInt(b6.getB6R9());
            k.getHalaman4().getListBlok6().get(13).setInt(b6.getB6R10());
            k.getHalaman4().getListBlok6().get(14).setInt(b6.getB6R11());
            k.getHalaman4().getListBlok6().get(15).setInt(b6.getB6R12());
            k.getHalaman4().getListBlok6().get(16).setInt(b6.getB6R12Lain());
            k.getHalaman4().getListBlok6().get(17).setInt(b6.getB6R13());
            k.getHalaman4().getListBlok6().get(18).setInt(b6.getB6R14A());
            k.getHalaman4().getListBlok6().get(19).setInt(b6.getB6R14B());
            k.getHalaman4().getListBlok6().get(20).setInt(b6.getB6R14C1());
            k.getHalaman4().getListBlok6().get(21).setInt(b6.getB6R14C2());
            k.getHalaman4().getListBlok6().get(22).setInt(b6.getB6R14C3());


            for(int i=0;i<k.getHalaman4().getListBlok6().size();i++){
                if(k.getHalaman4().getListBlok6().get(i).getText().equals("")){
                    k.getHalaman4().getListBlok6().get(i).setEnabled(false);
                }else{
                    k.getHalaman4().getListBlok6().get(i).setContain(true);
                }
            }
    }
    private static void setHalaman5(PanelKuesioner k, Blok7a b7a){
        k.getHalaman5().getListBlok7A().get(0).setInt(b7a.getB7AR1A());
        k.getHalaman5().getListBlok7A().get(1).setInt(b7a.getB7AR1B());
        k.getHalaman5().getListBlok7A().get(2).setInt(b7a.getB7AR2());
        k.getHalaman5().getListBlok7A().get(3).setInt(b7a.getB7AR3A());
        k.getHalaman5().getListBlok7A().get(4).setInt(b7a.getB7AR3B());
        k.getHalaman5().getListBlok7A().get(5).setInt(b7a.getB7AR4());
        k.getHalaman5().getListBlok7A().get(6).setInt(b7a.getB7AR5A());
        k.getHalaman5().getListBlok7A().get(7).setInt(b7a.getB7AR5B());
        k.getHalaman5().getListBlok7A().get(8).setInt(b7a.getB7AR6());
        k.getHalaman5().getListBlok7A().get(9).setInt(b7a.getB7AR7());
        k.getHalaman5().getListBlok7A().get(10).setInt(b7a.getB7AR8());
        k.getHalaman5().getListBlok7A().get(11).setInt(b7a.getB7AR9());
        k.getHalaman5().getListBlok7A().get(12).setInt(b7a.getB7AR10());
        k.getHalaman5().getListBlok7A().get(13).setInt(b7a.getB7AR11());
        k.getHalaman5().getListBlok7A().get(14).setInt(b7a.getB7AR12A());
        k.getHalaman5().getListBlok7A().get(15).setInt(b7a.getB7AR12B());
        k.getHalaman5().getListBlok7A().get(16).setInt(b7a.getB7AR13A());
        k.getHalaman5().getListBlok7A().get(17).setInt(b7a.getB7AR13B());
        k.getHalaman5().getListBlok7A().get(18).setInt(b7a.getB7AR13C());
        k.getHalaman5().getListBlok7A().get(19).setInt(b7a.getB7AR14A());
        k.getHalaman5().getListBlok7A().get(20).setInt(b7a.getB7AR14B());
        k.getHalaman5().getListBlok7A().get(21).setInt(b7a.getB7AR15());
        for(int j=0;j<22;j++){
            if(!k.getHalaman5().getListBlok7A().get(j).getText().equals("")){
                k.getHalaman5().getListBlok7A().get(j).setContain(true);
            }
            setFormatInt(k.getHalaman5().getListBlok7A().get(j));
        }
    }
    private static void setHalaman6(PanelKuesioner k, Blok7b b7b){
        k.getHalaman6().getListBlok7B().get(0).setInt(b7b.getB7BR16A2());
        k.getHalaman6().getListBlok7B().get(1).setInt(b7b.getB7BR16A3());
        k.getHalaman6().getListBlok7B().get(2).setInt(b7b.getB7BR16B2());
        k.getHalaman6().getListBlok7B().get(3).setInt(b7b.getB7BR16B3());
        k.getHalaman6().getListBlok7B().get(4).setInt(b7b.getB7BR16C2());
        k.getHalaman6().getListBlok7B().get(5).setInt(b7b.getB7BR16C3());
        k.getHalaman6().getListBlok7B().get(6).setInt(b7b.getB7BR16D2());
        k.getHalaman6().getListBlok7B().get(7).setInt(b7b.getB7BR16D3());
        k.getHalaman6().getListBlok7B().get(8).setInt(b7b.getB7BR17A2());
        k.getHalaman6().getListBlok7B().get(9).setInt(b7b.getB7BR17A3());
        k.getHalaman6().getListBlok7B().get(10).setInt(b7b.getB7BR17B2());
        k.getHalaman6().getListBlok7B().get(11).setInt(b7b.getB7BR17B3());
        k.getHalaman6().getListBlok7B().get(12).setInt(b7b.getB7BR17C2());
        k.getHalaman6().getListBlok7B().get(13).setInt(b7b.getB7BR17C3());
        k.getHalaman6().getListBlok7B().get(14).setInt(b7b.getB7BR17D2());
        k.getHalaman6().getListBlok7B().get(15).setInt(b7b.getB7BR17D3());
        k.getHalaman6().getListBlok7B().get(16).setInt(b7b.getB7BR17E2());
        k.getHalaman6().getListBlok7B().get(17).setInt(b7b.getB7BR17E3());
        k.getHalaman6().getListBlok7B().get(18).setInt(b7b.getB7BR18_2());
        k.getHalaman6().getListBlok7B().get(19).setInt(b7b.getB7BR18_3());
        k.getHalaman6().getListBlok7B().get(20).setInt(b7b.getB7BR19_2());
        k.getHalaman6().getListBlok7B().get(21).setInt(b7b.getB7BR19_3());
        k.getHalaman6().getListBlok7B().get(22).setInt(b7b.getB7BR20A2());
        k.getHalaman6().getListBlok7B().get(23).setInt(b7b.getB7BR20A3());
        k.getHalaman6().getListBlok7B().get(24).setInt(b7b.getB7BR20B2());
        k.getHalaman6().getListBlok7B().get(25).setInt(b7b.getB7BR20B3());
        k.getHalaman6().getListBlok7B().get(26).setInt(b7b.getB7BR20C2());
        k.getHalaman6().getListBlok7B().get(27).setInt(b7b.getB7BR20C3());
        k.getHalaman6().getListBlok7B().get(28).setInt(b7b.getB7BR20D2());
        k.getHalaman6().getListBlok7B().get(29).setInt(b7b.getB7BR20D3());
        k.getHalaman6().getListBlok7B().get(30).setInt(b7b.getB7BR21_2());
        k.getHalaman6().getListBlok7B().get(31).setInt(b7b.getB7BR21_3());
        k.getHalaman6().getListBlok7B().get(32).setInt(b7b.getB7BR22_2());
        k.getHalaman6().getListBlok7B().get(33).setInt(b7b.getB7BR22_3());
        k.getHalaman6().getListBlok7B().get(34).setText(b7b.getB7BR23().toString());
        k.getHalaman6().getListBlok7B().get(35).setText(b7b.getB7BR24().toString());
        k.getHalaman6().getListBlok7B().get(36).setText(b7b.getB7BR25().toString());
        for(int j=0;j<37;j++){
            if(!k.getHalaman6().getListBlok7B().get(j).getText().equals("")){
                k.getHalaman6().getListBlok7B().get(j).setContain(true);
            }
            if(j<34)
                setFormatInt(k.getHalaman6().getListBlok7B().get(j));
        }
    }
    private static void setHalaman7(PanelKuesioner k, List<Blok8a1> b8a1, Blok8a2 b8a2, List<Blok8a3> b8a3, List<Blok8a4> b8a4, List<Blok8a5> b8a5){
        //setKolom2
        for(int i=0;i<k.getHalaman1().getListHalaman1().get(9).getInt();i++){
            k.getHalaman7().getListBlok8AKol2().get(i).setInt(b8a1.get(i).getB8AK2());
        }
        //setKolom 5
        for(int i=0;i<b8a5.size();i++){
            int noUrut = b8a5.get(i).getNO_URUT()-1;
            k.getHalaman7().getListBlok8AKol5().get(noUrut).get(0).setInt(b8a5.get(i).getB8AK5());
            k.getHalaman7().getListBlok8AKol5().get(noUrut).get(1).setInt(b8a5.get(i).getB8AK5ALS());
        }
        //setKolom 6
        for(int i=0;i<b8a3.size();i++){
            int no = b8a3.get(i).getNO_URUT()-1;
            k.getHalaman7().getListBlok8AKol5().get(no).get(2).setInt(b8a3.get(i).getB8AK6());
            k.getHalaman7().getListBlok8AKol5().get(no).get(3).setInt(b8a3.get(i).getB8AK7());
            k.getHalaman7().getListBlok8AKol5().get(no).get(4).setInt(b8a3.get(i).getB8AK8());
            k.getHalaman7().getListBlok8AKol5().get(no).get(5).setInt(b8a3.get(i).getB8AK9());
            k.getHalaman7().getListBlok8AKol5().get(no).get(6).setInt(b8a3.get(i).getB8AK10());
            k.getHalaman7().getListBlok8AKol5().get(no).get(7).setInt(b8a3.get(i).getB8AK11());
        }
        //setKolom13
        for(int i=0;i<b8a4.size();i++){
            int no = b8a4.get(i).getNO_URUT()-1;
            k.getHalaman7().getListBlok8AKol13().get(no).get(0).setInt(b8a4.get(i).getB8AK13());
            k.getHalaman7().getListBlok8AKol13().get(no).get(1).setInt(b8a4.get(i).getB8AK13ALS());
        }
        //setBaris26
        k.getHalaman7().getListBaris26().get(0).setInt(b8a2.getB8AK3());
        k.getHalaman7().getListBaris26().get(1).setInt(b8a2.getB8AK3Lain());
        k.getHalaman7().getListBaris26().get(2).setInt(b8a2.getB8AK4());
        k.getHalaman7().getListBaris26().get(3).setInt(b8a2.getB8AK12());

        //set enable dan warna
        for(int i=0;i<k.getHalaman1().getListHalaman1().get(9).getInt();i++){
            //set warna kol 2
            k.getHalaman7().getListBlok8AKol2().get(i).setContain(true);
            
            for(int j=0;j<8;j++){
                if(!k.getHalaman7().getListBlok8AKol5().get(i).get(j).getText().equals(""))
                    k.getHalaman7().getListBlok8AKol5().get(i).get(j).setContain(true);
                else
                    k.getHalaman7().getListBlok8AKol5().get(i).get(j).setEnabled(false);
            }
            for(int j=0;j<2;j++){
                if(!k.getHalaman7().getListBlok8AKol13().get(i).get(j).getText().equals(""))
                    k.getHalaman7().getListBlok8AKol13().get(i).get(j).setContain(true);
                else
                    k.getHalaman7().getListBlok8AKol13().get(i).get(j).setEnabled(false);
            }
        }
        for(int j=0;j<4;j++){
            if(!k.getHalaman7().getListBaris26().get(j).getText().equals("")){
                k.getHalaman7().getListBaris26().get(j).setContain(true);
            }else
                k.getHalaman7().getListBaris26().get(j).setEnabled(false);
        }
    }
    private static void setHalaman8(PanelKuesioner k, List<Blok8b> b8b){
        for(int i=0;i<b8b.size();i++){
            k.getListHal8().get(i).getListBlok8B().get(0).setText(k.getHalaman2().getListHalaman2().get(b8b.get(i).getNO_URUT()-1).get(0).getText());
            k.getListHal8().get(i).getListBlok8B().get(1).setInt(b8b.get(i).getNO_URUT());
            k.getListHal8().get(i).getListBlok8B().get(2).setInt(b8b.get(i).getB8BR1());
            k.getListHal8().get(i).getListBlok8B().get(3).setInt(b8b.get(i).getB8BR2());
            k.getListHal8().get(i).getListBlok8B().get(4).setInt(b8b.get(i).getB8BR3());
            k.getListHal8().get(i).getListBlok8B().get(5).setInt(b8b.get(i).getB8BR4());
            k.getListHal8().get(i).getListBlok8B().get(6).setInt(b8b.get(i).getB8BR5());
            k.getListHal8().get(i).getListBlok8B().get(7).setInt(b8b.get(i).getB8BR6());
            k.getListHal8().get(i).getListBlok8B().get(8).setInt(b8b.get(i).getB8BR7());
            k.getListHal8().get(i).getListBlok8B().get(9).setInt(b8b.get(i).getB8BR8());
            k.getListHal8().get(i).getListBlok8B().get(10).setInt(b8b.get(i).getB8BR9());
            k.getListHal8().get(i).getListBlok8B().get(11).setInt(b8b.get(i).getB8BR10());
            k.getListHal8().get(i).getListBlok8B().get(12).setInt(b8b.get(i).getB8BR11());
            k.getListHal8().get(i).getListBlok8B().get(13).setInt(b8b.get(i).getB8BR12());
            k.getListHal8().get(i).getListBlok8B().get(14).setInt(b8b.get(i).getB8BR13());
            k.getListHal8().get(i).getListBlok8B().get(15).setInt(b8b.get(i).getB8BR14());
            k.getListHal8().get(i).getListBlok8B().get(16).setInt(b8b.get(i).getB8BR15());
            k.getListHal8().get(i).getListBlok8B().get(17).setInt(b8b.get(i).getB8BR16());
            for(int j=0;j<k.getListHal8().get(i).getListBlok8B().size();j++){
                k.getListHal8().get(i).getListBlok8B().get(j).setContain(true);
            }
        }
    }
    private static void setHalaman9(PanelKuesioner k, List<Blok8c> b8c){
        for(int i=0;i<b8c.size();i++){
            k.getListHal9().get(i).getListBlok8C().get(0).setText(k.getHalaman2().getListHalaman2().get(b8c.get(i).getNO_URUT()-1).get(0).getText());
            k.getListHal9().get(i).getListBlok8C().get(1).setText(k.getHalaman2().getListHalaman2().get(b8c.get(i).getNO_URUTBAYI()-1).get(0).getText());
            k.getListHal9().get(i).getListBlok8C().get(2).setInt(b8c.get(i).getNO_URUT());
            k.getListHal9().get(i).getListBlok8C().get(3).setInt(b8c.get(i).getNO_URUTBAYI());
            k.getListHal9().get(i).getListBlok8C().get(4).setInt(b8c.get(i).getB8CR1());
            k.getListHal9().get(i).getListBlok8C().get(5).setInt(b8c.get(i).getB8CR2());
            k.getListHal9().get(i).getListBlok8C().get(6).setInt(b8c.get(i).getB8CR3());
            k.getListHal9().get(i).getListBlok8C().get(7).setInt(b8c.get(i).getB8CR4());
            k.getListHal9().get(i).getListBlok8C().get(8).setInt(b8c.get(i).getB8CR5());
            k.getListHal9().get(i).getListBlok8C().get(9).setInt(b8c.get(i).getB8CR6());
            k.getListHal9().get(i).getListBlok8C().get(10).setInt(b8c.get(i).getB8CR7());
            k.getListHal9().get(i).getListBlok8C().get(11).setInt(b8c.get(i).getB8CR8());
            k.getListHal9().get(i).getListBlok8C().get(12).setInt(b8c.get(i).getB8CR9());
            k.getListHal9().get(i).getListBlok8C().get(13).setInt(b8c.get(i).getB8CR10());
            k.getListHal9().get(i).getListBlok8C().get(14).setInt(b8c.get(i).getB8CR11());
            k.getListHal9().get(i).getListBlok8C().get(15).setInt(b8c.get(i).getB8CR12());
            k.getListHal9().get(i).getListBlok8C().get(16).setInt(b8c.get(i).getB8CR13());
            k.getListHal9().get(i).getListBlok8C().get(17).setInt(b8c.get(i).getB8CR14());
            k.getListHal9().get(i).getListBlok8C().get(18).setInt(b8c.get(i).getB8CR15());
            k.getListHal9().get(i).getListBlok8C().get(19).setInt(b8c.get(i).getB8CR16());
            k.getListHal9().get(i).getListBlok8C().get(20).setInt(b8c.get(i).getB8CR17());
            k.getListHal9().get(i).getListBlok8C().get(21).setInt(b8c.get(i).getB8CR18());
            for(int j=0;j<k.getListHal9().get(i).getListBlok8C().size();j++){
                k.getListHal9().get(i).getListBlok8C().get(j).setContain(true);
            }
        }
    }
    /**
     * set kuesioner podes
     * @param kuesionerPodes
     * @param podes
     */
    public static void setHalamanPodes(PanelKuesionerPodes kuesionerPodes,Podes podes){
        String NKD = podes.getNKD();
        String kab = NKD.substring(0, 2);
        String kec = NKD.substring(2, 5);
        String desa = NKD.substring(5);
        kuesionerPodes.getListBlok1().get(0).setText(kab);
        kuesionerPodes.getTxtKab().setText(DataStatic.getTabelKabupaten().get(kab));
        kuesionerPodes.getTxtKecamatan().setText(DataStatic.getTabelKecamatan().get(kec));
        kuesionerPodes.getTxtDesa().setText(DataStatic.getTabelDesa().get(desa));
        kuesionerPodes.getListBlok1().get(1).setText(DataStatic.getTabelStrata().get(kab));
        kuesionerPodes.getListBlok1().get(2).setText(kec);
        kuesionerPodes.getListBlok1().get(3).setText(desa);
        kuesionerPodes.getListBlok1().get(4).setText(podes.getB1R5());
        kuesionerPodes.getListBlok1().get(5).setText(podes.getB1R6());
        kuesionerPodes.getListBlok1().get(6).setText(podes.getB1R7());
        kuesionerPodes.getListBlok2().get(1).setText(podes.getB2R2());
        kuesionerPodes.getListBlok2().get(2).setText(podes.getB2R3());
//        kuesionerPodes.getListBlok2().get(4).setText(podes.getB2R6());
        kuesionerPodes.getListBlok2().get(5).setText(podes.getB2R7());
        kuesionerPodes.getListBlok3().get(0).setInt(podes.getB3R1A());
        kuesionerPodes.getListBlok3().get(1).setInt(podes.getB3R1B());
        kuesionerPodes.getListBlok3().get(2).setInt(podes.getB3R1C());
        kuesionerPodes.getListBlok3().get(3).setInt(podes.getB3R1D());
        kuesionerPodes.getListBlok3().get(4).setInt(podes.getB3R1E());
        kuesionerPodes.getListBlok3().get(5).setInt(podes.getB3R1F());
        kuesionerPodes.getListBlok3().get(6).setInt(podes.getB3R1G());
        kuesionerPodes.getListBlok3().get(7).setInt(podes.getB3R2A1());
        kuesionerPodes.getListBlok3().get(8).setInt(podes.getB3R2A2());
        kuesionerPodes.getListBlok3().get(9).setInt(podes.getB3R2B1());
        kuesionerPodes.getListBlok3().get(10).setInt(podes.getB3R2B2());
        kuesionerPodes.getListBlok3().get(11).setInt(podes.getB3R2C1());
        kuesionerPodes.getListBlok3().get(12).setInt(podes.getB3R2C2());
        kuesionerPodes.getListBlok3().get(13).setInt(podes.getB3R2D1());
        kuesionerPodes.getListBlok3().get(14).setInt(podes.getB3R2D2());
        kuesionerPodes.getListBlok3().get(15).setInt(podes.getB3R2E1());
        kuesionerPodes.getListBlok3().get(16).setInt(podes.getB3R2E2());
        kuesionerPodes.getListBlok3().get(17).setInt(podes.getB3R2F1());
        kuesionerPodes.getListBlok3().get(18).setInt(podes.getB3R2F2());
        kuesionerPodes.getListBlok3().get(19).setInt(podes.getB3R2G1());
        kuesionerPodes.getListBlok3().get(20).setInt(podes.getB3R2G2());
        kuesionerPodes.getListBlok3().get(21).setInt(podes.getB3R3A1());
        kuesionerPodes.getListBlok3().get(22).setInt(podes.getB3R3A2());
        kuesionerPodes.getListBlok3().get(23).setInt(podes.getB3R3A3());
        kuesionerPodes.getListBlok3().get(24).setInt(podes.getB3R3A4());
        kuesionerPodes.getListBlok3().get(25).setInt(podes.getB3R3B1());
        kuesionerPodes.getListBlok3().get(26).setInt(podes.getB3R3B2());
        kuesionerPodes.getListBlok3().get(27).setInt(podes.getB3R3B3());
        kuesionerPodes.getListBlok3().get(28).setInt(podes.getB3R3B4());
        kuesionerPodes.getListBlok3().get(29).setInt(podes.getB3R3C1());
        kuesionerPodes.getListBlok3().get(30).setInt(podes.getB3R3C2());
        kuesionerPodes.getListBlok3().get(31).setInt(podes.getB3R3C3());
        kuesionerPodes.getListBlok3().get(32).setInt(podes.getB3R3C4());
        kuesionerPodes.getListBlok3().get(33).setInt(podes.getB3R3D1());
        kuesionerPodes.getListBlok3().get(34).setInt(podes.getB3R3D2());
        kuesionerPodes.getListBlok3().get(35).setInt(podes.getB3R3D3());
        kuesionerPodes.getListBlok3().get(36).setInt(podes.getB3R3D4());
        kuesionerPodes.getListBlok3().get(37).setInt(podes.getB3R3E1());
        kuesionerPodes.getListBlok3().get(38).setInt(podes.getB3R3E2());
        kuesionerPodes.getListBlok3().get(39).setInt(podes.getB3R3E3());
        kuesionerPodes.getListBlok3().get(40).setInt(podes.getB3R3E4());
        kuesionerPodes.getListBlok3().get(41).setInt(podes.getB3R3F1());
        kuesionerPodes.getListBlok3().get(42).setInt(podes.getB3R3F2());
        kuesionerPodes.getListBlok3().get(43).setInt(podes.getB3R3F3());
        kuesionerPodes.getListBlok3().get(44).setInt(podes.getB3R3F4());
        kuesionerPodes.getListBlok3().get(45).setInt(podes.getB3R3G1());
        kuesionerPodes.getListBlok3().get(46).setInt(podes.getB3R3G2());
        kuesionerPodes.getListBlok3().get(47).setInt(podes.getB3R3G3());
        kuesionerPodes.getListBlok3().get(48).setInt(podes.getB3R3G4());
        kuesionerPodes.getListBlok3().get(49).setInt(podes.getB3R4A());
        kuesionerPodes.getListBlok3().get(50).setInt(podes.getB3R4B());
        kuesionerPodes.getListBlok3().get(51).setInt(podes.getB3R4C());
        kuesionerPodes.getListBlok3().get(52).setInt(podes.getB3R4D1());
        kuesionerPodes.getListBlok3().get(53).setInt(podes.getB3R4D2());
        kuesionerPodes.getListBlok3().get(54).setInt(podes.getB3R4DLain());
        kuesionerPodes.getListBlok3().get(55).setInt(podes.getB3R4AAlasan());
        kuesionerPodes.getListBlok3().get(56).setInt(podes.getB3R4BAlasan());

        for(int i=0;i<kuesionerPodes.getListBlok3().size();i++){
            if(kuesionerPodes.getListBlok3().get(i).getText().equals("")){
               kuesionerPodes.getListBlok3().get(i).setEnabled(false);
            }else{
                kuesionerPodes.getListBlok3().get(i).setContain(true);
            }

        }
        for(int i=0;i<kuesionerPodes.getListBlok1().size();i++){
            if(kuesionerPodes.getListBlok1().get(i).getText().equals("")){
               kuesionerPodes.getListBlok1().get(i).setEnabled(false);
            }else{
                kuesionerPodes.getListBlok1().get(i).setContain(true);
            }

        }
        for(int i=0;i<kuesionerPodes.getListBlok2().size();i++){
            if(kuesionerPodes.getListBlok2().get(i).getText().equals("")){
               kuesionerPodes.getListBlok2().get(i).setEnabled(false);
            }else{
                kuesionerPodes.getListBlok2().get(i).setContain(true);
            }

        }
    }

    private static void setFormatInt(TextField t){
        try {
            t.commitEdit();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        t.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("#,##0"))));
    }
    private static void setFormatDouble(TextField t){
        try {
            t.commitEdit();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        t.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat("#,##0.##"))));
    }

}