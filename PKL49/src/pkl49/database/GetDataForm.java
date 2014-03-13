/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;
import java.util.List;
import pkl49.component.TextField;
import pkl49.database.entity.*;
import pkl49.view.PanelKuesioner;
/**
 *
 * @author Mr.Hands
 */
public class GetDataForm {
    private PanelKuesioner panelKuesioner;
    public GetDataForm(PanelKuesioner panelKuesioner) {
        this.panelKuesioner = panelKuesioner;
    }

    /**
    * Fungsi yang digunakan untuk mendapatkan setiap teks yang ada di form
    * @param indeks untuk mendapatkan posisi dari list textfield
    * @param halaman untuk menentukan halaman dimana textfield berada
    * @return hasil dari text dari textfield yang kita inginkan
    */
    protected String getText(int indeks,String halaman){
            String isiText = null;
        if(halaman.equals("Hal1"))
             isiText= panelKuesioner.getHalaman1().getListHalaman1().get(indeks).getText();
        else if(halaman.equals("B5A"))
             isiText=panelKuesioner.getHalaman3_1().getListBlok5A().get(indeks).getText();
        else if(halaman.equals("B5B"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5B().get(indeks).getText();
        else if(halaman.equals("B5"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5().get(indeks).getText();
        else if(halaman.equals("B5C"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5C().get(indeks).getText();
        else if(halaman.equals("B5D"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5D().get(indeks).getText();
        else if(halaman.equals("B5E"))
            isiText= panelKuesioner.getHalaman3_1().getListBlok5E().get(indeks).getText();
        else if(halaman.equals("B6"))
            isiText=panelKuesioner.getHalaman4().getListBlok6().get(indeks).getText();
        else if(halaman.equals("B7A"))
            isiText=panelKuesioner.getHalaman5().getListBlok7A().get(indeks).getText();
        else if(halaman.equals("B7B"))
            isiText=panelKuesioner.getHalaman6().getListBlok7B().get(indeks).getText();
        else if(halaman.equals("B8A1"))
            isiText=panelKuesioner.getHalaman7().getListBlok8AKol2().get(indeks).getText();
        else if(halaman.equals("B8A2"))
            isiText=panelKuesioner.getHalaman7().getListBaris26().get(indeks).getText();

        else if(halaman.equals("B8B"))
            isiText=panelKuesioner.getHalaman8().getListBlok8B().get(indeks).getText();
        else if(halaman.equals("B8C"))
            isiText=panelKuesioner.getHalaman9().getListBlok8C().get(indeks).getText();

        return isiText;
    }
    /**
     * Hampir sama dengan fungsi getText dengan 2 parameter
     * @param i digunakan untuk mengacu pada deretan list ke berapa
     * @param j digunakan untuk mengakses dari textfield yang telah dibuat list sebelumnya
     * @param halaman mengacu pada halaman dimana textfield berada
     * @return text dari textfield yang diinginkan
     */
    protected String getText(int i,int j,String halaman){
        String isiText=null;
        if(halaman.equals("Hal2"))
                isiText=panelKuesioner.getHalaman2().getListHalaman2().get(i).get(j).getText();
        else if(halaman.equals("B8A3"))
            isiText=panelKuesioner.getHalaman7().getListBlok8AKol5().get(i).get(j).getText();
        else if(halaman.equals("B8A4"))
           isiText=panelKuesioner.getHalaman7().getListBlok8AKol13().get(i).get(j).getText();
        return isiText;

    }
     public Integer value(String nilai){

        if (nilai.equals("")){
            return null;
        }
        Integer data = new Integer(nilai);
        return data;
    }
   public String getNks() {
        String B1R1,B1R2,B1R3,B1R4,B1R5,B1R6,B1R7,B1R8,B1R9,NKS;
        B1R1=getText(0, "Hal1");
        B1R3=getText(2, "Hal1");
        B1R4=getText(3, "Hal1");
        B1R5=getText(4, "Hal1");
        B1R6=getText(5, "Hal1");
        B1R7=getText(6, "Hal1");
        NKS=B1R1+B1R3+B1R4+B1R5+B1R6+B1R7;
        return NKS;
    }
      public Blok5a getBlok5a(){
        Blok5a baru=new Blok5a();
        //dimulai dari 1 karena 0 nama gak usah dimasukan lagi
        baru.setNKS(getNks());
        baru.setB5R1A(value(getText(1, "B5")));
        baru.setNO_URUT(value(getText(2,"B5")));
        baru.setB5R2(value(getText( 3, "B5")));
        baru.setB5R3(value(getText( 4, "B5")));
        baru.setB5R4A1(getText(5, "B5"));
        baru.setB5R4A2 (value(getText(6,"B5")));
        baru.setB5R4B(value(getText( 7, "B5")));
        baru.setB5R4BLain(value(getText( 8, "B5")));
        baru.setB5R5(value(getText( 8, "B5")));
        //untuk list 9 di skip karena nama gak usa hh

        baru.setB5AR6A(value(getText(0, "B5A")));
        baru.setB5AR6B(value(getText(1, "B5A")));
        baru.setB5AR6C(value(getText( 2, "B5A")));
        baru.setB5AR6D(value(getText( 3, "B5A")));
        baru.setB5AR6E(value(getText( 4, "B5A")));
        baru.setB5AR6F(value(getText( 5, "B5A")));
        baru.setB5AR6G(value(getText( 6, "B5A")));
        baru.setB5AR6H(value(getText( 7, "B5A")));
        baru.setB5AR6HLain(value(getText( 8, "B5A")));
        baru.setB5AR7(value(getText( 9, "B5A")));
        baru.setB5AR8(value(getText( 10, "B5A")));
        baru.setB5AR9A(value(getText( 11, "B5A")));
        baru.setB5AR9B1(value(getText( 12, "B5A")));
        baru.setB5AR9B2(value(getText( 13, "B5A")));
        baru.setB5AR9B3(value(getText( 14, "B5A")));
        baru.setB5AR9B3Lain(value(getText( 15, "B5A")));
        baru.setB5AR10(value(getText( 16, "B5A")));
        baru.setB5AR11A(value(getText( 17, "B5A")));
        baru.setB5AR11B(value(getText( 18, "B5A")));
        baru.setB5AR11C(value(getText( 19, "B5A")));
        baru.setB5AR11D(value(getText( 20, "B5A")));
        baru.setB5AR11E(value(getText( 21, "B5A")));
        baru.setB5AR11F(value(getText( 22, "B5A")));
        baru.setB5AR11G(value(getText( 23, "B5A")));
        baru.setB5AR11H(value(getText( 24, "B5A")));
        baru.setB5AR11Lain(value(getText( 25, "B5A")));
        baru.setB5AR12(value(getText( 26, "B5A")));
        baru.setB5AR13A(value(getText( 27, "B5A")));
        baru.setB5AR13B(value(getText( 28, "B5A")));
        baru.setB5AR13C(value(getText( 29, "B5A")));
        baru.setB5AR13D(value(getText( 30, "B5A")));
        baru.setB5AR13E(value(getText( 31, "B5A")));
        baru.setB5AR13F(value(getText( 32, "B5A")));
        baru.setB5AR13Lain(value(getText( 33, "B5A")));
        return baru;
      }
       public Blok5b getBlok5b(){
        Blok5b baru=new Blok5b();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(2,"B5")));
        baru.setB5BR14A(getText( 0, "B5B"));
        baru.setB5BR14B(getText( 1, "B5B"));
        baru.setB5BR14C(getText( 2, "B5B"));
        baru.setB5BR15A(value(getText( 3, "B5B")));
        baru.setB5BR15B(value(getText( 4, "B5B")));
        baru.setB5BR16(value(getText( 5, "B5B")));
        baru.setB5BR16Lain(value(getText( 6, "B5B")));
        baru.setB5BR17_1(value(getText( 7, "B5B")));
        baru.setB5BR17_2(value(getText( 8, "B5B")));
        baru.setB5BR17_3(value(getText( 9, "B5B")));
        baru.setB5BR17_4(value(getText( 10, "B5B")));
        baru.setB5BR17_5(value(getText( 11, "B5B")));
        baru.setB5BR17_6(value(getText( 12, "B5B")));
        baru.setB5BR17_6Lain(value(getText( 13, "B5B")));
        baru.setB5BR18A(value(getText( 14, "B5B")));
        baru.setB5BR18B1(value(getText( 15, "B5B")));
        baru.setB5BR18B2(value(getText( 16, "B5B")));
        baru.setB5BR18B3(value(getText( 17, "B5B")));
        return baru;

    }
    public Blok5c getBlok5c(){
        Blok5c baru=new Blok5c();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(2,"B5")));
        baru.setB5CR19(value(getText(0, "B5C")));
        baru.setB5CR20(value(getText( 1, "B5C")));
        baru.setB5CR21(value(getText( 2, "B5C")));
        baru.setB5CR22A(value(getText( 3, "B5C")));
        baru.setB5CR22B(value(getText( 4, "B5C")));
        return baru;

    }
    public Blok5de getBlok5de(){
        Blok5de baru=new Blok5de();
        baru.setNKS(getNks());
        baru.setNO_URUT(value(getText(2,"B5"))); 
        baru.setB5DR23_1(value(getText(0,"B5D")));
        baru.setB5DR23_2(value(getText(1,"B5D")));
        baru.setB5DR23_3(value(getText(2,"B5D")));
        baru.setB5DR23_4(value(getText(3,"B5D")));
        baru.setB5DR23_5(value(getText(4,"B5D")));
        baru.setB5DR23Lain(value(getText(5, "B5D")));
        baru.setB5DR24(value(getText(6,"B5D")));
        baru.setB5DR25(value(getText(7,"B5D")));
        baru.setB5DR25Lengkap(getText(8,"B5D"));
        baru.setB5DR26a(value(getText(9,"B5D")));
        baru.setB5DR26b(value(getText(10,"B5D")));
        baru.setB5DR26c(value(getText(11,"B5D")));
        baru.setB5DR26d(value(getText(12,"B5D")));
        baru.setB5DR27A(value(getText(13,"B5D")));
        baru.setB5DR27ALS(value(getText(14,"B5D")));
        baru.setB5DR27B(value(getText(15,"B5D")));
        baru.setB5DR27BLain(value(getText(16,"B5D")));
        baru.setB5DR27C(value(getText(17,"B5D")));
        baru.setB5DR27D(value(getText(18,"B5D")));
        baru.setB5DR27E1(value(getText(19,"B5D")));
        baru.setB5DR27E2(value(getText(20,"B5D")));
        baru.setB5DR27E3(value(getText(21,"B5D")));
        baru.setB5DR27E4(value(getText(22,"B5D")));
        baru.setB5DR27E5(value(getText(23,"B5D")));
        baru.setB5DR27E5Lain(value(getText(24,"B5D")));
        baru.setB5DR28(value(getText(25,"B5D")));
        baru.setB5DR28Lain(value(getText(26,"B5D")));
        baru.setB5DR29A(value(getText(27,"B5D")));
        baru.setB5DR29ALS(value(getText(28,"B5D")));
        baru.setB5DR29B1(value(getText(29,"B5D")));
        baru.setB5DR29B2(value(getText(30,"B5D")));
        baru.setB5DR29B3(value(getText(31,"B5D")));
        baru.setB5DR29B4(value(getText(32,"B5D")));
        baru.setB5DR29BLain(value(getText(33,"B5D")));
        baru.setB5ER30A(value(getText(34,"B5D")));
        baru.setB5ER30ALS(value(getText(35,"B5D")));
        baru.setB5ER30B(value(getText(36,"B5D")));
        baru.setB5ER30C1(getText(37,"B5D"));
        baru.setB5ER30C2(getText(38,"B5D"));
        baru.setB5ER30C3(getText(39,"B5D"));
        return baru;
    }
    public Blok8c getBlok8c(List<TextField> t){
        Blok8c b = new Blok8c();
        b.setNKS(getNks());
        b.setNO_URUT(t.get(0).getInt());
        b.setB8CR1(t.get(2).getInt());
        b.setB8CR2(t.get(3).getInt());
        b.setB8CR3(t.get(4).getInt());
        b.setB8CR4(t.get(5).getInt());
        b.setB8CR5(t.get(6).getInt());
        b.setB8CR6(t.get(7).getInt());
        b.setB8CR7(t.get(8).getInt());
        b.setB8CR8(t.get(9).getInt());
        b.setB8CR9(t.get(10).getInt());
        b.setB8CR10(t.get(11).getInt());
        b.setB8CR11(t.get(12).getInt());
        b.setB8CR12(t.get(13).getInt());
        b.setB8CR13(t.get(14).getInt());
        b.setB8CR14(t.get(15).getInt());
        b.setB8CR15(t.get(16).getInt());
        b.setB8CR16(t.get(17).getInt());
        b.setB8CR17(t.get(18).getInt());
        b.setB8CR18(t.get(19).getInt());
       
        return b;
    }
}
