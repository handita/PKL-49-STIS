/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok1;

/**
 *
 * @author Ken
 */
public interface Blok1Dao {

    public void insertBlok1(Blok1 blok1) throws SQLException;
    public void updateBlok1(Blok1 blok1)throws SQLException;
    public void deleteBlok1(String NKS)throws SQLException;
    public Blok1 getBlok1(String NKS)throws SQLException;
    public List<Blok1> selectAllBlok1()throws SQLException;
}
