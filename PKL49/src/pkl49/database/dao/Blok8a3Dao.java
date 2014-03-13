/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8a3;

/**
 *
 * @author Mr.Hands
 */
public interface Blok8a3Dao {
public void insertBlok8a3(Blok8a3 blok5) throws SQLException;
    public void updateBlok8a3(Blok8a3 blok5)throws SQLException;
    public void deleteBlok8a3(String NKS, int NO_URUT)throws SQLException;
    public void deleteBlok8a3(String NKS)throws SQLException;
    public Blok8a3 getBlok8a3(String NKS, int NO_URUT)throws SQLException;
    public List<Blok8a3> getAllBlok8a3(String NKS)throws SQLException;
    public List<Blok8a3> selectAllBlok8a3()throws SQLException;
}