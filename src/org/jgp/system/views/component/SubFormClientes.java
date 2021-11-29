package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormClientes extends javax.swing.JPanel {

    public SubFormClientes(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelClientes = new javax.swing.JPanel();
        NombreCli = new javax.swing.JLabel();
        boxNombreCli = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        boxTelefonoCli = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        btnNuevoCli = new org.jgp.system.views.swing.Button();
        btnRegistrarCli = new org.jgp.system.views.swing.Button();
        btnModificarCli = new org.jgp.system.views.swing.Button();
        scrollPaneDireccionCli = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        scrollPaneCliente = new javax.swing.JScrollPane();
        tableCliente = new rojerusan.RSTableMetro();

        setMaximumSize(new java.awt.Dimension(1180, 750));
        setMinimumSize(new java.awt.Dimension(1180, 750));

        labelForm.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        labelForm.setForeground(new java.awt.Color(212, 212, 212));
        labelForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelClientes.setBackground(new java.awt.Color(102, 115, 255));

        NombreCli.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        NombreCli.setForeground(new java.awt.Color(212, 212, 212));
        NombreCli.setText("Nombre");

        boxNombreCli.setBackground(new java.awt.Color(255, 255, 255));
        boxNombreCli.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombreCli.setForeground(new java.awt.Color(0, 0, 0));

        telefono.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        telefono.setForeground(new java.awt.Color(212, 212, 212));
        telefono.setText("Telefono");

        boxTelefonoCli.setBackground(new java.awt.Color(255, 255, 255));
        boxTelefonoCli.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTelefonoCli.setForeground(new java.awt.Color(0, 0, 0));

        Direccion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Direccion.setForeground(new java.awt.Color(212, 212, 212));
        Direccion.setText("Direccion");

        btnNuevoCli.setText("Nuevo");

        btnRegistrarCli.setText("Registrar");

        btnModificarCli.setText("Modificar");

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneDireccionCli.setViewportView(jTextPane1);

        tableCliente.setBackground(new java.awt.Color(204, 204, 204));
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Telefono", "Direccion"
            }
        ));
        tableCliente.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableCliente.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableCliente.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableCliente.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableCliente.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableCliente.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tableCliente.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tableCliente.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableCliente.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableCliente.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneCliente.setViewportView(tableCliente);

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreCli)
                            .addComponent(telefono)
                            .addComponent(Direccion))
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClientesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boxTelefonoCli)
                                    .addGroup(panelClientesLayout.createSequentialGroup()
                                        .addGap(0, 33, Short.MAX_VALUE)
                                        .addComponent(boxNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelClientesLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(scrollPaneDireccionCli)))
                        .addGap(40, 40, 40))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addComponent(btnNuevoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scrollPaneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelClientesLayout.createSequentialGroup()
                            .addGap(490, 490, 490)
                            .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRegistrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelClientesLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NombreCli)
                                .addComponent(boxNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefono)
                                .addComponent(boxTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scrollPaneDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Direccion)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel NombreCli;
    private javax.swing.JTextField boxNombreCli;
    private javax.swing.JTextField boxTelefonoCli;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnModificarCli;
    private org.jgp.system.views.swing.Button btnNuevoCli;
    private org.jgp.system.views.swing.Button btnRegistrarCli;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelForm;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JScrollPane scrollPaneCliente;
    private javax.swing.JScrollPane scrollPaneDireccionCli;
    public rojerusan.RSTableMetro tableCliente;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
