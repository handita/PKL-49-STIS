/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok5b;

/**
 *
 * @author Ken
 */
public interface Blok5bDao {

    public void insertBlok5b(Blok5b blok5B) throws SQLException;
    public void updateBlok5b(Blok5b blok5B)throws SQLException;
    public void deleteBlok5b(String NKS,int NO_URUT)throws SQLException;
    public void deleteBlok5b(String NKS)throws SQLException;
    public Blok5b getBlok5b(String NKS,int NO_URUT)throws SQLException;
    public List<Blok5b> getAllBlok5b(String NKS)throws SQLException;
    public List<Blok5b> selectAllBlok5b()throws SQLException;
}
