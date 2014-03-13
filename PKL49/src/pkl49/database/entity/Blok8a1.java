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
public class Blok8a1 implements Serializable{

    private String NKS;
    private Integer NO_URUT;
    private Integer B8AK2;
    
    public Blok8a1() {
    }

    public Blok8a1(String NKS, Integer NO_URUT, Integer B8AK2) {
        this.NKS = NKS;
        this.NO_URUT = NO_URUT;
        this.B8AK2 = B8AK2;
    }

    public Integer getB8AK2() {
        return B8AK2;
    }

    public void setB8AK2(Integer B8AK2) {
        this.B8AK2 = B8AK2;
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
        return"("+"'"+NKS+"',"+NO_URUT+","+B8AK2+")";

    }

}
