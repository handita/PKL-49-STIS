/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.entity;

import java.io.Serializable;

/**
 *
 * @author Ken
 */
public class KodeDaerah implements Serializable{

    private String kab;
    private String strata;
    private String kec;
    private String desa;

    public KodeDaerah() {
    }

    public KodeDaerah(String kab, String strata, String kec, String desa) {
        this.kab = kab;
        this.strata = strata;
        this.kec = kec;
        this.desa = desa;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKab() {
        return kab;
    }

    public void setKab(String kab) {
        this.kab = kab;
    }

    public String getKec() {
        return kec;
    }

    public void setKec(String kec) {
        this.kec = kec;
    }

    public String getStrata() {
        return strata;
    }

    public void setStrata(String strata) {
        this.strata = strata;
    }

    
}
