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
public class Blok5c implements Serializable{
    //7 Field
    private String NKS;
    private Integer NO_URUT;
    private Integer B5CR19;
    private Integer B5CR20;
    private Integer B5CR21;
    private Integer B5CR22A;
    private Integer B5CR22B;
   

    public Blok5c() {
    }

    public Blok5c(String NKS, Integer NO_URUT, Integer B5CR19, Integer B5CR20, Integer B5CR21, Integer B5CR22A, Integer B5CR22B) {
        this.NKS = NKS;
        this.NO_URUT = NO_URUT;
        this.B5CR19 = B5CR19;
        this.B5CR20 = B5CR20;
        this.B5CR21 = B5CR21;
        this.B5CR22A = B5CR22A;
        this.B5CR22B = B5CR22B;
    }

    public Integer getB5CR19() {
        return B5CR19;
    }

    public void setB5CR19(Integer B5CR19) {
        this.B5CR19 = B5CR19;
    }

    public Integer getB5CR20() {
        return B5CR20;
    }

    public void setB5CR20(Integer B5CR20) {
        this.B5CR20 = B5CR20;
    }

    public Integer getB5CR21() {
        return B5CR21;
    }

    public void setB5CR21(Integer B5CR21) {
        this.B5CR21 = B5CR21;
    }

    public Integer getB5CR22A() {
        return B5CR22A;
    }

    public void setB5CR22A(Integer B5CR22A) {
        this.B5CR22A = B5CR22A;
    }

    public Integer getB5CR22B() {
        return B5CR22B;
    }

    public void setB5CR22B(Integer B5CR22B) {
        this.B5CR22B = B5CR22B;
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

    

    

    @Override
    public String toString() {
        return "("+"'"+NKS+"',"+NO_URUT+","+B5CR19+","+B5CR20+","+B5CR21+","+B5CR22A+","+B5CR22B+")";

    }

}
