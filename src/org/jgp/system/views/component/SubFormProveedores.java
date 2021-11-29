package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormProveedores extends javax.swing.JPanel {

    public SubFormProveedores(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelProveedor = new javax.swing.JPanel();
        Cuit = new javax.swing.JLabel();
        boxCuitProve = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        boxNombreProve = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        boxTelefonoProve = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        btnNuevoProve = new org.jgp.system.views.swing.Button();
        btnRegistrarProve = new org.jgp.system.views.swing.Button();
        btnModificarProve = new org.jgp.system.views.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxDireccionProve = new javax.swing.JTextPane();
        scrollPaneProveedor = new javax.swing.JScrollPane();
        tableProveedor = new rojerusan.RSTableMetro();

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

        panelProveedor.setBackground(new java.awt.Color(102, 115, 255));
        panelProveedor.setForeground(new java.awt.Color(212, 212, 212));

        Cuit.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cuit.setForeground(new java.awt.Color(212, 212, 212));
        Cuit.setText("Cuit");

        boxCuitProve.setBackground(new java.awt.Color(255, 255, 255));
        boxCuitProve.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCuitProve.setForeground(new java.awt.Color(0, 0, 0));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");

        boxNombreProve.setBackground(new java.awt.Color(255, 255, 255));
        boxNombreProve.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombreProve.setForeground(new java.awt.Color(0, 0, 0));

        Telefono.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Telefono.setForeground(new java.awt.Color(212, 212, 212));
        Telefono.setText("Telefono");

        boxTelefonoProve.setBackground(new java.awt.Color(255, 255, 255));
        boxTelefonoProve.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTelefonoProve.setForeground(new java.awt.Color(0, 0, 0));

        Direccion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Direccion.setForeground(new java.awt.Color(212, 212, 212));
        Direccion.setText("Direccion");

        btnNuevoProve.setText("Nuevo");

        btnRegistrarProve.setText("Registrar");

        btnModificarProve.setText("Modificar");

        boxDireccionProve.setBackground(new java.awt.Color(255, 255, 255));
        boxDireccionProve.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxDireccionProve.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(boxDireccionProve);

        tableProveedor.setBackground(new java.awt.Color(204, 204, 204));
        tableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad", "medida", "Estado"
            }
        ));
        tableProveedor.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableProveedor.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableProveedor.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableProveedor.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableProveedor.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableProveedor.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tableProveedor.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tableProveedor.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableProveedor.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableProveedor.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneProveedor.setViewportView(tableProveedor);

        javax.swing.GroupLayout panelProveedorLayout = new javax.swing.GroupLayout(panelProveedor);
        panelProveedor.setLayout(panelProveedorLayout);
        panelProveedorLayout.setHorizontalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProveedorLayout.createSequentialGroup()
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoProve, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cuit))
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProveedorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrarProve, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarProve, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProveedorLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(boxCuitProve, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelProveedorLayout.createSequentialGroup()
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(Telefono)
                            .addComponent(Direccion))
                        .addGap(59, 59, 59)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boxTelefonoProve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNombreProve))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPaneProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelProveedorLayout.setVerticalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProveedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProveedorLayout.createSequentialGroup()
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cuit)
                            .addComponent(boxCuitProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(boxNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefono)
                            .addComponent(boxTelefonoProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProveedorLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Direccion))
                            .addGroup(panelProveedorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPaneProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProve, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProve, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProve, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cuit;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField boxCuitProve;
    private javax.swing.JTextPane boxDireccionProve;
    private javax.swing.JTextField boxNombreProve;
    private javax.swing.JTextField boxTelefonoProve;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnModificarProve;
    private org.jgp.system.views.swing.Button btnNuevoProve;
    private org.jgp.system.views.swing.Button btnRegistrarProve;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelForm;
    private javax.swing.JPanel panelProveedor;
    private javax.swing.JScrollPane scrollPaneProveedor;
    public rojerusan.RSTableMetro tableProveedor;
    // End of variables declaration//GEN-END:variables
}
