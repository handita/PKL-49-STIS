/*
 * Dilarang mengopi
 * Copyright 2010
 */

package pkl49.control;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import pkl49.database.DataStat;
import pkl49.database.DataStatPodes;

/**
 * Kelas ini untuk menyimpan data-data yang selalu digunakan  dalam pengentrian.
 * @author Ken
 */
public class DataStatic {

    private static String nimPengentry;
    //Variable ini sebagai penanda jumlah data sebelum diupdate
    private static String NKSForUpdate;
    private static int jmlArtSblmUpdate;
    private static int jmlBlok8a3SblmUpdate;
    private static int jmlBlok8a4SblmUpdate;
    private static int jmlBlok8a5SblmUpdate;
    private static int jmlBlok8bSblmUpdate;
    private static int jmlBlok8cSblmUpdate;

    private static Hashtable<String, String> tabelPengentry;
    private static Hashtable<String, String> tabelKabupaten;
    private static Hashtable<String, String> tabelKecamatan;
    private static Hashtable<String, String> tabelDesa;
    private static Hashtable<String, String> tabelStrata;
    private static Hashtable<String, String> tabelKortimPencacah;
    private static Hashtable<String, String> tabelKorwilKortim;
    private static List<String> tabelKortim;

    public static void setData(){
       DataStat info = new DataStat();
       DataStatPodes podes = new DataStatPodes();
       setTabelPengentry(info.getPengentry());
       setTabelKabupaten(info.getKab());
       setTabelStrata(info.getStrata());
       setTabelKecamatan(info.getKec());
       setTabelDesa(info.getDesa());
       setTabelKortim(info.getKortim());
       setTabelKortimPencacah(info.getPencacah());
       setTabelKorwilKortim(podes.getKorwil());
    }

    public static Hashtable<String, String> getTabelKorwilKortim() {
        return tabelKorwilKortim;
    }

    public static void setTabelKorwilKortim(Hashtable<String, String> tabelKorwilKortim) {
        DataStatic.tabelKorwilKortim = tabelKorwilKortim;
    }



    public static void setNKSForUpdate(String NKSForUpdate) {
        DataStatic.NKSForUpdate = NKSForUpdate;
    }

    public static String getNKSForUpdate() {
        return NKSForUpdate;
    }

    public static int getJmlArtSblmUpdate() {
        return jmlArtSblmUpdate;
    }

    public static void setJmlArtSblmUpdate(int jmlArtSblmUpdate) {
        DataStatic.jmlArtSblmUpdate = jmlArtSblmUpdate;
    }

    public static int getJmlBlok8a3SblmUpdate() {
        return jmlBlok8a3SblmUpdate;
    }

    public static void setJmlBlok8a3SblmUpdate(int jmlBlok8a3SblmUpdate) {
        DataStatic.jmlBlok8a3SblmUpdate = jmlBlok8a3SblmUpdate;
    }

    public static int getJmlBlok8a4SblmUpdate() {
        return jmlBlok8a4SblmUpdate;
    }

    public static void setJmlBlok8a4SblmUpdate(int jmlBlok8a4SblmUpdate) {
        DataStatic.jmlBlok8a4SblmUpdate = jmlBlok8a4SblmUpdate;
    }

    public static int getJmlBlok8a5SblmUpdate() {
        return jmlBlok8a5SblmUpdate;
    }

    public static void setJmlBlok8a5SblmUpdate(int jmlBlok8a5SblmUpdate) {
        DataStatic.jmlBlok8a5SblmUpdate = jmlBlok8a5SblmUpdate;
    }

    public static int getJmlBlok8bSblmUpdate() {
        return jmlBlok8bSblmUpdate;
    }

    public static void setJmlBlok8bSblmUpdate(int jmlBlok8bSblmUpdate) {
        DataStatic.jmlBlok8bSblmUpdate = jmlBlok8bSblmUpdate;
    }

    public static int getJmlBlok8cSblmUpdate() {
        return jmlBlok8cSblmUpdate;
    }

    public static void setJmlBlok8cSblmUpdate(int jmlBlok8cSblmUpdate) {
        DataStatic.jmlBlok8cSblmUpdate = jmlBlok8cSblmUpdate;
    }




    public static String getNimPengentry() {
        return nimPengentry;
    }

    public static void setNimPengentry(String nimPengentry) {
        DataStatic.nimPengentry = nimPengentry;
    }

    public static Hashtable<String, String> getTabelDesa() {
        return tabelDesa;
    }

    public static void setTabelDesa(Hashtable<String, String> tabelDesa) {
        DataStatic.tabelDesa = tabelDesa;
    }

    public static Hashtable<String, String> getTabelKabupaten() {
        return tabelKabupaten;
    }

    public static void setTabelKabupaten(Hashtable<String, String> tabelKabupaten) {
        DataStatic.tabelKabupaten = tabelKabupaten;
    }

    public static Hashtable<String, String> getTabelKecamatan() {
        return tabelKecamatan;
    }

    public static void setTabelKecamatan(Hashtable<String, String> tabelKecamatan) {
        DataStatic.tabelKecamatan = tabelKecamatan;
    }

    public static Hashtable<String, String> getTabelPengentry() {
        return tabelPengentry;
    }

    public static void setTabelPengentry(Hashtable<String, String> tabelPengentry) {
        DataStatic.tabelPengentry = tabelPengentry;
    }

    public static Hashtable<String, String> getTabelStrata() {
        return tabelStrata;
    }

    public static void setTabelStrata(Hashtable<String, String> tabelStrata) {
        DataStatic.tabelStrata = tabelStrata;
    }

    public static List<String> getTabelKortim() {
        return tabelKortim;
    }

    public static void setTabelKortim(List<String> tabelKortim) {
        DataStatic.tabelKortim = tabelKortim;
    }

    public static Hashtable<String, String> getTabelKortimPencacah() {
        return tabelKortimPencacah;
    }

    public static void setTabelKortimPencacah(Hashtable<String, String> tabelKortimPencacah) {
        DataStatic.tabelKortimPencacah = tabelKortimPencacah;
    }
    public static boolean cekKortim(String nim){
        Object kortim [] = DataStatic.getTabelKortim().toArray();
        Arrays.sort(kortim);
        if(Arrays.binarySearch(kortim, nim)>-1)
            return true;
        else
            return false;
    }




}
