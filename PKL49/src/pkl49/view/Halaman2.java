/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tabel.java
 *
 * Created on 11 Jan 10, 6:31:28
 */

package pkl49.view;

import pkl49.component.TextField;
import java.util.*;
/**
 *
 * @author Ken
 */
public class Halaman2 extends javax.swing.JPanel {
    private List<TextField> baris1,baris2,baris3,baris4,baris5,baris6,baris7,baris8;
    private List<TextField> baris9,baris10,baris11,baris12,baris13,baris14,baris15,baris16,baris17,baris18,baris19;
    private List<TextField> baris20,baris21,baris22,baris23,baris24,baris25;
    private  List<List<TextField>> listHalaman2;
    /** Creates new form Tabel */
   public Halaman2() {
        initComponents();
        addList();
        for(int i=0;i<listHalaman2.size();i++){
            for(int j=0;j<listHalaman2.get(i).size();j++){
                listHalaman2.get(i).get(0).setCharType(2);
                listHalaman2.get(i).get(0).setLength(30);
                listHalaman2.get(i).get(4).setMinDigit('1');
                listHalaman2.get(i).get(4).setMaxDigit('3');
                listHalaman2.get(i).get(5).setMinDigit('1');
                listHalaman2.get(i).get(5).setMaxDigit('4');
                listHalaman2.get(i).get(6).setMinDigit('1');
                listHalaman2.get(i).get(6).setMaxDigit('8');
                listHalaman2.get(i).get(7).setMinDigit('1');
                listHalaman2.get(i).get(7).setMaxDigit('8');
            }
        }

    }
    public void addList(){
         baris1=new ArrayList<TextField>();
         baris2=new ArrayList<TextField>();
         baris3=new ArrayList<TextField>();
         baris4=new ArrayList<TextField>();
         baris5=new ArrayList<TextField>();
         baris6=new ArrayList<TextField>();
         baris7=new ArrayList<TextField>();
         baris8=new ArrayList<TextField>();
         baris9=new ArrayList<TextField>();
        baris10=new ArrayList<TextField>();
        baris11=new ArrayList<TextField>();
        baris12=new ArrayList<TextField>();
        baris13=new ArrayList<TextField>();
        baris14=new ArrayList<TextField>();
        baris15=new ArrayList<TextField>();
        baris16=new ArrayList<TextField>();
        baris17=new ArrayList<TextField>();
        baris18=new ArrayList<TextField>();
        baris19=new ArrayList<TextField>();
        baris20=new ArrayList<TextField>();
        baris21=new ArrayList<TextField>();
        baris22=new ArrayList<TextField>();
        baris23=new ArrayList<TextField>();
        baris24=new ArrayList<TextField>();
        baris25=new ArrayList<TextField>();

         listHalaman2=new ArrayList<List<TextField>>();

        baris1.add(txtB4K2_1);
        baris1.add(txtB4K3_1);
        baris1.add(txtB4K4_1);
        baris1.add(txtB4K5_1);
        baris1.add(txtB4K6_1);
        baris1.add(txtB4K7_1);
        baris1.add(txtB4K8_1);
        baris1.add(txtB4K9_1);
        baris2.add(txtB4K2_2);
        baris2.add(txtB4K3_2);
        baris2.add(txtB4K4_2);
        baris2.add(txtB4K5_2);
        baris2.add(txtB4K6_2);
        baris2.add(txtB4K7_2);
        baris2.add(txtB4K8_2);
        baris2.add(txtB4K9_2);

        baris3.add(txtB4K2_3);
        baris3.add(txtB4K3_3);
        baris3.add(txtB4K4_3);
        baris3.add(txtB4K5_3);
        baris3.add(txtB4K6_3);
        baris3.add(txtB4K7_3);
        baris3.add(txtB4K8_3);
        baris3.add(txtB4K9_3);

        baris4.add(txtB4K2_4);
        baris4.add(txtB4K3_4);
        baris4.add(txtB4K4_4);
        baris4.add(txtB4K5_4);
        baris4.add(txtB4K6_4);
        baris4.add(txtB4K7_4);
        baris4.add(txtB4K8_4);
        baris4.add(txtB4K9_4);

        baris5.add(txtB4K2_5);
        baris5.add(txtB4K3_5);
        baris5.add(txtB4K4_5);
        baris5.add(txtB4K5_5);
        baris5.add(txtB4K6_5);
        baris5.add(txtB4K7_5);
        baris5.add(txtB4K8_5);
        baris5.add(txtB4K9_5);

        baris6.add(txtB4K2_6);
        baris6.add(txtB4K3_6);
        baris6.add(txtB4K4_6);
        baris6.add(txtB4K5_6);
        baris6.add(txtB4K6_6);
        baris6.add(txtB4K7_6);
        baris6.add(txtB4K8_6);
        baris6.add(txtB4K9_6);

        baris7.add(txtB4K2_7);
        baris7.add(txtB4K3_7);
        baris7.add(txtB4K4_7);
        baris7.add(txtB4K5_7);
        baris7.add(txtB4K6_7);
        baris7.add(txtB4K7_7);
        baris7.add(txtB4K8_7);
        baris7.add(txtB4K9_7);

        baris8.add(txtB4K2_8);
        baris8.add(txtB4K3_8);
        baris8.add(txtB4K4_8);
        baris8.add(txtB4K5_8);
        baris8.add(txtB4K6_8);
        baris8.add(txtB4K7_8);
        baris8.add(txtB4K8_8);
        baris8.add(txtB4K9_8);
            baris9.add(txtB4K2_9);
            baris9.add(txtB4K3_9);
            baris9.add(txtB4K4_9);
            baris9.add(txtB4K5_9);
            baris9.add(txtB4K6_9);
            baris9.add(txtB4K7_9);
            baris9.add(txtB4K8_9);
            baris9.add(txtB4K9_9);
            baris10.add(txtB4K2_10);
            baris10.add(txtB4K3_10);
            baris10.add(txtB4K4_10);
            baris10.add(txtB4K5_10);
            baris10.add(txtB4K6_10);
            baris10.add(txtB4K7_10);
            baris10.add(txtB4K8_10);
            baris10.add(txtB4K9_10);
            baris11.add(txtB4K2_11);
            baris11.add(txtB4K3_11);
            baris11.add(txtB4K4_11);
            baris11.add(txtB4K5_11);
            baris11.add(txtB4K6_11);
            baris11.add(txtB4K7_11);
            baris11.add(txtB4K8_11);
            baris11.add(txtB4K9_11);
            baris12.add(txtB4K2_12);
            baris12.add(txtB4K3_12);
            baris12.add(txtB4K4_12);
            baris12.add(txtB4K5_12);
            baris12.add(txtB4K6_12);
            baris12.add(txtB4K7_12);
            baris12.add(txtB4K8_12);
            baris12.add(txtB4K9_12);
            baris13.add(txtB4K2_13);
            baris13.add(txtB4K3_13);
            baris13.add(txtB4K4_13);
            baris13.add(txtB4K5_13);
            baris13.add(txtB4K6_13);
            baris13.add(txtB4K7_13);
            baris13.add(txtB4K8_13);
            baris13.add(txtB4K9_13);
            baris14.add(txtB4K2_14);
            baris14.add(txtB4K3_14);
            baris14.add(txtB4K4_14);
            baris14.add(txtB4K5_14);
            baris14.add(txtB4K6_14);
            baris14.add(txtB4K7_14);
            baris14.add(txtB4K8_14);
            baris14.add(txtB4K9_14);
            baris15.add(txtB4K2_15);
            baris15.add(txtB4K3_15);
            baris15.add(txtB4K4_15);
            baris15.add(txtB4K5_15);
            baris15.add(txtB4K6_15);
            baris15.add(txtB4K7_15);
            baris15.add(txtB4K8_15);
            baris15.add(txtB4K9_15);
            baris16.add(txtB4K2_16);
            baris16.add(txtB4K3_16);
            baris16.add(txtB4K4_16);
            baris16.add(txtB4K5_16);
            baris16.add(txtB4K6_16);
            baris16.add(txtB4K7_16);
            baris16.add(txtB4K8_16);
            baris16.add(txtB4K9_16);
            baris17.add(txtB4K2_17);
            baris17.add(txtB4K3_17);
            baris17.add(txtB4K4_17);
            baris17.add(txtB4K5_17);
            baris17.add(txtB4K6_17);
            baris17.add(txtB4K7_17);
            baris17.add(txtB4K8_17);
            baris17.add(txtB4K9_17);
            baris18.add(txtB4K2_18);
            baris18.add(txtB4K3_18);
            baris18.add(txtB4K4_18);
            baris18.add(txtB4K5_18);
            baris18.add(txtB4K6_18);
            baris18.add(txtB4K7_18);
            baris18.add(txtB4K8_18);
            baris18.add(txtB4K9_18);
            baris19.add(txtB4K2_19);
            baris19.add(txtB4K3_19);
            baris19.add(txtB4K4_19);
            baris19.add(txtB4K5_19);
            baris19.add(txtB4K6_19);
            baris19.add(txtB4K7_19);
            baris19.add(txtB4K8_19);
            baris19.add(txtB4K9_19);
            baris20.add(txtB4K2_20);
            baris20.add(txtB4K3_20);
            baris20.add(txtB4K4_20);
            baris20.add(txtB4K5_20);
            baris20.add(txtB4K6_20);
            baris20.add(txtB4K7_20);
            baris20.add(txtB4K8_20);
            baris20.add(txtB4K9_20);
            baris21.add(txtB4K2_21);
            baris21.add(txtB4K3_21);
            baris21.add(txtB4K4_21);
            baris21.add(txtB4K5_21);
            baris21.add(txtB4K6_21);
            baris21.add(txtB4K7_21);
            baris21.add(txtB4K8_21);
            baris21.add(txtB4K9_21);
            baris22.add(txtB4K2_22);
            baris22.add(txtB4K3_22);
            baris22.add(txtB4K4_22);
            baris22.add(txtB4K5_22);
            baris22.add(txtB4K6_22);
            baris22.add(txtB4K7_22);
            baris22.add(txtB4K8_22);
            baris22.add(txtB4K9_22);
            baris23.add(txtB4K2_23);
            baris23.add(txtB4K3_23);
            baris23.add(txtB4K4_23);
            baris23.add(txtB4K5_23);
            baris23.add(txtB4K6_23);
            baris23.add(txtB4K7_23);
            baris23.add(txtB4K8_23);
            baris23.add(txtB4K9_23);
            baris24.add(txtB4K2_24);
            baris24.add(txtB4K3_24);
            baris24.add(txtB4K4_24);
            baris24.add(txtB4K5_24);
            baris24.add(txtB4K6_24);
            baris24.add(txtB4K7_24);
            baris24.add(txtB4K8_24);
            baris24.add(txtB4K9_24);
            baris25.add(txtB4K2_25);
            baris25.add(txtB4K3_25);
            baris25.add(txtB4K4_25);
            baris25.add(txtB4K5_25);
            baris25.add(txtB4K6_25);
            baris25.add(txtB4K7_25);
            baris25.add(txtB4K8_25);
            baris25.add(txtB4K9_25);

            listHalaman2.add(baris1);
            listHalaman2.add(baris2);
            listHalaman2.add(baris3);
            listHalaman2.add(baris4);
            listHalaman2.add(baris5);
            listHalaman2.add(baris6);
            listHalaman2.add(baris7);
            listHalaman2.add(baris8);
            listHalaman2.add(baris9);
            listHalaman2.add(baris10);
            listHalaman2.add(baris11);
            listHalaman2.add(baris12);
            listHalaman2.add(baris13);
            listHalaman2.add(baris14);
            listHalaman2.add(baris15);
            listHalaman2.add(baris16);
            listHalaman2.add(baris17);
            listHalaman2.add(baris18);
            listHalaman2.add(baris19);
            listHalaman2.add(baris20);
            listHalaman2.add(baris21);
            listHalaman2.add(baris22);
            listHalaman2.add(baris23);
            listHalaman2.add(baris24);
            listHalaman2.add(baris25);

    }
     public List<List<TextField>> getListHalaman2() {
        return listHalaman2;
    }
    public TextField getTxtB4K2_1() {
        return txtB4K2_1;
    }
    public TextField getTxtB4K3_1() {
        return txtB4K3_1;
    }
    public TextField getTxtB4K4_1() {
        return txtB4K4_1;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        scroolPane1 = new pkl49.component.ScroolPane();
        panelTransparan2 = new pkl49.component.PanelTransparan();
        panelTabel = new pkl49.component.PanelTransparan();
        Header = new pkl49.component.PanelTransparan();
        label1 = new pkl49.component.Label();
        p0 = new pkl49.component.PanelTransparan();
        label2 = new pkl49.component.Label();
        label30 = new pkl49.component.Label();
        p1 = new pkl49.component.PanelTransparan();
        label3 = new pkl49.component.Label();
        p2 = new pkl49.component.PanelTransparan();
        label4 = new pkl49.component.Label();
        label5 = new pkl49.component.Label();
        label6 = new pkl49.component.Label();
        label7 = new pkl49.component.Label();
        label8 = new pkl49.component.Label();
        p3 = new pkl49.component.PanelTransparan();
        label9 = new pkl49.component.Label();
        label10 = new pkl49.component.Label();
        label11 = new pkl49.component.Label();
        label12 = new pkl49.component.Label();
        p4 = new pkl49.component.PanelTransparan();
        label13 = new pkl49.component.Label();
        label14 = new pkl49.component.Label();
        p5 = new pkl49.component.PanelTransparan();
        label18 = new pkl49.component.Label();
        label19 = new pkl49.component.Label();
        p6 = new pkl49.component.PanelTransparan();
        label15 = new pkl49.component.Label();
        label16 = new pkl49.component.Label();
        label17 = new pkl49.component.Label();
        label20 = new pkl49.component.Label();
        p7 = new pkl49.component.PanelTransparan();
        label21 = new pkl49.component.Label();
        label22 = new pkl49.component.Label();
        label24 = new pkl49.component.Label();
        label27 = new pkl49.component.Label();
        p8 = new pkl49.component.PanelTransparan();
        label23 = new pkl49.component.Label();
        label25 = new pkl49.component.Label();
        label26 = new pkl49.component.Label();
        pp5 = new pkl49.component.PanelTransparan();
        label28 = new pkl49.component.Label();
        pR65 = new pkl49.component.PanelTransparan();
        label36 = new pkl49.component.Label();
        pR66 = new pkl49.component.PanelTransparan();
        txtB4K2_1 = new pkl49.component.TextField();
        pR67 = new pkl49.component.PanelTransparan();
        txtB4K3_1 = new pkl49.component.TextField();
        pR68 = new pkl49.component.PanelTransparan();
        txtB4K4_1 = new pkl49.component.TextField();
        pR69 = new pkl49.component.PanelTransparan();
        txtB4K5_1 = new pkl49.component.TextField();
        pR70 = new pkl49.component.PanelTransparan();
        txtB4K6_1 = new pkl49.component.TextField();
        pR71 = new pkl49.component.PanelTransparan();
        txtB4K7_1 = new pkl49.component.TextField();
        pR72 = new pkl49.component.PanelTransparan();
        txtB4K8_1 = new pkl49.component.TextField();
        pR73 = new pkl49.component.PanelTransparan();
        txtB4K9_1 = new pkl49.component.TextField();
        pR74 = new pkl49.component.PanelTransparan();
        label47 = new pkl49.component.Label();
        pR75 = new pkl49.component.PanelTransparan();
        label46 = new pkl49.component.Label();
        pR76 = new pkl49.component.PanelTransparan();
        label45 = new pkl49.component.Label();
        pR77 = new pkl49.component.PanelTransparan();
        label44 = new pkl49.component.Label();
        pR78 = new pkl49.component.PanelTransparan();
        label43 = new pkl49.component.Label();
        pR79 = new pkl49.component.PanelTransparan();
        label42 = new pkl49.component.Label();
        pR80 = new pkl49.component.PanelTransparan();
        label41 = new pkl49.component.Label();
        pR81 = new pkl49.component.PanelTransparan();
        label40 = new pkl49.component.Label();
        pR82 = new pkl49.component.PanelTransparan();
        label37 = new pkl49.component.Label();
        pR83 = new pkl49.component.PanelTransparan();
        label38 = new pkl49.component.Label();
        pR84 = new pkl49.component.PanelTransparan();
        txtB4K2_2 = new pkl49.component.TextField();
        pR85 = new pkl49.component.PanelTransparan();
        txtB4K3_2 = new pkl49.component.TextField();
        pR86 = new pkl49.component.PanelTransparan();
        txtB4K4_2 = new pkl49.component.TextField();
        pR87 = new pkl49.component.PanelTransparan();
        txtB4K5_2 = new pkl49.component.TextField();
        pR88 = new pkl49.component.PanelTransparan();
        txtB4K6_2 = new pkl49.component.TextField();
        pR89 = new pkl49.component.PanelTransparan();
        txtB4K7_2 = new pkl49.component.TextField();
        pR90 = new pkl49.component.PanelTransparan();
        txtB4K8_2 = new pkl49.component.TextField();
        pR91 = new pkl49.component.PanelTransparan();
        txtB4K9_2 = new pkl49.component.TextField();
        pR92 = new pkl49.component.PanelTransparan();
        label39 = new pkl49.component.Label();
        pR93 = new pkl49.component.PanelTransparan();
        txtB4K2_3 = new pkl49.component.TextField();
        pR94 = new pkl49.component.PanelTransparan();
        txtB4K3_3 = new pkl49.component.TextField();
        pR95 = new pkl49.component.PanelTransparan();
        txtB4K4_3 = new pkl49.component.TextField();
        pR96 = new pkl49.component.PanelTransparan();
        txtB4K5_3 = new pkl49.component.TextField();
        pR97 = new pkl49.component.PanelTransparan();
        txtB4K6_3 = new pkl49.component.TextField();
        pR98 = new pkl49.component.PanelTransparan();
        txtB4K7_3 = new pkl49.component.TextField();
        pR99 = new pkl49.component.PanelTransparan();
        txtB4K8_3 = new pkl49.component.TextField();
        pR100 = new pkl49.component.PanelTransparan();
        txtB4K9_3 = new pkl49.component.TextField();
        pR101 = new pkl49.component.PanelTransparan();
        label48 = new pkl49.component.Label();
        pR102 = new pkl49.component.PanelTransparan();
        txtB4K2_4 = new pkl49.component.TextField();
        pR103 = new pkl49.component.PanelTransparan();
        txtB4K3_4 = new pkl49.component.TextField();
        pR104 = new pkl49.component.PanelTransparan();
        txtB4K4_4 = new pkl49.component.TextField();
        pR105 = new pkl49.component.PanelTransparan();
        txtB4K5_4 = new pkl49.component.TextField();
        pR106 = new pkl49.component.PanelTransparan();
        txtB4K6_4 = new pkl49.component.TextField();
        pR107 = new pkl49.component.PanelTransparan();
        txtB4K7_4 = new pkl49.component.TextField();
        pR108 = new pkl49.component.PanelTransparan();
        txtB4K8_4 = new pkl49.component.TextField();
        pR109 = new pkl49.component.PanelTransparan();
        txtB4K9_4 = new pkl49.component.TextField();
        pR110 = new pkl49.component.PanelTransparan();
        label49 = new pkl49.component.Label();
        pR111 = new pkl49.component.PanelTransparan();
        txtB4K2_5 = new pkl49.component.TextField();
        pR112 = new pkl49.component.PanelTransparan();
        txtB4K3_5 = new pkl49.component.TextField();
        pR113 = new pkl49.component.PanelTransparan();
        txtB4K4_5 = new pkl49.component.TextField();
        pR114 = new pkl49.component.PanelTransparan();
        txtB4K5_5 = new pkl49.component.TextField();
        pR115 = new pkl49.component.PanelTransparan();
        txtB4K6_5 = new pkl49.component.TextField();
        pR116 = new pkl49.component.PanelTransparan();
        txtB4K7_5 = new pkl49.component.TextField();
        pR117 = new pkl49.component.PanelTransparan();
        txtB4K8_5 = new pkl49.component.TextField();
        pR118 = new pkl49.component.PanelTransparan();
        txtB4K9_5 = new pkl49.component.TextField();
        pR119 = new pkl49.component.PanelTransparan();
        label50 = new pkl49.component.Label();
        pR120 = new pkl49.component.PanelTransparan();
        txtB4K2_6 = new pkl49.component.TextField();
        pR121 = new pkl49.component.PanelTransparan();
        txtB4K3_6 = new pkl49.component.TextField();
        pR122 = new pkl49.component.PanelTransparan();
        txtB4K4_6 = new pkl49.component.TextField();
        pR123 = new pkl49.component.PanelTransparan();
        txtB4K5_6 = new pkl49.component.TextField();
        pR124 = new pkl49.component.PanelTransparan();
        txtB4K6_6 = new pkl49.component.TextField();
        pR125 = new pkl49.component.PanelTransparan();
        txtB4K7_6 = new pkl49.component.TextField();
        pR126 = new pkl49.component.PanelTransparan();
        txtB4K8_6 = new pkl49.component.TextField();
        pR127 = new pkl49.component.PanelTransparan();
        txtB4K9_6 = new pkl49.component.TextField();
        pR128 = new pkl49.component.PanelTransparan();
        label51 = new pkl49.component.Label();
        pR129 = new pkl49.component.PanelTransparan();
        txtB4K2_7 = new pkl49.component.TextField();
        pR130 = new pkl49.component.PanelTransparan();
        txtB4K3_7 = new pkl49.component.TextField();
        pR131 = new pkl49.component.PanelTransparan();
        txtB4K4_7 = new pkl49.component.TextField();
        pR132 = new pkl49.component.PanelTransparan();
        txtB4K5_7 = new pkl49.component.TextField();
        pR133 = new pkl49.component.PanelTransparan();
        txtB4K6_7 = new pkl49.component.TextField();
        pR134 = new pkl49.component.PanelTransparan();
        txtB4K7_7 = new pkl49.component.TextField();
        pR135 = new pkl49.component.PanelTransparan();
        txtB4K8_7 = new pkl49.component.TextField();
        pR136 = new pkl49.component.PanelTransparan();
        txtB4K9_7 = new pkl49.component.TextField();
        pR137 = new pkl49.component.PanelTransparan();
        label52 = new pkl49.component.Label();
        pR138 = new pkl49.component.PanelTransparan();
        txtB4K2_8 = new pkl49.component.TextField();
        pR139 = new pkl49.component.PanelTransparan();
        txtB4K3_8 = new pkl49.component.TextField();
        pR140 = new pkl49.component.PanelTransparan();
        txtB4K4_8 = new pkl49.component.TextField();
        pR141 = new pkl49.component.PanelTransparan();
        txtB4K5_8 = new pkl49.component.TextField();
        pR142 = new pkl49.component.PanelTransparan();
        txtB4K6_8 = new pkl49.component.TextField();
        pR143 = new pkl49.component.PanelTransparan();
        txtB4K7_8 = new pkl49.component.TextField();
        pR144 = new pkl49.component.PanelTransparan();
        txtB4K8_8 = new pkl49.component.TextField();
        pR145 = new pkl49.component.PanelTransparan();
        txtB4K9_8 = new pkl49.component.TextField();
        pR146 = new pkl49.component.PanelTransparan();
        label53 = new pkl49.component.Label();
        pR147 = new pkl49.component.PanelTransparan();
        txtB4K2_9 = new pkl49.component.TextField();
        pR148 = new pkl49.component.PanelTransparan();
        txtB4K3_9 = new pkl49.component.TextField();
        pR149 = new pkl49.component.PanelTransparan();
        txtB4K4_9 = new pkl49.component.TextField();
        pR150 = new pkl49.component.PanelTransparan();
        txtB4K5_9 = new pkl49.component.TextField();
        pR151 = new pkl49.component.PanelTransparan();
        txtB4K6_9 = new pkl49.component.TextField();
        pR152 = new pkl49.component.PanelTransparan();
        txtB4K7_9 = new pkl49.component.TextField();
        pR153 = new pkl49.component.PanelTransparan();
        txtB4K8_9 = new pkl49.component.TextField();
        pR154 = new pkl49.component.PanelTransparan();
        txtB4K9_9 = new pkl49.component.TextField();
        pR155 = new pkl49.component.PanelTransparan();
        label54 = new pkl49.component.Label();
        pR156 = new pkl49.component.PanelTransparan();
        txtB4K2_10 = new pkl49.component.TextField();
        pR157 = new pkl49.component.PanelTransparan();
        txtB4K3_10 = new pkl49.component.TextField();
        pR158 = new pkl49.component.PanelTransparan();
        txtB4K4_10 = new pkl49.component.TextField();
        pR159 = new pkl49.component.PanelTransparan();
        txtB4K5_10 = new pkl49.component.TextField();
        pR160 = new pkl49.component.PanelTransparan();
        txtB4K6_10 = new pkl49.component.TextField();
        pR161 = new pkl49.component.PanelTransparan();
        txtB4K7_10 = new pkl49.component.TextField();
        pR162 = new pkl49.component.PanelTransparan();
        txtB4K8_10 = new pkl49.component.TextField();
        pR163 = new pkl49.component.PanelTransparan();
        txtB4K9_10 = new pkl49.component.TextField();
        pR164 = new pkl49.component.PanelTransparan();
        label55 = new pkl49.component.Label();
        pR165 = new pkl49.component.PanelTransparan();
        txtB4K2_11 = new pkl49.component.TextField();
        pR166 = new pkl49.component.PanelTransparan();
        txtB4K3_11 = new pkl49.component.TextField();
        pR167 = new pkl49.component.PanelTransparan();
        txtB4K4_11 = new pkl49.component.TextField();
        pR168 = new pkl49.component.PanelTransparan();
        txtB4K5_11 = new pkl49.component.TextField();
        pR169 = new pkl49.component.PanelTransparan();
        txtB4K6_11 = new pkl49.component.TextField();
        pR170 = new pkl49.component.PanelTransparan();
        txtB4K7_11 = new pkl49.component.TextField();
        pR171 = new pkl49.component.PanelTransparan();
        txtB4K8_11 = new pkl49.component.TextField();
        pR172 = new pkl49.component.PanelTransparan();
        txtB4K9_11 = new pkl49.component.TextField();
        pR173 = new pkl49.component.PanelTransparan();
        label56 = new pkl49.component.Label();
        pR174 = new pkl49.component.PanelTransparan();
        txtB4K2_12 = new pkl49.component.TextField();
        pR175 = new pkl49.component.PanelTransparan();
        txtB4K3_12 = new pkl49.component.TextField();
        pR176 = new pkl49.component.PanelTransparan();
        txtB4K4_12 = new pkl49.component.TextField();
        pR177 = new pkl49.component.PanelTransparan();
        txtB4K5_12 = new pkl49.component.TextField();
        pR178 = new pkl49.component.PanelTransparan();
        txtB4K6_12 = new pkl49.component.TextField();
        pR179 = new pkl49.component.PanelTransparan();
        txtB4K7_12 = new pkl49.component.TextField();
        pR180 = new pkl49.component.PanelTransparan();
        txtB4K8_12 = new pkl49.component.TextField();
        pR181 = new pkl49.component.PanelTransparan();
        txtB4K9_12 = new pkl49.component.TextField();
        pR182 = new pkl49.component.PanelTransparan();
        label57 = new pkl49.component.Label();
        pR183 = new pkl49.component.PanelTransparan();
        txtB4K2_13 = new pkl49.component.TextField();
        pR184 = new pkl49.component.PanelTransparan();
        txtB4K3_13 = new pkl49.component.TextField();
        pR185 = new pkl49.component.PanelTransparan();
        txtB4K4_13 = new pkl49.component.TextField();
        pR186 = new pkl49.component.PanelTransparan();
        txtB4K5_13 = new pkl49.component.TextField();
        pR187 = new pkl49.component.PanelTransparan();
        txtB4K6_13 = new pkl49.component.TextField();
        pR188 = new pkl49.component.PanelTransparan();
        txtB4K7_13 = new pkl49.component.TextField();
        pR189 = new pkl49.component.PanelTransparan();
        txtB4K8_13 = new pkl49.component.TextField();
        pR190 = new pkl49.component.PanelTransparan();
        txtB4K9_13 = new pkl49.component.TextField();
        pR191 = new pkl49.component.PanelTransparan();
        label58 = new pkl49.component.Label();
        pR192 = new pkl49.component.PanelTransparan();
        txtB4K2_14 = new pkl49.component.TextField();
        pR193 = new pkl49.component.PanelTransparan();
        txtB4K3_14 = new pkl49.component.TextField();
        pR194 = new pkl49.component.PanelTransparan();
        txtB4K4_14 = new pkl49.component.TextField();
        pR195 = new pkl49.component.PanelTransparan();
        txtB4K5_14 = new pkl49.component.TextField();
        pR196 = new pkl49.component.PanelTransparan();
        txtB4K6_14 = new pkl49.component.TextField();
        pR197 = new pkl49.component.PanelTransparan();
        txtB4K7_14 = new pkl49.component.TextField();
        pR198 = new pkl49.component.PanelTransparan();
        txtB4K8_14 = new pkl49.component.TextField();
        pR199 = new pkl49.component.PanelTransparan();
        txtB4K9_14 = new pkl49.component.TextField();
        pR200 = new pkl49.component.PanelTransparan();
        label59 = new pkl49.component.Label();
        pR201 = new pkl49.component.PanelTransparan();
        txtB4K2_15 = new pkl49.component.TextField();
        pR202 = new pkl49.component.PanelTransparan();
        txtB4K3_15 = new pkl49.component.TextField();
        pR203 = new pkl49.component.PanelTransparan();
        txtB4K4_15 = new pkl49.component.TextField();
        pR204 = new pkl49.component.PanelTransparan();
        txtB4K5_15 = new pkl49.component.TextField();
        pR205 = new pkl49.component.PanelTransparan();
        txtB4K6_15 = new pkl49.component.TextField();
        pR206 = new pkl49.component.PanelTransparan();
        txtB4K7_15 = new pkl49.component.TextField();
        pR207 = new pkl49.component.PanelTransparan();
        txtB4K8_15 = new pkl49.component.TextField();
        pR208 = new pkl49.component.PanelTransparan();
        txtB4K9_15 = new pkl49.component.TextField();
        pR209 = new pkl49.component.PanelTransparan();
        label60 = new pkl49.component.Label();
        pR210 = new pkl49.component.PanelTransparan();
        txtB4K2_16 = new pkl49.component.TextField();
        pR211 = new pkl49.component.PanelTransparan();
        txtB4K3_16 = new pkl49.component.TextField();
        pR212 = new pkl49.component.PanelTransparan();
        txtB4K4_16 = new pkl49.component.TextField();
        pR213 = new pkl49.component.PanelTransparan();
        txtB4K5_16 = new pkl49.component.TextField();
        pR214 = new pkl49.component.PanelTransparan();
        txtB4K6_16 = new pkl49.component.TextField();
        pR215 = new pkl49.component.PanelTransparan();
        txtB4K7_16 = new pkl49.component.TextField();
        pR216 = new pkl49.component.PanelTransparan();
        txtB4K8_16 = new pkl49.component.TextField();
        pR217 = new pkl49.component.PanelTransparan();
        txtB4K9_16 = new pkl49.component.TextField();
        pR218 = new pkl49.component.PanelTransparan();
        label61 = new pkl49.component.Label();
        pR219 = new pkl49.component.PanelTransparan();
        txtB4K2_17 = new pkl49.component.TextField();
        pR220 = new pkl49.component.PanelTransparan();
        txtB4K3_17 = new pkl49.component.TextField();
        pR221 = new pkl49.component.PanelTransparan();
        txtB4K4_17 = new pkl49.component.TextField();
        pR222 = new pkl49.component.PanelTransparan();
        txtB4K5_17 = new pkl49.component.TextField();
        pR223 = new pkl49.component.PanelTransparan();
        txtB4K6_17 = new pkl49.component.TextField();
        pR224 = new pkl49.component.PanelTransparan();
        txtB4K7_17 = new pkl49.component.TextField();
        pR225 = new pkl49.component.PanelTransparan();
        txtB4K8_17 = new pkl49.component.TextField();
        pR226 = new pkl49.component.PanelTransparan();
        txtB4K9_17 = new pkl49.component.TextField();
        pR227 = new pkl49.component.PanelTransparan();
        label62 = new pkl49.component.Label();
        pR228 = new pkl49.component.PanelTransparan();
        txtB4K2_18 = new pkl49.component.TextField();
        pR229 = new pkl49.component.PanelTransparan();
        txtB4K3_18 = new pkl49.component.TextField();
        pR230 = new pkl49.component.PanelTransparan();
        txtB4K4_18 = new pkl49.component.TextField();
        pR231 = new pkl49.component.PanelTransparan();
        txtB4K5_18 = new pkl49.component.TextField();
        pR232 = new pkl49.component.PanelTransparan();
        txtB4K6_18 = new pkl49.component.TextField();
        pR233 = new pkl49.component.PanelTransparan();
        txtB4K7_18 = new pkl49.component.TextField();
        pR234 = new pkl49.component.PanelTransparan();
        txtB4K8_18 = new pkl49.component.TextField();
        pR235 = new pkl49.component.PanelTransparan();
        txtB4K9_18 = new pkl49.component.TextField();
        pR236 = new pkl49.component.PanelTransparan();
        label63 = new pkl49.component.Label();
        pR237 = new pkl49.component.PanelTransparan();
        txtB4K2_19 = new pkl49.component.TextField();
        pR238 = new pkl49.component.PanelTransparan();
        txtB4K3_19 = new pkl49.component.TextField();
        pR239 = new pkl49.component.PanelTransparan();
        txtB4K4_19 = new pkl49.component.TextField();
        pR240 = new pkl49.component.PanelTransparan();
        txtB4K5_19 = new pkl49.component.TextField();
        pR241 = new pkl49.component.PanelTransparan();
        txtB4K6_19 = new pkl49.component.TextField();
        pR242 = new pkl49.component.PanelTransparan();
        txtB4K7_19 = new pkl49.component.TextField();
        pR243 = new pkl49.component.PanelTransparan();
        txtB4K8_19 = new pkl49.component.TextField();
        pR244 = new pkl49.component.PanelTransparan();
        txtB4K9_19 = new pkl49.component.TextField();
        pR245 = new pkl49.component.PanelTransparan();
        label64 = new pkl49.component.Label();
        pR246 = new pkl49.component.PanelTransparan();
        txtB4K2_20 = new pkl49.component.TextField();
        pR247 = new pkl49.component.PanelTransparan();
        txtB4K3_20 = new pkl49.component.TextField();
        pR248 = new pkl49.component.PanelTransparan();
        txtB4K4_20 = new pkl49.component.TextField();
        pR249 = new pkl49.component.PanelTransparan();
        txtB4K5_20 = new pkl49.component.TextField();
        pR250 = new pkl49.component.PanelTransparan();
        txtB4K6_20 = new pkl49.component.TextField();
        pR251 = new pkl49.component.PanelTransparan();
        txtB4K7_20 = new pkl49.component.TextField();
        pR252 = new pkl49.component.PanelTransparan();
        txtB4K8_20 = new pkl49.component.TextField();
        pR253 = new pkl49.component.PanelTransparan();
        txtB4K9_20 = new pkl49.component.TextField();
        pR254 = new pkl49.component.PanelTransparan();
        label65 = new pkl49.component.Label();
        pR255 = new pkl49.component.PanelTransparan();
        txtB4K2_21 = new pkl49.component.TextField();
        pR256 = new pkl49.component.PanelTransparan();
        txtB4K3_21 = new pkl49.component.TextField();
        pR257 = new pkl49.component.PanelTransparan();
        txtB4K4_21 = new pkl49.component.TextField();
        pR258 = new pkl49.component.PanelTransparan();
        txtB4K5_21 = new pkl49.component.TextField();
        pR259 = new pkl49.component.PanelTransparan();
        txtB4K6_21 = new pkl49.component.TextField();
        pR260 = new pkl49.component.PanelTransparan();
        txtB4K7_21 = new pkl49.component.TextField();
        pR261 = new pkl49.component.PanelTransparan();
        txtB4K8_21 = new pkl49.component.TextField();
        pR262 = new pkl49.component.PanelTransparan();
        txtB4K9_21 = new pkl49.component.TextField();
        pR263 = new pkl49.component.PanelTransparan();
        label66 = new pkl49.component.Label();
        pR264 = new pkl49.component.PanelTransparan();
        txtB4K2_22 = new pkl49.component.TextField();
        pR265 = new pkl49.component.PanelTransparan();
        txtB4K3_22 = new pkl49.component.TextField();
        pR266 = new pkl49.component.PanelTransparan();
        txtB4K4_22 = new pkl49.component.TextField();
        pR267 = new pkl49.component.PanelTransparan();
        txtB4K5_22 = new pkl49.component.TextField();
        pR268 = new pkl49.component.PanelTransparan();
        txtB4K6_22 = new pkl49.component.TextField();
        pR269 = new pkl49.component.PanelTransparan();
        txtB4K7_22 = new pkl49.component.TextField();
        pR270 = new pkl49.component.PanelTransparan();
        txtB4K8_22 = new pkl49.component.TextField();
        pR271 = new pkl49.component.PanelTransparan();
        txtB4K9_22 = new pkl49.component.TextField();
        pR272 = new pkl49.component.PanelTransparan();
        label67 = new pkl49.component.Label();
        pR273 = new pkl49.component.PanelTransparan();
        txtB4K2_23 = new pkl49.component.TextField();
        pR274 = new pkl49.component.PanelTransparan();
        txtB4K3_23 = new pkl49.component.TextField();
        pR275 = new pkl49.component.PanelTransparan();
        txtB4K4_23 = new pkl49.component.TextField();
        pR276 = new pkl49.component.PanelTransparan();
        txtB4K5_23 = new pkl49.component.TextField();
        pR277 = new pkl49.component.PanelTransparan();
        txtB4K6_23 = new pkl49.component.TextField();
        pR278 = new pkl49.component.PanelTransparan();
        txtB4K7_23 = new pkl49.component.TextField();
        pR279 = new pkl49.component.PanelTransparan();
        txtB4K8_23 = new pkl49.component.TextField();
        pR280 = new pkl49.component.PanelTransparan();
        txtB4K9_23 = new pkl49.component.TextField();
        pR281 = new pkl49.component.PanelTransparan();
        label68 = new pkl49.component.Label();
        pR282 = new pkl49.component.PanelTransparan();
        txtB4K2_24 = new pkl49.component.TextField();
        pR283 = new pkl49.component.PanelTransparan();
        txtB4K3_24 = new pkl49.component.TextField();
        pR284 = new pkl49.component.PanelTransparan();
        txtB4K4_24 = new pkl49.component.TextField();
        pR285 = new pkl49.component.PanelTransparan();
        txtB4K5_24 = new pkl49.component.TextField();
        pR286 = new pkl49.component.PanelTransparan();
        txtB4K6_24 = new pkl49.component.TextField();
        pR287 = new pkl49.component.PanelTransparan();
        txtB4K7_24 = new pkl49.component.TextField();
        pR288 = new pkl49.component.PanelTransparan();
        txtB4K8_24 = new pkl49.component.TextField();
        pR289 = new pkl49.component.PanelTransparan();
        txtB4K9_24 = new pkl49.component.TextField();
        pR290 = new pkl49.component.PanelTransparan();
        label69 = new pkl49.component.Label();
        pR291 = new pkl49.component.PanelTransparan();
        txtB4K2_25 = new pkl49.component.TextField();
        pR292 = new pkl49.component.PanelTransparan();
        txtB4K3_25 = new pkl49.component.TextField();
        pR293 = new pkl49.component.PanelTransparan();
        txtB4K4_25 = new pkl49.component.TextField();
        pR294 = new pkl49.component.PanelTransparan();
        txtB4K5_25 = new pkl49.component.TextField();
        pR295 = new pkl49.component.PanelTransparan();
        txtB4K6_25 = new pkl49.component.TextField();
        pR296 = new pkl49.component.PanelTransparan();
        txtB4K7_25 = new pkl49.component.TextField();
        pR297 = new pkl49.component.PanelTransparan();
        txtB4K8_25 = new pkl49.component.TextField();
        pR298 = new pkl49.component.PanelTransparan();
        txtB4K9_25 = new pkl49.component.TextField();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        panelTransparan2.setBorder(null);

        panelTabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTabel.setLayout(new java.awt.GridBagLayout());

        Header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Header.setAlpha(70);
        Header.setLayout(new java.awt.GridBagLayout());

        label1.setText("IV. KETERANGAN ANGGOTA RUMAH TANGGA");
        label1.setFont(new java.awt.Font("Tahoma", 1, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 183, 1, 288);
        Header.add(label1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(Header, gridBagConstraints);

        p0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p0.setAlpha(50);
        p0.setLayout(new java.awt.GridBagLayout());

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("No.");
        label2.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        p0.add(label2, gridBagConstraints);

        label30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label30.setText("Urut");
        label30.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        p0.add(label30, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p0, gridBagConstraints);

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setAlpha(50);
        p1.setLayout(new java.awt.GridBagLayout());

        label3.setText("Nama Anggota Rumah Tangga (ART)");
        label3.setFont(new java.awt.Font("Tahoma", 1, 11));
        p1.add(label3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p1, gridBagConstraints);

        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setAlpha(50);
        p2.setLayout(new java.awt.GridBagLayout());

        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Hubungan");
        label4.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p2.add(label4, gridBagConstraints);

        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("dengan");
        label5.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p2.add(label5, gridBagConstraints);

        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("Rumah ");
        label6.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p2.add(label6, gridBagConstraints);

        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("Kepala");
        label7.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p2.add(label7, gridBagConstraints);

        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("Tangga");
        label8.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p2.add(label8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p2, gridBagConstraints);

        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setAlpha(50);
        p3.setLayout(new java.awt.GridBagLayout());

        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("Jenis");
        label9.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p3.add(label9, gridBagConstraints);

        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("Kelamin");
        label10.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p3.add(label10, gridBagConstraints);

        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("1. Lk");
        label11.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p3.add(label11, gridBagConstraints);

        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("2. Pr");
        label12.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p3.add(label12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p3, gridBagConstraints);

        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setAlpha(50);
        p4.setLayout(new java.awt.GridBagLayout());

        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setText("Umur");
        label13.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p4.add(label13, gridBagConstraints);

        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("(Tahun)");
        label14.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p4.add(label14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p4, gridBagConstraints);

        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p5.setAlpha(50);
        p5.setLayout(new java.awt.GridBagLayout());

        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText("Partisipasi");
        label18.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p5.add(label18, gridBagConstraints);

        label19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label19.setText("Sekolah");
        label19.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p5.add(label19, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p5, gridBagConstraints);

        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p6.setAlpha(50);
        p6.setLayout(new java.awt.GridBagLayout());

        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setText("Pendidikan");
        label15.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p6.add(label15, gridBagConstraints);

        label16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label16.setText("tertingggi yang");
        label16.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p6.add(label16, gridBagConstraints);

        label17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label17.setText("pernah/sedang");
        label17.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p6.add(label17, gridBagConstraints);

        label20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label20.setText("dijalankan");
        label20.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p6.add(label20, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p6, gridBagConstraints);

        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p7.setAlpha(50);
        p7.setLayout(new java.awt.GridBagLayout());

        label21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label21.setText("Tingkat/kelas");
        label21.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p7.add(label21, gridBagConstraints);

        label22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label22.setText("tertinggi yang");
        label22.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p7.add(label22, gridBagConstraints);

        label24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label24.setText("pernah/sedang");
        label24.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p7.add(label24, gridBagConstraints);

        label27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label27.setText("diduduki");
        label27.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p7.add(label27, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p7, gridBagConstraints);

        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p8.setAlpha(50);
        p8.setLayout(new java.awt.GridBagLayout());

        label23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label23.setText("Pendidikan");
        label23.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p8.add(label23, gridBagConstraints);

        label25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label25.setText("tertinggi yang");
        label25.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p8.add(label25, gridBagConstraints);

        label26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label26.setText("ditamatkan");
        label26.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        p8.add(label26, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(p8, gridBagConstraints);

        pp5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pp5.setAlpha(50);
        pp5.setLayout(new java.awt.GridBagLayout());

        label28.setText("Untuk ART Berumur >= 5 Tahun");
        label28.setFont(new java.awt.Font("Tahoma", 1, 11));
        pp5.add(label28, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pp5, gridBagConstraints);

        pR65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR65.setLayout(new java.awt.GridBagLayout());

        label36.setText("4.");
        label36.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR65.add(label36, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR65, gridBagConstraints);

        pR66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_1.setColumns(20);
        txtB4K2_1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusTxt(evt);
            }
        });
        pR66.add(txtB4K2_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR66, gridBagConstraints);

        pR67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_1.setColumns(2);
        txtB4K3_1.setMinDigit('1');
        pR67.add(txtB4K3_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR67, gridBagConstraints);

        pR68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_1.setColumns(2);
        txtB4K4_1.setMaxDigit('2');
        txtB4K4_1.setMinDigit('1');
        pR68.add(txtB4K4_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR68, gridBagConstraints);

        pR69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_1.setColumns(3);
        txtB4K5_1.setLength(2);
        pR69.add(txtB4K5_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR69, gridBagConstraints);

        pR70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_1.setColumns(2);
        pR70.add(txtB4K6_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR70, gridBagConstraints);

        pR71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_1.setColumns(2);
        pR71.add(txtB4K7_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR71, gridBagConstraints);

        pR72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_1.setColumns(2);
        pR72.add(txtB4K8_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR72, gridBagConstraints);

        pR73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_1.setColumns(2);
        pR73.add(txtB4K9_1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR73, gridBagConstraints);

        pR74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR74.setAlpha(50);
        pR74.setLayout(new java.awt.GridBagLayout());

        label47.setText("(9)");
        label47.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR74.add(label47, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR74, gridBagConstraints);

        pR75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR75.setAlpha(50);
        pR75.setLayout(new java.awt.GridBagLayout());

        label46.setText("(8)");
        label46.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR75.add(label46, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR75, gridBagConstraints);

        pR76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR76.setAlpha(50);
        pR76.setLayout(new java.awt.GridBagLayout());

        label45.setText("(7)");
        label45.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR76.add(label45, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR76, gridBagConstraints);

        pR77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR77.setAlpha(50);
        pR77.setLayout(new java.awt.GridBagLayout());

        label44.setText("(6)");
        label44.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR77.add(label44, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR77, gridBagConstraints);

        pR78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR78.setAlpha(50);
        pR78.setLayout(new java.awt.GridBagLayout());

        label43.setText("(5)");
        label43.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR78.add(label43, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR78, gridBagConstraints);

        pR79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR79.setAlpha(50);
        pR79.setLayout(new java.awt.GridBagLayout());

        label42.setText("(4)");
        label42.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR79.add(label42, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR79, gridBagConstraints);

        pR80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR80.setAlpha(50);
        pR80.setLayout(new java.awt.GridBagLayout());

        label41.setText("(3)");
        label41.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR80.add(label41, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR80, gridBagConstraints);

        pR81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR81.setAlpha(50);
        pR81.setLayout(new java.awt.GridBagLayout());

        label40.setText("(2)");
        label40.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR81.add(label40, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR81, gridBagConstraints);

        pR82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR82.setAlpha(50);
        pR82.setLayout(new java.awt.GridBagLayout());

        label37.setText("(1)");
        label37.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR82.add(label37, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR82, gridBagConstraints);

        pR83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR83.setLayout(new java.awt.GridBagLayout());

        label38.setText("2.");
        label38.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR83.add(label38, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR83, gridBagConstraints);

        pR84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_2.setColumns(20);
        pR84.add(txtB4K2_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR84, gridBagConstraints);

        pR85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_2.setColumns(2);
        txtB4K3_2.setMinDigit('1');
        pR85.add(txtB4K3_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR85, gridBagConstraints);

        pR86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_2.setColumns(2);
        txtB4K4_2.setMaxDigit('2');
        txtB4K4_2.setMinDigit('1');
        pR86.add(txtB4K4_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR86, gridBagConstraints);

        pR87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_2.setColumns(3);
        txtB4K5_2.setLength(2);
        pR87.add(txtB4K5_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR87, gridBagConstraints);

        pR88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_2.setColumns(2);
        pR88.add(txtB4K6_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR88, gridBagConstraints);

        pR89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_2.setColumns(2);
        pR89.add(txtB4K7_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR89, gridBagConstraints);

        pR90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_2.setColumns(2);
        pR90.add(txtB4K8_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR90, gridBagConstraints);

        pR91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_2.setColumns(2);
        pR91.add(txtB4K9_2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR91, gridBagConstraints);

        pR92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR92.setLayout(new java.awt.GridBagLayout());

        label39.setText("1.");
        label39.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR92.add(label39, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR92, gridBagConstraints);

        pR93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_3.setColumns(20);
        pR93.add(txtB4K2_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR93, gridBagConstraints);

        pR94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_3.setColumns(2);
        txtB4K3_3.setMinDigit('1');
        pR94.add(txtB4K3_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR94, gridBagConstraints);

        pR95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_3.setColumns(2);
        txtB4K4_3.setMaxDigit('2');
        txtB4K4_3.setMinDigit('1');
        pR95.add(txtB4K4_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR95, gridBagConstraints);

        pR96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_3.setColumns(3);
        txtB4K5_3.setLength(2);
        pR96.add(txtB4K5_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR96, gridBagConstraints);

        pR97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_3.setColumns(2);
        pR97.add(txtB4K6_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR97, gridBagConstraints);

        pR98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_3.setColumns(2);
        pR98.add(txtB4K7_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR98, gridBagConstraints);

        pR99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_3.setColumns(2);
        pR99.add(txtB4K8_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR99, gridBagConstraints);

        pR100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_3.setColumns(2);
        pR100.add(txtB4K9_3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR100, gridBagConstraints);

        pR101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR101.setLayout(new java.awt.GridBagLayout());

        label48.setText("5.");
        label48.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR101.add(label48, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR101, gridBagConstraints);

        pR102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_4.setColumns(20);
        pR102.add(txtB4K2_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR102, gridBagConstraints);

        pR103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_4.setColumns(2);
        txtB4K3_4.setMinDigit('1');
        pR103.add(txtB4K3_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR103, gridBagConstraints);

        pR104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_4.setColumns(2);
        txtB4K4_4.setMaxDigit('2');
        txtB4K4_4.setMinDigit('1');
        pR104.add(txtB4K4_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR104, gridBagConstraints);

        pR105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_4.setColumns(3);
        txtB4K5_4.setLength(2);
        pR105.add(txtB4K5_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR105, gridBagConstraints);

        pR106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_4.setColumns(2);
        pR106.add(txtB4K6_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR106, gridBagConstraints);

        pR107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_4.setColumns(2);
        pR107.add(txtB4K7_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR107, gridBagConstraints);

        pR108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_4.setColumns(2);
        pR108.add(txtB4K8_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR108, gridBagConstraints);

        pR109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_4.setColumns(2);
        pR109.add(txtB4K9_4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR109, gridBagConstraints);

        pR110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR110.setLayout(new java.awt.GridBagLayout());

        label49.setText("6.");
        label49.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR110.add(label49, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR110, gridBagConstraints);

        pR111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_5.setColumns(20);
        pR111.add(txtB4K2_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR111, gridBagConstraints);

        pR112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_5.setColumns(2);
        txtB4K3_5.setMinDigit('1');
        pR112.add(txtB4K3_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR112, gridBagConstraints);

        pR113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_5.setColumns(2);
        txtB4K4_5.setMaxDigit('2');
        txtB4K4_5.setMinDigit('1');
        pR113.add(txtB4K4_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR113, gridBagConstraints);

        pR114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_5.setColumns(3);
        txtB4K5_5.setLength(2);
        pR114.add(txtB4K5_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR114, gridBagConstraints);

        pR115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_5.setColumns(2);
        pR115.add(txtB4K6_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR115, gridBagConstraints);

        pR116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_5.setColumns(2);
        pR116.add(txtB4K7_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR116, gridBagConstraints);

        pR117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_5.setColumns(2);
        pR117.add(txtB4K8_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR117, gridBagConstraints);

        pR118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_5.setColumns(2);
        pR118.add(txtB4K9_5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR118, gridBagConstraints);

        pR119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR119.setLayout(new java.awt.GridBagLayout());

        label50.setText("7.");
        label50.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR119.add(label50, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR119, gridBagConstraints);

        pR120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_6.setColumns(20);
        pR120.add(txtB4K2_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR120, gridBagConstraints);

        pR121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_6.setColumns(2);
        txtB4K3_6.setMinDigit('1');
        pR121.add(txtB4K3_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR121, gridBagConstraints);

        pR122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_6.setColumns(2);
        txtB4K4_6.setMaxDigit('2');
        txtB4K4_6.setMinDigit('1');
        pR122.add(txtB4K4_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR122, gridBagConstraints);

        pR123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_6.setColumns(3);
        txtB4K5_6.setLength(2);
        pR123.add(txtB4K5_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR123, gridBagConstraints);

        pR124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_6.setColumns(2);
        pR124.add(txtB4K6_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR124, gridBagConstraints);

        pR125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_6.setColumns(2);
        pR125.add(txtB4K7_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR125, gridBagConstraints);

        pR126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_6.setColumns(2);
        pR126.add(txtB4K8_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR126, gridBagConstraints);

        pR127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_6.setColumns(2);
        pR127.add(txtB4K9_6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR127, gridBagConstraints);

        pR128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR128.setLayout(new java.awt.GridBagLayout());

        label51.setText("8.");
        label51.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR128.add(label51, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR128, gridBagConstraints);

        pR129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_7.setColumns(20);
        pR129.add(txtB4K2_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR129, gridBagConstraints);

        pR130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_7.setColumns(2);
        txtB4K3_7.setMinDigit('1');
        pR130.add(txtB4K3_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR130, gridBagConstraints);

        pR131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_7.setColumns(2);
        txtB4K4_7.setMaxDigit('2');
        txtB4K4_7.setMinDigit('1');
        pR131.add(txtB4K4_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR131, gridBagConstraints);

        pR132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_7.setColumns(3);
        txtB4K5_7.setLength(2);
        pR132.add(txtB4K5_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR132, gridBagConstraints);

        pR133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_7.setColumns(2);
        pR133.add(txtB4K6_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR133, gridBagConstraints);

        pR134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_7.setColumns(2);
        pR134.add(txtB4K7_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR134, gridBagConstraints);

        pR135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_7.setColumns(2);
        pR135.add(txtB4K8_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR135, gridBagConstraints);

        pR136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_7.setColumns(2);
        pR136.add(txtB4K9_7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR136, gridBagConstraints);

        pR137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR137.setLayout(new java.awt.GridBagLayout());

        label52.setText("3.");
        label52.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR137.add(label52, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR137, gridBagConstraints);

        pR138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_8.setColumns(20);
        pR138.add(txtB4K2_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR138, gridBagConstraints);

        pR139.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_8.setColumns(2);
        txtB4K3_8.setMinDigit('1');
        pR139.add(txtB4K3_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR139, gridBagConstraints);

        pR140.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_8.setColumns(2);
        txtB4K4_8.setMaxDigit('2');
        txtB4K4_8.setMinDigit('1');
        pR140.add(txtB4K4_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR140, gridBagConstraints);

        pR141.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_8.setColumns(3);
        txtB4K5_8.setLength(2);
        pR141.add(txtB4K5_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR141, gridBagConstraints);

        pR142.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_8.setColumns(2);
        pR142.add(txtB4K6_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR142, gridBagConstraints);

        pR143.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_8.setColumns(2);
        pR143.add(txtB4K7_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR143, gridBagConstraints);

        pR144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_8.setColumns(2);
        pR144.add(txtB4K8_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR144, gridBagConstraints);

        pR145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_8.setColumns(2);
        pR145.add(txtB4K9_8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR145, gridBagConstraints);

        pR146.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR146.setLayout(new java.awt.GridBagLayout());

        label53.setText("9.");
        label53.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR146.add(label53, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR146, gridBagConstraints);

        pR147.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_9.setColumns(20);
        pR147.add(txtB4K2_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR147, gridBagConstraints);

        pR148.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_9.setColumns(2);
        txtB4K3_9.setMinDigit('1');
        pR148.add(txtB4K3_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR148, gridBagConstraints);

        pR149.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_9.setColumns(2);
        txtB4K4_9.setMaxDigit('2');
        txtB4K4_9.setMinDigit('1');
        pR149.add(txtB4K4_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR149, gridBagConstraints);

        pR150.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_9.setColumns(3);
        txtB4K5_9.setLength(2);
        pR150.add(txtB4K5_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR150, gridBagConstraints);

        pR151.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_9.setColumns(2);
        pR151.add(txtB4K6_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR151, gridBagConstraints);

        pR152.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_9.setColumns(2);
        pR152.add(txtB4K7_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR152, gridBagConstraints);

        pR153.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_9.setColumns(2);
        pR153.add(txtB4K8_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR153, gridBagConstraints);

        pR154.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_9.setColumns(2);
        pR154.add(txtB4K9_9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR154, gridBagConstraints);

        pR155.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR155.setLayout(new java.awt.GridBagLayout());

        label54.setText("10.");
        label54.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR155.add(label54, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR155, gridBagConstraints);

        pR156.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_10.setColumns(20);
        pR156.add(txtB4K2_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR156, gridBagConstraints);

        pR157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_10.setColumns(2);
        txtB4K3_10.setMinDigit('1');
        pR157.add(txtB4K3_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR157, gridBagConstraints);

        pR158.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_10.setColumns(2);
        txtB4K4_10.setMaxDigit('2');
        txtB4K4_10.setMinDigit('1');
        pR158.add(txtB4K4_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR158, gridBagConstraints);

        pR159.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_10.setColumns(3);
        txtB4K5_10.setLength(2);
        pR159.add(txtB4K5_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR159, gridBagConstraints);

        pR160.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_10.setColumns(2);
        pR160.add(txtB4K6_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR160, gridBagConstraints);

        pR161.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_10.setColumns(2);
        pR161.add(txtB4K7_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR161, gridBagConstraints);

        pR162.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_10.setColumns(2);
        pR162.add(txtB4K8_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR162, gridBagConstraints);

        pR163.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_10.setColumns(2);
        pR163.add(txtB4K9_10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR163, gridBagConstraints);

        pR164.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR164.setLayout(new java.awt.GridBagLayout());

        label55.setText("11.");
        label55.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR164.add(label55, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR164, gridBagConstraints);

        pR165.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_11.setColumns(20);
        pR165.add(txtB4K2_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR165, gridBagConstraints);

        pR166.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_11.setColumns(2);
        txtB4K3_11.setMinDigit('1');
        pR166.add(txtB4K3_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR166, gridBagConstraints);

        pR167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_11.setColumns(2);
        txtB4K4_11.setMaxDigit('2');
        txtB4K4_11.setMinDigit('1');
        pR167.add(txtB4K4_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR167, gridBagConstraints);

        pR168.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_11.setColumns(3);
        txtB4K5_11.setLength(2);
        pR168.add(txtB4K5_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR168, gridBagConstraints);

        pR169.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_11.setColumns(2);
        pR169.add(txtB4K6_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR169, gridBagConstraints);

        pR170.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_11.setColumns(2);
        pR170.add(txtB4K7_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR170, gridBagConstraints);

        pR171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_11.setColumns(2);
        pR171.add(txtB4K8_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR171, gridBagConstraints);

        pR172.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_11.setColumns(2);
        pR172.add(txtB4K9_11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR172, gridBagConstraints);

        pR173.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR173.setLayout(new java.awt.GridBagLayout());

        label56.setText("12.");
        label56.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR173.add(label56, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR173, gridBagConstraints);

        pR174.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_12.setColumns(20);
        pR174.add(txtB4K2_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR174, gridBagConstraints);

        pR175.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_12.setColumns(2);
        txtB4K3_12.setMinDigit('1');
        pR175.add(txtB4K3_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR175, gridBagConstraints);

        pR176.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_12.setColumns(2);
        txtB4K4_12.setMaxDigit('2');
        txtB4K4_12.setMinDigit('1');
        pR176.add(txtB4K4_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR176, gridBagConstraints);

        pR177.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_12.setColumns(3);
        txtB4K5_12.setLength(2);
        pR177.add(txtB4K5_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR177, gridBagConstraints);

        pR178.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_12.setColumns(2);
        pR178.add(txtB4K6_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR178, gridBagConstraints);

        pR179.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_12.setColumns(2);
        pR179.add(txtB4K7_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR179, gridBagConstraints);

        pR180.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_12.setColumns(2);
        pR180.add(txtB4K8_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR180, gridBagConstraints);

        pR181.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_12.setColumns(2);
        pR181.add(txtB4K9_12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR181, gridBagConstraints);

        pR182.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR182.setLayout(new java.awt.GridBagLayout());

        label57.setText("13.");
        label57.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR182.add(label57, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR182, gridBagConstraints);

        pR183.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_13.setColumns(20);
        pR183.add(txtB4K2_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR183, gridBagConstraints);

        pR184.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_13.setColumns(2);
        txtB4K3_13.setMinDigit('1');
        pR184.add(txtB4K3_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR184, gridBagConstraints);

        pR185.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_13.setColumns(2);
        txtB4K4_13.setMaxDigit('2');
        txtB4K4_13.setMinDigit('1');
        pR185.add(txtB4K4_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR185, gridBagConstraints);

        pR186.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_13.setColumns(3);
        txtB4K5_13.setLength(2);
        pR186.add(txtB4K5_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR186, gridBagConstraints);

        pR187.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_13.setColumns(2);
        pR187.add(txtB4K6_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR187, gridBagConstraints);

        pR188.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_13.setColumns(2);
        pR188.add(txtB4K7_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR188, gridBagConstraints);

        pR189.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_13.setColumns(2);
        pR189.add(txtB4K8_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR189, gridBagConstraints);

        pR190.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_13.setColumns(2);
        pR190.add(txtB4K9_13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR190, gridBagConstraints);

        pR191.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR191.setLayout(new java.awt.GridBagLayout());

        label58.setText("14.");
        label58.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR191.add(label58, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR191, gridBagConstraints);

        pR192.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_14.setColumns(20);
        pR192.add(txtB4K2_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR192, gridBagConstraints);

        pR193.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_14.setColumns(2);
        txtB4K3_14.setMinDigit('1');
        pR193.add(txtB4K3_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR193, gridBagConstraints);

        pR194.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_14.setColumns(2);
        txtB4K4_14.setMaxDigit('2');
        txtB4K4_14.setMinDigit('1');
        pR194.add(txtB4K4_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR194, gridBagConstraints);

        pR195.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_14.setColumns(3);
        txtB4K5_14.setLength(2);
        pR195.add(txtB4K5_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR195, gridBagConstraints);

        pR196.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_14.setColumns(2);
        pR196.add(txtB4K6_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR196, gridBagConstraints);

        pR197.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_14.setColumns(2);
        pR197.add(txtB4K7_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR197, gridBagConstraints);

        pR198.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_14.setColumns(2);
        pR198.add(txtB4K8_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR198, gridBagConstraints);

        pR199.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_14.setColumns(2);
        pR199.add(txtB4K9_14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR199, gridBagConstraints);

        pR200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR200.setLayout(new java.awt.GridBagLayout());

        label59.setText("15.");
        label59.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR200.add(label59, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR200, gridBagConstraints);

        pR201.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_15.setColumns(20);
        pR201.add(txtB4K2_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR201, gridBagConstraints);

        pR202.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_15.setColumns(2);
        txtB4K3_15.setMinDigit('1');
        pR202.add(txtB4K3_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR202, gridBagConstraints);

        pR203.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_15.setColumns(2);
        txtB4K4_15.setMaxDigit('2');
        txtB4K4_15.setMinDigit('1');
        pR203.add(txtB4K4_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR203, gridBagConstraints);

        pR204.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_15.setColumns(3);
        txtB4K5_15.setLength(2);
        pR204.add(txtB4K5_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR204, gridBagConstraints);

        pR205.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_15.setColumns(2);
        pR205.add(txtB4K6_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR205, gridBagConstraints);

        pR206.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_15.setColumns(2);
        pR206.add(txtB4K7_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR206, gridBagConstraints);

        pR207.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_15.setColumns(2);
        pR207.add(txtB4K8_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR207, gridBagConstraints);

        pR208.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_15.setColumns(2);
        pR208.add(txtB4K9_15);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR208, gridBagConstraints);

