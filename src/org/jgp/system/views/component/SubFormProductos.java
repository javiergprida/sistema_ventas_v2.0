package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormProductos extends javax.swing.JPanel {

    public SubFormProductos(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelProductos = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        boxCodePro = new javax.swing.JTextField();
        Description = new javax.swing.JLabel();
        boxDescriptionPro = new javax.swing.JTextField();
        pCompra = new javax.swing.JLabel();
        boxPCompraPro = new javax.swing.JTextField();
        pVenta = new javax.swing.JLabel();
        boxPVentaPro = new javax.swing.JTextField();
        proveedor = new javax.swing.JLabel();
        comboProveedorPro = new javax.swing.JComboBox<>();
        medida = new javax.swing.JLabel();
        comboMedidaPro = new javax.swing.JComboBox<>();
        Categoria = new javax.swing.JLabel();
        comboCategoriaPro = new javax.swing.JComboBox<>();
        btnNuevoPro = new org.jgp.system.views.swing.Button();
        btnRegistrarPro = new org.jgp.system.views.swing.Button();
        btnModificarPro = new org.jgp.system.views.swing.Button();
        scrollPanePro = new javax.swing.JScrollPane();
        tablePro = new javax.swing.JTable();

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

        panelProductos.setBackground(new java.awt.Color(102, 115, 255));
        panelProductos.setForeground(new java.awt.Color(212, 212, 212));

        code.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        code.setForeground(new java.awt.Color(212, 212, 212));
        code.setText("Codigo");

        boxCodePro.setBackground(new java.awt.Color(255, 255, 255));
        boxCodePro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCodePro.setForeground(new java.awt.Color(0, 0, 0));

        Description.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Description.setForeground(new java.awt.Color(212, 212, 212));
        Description.setText("Descripcion");

        boxDescriptionPro.setBackground(new java.awt.Color(255, 255, 255));
        boxDescriptionPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxDescriptionPro.setForeground(new java.awt.Color(0, 0, 0));

        pCompra.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        pCompra.setForeground(new java.awt.Color(212, 212, 212));
        pCompra.setText("Compra");

        boxPCompraPro.setBackground(new java.awt.Color(255, 255, 255));
        boxPCompraPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPCompraPro.setForeground(new java.awt.Color(0, 0, 0));

        pVenta.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        pVenta.setForeground(new java.awt.Color(212, 212, 212));
        pVenta.setText("Venta");

        boxPVentaPro.setBackground(new java.awt.Color(255, 255, 255));
        boxPVentaPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPVentaPro.setForeground(new java.awt.Color(0, 0, 0));

        proveedor.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        proveedor.setForeground(new java.awt.Color(212, 212, 212));
        proveedor.setText("Proveedor");

        comboProveedorPro.setBackground(new java.awt.Color(255, 255, 255));
        comboProveedorPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboProveedorPro.setForeground(new java.awt.Color(0, 0, 0));

        medida.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        medida.setForeground(new java.awt.Color(212, 212, 212));
        medida.setText("Medida");

        comboMedidaPro.setBackground(new java.awt.Color(255, 255, 255));
        comboMedidaPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboMedidaPro.setForeground(new java.awt.Color(0, 0, 0));

        Categoria.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Categoria.setForeground(new java.awt.Color(212, 212, 212));
        Categoria.setText("Categoria");

        comboCategoriaPro.setBackground(new java.awt.Color(255, 255, 255));
        comboCategoriaPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboCategoriaPro.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevoPro.setText("Nuevo");

        btnRegistrarPro.setText("Registrar");

        btnModificarPro.setText("Modificar");

        tablePro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        tablePro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad", "Medida", "Estado"
            }
        ));
        scrollPanePro.setViewportView(tablePro);

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medida)
                            .addComponent(Description)
                            .addComponent(pCompra)
                            .addComponent(pVenta)
                            .addComponent(Categoria)
                            .addComponent(proveedor)
                            .addComponent(code))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboMedidaPro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboProveedorPro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxPVentaPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(boxPCompraPro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxDescriptionPro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxCodePro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategoriaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scrollPanePro, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code)
                            .addComponent(boxCodePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Description)
                            .addComponent(boxDescriptionPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pCompra)
                            .addComponent(boxPCompraPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pVenta)
                            .addComponent(boxPVentaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboProveedorPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proveedor))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medida)
                            .addComponent(comboMedidaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategoriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(scrollPanePro, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Description;
    private javax.swing.JTextField boxCodePro;
    private javax.swing.JTextField boxDescriptionPro;
    private javax.swing.JTextField boxPCompraPro;
    private javax.swing.JTextField boxPVentaPro;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnModificarPro;
    private org.jgp.system.views.swing.Button btnNuevoPro;
    private org.jgp.system.views.swing.Button btnRegistrarPro;
    private javax.swing.JLabel code;
    private javax.swing.JComboBox<String> comboCategoriaPro;
    private javax.swing.JComboBox<String> comboMedidaPro;
    private javax.swing.JComboBox<String> comboProveedorPro;
    private javax.swing.JLabel labelForm;
    private javax.swing.JLabel medida;
    private javax.swing.JLabel pCompra;
    private javax.swing.JLabel pVenta;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JLabel proveedor;
    private javax.swing.JScrollPane scrollPanePro;
    private javax.swing.JTable tablePro;
    // End of variables declaration//GEN-END:variables
}
