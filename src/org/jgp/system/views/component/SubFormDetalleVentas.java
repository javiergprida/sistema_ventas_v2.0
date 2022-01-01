package org.jgp.system.views.component;

import org.jgp.system.controller.DetalleVentaController;
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.views.IndexProgram;

public class SubFormDetalleVentas extends javax.swing.JPanel {
Productos producto = new Productos();
    ProductosDao productosD = new ProductosDao();
    Clientes cliente = new Clientes();
    ClientesDao clienteD = new ClientesDao();

    public SubFormDetalleVentas(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
        DetalleVentaController productV = new DetalleVentaController(producto, productosD, cliente, clienteD, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelDetalleVenta = new javax.swing.JPanel();
        scrollPaneDetalleVenta = new javax.swing.JScrollPane();
        tableDetalleVenta = new rojerusan.RSTableMetro();

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

        panelDetalleVenta.setBackground(new java.awt.Color(102, 115, 255));
        panelDetalleVenta.setForeground(new java.awt.Color(212, 212, 212));

        tableDetalleVenta.setBackground(new java.awt.Color(204, 204, 204));
        tableDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Proveedor", "Total", "Fecha"
            }
        ));
        tableDetalleVenta.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableDetalleVenta.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableDetalleVenta.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableDetalleVenta.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableDetalleVenta.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableDetalleVenta.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tableDetalleVenta.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tableDetalleVenta.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableDetalleVenta.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableDetalleVenta.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneDetalleVenta.setViewportView(tableDetalleVenta);

        javax.swing.GroupLayout panelDetalleVentaLayout = new javax.swing.GroupLayout(panelDetalleVenta);
        panelDetalleVenta.setLayout(panelDetalleVentaLayout);
        panelDetalleVentaLayout.setHorizontalGroup(
            panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleVentaLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(scrollPaneDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panelDetalleVentaLayout.setVerticalGroup(
            panelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleVentaLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(scrollPaneDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelDetalleVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDetalleVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jgp.system.views.swing.Button btnBack;
    private javax.swing.JLabel labelForm;
    private javax.swing.JPanel panelDetalleVenta;
    private javax.swing.JScrollPane scrollPaneDetalleVenta;
    public rojerusan.RSTableMetro tableDetalleVenta;
    // End of variables declaration//GEN-END:variables
}
