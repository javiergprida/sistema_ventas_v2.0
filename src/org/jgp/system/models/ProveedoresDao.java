
package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProveedoresDao {
    
    connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean Registrar(Proveedores proveedor) {
        String sql = "insert into proveedores(cuit, proveedor ,telefono, direccion) values (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getCuit());
             ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getTelefono());
            ps.setString(4, proveedor.getDireccion());
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }
     
       public List ListarProveedor(String valor) {

        List<Proveedores> listaProveedor = new ArrayList();
        String sql = "select * from proveedores order by status asc";
        String buscar ="select * from proveedores where proveedor like '%"+valor+"%'  OR  cuit like '%"+valor+"%' ";
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
                Proveedores proveedor = new Proveedores();
                proveedor.setId(rs.getInt("id"));
                proveedor.setCuit(rs.getString("cuit"));
                proveedor.setNombre(rs.getString("proveedor"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setDireccion(rs.getString("direccion"));
                proveedor.setStatus(rs.getString("status"));
                listaProveedor.add(proveedor);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return listaProveedor;
    }

    public boolean Modificarr(Proveedores proveedor) {
        String sql = "update proveedores set cuit=?, proveedor=?, telefono=?, direccion=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getCuit());
             ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getTelefono());
            ps.setString(4, proveedor.getDireccion());
            ps.setInt(5, proveedor.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public boolean Accion(String status, int id) {

        String sql = "update proveedores set status=? where id=?";
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
    
    public Proveedores getProveedor(int id_compra){
           String sql = "select p.*, c.id, c.id_proveedor from proveedores p inner join compras c on p.id=c.id_proveedor where c.id=?";
        Proveedores prov = new Proveedores();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_compra);
            rs = ps.executeQuery();
            if (rs.next()) {
                prov.setCuit(rs.getString("cuit"));
                prov.setNombre(rs.getString("proveedor"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setDireccion(rs.getString("direccion"));
                
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return prov;
    
    
    }
    
}
