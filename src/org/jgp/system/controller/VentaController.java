package org.jgp.system.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.models.ComboProducto;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.views.PrintDetalleVenta;
import org.jgp.system.views.component.SubFormProveedores;
import org.jgp.system.views.component.SubFormVenta;

public class VentaController implements ActionListener, MouseListener, KeyListener {

    private Productos producto;
    private ProductosDao productoD;
    private Clientes cliente;
    private ClientesDao clienteD;
    private SubFormProveedores sfp;
    private SubFormVenta sfventa;
    DefaultTableModel modelVenta = new DefaultTableModel();

    public VentaController(Productos producto, ProductosDao productoD, Clientes cliente, ClientesDao clienteD, SubFormVenta sfventa) {
        this.producto = producto;
        this.productoD = productoD;
        this.cliente = cliente;
        this.clienteD = clienteD;
        this.sfventa = sfventa;
        this.sfventa.btnNuevaVenta.addActionListener(this);
        this.sfventa.popEliminarVenta.addActionListener(this);
        this.sfventa.popReingresarVenta.addActionListener(this);
        this.sfventa.tableVenta.addMouseListener(this);
        this.sfventa.boxCodigoVenta.addKeyListener(this);
        this.sfventa.boxCantidadVenta.addKeyListener(this);
        this.sfventa.boxPago.addKeyListener(this);
        llenarCliente();
        AutoCompleteDecorator.decorate(sfventa.comboClienteVenta);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sfventa.btnNuevaVenta) {
            insertarVenta();
            //JOptionPane.showMessageDialog(null,"compra generada exitosamente!!");
            sfventa.TotalPagar.setText("-----");

        } else {
            JOptionPane.showMessageDialog(null, "Fallo al generar la venta");
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
        if (e.getSource() == sfventa.boxCodigoVenta) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (sfventa.boxCodigoVenta.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "El campo 'CODIGO' esta vacio, por favor ingrese el codigo");
                } else {
                    String codigo = sfventa.boxCodigoVenta.getText();
                    producto = productoD.BuscarCodigoVenta(codigo);
                    sfventa.boxIdVenta.setText("" + producto.getId());
                    sfventa.boxProductoVenta.setText(producto.getNombre());
                    sfventa.boxStockPro.setText("" + producto.getCantidad());
                    sfventa.boxPrecioVenta.setText("" + producto.getPrecioVenta());
                    sfventa.boxCantidadVenta.requestFocus();

                }
            }
        } else if (e.getSource() == sfventa.boxCantidadVenta) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                int cant = Integer.parseInt(sfventa.boxCantidadVenta.getText());
                String nombre = sfventa.boxProductoVenta.getText();
                double precio = Double.parseDouble(sfventa.boxPrecioVenta.getText());
                double total = Double.parseDouble(sfventa.boxTotalVenta.getText());
                int id = Integer.parseInt(sfventa.boxIdVenta.getText());

                if (cant > 0) {
                    modelVenta = (DefaultTableModel) sfventa.tableVenta.getModel();
                    ArrayList listaVenta = new ArrayList();
                    int item = 1;
                    listaVenta.add(item);
                    listaVenta.add(id);
                    listaVenta.add(nombre);
                    listaVenta.add(cant);
                    listaVenta.add(precio);
                    listaVenta.add(cant * precio);
                    Object[] obj = new Object[5];
                    obj[0] = listaVenta.get(1);
                    obj[1] = listaVenta.get(2);
                    obj[2] = listaVenta.get(3);
                    obj[3] = listaVenta.get(4);
                    obj[4] = listaVenta.get(5);
                    modelVenta.addRow(obj);
                    sfventa.tableVenta.setModel(modelVenta);
                    LimpiarBoxVenta();
                    calcularTotal();
                    sfventa.boxCodigoVenta.requestFocus();

                }
            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == sfventa.boxCantidadVenta) {
            int cantidad;
            double precio;
            if (sfventa.boxCantidadVenta.getText().equals("")) {
                cantidad = 1;
                precio = Double.parseDouble(sfventa.boxPrecioVenta.getText());
                sfventa.boxTotalVenta.setText("" + precio);
            } else {
                cantidad = Integer.parseInt(sfventa.boxCantidadVenta.getText());
                precio = Double.parseDouble(sfventa.boxPrecioVenta.getText());
                sfventa.boxTotalVenta.setText("" + cantidad * precio);

            }

        } else if (e.getSource() == sfventa.boxPago) {
            int pagar;

            if (sfventa.boxPago.getText().equals("")) {
                sfventa.boxCambio.setText("");

            } else {
                pagar = Integer.parseInt(sfventa.boxPago.getText());
                double total = Double.parseDouble(sfventa.TotalPagar.getText());
                sfventa.boxCambio.setText("" + (pagar - total));

            }
        }
    }

    private void LimpiarBoxVenta() {
        sfventa.boxIdVenta.setText("");
        sfventa.boxCodigoVenta.setText("");
        sfventa.boxProductoVenta.setText("");
        sfventa.boxCantidadVenta.setText("");
        sfventa.boxPrecioVenta.setText("");
        sfventa.boxTotalVenta.setText("");
        sfventa.boxStockPro.setText("");

    }

    private void calcularTotal() {
        double total = 0.00;
        int cantFilas = sfventa.tableVenta.getRowCount();
        for (int i = 0; i < cantFilas; i++) {
            total = total + Double.parseDouble(String.valueOf(sfventa.tableVenta.getValueAt(i, 4)));
        }
        sfventa.TotalPagar.setText("" + total);
    }

    public void llenarCliente() {
        List<Clientes> listC = clienteD.ListarClientes(sfventa.boxIdVenta.getText());
        for (int i = 0; i < listC.size(); i++) {
            int id = listC.get(i).getId();
            String nombre = listC.get(i).getNombre();
            sfventa.comboClienteVenta.addItem(new ComboProducto(id, nombre));
        }
    }

    private void insertarVenta() {
        ComboProducto idc = (ComboProducto) sfventa.comboClienteVenta.getSelectedItem();
        int idCliente = idc.getId();
        String total = sfventa.TotalPagar.getText();
        if (productoD.registrarVenta(idCliente, total)) {
            int idVenta = productoD.id_venta();
            for (int i = 0; i < sfventa.tableVenta.getRowCount(); i++) {

                double precio = Double.parseDouble(sfventa.tableVenta.getValueAt(i, 3).toString());
                int cantidad = Integer.parseInt(sfventa.tableVenta.getValueAt(i, 2).toString());
                int id = Integer.parseInt(sfventa.tableVenta.getValueAt(i, 0).toString());
                double subtotal = precio * cantidad;
                productoD.RegistrarVentaDetalle(idVenta, id, precio, cantidad, subtotal);
                producto = productoD.BuscarId(id);
                int cantActual = producto.getCantidad() - cantidad;
                productoD.ActualizarStockVenta(cantActual, id);

            }
            clearVentaTable();
            JOptionPane.showMessageDialog(null, "venta generada exitosamente!!");
            PrintDetalleVenta pd = new PrintDetalleVenta(idVenta);
            pd.setVisible(true);

        }

    }

    public void clearVentaTable() {

        for (int i = 0; i < modelVenta.getRowCount(); i++) {
            modelVenta.removeRow(i);
            i = i - 1;
        }

    }

}
