package org.jgp.system.views.component;


import org.jgp.system.views.swing.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import org.jgp.system.views.event.EventMenu;

public class Menu extends javax.swing.JPanel {

    private EventMenu event;

    public Menu() {
        initComponents();
        setOpaque(false);
        setLayout(new MigLayout("wrap 5, inset 60", "[100, 100]40[100, 100]", "[]40[]"));
    }

    public void initMenu(EventMenu event) {
        this.event = event;
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/Nventa.png")), "Nueva Venta", 0);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/compras.png")), "Nueva Compra", 1);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/producto.png")), "Producto", 2);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/Clientes.png")), "Clientes", 3);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/adduser.png")), "Usuarios", 4);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/proveedor.png")), "Proveedor", 5);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/medida.png")), "Medida", 6);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/categoria.png")), "Categoria", 7);
        addMenu(new ImageIcon(getClass().getResource("/org/jgp/system/img/config.png")), "Configuracion", 8);
    }

    private void addMenu(Icon icon, String name, int index) {
        Button menu = new Button();
        menu.setHorizontalTextPosition(SwingConstants.CENTER);
        menu.setVerticalTextPosition(SwingConstants.BOTTOM);
        menu.setText(name);
        menu.setIcon(icon);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(index);
            }
        });
        add(menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
