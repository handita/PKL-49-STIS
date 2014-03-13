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
public class Blok2 implements Serializable{

private String NKS;
private Integer B2R1;
private Integer B2R2;
private Integer B2R3;
private Integer B2R4;
private Integer B2R5;
private Integer B2R6;

    public Blok2() {
    }

    public Blok2(String NKS, Integer B2R1, Integer B2R2, Integer B2R3, Integer B2R4, Integer B2R5, Integer B2R6) {
        this.NKS = NKS;
        this.B2R1 = B2R1;
        this.B2R2 = B2R2;
        this.B2R3 = B2R3;
        this.B2R4 = B2R4;
        this.B2R5 = B2R5;
        this.B2R6 = B2R6;
    }

    public Integer getB2R1() {
        return B2R1;
    }

    public void setB2R1(Integer B2R1) {
        this.B2R1 = B2R1;
    }

    public Integer getB2R2() {
        return B2R2;
    }

    public void setB2R2(Integer B2R2) {
        this.B2R2 = B2R2;
    }

    public Integer getB2R3() {
        return B2R3;
    }

    public void setB2R3(Integer B2R3) {
        this.B2R3 = B2R3;
    }

    public Integer getB2R4() {
        return B2R4;
    }

    public void setB2R4(Integer B2R4) {
        this.B2R4 = B2R4;
    }

    public Integer getB2R5() {
        return B2R5;
    }

    public void setB2R5(Integer B2R5) {
        this.B2R5 = B2R5;
    }

    public Integer getB2R6() {
        return B2R6;
    }

    public void setB2R6(Integer B2R6) {
        this.B2R6 = B2R6;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    @Override
    public String toString() {
        return "("+"'"+NKS+"',"+B2R1+","+B2R2+","+B2R3+","+B2R4+","+B2R5+","+B2R6+")";

    }



}
