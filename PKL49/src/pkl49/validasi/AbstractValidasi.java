/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.validasi;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import pkl49.component.TextField;
import pkl49.view.PanelKuesioner;

/**
 * Kelas ini merupakan template untuk validasi.
 * Di dalamnya terdapat beberapa metode yang secara umum digunakan dalam validasi.
 * @author kean
 */
public class AbstractValidasi extends KeyAdapter{

    /**List TextField*/
    protected List<TextField> list;
    protected List<List<TextField>> list2D;
    protected PanelKuesioner kuesioner;
    protected int ENTER = 0;
    protected int UP = 1;
    protected int DOWN = 2;
    protected int RIGHT = 3;
    protected int LEFT = 4;
    protected int DIGIT = 5;

    public AbstractValidasi() {

    }
    public AbstractValidasi(PanelKuesioner kuesioner) {
        this.kuesioner = kuesioner;
    }

    /**
     * Menambah keyListener pada textField.
     * @param list
     * List TextField
     */
    protected void setList(List<TextField> list) {
        this.list = list;
        for(int i=0;i<this.list.size();i++){
            this.list.get(i).addKeyListener(this);
        }
    }
    /**
     * Menambah keyListener pada textField pada list dua dimensi.
     * @param list
     * List TextField 2 dimensi
     */
    protected void setList2D(List<List<TextField>> list2D) {
        this.list2D = list2D;
        for(int i=0;i<this.list2D.size();i++){
            for(int j=0;j<this.list2D.get(i).size();j++){
                this.list2D.get(i).get(j).addKeyListener(this);
            }
        }
    }

    /**
     * Mendapatkan list textField.
     * @return
     * List TextField
     */
    protected List<TextField> getList() {
        return list;
    }

    /**
     * Mendapatkan list textField 2 dimensi.
     * @return
     * List TextField 2 dimensi
     */
    protected List<List<TextField>> getList2D() {
        return list2D;
    }

    /**
     *
     * @return
     */
    protected PanelKuesioner getKuesioner() {
        return kuesioner;
    }

    /**
     * 
     * @param kuesioner
     */
    protected void setKuesioner(PanelKuesioner kuesioner) {
        this.kuesioner = kuesioner;
    }
    /**
     * Mengecek komponen yang mendapat focus
     * @param e
     * KeyEvent
     * @param t
     * TextField yang menjadi focus
     * @return
     * Bernilai true jika komponen yang mendapat event sama dengan TextField t
     */
    protected boolean checkTextField(KeyEvent e, TextField t){
        if(e.getComponent()==t )
            return true;
        else
            return false;
    }
    /**
     * Mengecek tombol yang ditekan ketika textField mendapat focus.
     * Ada lima macam tombol yang dicek: ENTER, PANAH ATAS, PANAH BAWAH,
     * PANAH KANAN, PANAH KIRI, dan ANGKA.
     * @param e
     * KeyEvent
     * @param t
     * TextField yang menjadi focus
     * @return
     * Nilai kode tombol
     */
    protected int checkKey(KeyEvent e, TextField t){

       if(e.getComponent()==t && e.getKeyCode()==KeyEvent.VK_ENTER)
            return ENTER;
        else if(e.getComponent()==t && e.getKeyCode()==KeyEvent.VK_UP)
            return UP;
        else if(e.getComponent()==t && e.getKeyCode()==KeyEvent.VK_DOWN)
            return DOWN;
        else if(e.getComponent()==t && e.getKeyCode()==KeyEvent.VK_RIGHT)
            return RIGHT;
        else if(e.getComponent()==t && e.getKeyCode()==KeyEvent.VK_LEFT)
            return LEFT;
        else if(e.getComponent()==t && e.getKeyChar()>=t.getMinDigit() 
            && e.getKeyChar()<=t.getMaxDigit() && t.getText().length()==t.getLength())
            return DIGIT;
        else
            return -1;
    }

    /**
     * Mengecek apakah data sebelumnya masih kosong.
     * @param from
     * Index awal pengecekan.
     * @param to
     * Index akhir pengecekan.
     * @return
     * Jika ada data yang masih kosong metode ini bernilai true.
     */
    protected boolean checkEmpty(int from, int to){
        boolean empty = false;
        for(int i=from;i<=to;i++){
            if(list.get(i).isEnabled() && list.get(i).getText().trim().equals("")){
                message("Data sebelumnya belum terisi lengkap! Silakan lengkapi dahulu...!");
                next(list.get(i));
                empty = true;
                break;
            }
        }
        return empty;
    }

    protected void moveDown(int from){
        int i=from+1;
        boolean move=true;
        while(move && i<list.size()){
            if(list.get(i).isEnabled()){
                list.get(i).requestFocusInWindow();
                move = false;
            }else
                i++;
        }
    }
    protected void moveUp(int from){
        int i=from-1;
        boolean move=true;
        while(move && i>=0){
            if(list.get(i).isEnabled()){
                list.get(i).requestFocusInWindow();
                move = false;
            }else
                i--;
        }
    }
    /**
     * Menampilkan halaman pada cardLayout
     * @param panel
     * Panel yang akan ditampilkan
     * @param nama
     * Nama panel
     */
    protected  void showPanel(Component panel, String nama){
        if (panel.isVisible()){
            return;
        }
        ((CardLayout)kuesioner.getPanelInduk().getLayout()).show(kuesioner.getPanelInduk(), nama);
    }

    /**
     * Menampilkan pesan kesalahan/peringatan
     * @param s
     * Pesan kesalahan
     */
    protected void message(String s){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, s);
    }
    /**
     * Memindahkan focus textfield ke textField berikutnya
     * @param t
     * TextField yang akan mendapat focus
     */
    protected void next(TextField t){
        if(!t.isEnabled())
            t.setEnabled(true);
        t.requestFocusInWindow();
    }
    
    /**
     * Memindahkan focus textfield ke textField berikutnya yang berbeda halaman.
     * @param t
     * TextField yang akan mendapat focus
     * @param page
     * Nama halaman
     */
    protected void nextPage(TextField t, String page){
        if(!t.isEnabled())
            t.setEnabled(true);
        showPanel(t.getParent(), page);
        t.requestFocusInWindow();
    }

    /**
     * Memindahkan focus textfield1 ke textField2 dengan melewati beberapa textfield.
     * TextField yang berada diantara textField1 dan textField2 disable dan textField2 mendapatkan focus.
     * @param l
     * ListTextField
     * @param from
     * Index textField awal
     * @param to
     * Index textField akhir
     */
    protected void skipTo(List<TextField> l,int from, int to){
        for(int i=from+1;i<to;i++){
            l.get(i).setText(null);
            l.get(i).setEnabled(false);
        }
        next(l.get(to));
    }
    /**
     * Memindahkan focus textfield1 ke textField2 dengan melewati beberapa textfield
     * pada list textField dua dimensi.
     * TextField yang berada diantara textField1 dan textField2 disable tetapi textField2 tidak mendapatkan focus.
     * @param l
     * List TextField dua dimensi
     * @param from
     * Index textField awal
     * @param to
     * Index textField akhir
     * @param row
     * Index List<List<TextField>>
     */
    protected void skipTo(List<List<TextField>> l, int from, int to, int row){
        for(int i=from+1;i<to;i++){
            l.get(row).get(i).setText(null);
            l.get(row).get(i).setEnabled(false);
        }
    }
}

