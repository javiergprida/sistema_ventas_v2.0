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
import org.jgp.system.models.Categoria;
import org.jgp.system.models.CategoriaDao;
import org.jgp.system.models.Medidas;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormCategoria;

public class CategoriaController implements ActionListener, MouseListener, KeyListener {

    private Categoria categoria;
    private CategoriaDao categoriaD;
    private SubFormCategoria sfc;
    DefaultTableModel modelCategoria = new DefaultTableModel();

    public CategoriaController(Categoria categoria, CategoriaDao categoriaD, SubFormCategoria sfc) {
        this.categoria = categoria;
        this.categoriaD = categoriaD;
        this.sfc = sfc;
        this.sfc.tableCategoria.addMouseListener(this);
        this.sfc.popEliminarCategoria.addActionListener(this);
        this.sfc.popReingresarcategoria.addActionListener(this);
        this.sfc.boxBuscarCategoria.addKeyListener(this);
        this.sfc.btnRegistrarCategoria.addActionListener(this);
        this.sfc.btnModificarCategoria.addActionListener(this);
        clearBoxCategoria();
        listarCategoria();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sfc.btnRegistrarCategoria) {
            if (sfc.boxNombreCategoria.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                categoria.setNombre(sfc.boxNombreCategoria.getText());

                if (categoriaD.Registrar(categoria)) {
                    clearCategoriaTable();
                    listarCategoria();

                    JOptionPane.showMessageDialog(null, "Categoria: " + sfc.boxNombreCategoria.getText() + " creado exitosamente!!");
                    clearBoxCategoria();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar la Categoria");

                }

            }

        } else if (e.getSource() == sfc.btnModificarCategoria) {
            
             if (sfc.boxNombreCategoria.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                categoria.setNombre(sfc.boxNombreCategoria.getText());

                if (categoriaD.Modificarr(categoria)) {
                    clearCategoriaTable();
                    listarCategoria();

                    JOptionPane.showMessageDialog(null, "Categoria: " + sfc.boxNombreCategoria.getText() + " creado exitosamente!!");
                    clearBoxCategoria();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar la Categoria");

                }

            }

        } else if (e.getSource() == sfc.popEliminarCategoria) {
            if (sfc.boxIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfc.boxIdCategoria.getText());
                if (categoriaD.Accion("inactive", id)) {
                    clearCategoriaTable();
                    listarCategoria();

                    JOptionPane.showMessageDialog(null, "Categoria:  " + sfc.boxNombreCategoria.getText() + " eliminado exitosamente!!");
                    clearBoxCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Categoria");
                }

            }
        } else if (e.getSource() == sfc.popReingresarcategoria) {
            if (sfc.boxIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfc.boxIdCategoria.getText());
                if (categoriaD.Accion("active", id)) {
                    clearCategoriaTable();
                    listarCategoria();
                    JOptionPane.showMessageDialog(null, "Categoria:  " + sfc.boxNombreCategoria.getText() + " reingresar exitosamente!!");
                    clearBoxCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la Categoria");
                }

            }
        }
        }

    

    public void listarCategoria() {
        Table inactive = new Table();
        sfc.tableCategoria.setDefaultRenderer(sfc.tableCategoria.getColumnClass(0), inactive);
        List<Categoria> lista = categoriaD.ListarCategorias(sfc.boxBuscarCategoria.getText());
        modelCategoria = (DefaultTableModel) sfc.tableCategoria.getModel();
        Object[] obj = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getStatus();
            modelCategoria.addRow(obj);

        }

        sfc.tableCategoria.setModel(modelCategoria);

    }

    public void clearCategoriaTable() {

        for (int i = 0; i < modelCategoria.getRowCount(); i++) {
            modelCategoria.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxCategoria() {
        sfc.boxIdCategoria.setText("");
        sfc.boxBuscarCategoria.setText("");
        sfc.boxNombreCategoria.setText("");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfc.tableCategoria) {
            int row = sfc.tableCategoria.rowAtPoint(e.getPoint());
            sfc.boxIdCategoria.setText(sfc.tableCategoria.getValueAt(row, 0).toString());
            sfc.boxNombreCategoria.setText(sfc.tableCategoria.getValueAt(row, 1).toString());

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
        if (e.getSource() == sfc.boxBuscarCategoria) {
            clearCategoriaTable();
            listarCategoria();

        }
    }

}
