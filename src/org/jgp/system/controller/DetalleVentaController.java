
package org.jgp.system.controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Table;
import org.jgp.system.models.VentaProducto;
import org.jgp.system.views.component.SubFormDetalleVentas;


public class DetalleVentaController {

    private Productos producto;
    private ProductosDao productoD;
    private Clientes cliente;
    private ClientesDao clienteD;
    private SubFormDetalleVentas sfdv;
    DefaultTableModel modelDetalleVentas = new DefaultTableModel();

   



public DetalleVentaController(Productos producto, ProductosDao productoD, Clientes cliente, ClientesDao clienteD, SubFormDetalleVentas sfdv) {
        this.producto = producto;
        this.productoD = productoD;
        this.cliente = cliente;
        this.clienteD = clienteD;
        this.sfdv = sfdv;
        listarVentas();
        
       
        


    
}


 
 public void listarVentas() {
        Table color = new Table();
        sfdv.tableDetalleVenta.setDefaultRenderer(sfdv.tableDetalleVenta.getColumnClass(0), color);
        List<VentaProducto> lista = productoD.ListaDetalleVenta();
        modelDetalleVentas = (DefaultTableModel) sfdv.tableDetalleVenta.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            Clientes cli = new Clientes();
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombreCli();
            ob[2] = lista.get(i).getTotal();
            ob[3] = lista.get(i).getFecha();
            modelDetalleVentas.addRow(ob);

        }

       sfdv.tableDetalleVenta.setModel(modelDetalleVentas);

    }

    public void clearDetalleVentaTable() {

        for (int i = 0; i < modelDetalleVentas.getRowCount(); i++) {
            modelDetalleVentas.removeRow(i);
            i = i - 1;
        }

    }


}