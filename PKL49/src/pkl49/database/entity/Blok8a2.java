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
public class Blok8a2 implements Serializable{

    private String NKS;
    private Integer B8AK3;
    private Integer B8AK3Lain;
    private Integer B8AK4;
    private Integer B8AK12;
    
    public Blok8a2() {
    }

    public Blok8a2(String NKS, Integer B8AK3, Integer B8AK3Lain, Integer B8AK4, Integer B8AK12) {
        this.NKS = NKS;
        this.B8AK3 = B8AK3;
        this.B8AK3Lain = B8AK3Lain;
        this.B8AK4 = B8AK4;
        this.B8AK12 = B8AK12;
    }

    public Integer getB8AK12() {
        return B8AK12;
    }

    public void setB8AK12(Integer B8AK12) {
        this.B8AK12 = B8AK12;
    }

    public Integer getB8AK3() {
        return B8AK3;
    }

    public void setB8AK3(Integer B8AK3) {
        this.B8AK3 = B8AK3;
    }

    public Integer getB8AK3Lain() {
        return B8AK3Lain;
    }

    public void setB8AK3Lain(Integer B8AK3Lain) {
        this.B8AK3Lain = B8AK3Lain;
    }

    public Integer getB8AK4() {
        return B8AK4;
    }

    public void setB8AK4(Integer B8AK4) {
        this.B8AK4 = B8AK4;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    @Override
    public String toString() {
        return "("+"'"+NKS+"',"+B8AK3+","+"'"+B8AK3Lain+"',"+B8AK4+","+B8AK12+")";

    }


}
