/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8b;

/**
 *
 * @author Mr.Hands
 */
public interface Blok8bDao {
public void insertBlok8b(Blok8b blok5) throws SQLException;
    public void updateBlok8b(Blok8b blok5)throws SQLException;
    public void deleteBlok8b(String NKS, int NO_URUT)throws SQLException;
    public void deleteBlok8b(String NKS)throws SQLException;
    public Blok8b getBlok8b(String NKS, int NO_URUT)throws SQLException;
    public List<Blok8b> getAllBlok8b(String NKS)throws SQLException;
    public List<Blok8b> selectAllBlok8b()throws SQLException;
}
