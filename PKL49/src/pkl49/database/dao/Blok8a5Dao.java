/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database.dao;

import java.sql.SQLException;
import java.util.List;
import pkl49.database.entity.Blok8a5;

/**
 *
 * @author Ken
 */
public interface  Blok8a5Dao {

    public void insertBlok8a5(Blok8a5 blok5) throws SQLException;
    public void updateBlok8a5(Blok8a5 blok5)throws SQLException;
    public void deleteBlok8a5(String NKS, int NO_URUT)throws SQLException;
    public void deleteBlok8a5(String NKS)throws SQLException;
    public Blok8a5 getBlok8a5(String NKS, int NO_URUT)throws SQLException;
    public List<Blok8a5> getAllBlok8a5(String NKS)throws SQLException;
    public List<Blok8a5> selectAllBlok8a5()throws SQLException;
}
