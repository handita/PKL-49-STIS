package pkl49.util;
import java.awt.CardLayout;
import java.awt.Component;
 import java.awt.event.MouseAdapter;
 import java.awt.event.MouseEvent;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import pkl49.view.FormUtama;

public class PopUpHalamanSelection1
{
   private FormUtama kuesioner;
   private JPopupMenu popupMenu=new JPopupMenu();
   private List<JComponent> components=new ArrayList<JComponent>();
   private JRadioButton [] Halaman=new JRadioButton[40];
   private String [] card=new String[40];
   public PopUpHalamanSelection1(FormUtama pk)
   {
       int indeks=1,indeksa=1,indeksb=1,indeksB=1;
       this.kuesioner=pk;
        for(int i=1;i<40;i++){
            String a = null;
            if(i>=3 && i<=27){
                if(i==3)
                    indeksB++;
               a="Halaman3_"+indeks++;
            } else if(i>=32 && i<=35){
                if(i==32)indeksB++;
                a="Halaman8_"+indeksa++;
            }else if(i>=36){
                if(i==36) indeksB++;
                    a="Halaman9_"+indeksb++;

            }else{

                a="Halaman"+indeksB++;
            }
            Halaman[i-1]=new JRadioButton();
            Halaman[i-1].setText(a);
            card[i-1]=a;
            popupMenu.add(Halaman[i-1]);
        }
       for(int i=0;i<card.length;i++){
           System.out.println(card[i]);
       }
        for(int i=0;i<Halaman.length;i++){
            System.out.println(i);
            Halaman[i].addActionListener(new ItemHandler());
        }
//        components.add(kuesioner.getPanelKuesioner1().getHalaman1());
//        components.add(kuesioner.getPanelKuesioner1().getHalaman2());
//        for(int i=0;i<kuesioner.getPanelKuesioner1().getListHal3().size();i++){
//            components.add(kuesioner.getPanelKuesioner1().getListHal3().get(i));
//        }
//        components.add(kuesioner.getPanelKuesioner1().getHalaman4());
//        components.add(kuesioner.getPanelKuesioner1().getHalaman5());
//        components.add(kuesioner.getPanelKuesioner1().getHalaman6());
//        components.add(kuesioner.getPanelKuesioner1().getHalaman7());
//        for(int i=0;i<kuesioner.getPanelKuesioner1().getListHal8().size();i++)
//            components.add(kuesioner.getPanelKuesioner1().getHalaman8().getListBlok8B().get(i));
//        for(int i=0;i<kuesioner.getPanelKuesioner1().getListHal9().size();i++)
//            components.add(kuesioner.getPanelKuesioner1().getListHal9().get(i));


       kuesioner.getContentPane().addMouseListener(
         new MouseAdapter() 
         {
            @Override
            public void mousePressed( MouseEvent event )
            {
               jikaDitekan( event );
            }

            public void mouseReleased( MouseEvent event )
            {
               jikaDitekan( event );
            } 
            private void jikaDitekan( MouseEvent event )
            {
               if ( event.isPopupTrigger() )
                  popupMenu.show(event.getComponent(), event.getX(), event.getY() );
            }
         }
      );
         }
   


   private class ItemHandler implements ActionListener
   {

      public void actionPerformed( ActionEvent event )
      {
         for ( int i = 0 ; i < Halaman.length; i++ )
         {
             System.out.printf("%s  %s\n",Halaman[i],card[i]);
//            if ( event.getSource() == Halaman[i] )
//            {
//          //      JOptionPane.showMessageDialog(null, "Anda menekan "+card[i]);
//              showPanel(components.get(i), card[i]);
//               return;
//            }
         } 
      } 
   }
     /**
     * Menampilkan panel pada cardLayout
     * @param panel
     * @param nama
     * @param induk
     */
//     protected  void showPanel(Component panel, String nama){
//        if (panel.isVisible()){
//            return;
//        }
//        ((CardLayout)kuesioner.getPanelKuesioner1().getPanelInduk().getLayout()).show(kuesioner.getPanelKuesioner1().getPanelInduk(), nama);
//    }
}





