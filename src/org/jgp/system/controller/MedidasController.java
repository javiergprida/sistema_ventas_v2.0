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
import org.jgp.system.models.Medidas;
import org.jgp.system.models.MedidasDao;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormMedidas;
import org.jgp.system.views.component.SubFormProductos;

public class MedidasController implements ActionListener, MouseListener, KeyListener {

    private Medidas medida;
    private MedidasDao medidaD;
    private SubFormMedidas sfm;
    private SubFormProductos sfpro;

    DefaultTableModel modelMedidas = new DefaultTableModel();

    public MedidasController(Medidas medida, MedidasDao medidaD, SubFormMedidas sfm) {
        this.medida = medida;
        this.medidaD = medidaD;
        this.sfm = sfm;
        this.sfm.tableMedida.addMouseListener(this);
        this.sfm.btnRegistrarMedida.addActionListener(this);
        this.sfm.btnModificarMedida.addActionListener(this);
        this.sfm.popEliminarMedida.addActionListener(this);
        this.sfm.popReingresarMedida.addActionListener(this);
        this.sfm.boxBuscarMedida.addKeyListener(this);
        //llenarMedida();
        clearBoxMedida();
        listarMedida();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sfm.btnRegistrarMedida) {
            if (sfm.boxNombreMedida.getText().equals("")
                    || sfm.boxAbrevMedida.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                medida.setNombre(sfm.boxNombreMedida.getText());
                medida.setAbreviatura(sfm.boxAbrevMedida.getText());

                if (medidaD.Registrar(medida)) {
                    clearMedidaTable();
                    listarMedida();

                    JOptionPane.showMessageDialog(null, "Medida: " + sfm.boxNombreMedida.getText() + " creado exitosamente!!");
                    clearBoxMedida();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar la Medida");

                }

            }

        } else if (e.getSource() == sfm.btnModificarMedida) {
            if (sfm.boxNombreMedida.getText().equals("")
                    || sfm.boxAbrevMedida.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                medida.setNombre(sfm.boxNombreMedida.getText());
                medida.setAbreviatura(sfm.boxAbrevMedida.getText());
                medida.setId(Integer.parseInt(sfm.boxIdMedida.getText()));

                if (medidaD.Modificarr(medida)) {
                    clearMedidaTable();
                    listarMedida();

                    JOptionPane.showMessageDialog(null, "Medida: " + sfm.boxNombreMedida.getText() + " creado exitosamente!!");
                    clearBoxMedida();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar la Medida");

                }

            }

        } else if (e.getSource() == sfm.popEliminarMedida) {
            if (sfm.boxIdMedida.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfm.boxIdMedida.getText());
                if (medidaD.Accion("inactive", id)) {
                    clearMedidaTable();
                    listarMedida();

                    JOptionPane.showMessageDialog(null, "Medida:  " + sfm.boxNombreMedida.getText() + " eliminado exitosamente!!");
                    clearBoxMedida();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Medida");
                }

            }
        } else if (e.getSource() == sfm.popReingresarMedida) {
            if (sfm.boxIdMedida.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfm.boxIdMedida.getText());
                if (medidaD.Accion("active", id)) {
                    clearMedidaTable();
                    listarMedida();
                    JOptionPane.showMessageDialog(null, "Medida:  " + sfm.boxNombreMedida.getText() + " reingresar exitosamente!!");
                    clearBoxMedida();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la Medida");
                }

            }
        }

    }

    public void listarMedida() {
        Table color = new Table();
        sfm.tableMedida.setDefaultRenderer(sfm.tableMedida.getColumnClass(0), color);
        List<Medidas> lista = medidaD.ListarMedidas(sfm.boxBuscarMedida.getText());
        modelMedidas = (DefaultTableModel) sfm.tableMedida.getModel();
        Object[] obj = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getAbreviatura();
            obj[3] = lista.get(i).getStatus();
            modelMedidas.addRow(obj);

        }

        sfm.tableMedida.setModel(modelMedidas);

    }

    public void clearMedidaTable() {

        for (int i = 0; i < modelMedidas.getRowCount(); i++) {
            modelMedidas.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxMedida() {
        sfm.boxNombreMedida.setText("");
        sfm.boxAbrevMedida.setText("");
        sfm.boxBuscarMedida.setText("");
        sfm.boxIdMedida.setText("");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfm.tableMedida) {
            int row = sfm.tableMedida.rowAtPoint(e.getPoint());
            sfm.boxIdMedida.setText(sfm.tableMedida.getValueAt(row, 0).toString());
            sfm.boxNombreMedida.setText(sfm.tableMedida.getValueAt(row, 1).toString());
            sfm.boxAbrevMedida.setText(sfm.tableMedida.getValueAt(row, 2).toString());
            sfm.btnRegistrarMedida.setEnabled(false);

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
        if (e.getSource() == sfm.boxBuscarMedida) {
            clearMedidaTable();
            listarMedida();

        }

    }

    

}
