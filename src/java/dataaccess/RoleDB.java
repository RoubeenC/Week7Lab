/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.role;
import models.user;

/**
 *
 * @author Roubeen Chaudhry
 */
public class RoleDB {
    
    
    public role getRole(int id) throws Exception{
        ConnectionPool cp = ConnectionPool.getInstance();
        Connection con = cp.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        role role = new role();
       
        String sql = "SELECT * FROM role where role_id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(2);
                
                role = new role(id, name);
            }
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            cp.freeConnection(con);
        }
       return role;
    }
    
    
}
