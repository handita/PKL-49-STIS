/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8a2;

/**
 *
 * @author Mr.Hands
 */
public interface Blok8a2Dao {
public void insertBlok8a2(Blok8a2 blok5) throws SQLException;
    public void updateBlok8a2(Blok8a2 blok5)throws SQLException;
    public void deleteBlok8a2(String NKS)throws SQLException;
    public Blok8a2 getBlok8a2(String NKS)throws SQLException;
    public List<Blok8a2> selectAllBlok8a2()throws SQLException;
}