/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.util.transfer;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pkl49.database.Blok1DaoImpl;
import pkl49.database.KoneksiMysQl;
import pkl49.database.KuesionerDaoImpl;
import pkl49.database.entity.*;

/**
 *
 * @author Ade KeciL
 */
public class Ekspor {

    private static FileOutputStream fout = null;
    private static ObjectOutputStream out = null;
    private static FileInputStream fin = null;
    private static ObjectInputStream oi = null;

    /**
     * Menulis data ke dalam file .pkl49
     * @param list
     * @param fileName
     */
   public static void writeData(List<Object> list, String fileName){
       File dir = new File("Data");
       if(!dir.exists())
           dir.mkdir();
       File file = new File(System.getProperty("user.dir")+"/Data/"+fileName+".pkl49");
        try {
            fout = new FileOutputStream(file);
            out = new ObjectOutputStream(fout);
            out.writeObject(list);
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }
   public static void writePodesToFile(Podes podes,String filename){
        try {
            File dir = new File("DataPodes");
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file = new File(System.getProperty("user.dir") + "/DataPodes/" + filename + ".pkl49Podes");
            fout = new FileOutputStream(file);
            out = new ObjectOutputStream(fout);
            out.writeObject(podes);
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


   }
   /**
    * Membaca data dari file .pkl49
    * @param fileName
    * @return
    */
   public static List<Object> readData(String fileName){
       List<Object> ob = null;
       File file = new File(fileName);
       try {
            fin = new FileInputStream(file);
            oi = new ObjectInputStream(fin);
            ob = (List<Object>) oi.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                oi.close();
            } catch (IOException ex) {
                Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ob;
   }
   /**
    * Membaca data dari file .pkl49Podes
    * @param fileName
    * @return
    */
   public static Podes readDataFromPodes(String fileName){
       Podes podes = null;
       File file = new File(fileName);
       try {
            fin = new FileInputStream(file);
            oi = new ObjectInputStream(fin);
            podes = (Podes) oi.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                oi.close();
            } catch (IOException ex) {
                Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return podes;
   }

   /**
    * Menggabung data dari file ke DBMS
    * @param fileName
    * @throws SQLException
    */
   public static void merge(String fileName) throws SQLException{
       List<Object> list = readData(fileName);
       try{
           Blok1 b1 = (Blok1) list.get(0);
           Blok2 b2 = (Blok2) list.get(1);
           Blok3 b3 = (Blok3) list.get(2);
           List<Blok4> lb4 = (List<Blok4>) list.get(3);
           List<Blok5a> lb5 = (List<Blok5a>) list.get(4);
           List<Blok5b> lb5b = (List<Blok5b>) list.get(5);
           List<Blok5c> lb5c = (List<Blok5c>) list.get(6);
           List<Blok5de> lb5d = (List<Blok5de>) list.get(7);
           Blok6 b6 = (Blok6) list.get(8);
           Blok7a b7a = (Blok7a) list.get(9);
           Blok7b b7b = (Blok7b) list.get(10);
           List<Blok8a1> lb8a1 = (List<Blok8a1>) list.get(11);
           Blok8a2 lb8a2 = (Blok8a2) list.get(12);
           List<Blok8a3> lb8a3 = (List<Blok8a3>) list.get(13);
           List<Blok8a4> lb8a4 = (List<Blok8a4>) list.get(14);
           List<Blok8b> lb8b = (List<Blok8b>) list.get(15);
           List<Blok8c> lb8c = (List<Blok8c>) list.get(16);

           String nks = b1.getNKS();
           KuesionerDaoImpl dao = new KuesionerDaoImpl(b1, b2, b3, lb4, lb5, lb5b, lb5c, lb5d, b6, b7a, b7b, lb8a1, lb8a2, lb8a3, lb8a4, lb8b, lb8c);
           Blok1DaoImpl dao1 = new Blok1DaoImpl(KoneksiMysQl.getConnectionRT());
           Blok1 b = dao1.getBlok1(nks);
           if(b!=null){
               int op = JOptionPane.showConfirmDialog(null, "Data dengan NKS:"+nks+" sudah ada.\nMau diupdate?", "Confirm", JOptionPane.YES_NO_OPTION);
               if(op==JOptionPane.YES_OPTION){
                   dao.updateToDatabase();
               }else{
                   dao.insertToDatabase();
               }
           }else{
               dao.insertToDatabase();
           }
           KoneksiMysQl.closeConnectionRT();
       }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
       }
   }

   /**
    * Menulis SQL Statement INSERT unutk masing-masing tabel.
    * Data yang ditulis ke dalam file adalah data dalam file .pkl49.
    * Data dari tiap file dikumpulkan per blok ke dalam list.
    * @param namaFile nama file .sql
    */
   public static void createSQLFile(String namaFile){
        File dir = new File("Data");
        String[] fileName = null;
        List<String> listNama = new ArrayList<String>();
        if (dir.isDirectory()) {
            fileName = dir.list();
        }
        for(int i=0;i<fileName.length;i++){
            if(!fileName[i].contains("X")){
                listNama.add(fileName[i]);
            }
        }
        if(listNama.size()==0){
            JOptionPane.showMessageDialog(null,"Tidak ada data baru yang akan diekspor!");return;
        }
       //Insert statement untuk tiap tabel.
        String insertBlok1 = "INSERT INTO `blok1` (`B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5`, `B1R6`, `B1R7`, `B1R8`, `B1R9`, `NKS`, `Pengentri`) VALUES ";
        String insertBlok2 = "INSERT INTO `blok2` (`NKS`, `B2R1`, `B2R2`, `B2R3`, `B2R4`, `B2R5`, `B2R6`) VALUES ";
        String insertBlok3 = "INSERT INTO `blok3` (`NKS`, `B3R2`, `B3R3`, `B3R6`, `B3R7`) VALUES ";
        String insertBlok4 = "INSERT INTO `blok4` (`NKS`, `NO_URUT`, `B4K2`, `B4K3`, `B4K4`, `B4K5`, `B4K6`, `B4K7`, `B4K8`, `B4K9`) VALUES ";
        String insertBlok5a = "INSERT INTO `blok5a` (`NKS`, `B5R1A`, `NO_URUT`, `B5R2`, `B5R3`, `B5R4A1`, `B5R4A2`, `B5R4B`, `B5R4BLain`, `B5R5`, `B5AR6A`, `B5AR6B`, `B5AR6C`, `B5AR6D`, `B5AR6E`, `B5AR6F`, `B5AR6G`, `B5AR6H`, `B5AR6HLain`, `B5AR7`, `B5AR8`, `B5AR9A`, `B5AR9B1`, `B5AR9B2`, `B5AR9B3`, `B5AR9B3Lain`, `B5AR10`, `B5AR11A`, `B5AR11B`, `B5AR11C`, `B5AR11D`, `B5AR11E`, `B5AR11F`, `B5AR11G`, `B5AR11H`, `B5AR11Lain`, `B5AR12`, `B5AR13A`, `B5AR13B`, `B5AR13C`, `B5AR13D`, `B5AR13E`, `B5AR13F`, `B5AR13Lain`) VALUES ";
        String insertBlok5b = "INSERT INTO `blok5b` (`NKS`, `NO_URUT`, `B5BR14A`, `B5BR14B`, `B5BR14C`, `B5BR15A`, `B5BR15B`, `B5BR16`, `B5BR16Lain`, `B5BR17_1`, `B5BR17_2`, `B5BR17_3`, `B5BR17_4`, `B5BR17_5`, `B5BR17_6`, `B5BR17_6Lain`, `B5BR18A`, `B5BR18B1`, `B5BR18B2`, `B5BR18B3`) VALUES ";
        String insertBlok5c = "INSERT INTO `blok5c` (`NKS`, `NO_URUT`, `B5CR19`, `B5CR20`, `B5CR21`, `B5CR22A`, `B5CR22B`) VALUES ";
        String insertBlok5de = "INSERT INTO `blok5de` (`NKS`, `NO_URUT`, `B5DR23_1`, `B5DR23_2`, `B5DR23_3`, `B5DR23_4`, `B5DR23_5`, `B5DR23Lain`, `B5DR24`, `B5DR25`, `B5DR25Lengkap`, `B5DR26a`, `B5DR26b`, `B5DR26c`, `B5DR26d`, `B5DR27A`, `B5DR27B`, `B5DR27BLain`, `B5DR27C`, `B5DR27D`, `B5DR27E1`, `B5DR27E2`, `B5DR27E3`, `B5DR27E4`, `B5DR27E5`, `B5DR27E5Lain`, `B5DR28`, `B5DR28Lain`, `B5DR29A`, `B5DR29B1`, `B5DR29B2`, `B5DR29B3`, `B5DR29B4`, `B5DR29BLain`, `B5ER30A`, `B5ER30B`, `B5ER30C1`, `B5ER30C2`, `B5ER30C3`) VALUES ";
        String insertBlok6 = "INSERT INTO `blok6` (`NKS`, `B6R1`, `B6R1BTanah`, `B6R2`, `B6R3A`, `B6R3B`, `B6R4`, `B6R5`, `B6R5Lain`, `B6R6`, `B6R6Lain`, `B6R7`, `B6R8`, `B6R9`, `B6R10`, `B6R11`, `B6R12`, `B6R12Lain`, `B6R13`, `B6R14A`, `B6R14B`, `B6R14C1`, `B6R14C2`, `B6R14C3`) VALUES ";
        String insertBlok7a = "INSERT INTO `blok7a` (`NKS`, `B7AR1A`, `B7AR1B`, `B7AR2`, `B7AR3A`, `B7AR3B`, `B7AR4`, `B7AR5A`, `B7AR5B`, `B7AR6`, `B7AR7`, `B7AR8`, `B7AR9`, `B7AR10`, `B7AR11`, `B7AR12A`, `B7AR12B`, `B7AR13A`, `B7AR13B`, `B7AR13C`, `B7AR14A`, `B7AR14B`, `B7AR15`) VALUES ";
        String insertBlok7b = "INSERT INTO `blok7b` (`NKS`, `B7BR16A2`, `B7BR16A3`, `B7BR16B2`, `B7BR16B3`, `B7BR16C2`, `B7BR16C3`, `B7BR16D2`, `B7BR16D3`, `B7BR17A2`, `B7BR17A3`, `B7BR17B2`, `B7BR17B3`, `B7BR17C2`, `B7BR17C3`, `B7BR17D2`, `B7BR17D3`, `B7BR17E2`, `B7BR17E3`, `B7BR18_2`, `B7BR18_3`, `B7BR19_2`, `B7BR19_3`, `B7BR20A2`, `B7BR20A3`, `B7BR20B2`, `B7BR20B3`, `B7BR20C2`, `B7BR20C3`, `B7BR20D2`, `B7BR20D3`, `B7BR21_2`, `B7BR21_3`, `B7BR22_2`, `B7BR22_3`, `B7BR23`, `B7BR24`, `B7BR25`) VALUES ";
        String insertBlok8a1 = "INSERT INTO `blok8a1` (`NKS`, `NO_URUT`, `B8AK2`) VALUES ";
        String insertBlok8a2 = "INSERT INTO `blok8a2` (`NKS`, `B8AK3`, `B8AK3Lain`, `B8AK4`, `B8AK12`) VALUES ";
        String insertBlok8a3 = "INSERT INTO `blok8a3` (`NKS`, `NO_URUT`, `B8AK5`, `B8AK5ALS`, `B8AK6`, `B8AK7`, `B8AK8`, `B8AK9`, `B8AK10`, `B8AK11`) VALUES ";
        String insertBlok8a4 = "INSERT INTO `blok8a4` (`NKS`, `NO_URUT`, `B8AK13`, `B8AK13ALS`) VALUES ";
        String insertBlok8b = "INSERT INTO `blok8b` (`NKS`, `NO_URUT`, `B8BR1`, `B8BR2`, `B8BR3`, `B8BR4`, `B8BR5`, `B8BR6`, `B8BR7`, `B8BR8`, `B8BR9`, `B8BR10`, `B8BR11`, `B8BR12`, `B8BR13`, `B8BR14`, `B8BR15`, `B8BR16`) VALUES ";
        String insertBlok8c = "INSERT INTO `blok8c` (`NKS`, `NO_URUT`, `NO_URUTBAYI`, `B8CR1`, `B8CR2`, `B8CR3`, `B8CR4`, `B8CR5`, `B8CR6`, `B8CR7`, `B8CR8`, `B8CR9`, `B8CR10`, `B8CR11`, `B8CR12`, `B8CR13`, `B8CR14`, `B8CR15`, `B8CR16`, `B8CR17`, `B8CR18`) VALUES ";
        
        //List ini untuk menyimpan object tiap file
        List<Object> list = null;
        //list kelas entitas
        List<Blok1> listB1 = new ArrayList<Blok1>();
        List<Blok2> listB2 = new ArrayList<Blok2>();
        List<Blok3> listB3 = new ArrayList<Blok3>();
        List<Blok4> listB4 = new ArrayList<Blok4>();
        List<Blok5a> listB5a = new ArrayList<Blok5a>();
        List<Blok5b> listB5b = new ArrayList<Blok5b>();
        List<Blok5c> listB5c = new ArrayList<Blok5c>();
        List<Blok5de> listB5d = new ArrayList<Blok5de>();
        List<Blok6> listB6 = new ArrayList<Blok6>();
        List<Blok7a> listB7a = new ArrayList<Blok7a>();
        List<Blok7b> listB7b = new ArrayList<Blok7b>();
        List<Blok8a1> listB8a1 = new ArrayList<Blok8a1>();
        List<Blok8a2> listB8a2 = new ArrayList<Blok8a2>();
        List<Blok8a3> listB8a3 = new ArrayList<Blok8a3>();
        List<Blok8a4> listB8a4 = new ArrayList<Blok8a4>();
        List<Blok8b> listB8b = new ArrayList<Blok8b>();
        List<Blok8c> listB8c = new ArrayList<Blok8c>();

        //Membaca data dari file-file *.pkl49
        //dan menyimpannya dalam List entitas pada setiap tabel
        for (int i = 0; i < listNama.size(); i++) {
            list = readData(System.getProperty("user.dir") + "/Data/" + listNama.get(i));
            Blok1 b1 = (Blok1) list.get(0);
            listB1.add(b1); //list Blok1
            Blok2 b2 = (Blok2) list.get(1);
            listB2.add(b2); //list Blok2
            Blok3 b3 = (Blok3) list.get(2);
            listB3.add(b3); //list Blok3
            List<Blok4> lb4 = (List<Blok4>) list.get(3);
            for (int j = 0; j < lb4.size(); j++) {
                listB4.add(lb4.get(j)); //listBlok4
            }
            List<Blok5a> lb5 = (List<Blok5a>) list.get(4);
            for (int j = 0; j < lb5.size(); j++) {
                listB5a.add(lb5.get(j)); //listBlok5a
            }
            List<Blok5b> lb5b = (List<Blok5b>) list.get(5);
            for (int j = 0; j < lb5b.size(); j++) {
                listB5b.add(lb5b.get(j)); //listBlok5b
            }
            List<Blok5c> lb5c = (List<Blok5c>) list.get(6);
            for (int j = 0; j < lb5c.size(); j++) {
                listB5c.add(lb5c.get(j)); //listBlok5c
            }
            List<Blok5de> lb5d = (List<Blok5de>) list.get(7);
            for (int j = 0; j < lb5d.size(); j++) {
                listB5d.add(lb5d.get(j)); //listBlok5de
            }
            Blok6 b6 = (Blok6) list.get(8);
            listB6.add(b6); //listBlok6
            Blok7a b7a = (Blok7a) list.get(9);
            listB7a.add(b7a); //listBlok7a
            Blok7b b7b = (Blok7b) list.get(10);
            listB7b.add(b7b); //list Blok7b
            List<Blok8a1> lb8a1 = (List<Blok8a1>) list.get(11);
            for (int j = 0; j < lb8a1.size(); j++) {
                listB8a1.add(lb8a1.get(j)); //list Blok8a1
            }
            Blok8a2 lb8a2 = (Blok8a2) list.get(12);
            listB8a2.add(lb8a2); //list Blok8a2
            List<Blok8a3> lb8a3 = (List<Blok8a3>) list.get(13);
            for (int j = 0; j < lb8a3.size(); j++) {
                listB8a3.add(lb8a3.get(j)); //list Blok8a3
            }
            List<Blok8a4> lb8a4 = (List<Blok8a4>) list.get(14);
            for (int j = 0; j < lb8a4.size(); j++) {
                listB8a4.add(lb8a4.get(j)); //list Blok8a4
            }
            List<Blok8b> lb8b = (List<Blok8b>) list.get(15);
            for (int j = 0; j < lb8b.size(); j++) {
                listB8b.add(lb8b.get(j)); //list Blok8c
            }
            List<Blok8c> lb8c = (List<Blok8c>) list.get(16);
            for (int j = 0; j < lb8c.size(); j++) {
                listB8c.add(lb8c.get(j)); //list Blok8b
            }
        }
       
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(namaFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter output = new PrintWriter(bufferedWriter);
        
        //Menulis SQL statement insert
        for (int i = 0; i < listB1.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 1 -- \n");
                output.println(insertBlok1);
            }
            if (i == listB1.size() - 1) {
                output.println(listB1.get(i) + ";");
                output.println("-- Jumlah record = "+listB1.size()+" -- \n");
            } else {
                output.println(listB1.get(i) + ",");
            }
        }
        for (int i = 0; i < listB2.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 2 -- \n");
                output.println(insertBlok2);
            }
            if (i == listB2.size() - 1) {
                output.println(listB2.get(i) + ";");
                output.println("-- Jumlah record = "+listB2.size()+" -- \n");
            } else {
                output.println(listB2.get(i) + ",");
            }
        }
        for (int i = 0; i < listB3.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 3 -- \n");
                output.println(insertBlok3);
            }
            if (i == listB3.size() - 1) {
                output.println(listB3.get(i) + ";");
                output.println("-- Jumlah record = "+listB3.size()+" -- \n");
            } else {
                output.println(listB3.get(i) + ",");
            }
        }
        for (int i = 0; i < listB4.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 4 -- \n");
                output.println(insertBlok4);
            }
            if (i == listB4.size() - 1) {
                output.println(listB4.get(i) + ";");
                output.println("-- Jumlah record = "+listB4.size()+" -- \n");
            } else {
                output.println(listB4.get(i) + ",");
            }
        }
        for (int i = 0; i < listB5a.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 5A -- \n");
                output.println(insertBlok5a);
            }
            if (i == listB5a.size() - 1) {
                output.println(listB5a.get(i) + ";");
                output.println("-- Jumlah record = "+listB5a.size()+" -- \n");
            } else {
                output.println(listB5a.get(i) + ",");
            }
        }
        for (int i = 0; i < listB5b.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 5B -- \n");
                output.println(insertBlok5b);
            }
            if (i == listB5b.size() - 1) {
                output.println(listB5b.get(i) + ";");
                output.println("-- Jumlah record = "+listB5b.size()+" -- \n");
            } else {
                output.println(listB5b.get(i) + ",");
            }
        }
        for (int i = 0; i < listB5c.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 5C -- \n");
                output.println(insertBlok5c);
            }
            if (i == listB5c.size() - 1) {
                output.println(listB5c.get(i) + ";");
                output.println("-- Jumlah record = "+listB5c.size()+" -- \n");
            } else {
                output.println(listB5c.get(i) + ",");
            }
        }
        for (int i = 0; i < listB5d.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 5DE -- \n");
                output.println(insertBlok5de);
            }
            if (i == listB5d.size() - 1) {
                output.println(listB5d.get(i) + ";");
                output.println("-- Jumlah record = "+listB5d.size()+" -- \n");
            } else {
                output.println(listB5d.get(i) + ",");
            }
        }
        for (int i = 0; i < listB6.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 6 -- \n");
                output.println(insertBlok6);
            }
            if (i == listB6.size() - 1) {
                output.println(listB6.get(i) + ";");
                output.println("-- Jumlah record = "+listB6.size()+" -- \n");
            } else {
                output.println(listB6.get(i) + ",");
            }
        }
        for (int i = 0; i < listB7a.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 7A -- \n");
                output.println(insertBlok7a);
            }
            if (i == listB7a.size() - 1) {
                output.println(listB7a.get(i) + ";");
                output.println("-- Jumlah record = "+listB7a.size()+" -- \n");
            } else {
                output.println(listB7a.get(i) + ",");
            }
        }
        for (int i = 0; i < listB7b.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 7B -- \n");
                output.println(insertBlok7b);
            }
            if (i == listB7b.size() - 1) {
                output.println(listB7b.get(i) + ";");
                output.println("-- Jumlah record = "+listB7b.size()+" -- \n");
            } else {
                output.println(listB7b.get(i) + ",");
            }
        }
        for (int i = 0; i < listB8a1.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 8A1 -- \n");
                output.println(insertBlok8a1);
            }
            if (i == listB8a1.size() - 1) {
                output.println(listB8a1.get(i) + ";");
                output.println("-- Jumlah record = "+listB8a1.size()+" -- \n");
            } else {
                output.println(listB8a1.get(i) + ",");
            }
        }

        for (int i = 0; i < listB8a2.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 8A2 -- \n");
                output.println(insertBlok8a2);
            }
            if (i == listB8a2.size() - 1) {
                output.println(listB8a2.get(i) + ";");
                output.println("-- Jumlah record = "+listB8a2.size()+" -- \n");
            } else {
                output.println(listB8a2.get(i) + ",");
            }
        }

        for (int i = 0; i < listB8a3.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 8A3-- \n");
                output.println(insertBlok8a3);
            }
            if (i == listB8a3.size() - 1) {
                output.println(listB8a3.get(i) + ";");
                output.println("-- Jumlah record = "+listB8a3.size()+" -- \n");
            } else {
                output.println(listB8a3.get(i) + ",");
            }
        }

        for (int i = 0; i < listB8a4.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 8A4 -- \n");
                output.println(insertBlok8a4);
            }
            if (i == listB8a4.size() - 1) {
                output.println(listB8a4.get(i) + ";");
                output.println("-- Jumlah record = "+listB8a4.size()+" -- \n");
            } else {
                output.println(listB8a4.get(i) + ",");
            }
        }

        for (int i = 0; i < listB8b.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 8B -- \n");
                output.println(insertBlok8b);
            }
            if (i == listB8b.size() - 1) {
                output.println(listB8b.get(i) + ";");
                output.println("-- Jumlah record = "+listB8b.size()+" -- \n");
            } else {
                output.println(listB8b.get(i) + ",");
            }
        }

        for (int i = 0; i < listB8c.size(); i++) {
            if(i==0){
                output.println("-- Insert Data Blok 8C -- \n");
                output.println(insertBlok8c);
            }
            if (i == listB8c.size() - 1) {
                output.println(listB8c.get(i) + ";");
                output.println("-- Jumlah record = "+listB8c.size()+" -- \n");
            } else {
                output.println(listB8c.get(i) + ",");
            }
        }

        try {
            bufferedWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Menutup file
        try{

            fileWriter.close();
            
            JOptionPane.showMessageDialog(null,"Data berhasil diekspor ke file SQL!");
            //rename file .pkl49
            File f = null;
            for(int i=0;i<listNama.size();i++){
                f= new File(System.getProperty("user.dir")+"/Data/"+listNama.get(i));
                f.renameTo(new File(System.getProperty("user.dir")+"/Data/X"+listNama.get(i)));
            }
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }

   }
   /**
    * Menulis SQL Statement Insert untuk tabel podes.
    * @param namaFile
    */
   public static void createSQLFilePodes(String namaFile){
       String insert = "INSERT INTO `PODES` (`NKD`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5`, `B1R6A`, `B1R6B`, `B2R2`, `B2R3`, `B2R6`, `B2R7`, `B3R1A`, `B3R1B`, `B3R1C`, `B3R1D`, `B3R1E`, `B3R1F`, `B3R1G`, `B3R2A1`, `B3R2A2`, `B3R2B1`, `B3R2B2`, `B3R2C1`, `B3R2C2`, `B3R2D1`, `B3R2D2`, `B3R2E1`, `B3R2E2`, `B3R2F1`, `B3R2F2`, `B3R2G1`, `B3R2G2`, `B3R3A1`, `B3R3A2`, `B3R3A3`, `B3R3A4`, `B3R3B1`, `B3R3B2`, `B3R3B3`, `B3R3B4`, `B3R3C1`, `B3R3C2`, `B3R3C3`, `B3R3C4`, `B3R3D1`, `B3R3D2`, `B3R3D3`, `B3R3D4`, `B3R3E1`, `B3R3E2`," +
               " `B3R3E3`, `B3R3E4`, `B3R3F1`, `B3R3F2`, `B3R3F3`, `B3R3F4`, `B3R3G1`, `B3R3G2`, `B3R3G3`, `B3R3G4`, `B3R4A`, `B3R4B`, `B3R4C`, `B3R4D1`, `B3R4D2`, `B3R4DLain`) VALUES ";

       File dir = new File("DataPodes");
        String[] fileName = null;
        if (dir.isDirectory()) {
            fileName = dir.list();
        }
        List<Podes> list = new ArrayList<Podes>();
        Podes podes = null;
        for (int i = 0; i < fileName.length; i++) {
            podes = readDataFromPodes(System.getProperty("user.dir")+"/DataPodes/"+fileName[i]);
            list.add(podes);
        }

       
       FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(namaFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter output = new PrintWriter(bufferedWriter);
        output.println("-- Insert Data Podes\n");
        output.println(insert);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                output.println(list.get(i) + ";\n");
            } else {
                output.println(list.get(i) + ",");
            }
        }
       try {
            bufferedWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Menutup file
        try{
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Ekspor.class.getName()).log(Level.SEVERE, null, ex);
        }
        int pilih=JOptionPane.showConfirmDialog(null, "Data Podes Berhasil diekspor ke file SQL File\n" +
                    "Mau dibuka sekarang?", "Buka File", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if (pilih==JOptionPane.NO_OPTION){
                return;
            }
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()){
                desktop = Desktop.getDesktop();
            }else{
                JOptionPane.showMessageDialog(null, "Desktop tidak mendukung.", "Error", JOptionPane.ERROR_MESSAGE);

            }
            if (desktop.isSupported(Desktop.Action.OPEN)){
                try {
                    desktop.open(new File("PKL49Podes.sql"));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

                }
            }else{
                JOptionPane.showMessageDialog(null, "File tidak dapat dibuka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
   }
}