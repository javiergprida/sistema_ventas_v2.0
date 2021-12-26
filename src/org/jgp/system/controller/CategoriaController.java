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
import org.jgp.system.models.ComboProducto;
import org.jgp.system.models.Table;
import org.jgp.system.views.component.SubFormCategoria;
import org.jgp.system.views.component.SubFormProductos;

public class CategoriaController implements ActionListener, MouseListener, KeyListener {

    private Categoria categoria;
    private CategoriaDao categoriaD;
    private SubFormCategoria sfca;
    private SubFormProductos sfpro;
    DefaultTableModel modelCategoria = new DefaultTableModel();

    public CategoriaController(Categoria categoria, CategoriaDao categoriaD, SubFormCategoria sfca) {
        this.categoria = categoria;
        this.categoriaD = categoriaD;
        this.sfca = sfca;    
        this.sfca.tableCategoria.addMouseListener(this);
        this.sfca.popEliminarCategoria.addActionListener(this);
        this.sfca.popReingresarcategoria.addActionListener(this);
        this.sfca.boxBuscarCategoria.addKeyListener(this);
        this.sfca.btnRegistrarCategoria.addActionListener(this);
        this.sfca.btnModificarCategoria.addActionListener(this);
        //llenarCategoria();
        clearBoxCategoria();
        listarCategoria();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sfca.btnRegistrarCategoria) {
            if (sfca.boxNombreCategoria.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                categoria.setNombre(sfca.boxNombreCategoria.getText());

                if (categoriaD.Registrar(categoria)) {
                    clearCategoriaTable();
                    listarCategoria();

                    JOptionPane.showMessageDialog(null, "Categoria: " + sfca.boxNombreCategoria.getText() + " creado exitosamente!!");
                    clearBoxCategoria();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar la Categoria");

                }

            }

        } else if (e.getSource() == sfca.btnModificarCategoria) {
            
             if (sfca.boxNombreCategoria.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                categoria.setNombre(sfca.boxNombreCategoria.getText());
                categoria.setId(Integer.parseInt(sfca.boxIdCategoria.getText()));

                if (categoriaD.Modificar(categoria)) {
                    clearCategoriaTable();
                    listarCategoria();

                    JOptionPane.showMessageDialog(null, "Categoria: " + sfca.boxNombreCategoria.getText() + " modificado exitosamente!!");
                    clearBoxCategoria();
                } else {

                    JOptionPane.showMessageDialog(null, "Error al registrar la Categoria");

                }

            }

        } else if (e.getSource() == sfca.popEliminarCategoria) {
            if (sfca.boxIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");

            } else {
                int id = Integer.parseInt(sfca.boxIdCategoria.getText());
                if (categoriaD.Accion("inactive", id)) {
                    clearCategoriaTable();
                    listarCategoria();

                    JOptionPane.showMessageDialog(null, "Categoria:  " + sfca.boxNombreCategoria.getText() + " eliminado exitosamente!!");
                    clearBoxCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Categoria");
                }

            }
        } else if (e.getSource() == sfca.popReingresarcategoria) {
            if (sfca.boxIdCategoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");

            } else {
                int id = Integer.parseInt(sfca.boxIdCategoria.getText());
                if (categoriaD.Accion("active", id)) {
                    clearCategoriaTable();
                    listarCategoria();
                    JOptionPane.showMessageDialog(null, "Categoria:  " + sfca.boxNombreCategoria.getText() + " reingresar exitosamente!!");
                    clearBoxCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar la Categoria");
                }

            }
        }
        }

    

    public void listarCategoria() {
        Table color = new Table();
        sfca.tableCategoria.setDefaultRenderer(sfca.tableCategoria.getColumnClass(0), color);
        List<Categoria> lista = categoriaD.ListarCategorias(sfca.boxBuscarCategoria.getText());
        modelCategoria = (DefaultTableModel) sfca.tableCategoria.getModel();
        Object[] obj = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getStatus();
            modelCategoria.addRow(obj);

        }

        sfca.tableCategoria.setModel(modelCategoria);

    }

    public void clearCategoriaTable() {

        for (int i = 0; i < modelCategoria.getRowCount(); i++) {
            modelCategoria.removeRow(i);
            i = i - 1;
        }

    }

    public void clearBoxCategoria() {
        sfca.boxIdCategoria.setText("");
        sfca.boxBuscarCategoria.setText("");
        sfca.boxNombreCategoria.setText("");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == sfca.tableCategoria) {
            int row = sfca.tableCategoria.rowAtPoint(e.getPoint());
            sfca.boxIdCategoria.setText(sfca.tableCategoria.getValueAt(row, 0).toString());
            sfca.boxNombreCategoria.setText(sfca.tableCategoria.getValueAt(row, 1).toString());
            sfca.btnRegistrarCategoria.setEnabled(false);

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
        if (e.getSource() == sfca.boxBuscarCategoria) {
            clearCategoriaTable();
            listarCategoria();

        }
    }
    
    
}
