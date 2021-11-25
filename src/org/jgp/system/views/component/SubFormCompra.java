package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormCompra extends javax.swing.JPanel {

    public SubFormCompra(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelCompra = new javax.swing.JPanel();
        Codigo2 = new javax.swing.JLabel();
        boxCodigoCompra = new javax.swing.JTextField();
        Nombre2 = new javax.swing.JLabel();
        boxProductoCompra = new javax.swing.JTextField();
        Cantidad2 = new javax.swing.JLabel();
        boxCantidadCompra = new javax.swing.JTextField();
        Total2 = new javax.swing.JLabel();
        boxTotalcompra = new javax.swing.JTextField();
        Proveedor = new javax.swing.JLabel();
        comboProveedorCompra = new javax.swing.JComboBox<>();
        btnNuevaCompra = new org.jgp.system.views.swing.Button();
        scrollPanecompra = new javax.swing.JScrollPane();
        tableCompra = new javax.swing.JTable();
        pagarcon2 = new javax.swing.JLabel();
        boxPago2 = new javax.swing.JTextField();
        Cambio2 = new javax.swing.JLabel();
        boxCambio2 = new javax.swing.JTextField();
        pagar2 = new javax.swing.JLabel();
        TotalPagar2 = new javax.swing.JLabel();

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

        panelCompra.setBackground(new java.awt.Color(102, 115, 255));
        panelCompra.setForeground(new java.awt.Color(212, 212, 212));

        Codigo2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Codigo2.setForeground(new java.awt.Color(212, 212, 212));
        Codigo2.setText("Codigo");

        boxCodigoCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxCodigoCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCodigoCompra.setForeground(new java.awt.Color(0, 0, 0));

        Nombre2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(212, 212, 212));
        Nombre2.setText("Producto");

        boxProductoCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxProductoCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxProductoCompra.setForeground(new java.awt.Color(0, 0, 0));

        Cantidad2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cantidad2.setForeground(new java.awt.Color(212, 212, 212));
        Cantidad2.setText("Cantidad");

        boxCantidadCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxCantidadCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCantidadCompra.setForeground(new java.awt.Color(0, 0, 0));

        Total2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Total2.setForeground(new java.awt.Color(212, 212, 212));
        Total2.setText("Total");

        boxTotalcompra.setBackground(new java.awt.Color(255, 255, 255));
        boxTotalcompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTotalcompra.setForeground(new java.awt.Color(0, 0, 0));

        Proveedor.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Proveedor.setForeground(new java.awt.Color(212, 212, 212));
        Proveedor.setText("Proveedor");

        comboProveedorCompra.setBackground(new java.awt.Color(255, 255, 255));
        comboProveedorCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboProveedorCompra.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevaCompra.setText("Generar");

        tableCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        tableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        scrollPanecompra.setViewportView(tableCompra);

        pagarcon2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagarcon2.setText("Pagar Con");

        boxPago2.setBackground(new java.awt.Color(255, 255, 255));
        boxPago2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPago2.setForeground(new java.awt.Color(0, 0, 0));

        Cambio2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        Cambio2.setText("Cambio");

        boxCambio2.setBackground(new java.awt.Color(255, 255, 255));
        boxCambio2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCambio2.setForeground(new java.awt.Color(0, 0, 0));

        pagar2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagar2.setText("Total a Pagar");

        TotalPagar2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        TotalPagar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalPagar2.setText("-----");

        javax.swing.GroupLayout panelCompraLayout = new javax.swing.GroupLayout(panelCompra);
        panelCompra.setLayout(panelCompraLayout);
        panelCompraLayout.setHorizontalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanecompra, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(Codigo2)
                        .addGap(18, 18, 18)
                        .addComponent(boxCodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nombre2)
                        .addGap(18, 18, 18)
                        .addComponent(boxProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Cantidad2)
                        .addGap(18, 18, 18)
                        .addComponent(boxCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Total2)
                        .addGap(18, 18, 18)
                        .addComponent(boxTotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(Proveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagarcon2)
                .addGap(18, 18, 18)
                .addComponent(boxPago2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Cambio2)
                .addGap(18, 18, 18)
                .addComponent(boxCambio2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(pagar2)
                .addGap(18, 18, 18)
                .addComponent(TotalPagar2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        panelCompraLayout.setVerticalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo2)
                    .addComponent(boxCodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre2)
                    .addComponent(boxProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad2)
                    .addComponent(boxCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total2)
                    .addComponent(boxTotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proveedor)
                    .addComponent(comboProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPanecompra, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCambio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagar2)
                    .addComponent(TotalPagar2)
                    .addComponent(pagarcon2)
                    .addComponent(Cambio2))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cambio2;
    private javax.swing.JLabel Cantidad2;
    private javax.swing.JLabel Codigo2;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Total2;
    private javax.swing.JLabel TotalPagar2;
    private javax.swing.JTextField boxCambio2;
    private javax.swing.JTextField boxCantidadCompra;
    private javax.swing.JTextField boxCodigoCompra;
    private javax.swing.JTextField boxPago2;
    private javax.swing.JTextField boxProductoCompra;
    private javax.swing.JTextField boxTotalcompra;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnNuevaCompra;
    private javax.swing.JComboBox<String> comboProveedorCompra;
    private javax.swing.JLabel labelForm;
    private javax.swing.JLabel pagar2;
    private javax.swing.JLabel pagarcon2;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JScrollPane scrollPanecompra;
    private javax.swing.JTable tableCompra;
    // End of variables declaration//GEN-END:variables
}
