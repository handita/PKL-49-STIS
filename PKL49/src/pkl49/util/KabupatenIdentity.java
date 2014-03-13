
package pkl49.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr.Hands
 */
public class KabupatenIdentity {
    private Hashtable<String,String> KabDic,KecDic,DesaDic;
    private Object[][] object;
    public KabupatenIdentity() {


            KabDic = new Hashtable<String, String>();
            KecDic = new Hashtable<String, String>();
            DesaDic = new Hashtable<String, String>();

            /**
             * Kabupaten identity
             */
            KabDic.put("10","Ogan Ilir");
            KabDic.put("71", "Palembang");
            KabDic.put("06", "Musi Banyuasin");
            KabDic.put("03", "Muara Enim");
            KabDic.put("08", "OKU Selatan");
            KabDic.put("02", "OKI");
            /**
             * Kecamatan identity
             */
             KecDic=getIdentity("DaftarKecamatan.pkl49");
             DesaDic=getIdentity("DaftarDesa.pkl49");

    }
    /**
     * namafile
     * @param namafile
     * @return
     */
    public  Hashtable<String,String> getIdentity(String namafile){
       Hashtable<String, String> kamus = new Hashtable<String, String>();
        try{
            File file=new File(System.getProperty("user.dir")+"/"+namafile);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(";");
            int jmlData=0;
            while(scanner.hasNext()){
           scanner.next();
                jmlData++;

            }
            object=new Object[jmlData][2];
            scanner.close();
            scanner=new Scanner(file);
            scanner.useDelimiter(";");
            for(int i=0;i<jmlData/2;i++)
               for(int j=0;j<2;j++)
                  object[i][j]=scanner.next();
            for(int i=0;i<jmlData/2;i++){
                String a=String.valueOf(object[i][0]);
                String b=String.valueOf(object[i][1]);
              //  System.out.println(a);
                kamus.put(a,b);
            }


        } catch (FileNotFoundException ex) {
            Logger.getLogger(KabupatenIdentity.class.getName()).log(Level.SEVERE, null, ex);
        }

       return kamus;
    }

    public Hashtable<String, String> getKabDic() {
        return KabDic;
    }

    public Hashtable<String, String> getDesaDic() {
        return DesaDic;
    }

    public void setDesaDic(Hashtable<String, String> DesaDic) {
        this.DesaDic = DesaDic;
    }


    public void setKabDic(Hashtable<String, String> KabDic) {
        this.KabDic = KabDic;
    }

    public Hashtable<String, String> getKecDic() {
        return KecDic;
    }

    public void setKecDic(Hashtable<String, String> KecDic) {
        this.KecDic = KecDic;
    }

    public Object[][] getObject() {
        return object;
    }

    public void setObject(Object[][] object) {
        this.object = object;
    }


      public static void main(String [] Args) throws URISyntaxException{
        System.out.println(new KabupatenIdentity().getDesaDic().get("71081003"));
    //    System.out.println(new KabupatenIdentity().getKecDic().get("71080"));
      //  System.out.println(new KabupatenIdentity().getKabDic().get("710"));

      }
}





