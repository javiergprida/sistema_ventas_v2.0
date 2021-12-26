
package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MedidasDao {
    
    connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean Registrar(Medidas medida) {
        String sql = "insert into medidas(medida, abreviatura) values (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, medida.getNombre());
            ps.setString(2, medida.getAbreviatura());
            
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }
     
       public List ListarMedidas(String valor) {

        List<Medidas> listaMedidas = new ArrayList();
        String sql = "select * from medidas order by status asc";
        String buscar ="select * from medidas where medida like '%"+valor+"%' ";
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
                Medidas medida = new Medidas();
                medida.setId(rs.getInt("id"));
                medida.setNombre(rs.getString("medida"));
                medida.setAbreviatura(rs.getString("abreviatura"));
                medida.setStatus(rs.getString("status"));
                listaMedidas.add(medida);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return listaMedidas;
    }

    public boolean Modificarr(Medidas medida) {
        String sql = "update medidas set medida=?, abreviatura=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
             ps.setString(1, medida.getNombre());
            ps.setString(2, medida.getAbreviatura());
            ps.setInt(3, medida.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public boolean Accion(String status, int id) {

        String sql = "update medidas set status=? where id=?";
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
