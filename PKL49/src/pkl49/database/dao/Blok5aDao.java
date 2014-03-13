/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok5a;

/**
 *
 * @author Ken
 */
public interface Blok5aDao {

    public void insertBlok5a(Blok5a blok5A) throws SQLException;
    public void updateBlok5a(Blok5a blok5A)throws SQLException;
    public void deleteBlok5a(String NKS, int no_urut)throws SQLException;
    public void deleteBlok5a(String NKS)throws SQLException;
    public Blok5a getBlok5a(String NKS, int no_urut)throws SQLException;
    public List<Blok5a> getAllBlok5a(String NKS)throws SQLException;
    public List<Blok5a> selectAllBlok5a()throws SQLException;
}
