/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Podes;

/**
 *
 * @author Mr.Hands
 */
public interface PodesDao {
 public void insertPodes() throws SQLException;
    public void updatePodes()throws SQLException;
    public void deletePodes(String NKS)throws SQLException;
    public Podes getPodes(String NKS)throws SQLException;
    public List<Podes> selectAllPodes()throws SQLException;
}
