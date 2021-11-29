package org.jgp.system.views.component;

import org.jgp.system.views.IndexProgram;

public class SubFormDetalleCompras extends javax.swing.JPanel {

    public SubFormDetalleCompras(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        scrollPaneDetalleCompra = new javax.swing.JScrollPane();
        tabledetalleCompra = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(102, 115, 255));
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

        tabledetalleCompra.setBackground(new java.awt.Color(204, 204, 204));
        tabledetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Total", "Fecha"
            }
        ));
        tabledetalleCompra.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tabledetalleCompra.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tabledetalleCompra.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tabledetalleCompra.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tabledetalleCompra.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tabledetalleCompra.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tabledetalleCompra.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tabledetalleCompra.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tabledetalleCompra.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tabledetalleCompra.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneDetalleCompra.setViewportView(tabledetalleCompra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(scrollPaneDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(704, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(88, Short.MAX_VALUE)
                    .addComponent(scrollPaneDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jgp.system.views.swing.Button btnBack;
    private javax.swing.JLabel labelForm;
    private javax.swing.JScrollPane scrollPaneDetalleCompra;
    public rojerusan.RSTableMetro tabledetalleCompra;
    // End of variables declaration//GEN-END:variables
}
