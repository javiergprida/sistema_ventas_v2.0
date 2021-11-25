package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormVenta extends javax.swing.JPanel {

    public SubFormVenta(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelVenta = new javax.swing.JPanel();
        Codigo = new javax.swing.JLabel();
        boxCodigoVenta = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        boxProductoVenta = new javax.swing.JTextField();
        Stock = new javax.swing.JLabel();
        boxStockPro = new javax.swing.JTextField();
        Cantidad = new javax.swing.JLabel();
        boxCantidadVenta = new javax.swing.JTextField();
        Total = new javax.swing.JLabel();
        boxTotalVenta = new javax.swing.JTextField();
        Cliente = new javax.swing.JLabel();
        comboClienteVenta = new javax.swing.JComboBox<>();
        btnNuevaVenta = new org.jgp.system.views.swing.Button();
        scrollPaneVenta = new javax.swing.JScrollPane();
        tableVenta = new javax.swing.JTable();
        pagarcon = new javax.swing.JLabel();
        boxPago = new javax.swing.JTextField();
        Cambio = new javax.swing.JLabel();
        boxCambio = new javax.swing.JTextField();
        pagar = new javax.swing.JLabel();
        TotalPagar = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1180, 750));
        setMinimumSize(new java.awt.Dimension(1180, 750));
        setPreferredSize(new java.awt.Dimension(1180, 750));

        labelForm.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        labelForm.setForeground(new java.awt.Color(212, 212, 212));
        labelForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelVenta.setBackground(new java.awt.Color(102, 115, 255));
        panelVenta.setForeground(new java.awt.Color(212, 212, 212));

        Codigo.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Codigo.setForeground(new java.awt.Color(212, 212, 212));
        Codigo.setText("Codigo");

        boxCodigoVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxCodigoVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCodigoVenta.setForeground(new java.awt.Color(0, 0, 0));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Producto");

        boxProductoVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxProductoVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxProductoVenta.setForeground(new java.awt.Color(0, 0, 0));

        Stock.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Stock.setForeground(new java.awt.Color(212, 212, 212));
        Stock.setText("Stock");

        boxStockPro.setBackground(new java.awt.Color(255, 255, 255));
        boxStockPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxStockPro.setForeground(new java.awt.Color(0, 0, 0));

        Cantidad.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(212, 212, 212));
        Cantidad.setText("Cantidad");

        boxCantidadVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxCantidadVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCantidadVenta.setForeground(new java.awt.Color(0, 0, 0));

        Total.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Total.setForeground(new java.awt.Color(212, 212, 212));
        Total.setText("Total");

        boxTotalVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxTotalVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTotalVenta.setForeground(new java.awt.Color(0, 0, 0));

        Cliente.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cliente.setForeground(new java.awt.Color(212, 212, 212));
        Cliente.setText("Cliente");

        comboClienteVenta.setBackground(new java.awt.Color(255, 255, 255));
        comboClienteVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboClienteVenta.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevaVenta.setText("Generar");

        tableVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        tableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        scrollPaneVenta.setViewportView(tableVenta);

        pagarcon.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagarcon.setText("Pagar Con");

        boxPago.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N

        Cambio.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        Cambio.setText("Cambio");

        boxCambio.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N

        pagar.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagar.setText("Total a Pagar");

        TotalPagar.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        TotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalPagar.setText("-----");

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(pagarcon)
                        .addGap(18, 18, 18)
                        .addComponent(boxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(Cambio)
                        .addGap(18, 18, 18)
                        .addComponent(boxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(pagar)
                        .addGap(18, 18, 18)
                        .addComponent(TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelVentaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(Cliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(Codigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Stock)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxStockPro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Cantidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Total)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(boxCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre)
                    .addComponent(boxProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxStockPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stock)
                    .addComponent(Cantidad)
                    .addComponent(boxCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total)
                    .addComponent(boxTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cliente)
                        .addComponent(comboClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagar)
                    .addComponent(TotalPagar)
                    .addComponent(pagarcon)
                    .addComponent(Cambio))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cambio;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Cliente;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalPagar;
    private javax.swing.JTextField boxCambio;
    private javax.swing.JTextField boxCantidadVenta;
    private javax.swing.JTextField boxCodigoVenta;
    private javax.swing.JTextField boxPago;
    private javax.swing.JTextField boxProductoVenta;
    private javax.swing.JTextField boxStockPro;
    private javax.swing.JTextField boxTotalVenta;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnNuevaVenta;
    private javax.swing.JComboBox<String> comboClienteVenta;
    private javax.swing.JLabel labelForm;
    private javax.swing.JLabel pagar;
    private javax.swing.JLabel pagarcon;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JScrollPane scrollPaneVenta;
    private javax.swing.JTable tableVenta;
    // End of variables declaration//GEN-END:variables
}
