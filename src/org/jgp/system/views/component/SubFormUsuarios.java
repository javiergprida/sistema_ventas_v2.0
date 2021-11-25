package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormUsuarios extends javax.swing.JPanel {

    public SubFormUsuarios(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelUsers = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        boxUsernameUsers = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        boxFullnameUsers = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        boxPasswordUsers = new javax.swing.JPasswordField();
        rePassword = new javax.swing.JLabel();
        boxRePasswordUsers = new javax.swing.JPasswordField();
        Email = new javax.swing.JLabel();
        boxEmailUsers = new javax.swing.JTextField();
        Caja = new javax.swing.JLabel();
        comboCashUsers = new javax.swing.JComboBox<>();
        Rol = new javax.swing.JLabel();
        comboRolUsers = new javax.swing.JComboBox<>();
        btnNuevoUsers = new org.jgp.system.views.swing.Button();
        btnRegistrarUsers = new org.jgp.system.views.swing.Button();
        btnModificarUsers = new org.jgp.system.views.swing.Button();
        scrollPaneUsers = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1180, 750));
        setMinimumSize(new java.awt.Dimension(1180, 750));

        labelForm.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        labelForm.setForeground(new java.awt.Color(212, 212, 212));
        labelForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelUsers.setBackground(new java.awt.Color(102, 115, 255));
        panelUsers.setForeground(new java.awt.Color(212, 212, 212));

        usuario.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        usuario.setForeground(new java.awt.Color(212, 212, 212));
        usuario.setText("Usuario");

        boxUsernameUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxUsernameUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxUsernameUsers.setForeground(new java.awt.Color(0, 0, 0));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");

        boxFullnameUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxFullnameUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxFullnameUsers.setForeground(new java.awt.Color(0, 0, 0));

        Password.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Password.setForeground(new java.awt.Color(212, 212, 212));
        Password.setText("Password");

        boxPasswordUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxPasswordUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPasswordUsers.setForeground(new java.awt.Color(0, 0, 0));

        rePassword.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rePassword.setForeground(new java.awt.Color(212, 212, 212));
        rePassword.setText("Repetir Password");

        boxRePasswordUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxRePasswordUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxRePasswordUsers.setForeground(new java.awt.Color(0, 0, 0));
        boxRePasswordUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRePasswordUsersActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Email.setForeground(new java.awt.Color(212, 212, 212));
        Email.setText("Email");

        boxEmailUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxEmailUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxEmailUsers.setForeground(new java.awt.Color(0, 0, 0));

        Caja.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Caja.setForeground(new java.awt.Color(212, 212, 212));
        Caja.setText("Cash");

        comboCashUsers.setBackground(new java.awt.Color(255, 255, 255));
        comboCashUsers.setForeground(new java.awt.Color(0, 0, 0));

        Rol.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Rol.setForeground(new java.awt.Color(212, 212, 212));
        Rol.setText("Rol");

        comboRolUsers.setBackground(new java.awt.Color(255, 255, 255));
        comboRolUsers.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevoUsers.setText("Nuevo");

        btnRegistrarUsers.setText("Registrar");

        btnModificarUsers.setText("Modificar");

        tableUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Email", "Rol", "Cash", "Estado"
            }
        ));
        scrollPaneUsers.setViewportView(tableUsers);

        javax.swing.GroupLayout panelUsersLayout = new javax.swing.GroupLayout(panelUsers);
        panelUsers.setLayout(panelUsersLayout);
        panelUsersLayout.setHorizontalGroup(
            panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersLayout.createSequentialGroup()
                .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsersLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxPasswordUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelUsersLayout.createSequentialGroup()
                                .addComponent(rePassword)
                                .addGap(47, 47, 47)
                                .addComponent(boxRePasswordUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelUsersLayout.createSequentialGroup()
                            .addComponent(btnNuevoUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRegistrarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelUsersLayout.createSequentialGroup()
                            .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelUsersLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Password)
                                        .addComponent(Email)
                                        .addComponent(Rol)
                                        .addComponent(Caja)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsersLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usuario)
                                        .addComponent(Nombre))
                                    .addGap(20, 20, 20)))
                            .addGap(38, 38, 38)
                            .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboCashUsers, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxUsernameUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxFullnameUsers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(boxEmailUsers, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboRolUsers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(scrollPaneUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panelUsersLayout.setVerticalGroup(
            panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsersLayout.createSequentialGroup()
                .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelUsersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPaneUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUsersLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuario)
                            .addComponent(boxUsernameUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxFullnameUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre))
                        .addGap(14, 14, 14)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password)
                            .addComponent(boxPasswordUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rePassword)
                            .addComponent(boxRePasswordUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxEmailUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email))
                        .addGap(29, 29, 29)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja)
                            .addComponent(comboCashUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rol)
                            .addComponent(comboRolUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(panelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(panelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxRePasswordUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRePasswordUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRePasswordUsersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caja;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Rol;
    private javax.swing.JTextField boxEmailUsers;
    private javax.swing.JTextField boxFullnameUsers;
    private javax.swing.JPasswordField boxPasswordUsers;
    private javax.swing.JPasswordField boxRePasswordUsers;
    private javax.swing.JTextField boxUsernameUsers;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnModificarUsers;
    private org.jgp.system.views.swing.Button btnNuevoUsers;
    private org.jgp.system.views.swing.Button btnRegistrarUsers;
    private javax.swing.JComboBox<String> comboCashUsers;
    private javax.swing.JComboBox<String> comboRolUsers;
    private javax.swing.JLabel labelForm;
    private javax.swing.JPanel panelUsers;
    private javax.swing.JLabel rePassword;
    private javax.swing.JScrollPane scrollPaneUsers;
    private javax.swing.JTable tableUsers;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
