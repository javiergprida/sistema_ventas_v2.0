
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
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormProveedores;


public class Proveedorescontroller implements ActionListener, MouseListener, KeyListener {
   
    private Proveedores proveedor;
    private ProveedoresDao proveedorD;
    private SubFormProveedores sfp;
     DefaultTableModel modelProveeddor = new DefaultTableModel();
     
     public Proveedorescontroller(Proveedores proveedor, ProveedoresDao proveedorD,SubFormProveedores sfp ){
         this.proveedor = proveedor;
         this.proveedorD = proveedorD;
         this.sfp = sfp;this.sfp.tableProveedor.addMouseListener(this);
         this.sfp.btnRegistrarProve.addActionListener(this);
         this.sfp.btnModificarProve.addActionListener(this);
         this.sfp.popEliminarProveedor.addActionListener(this);
         this.sfp.popReingresarProveedor.addActionListener(this);
         this.sfp.boxBuscarProveedor.addKeyListener(this);
        clearBoxProveedor();
         listarProveedor();
         
     
     }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == sfp.btnRegistrarProve) {
            if (sfp.boxCuitProve.getText().equals("")
                    || sfp.boxNombreProve.getText().equals("")
                    || sfp.boxTelefonoProve.getText().equals("")
                    || sfp.boxDireccionProve.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                proveedor.setCuit(sfp.boxCuitProve.getText());
                proveedor.setNombre(sfp.boxNombreProve.getText());
                proveedor.setTelefono(sfp.boxTelefonoProve.getText());
                proveedor.setDireccion(sfp.boxDireccionProve.getText());

                if (proveedorD.Registrar(proveedor)) {
                    clearProveedorTable();
                    listarProveedor();

                    JOptionPane.showMessageDialog(null, "proveedor: " + sfp.boxNombreProve.getText() + " creado exitosamente!!");
                    clearBoxProveedor();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar el proveedor");

                }

            }

        } else if (e.getSource() == sfp.btnModificarProve) {
            sfp.btnRegistrarProve.enableInputMethods(false);
            JOptionPane.showMessageDialog(null, "No puedes crear el mismo proveedor 2 veces");
           if (sfp.boxCuitProve.getText().equals("")
                    || sfp.boxNombreProve.getText().equals("")
                    || sfp.boxTelefonoProve.getText().equals("")
                    || sfp.boxDireccionProve.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                proveedor.setCuit(sfp.boxCuitProve.getText());
                proveedor.setNombre(sfp.boxNombreProve.getText());
                proveedor.setTelefono(sfp.boxTelefonoProve.getText());
                proveedor.setDireccion(sfp.boxDireccionProve.getText());

                if (proveedorD.Modificarr(proveedor)) {
                    clearProveedorTable();
                    listarProveedor();

                    JOptionPane.showMessageDialog(null, "proveedor: " + sfp.boxNombreProve.getText() + " creado exitosamente!!");
                    clearBoxProveedor();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar el proveedor");

                }

            }

        } else if (e.getSource() == sfp.popEliminarProveedor) {
            if (sfp.boxIdProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfp.boxIdProveedor.getText());
                if (proveedorD.Accion("inactive", id)) {
                    clearProveedorTable();
                    listarProveedor();


                    JOptionPane.showMessageDialog(null, "proveedor:  " + sfp.boxNombreProve.getText() + " eliminado exitosamente!!");
                    clearBoxProveedor();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el proveedor");
                }

            }
        } else if (e.getSource() == sfp.popReingresarProveedor) {
            if (sfp.boxIdProveedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfp.boxIdProveedor.getText());
                if (proveedorD.Accion("active", id)) {
                    clearProveedorTable();
                    listarProveedor();
                    JOptionPane.showMessageDialog(null, "proveedor:  " + sfp.boxNombreProve.getText() + " reingresar exitosamente!!");
                    clearBoxProveedor();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el proveedor");
                }

            }
        }
    }
    
     public void listarProveedor() {
        Table inactive = new Table();
        sfp.tableProveedor.setDefaultRenderer(sfp.tableProveedor.getColumnClass(0), inactive);
        List<Proveedores> lista = proveedorD.ListarProveedor(sfp.boxBuscarProveedor.getText());
        modelProveeddor = (DefaultTableModel) sfp.tableProveedor.getModel();
        Object[] obj = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getCuit();
            obj[2] = lista.get(i).getNombre();
            obj[3] = lista.get(i).getTelefono();
            obj[4] = lista.get(i).getDireccion();
            obj[5] = lista.get(i).getStatus();
            modelProveeddor.addRow(obj);

        }

        sfp.tableProveedor.setModel(modelProveeddor);

    }

    public void clearProveedorTable(){

        for (int i = 0; i < modelProveeddor.getRowCount(); i++) {
            modelProveeddor.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxProveedor() {
        sfp.boxIdProveedor.setText("");
        sfp.boxCuitProve.setText("");
        sfp.boxNombreProve.setText("");
        sfp.boxTelefonoProve.setText("");
        sfp.boxDireccionProve.setText("");
        sfp.boxBuscarProveedor.setText("");

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfp.tableProveedor) {
            int row = sfp.tableProveedor.rowAtPoint(e.getPoint());
            sfp.boxIdProveedor.setText(sfp.tableProveedor.getValueAt(row, 0).toString());
            sfp.boxCuitProve.setText(sfp.tableProveedor.getValueAt(row, 1).toString());
            sfp.boxNombreProve.setText(sfp.tableProveedor.getValueAt(row, 2).toString());
            sfp.boxTelefonoProve.setText(sfp.tableProveedor.getValueAt(row, 3).toString());
            sfp.boxDireccionProve.setText(sfp.tableProveedor.getValueAt(row, 4).toString());

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
        if (e.getSource() == sfp.boxBuscarProveedor) {
             clearProveedorTable();
             listarProveedor();

        }
        
    }
    
}
