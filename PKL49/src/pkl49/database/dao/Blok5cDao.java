/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok5a;
import pkl49.database.entity.Blok5c;

/**
 *
 * @author Ken
 */
public interface Blok5cDao {

    public void insertBlok5c(Blok5c blok5) throws SQLException;
    public void updateBlok5c(Blok5c blok5)throws SQLException;
    public void deleteBlok5c(String NKS,int NO_URUT)throws SQLException;
    public void deleteBlok5c(String NKS)throws SQLException;
    public Blok5c getBlok5c(String NKS,int NO_URUT)throws SQLException;
    public List<Blok5c> getAllBlok5c(String NKS)throws SQLException;
    public List<Blok5c> selectAllBlok5c()throws SQLException;
}
