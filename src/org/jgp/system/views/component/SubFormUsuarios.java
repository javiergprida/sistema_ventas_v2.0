package org.jgp.system.views.component;

import java.awt.Color;
import org.jgp.system.controller.UsersController;
import org.jgp.system.models.Users;
import org.jgp.system.models.UsersDao;
import org.jgp.system.views.IndexProgram;

public class SubFormUsuarios extends javax.swing.JPanel {
    Users us = new Users();
    UsersDao usDao = new UsersDao();
    

    public SubFormUsuarios(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
        UsersController users = new UsersController(us, usDao,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopUsers = new javax.swing.JPopupMenu();
        popEliminarUsers = new javax.swing.JMenuItem();
        popReingresarUsers = new javax.swing.JMenuItem();
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
        checkBoxShow = new javax.swing.JCheckBox();
        iconsuser = new javax.swing.JLabel();
        boxIdUsers = new javax.swing.JTextField();
        boxBuscarUser = new javax.swing.JTextField();
        panelBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        panelPagination = new javax.swing.JPanel();
        pagination = new org.jgp.system.views.swing.slideshow.Pagination();

        popEliminarUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarUsers.setText("Eliminar Usuario");
        menuPopUsers.add(popEliminarUsers);

        popReingresarUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarUsers.setText("Reingrasar Usuario");
        menuPopUsers.add(popReingresarUsers);

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
        panelUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        usuario.setForeground(new java.awt.Color(212, 212, 212));
        usuario.setText("Usuario");
        panelUsers.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 126, -1, -1));

        boxUsernameUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxUsernameUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxUsernameUsers.setForeground(new java.awt.Color(0, 0, 0));
        panelUsers.add(boxUsernameUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 122, 246, -1));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");
        panelUsers.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 177, -1, -1));

        boxFullnameUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxFullnameUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxFullnameUsers.setForeground(new java.awt.Color(0, 0, 0));
        panelUsers.add(boxFullnameUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 173, 260, -1));

        Password.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Password.setForeground(new java.awt.Color(212, 212, 212));
        Password.setText("Password");
        panelUsers.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 224, -1, -1));

        boxPasswordUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxPasswordUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPasswordUsers.setForeground(new java.awt.Color(0, 0, 0));
        panelUsers.add(boxPasswordUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 220, 193, -1));

        rePassword.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        rePassword.setForeground(new java.awt.Color(212, 212, 212));
        rePassword.setText("Repetir Password");
        panelUsers.add(rePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 276, -1, -1));

        boxRePasswordUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxRePasswordUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxRePasswordUsers.setForeground(new java.awt.Color(0, 0, 0));
        boxRePasswordUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRePasswordUsersActionPerformed(evt);
            }
        });
        panelUsers.add(boxRePasswordUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 272, 182, -1));

        Email.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Email.setForeground(new java.awt.Color(212, 212, 212));
        Email.setText("Email");
        panelUsers.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 327, -1, -1));

        boxEmailUsers.setBackground(new java.awt.Color(255, 255, 255));
        boxEmailUsers.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxEmailUsers.setForeground(new java.awt.Color(0, 0, 0));
        panelUsers.add(boxEmailUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 323, 260, -1));

        Caja.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Caja.setForeground(new java.awt.Color(212, 212, 212));
        Caja.setText("Cash");
        panelUsers.add(Caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 392, -1, -1));

        comboCashUsers.setBackground(new java.awt.Color(255, 255, 255));
        comboCashUsers.setForeground(new java.awt.Color(0, 0, 0));
        comboCashUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Seleccionar----", "General" }));
        panelUsers.add(comboCashUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 385, 260, -1));

        Rol.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Rol.setForeground(new java.awt.Color(212, 212, 212));
        Rol.setText("Rol");
        panelUsers.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 458, -1, -1));

        comboRolUsers.setBackground(new java.awt.Color(255, 255, 255));
        comboRolUsers.setForeground(new java.awt.Color(0, 0, 0));
        comboRolUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Seleccionar----", "Administrador", "Operario" }));
        panelUsers.add(comboRolUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 451, 260, -1));

        btnNuevoUsers.setText("Nuevo");
        panelUsers.add(btnNuevoUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 571, 120, 54));

        btnRegistrarUsers.setText("Registrar");
        panelUsers.add(btnRegistrarUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 571, 120, 54));

        btnModificarUsers.setText("Modificar");
        panelUsers.add(btnModificarUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 571, 120, 54));

        scrollPaneUsers.setFont(new java.awt.Font("Roboto Light", 0, 19)); // NOI18N

        tableUsers.setBackground(new java.awt.Color(255, 255, 255));
        tableUsers.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Email", "Rol", "Cash", "Estado"
            }
        ));
        tableUsers.setComponentPopupMenu(menuPopUsers);
        tableUsers.setRowHeight(35);
        tableUsers.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollPaneUsers.setViewportView(tableUsers);

        panelUsers.add(scrollPaneUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 122, 720, 400));

        checkBoxShow.setBackground(new java.awt.Color(102, 115, 255));
        checkBoxShow.setFont(new java.awt.Font("Roboto Black", 0, 19)); // NOI18N
        checkBoxShow.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxShow.setText("Show Password");
        checkBoxShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowActionPerformed(evt);
            }
        });
        panelUsers.add(checkBoxShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 524, 190, -1));

        iconsuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/icons8-user-100.png"))); // NOI18N
        panelUsers.add(iconsuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 6, -1, -1));

        boxIdUsers.setBackground(new java.awt.Color(255, 255, 255));
        panelUsers.add(boxIdUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, 59, -1));

        boxBuscarUser.setBackground(new java.awt.Color(255, 255, 255));
        boxBuscarUser.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxBuscarUser.setForeground(new java.awt.Color(0, 0, 0));
        panelUsers.add(boxBuscarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 73, 283, -1));

        panelBuscar.setBackground(new java.awt.Color(102, 115, 255));
        panelBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/lupa.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        panelUsers.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 40, 40));

        panelPagination.setBackground(new java.awt.Color(102, 115, 255));
        panelPagination.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelPaginationLayout = new javax.swing.GroupLayout(panelPagination);
        panelPagination.setLayout(panelPaginationLayout);
        panelPaginationLayout.setHorizontalGroup(
            panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagination, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        panelPaginationLayout.setVerticalGroup(
            panelPaginationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagination, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        panelUsers.add(panelPagination, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 640, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(panelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxRePasswordUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRePasswordUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRePasswordUsersActionPerformed

    private void checkBoxShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxShowActionPerformed
         if(checkBoxShow.isSelected()){
            boxPasswordUsers.setEchoChar((char)0);
            boxRePasswordUsers.setEchoChar((char)0);
       
       }else{
       boxPasswordUsers.setEchoChar('*');
        boxRePasswordUsers.setEchoChar('*');
       
       }
    }//GEN-LAST:event_checkBoxShowActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
       
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
     
    }//GEN-LAST:event_btnBuscarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caja;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Rol;
    public javax.swing.JTextField boxBuscarUser;
    public javax.swing.JTextField boxEmailUsers;
    public javax.swing.JTextField boxFullnameUsers;
    public javax.swing.JTextField boxIdUsers;
    public javax.swing.JPasswordField boxPasswordUsers;
    public javax.swing.JPasswordField boxRePasswordUsers;
    public javax.swing.JTextField boxUsernameUsers;
    private org.jgp.system.views.swing.Button btnBack;
    private javax.swing.JLabel btnBuscar;
    public org.jgp.system.views.swing.Button btnModificarUsers;
    public org.jgp.system.views.swing.Button btnNuevoUsers;
    public org.jgp.system.views.swing.Button btnRegistrarUsers;
    private javax.swing.JCheckBox checkBoxShow;
    public javax.swing.JComboBox<String> comboCashUsers;
    public javax.swing.JComboBox<String> comboRolUsers;
    private javax.swing.JLabel iconsuser;
    private javax.swing.JLabel labelForm;
    public javax.swing.JPopupMenu menuPopUsers;
    private org.jgp.system.views.swing.slideshow.Pagination pagination;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelPagination;
    private javax.swing.JPanel panelUsers;
    public javax.swing.JMenuItem popEliminarUsers;
    public javax.swing.JMenuItem popReingresarUsers;
    private javax.swing.JLabel rePassword;
    private javax.swing.JScrollPane scrollPaneUsers;
    public javax.swing.JTable tableUsers;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
