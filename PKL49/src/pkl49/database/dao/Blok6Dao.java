/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok6;

/**
 *
 * @author Mr.Hands
 */
public interface Blok6Dao {
public void insertBlok6(Blok6 blok5) throws SQLException;
    public void updateBlok6(Blok6 blok5)throws SQLException;
    public void deleteBlok6(String NKS)throws SQLException;
    public Blok6 getBlok6(String NKS)throws SQLException;
    public List<Blok6> selectAllBlok6()throws SQLException;
}
