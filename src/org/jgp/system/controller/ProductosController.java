package org.jgp.system.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jgp.system.models.Categoria;
import org.jgp.system.models.CategoriaDao;
import org.jgp.system.models.ComboProducto;
import org.jgp.system.models.Medidas;
import org.jgp.system.models.MedidasDao;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormProductos;
import org.jgp.system.views.component.SubFormProveedores;

public class ProductosController implements ActionListener, MouseListener, KeyListener {

    private Productos producto;
    private ProductosDao productoD;
    private Proveedores proveedor;
    private ProveedoresDao proveedorD;
    private Medidas medida;
    private MedidasDao medidaD;
    private Categoria categoria;
    private CategoriaDao categoriaD;
    private SubFormProductos sfpro;
    private SubFormProveedores sfp;
    DefaultTableModel modelProductos = new DefaultTableModel();

    public ProductosController(Productos producto, ProductosDao productoD, Proveedores proveedor, ProveedoresDao proveedorD, Medidas medida, MedidasDao medidaD, Categoria categoria, CategoriaDao categoriaD, SubFormProductos sfpro) {
        this.producto = producto;
        this.productoD = productoD;
        this.proveedor = proveedor;
        this.proveedorD = proveedorD;
        this.medida = medida;
        this.medidaD = medidaD;
        this.categoria = categoria;
        this.categoriaD = categoriaD;
        this.sfpro = sfpro;
        this.sfpro.btnRegistrarPro.addActionListener(this);
        this.sfpro.btnModificarPro.addActionListener(this);
        this.sfpro.popEliminarProducto.addActionListener(this);
        this.sfpro.popReingresarProducto.addActionListener(this);
        this.sfpro.btnBuscarProducto.addKeyListener(this);
        this.sfpro.tableProducto.addMouseListener(this);
        clearBoxProducto();
        listarProductos();
        llenarProveedor();
        llenarMedida();
        llenarCategoria();
        AutoCompleteDecorator.decorate(sfpro.comboProveedorPro);
        AutoCompleteDecorator.decorate(sfpro.comboMedidaPro);
        AutoCompleteDecorator.decorate(sfpro.comboCategoriaPro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sfpro.btnRegistrarPro) {
            if (sfpro.boxCodePro.getText().equals("")
                    || sfpro.boxNombrePro.getText().equals("")
                    || sfpro.boxPCompraPro.getText().equals("")
                    || sfpro.boxPVentaPro.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                producto.setCodigo(sfpro.boxCodePro.getText());
                producto.setNombre(sfpro.boxNombrePro.getText());
                producto.setPrecioCompra(Double.parseDouble(sfpro.boxPCompraPro.getText()));
                producto.setPrecioVenta(Double.parseDouble(sfpro.boxPVentaPro.getText()));
               ComboProducto itemP = (ComboProducto) sfpro.comboProveedorPro.getSelectedItem();
               ComboProducto itemM = (ComboProducto) sfpro.comboMedidaPro.getSelectedItem();
               ComboProducto itemC = (ComboProducto) sfpro.comboCategoriaPro.getSelectedItem();
               producto.setIdProveedor(itemP.getId());
               producto.setIdMedida(itemM.getId());
               producto.setIdCategoria(itemC.getId());
                if (productoD.Registrar(producto)) {
                    clearProductoTable();
                    listarProductos();

                    JOptionPane.showMessageDialog(null, "producto: " + sfpro.boxNombrePro.getText() + " creado exitosamente!!");
                    clearBoxProducto();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar el producto");

                }

            }

        } else if (e.getSource() == sfpro.btnModificarPro) {

            if (sfpro.boxCodePro.getText().equals("")
                    || sfpro.boxNombrePro.getText().equals("")
                    || sfpro.boxPCompraPro.getText().equals("")
                    || sfpro.boxPVentaPro.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
               producto.setCodigo(sfpro.boxCodePro.getText());
                producto.setNombre(sfpro.boxNombrePro.getText());
                producto.setPrecioCompra(Double.parseDouble(sfpro.boxPCompraPro.getText()));
                producto.setPrecioVenta(Double.parseDouble(sfpro.boxPVentaPro.getText()));
               ComboProducto itemP = (ComboProducto) sfpro.comboProveedorPro.getSelectedItem();
               ComboProducto itemM = (ComboProducto) sfpro.comboMedidaPro.getSelectedItem();
               ComboProducto itemC = (ComboProducto) sfpro.comboCategoriaPro.getSelectedItem();
               producto.setIdProveedor(itemP.getId());
               producto.setIdMedida(itemM.getId());
               producto.setIdCategoria(itemC.getId());
               producto.setId(Integer.parseInt(sfpro.boxIdProducto.getText()));
                if (productoD.Modificar(producto)) {
                    clearProductoTable();
                    listarProductos();

                    JOptionPane.showMessageDialog(null, "producto: " + sfpro.boxNombrePro.getText() + " actualizado exitosamente!!");
                    clearBoxProducto();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al modificar el producto");

                }

            }

        } else if (e.getSource() == sfpro.popEliminarProducto) {
            if (sfpro.boxIdProducto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfpro.boxIdProducto.getText());
                if (productoD.Accion("inactive", id)) {
                    clearProductoTable();
                    listarProductos();

                    JOptionPane.showMessageDialog(null, "producto:  " + sfpro.boxNombrePro.getText() + " eliminado exitosamente!!");
                    clearBoxProducto();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el producto");
                }

            }
        } else if (e.getSource() == sfpro.popReingresarProducto) {
            if (sfpro.boxIdProducto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfpro.boxIdProducto.getText());
                if (productoD.Accion("active", id)) {
                    clearProductoTable();
                    listarProductos();
                    JOptionPane.showMessageDialog(null, "producto:  " + sfpro.boxNombrePro.getText() + " reingresar exitosamente!!");
                    clearBoxProducto();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el producto");
                }

            }
        }

    }

    public void listarProductos() {
        Table color = new Table();
        sfpro.tableProducto.setDefaultRenderer(sfpro.tableProducto.getColumnClass(0), color);
        List<Productos> lista = productoD.ListarProductos(sfpro.boxBuscarProducto.getText());
        modelProductos = (DefaultTableModel) sfpro.tableProducto.getModel();
        Object[] obj = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getCodigo();
            obj[2] = lista.get(i).getNombre();
            obj[3] = lista.get(i).getCantidad();
            obj[4] = lista.get(i).getPrecioCompra();
            obj[5] = lista.get(i).getPrecioVenta();
            obj[6] = lista.get(i).getStatus();
            modelProductos.addRow(obj);

        }

        sfpro.tableProducto.setModel(modelProductos);

    }

    public void clearProductoTable() {

        for (int i = 0; i < modelProductos.getRowCount(); i++) {
            modelProductos.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxProducto() {
        sfpro.boxIdProducto.setText("");
        sfpro.boxCodePro.setText("");
        sfpro.boxNombrePro.setText("");
        sfpro.boxPCompraPro.setText("");
        sfpro.boxPVentaPro.setText("");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfpro.tableProducto) {
            int row = sfpro.tableProducto.rowAtPoint(e.getPoint());
            sfpro.boxIdProducto.setText(sfpro.tableProducto.getValueAt(row, 0).toString());
           producto =  productoD.BuscarProductos(Integer.parseInt(sfpro.boxIdProducto.getText()));
           sfpro.boxCodePro.setText(producto.getCodigo());
           sfpro.boxNombrePro.setText(producto.getNombre());
           sfpro.boxPCompraPro.setText(""+producto.getPrecioCompra());
           sfpro.boxPVentaPro.setText(""+producto.getPrecioVenta());
           sfpro.comboProveedorPro.setSelectedItem(new ComboProducto(producto.getIdProveedor(), producto.getProveedor()));
           sfpro.comboMedidaPro.setSelectedItem(new ComboProducto(producto.getIdMedida(), producto.getMedida()));
           sfpro.comboCategoriaPro.setSelectedItem(new ComboProducto(producto.getIdCategoria(), producto.getCategoria()));
           sfpro.btnRegistrarPro.setEnabled(false);

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == sfpro.boxBuscarProducto) {
            clearProductoTable();
            listarProductos();

        }
    }

    public void llenarProveedor() {
        List<Proveedores> listP = proveedorD.ListarProveedor(sfpro.boxBuscarProducto.getText());
        for (int i = 0; i < listP.size(); i++) {
            int id = listP.get(i).getId();
            String nombre = listP.get(i).getNombre();
            sfpro.comboProveedorPro.addItem(new ComboProducto(id, nombre));
        }
    }

    public void llenarMedida() {
        List<Medidas> listM = medidaD.ListarMedidas(sfpro.boxBuscarProducto.getText());
        for (int i = 0; i < listM.size(); i++) {
            int id = listM.get(i).getId();
            String nombre = listM.get(i).getNombre();
            sfpro.comboMedidaPro.addItem(new ComboProducto(id, nombre));
        }
    }

    public void llenarCategoria() {
        List<Categoria> listC = categoriaD.ListarCategorias(sfpro.boxBuscarProducto.getText());
        for (int i = 0; i < listC.size(); i++) {
            int id = listC.get(i).getId();
            String nombre = listC.get(i).getNombre();
            sfpro.comboCategoriaPro.addItem(new ComboProducto(id, nombre));
        }
    }

}
