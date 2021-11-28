package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormConfig extends javax.swing.JPanel {

    public SubFormConfig(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        jPanel1 = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        boxCuitConfig = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        boxNombreConfig = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        boxTelefonoConfig = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        ScrollPaneDireccion = new javax.swing.JScrollPane();
        boxDireccionConfig = new javax.swing.JTextPane();
        Mensaje = new javax.swing.JLabel();
        ScrollPaneMensaje = new javax.swing.JScrollPane();
        boxMensajeConfig = new javax.swing.JTextPane();
        btnModificarConfig = new org.jgp.system.views.swing.Button();

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

        jPanel1.setBackground(new java.awt.Color(102, 115, 255));

        code.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        code.setForeground(new java.awt.Color(212, 212, 212));
        code.setText("Cuit");

        boxCuitConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxCuitConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCuitConfig.setForeground(new java.awt.Color(0, 0, 0));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");

        boxNombreConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxNombreConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombreConfig.setForeground(new java.awt.Color(0, 0, 0));

        telefono.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        telefono.setForeground(new java.awt.Color(212, 212, 212));
        telefono.setText("Telefono");

        boxTelefonoConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxTelefonoConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTelefonoConfig.setForeground(new java.awt.Color(0, 0, 0));

        Direccion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Direccion.setForeground(new java.awt.Color(212, 212, 212));
        Direccion.setText("Direccion");

        boxDireccionConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxDireccionConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxDireccionConfig.setForeground(new java.awt.Color(0, 0, 0));
        ScrollPaneDireccion.setViewportView(boxDireccionConfig);

        Mensaje.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(212, 212, 212));
        Mensaje.setText("Mensaje");

        boxMensajeConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxMensajeConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxMensajeConfig.setForeground(new java.awt.Color(0, 0, 0));
        ScrollPaneMensaje.setViewportView(boxMensajeConfig);

        btnModificarConfig.setText("Modificar");
        btnModificarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre)
                                    .addComponent(telefono)
                                    .addComponent(Direccion)
                                    .addComponent(code)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Mensaje)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrollPaneMensaje)
                            .addComponent(boxTelefonoConfig)
                            .addComponent(boxNombreConfig)
                            .addComponent(boxCuitConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(ScrollPaneDireccion, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnModificarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(842, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code)
                    .addComponent(boxCuitConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(boxNombreConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono)
                    .addComponent(boxTelefonoConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Direccion)
                    .addComponent(ScrollPaneDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPaneMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mensaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnModificarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModificarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarConfigActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Nombre;
    private javax.swing.JScrollPane ScrollPaneDireccion;
    private javax.swing.JScrollPane ScrollPaneMensaje;
    private javax.swing.JTextField boxCuitConfig;
    private javax.swing.JTextPane boxDireccionConfig;
    private javax.swing.JTextPane boxMensajeConfig;
    private javax.swing.JTextField boxNombreConfig;
    private javax.swing.JTextField boxTelefonoConfig;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnModificarConfig;
    private javax.swing.JLabel code;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelForm;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
