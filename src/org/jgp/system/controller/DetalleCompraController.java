
package org.jgp.system.controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jgp.system.models.CompraProductos;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormDetalleCompras;
import org.jgp.system.views.component.SubFormProductos;


public class DetalleCompraController  {

    private Productos producto;
    private ProductosDao productoD;
    private Proveedores proveedor;
    private ProveedoresDao proveedorD;
    private SubFormDetalleCompras sfcompra;
    DefaultTableModel modelDetalleCompra = new DefaultTableModel();

   



public DetalleCompraController(Productos producto, ProductosDao productoD, Proveedores proveedor, ProveedoresDao proveedorD, SubFormDetalleCompras sfcompra) {
        this.producto = producto;
        this.productoD = productoD;
        this.proveedor = proveedor;
        this.proveedorD = proveedorD;
        this.sfcompra = sfcompra;
        listarcompras();
        
       
        


    
}


 
 public void listarcompras() {
        Table color = new Table();
        sfcompra.tabledetalleCompra.setDefaultRenderer(sfcompra.tabledetalleCompra.getColumnClass(0), color);
        List<CompraProductos> lista = productoD.ListaDetalleCompra();
        modelDetalleCompra = (DefaultTableModel) sfcompra.tabledetalleCompra.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            Proveedores prov = new Proveedores();
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombrePro();
            ob[2] = lista.get(i).getTotal();
            ob[3] = lista.get(i).getFecha();
            modelDetalleCompra.addRow(ob);

        }

        sfcompra.tabledetalleCompra.setModel(modelDetalleCompra);

    }

    public void clearDetallecompraTable() {

        for (int i = 0; i < modelDetalleCompra.getRowCount(); i++) {
            modelDetalleCompra.removeRow(i);
            i = i - 1;
        }

    }


}