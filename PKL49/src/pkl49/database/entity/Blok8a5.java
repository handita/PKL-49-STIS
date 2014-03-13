/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.entity;

/**
 *
 * @author Ken
 */
public class Blok8a5 {

    private String NKS;
    private Integer NO_URUT;
    private Integer B8AK5;
    private Integer B8AK5ALS;

    public Blok8a5() {
    }

    public Blok8a5(String NKS, Integer NO_URUT, Integer B8AK5, Integer B8AK5ALS) {
        this.NKS = NKS;
        this.NO_URUT = NO_URUT;
        this.B8AK5 = B8AK5;
        this.B8AK5ALS = B8AK5ALS;
    }

    public Integer getB8AK5() {
        return B8AK5;
    }

    public void setB8AK5(Integer B8AK5) {
        this.B8AK5 = B8AK5;
    }

    public Integer getB8AK5ALS() {
        return B8AK5ALS;
    }

    public void setB8AK5ALS(Integer B8AK5ALS) {
        this.B8AK5ALS = B8AK5ALS;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    public Integer getNO_URUT() {
        return NO_URUT;
    }

    public void setNO_URUT(Integer NO_URUT) {
        this.NO_URUT = NO_URUT;
    }

    /**
     * Mengecek nilainya null semua gak
     * @return
     */
    public boolean isNull(){
        if(B8AK5==null && B8AK5ALS == null)
            return true;
        else
            return false;
    }
    
}
