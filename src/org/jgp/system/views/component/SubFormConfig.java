package org.jgp.system.views.component;

import org.jgp.system.controller.ConfiguracionController;
import org.jgp.system.models.Configuracion;
import org.jgp.system.models.UsersDao;
import org.jgp.system.views.IndexProgram;

public class SubFormConfig extends javax.swing.JPanel {
    Configuracion cf = new Configuracion();
    UsersDao usDao = new UsersDao();

    public SubFormConfig(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
        boxIdConfig.setVisible(false);
        ConfiguracionController config = new ConfiguracionController(usDao,cf ,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        boxIdConfig = new javax.swing.JTextField();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/229-2294828_back-team-support-png-clipart.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 790, 620));

        code.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        code.setForeground(new java.awt.Color(212, 212, 212));
        code.setText("Cuit");
        jPanel1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 96, -1, -1));

        boxCuitConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxCuitConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCuitConfig.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(boxCuitConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 93, 313, -1));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 147, -1, -1));

        boxNombreConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxNombreConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombreConfig.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(boxNombreConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 144, 313, -1));

        telefono.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        telefono.setForeground(new java.awt.Color(212, 212, 212));
        telefono.setText("Telefono");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 189, -1, -1));

        boxTelefonoConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxTelefonoConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTelefonoConfig.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(boxTelefonoConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 189, 313, -1));

        Direccion.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Direccion.setForeground(new java.awt.Color(212, 212, 212));
        Direccion.setText("Direccion");
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 240, -1, -1));

        boxDireccionConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxDireccionConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxDireccionConfig.setForeground(new java.awt.Color(0, 0, 0));
        ScrollPaneDireccion.setViewportView(boxDireccionConfig);

        jPanel1.add(ScrollPaneDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 240, 313, 96));

        Mensaje.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(212, 212, 212));
        Mensaje.setText("Mensaje");
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 354, -1, -1));

        boxMensajeConfig.setBackground(new java.awt.Color(255, 255, 255));
        boxMensajeConfig.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxMensajeConfig.setForeground(new java.awt.Color(0, 0, 0));
        ScrollPaneMensaje.setViewportView(boxMensajeConfig);

        jPanel1.add(ScrollPaneMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 354, 313, 157));

        btnModificarConfig.setText("Modificar");
        btnModificarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarConfigActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 541, 120, 54));
        jPanel1.add(boxIdConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 57, -1, -1));

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
    public javax.swing.JTextField boxCuitConfig;
    public javax.swing.JTextPane boxDireccionConfig;
    public javax.swing.JTextField boxIdConfig;
    public javax.swing.JTextPane boxMensajeConfig;
    public javax.swing.JTextField boxNombreConfig;
    public javax.swing.JTextField boxTelefonoConfig;
    private org.jgp.system.views.swing.Button btnBack;
    public org.jgp.system.views.swing.Button btnModificarConfig;
    private javax.swing.JLabel code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelForm;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
