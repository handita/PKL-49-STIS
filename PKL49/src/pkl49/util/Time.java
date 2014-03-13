/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Mahasiswa
 */
public class Time {

    private Calendar calendar;
    private int tanggal;
    private int bulan;
    private int tahun;
    private int hari;
    private int jam;
    private int menit;
    private int detik;
    private String bulanHuruf;
    private String hariHuruf;
    private String jamHuruf;
    private String tanggalHuruf;
    Thread thread;

    public Time() {
        setTime();
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public String getBulanHuruf() {
        return bulanHuruf;
    }

    public void setBulanHuruf(String bulanHuruf) {
        this.bulanHuruf = bulanHuruf;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public String getHariHuruf() {
        return hariHuruf;
    }

    public void setHariHuruf(String hariHuruf) {
        this.hariHuruf = hariHuruf;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public String getJamHuruf() {
        return jamHuruf;
    }

    public void setJamHuruf(String jamHuruf) {
        this.jamHuruf = jamHuruf;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggalHuruf() {
        return tanggalHuruf;
    }

    public void setTanggalHuruf(String tanggalHuruf) {
        this.tanggalHuruf = tanggalHuruf;
    }

    public void setTime(){
        calendar = new GregorianCalendar();
        setTanggal(calendar.get(GregorianCalendar.DATE));
        setBulan(calendar.get(GregorianCalendar.MONTH)+1);
        setTahun(calendar.get(GregorianCalendar.YEAR));
        setJam(calendar.get(GregorianCalendar.HOUR_OF_DAY));
        setMenit(calendar.get(GregorianCalendar.MINUTE));
        setDetik(calendar.get(GregorianCalendar.SECOND));
        setHari(calendar.get(GregorianCalendar.DAY_OF_WEEK));
        switch (hari){
            case 1 :
                hariHuruf = "Minggu";
                break;
            case 2 :
                hariHuruf = "Senin";
                break;
            case 3 :
                hariHuruf = "Selasa";
                break;
            case 4 :
                hariHuruf = "Rabu";
                break;
            case 5 :
                hariHuruf = "Kamis";
                break;
            case 6 :
                hariHuruf = "Jumat";
                break;
            case 7 :
                hariHuruf = "Sabtu";
                break;

        }
        switch(bulan){
            case 1 :
                bulanHuruf = "Januari";break;
            case 2 :
                bulanHuruf = "Februari";break;
            case 3 :
                bulanHuruf = "Maret";break;
            case 4 :
                bulanHuruf = "April";break;
            case 5 :
                bulanHuruf = "Mei";break;
            case 6 :
                bulanHuruf = "Juni";break;
            case 7 :
                bulanHuruf = "Juli";break;
            case 8 :
                bulanHuruf = "Agustus";break;
            case 9 :
                bulanHuruf = "September";break;
            case 10 :
                bulanHuruf = "Oktober";break;
            case 11 :
                bulanHuruf = "November";break;
            case 12 :
                bulanHuruf = "Desember";break;
        }
        if (jam<10 && menit<10 && detik<10){
            jamHuruf = "0"+Integer.toString(jam)+":"+"0"+Integer.toString(menit)+":"+"0"+Integer.toString(detik);
        } else if (jam>=10 && menit<10 && detik<10){
            jamHuruf = Integer.toString(jam)+":"+"0"+Integer.toString(menit)+":"+"0"+Integer.toString(detik);
        } else if (jam<10 && menit>=10 && detik<10){
            jamHuruf = "0"+Integer.toString(jam)+":"+Integer.toString(menit)+":"+"0"+Integer.toString(detik);
        } else if (jam<10 && menit<10 && detik>=10){
            jamHuruf = "0"+Integer.toString(jam)+":"+"0"+Integer.toString(menit)+":"+Integer.toString(detik);
        } else if (jam<10 && menit>=10 && detik>=10){
            jamHuruf = "0"+Integer.toString(jam)+":"+Integer.toString(menit)+":"+Integer.toString(detik);
        } else if (jam>=10 && menit<10 && detik>=10){
            jamHuruf = Integer.toString(jam)+":"+"0"+Integer.toString(menit)+":"+Integer.toString(detik);
        } else if (jam>=10 && menit>=10 && detik<10){
            jamHuruf = Integer.toString(jam)+":"+Integer.toString(menit)+":"+"0"+Integer.toString(detik);
        } else{
            jamHuruf = Integer.toString(jam)+":"+Integer.toString(menit)+":"+Integer.toString(detik);
        }
        tanggalHuruf = Integer.toString(tanggal)+" "+bulanHuruf+" "+Integer.toString(tahun);
    }
}