        pR209.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR209.setLayout(new java.awt.GridBagLayout());

        label60.setText("16.");
        label60.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR209.add(label60, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR209, gridBagConstraints);

        pR210.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_16.setColumns(20);
        pR210.add(txtB4K2_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR210, gridBagConstraints);

        pR211.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_16.setColumns(2);
        txtB4K3_16.setMinDigit('1');
        pR211.add(txtB4K3_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR211, gridBagConstraints);

        pR212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_16.setColumns(2);
        txtB4K4_16.setMaxDigit('2');
        txtB4K4_16.setMinDigit('1');
        pR212.add(txtB4K4_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR212, gridBagConstraints);

        pR213.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_16.setColumns(3);
        txtB4K5_16.setLength(2);
        pR213.add(txtB4K5_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR213, gridBagConstraints);

        pR214.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_16.setColumns(2);
        pR214.add(txtB4K6_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR214, gridBagConstraints);

        pR215.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_16.setColumns(2);
        pR215.add(txtB4K7_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR215, gridBagConstraints);

        pR216.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_16.setColumns(2);
        pR216.add(txtB4K8_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR216, gridBagConstraints);

        pR217.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_16.setColumns(2);
        pR217.add(txtB4K9_16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR217, gridBagConstraints);

        pR218.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR218.setLayout(new java.awt.GridBagLayout());

