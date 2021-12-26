
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
import org.jgp.system.models.ComboProducto;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.views.component.SubFormCompra;
import org.jgp.system.views.component.SubFormProveedores;


public class CompraController implements ActionListener, MouseListener, KeyListener {
    private Productos producto;
    private ProductosDao productoD;
    private Proveedores proveedor;
    private ProveedoresDao proveedorD;
    private SubFormProveedores sfp;
    private SubFormCompra sfcom;
    DefaultTableModel modelCompra = new DefaultTableModel();
    
     public CompraController(Productos producto, ProductosDao productoD, Proveedores proveedor, ProveedoresDao proveedorD, SubFormCompra sfcom) {
        this.producto = producto;
        this.productoD = productoD;
        this.proveedor = proveedor;
        this.proveedorD = proveedorD;
        this.sfcom = sfcom;
        this.sfcom.btnNuevaCompra.addActionListener(this);
        this.sfcom.popEliminarCompra.addActionListener(this);
        this.sfcom.popReingresarCompra.addActionListener(this);
        this.sfcom.tableCompra.addMouseListener(this);
        this.sfcom.boxCodigoCompra.addKeyListener(this);
        this.sfcom.boxCantidadCompra.addKeyListener(this);
        this.sfcom.boxPago2.addKeyListener(this);
        llenarProveedor();
        AutoCompleteDecorator.decorate(sfcom.comboProveedorCompra);
        
      
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sfcom.btnNuevaCompra){
            insertarCompra();
             //JOptionPane.showMessageDialog(null,"compra generada exitosamente!!");
             sfcom.labelTotalPagar.setText("-----");
        
        }else{
         JOptionPane.showMessageDialog(null,"Fallo al generar la compra");
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
        if(e.getSource() == sfcom.boxCodigoCompra){
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                if(sfcom.boxCodigoCompra.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"El campo 'CODIGO' esta vacio, por favor ingrese el codigo");
                }else{
                    String codigo = sfcom.boxCodigoCompra.getText();
                    producto = productoD.BuscarCodigo(codigo);
                    sfcom.boxIdCompra.setText(""+producto.getId());
                    sfcom.boxProductoCompra.setText(producto.getNombre());
                    sfcom.boxPrecioCompra.setText(""+producto.getPrecioCompra());
                    sfcom.boxCantidadCompra.requestFocus();
                    
                
                }
            }
        }else if(e.getSource() == sfcom.boxCantidadCompra){
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                int cant = Integer.parseInt(sfcom.boxCantidadCompra.getText());
                String nombre = sfcom.boxProductoCompra.getText();
                double precio = Double.parseDouble(sfcom.boxPrecioCompra.getText());
                double total = Double.parseDouble(sfcom.boxTotalcompra.getText());
                int id = Integer.parseInt(sfcom.boxIdCompra.getText());
                
                if(cant >0){
                  DefaultTableModel modelCompra = (DefaultTableModel) sfcom.tableCompra.getModel();
                  ArrayList listaCompra = new ArrayList();
                  int item =1;
                  listaCompra.add(item);
                  listaCompra.add(id);
                  listaCompra.add(nombre);
                  listaCompra.add(cant);
                  listaCompra.add(precio);
                  listaCompra.add(cant * precio);
                  Object[] obj = new Object[5];
                  obj[0] = listaCompra.get(1);
                  obj[1] = listaCompra.get(2);
                  obj[2] = listaCompra.get(3);
                  obj[3] = listaCompra.get(4);
                  obj[4] = listaCompra.get(5);
                  modelCompra.addRow(obj);
                  sfcom.tableCompra.setModel(modelCompra);
                  LimpiarBoxCompra();
                  calcularTotal();
                  sfcom.boxCodigoCompra.requestFocus();
                  
                }
            }
        
        
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == sfcom.boxCantidadCompra){
            int cantidad;
            double precio;
            if(sfcom.boxCantidadCompra.getText().equals("")){
                cantidad=1;
                precio = Double.parseDouble(sfcom.boxPrecioCompra.getText());
                sfcom.boxTotalcompra.setText(""+precio);
            }else{
                  cantidad = Integer.parseInt(sfcom.boxCantidadCompra.getText());
                  precio = Double.parseDouble(sfcom.boxPrecioCompra.getText());
                  sfcom.boxTotalcompra.setText(""+cantidad * precio);
                  
            
            }
        
        }else if(e.getSource() == sfcom.boxPago2){
            int pagar;
            
            if(sfcom.boxPago2.getText().equals("")){
               sfcom.boxCambio2.setText("");
                
            }else{
               pagar = Integer.parseInt(sfcom.boxPago2.getText());
               double total = Double.parseDouble(sfcom.labelTotalPagar.getText());
               sfcom.boxCambio2.setText("" + (pagar - total));
            
            }
        }
    }
    
    private void LimpiarBoxCompra(){
        sfcom.boxIdCompra.setText("");
        sfcom.boxCodigoCompra.setText("");
        sfcom.boxProductoCompra.setText("");
        sfcom.boxCantidadCompra.setText("");
        sfcom.boxPrecioCompra.setText("");
        sfcom.boxTotalcompra.setText("");
        
    }
    
    private void calcularTotal(){
        double total = 0.00;
        int cantFilas = sfcom.tableCompra.getRowCount();
        for(int i = 0; i < cantFilas; i++){
            total = total + Double.parseDouble(String.valueOf(sfcom.tableCompra.getValueAt(i, 4)));
        }
    sfcom.labelTotalPagar.setText(""+total);
    }
    
     public void llenarProveedor() {
        List<Proveedores> listP = proveedorD.ListarProveedor(sfcom.boxCodigoCompra.getText());
        for (int i = 0; i < listP.size(); i++) {
            int id = listP.get(i).getId();
            String nombre = listP.get(i).getNombre();
            sfcom.comboProveedorCompra.addItem(new ComboProducto(id, nombre));
        }
    }
    
    private void insertarCompra(){
    ComboProducto idP = (ComboProducto) sfcom.comboProveedorCompra.getSelectedItem();
    int idProveedor = idP.getId();
    String total = sfcom.labelTotalPagar.getText();
   if( productoD.registrarCompra(idProveedor, total)){
       for(int i = 0; i < sfcom.tableCompra.getRowCount(); i++){
           int idCompra = 1;
           double precio = Double.parseDouble(sfcom.tableCompra.getValueAt(i, 3).toString());
           int cantidad = Integer.parseInt(sfcom.tableCompra.getValueAt(i, 2).toString());
           double subtotal = precio * cantidad;
           if(productoD.registrarCompraDetalle(idCompra, precio, cantidad, subtotal)){
              
           
           }
       
       }
        JOptionPane.showMessageDialog(null,"compra generada exitosamente!!");
   
   }
    
    }
     
}
