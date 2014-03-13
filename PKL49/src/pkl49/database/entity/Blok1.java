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
public class Blok1 implements Serializable{
    //13 Field
    private String NKS;
    private String B1R1;
    private String B1R3;
    private String B1R4;
    private String B1R5;
    private String B1R6;
    private String B1R7;
    private String B1R8;
    private String B1R9;
    private String B3R2;
    private String B3R3;
    private String B3R7;
    private String Pengentri;

    public Blok1() {
    }

    public Blok1(String NKS, String B1R1, String B1R3, String B1R4, String B1R5, String B1R6, String B1R7, String B1R8, String B1R9, String B3R2, String B3R3, String B3R7, String Pengentri) {
        this.NKS = NKS;
        this.B1R1 = B1R1;
        this.B1R3 = B1R3;
        this.B1R4 = B1R4;
        this.B1R5 = B1R5;
        this.B1R6 = B1R6;
        this.B1R7 = B1R7;
        this.B1R8 = B1R8;
        this.B1R9 = B1R9;
        this.B3R2 = B3R2;
        this.B3R3 = B3R3;
        this.B3R7 = B3R7;
        this.Pengentri = Pengentri;
    }

    public String getB3R2() {
        return B3R2;
    }

    public void setB3R2(String B3R2) {
        this.B3R2 = B3R2;
    }

    public String getB3R3() {
        return B3R3;
    }

    public void setB3R3(String B3R3) {
        this.B3R3 = B3R3;
    }

    public String getB3R7() {
        return B3R7;
    }

    public void setB3R7(String B3R7) {
        this.B3R7 = B3R7;
    }

    
    public String getPengentri() {
        return Pengentri;
    }

    public void setPengentri(String Pengentri) {
        this.Pengentri = Pengentri;
    }

    public String getB1R1() {
        return B1R1;
    }

    public void setB1R1(String B1R1) {
        this.B1R1 = B1R1;
    }

    public String getB1R3() {
        return B1R3;
    }

    public void setB1R3(String B1R3) {
        this.B1R3 = B1R3;
    }

    public String getB1R4() {
        return B1R4;
    }

    public void setB1R4(String B1R4) {
        this.B1R4 = B1R4;
    }

    public String getB1R5() {
        return B1R5;
    }

    public void setB1R5(String B1R5) {
        this.B1R5 = B1R5;
    }

    public String getB1R6() {
        return B1R6;
    }

    public void setB1R6(String B1R6) {
        this.B1R6 = B1R6;
    }

    public String getB1R7() {
        return B1R7;
    }

    public void setB1R7(String B1R7) {
        this.B1R7 = B1R7;
    }

    public String getB1R8() {
        return B1R8;
    }

    public void setB1R8(String B1R8) {
        this.B1R8 = B1R8;
    }

    public String getB1R9() {
        return B1R9;
    }

    public void setB1R9(String B1R9) {
        this.B1R9 = B1R9;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    @Override
    public String toString() {
        return "("+"'"+B1R1+"',"+"'"+B1R3+"',"+"'"+B1R4+"',"+"'"+B1R5+"',"+"'"+B1R6+"',"+"'"+B1R7+"',"+"'"+B1R8+"',"+"'"+B1R9+"',"+"'"+NKS+"',"+"'"+Pengentri+"'"+")";
    }

}
