/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok7a;

/**
 *
 * @author Mr.Hands
 */
public interface Blok7aDao {
public void insertBlok7a(Blok7a blok5) throws SQLException;
    public void updateBlok7a(Blok7a blok5)throws SQLException;
    public void deleteBlok7a(String NKS)throws SQLException;
    public Blok7a getBlok7a(String NKS)throws SQLException;
    public List<Blok7a> selectAllBlok7a()throws SQLException;
}