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

import org.jgp.system.models.Table;
import org.jgp.system.models.Users;
import org.jgp.system.models.UsersDao;
import org.jgp.system.views.component.SubFormUsuarios;

public class UsersController implements ActionListener, MouseListener, KeyListener {

    private Users us;
    private UsersDao usDao;
    private SubFormUsuarios sfuv;
    DefaultTableModel model = new DefaultTableModel();

    public UsersController(Users us, UsersDao usDao, SubFormUsuarios sfuv) {
        this.us = us;
        this.usDao = usDao;
        this.sfuv = sfuv;
        this.sfuv.btnRegistrarUsers.addActionListener(this);
        this.sfuv.btnModificarUsers.addActionListener(this);
        this.sfuv.popEliminarUsers.addActionListener(this);
        this.sfuv.popReingresarUsers.addActionListener(this);
        this.sfuv.boxBuscarUser.addKeyListener(this);
        this.sfuv.tableUsers.addMouseListener(this);
        clearBoxUsers();
        listarUsers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sfuv.btnRegistrarUsers) {
            if (sfuv.boxUsernameUsers.getText().equals("")
                    || sfuv.boxFullnameUsers.getText().equals("")
                    || String.valueOf(sfuv.boxPasswordUsers.getPassword()).equals("")
                    || String.valueOf(sfuv.boxRePasswordUsers.getPassword()).equals("")
                    || sfuv.boxEmailUsers.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                us.setUsername(sfuv.boxUsernameUsers.getText());
                us.setFullname(sfuv.boxFullnameUsers.getText());
                us.setPassword(String.valueOf(sfuv.boxPasswordUsers.getPassword()));
                us.setEmail(sfuv.boxEmailUsers.getText());
                us.setCash(sfuv.comboCashUsers.getSelectedItem().toString());
                us.setRol(sfuv.comboRolUsers.getSelectedItem().toString());
                if (usDao.Registrar(us)) {
                    clearUsersTable();
                    listarUsers();

                    JOptionPane.showMessageDialog(null, "Usuario: " + sfuv.boxUsernameUsers.getText() + " creado exitosamente!!");
                    clearBoxUsers();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");

                }

            }

        } else if (e.getSource() == sfuv.btnModificarUsers) {
            if (sfuv.boxUsernameUsers.getText().equals("")
                    || sfuv.boxFullnameUsers.getText().equals("")
                    || sfuv.boxEmailUsers.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                us.setUsername(sfuv.boxUsernameUsers.getText());
                us.setFullname(sfuv.boxFullnameUsers.getText());
                us.setEmail(sfuv.boxEmailUsers.getText());
                us.setCash(sfuv.comboCashUsers.getSelectedItem().toString());
                us.setRol(sfuv.comboRolUsers.getSelectedItem().toString());
                us.setId(Integer.parseInt(sfuv.boxIdUsers.getText()));
                if (usDao.Modificarr(us)) {
                    clearUsersTable();
                    listarUsers();

                    JOptionPane.showMessageDialog(null, "Usuario: " + sfuv.boxUsernameUsers.getText() + " actualizado exitosamente!!");
                    clearBoxUsers();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al modificar el usuario");

                }

            }

        } else if (e.getSource() == sfuv.popEliminarUsers) {
            if (sfuv.boxIdUsers.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfuv.boxIdUsers.getText());
                if (usDao.Accion("inactive", id)) {
                    clearUsersTable();
                    listarUsers();

                    JOptionPane.showMessageDialog(null, "Usuario:  " + sfuv.boxUsernameUsers.getText() + " eliminado exitosamente!!");
                    clearBoxUsers();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el usuario");
                }

            }
        } else if (e.getSource() == sfuv.popReingresarUsers) {
            if (sfuv.boxIdUsers.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfuv.boxIdUsers.getText());
                if (usDao.Accion("active", id)) {
                    clearUsersTable();
                    listarUsers();
                    JOptionPane.showMessageDialog(null, "Usuario:  " + sfuv.boxUsernameUsers.getText() + " reingresar exitosamente!!");
                    clearBoxUsers();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar el usuario");
                }

            }
        }

    }

    public void listarUsers() {
        Table color = new Table();
        sfuv.tableUsers.setDefaultRenderer(sfuv.tableUsers.getColumnClass(0), color);
        List<Users> lista = usDao.ListarUsers(sfuv.boxBuscarUser.getText());
        model = (DefaultTableModel) sfuv.tableUsers.getModel();
        Object[] obj = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getUsername();
            obj[2] = lista.get(i).getFullname();
            obj[3] = lista.get(i).getEmail();
            obj[4] = lista.get(i).getCash();
            obj[5] = lista.get(i).getRol();
            obj[6] = lista.get(i).getStatus();
            model.addRow(obj);

        }

        sfuv.tableUsers.setModel(model);

    }

    public void clearUsersTable() {

        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxUsers() {
        sfuv.boxIdUsers.setText("");
        sfuv.boxUsernameUsers.setText("");
        sfuv.boxFullnameUsers.setText("");
        sfuv.boxPasswordUsers.setText("");
        sfuv.boxRePasswordUsers.setText("");
        sfuv.boxEmailUsers.setText("");
        sfuv.comboCashUsers.setSelectedIndex(0);
        sfuv.comboRolUsers.setSelectedIndex(0);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfuv.tableUsers) {
            int row = sfuv.tableUsers.rowAtPoint(e.getPoint());
            sfuv.boxIdUsers.setText(sfuv.tableUsers.getValueAt(row, 0).toString());
            sfuv.boxUsernameUsers.setText(sfuv.tableUsers.getValueAt(row, 1).toString());
            sfuv.boxFullnameUsers.setText(sfuv.tableUsers.getValueAt(row, 2).toString());
            sfuv.boxEmailUsers.setText(sfuv.tableUsers.getValueAt(row, 3).toString());
            sfuv.comboCashUsers.setSelectedItem(sfuv.tableUsers.getValueAt(row, 4).toString());
            sfuv.comboRolUsers.setSelectedItem(sfuv.tableUsers.getValueAt(row, 5).toString());
            sfuv.boxPasswordUsers.setEnabled(false);
            sfuv.boxRePasswordUsers.setEnabled(false);
            sfuv.btnRegistrarUsers.setEnabled(false);

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
        if (e.getSource() == sfuv.boxBuscarUser) {
            clearUsersTable();
            listarUsers();

        }
    }

}
