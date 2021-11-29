package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormCategoria extends javax.swing.JPanel {

    public SubFormCategoria(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelCategoria = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        boxNombreCategoria = new javax.swing.JTextField();
        btnNuevoCategoria = new org.jgp.system.views.swing.Button();
        btnRegistrarCategoria = new org.jgp.system.views.swing.Button();
        btnModificarCategoria = new org.jgp.system.views.swing.Button();
        scrollPaneCategoria = new javax.swing.JScrollPane();
        tableCategoria = new rojerusan.RSTableMetro();

        setMaximumSize(new java.awt.Dimension(1180, 750));
        setMinimumSize(new java.awt.Dimension(1180, 750));

        labelForm.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        labelForm.setForeground(new java.awt.Color(212, 212, 212));
        labelForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelCategoria.setBackground(new java.awt.Color(102, 115, 255));
        panelCategoria.setForeground(new java.awt.Color(212, 212, 212));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");

        boxNombreCategoria.setBackground(new java.awt.Color(255, 255, 255));
        boxNombreCategoria.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombreCategoria.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevoCategoria.setText("Nuevo");

        btnRegistrarCategoria.setText("Registrar");

        btnModificarCategoria.setText("Modificar");

        tableCategoria.setBackground(new java.awt.Color(204, 204, 204));
        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        tableCategoria.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableCategoria.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableCategoria.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableCategoria.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableCategoria.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableCategoria.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tableCategoria.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tableCategoria.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableCategoria.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableCategoria.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneCategoria.setViewportView(tableCategoria);

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(Nombre)
                        .addGap(33, 33, 33)
                        .addComponent(boxNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(btnNuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPaneCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre)
                            .addComponent(boxNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                        .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(scrollPaneCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField boxNombreCategoria;
    private org.jgp.system.views.swing.Button btnBack;
    private org.jgp.system.views.swing.Button btnModificarCategoria;
    private org.jgp.system.views.swing.Button btnNuevoCategoria;
    private org.jgp.system.views.swing.Button btnRegistrarCategoria;
    private javax.swing.JLabel labelForm;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JScrollPane scrollPaneCategoria;
    public rojerusan.RSTableMetro tableCategoria;
    // End of variables declaration//GEN-END:variables
}
