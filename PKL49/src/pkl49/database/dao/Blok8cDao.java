/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8c;

/**
 *
 * @author Mr.Hands
 */
public interface Blok8cDao {
public void insertBlok8c(Blok8c blok5) throws SQLException;
    public void updateBlok8c(Blok8c blok5)throws SQLException;
    public void deleteBlok8c(String NKS, int NO_URUT)throws SQLException;
    public void deleteBlok8c(String NKS)throws SQLException;
    public Blok8c getBlok8c(String NKS, int NO_URUT)throws SQLException;
    public List<Blok8c> getAllBlok8c(String NKS)throws SQLException;
    public List<Blok8c> selectAllBlok8c()throws SQLException;
}
