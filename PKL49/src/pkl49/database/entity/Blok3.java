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
public class Blok3 implements Serializable{

    private String NKS;
private String B3R2;
private String B3R3;
private String B3R6;
private String B3R7;

    public Blok3() {
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

    public String getB3R6() {
        return B3R6;
    }

    public void setB3R6(String B3R6) {
        this.B3R6 = B3R6;
    }

    public String getB3R7() {
        return B3R7;
    }

    public void setB3R7(String B3R7) {
        this.B3R7 = B3R7;
    }

    public String getNKS() {
        return NKS;
    }

    public void setNKS(String NKS) {
        this.NKS = NKS;
    }

    public Blok3(String NKS, String B3R2, String B3R3, String B3R6, String B3R7) {
        this.NKS = NKS;
        this.B3R2 = B3R2;
        this.B3R3 = B3R3;
        this.B3R6 = B3R6;
        this.B3R7 = B3R7;
    }

    @Override
    public String toString() {
       return "("+"'"+NKS+"',"+"'"+B3R2+"',"+"'"+B3R3+"',"+"'"+B3R6+"',"+"'"+B3R7+"'"+")";

    }


   

}
