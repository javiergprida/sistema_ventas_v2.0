
package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClientesDao {
    
     connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean Registrar(Clientes cliente) {
        String sql = "insert into clientes(nombre, telefono ,direccion) values (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getDireccion());
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }
     
    public List ListarClientes(String valor) {

        List<Clientes> listaClientes = new ArrayList();
        String sql = "select * from clientes order by status asc";
        String buscar ="select * from clientes where nombre like '%"+valor+"%'  OR  telefono like '%"+valor+"%' ";
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
                Clientes cliente = new Clientes();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setStatus(rs.getString("status"));
                listaClientes.add(cliente);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return listaClientes;
    }

    public boolean Modificarr(Clientes cliente) {
        String sql = "update clientes set nombre=?, telefono=?, direccion=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
             ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public boolean Accion(String status, int id) {

        String sql = "update clientes set status=? where id=?";
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

    public Clientes getClientes(int id_venta){
           String sql = "select c.*, v.id, v.id_cliente from clientes c inner join ventas v on c.id = v.id_cliente where v.id=?";
        Clientes cl = new Clientes();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_venta);
            rs = ps.executeQuery();
            if (rs.next()) {
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(rs.getString("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return cl;
    
    
    }
    
}
