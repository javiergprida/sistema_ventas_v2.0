package org.jgp.system.views.component;

import org.jgp.system.controller.CategoriaController;
import org.jgp.system.models.Categoria;
import org.jgp.system.models.CategoriaDao;
import org.jgp.system.views.IndexProgram;

public class SubFormCategoria extends javax.swing.JPanel {
    Categoria categoria = new Categoria();
    CategoriaDao categoriaD = new CategoriaDao();

    public SubFormCategoria(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
        boxIdCategoria.setVisible(false);
        CategoriaController categorias = new CategoriaController(categoria,categoriaD,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopCategoria = new javax.swing.JPopupMenu();
        popEliminarCategoria = new javax.swing.JMenuItem();
        popReingresarcategoria = new javax.swing.JMenuItem();
        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelCategoria = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        boxNombreCategoria = new javax.swing.JTextField();
        btnRegistrarCategoria = new org.jgp.system.views.swing.Button();
        btnModificarCategoria = new org.jgp.system.views.swing.Button();
        scrollPaneCategoria = new javax.swing.JScrollPane();
        tableCategoria = new rojerusan.RSTableMetro();
        boxIdCategoria = new javax.swing.JTextField();
        boxBuscarCategoria = new javax.swing.JTextField();
        panelBuscarCategoria = new javax.swing.JPanel();
        btnBuscarCategoria = new javax.swing.JLabel();

        popEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarCategoria.setText("Eliminar Usuario");
        menuPopCategoria.add(popEliminarCategoria);

        popReingresarcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarcategoria.setText("Reingrasar Usuario");
        menuPopCategoria.add(popReingresarcategoria);

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
        tableCategoria.setComponentPopupMenu(menuPopCategoria);
        scrollPaneCategoria.setViewportView(tableCategoria);

        boxIdCategoria.setBackground(new java.awt.Color(255, 255, 255));
        boxIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIdCategoriaActionPerformed(evt);
            }
        });

        boxBuscarCategoria.setBackground(new java.awt.Color(255, 255, 255));
        boxBuscarCategoria.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxBuscarCategoria.setForeground(new java.awt.Color(0, 0, 0));

        panelBuscarCategoria.setBackground(new java.awt.Color(102, 115, 255));
        panelBuscarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscarCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/lupa.png"))); // NOI18N
        btnBuscarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCategoriaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarCategoriaLayout = new javax.swing.GroupLayout(panelBuscarCategoria);
        panelBuscarCategoria.setLayout(panelBuscarCategoriaLayout);
        panelBuscarCategoriaLayout.setHorizontalGroup(
            panelBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelBuscarCategoriaLayout.setVerticalGroup(
            panelBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

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
                        .addComponent(boxNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(boxIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(boxBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(panelBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(scrollPaneCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(boxNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(boxBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnBuscarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaMouseEntered

    }//GEN-LAST:event_btnBuscarCategoriaMouseEntered

    private void btnBuscarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaMouseExited

    }//GEN-LAST:event_btnBuscarCategoriaMouseExited

    private void boxIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIdCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    public javax.swing.JTextField boxBuscarCategoria;
    public javax.swing.JTextField boxIdCategoria;
    public javax.swing.JTextField boxNombreCategoria;
    private org.jgp.system.views.swing.Button btnBack;
    public javax.swing.JLabel btnBuscarCategoria;
    public org.jgp.system.views.swing.Button btnModificarCategoria;
    public org.jgp.system.views.swing.Button btnRegistrarCategoria;
    private javax.swing.JLabel labelForm;
    public javax.swing.JPopupMenu menuPopCategoria;
    public javax.swing.JPanel panelBuscarCategoria;
    private javax.swing.JPanel panelCategoria;
    public javax.swing.JMenuItem popEliminarCategoria;
    public javax.swing.JMenuItem popReingresarcategoria;
    private javax.swing.JScrollPane scrollPaneCategoria;
    public rojerusan.RSTableMetro tableCategoria;
    // End of variables declaration//GEN-END:variables
}
