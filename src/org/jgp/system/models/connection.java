/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jgp.system.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class connection {
    Connection conn;
    
    public Connection getConnection(){
        try{
        
                String db = "jdbc:mysql://localhost:3306/posventamvc";
                conn = DriverManager.getConnection(db, "root", "");
                return conn;
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return null;
    }
}