        label61.setText("17.");
        label61.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR218.add(label61, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR218, gridBagConstraints);

        pR219.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_17.setColumns(20);
        pR219.add(txtB4K2_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR219, gridBagConstraints);

        pR220.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_17.setColumns(2);
        txtB4K3_17.setMinDigit('1');
        pR220.add(txtB4K3_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR220, gridBagConstraints);

        pR221.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_17.setColumns(2);
        txtB4K4_17.setMaxDigit('2');
        txtB4K4_17.setMinDigit('1');
        pR221.add(txtB4K4_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR221, gridBagConstraints);

        pR222.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_17.setColumns(3);
        txtB4K5_17.setLength(2);
        pR222.add(txtB4K5_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR222, gridBagConstraints);

        pR223.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_17.setColumns(2);
        pR223.add(txtB4K6_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR223, gridBagConstraints);

        pR224.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_17.setColumns(2);
        pR224.add(txtB4K7_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR224, gridBagConstraints);

        pR225.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_17.setColumns(2);
        pR225.add(txtB4K8_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR225, gridBagConstraints);

        pR226.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_17.setColumns(2);
        pR226.add(txtB4K9_17);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR226, gridBagConstraints);

        pR227.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR227.setLayout(new java.awt.GridBagLayout());

        label62.setText("18.");
        label62.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR227.add(label62, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR227, gridBagConstraints);

        pR228.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_18.setColumns(20);
        pR228.add(txtB4K2_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR228, gridBagConstraints);

        pR229.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_18.setColumns(2);
        txtB4K3_18.setMinDigit('1');
        pR229.add(txtB4K3_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR229, gridBagConstraints);

        pR230.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_18.setColumns(2);
        txtB4K4_18.setMaxDigit('2');
        txtB4K4_18.setMinDigit('1');
        pR230.add(txtB4K4_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR230, gridBagConstraints);

        pR231.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_18.setColumns(3);
        txtB4K5_18.setLength(2);
        pR231.add(txtB4K5_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR231, gridBagConstraints);

        pR232.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_18.setColumns(2);
        pR232.add(txtB4K6_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR232, gridBagConstraints);

        pR233.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_18.setColumns(2);
        pR233.add(txtB4K7_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR233, gridBagConstraints);

        pR234.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_18.setColumns(2);
        pR234.add(txtB4K8_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR234, gridBagConstraints);

        pR235.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_18.setColumns(2);
        pR235.add(txtB4K9_18);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR235, gridBagConstraints);

        pR236.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR236.setLayout(new java.awt.GridBagLayout());

        label63.setText("25.");
        label63.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR236.add(label63, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR236, gridBagConstraints);

        pR237.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_19.setColumns(20);
        pR237.add(txtB4K2_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR237, gridBagConstraints);

        pR238.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_19.setColumns(2);
        txtB4K3_19.setMinDigit('1');
        pR238.add(txtB4K3_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR238, gridBagConstraints);

        pR239.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_19.setColumns(2);
        txtB4K4_19.setMaxDigit('2');
        txtB4K4_19.setMinDigit('1');
        pR239.add(txtB4K4_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR239, gridBagConstraints);

        pR240.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_19.setColumns(3);
        txtB4K5_19.setLength(2);
        pR240.add(txtB4K5_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR240, gridBagConstraints);

        pR241.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_19.setColumns(2);
        pR241.add(txtB4K6_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR241, gridBagConstraints);

        pR242.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_19.setColumns(2);
        pR242.add(txtB4K7_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR242, gridBagConstraints);

        pR243.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_19.setColumns(2);
        pR243.add(txtB4K8_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR243, gridBagConstraints);

        pR244.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_19.setColumns(2);
        pR244.add(txtB4K9_19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR244, gridBagConstraints);

        pR245.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR245.setLayout(new java.awt.GridBagLayout());

        label64.setText("24.");
        label64.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR245.add(label64, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR245, gridBagConstraints);

        pR246.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_20.setColumns(20);
        pR246.add(txtB4K2_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR246, gridBagConstraints);

        pR247.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_20.setColumns(2);
        txtB4K3_20.setMinDigit('1');
        pR247.add(txtB4K3_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR247, gridBagConstraints);

        pR248.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_20.setColumns(2);
        txtB4K4_20.setMaxDigit('2');
        txtB4K4_20.setMinDigit('1');
        pR248.add(txtB4K4_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR248, gridBagConstraints);

        pR249.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_20.setColumns(3);
        txtB4K5_20.setLength(2);
        pR249.add(txtB4K5_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR249, gridBagConstraints);

        pR250.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_20.setColumns(2);
        pR250.add(txtB4K6_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR250, gridBagConstraints);

        pR251.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_20.setColumns(2);
        pR251.add(txtB4K7_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR251, gridBagConstraints);

        pR252.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_20.setColumns(2);
        pR252.add(txtB4K8_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR252, gridBagConstraints);

        pR253.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_20.setColumns(2);
        pR253.add(txtB4K9_20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR253, gridBagConstraints);

        pR254.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR254.setLayout(new java.awt.GridBagLayout());

        label65.setText("23.");
        label65.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR254.add(label65, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR254, gridBagConstraints);

        pR255.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_21.setColumns(20);
        pR255.add(txtB4K2_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR255, gridBagConstraints);

        pR256.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_21.setColumns(2);
        txtB4K3_21.setMinDigit('1');
        pR256.add(txtB4K3_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR256, gridBagConstraints);

        pR257.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_21.setColumns(2);
        txtB4K4_21.setMaxDigit('2');
        txtB4K4_21.setMinDigit('1');
        pR257.add(txtB4K4_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR257, gridBagConstraints);

        pR258.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_21.setColumns(3);
        txtB4K5_21.setLength(2);
        pR258.add(txtB4K5_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR258, gridBagConstraints);

        pR259.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_21.setColumns(2);
        pR259.add(txtB4K6_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR259, gridBagConstraints);

        pR260.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_21.setColumns(2);
        pR260.add(txtB4K7_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR260, gridBagConstraints);

        pR261.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_21.setColumns(2);
        pR261.add(txtB4K8_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR261, gridBagConstraints);

        pR262.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_21.setColumns(2);
        pR262.add(txtB4K9_21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR262, gridBagConstraints);

        pR263.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR263.setLayout(new java.awt.GridBagLayout());

        label66.setText("22.");
        label66.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR263.add(label66, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR263, gridBagConstraints);

        pR264.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_22.setColumns(20);
        pR264.add(txtB4K2_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR264, gridBagConstraints);

        pR265.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_22.setColumns(2);
        txtB4K3_22.setMinDigit('1');
        pR265.add(txtB4K3_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR265, gridBagConstraints);

        pR266.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_22.setColumns(2);
        txtB4K4_22.setMaxDigit('2');
        txtB4K4_22.setMinDigit('1');
        pR266.add(txtB4K4_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR266, gridBagConstraints);

        pR267.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_22.setColumns(3);
        txtB4K5_22.setLength(2);
        pR267.add(txtB4K5_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR267, gridBagConstraints);

        pR268.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_22.setColumns(2);
        pR268.add(txtB4K6_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR268, gridBagConstraints);

        pR269.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_22.setColumns(2);
        pR269.add(txtB4K7_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR269, gridBagConstraints);

        pR270.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_22.setColumns(2);
        pR270.add(txtB4K8_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR270, gridBagConstraints);

        pR271.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_22.setColumns(2);
        pR271.add(txtB4K9_22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR271, gridBagConstraints);

        pR272.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR272.setLayout(new java.awt.GridBagLayout());

        label67.setText("21.");
        label67.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR272.add(label67, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR272, gridBagConstraints);

        pR273.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_23.setColumns(20);
        pR273.add(txtB4K2_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR273, gridBagConstraints);

        pR274.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_23.setColumns(2);
        txtB4K3_23.setMinDigit('1');
        pR274.add(txtB4K3_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR274, gridBagConstraints);

        pR275.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_23.setColumns(2);
        txtB4K4_23.setMaxDigit('2');
        txtB4K4_23.setMinDigit('1');
        pR275.add(txtB4K4_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR275, gridBagConstraints);

        pR276.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_23.setColumns(3);
        txtB4K5_23.setLength(2);
        pR276.add(txtB4K5_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR276, gridBagConstraints);

        pR277.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_23.setColumns(2);
        pR277.add(txtB4K6_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR277, gridBagConstraints);

        pR278.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_23.setColumns(2);
        pR278.add(txtB4K7_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR278, gridBagConstraints);

        pR279.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_23.setColumns(2);
        pR279.add(txtB4K8_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR279, gridBagConstraints);

        pR280.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_23.setColumns(2);
        pR280.add(txtB4K9_23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR280, gridBagConstraints);

        pR281.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR281.setLayout(new java.awt.GridBagLayout());

        label68.setText("20.");
        label68.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR281.add(label68, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR281, gridBagConstraints);

        pR282.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_24.setColumns(20);
        pR282.add(txtB4K2_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR282, gridBagConstraints);

        pR283.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_24.setColumns(2);
        txtB4K3_24.setMinDigit('1');
        pR283.add(txtB4K3_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR283, gridBagConstraints);

        pR284.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_24.setColumns(2);
        txtB4K4_24.setMaxDigit('2');
        txtB4K4_24.setMinDigit('1');
        pR284.add(txtB4K4_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR284, gridBagConstraints);

        pR285.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_24.setColumns(3);
        txtB4K5_24.setLength(2);
        pR285.add(txtB4K5_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR285, gridBagConstraints);

        pR286.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_24.setColumns(2);
        pR286.add(txtB4K6_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR286, gridBagConstraints);

        pR287.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_24.setColumns(2);
        pR287.add(txtB4K7_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR287, gridBagConstraints);

        pR288.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_24.setColumns(2);
        pR288.add(txtB4K8_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR288, gridBagConstraints);

        pR289.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_24.setColumns(2);
        pR289.add(txtB4K9_24);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR289, gridBagConstraints);

        pR290.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pR290.setLayout(new java.awt.GridBagLayout());

        label69.setText("19.");
        label69.setFont(new java.awt.Font("Tahoma", 1, 11));
        pR290.add(label69, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR290, gridBagConstraints);

        pR291.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K2_25.setColumns(20);
        pR291.add(txtB4K2_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR291, gridBagConstraints);

        pR292.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K3_25.setColumns(2);
        txtB4K3_25.setMinDigit('1');
        pR292.add(txtB4K3_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR292, gridBagConstraints);

        pR293.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K4_25.setColumns(2);
        txtB4K4_25.setMaxDigit('2');
        txtB4K4_25.setMinDigit('1');
        pR293.add(txtB4K4_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR293, gridBagConstraints);

        pR294.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K5_25.setColumns(3);
        txtB4K5_25.setLength(2);
        pR294.add(txtB4K5_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR294, gridBagConstraints);

        pR295.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K6_25.setColumns(2);
        pR295.add(txtB4K6_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR295, gridBagConstraints);

        pR296.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K7_25.setColumns(2);
        pR296.add(txtB4K7_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR296, gridBagConstraints);

        pR297.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K8_25.setColumns(2);
        pR297.add(txtB4K8_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR297, gridBagConstraints);

        pR298.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtB4K9_25.setColumns(2);
        pR298.add(txtB4K9_25);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelTabel.add(pR298, gridBagConstraints);

        panelTransparan2.add(panelTabel);

        scroolPane1.setViewportView(panelTransparan2);

        add(scroolPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void focusTxt(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusTxt
        panelTabel.scrollRectToVisible(evt.getComponent().getParent().getBounds(null));
    }//GEN-LAST:event_focusTxt


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl49.component.PanelTransparan Header;
    private pkl49.component.Label label1;
    private pkl49.component.Label label10;
    private pkl49.component.Label label11;
    private pkl49.component.Label label12;
    private pkl49.component.Label label13;
    private pkl49.component.Label label14;
    private pkl49.component.Label label15;
    private pkl49.component.Label label16;
    private pkl49.component.Label label17;
    private pkl49.component.Label label18;
    private pkl49.component.Label label19;
    private pkl49.component.Label label2;
    private pkl49.component.Label label20;
    private pkl49.component.Label label21;
    private pkl49.component.Label label22;
    private pkl49.component.Label label23;
    private pkl49.component.Label label24;
    private pkl49.component.Label label25;
    private pkl49.component.Label label26;
    private pkl49.component.Label label27;
    private pkl49.component.Label label28;
    private pkl49.component.Label label3;
    private pkl49.component.Label label30;
    private pkl49.component.Label label36;
    private pkl49.component.Label label37;
    private pkl49.component.Label label38;
    private pkl49.component.Label label39;
    private pkl49.component.Label label4;
    private pkl49.component.Label label40;
    private pkl49.component.Label label41;
    private pkl49.component.Label label42;
    private pkl49.component.Label label43;
    private pkl49.component.Label label44;
    private pkl49.component.Label label45;
    private pkl49.component.Label label46;
    private pkl49.component.Label label47;
    private pkl49.component.Label label48;
    private pkl49.component.Label label49;
    private pkl49.component.Label label5;
    private pkl49.component.Label label50;
    private pkl49.component.Label label51;
    private pkl49.component.Label label52;
    private pkl49.component.Label label53;
    private pkl49.component.Label label54;
    private pkl49.component.Label label55;
    private pkl49.component.Label label56;
    private pkl49.component.Label label57;
    private pkl49.component.Label label58;
    private pkl49.component.Label label59;
    private pkl49.component.Label label6;
    private pkl49.component.Label label60;
    private pkl49.component.Label label61;
    private pkl49.component.Label label62;
    private pkl49.component.Label label63;
    private pkl49.component.Label label64;
    private pkl49.component.Label label65;
    private pkl49.component.Label label66;
    private pkl49.component.Label label67;
    private pkl49.component.Label label68;
    private pkl49.component.Label label69;
    private pkl49.component.Label label7;
    private pkl49.component.Label label8;
    private pkl49.component.Label label9;
    private pkl49.component.PanelTransparan p0;
    private pkl49.component.PanelTransparan p1;
    private pkl49.component.PanelTransparan p2;
    private pkl49.component.PanelTransparan p3;
    private pkl49.component.PanelTransparan p4;
    private pkl49.component.PanelTransparan p5;
    private pkl49.component.PanelTransparan p6;
    private pkl49.component.PanelTransparan p7;
    private pkl49.component.PanelTransparan p8;
    private pkl49.component.PanelTransparan pR100;
    private pkl49.component.PanelTransparan pR101;
    private pkl49.component.PanelTransparan pR102;
    private pkl49.component.PanelTransparan pR103;
    private pkl49.component.PanelTransparan pR104;
    private pkl49.component.PanelTransparan pR105;
    private pkl49.component.PanelTransparan pR106;
    private pkl49.component.PanelTransparan pR107;
    private pkl49.component.PanelTransparan pR108;
    private pkl49.component.PanelTransparan pR109;
    private pkl49.component.PanelTransparan pR110;
    private pkl49.component.PanelTransparan pR111;
    private pkl49.component.PanelTransparan pR112;
    private pkl49.component.PanelTransparan pR113;
    private pkl49.component.PanelTransparan pR114;
    private pkl49.component.PanelTransparan pR115;
    private pkl49.component.PanelTransparan pR116;
    private pkl49.component.PanelTransparan pR117;
    private pkl49.component.PanelTransparan pR118;
    private pkl49.component.PanelTransparan pR119;
    private pkl49.component.PanelTransparan pR120;
    private pkl49.component.PanelTransparan pR121;
    private pkl49.component.PanelTransparan pR122;
    private pkl49.component.PanelTransparan pR123;
    private pkl49.component.PanelTransparan pR124;
    private pkl49.component.PanelTransparan pR125;
    private pkl49.component.PanelTransparan pR126;
    private pkl49.component.PanelTransparan pR127;
    private pkl49.component.PanelTransparan pR128;
    private pkl49.component.PanelTransparan pR129;
    private pkl49.component.PanelTransparan pR130;
    private pkl49.component.PanelTransparan pR131;
    private pkl49.component.PanelTransparan pR132;
    private pkl49.component.PanelTransparan pR133;
    private pkl49.component.PanelTransparan pR134;
    private pkl49.component.PanelTransparan pR135;
    private pkl49.component.PanelTransparan pR136;
    private pkl49.component.PanelTransparan pR137;
    private pkl49.component.PanelTransparan pR138;
    private pkl49.component.PanelTransparan pR139;
    private pkl49.component.PanelTransparan pR140;
    private pkl49.component.PanelTransparan pR141;
    private pkl49.component.PanelTransparan pR142;
    private pkl49.component.PanelTransparan pR143;
    private pkl49.component.PanelTransparan pR144;
    private pkl49.component.PanelTransparan pR145;
    private pkl49.component.PanelTransparan pR146;
    private pkl49.component.PanelTransparan pR147;
    private pkl49.component.PanelTransparan pR148;
    private pkl49.component.PanelTransparan pR149;
    private pkl49.component.PanelTransparan pR150;
    private pkl49.component.PanelTransparan pR151;
    private pkl49.component.PanelTransparan pR152;
    private pkl49.component.PanelTransparan pR153;
    private pkl49.component.PanelTransparan pR154;
    private pkl49.component.PanelTransparan pR155;
    private pkl49.component.PanelTransparan pR156;
    private pkl49.component.PanelTransparan pR157;
    private pkl49.component.PanelTransparan pR158;
    private pkl49.component.PanelTransparan pR159;
    private pkl49.component.PanelTransparan pR160;
    private pkl49.component.PanelTransparan pR161;
    private pkl49.component.PanelTransparan pR162;
    private pkl49.component.PanelTransparan pR163;
    private pkl49.component.PanelTransparan pR164;
    private pkl49.component.PanelTransparan pR165;
    private pkl49.component.PanelTransparan pR166;
    private pkl49.component.PanelTransparan pR167;
    private pkl49.component.PanelTransparan pR168;
    private pkl49.component.PanelTransparan pR169;
    private pkl49.component.PanelTransparan pR170;
    private pkl49.component.PanelTransparan pR171;
    private pkl49.component.PanelTransparan pR172;
    private pkl49.component.PanelTransparan pR173;
    private pkl49.component.PanelTransparan pR174;
    private pkl49.component.PanelTransparan pR175;
    private pkl49.component.PanelTransparan pR176;
    private pkl49.component.PanelTransparan pR177;
    private pkl49.component.PanelTransparan pR178;
    private pkl49.component.PanelTransparan pR179;
    private pkl49.component.PanelTransparan pR180;
    private pkl49.component.PanelTransparan pR181;
    private pkl49.component.PanelTransparan pR182;
    private pkl49.component.PanelTransparan pR183;
    private pkl49.component.PanelTransparan pR184;
    private pkl49.component.PanelTransparan pR185;
    private pkl49.component.PanelTransparan pR186;
    private pkl49.component.PanelTransparan pR187;
    private pkl49.component.PanelTransparan pR188;
    private pkl49.component.PanelTransparan pR189;
    private pkl49.component.PanelTransparan pR190;
    private pkl49.component.PanelTransparan pR191;
    private pkl49.component.PanelTransparan pR192;
    private pkl49.component.PanelTransparan pR193;
    private pkl49.component.PanelTransparan pR194;
    private pkl49.component.PanelTransparan pR195;
    private pkl49.component.PanelTransparan pR196;
    private pkl49.component.PanelTransparan pR197;
    private pkl49.component.PanelTransparan pR198;
    private pkl49.component.PanelTransparan pR199;
    private pkl49.component.PanelTransparan pR200;
    private pkl49.component.PanelTransparan pR201;
    private pkl49.component.PanelTransparan pR202;
    private pkl49.component.PanelTransparan pR203;
    private pkl49.component.PanelTransparan pR204;
    private pkl49.component.PanelTransparan pR205;
    private pkl49.component.PanelTransparan pR206;
    private pkl49.component.PanelTransparan pR207;
    private pkl49.component.PanelTransparan pR208;
    private pkl49.component.PanelTransparan pR209;
    private pkl49.component.PanelTransparan pR210;
    private pkl49.component.PanelTransparan pR211;
    private pkl49.component.PanelTransparan pR212;
    private pkl49.component.PanelTransparan pR213;
    private pkl49.component.PanelTransparan pR214;
    private pkl49.component.PanelTransparan pR215;
    private pkl49.component.PanelTransparan pR216;
    private pkl49.component.PanelTransparan pR217;
    private pkl49.component.PanelTransparan pR218;
    private pkl49.component.PanelTransparan pR219;
    private pkl49.component.PanelTransparan pR220;
    private pkl49.component.PanelTransparan pR221;
    private pkl49.component.PanelTransparan pR222;
    private pkl49.component.PanelTransparan pR223;
    private pkl49.component.PanelTransparan pR224;
    private pkl49.component.PanelTransparan pR225;
    private pkl49.component.PanelTransparan pR226;
    private pkl49.component.PanelTransparan pR227;
    private pkl49.component.PanelTransparan pR228;
    private pkl49.component.PanelTransparan pR229;
    private pkl49.component.PanelTransparan pR230;
    private pkl49.component.PanelTransparan pR231;
    private pkl49.component.PanelTransparan pR232;
    private pkl49.component.PanelTransparan pR233;
    private pkl49.component.PanelTransparan pR234;
    private pkl49.component.PanelTransparan pR235;
    private pkl49.component.PanelTransparan pR236;
    private pkl49.component.PanelTransparan pR237;
    private pkl49.component.PanelTransparan pR238;
    private pkl49.component.PanelTransparan pR239;
    private pkl49.component.PanelTransparan pR240;
    private pkl49.component.PanelTransparan pR241;
    private pkl49.component.PanelTransparan pR242;
    private pkl49.component.PanelTransparan pR243;
    private pkl49.component.PanelTransparan pR244;
    private pkl49.component.PanelTransparan pR245;
    private pkl49.component.PanelTransparan pR246;
    private pkl49.component.PanelTransparan pR247;
    private pkl49.component.PanelTransparan pR248;
    private pkl49.component.PanelTransparan pR249;
    private pkl49.component.PanelTransparan pR250;
    private pkl49.component.PanelTransparan pR251;
    private pkl49.component.PanelTransparan pR252;
    private pkl49.component.PanelTransparan pR253;
    private pkl49.component.PanelTransparan pR254;
    private pkl49.component.PanelTransparan pR255;
    private pkl49.component.PanelTransparan pR256;
    private pkl49.component.PanelTransparan pR257;
    private pkl49.component.PanelTransparan pR258;
    private pkl49.component.PanelTransparan pR259;
    private pkl49.component.PanelTransparan pR260;
    private pkl49.component.PanelTransparan pR261;
    private pkl49.component.PanelTransparan pR262;
    private pkl49.component.PanelTransparan pR263;
    private pkl49.component.PanelTransparan pR264;
    private pkl49.component.PanelTransparan pR265;
    private pkl49.component.PanelTransparan pR266;
    private pkl49.component.PanelTransparan pR267;
    private pkl49.component.PanelTransparan pR268;
    private pkl49.component.PanelTransparan pR269;
    private pkl49.component.PanelTransparan pR270;
    private pkl49.component.PanelTransparan pR271;
    private pkl49.component.PanelTransparan pR272;
    private pkl49.component.PanelTransparan pR273;
    private pkl49.component.PanelTransparan pR274;
    private pkl49.component.PanelTransparan pR275;
    private pkl49.component.PanelTransparan pR276;
    private pkl49.component.PanelTransparan pR277;
    private pkl49.component.PanelTransparan pR278;
    private pkl49.component.PanelTransparan pR279;
    private pkl49.component.PanelTransparan pR280;
    private pkl49.component.PanelTransparan pR281;
    private pkl49.component.PanelTransparan pR282;
    private pkl49.component.PanelTransparan pR283;
    private pkl49.component.PanelTransparan pR284;
    private pkl49.component.PanelTransparan pR285;
    private pkl49.component.PanelTransparan pR286;
    private pkl49.component.PanelTransparan pR287;
    private pkl49.component.PanelTransparan pR288;
    private pkl49.component.PanelTransparan pR289;
    private pkl49.component.PanelTransparan pR290;
    private pkl49.component.PanelTransparan pR291;
    private pkl49.component.PanelTransparan pR292;
    private pkl49.component.PanelTransparan pR293;
    private pkl49.component.PanelTransparan pR294;
    private pkl49.component.PanelTransparan pR295;
    private pkl49.component.PanelTransparan pR296;
    private pkl49.component.PanelTransparan pR297;
    private pkl49.component.PanelTransparan pR298;
    private pkl49.component.PanelTransparan pR65;
    private pkl49.component.PanelTransparan pR66;
    private pkl49.component.PanelTransparan pR67;
    private pkl49.component.PanelTransparan pR68;
    private pkl49.component.PanelTransparan pR69;
    private pkl49.component.PanelTransparan pR70;
    private pkl49.component.PanelTransparan pR71;
    private pkl49.component.PanelTransparan pR72;
    private pkl49.component.PanelTransparan pR73;
    private pkl49.component.PanelTransparan pR74;
    private pkl49.component.PanelTransparan pR75;
    private pkl49.component.PanelTransparan pR76;
    private pkl49.component.PanelTransparan pR77;
    private pkl49.component.PanelTransparan pR78;
    private pkl49.component.PanelTransparan pR79;
    private pkl49.component.PanelTransparan pR80;
    private pkl49.component.PanelTransparan pR81;
    private pkl49.component.PanelTransparan pR82;
    private pkl49.component.PanelTransparan pR83;
    private pkl49.component.PanelTransparan pR84;
    private pkl49.component.PanelTransparan pR85;
    private pkl49.component.PanelTransparan pR86;
    private pkl49.component.PanelTransparan pR87;
    private pkl49.component.PanelTransparan pR88;
    private pkl49.component.PanelTransparan pR89;
    private pkl49.component.PanelTransparan pR90;
    private pkl49.component.PanelTransparan pR91;
    private pkl49.component.PanelTransparan pR92;
    private pkl49.component.PanelTransparan pR93;
    private pkl49.component.PanelTransparan pR94;
    private pkl49.component.PanelTransparan pR95;
    private pkl49.component.PanelTransparan pR96;
    private pkl49.component.PanelTransparan pR97;
    private pkl49.component.PanelTransparan pR98;
    private pkl49.component.PanelTransparan pR99;
    private pkl49.component.PanelTransparan panelTabel;
    private pkl49.component.PanelTransparan panelTransparan2;
    private pkl49.component.PanelTransparan pp5;
    private pkl49.component.ScroolPane scroolPane1;
    private pkl49.component.TextField txtB4K2_1;
    private pkl49.component.TextField txtB4K2_10;
    private pkl49.component.TextField txtB4K2_11;
    private pkl49.component.TextField txtB4K2_12;
    private pkl49.component.TextField txtB4K2_13;
    private pkl49.component.TextField txtB4K2_14;
    private pkl49.component.TextField txtB4K2_15;
    private pkl49.component.TextField txtB4K2_16;
    private pkl49.component.TextField txtB4K2_17;
    private pkl49.component.TextField txtB4K2_18;
    private pkl49.component.TextField txtB4K2_19;
    private pkl49.component.TextField txtB4K2_2;
    private pkl49.component.TextField txtB4K2_20;
    private pkl49.component.TextField txtB4K2_21;
    private pkl49.component.TextField txtB4K2_22;
    private pkl49.component.TextField txtB4K2_23;
    private pkl49.component.TextField txtB4K2_24;
    private pkl49.component.TextField txtB4K2_25;
    private pkl49.component.TextField txtB4K2_3;
    private pkl49.component.TextField txtB4K2_4;
    private pkl49.component.TextField txtB4K2_5;
    private pkl49.component.TextField txtB4K2_6;
    private pkl49.component.TextField txtB4K2_7;
    private pkl49.component.TextField txtB4K2_8;
    private pkl49.component.TextField txtB4K2_9;
    private pkl49.component.TextField txtB4K3_1;
    private pkl49.component.TextField txtB4K3_10;
    private pkl49.component.TextField txtB4K3_11;
    private pkl49.component.TextField txtB4K3_12;
    private pkl49.component.TextField txtB4K3_13;
    private pkl49.component.TextField txtB4K3_14;
    private pkl49.component.TextField txtB4K3_15;
    private pkl49.component.TextField txtB4K3_16;
    private pkl49.component.TextField txtB4K3_17;
    private pkl49.component.TextField txtB4K3_18;
    private pkl49.component.TextField txtB4K3_19;
    private pkl49.component.TextField txtB4K3_2;
    private pkl49.component.TextField txtB4K3_20;
    private pkl49.component.TextField txtB4K3_21;
    private pkl49.component.TextField txtB4K3_22;
    private pkl49.component.TextField txtB4K3_23;
    private pkl49.component.TextField txtB4K3_24;
    private pkl49.component.TextField txtB4K3_25;
    private pkl49.component.TextField txtB4K3_3;
    private pkl49.component.TextField txtB4K3_4;
    private pkl49.component.TextField txtB4K3_5;
    private pkl49.component.TextField txtB4K3_6;
    private pkl49.component.TextField txtB4K3_7;
    private pkl49.component.TextField txtB4K3_8;
    private pkl49.component.TextField txtB4K3_9;
    private pkl49.component.TextField txtB4K4_1;
    private pkl49.component.TextField txtB4K4_10;
    private pkl49.component.TextField txtB4K4_11;
    private pkl49.component.TextField txtB4K4_12;
    private pkl49.component.TextField txtB4K4_13;
    private pkl49.component.TextField txtB4K4_14;
    private pkl49.component.TextField txtB4K4_15;
    private pkl49.component.TextField txtB4K4_16;
    private pkl49.component.TextField txtB4K4_17;
    private pkl49.component.TextField txtB4K4_18;
    private pkl49.component.TextField txtB4K4_19;
    private pkl49.component.TextField txtB4K4_2;
    private pkl49.component.TextField txtB4K4_20;
    private pkl49.component.TextField txtB4K4_21;
    private pkl49.component.TextField txtB4K4_22;
    private pkl49.component.TextField txtB4K4_23;
    private pkl49.component.TextField txtB4K4_24;
    private pkl49.component.TextField txtB4K4_25;
    private pkl49.component.TextField txtB4K4_3;
    private pkl49.component.TextField txtB4K4_4;
    private pkl49.component.TextField txtB4K4_5;
    private pkl49.component.TextField txtB4K4_6;
    private pkl49.component.TextField txtB4K4_7;
    private pkl49.component.TextField txtB4K4_8;
    private pkl49.component.TextField txtB4K4_9;
    private pkl49.component.TextField txtB4K5_1;
    private pkl49.component.TextField txtB4K5_10;
    private pkl49.component.TextField txtB4K5_11;
    private pkl49.component.TextField txtB4K5_12;
    private pkl49.component.TextField txtB4K5_13;
    private pkl49.component.TextField txtB4K5_14;
    private pkl49.component.TextField txtB4K5_15;
    private pkl49.component.TextField txtB4K5_16;
    private pkl49.component.TextField txtB4K5_17;
    private pkl49.component.TextField txtB4K5_18;
    private pkl49.component.TextField txtB4K5_19;
    private pkl49.component.TextField txtB4K5_2;
    private pkl49.component.TextField txtB4K5_20;
    private pkl49.component.TextField txtB4K5_21;
    private pkl49.component.TextField txtB4K5_22;
    private pkl49.component.TextField txtB4K5_23;
    private pkl49.component.TextField txtB4K5_24;
    private pkl49.component.TextField txtB4K5_25;
    private pkl49.component.TextField txtB4K5_3;
    private pkl49.component.TextField txtB4K5_4;
    private pkl49.component.TextField txtB4K5_5;
    private pkl49.component.TextField txtB4K5_6;
    private pkl49.component.TextField txtB4K5_7;
    private pkl49.component.TextField txtB4K5_8;
    private pkl49.component.TextField txtB4K5_9;
    private pkl49.component.TextField txtB4K6_1;
    private pkl49.component.TextField txtB4K6_10;
    private pkl49.component.TextField txtB4K6_11;
    private pkl49.component.TextField txtB4K6_12;
    private pkl49.component.TextField txtB4K6_13;
    private pkl49.component.TextField txtB4K6_14;
    private pkl49.component.TextField txtB4K6_15;
    private pkl49.component.TextField txtB4K6_16;
    private pkl49.component.TextField txtB4K6_17;
    private pkl49.component.TextField txtB4K6_18;
    private pkl49.component.TextField txtB4K6_19;
    private pkl49.component.TextField txtB4K6_2;
    private pkl49.component.TextField txtB4K6_20;
    private pkl49.component.TextField txtB4K6_21;
    private pkl49.component.TextField txtB4K6_22;
    private pkl49.component.TextField txtB4K6_23;
    private pkl49.component.TextField txtB4K6_24;
    private pkl49.component.TextField txtB4K6_25;
    private pkl49.component.TextField txtB4K6_3;
    private pkl49.component.TextField txtB4K6_4;
    private pkl49.component.TextField txtB4K6_5;
    private pkl49.component.TextField txtB4K6_6;
    private pkl49.component.TextField txtB4K6_7;
    private pkl49.component.TextField txtB4K6_8;
    private pkl49.component.TextField txtB4K6_9;
    private pkl49.component.TextField txtB4K7_1;
    private pkl49.component.TextField txtB4K7_10;
    private pkl49.component.TextField txtB4K7_11;
    private pkl49.component.TextField txtB4K7_12;
    private pkl49.component.TextField txtB4K7_13;
    private pkl49.component.TextField txtB4K7_14;
    private pkl49.component.TextField txtB4K7_15;
    private pkl49.component.TextField txtB4K7_16;
    private pkl49.component.TextField txtB4K7_17;
    private pkl49.component.TextField txtB4K7_18;
    private pkl49.component.TextField txtB4K7_19;
    private pkl49.component.TextField txtB4K7_2;
    private pkl49.component.TextField txtB4K7_20;
    private pkl49.component.TextField txtB4K7_21;
    private pkl49.component.TextField txtB4K7_22;
    private pkl49.component.TextField txtB4K7_23;
    private pkl49.component.TextField txtB4K7_24;
    private pkl49.component.TextField txtB4K7_25;
    private pkl49.component.TextField txtB4K7_3;
    private pkl49.component.TextField txtB4K7_4;
    private pkl49.component.TextField txtB4K7_5;
    private pkl49.component.TextField txtB4K7_6;
    private pkl49.component.TextField txtB4K7_7;
    private pkl49.component.TextField txtB4K7_8;
    private pkl49.component.TextField txtB4K7_9;
    private pkl49.component.TextField txtB4K8_1;
    private pkl49.component.TextField txtB4K8_10;
    private pkl49.component.TextField txtB4K8_11;
    private pkl49.component.TextField txtB4K8_12;
    private pkl49.component.TextField txtB4K8_13;
    private pkl49.component.TextField txtB4K8_14;
    private pkl49.component.TextField txtB4K8_15;
    private pkl49.component.TextField txtB4K8_16;
    private pkl49.component.TextField txtB4K8_17;
    private pkl49.component.TextField txtB4K8_18;
    private pkl49.component.TextField txtB4K8_19;
    private pkl49.component.TextField txtB4K8_2;
    private pkl49.component.TextField txtB4K8_20;
    private pkl49.component.TextField txtB4K8_21;
    private pkl49.component.TextField txtB4K8_22;
    private pkl49.component.TextField txtB4K8_23;
    private pkl49.component.TextField txtB4K8_24;
    private pkl49.component.TextField txtB4K8_25;
    private pkl49.component.TextField txtB4K8_3;
    private pkl49.component.TextField txtB4K8_4;
    private pkl49.component.TextField txtB4K8_5;
    private pkl49.component.TextField txtB4K8_6;
    private pkl49.component.TextField txtB4K8_7;
    private pkl49.component.TextField txtB4K8_8;
    private pkl49.component.TextField txtB4K8_9;
    private pkl49.component.TextField txtB4K9_1;
    private pkl49.component.TextField txtB4K9_10;
    private pkl49.component.TextField txtB4K9_11;
    private pkl49.component.TextField txtB4K9_12;
    private pkl49.component.TextField txtB4K9_13;
    private pkl49.component.TextField txtB4K9_14;
    private pkl49.component.TextField txtB4K9_15;
    private pkl49.component.TextField txtB4K9_16;
    private pkl49.component.TextField txtB4K9_17;
    private pkl49.component.TextField txtB4K9_18;
    private pkl49.component.TextField txtB4K9_19;
    private pkl49.component.TextField txtB4K9_2;
    private pkl49.component.TextField txtB4K9_20;
    private pkl49.component.TextField txtB4K9_21;
    private pkl49.component.TextField txtB4K9_22;
    private pkl49.component.TextField txtB4K9_23;
    private pkl49.component.TextField txtB4K9_24;
    private pkl49.component.TextField txtB4K9_25;
    private pkl49.component.TextField txtB4K9_3;
    private pkl49.component.TextField txtB4K9_4;
    private pkl49.component.TextField txtB4K9_5;
    private pkl49.component.TextField txtB4K9_6;
    private pkl49.component.TextField txtB4K9_7;
    private pkl49.component.TextField txtB4K9_8;
    private pkl49.component.TextField txtB4K9_9;
    // End of variables declaration//GEN-END:variables

}
