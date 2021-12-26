
package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CategoriaDao {
    
    connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean Registrar(Categoria categoria) {
        String sql = "insert into categorias(categoria) values (?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
           
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }
     
         public List ListarCategorias(String valor) {

        List<Categoria> listaCategorias = new ArrayList();
        String sql = "select * from categorias order by status asc";
        String buscar ="select * from categorias where categoria like '%"+valor+"%'";
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
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("categoria"));
                categoria.setStatus(rs.getString("status"));
                listaCategorias.add(categoria);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return listaCategorias;
    }

    public boolean Modificar(Categoria categoria) {
        String sql = "update categorias set categoria=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
             ps.setString(1, categoria.getNombre());
            ps.setInt(2, categoria.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public boolean Accion(String status, int id) {

        String sql = "update categorias set status=? where id=?";
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
    
}
