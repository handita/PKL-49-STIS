/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.entity;

import java.io.Serializable;

/**
 *
 * @author Mr.Hands
 */
public class Blok8a3 implements Serializable{
    
    private String NKS;
    private Integer NO_URUT;
    private Integer B8AK6;
    private Integer B8AK7;
    private Integer B8AK8;
    private Integer B8AK9;
    private Integer B8AK10;
    private Integer B8AK11;

    public Blok8a3() {
    }

    public Blok8a3(String NKS, Integer NO_URUT, Integer B8AK6, Integer B8AK7, Integer B8AK8, Integer B8AK9, Integer B8AK10, Integer B8AK11) {
        this.NKS = NKS;
        this.NO_URUT = NO_URUT;
        this.B8AK6 = B8AK6;
        this.B8AK7 = B8AK7;
        this.B8AK8 = B8AK8;
        this.B8AK9 = B8AK9;
        this.B8AK10 = B8AK10;
        this.B8AK11 = B8AK11;
    }

    public Integer getB8AK10() {
        return B8AK10;
    }

    public void setB8AK10(Integer B8AK10) {
        this.B8AK10 = B8AK10;
    }

    public Integer getB8AK11() {
        return B8AK11;
    }

    public void setB8AK11(Integer B8AK11) {
        this.B8AK11 = B8AK11;
    }

    public Integer getB8AK6() {
        return B8AK6;
    }

    public void setB8AK6(Integer B8AK6) {
        this.B8AK6 = B8AK6;
    }

    public Integer getB8AK7() {
        return B8AK7;
    }

    public void setB8AK7(Integer B8AK7) {
        this.B8AK7 = B8AK7;
    }

    public Integer getB8AK8() {
        return B8AK8;
    }

    public void setB8AK8(Integer B8AK8) {
        this.B8AK8 = B8AK8;
    }

    public Integer getB8AK9() {
        return B8AK9;
    }

    public void setB8AK9(Integer B8AK9) {
        this.B8AK9 = B8AK9;
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
     * Untuk mengecek apakah semua nilai atribut null semua
     * @return
     */
    public boolean isNull(){
        if(B8AK6==null && B8AK7==null && B8AK8==null && B8AK9==null && B8AK10==null && B8AK11==null)
            return true;
        else
            return false;
    }
}
