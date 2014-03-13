/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Digunakan untuk membuat searching pada nama pencacah dan nim
 * @author Mr.Hands
 */
public class PencacahIdentity {
    private Hashtable<String,String> PencacahDic;
    private Object[][] object;
    public PencacahIdentity() {
        try {
            PencacahDic = new Hashtable<String, String>();
            File file=new File(System.getProperty("user.dir")+"/DataPengentri.pkl49");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");
            int jmlData=0;
            while(scanner.hasNext()){
                scanner.next();
                jmlData++;
            }
            object=new Object[jmlData][2];
            scanner.close();
            scanner=new Scanner(file);
            scanner.useDelimiter(",");
            for(int i=0;i<275;i++)
               for(int j=0;j<2;j++)
                  object[i][j]=scanner.next();
            for(int i=0;i<275;i++){
                String a=String.valueOf(object[i][0]);
                String b=String.valueOf(object[i][1]);
              PencacahDic.put(a,b);
            }
          //  String nama=PencacahDic.get("07.5537");
            //System.out.println(nama);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PencacahIdentity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Hashtable<String, String> getPencacahDic() {
        return PencacahDic;
    }

    public void setPencacahDic(Hashtable<String, String> PencacahDic) {
        this.PencacahDic = PencacahDic;
    }

    

    public Object[][] getObject() {
        return object;
    }

    public void setObject(Object[][] object) {
        this.object = object;
    }

      public static void main(String [] Args) throws URISyntaxException{
         System.out.println(PencacahIdentity.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
      }
    }





