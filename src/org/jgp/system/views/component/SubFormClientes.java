package org.jgp.system.views.component;

import org.jgp.system.controller.ClientesController;
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.views.IndexProgram;

public class SubFormClientes extends javax.swing.JPanel {
    
    Clientes cliente = new Clientes();
    ClientesDao clienteD = new ClientesDao();

    public SubFormClientes(String name) {
        initComponents();
        setOpaque(false);
        boxIdCli.setVisible(false);
        labelForm.setText( name);
        ClientesController clientes = new ClientesController(cliente, clienteD,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopCliente = new javax.swing.JPopupMenu();
        popEliminarCliente = new javax.swing.JMenuItem();
        popReingresarCliente = new javax.swing.JMenuItem();
        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelClientes = new javax.swing.JPanel();
        NombreCli = new javax.swing.JLabel();
        boxNombreCli = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        boxTelefonoCli = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        btnRegistrarCli = new org.jgp.system.views.swing.Button();
        btnModificarCli = new org.jgp.system.views.swing.Button();
        scrollPaneDireccionCli = new javax.swing.JScrollPane();
        boxDireccionCli = new javax.swing.JTextPane();
        scrollPaneCliente = new javax.swing.JScrollPane();
        tableCliente = new rojerusan.RSTableMetro();
        boxBuscarCli = new javax.swing.JTextField();
        panelBuscarCli = new javax.swing.JPanel();
        btnBuscarCli = new javax.swing.JLabel();
        boxIdCli = new javax.swing.JTextField();

        popEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarCliente.setText("Eliminar Usuario");
        menuPopCliente.add(popEliminarCliente);

        popReingresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarCliente.setText("Reingrasar Usuario");
        menuPopCliente.add(popReingresarCliente);

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

        btnRegistrarCli.setText("Registrar");

        btnModificarCli.setText("Modificar");

        boxDireccionCli.setBackground(new java.awt.Color(255, 255, 255));
        boxDireccionCli.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxDireccionCli.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneDireccionCli.setViewportView(boxDireccionCli);

        tableCliente.setBackground(new java.awt.Color(204, 204, 204));
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Telefono", "Direccion", "Status"
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
        tableCliente.setColumnSelectionAllowed(true);
        tableCliente.setComponentPopupMenu(menuPopCliente);
        scrollPaneCliente.setViewportView(tableCliente);
        tableCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tableCliente.getColumnModel().getColumnCount() > 0) {
            tableCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableCliente.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableCliente.getColumnModel().getColumn(2).setPreferredWidth(80);
            tableCliente.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableCliente.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        boxBuscarCli.setBackground(new java.awt.Color(255, 255, 255));
        boxBuscarCli.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxBuscarCli.setForeground(new java.awt.Color(0, 0, 0));

        panelBuscarCli.setBackground(new java.awt.Color(102, 115, 255));
        panelBuscarCli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscarCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/lupa.png"))); // NOI18N
        btnBuscarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCliMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarCliLayout = new javax.swing.GroupLayout(panelBuscarCli);
        panelBuscarCli.setLayout(panelBuscarCliLayout);
        panelBuscarCliLayout.setHorizontalGroup(
            panelBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelBuscarCliLayout.setVerticalGroup(
            panelBuscarCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        boxIdCli.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreCli)
                            .addComponent(telefono)
                            .addComponent(Direccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxTelefonoCli, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxNombreCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(scrollPaneDireccionCli)))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(boxIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(boxBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(panelBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                        .addComponent(scrollPaneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(boxBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreCli)
                            .addComponent(boxNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono)
                            .addComponent(boxTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Direccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrollPaneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void btnBuscarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCliMouseEntered

    }//GEN-LAST:event_btnBuscarCliMouseEntered

    private void btnBuscarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCliMouseExited

    }//GEN-LAST:event_btnBuscarCliMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel NombreCli;
    public javax.swing.JTextField boxBuscarCli;
    public javax.swing.JTextPane boxDireccionCli;
    public javax.swing.JTextField boxIdCli;
    public javax.swing.JTextField boxNombreCli;
    public javax.swing.JTextField boxTelefonoCli;
    private org.jgp.system.views.swing.Button btnBack;
    public javax.swing.JLabel btnBuscarCli;
    public org.jgp.system.views.swing.Button btnModificarCli;
    public org.jgp.system.views.swing.Button btnRegistrarCli;
    private javax.swing.JLabel labelForm;
    public javax.swing.JPopupMenu menuPopCliente;
    public javax.swing.JPanel panelBuscarCli;
    private javax.swing.JPanel panelClientes;
    public javax.swing.JMenuItem popEliminarCliente;
    public javax.swing.JMenuItem popReingresarCliente;
    private javax.swing.JScrollPane scrollPaneCliente;
    private javax.swing.JScrollPane scrollPaneDireccionCli;
    public rojerusan.RSTableMetro tableCliente;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
