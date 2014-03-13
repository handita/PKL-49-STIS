/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok7b;

/**
 *
 * @author Mr.Hands
 */
public interface Blok7bDao {
public void insertBlok7b(Blok7b blok5) throws SQLException;
    public void updateBlok7b(Blok7b blok5)throws SQLException;
    public void deleteBlok7b(String NKS)throws SQLException;
    public Blok7b getBlok7b(String NKS)throws SQLException;
    public List<Blok7b> selectAllBlok7b()throws SQLException;
}