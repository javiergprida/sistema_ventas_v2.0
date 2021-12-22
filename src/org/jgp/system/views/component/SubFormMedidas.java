package org.jgp.system.views.component;

import org.jgp.system.controller.MedidasController;
import org.jgp.system.models.Medidas;
import org.jgp.system.models.MedidasDao;
import org.jgp.system.views.IndexProgram;

public class SubFormMedidas extends javax.swing.JPanel {
    Medidas medida = new Medidas();
    MedidasDao medidaD = new MedidasDao();

    public SubFormMedidas(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
        boxIdMedida.setVisible(false);
        MedidasController medidas = new MedidasController(medida, medidaD, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopMedida = new javax.swing.JPopupMenu();
        popEliminarMedida = new javax.swing.JMenuItem();
        popReingresarMedida = new javax.swing.JMenuItem();
        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelMedida = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        boxNombreMedida = new javax.swing.JTextField();
        Abreviatura = new javax.swing.JLabel();
        boxAbrevMedida = new javax.swing.JTextField();
        btnRegistrarMedida = new org.jgp.system.views.swing.Button();
        btnModificarMedida = new org.jgp.system.views.swing.Button();
        scrollPaneMedida = new javax.swing.JScrollPane();
        tableMedida = new rojerusan.RSTableMetro();
        boxIdMedida = new javax.swing.JTextField();
        boxBuscarMedida = new javax.swing.JTextField();
        panelBuscarMedida = new javax.swing.JPanel();
        btnBuscarMedida = new javax.swing.JLabel();

        popEliminarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarMedida.setText("Eliminar Usuario");
        menuPopMedida.add(popEliminarMedida);

        popReingresarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarMedida.setText("Reingrasar Usuario");
        menuPopMedida.add(popReingresarMedida);

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

        panelMedida.setBackground(new java.awt.Color(102, 115, 255));
        panelMedida.setForeground(new java.awt.Color(212, 212, 212));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");

        boxNombreMedida.setBackground(new java.awt.Color(255, 255, 255));
        boxNombreMedida.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombreMedida.setForeground(new java.awt.Color(0, 0, 0));

        Abreviatura.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Abreviatura.setForeground(new java.awt.Color(212, 212, 212));
        Abreviatura.setText("Abreviatura");

        boxAbrevMedida.setBackground(new java.awt.Color(255, 255, 255));
        boxAbrevMedida.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxAbrevMedida.setForeground(new java.awt.Color(0, 0, 0));

        btnRegistrarMedida.setText("Registrar");

        btnModificarMedida.setText("Modificar");

        tableMedida.setBackground(new java.awt.Color(204, 204, 204));
        tableMedida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Abreviatura", "Estado"
            }
        ));
        tableMedida.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableMedida.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableMedida.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableMedida.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableMedida.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableMedida.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tableMedida.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tableMedida.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableMedida.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableMedida.setColorSelForeground(new java.awt.Color(212, 212, 212));
        tableMedida.setComponentPopupMenu(menuPopMedida);
        scrollPaneMedida.setViewportView(tableMedida);

        boxIdMedida.setBackground(new java.awt.Color(255, 255, 255));

        boxBuscarMedida.setBackground(new java.awt.Color(255, 255, 255));
        boxBuscarMedida.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxBuscarMedida.setForeground(new java.awt.Color(0, 0, 0));

        panelBuscarMedida.setBackground(new java.awt.Color(102, 115, 255));
        panelBuscarMedida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscarMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscarMedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/lupa.png"))); // NOI18N
        btnBuscarMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMedidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMedidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarMedidaLayout = new javax.swing.GroupLayout(panelBuscarMedida);
        panelBuscarMedida.setLayout(panelBuscarMedidaLayout);
        panelBuscarMedidaLayout.setHorizontalGroup(
            panelBuscarMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarMedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelBuscarMedidaLayout.setVerticalGroup(
            panelBuscarMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarMedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMedidaLayout = new javax.swing.GroupLayout(panelMedida);
        panelMedida.setLayout(panelMedidaLayout);
        panelMedidaLayout.setHorizontalGroup(
            panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMedidaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMedidaLayout.createSequentialGroup()
                        .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Abreviatura)
                            .addComponent(Nombre))
                        .addGap(43, 43, 43)
                        .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelMedidaLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(boxNombreMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addComponent(boxAbrevMedida))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedidaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnRegistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMedidaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(boxIdMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(boxBuscarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(panelBuscarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMedidaLayout.setVerticalGroup(
            panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedidaLayout.createSequentialGroup()
                .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMedidaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Nombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxIdMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMedidaLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(boxBuscarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelBuscarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxNombreMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMedidaLayout.createSequentialGroup()
                        .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxAbrevMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Abreviatura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                        .addGroup(panelMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrollPaneMedida))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelMedida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(panelMedida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBuscarMedidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedidaMouseEntered

    }//GEN-LAST:event_btnBuscarMedidaMouseEntered

    private void btnBuscarMedidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMedidaMouseExited

    }//GEN-LAST:event_btnBuscarMedidaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abreviatura;
    private javax.swing.JLabel Nombre;
    public javax.swing.JTextField boxAbrevMedida;
    public javax.swing.JTextField boxBuscarMedida;
    public javax.swing.JTextField boxIdMedida;
    public javax.swing.JTextField boxNombreMedida;
    private org.jgp.system.views.swing.Button btnBack;
    public javax.swing.JLabel btnBuscarMedida;
    public org.jgp.system.views.swing.Button btnModificarMedida;
    public org.jgp.system.views.swing.Button btnRegistrarMedida;
    private javax.swing.JLabel labelForm;
    public javax.swing.JPopupMenu menuPopMedida;
    public javax.swing.JPanel panelBuscarMedida;
    private javax.swing.JPanel panelMedida;
    public javax.swing.JMenuItem popEliminarMedida;
    public javax.swing.JMenuItem popReingresarMedida;
    private javax.swing.JScrollPane scrollPaneMedida;
    public rojerusan.RSTableMetro tableMedida;
    // End of variables declaration//GEN-END:variables
}
