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
public class Blok4 implements Serializable{

    //10 Field
    private String NKS;
    private Integer NO_URUT;
    private String B4K2;
    private Integer B4K3;
    private Integer B4K4;
    private Integer B4K5;
    private Integer B4K6;
    private Integer B4K7;
    private Integer B4K8;
    private Integer B4K9;

    public Blok4() {
    }

    public Blok4(String NKS, Integer NO_URUT, String B4K2, Integer B4K3, Integer B4K4, Integer B4K5, Integer B4K6, Integer B4K7, Integer B4K8, Integer B4K9) {
        this.NKS = NKS;
        this.NO_URUT = NO_URUT;
        this.B4K2 = B4K2;
        this.B4K3 = B4K3;
        this.B4K4 = B4K4;
        this.B4K5 = B4K5;
        this.B4K6 = B4K6;
        this.B4K7 = B4K7;
        this.B4K8 = B4K8;
        this.B4K9 = B4K9;
    }

    
    public String getB4K2() {
        return B4K2;
    }

    public void setB4K2(String B4K2) {
        this.B4K2 = B4K2;
    }

    public Integer getB4K3() {
        return B4K3;
    }

    public void setB4K3(Integer B4K3) {
        this.B4K3 = B4K3;
    }

    public Integer getB4K4() {
        return B4K4;
    }

    public void setB4K4(Integer B4K4) {
        this.B4K4 = B4K4;
    }

    public Integer getB4K5() {
        return B4K5;
    }

    public void setB4K5(Integer B4K5) {
        this.B4K5 = B4K5;
    }

    public Integer getB4K6() {
        return B4K6;
    }

    public void setB4K6(Integer B4K6) {
        this.B4K6 = B4K6;
    }

    public Integer getB4K7() {
        return B4K7;
    }

    public void setB4K7(Integer B4K7) {
        this.B4K7 = B4K7;
    }

    public Integer getB4K8() {
        return B4K8;
    }

    public void setB4K8(Integer B4K8) {
        this.B4K8 = B4K8;
    }

    public Integer getB4K9() {
        return B4K9;
    }

    public void setB4K9(Integer B4K9) {
        this.B4K9 = B4K9;
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
        return "("+"'"+NKS+"',"+NO_URUT+","+"'"+B4K2+"',"+B4K3+","+B4K4+","+B4K5+","+B4K6+","+B4K7+","+B4K8+","+B4K9+")";
    }


   

}
