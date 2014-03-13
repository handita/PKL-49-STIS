/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8a1;

/**
 *
 * @author Mr.Hands
 */
public interface Blok8a1Dao {
public void insertBlok8a1(Blok8a1 blok5) throws SQLException;
    public void updateBlok8a1(Blok8a1 blok5)throws SQLException;
    public void deleteBlok8a1(String NKS, int NO_URUT)throws SQLException;
    public void deleteBlok8a1(String NKS)throws SQLException;
    public Blok8a1 getBlok8a1(String NKS, int NO_URUT)throws SQLException;
    public List<Blok8a1> getAllBlok8a1(String NKS)throws SQLException;
    public List<Blok8a1> selectAllBlok8a1()throws SQLException;
}