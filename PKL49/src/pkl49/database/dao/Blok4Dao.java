/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok4;

/**
 *
 * @author Ken
 */
public interface Blok4Dao {

    public void insertBlok4(Blok4 blok4) throws SQLException;
    public void updateBlok4(Blok4 blok4)throws SQLException;
    public void deleteBlok4(String NKS,int NO_URUT)throws SQLException;
    public void deleteBlok4(String NKS)throws SQLException;
    public Blok4 getBlok4(String NKS,int NO_URUT)throws SQLException;
    public List<Blok4> selectAllBlok4()throws SQLException;
}
