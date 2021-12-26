package org.jgp.system.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductosDao {

    connection cn = new connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean Registrar(Productos producto) {
        String sql = "insert into productos (codigo, nombre , cantidad, precio_compra, precio_venta, id_proveedor, id_medida, id_categoria) values (?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecioCompra());
            ps.setDouble(5, producto.getPrecioVenta());
            ps.setInt(6, producto.getIdProveedor());
            ps.setInt(7, producto.getIdMedida());
            ps.setInt(8, producto.getIdCategoria());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public List ListarProductos(String valor) {

        List<Productos> listaProductos = new ArrayList();
        String sql = "select * from productos order by status asc";
        String buscar = "select * from productos where codigo like '%" + valor + "%'  OR  nombre like '%" + valor + "%' ";
        try {
            con = cn.getConnection();
            if (valor.equalsIgnoreCase(" ")) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            } else {
                ps = con.prepareStatement(buscar);
                rs = ps.executeQuery();

            }
            while (rs.next()) {
                Productos producto = new Productos();
                producto.setId(rs.getInt("id"));
                producto.setCodigo(rs.getString("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecioCompra(rs.getDouble("precio_compra"));
                producto.setPrecioVenta(rs.getDouble("precio_venta"));
                producto.setStatus(rs.getString("status"));
                listaProductos.add(producto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return listaProductos;
    }

    public boolean Modificar(Productos producto) {
        String sql = "update productos set codigo=?, nombre=?, precio_compra=?, precio_venta=?, id_proveedor=?, id_medida=?, id_categoria=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecioCompra());
            ps.setDouble(4, producto.getPrecioVenta());
            ps.setInt(5, producto.getIdProveedor());
            ps.setInt(6, producto.getIdMedida());
            ps.setInt(7, producto.getIdCategoria());
            ps.setInt(8, producto.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        }

    }

    public boolean Accion(String status, int id) {

        String sql = "update productos set status=? where id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2, id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return (false);
        }
    }

    public Productos BuscarProductos(int id) {
        String sql = "select p.*, pr.id,pr.proveedor, me.id, me.medida,ca.id,ca.categoria from productos p inner join proveedores pr on p.id_proveedor = pr.id inner join medidas me on p.id_medida = me.id inner join categorias ca on p.id_categoria = ca.id where p.id = ?";
        Productos producto = new Productos();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setCodigo(rs.getString("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecioCompra(rs.getDouble("precio_compra"));
                producto.setPrecioVenta(rs.getDouble("precio_venta"));
                producto.setIdProveedor(rs.getInt("id_proveedor"));
                producto.setIdMedida(rs.getInt("id_medida"));
                producto.setIdCategoria(rs.getInt("id_categoria"));
                producto.setProveedor(rs.getString("proveedor"));
                producto.setMedida(rs.getString("medida"));
                producto.setCategoria(rs.getString("categoria"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return producto;
    }

}
