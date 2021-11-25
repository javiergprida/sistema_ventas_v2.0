
package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsersDao {
    connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Users Login(String username, String password){
        String sql = "select * from usuarios where username=? and password=?";
        Users us = new Users();
        try{
          con = cn.getConnection();
          ps = con.prepareStatement(sql);
          ps.setString(1, username);
          ps.setString(2, password);
          rs = ps.executeQuery();
          if(rs.next()){
              us.setId(rs.getInt("id"));
              us.setUsername(rs.getString("username"));
              us.setFullname(rs.getString("fullname"));
              us.setCash(rs.getString("cash"));
              us.setRol(rs.getString("rol"));
              us.setStatus(rs.getString("status"));
          }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
        return us;
    }
}
