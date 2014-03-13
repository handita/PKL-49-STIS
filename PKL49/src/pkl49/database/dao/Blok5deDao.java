/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok5de;

/**
 *
 * @author Ken
 */
public interface Blok5deDao {

    public void insertBlok5de(Blok5de Blok5de) throws SQLException;
    public void updateBlok5de(Blok5de Blok5de)throws SQLException;
    public void deleteBlok5de(String NKS,int NO_URUT)throws SQLException;
    public void deleteBlok5de(String NKS)throws SQLException;
    public Blok5de getBlok5de(String NKS,int NO_URUT)throws SQLException;
    public List<Blok5de> getAllBlok5de(String NKS)throws SQLException;
    public List<Blok5de> selectAllBlok5de()throws SQLException;
}
