/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8a4;

/**
 *
 * @author Mr.Hands
 */
public interface Blok8a4Dao {
public void insertBlok8a4(Blok8a4 blok5) throws SQLException;
    public void updateBlok8a4(Blok8a4 blok5)throws SQLException;
    public void deleteBlok8a4(String NKS, int NO_URUT)throws SQLException;
    public void deleteBlok8a4(String NKS)throws SQLException;
    public Blok8a4 getBlok8a4(String NKS, int NO_URUT)throws SQLException;
    public List<Blok8a4> selectAllBlok8a4()throws SQLException;
    public List<Blok8a4> getAllBlok8a4(String NKS)throws SQLException;
}