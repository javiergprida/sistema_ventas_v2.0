package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsersDao {

    connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Users Login(String username, String password) {
        String sql = "select * from usuarios where username=? and password=?";
        Users us = new Users();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                us.setId(rs.getInt("id"));
                us.setUsername(rs.getString("username"));
                us.setFullname(rs.getString("fullname"));
                us.setCash(rs.getString("cash"));
                us.setRol(rs.getString("rol"));
                us.setStatus(rs.getString("status"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return us;
    }

    public boolean Registrar(Users users) {
        String sql = "insert into usuarios(username, fullname ,password, email, cash, rol) values (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, users.getUsername());
            ps.setString(2, users.getFullname());
            ps.setString(3, users.getPassword());
            ps.setString(4, users.getEmail());
            ps.setString(5, users.getCash());
            ps.setString(6, users.getRol());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public List ListarUsers(String valor) {

        List<Users> listaUsers = new ArrayList();
        String sql = "select * from usuarios order by status asc";
        String buscar ="select * from usuarios where username like '%"+valor+"%'  OR  fullname like '%"+valor+"%' ";
        try {
            con = cn.getConnection();
            if(valor.equalsIgnoreCase(" ")){
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            }else{
             ps = con.prepareStatement(buscar);
            rs = ps.executeQuery();
            
            }
            while (rs.next()) {
                Users us = new Users();
                us.setId(rs.getInt("id"));
                us.setUsername(rs.getString("username"));
                us.setFullname(rs.getString("fullname"));
                us.setEmail(rs.getString("email"));
                us.setCash(rs.getString("cash"));
                us.setRol(rs.getString("rol"));
                us.setStatus(rs.getString("status"));
                listaUsers.add(us);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return listaUsers;
    }

    public boolean Modificarr(Users users) {
        String sql = "update usuarios set username=?, fullname=?, email=?, cash=?, rol=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, users.getUsername());
            ps.setString(2, users.getFullname());
            ps.setString(3, users.getEmail());
            ps.setString(4, users.getCash());
            ps.setString(5, users.getRol());
            ps.setInt(6, users.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public boolean Accion(String status, int id) {

        String sql = "update usuarios set status=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2,id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return(false);
        }
    }
    
    public Configuracion getConfig(){
           String sql = "select * from configuracion";
        Configuracion cf = new Configuracion();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                cf.setId(rs.getInt("id"));
                cf.setCuit(rs.getString("cuit"));
                cf.setNombre(rs.getString("nombre"));
                cf.setTelefono(rs.getString("telefono"));
                cf.setDireccion(rs.getString("direccion"));
                cf.setMensaje(rs.getString("mensaje"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return cf;
    
    
    }
}
