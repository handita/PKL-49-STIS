/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok3;

/**
 *
 * @author Ken
 */
public interface Blok3Dao {

    public void insertBlok3(Blok3 blok3) throws SQLException;
    public void updateBlok3(Blok3 blok3)throws SQLException;
    public void deleteBlok3(String NKS)throws SQLException;
    public Blok3 getBlok3(String NKS)throws SQLException;
    public List<Blok3> selectAllBlok3()throws SQLException;
}
