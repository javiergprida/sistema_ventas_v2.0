package org.jgp.system.views.component;

import org.jgp.system.controller.CompraController;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.views.IndexProgram;

public class SubFormCompra extends javax.swing.JPanel {
     Productos producto = new Productos();
    ProductosDao productosD = new ProductosDao();
   Proveedores proveedores = new Proveedores();
    ProveedoresDao proveedorD = new ProveedoresDao();
   

    public SubFormCompra(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText(name);
        boxIdCompra.setVisible(false);
        CompraController product = new CompraController(producto, productosD,proveedores ,proveedorD ,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopCompra = new javax.swing.JPopupMenu();
        popEliminarCompra = new javax.swing.JMenuItem();
        popReingresarCompra = new javax.swing.JMenuItem();
        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelCompra = new javax.swing.JPanel();
        Codigo2 = new javax.swing.JLabel();
        boxCodigoCompra = new javax.swing.JTextField();
        Nombre2 = new javax.swing.JLabel();
        boxProductoCompra = new javax.swing.JTextField();
        Cantidad2 = new javax.swing.JLabel();
        boxCantidadCompra = new javax.swing.JTextField();
        Total3 = new javax.swing.JLabel();
        boxPrecioCompra = new javax.swing.JTextField();
        Total2 = new javax.swing.JLabel();
        boxTotalcompra = new javax.swing.JTextField();
        Proveedor = new javax.swing.JLabel();
        comboProveedorCompra = new javax.swing.JComboBox<>();
        btnNuevaCompra = new org.jgp.system.views.swing.Button();
        pagarcon2 = new javax.swing.JLabel();
        boxPago2 = new javax.swing.JTextField();
        Cambio2 = new javax.swing.JLabel();
        boxCambio2 = new javax.swing.JTextField();
        pagar2 = new javax.swing.JLabel();
        labelTotalPagar = new javax.swing.JLabel();
        scrollPaneCompra = new javax.swing.JScrollPane();
        tableCompra = new rojerusan.RSTableMetro();
        boxIdCompra = new javax.swing.JTextField();

        popEliminarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarCompra.setText("Eliminar Usuario");
        menuPopCompra.add(popEliminarCompra);

        popReingresarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarCompra.setText("Reingrasar Usuario");
        menuPopCompra.add(popReingresarCompra);

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

        panelCompra.setBackground(new java.awt.Color(102, 115, 255));
        panelCompra.setForeground(new java.awt.Color(212, 212, 212));

        Codigo2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Codigo2.setForeground(new java.awt.Color(212, 212, 212));
        Codigo2.setText("Codigo");

        boxCodigoCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxCodigoCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCodigoCompra.setForeground(new java.awt.Color(0, 0, 0));
        boxCodigoCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Nombre2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(212, 212, 212));
        Nombre2.setText("Producto");

        boxProductoCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxProductoCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxProductoCompra.setForeground(new java.awt.Color(0, 0, 0));
        boxProductoCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Cantidad2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cantidad2.setForeground(new java.awt.Color(212, 212, 212));
        Cantidad2.setText("Cantidad");

        boxCantidadCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxCantidadCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCantidadCompra.setForeground(new java.awt.Color(0, 0, 0));
        boxCantidadCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Total3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Total3.setForeground(new java.awt.Color(212, 212, 212));
        Total3.setText("Precio");

        boxPrecioCompra.setBackground(new java.awt.Color(255, 255, 255));
        boxPrecioCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPrecioCompra.setForeground(new java.awt.Color(0, 0, 0));
        boxPrecioCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Total2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Total2.setForeground(new java.awt.Color(212, 212, 212));
        Total2.setText("Total");

        boxTotalcompra.setBackground(new java.awt.Color(255, 255, 255));
        boxTotalcompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTotalcompra.setForeground(new java.awt.Color(0, 0, 0));
        boxTotalcompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Proveedor.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Proveedor.setForeground(new java.awt.Color(212, 212, 212));
        Proveedor.setText("Proveedor");

        comboProveedorCompra.setBackground(new java.awt.Color(255, 255, 255));
        comboProveedorCompra.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboProveedorCompra.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevaCompra.setText("Generar");

        pagarcon2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagarcon2.setText("Pagar Con");

        boxPago2.setBackground(new java.awt.Color(255, 255, 255));
        boxPago2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPago2.setForeground(new java.awt.Color(0, 0, 0));
        boxPago2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Cambio2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        Cambio2.setText("Cambio");

        boxCambio2.setBackground(new java.awt.Color(255, 255, 255));
        boxCambio2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCambio2.setForeground(new java.awt.Color(0, 0, 0));
        boxCambio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pagar2.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagar2.setText("Total a Pagar");

        labelTotalPagar.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        labelTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalPagar.setText("-----");

        tableCompra.setBackground(new java.awt.Color(204, 204, 204));
        tableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        tableCompra.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableCompra.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableCompra.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableCompra.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableCompra.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableCompra.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tableCompra.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tableCompra.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableCompra.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableCompra.setColorSelForeground(new java.awt.Color(212, 212, 212));
        tableCompra.setComponentPopupMenu(menuPopCompra);
        scrollPaneCompra.setViewportView(tableCompra);

        boxIdCompra.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelCompraLayout = new javax.swing.GroupLayout(panelCompra);
        panelCompra.setLayout(panelCompraLayout);
        panelCompraLayout.setHorizontalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(Codigo2)
                        .addGap(18, 18, 18)
                        .addComponent(boxCodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nombre2)
                        .addGap(18, 18, 18)
                        .addComponent(boxProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(Proveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(Cantidad2)
                        .addGap(18, 18, 18)
                        .addComponent(boxCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Total3)
                        .addGap(18, 18, 18)
                        .addComponent(boxPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Total2)
                        .addGap(18, 18, 18)
                        .addComponent(boxTotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCompraLayout.createSequentialGroup()
                        .addComponent(boxIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagarcon2)
                .addGap(18, 18, 18)
                .addComponent(boxPago2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Cambio2)
                .addGap(18, 18, 18)
                .addComponent(boxCambio2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pagar2)
                .addGap(18, 18, 18)
                .addComponent(labelTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                    .addContainerGap(65, Short.MAX_VALUE)
                    .addComponent(scrollPaneCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(138, Short.MAX_VALUE)))
        );
        panelCompraLayout.setVerticalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Total3)
                        .addComponent(boxPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Codigo2)
                        .addComponent(boxCodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre2)
                        .addComponent(boxProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cantidad2)
                        .addComponent(boxCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Total2)
                        .addComponent(boxTotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Proveedor)
                        .addComponent(comboProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 498, Short.MAX_VALUE)
                .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCambio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagar2)
                    .addComponent(labelTotalPagar)
                    .addComponent(pagarcon2)
                    .addComponent(Cambio2))
                .addGap(46, 46, 46))
            .addGroup(panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraLayout.createSequentialGroup()
                    .addContainerGap(140, Short.MAX_VALUE)
                    .addComponent(scrollPaneCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cambio2;
    private javax.swing.JLabel Cantidad2;
    private javax.swing.JLabel Codigo2;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Total2;
    private javax.swing.JLabel Total3;
    public javax.swing.JTextField boxCambio2;
    public javax.swing.JTextField boxCantidadCompra;
    public javax.swing.JTextField boxCodigoCompra;
    public javax.swing.JTextField boxIdCompra;
    public javax.swing.JTextField boxPago2;
    public javax.swing.JTextField boxPrecioCompra;
    public javax.swing.JTextField boxProductoCompra;
    public javax.swing.JTextField boxTotalcompra;
    private org.jgp.system.views.swing.Button btnBack;
    public org.jgp.system.views.swing.Button btnNuevaCompra;
    public javax.swing.JComboBox<Object> comboProveedorCompra;
    private javax.swing.JLabel labelForm;
    public javax.swing.JLabel labelTotalPagar;
    public javax.swing.JPopupMenu menuPopCompra;
    private javax.swing.JLabel pagar2;
    private javax.swing.JLabel pagarcon2;
    private javax.swing.JPanel panelCompra;
    public javax.swing.JMenuItem popEliminarCompra;
    public javax.swing.JMenuItem popReingresarCompra;
    private javax.swing.JScrollPane scrollPaneCompra;
    public rojerusan.RSTableMetro tableCompra;
    // End of variables declaration//GEN-END:variables
}
