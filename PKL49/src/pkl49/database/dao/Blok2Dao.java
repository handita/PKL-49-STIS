/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok2;

/**
 *
 * @author Ken
 */
public interface Blok2Dao {

    public void insertBlok2(Blok2 blok2) throws SQLException;
    public void updateBlok2(Blok2 blok2)throws SQLException;
    public void deleteBlok2(String NKS)throws SQLException;
    public Blok2 getBlok2(String NKS)throws SQLException;
    public List<Blok2> selectAllBlok2()throws SQLException;
}
