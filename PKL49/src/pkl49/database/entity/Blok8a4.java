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
public class Blok8a4 implements Serializable{
    private String NKS;
    private Integer NO_URUT;
    private Integer B8AK13;
    private Integer B8AK13ALS;

    public Blok8a4() {
    }

    public Blok8a4(String NKS, Integer NO_URUT, Integer B8AK13, Integer B8AK13ALS) {
        this.NKS = NKS;
        this.NO_URUT = NO_URUT;
        this.B8AK13 = B8AK13;
        this.B8AK13ALS = B8AK13ALS;
    }

    public Integer getB8AK13() {
        return B8AK13;
    }

    public void setB8AK13(Integer B8AK13) {
        this.B8AK13 = B8AK13;
    }

    public Integer getB8AK13ALS() {
        return B8AK13ALS;
    }

    public void setB8AK13ALS(Integer B8AK13ALS) {
        this.B8AK13ALS = B8AK13ALS;
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
        if(B8AK13==null && B8AK13ALS == null)
            return true;
        else
            return false;
    }
    

    @Override
    public String toString() {
        return "("+"'"+NKS+"',"+NO_URUT+","+B8AK13+","+"'"+B8AK13ALS+"'"+")";
    }

}
