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
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormClientes;

public class ClientesController implements ActionListener, MouseListener, KeyListener {

    private Clientes cliente;
    private ClientesDao clienteD;
    private SubFormClientes sfc;
    DefaultTableModel modelCliente = new DefaultTableModel();

    public ClientesController(Clientes cliente, ClientesDao clienteD, SubFormClientes sfc) {
        this.cliente = cliente;
        this.clienteD = clienteD;
        this.sfc = sfc;
        this.sfc.tableCliente.addMouseListener(this);
        this.sfc.btnRegistrarCli.addActionListener(this);
        this.sfc.btnModificarCli.addActionListener(this);
        this.sfc.popEliminarCliente.addActionListener(this);
        this.sfc.popReingresarCliente.addActionListener(this);
        this.sfc.boxBuscarCli.addKeyListener(this);
        clearBoxCliente();
        listarCliente();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sfc.btnRegistrarCli) {
            if (sfc.boxNombreCli.getText().equals("")
                    || sfc.boxTelefonoCli.getText().equals("")
                    || sfc.boxDireccionCli.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                cliente.setNombre(sfc.boxNombreCli.getText());
                cliente.setTelefono(sfc.boxTelefonoCli.getText());
                cliente.setDireccion(sfc.boxDireccionCli.getText());

                if (clienteD.Registrar(cliente)) {
                    clearClienteTable();
                    listarCliente();

                    JOptionPane.showMessageDialog(null, "Usuario: " + sfc.boxNombreCli.getText() + " creado exitosamente!!");
                    clearBoxCliente();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");

                }

            }

        } else if (e.getSource() == sfc.btnModificarCli) {
            sfc.btnRegistrarCli.enableInputMethods(false);
            JOptionPane.showMessageDialog(null, "No puedes crear el mismo cliente 2 veces");
            if (sfc.boxNombreCli.getText().equals("")
                    || sfc.boxTelefonoCli.getText().equals("")
                    || sfc.boxDireccionCli.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                cliente.setNombre(sfc.boxNombreCli.getText());
                cliente.setTelefono(sfc.boxTelefonoCli.getText());
                cliente.setDireccion(sfc.boxDireccionCli.getText());

                if (clienteD.Modificarr(cliente)) {
                    clearClienteTable();
                    listarCliente();

                    JOptionPane.showMessageDialog(null, "Usuario: " + sfc.boxNombreCli.getText() + " creado exitosamente!!");
                    clearBoxCliente();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");

                }

            }

        } else if (e.getSource() == sfc.popEliminarCliente) {
            if (sfc.boxIdCli.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfc.boxIdCli.getText());
                if (clienteD.Accion("inactive", id)) {
                    clearClienteTable();
                    listarCliente();

                    JOptionPane.showMessageDialog(null, "Usuario:  " + sfc.boxNombreCli.getText() + " eliminado exitosamente!!");
                    clearBoxCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el usuario");
                }

            }
        } else if (e.getSource() == sfc.popReingresarCliente) {
            if (sfc.boxIdCli.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfc.boxIdCli.getText());
                if (clienteD.Accion("active", id)) {
                    clearClienteTable();
                    listarCliente();
                    JOptionPane.showMessageDialog(null, "Usuario:  " + sfc.boxNombreCli.getText() + " reingresar exitosamente!!");
                    clearBoxCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el usuario");
                }

            }
        }

    }

    public void listarCliente() {
        Table inactive = new Table();
        sfc.tableCliente.setDefaultRenderer(sfc.tableCliente.getColumnClass(0), inactive);
        List<Clientes> lista = clienteD.ListarClientes(sfc.boxBuscarCli.getText());
        modelCliente = (DefaultTableModel) sfc.tableCliente.getModel();
        Object[] obj = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getTelefono();
            obj[3] = lista.get(i).getDireccion();
            obj[4] = lista.get(i).getStatus();
            modelCliente.addRow(obj);

        }

        sfc.tableCliente.setModel(modelCliente);

    }

    public void clearClienteTable() {

        for (int i = 0; i < modelCliente.getRowCount(); i++) {
            modelCliente.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxCliente() {
        sfc.boxNombreCli.setText("");
        sfc.boxTelefonoCli.setText("");
        sfc.boxDireccionCli.setText("");
        sfc.boxIdCli.setText("");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfc.tableCliente) {
            int row = sfc.tableCliente.rowAtPoint(e.getPoint());
            sfc.boxIdCli.setText(sfc.tableCliente.getValueAt(row, 0).toString());
            sfc.boxNombreCli.setText(sfc.tableCliente.getValueAt(row, 1).toString());
            sfc.boxTelefonoCli.setText(sfc.tableCliente.getValueAt(row, 2).toString());
            sfc.boxDireccionCli.setText(sfc.tableCliente.getValueAt(row, 3).toString());

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
        if (e.getSource() == sfc.boxBuscarCli) {
            clearClienteTable();
            listarCliente();

        }

    }

}
