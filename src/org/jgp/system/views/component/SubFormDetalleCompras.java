package org.jgp.system.views.component;

import org.jgp.system.controller.detalleCompraController;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.views.IndexProgram;

public class SubFormDetalleCompras extends javax.swing.JPanel {

    Productos producto = new Productos();
    ProductosDao productosD = new ProductosDao();
    Proveedores proveedores = new Proveedores();
    ProveedoresDao proveedorD = new ProveedoresDao();

    public SubFormDetalleCompras(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
        boxIdDetalleCompra.setVisible(false);
        detalleCompraController product = new detalleCompraController(producto, productosD, proveedores, proveedorD, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        scrollPaneDetalleCompra = new javax.swing.JScrollPane();
        tabledetalleCompra = new rojerusan.RSTableMetro();
        panelBuscarDetalleCompra = new javax.swing.JPanel();
        btnBuscarDetallecompra = new javax.swing.JLabel();
        boxBuscarDetalleCompra = new javax.swing.JTextField();
        boxIdDetalleCompra = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 115, 255));
        setMaximumSize(new java.awt.Dimension(1180, 750));
        setMinimumSize(new java.awt.Dimension(1180, 750));
        setPreferredSize(new java.awt.Dimension(1180, 750));

        labelForm.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        labelForm.setForeground(new java.awt.Color(212, 212, 212));
        labelForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tabledetalleCompra.setBackground(new java.awt.Color(204, 204, 204));
        tabledetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Proveedor", "Total", "Fecha"
            }
        ));
        tabledetalleCompra.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tabledetalleCompra.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tabledetalleCompra.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tabledetalleCompra.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tabledetalleCompra.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tabledetalleCompra.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tabledetalleCompra.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tabledetalleCompra.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tabledetalleCompra.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tabledetalleCompra.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneDetalleCompra.setViewportView(tabledetalleCompra);

        panelBuscarDetalleCompra.setBackground(new java.awt.Color(102, 115, 255));
        panelBuscarDetalleCompra.setBorder(new javax.swing.border.SoftBevelBorder(0));
        panelBuscarDetalleCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscarDetallecompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarDetallecompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/lupa.png"))); // NOI18N
        btnBuscarDetallecompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarDetallecompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarDetallecompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarDetallecompraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarDetalleCompraLayout = new javax.swing.GroupLayout(panelBuscarDetalleCompra);
        panelBuscarDetalleCompra.setLayout(panelBuscarDetalleCompraLayout);
        panelBuscarDetalleCompraLayout.setHorizontalGroup(
            panelBuscarDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarDetallecompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelBuscarDetalleCompraLayout.setVerticalGroup(
            panelBuscarDetalleCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarDetallecompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        boxBuscarDetalleCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxBuscarDetalleCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxBuscarDetalleCompra.setForeground(new java.awt.Color(0, 0, 0));

        boxIdDetalleCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxIdDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIdDetalleCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(scrollPaneDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(boxBuscarDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panelBuscarDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(boxIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(boxBuscarDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscarDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBuscarDetallecompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDetallecompraMouseEntered

    }//GEN-LAST:event_btnBuscarDetallecompraMouseEntered

    private void btnBuscarDetallecompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDetallecompraMouseExited

    }//GEN-LAST:event_btnBuscarDetallecompraMouseExited

    private void boxIdDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIdDetalleCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIdDetalleCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField boxBuscarDetalleCompra;
    public javax.swing.JTextField boxIdDetalleCompra;
    private org.jgp.system.views.swing.Button btnBack;
    public javax.swing.JLabel btnBuscarDetallecompra;
    private javax.swing.JLabel labelForm;
    public javax.swing.JPanel panelBuscarDetalleCompra;
    private javax.swing.JScrollPane scrollPaneDetalleCompra;
    public rojerusan.RSTableMetro tabledetalleCompra;
    // End of variables declaration//GEN-END:variables
}
