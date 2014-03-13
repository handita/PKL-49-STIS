package pkl49.util;
 import java.awt.event.MouseAdapter;
 import java.awt.event.MouseEvent;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import pkl49.view.PanelKuesioner;

public class PopUpHalamanSelection
{
   private PanelKuesioner kuesioner;
   private List<JComponent> components=new ArrayList<JComponent>();
   private JPopupMenu popupMenu=new JPopupMenu();
   private JRadioButton [] Halaman=new JRadioButton[10];
   public PopUpHalamanSelection(PanelKuesioner pk)
   {
       this.kuesioner=pk;
        for(int i=0;i<9;i++){
            String a="Halaman"+i;
            Halaman[i]=new JRadioButton();
            Halaman[i].setText(a);
            popupMenu.add(Halaman[i]);
        }
        for(int i=0;i<9;i++){
            Halaman[i].addActionListener(new ItemHandler());
        }

        components.add(kuesioner.getHalaman1());
        components.add(kuesioner.getHalaman2());
        for(int i=0;i<kuesioner.getListHal3().size();i++){
            components.add(kuesioner.getListHal3().get(i));
        }
        components.add(kuesioner.getHalaman4());
        components.add(kuesioner.getHalaman5());
        components.add(kuesioner.getHalaman6());
        components.add(kuesioner.getHalaman7());
        components.add(kuesioner.getHalaman8());
        components.add(kuesioner.getHalaman9());

         for(int i=0;i<components.size();i++)       {
        components.get(i). addMouseListener(
         new MouseAdapter() 
         {
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
   } 


   private class ItemHandler implements ActionListener
   {

      public void actionPerformed( ActionEvent event )
      {
         for ( int i = 0 ; i < Halaman.length; i++ )
         {
            if ( event.getSource() == Halaman[ i ] )
            {
              JOptionPane.showMessageDialog(null, "Anda memilih "+ Halaman[i]);
               return;
            }
         } 
      } 
   } 
}





