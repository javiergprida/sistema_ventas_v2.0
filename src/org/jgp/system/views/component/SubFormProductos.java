package org.jgp.system.views.component;

import org.jgp.system.controller.ProductosController;
import org.jgp.system.models.Categoria;
import org.jgp.system.models.CategoriaDao;
import org.jgp.system.models.Medidas;
import org.jgp.system.models.MedidasDao;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.Proveedores;
import org.jgp.system.models.ProveedoresDao;
import org.jgp.system.views.IndexProgram;

public class SubFormProductos extends javax.swing.JPanel {
    Productos producto = new Productos();
    ProductosDao productosD = new ProductosDao();
   Proveedores proveedores = new Proveedores();
    ProveedoresDao proveedorD = new ProveedoresDao();
    Medidas medidas = new Medidas();
    MedidasDao medidasD = new MedidasDao();
    Categoria categoria = new Categoria();
    CategoriaDao categoriaD = new CategoriaDao();

    public SubFormProductos(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
        boxIdProducto.setVisible(false);
        ProductosController product = new ProductosController(producto, productosD,proveedores ,proveedorD ,medidas,medidasD,categoria,categoriaD,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopProducto = new javax.swing.JPopupMenu();
        popEliminarProducto = new javax.swing.JMenuItem();
        popReingresarProducto = new javax.swing.JMenuItem();
        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelProductos = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        boxCodePro = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        boxNombrePro = new javax.swing.JTextField();
        pCompra = new javax.swing.JLabel();
        boxPCompraPro = new javax.swing.JTextField();
        pVenta = new javax.swing.JLabel();
        boxPVentaPro = new javax.swing.JTextField();
        proveedor = new javax.swing.JLabel();
        comboProveedorPro = new javax.swing.JComboBox<>();
        medida = new javax.swing.JLabel();
        comboMedidaPro = new javax.swing.JComboBox<>();
        Categoria = new javax.swing.JLabel();
        scrollPaneProducto = new javax.swing.JScrollPane();
        tableProducto = new rojerusan.RSTableMetro();
        comboCategoriaPro = new javax.swing.JComboBox<>();
        btnRegistrarPro = new org.jgp.system.views.swing.Button();
        btnModificarPro = new org.jgp.system.views.swing.Button();
        boxIdProducto = new javax.swing.JTextField();
        boxBuscarProducto = new javax.swing.JTextField();
        panelBuscarProducto = new javax.swing.JPanel();
        btnBuscarProducto = new javax.swing.JLabel();

        popEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarProducto.setText("Eliminar Usuario");
        menuPopProducto.add(popEliminarProducto);

        popReingresarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarProducto.setText("Reingrasar Usuario");
        menuPopProducto.add(popReingresarProducto);

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

        panelProductos.setBackground(new java.awt.Color(102, 115, 255));
        panelProductos.setForeground(new java.awt.Color(212, 212, 212));

        code.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        code.setForeground(new java.awt.Color(212, 212, 212));
        code.setText("Codigo");

        boxCodePro.setBackground(new java.awt.Color(255, 255, 255));
        boxCodePro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCodePro.setForeground(new java.awt.Color(0, 0, 0));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Nombre");

        boxNombrePro.setBackground(new java.awt.Color(255, 255, 255));
        boxNombrePro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxNombrePro.setForeground(new java.awt.Color(0, 0, 0));

        pCompra.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        pCompra.setForeground(new java.awt.Color(212, 212, 212));
        pCompra.setText("Compra");

        boxPCompraPro.setBackground(new java.awt.Color(255, 255, 255));
        boxPCompraPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPCompraPro.setForeground(new java.awt.Color(0, 0, 0));

        pVenta.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        pVenta.setForeground(new java.awt.Color(212, 212, 212));
        pVenta.setText("Venta");

        boxPVentaPro.setBackground(new java.awt.Color(255, 255, 255));
        boxPVentaPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPVentaPro.setForeground(new java.awt.Color(0, 0, 0));

        proveedor.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        proveedor.setForeground(new java.awt.Color(212, 212, 212));
        proveedor.setText("Proveedor");

        comboProveedorPro.setBackground(new java.awt.Color(255, 255, 255));
        comboProveedorPro.setEditable(true);
        comboProveedorPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboProveedorPro.setForeground(new java.awt.Color(0, 0, 0));

        medida.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        medida.setForeground(new java.awt.Color(212, 212, 212));
        medida.setText("Medida");

        comboMedidaPro.setBackground(new java.awt.Color(255, 255, 255));
        comboMedidaPro.setEditable(true);
        comboMedidaPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboMedidaPro.setForeground(new java.awt.Color(0, 0, 0));

        Categoria.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Categoria.setForeground(new java.awt.Color(212, 212, 212));
        Categoria.setText("Categoria");

        tableProducto.setBackground(new java.awt.Color(204, 204, 204));
        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cod", "Nombre", "Cantidad", "Precio Compra", "Precio Venta", "Estado"
            }
        ));
        tableProducto.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableProducto.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableProducto.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableProducto.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableProducto.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableProducto.setColorFilasForeground1(new java.awt.Color(212, 212, 212));
        tableProducto.setColorFilasForeground2(new java.awt.Color(212, 212, 212));
        tableProducto.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableProducto.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableProducto.setColorSelForeground(new java.awt.Color(212, 212, 212));
        tableProducto.setComponentPopupMenu(menuPopProducto);
        tableProducto.setFuenteHead(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        scrollPaneProducto.setViewportView(tableProducto);
        if (tableProducto.getColumnModel().getColumnCount() > 0) {
            tableProducto.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableProducto.getColumnModel().getColumn(1).setPreferredWidth(20);
            tableProducto.getColumnModel().getColumn(2).setPreferredWidth(60);
            tableProducto.getColumnModel().getColumn(3).setPreferredWidth(40);
            tableProducto.getColumnModel().getColumn(4).setPreferredWidth(60);
            tableProducto.getColumnModel().getColumn(5).setPreferredWidth(60);
            tableProducto.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        comboCategoriaPro.setBackground(new java.awt.Color(255, 255, 255));
        comboCategoriaPro.setEditable(true);
        comboCategoriaPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboCategoriaPro.setForeground(new java.awt.Color(0, 0, 0));
        comboCategoriaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaProActionPerformed(evt);
            }
        });

        btnRegistrarPro.setText("Registrar");

        btnModificarPro.setText("Modificar");
        btnModificarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProActionPerformed(evt);
            }
        });

        boxIdProducto.setBackground(new java.awt.Color(255, 255, 255));
        boxIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIdProductoActionPerformed(evt);
            }
        });

        boxBuscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        boxBuscarProducto.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxBuscarProducto.setForeground(new java.awt.Color(0, 0, 0));

        panelBuscarProducto.setBackground(new java.awt.Color(102, 115, 255));
        panelBuscarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/lupa.png"))); // NOI18N
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarProductoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarProductoLayout = new javax.swing.GroupLayout(panelBuscarProducto);
        panelBuscarProducto.setLayout(panelBuscarProductoLayout);
        panelBuscarProductoLayout.setHorizontalGroup(
            panelBuscarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelBuscarProductoLayout.setVerticalGroup(
            panelBuscarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medida)
                            .addComponent(pVenta)
                            .addComponent(Categoria)
                            .addComponent(proveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(code)
                                .addComponent(Nombre))
                            .addComponent(pCompra))
                        .addGap(29, 29, 29)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboMedidaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboProveedorPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxPVentaPro)
                            .addComponent(boxPCompraPro)
                            .addComponent(boxCodePro)
                            .addComponent(boxNombrePro)
                            .addComponent(comboCategoriaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(boxIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(boxBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(panelBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrollPaneProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(boxIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(boxBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code)
                            .addComponent(boxCodePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre)
                            .addComponent(boxNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxPCompraPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCompra))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pVenta)
                            .addComponent(boxPVentaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboProveedorPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proveedor))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medida)
                            .addComponent(comboMedidaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategoriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categoria))
                        .addGap(101, 101, 101)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrollPaneProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIdProductoActionPerformed

    private void btnBuscarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoMouseEntered

    }//GEN-LAST:event_btnBuscarProductoMouseEntered

    private void btnBuscarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoMouseExited

    }//GEN-LAST:event_btnBuscarProductoMouseExited

    private void btnModificarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarProActionPerformed

    private void comboCategoriaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Nombre;
    public javax.swing.JTextField boxBuscarProducto;
    public javax.swing.JTextField boxCodePro;
    public javax.swing.JTextField boxIdProducto;
    public javax.swing.JTextField boxNombrePro;
    public javax.swing.JTextField boxPCompraPro;
    public javax.swing.JTextField boxPVentaPro;
    private org.jgp.system.views.swing.Button btnBack;
    public javax.swing.JLabel btnBuscarProducto;
    public org.jgp.system.views.swing.Button btnModificarPro;
    public org.jgp.system.views.swing.Button btnRegistrarPro;
    private javax.swing.JLabel code;
    public javax.swing.JComboBox<Object> comboCategoriaPro;
    public javax.swing.JComboBox<Object> comboMedidaPro;
    public javax.swing.JComboBox<Object> comboProveedorPro;
    private javax.swing.JLabel labelForm;
    private javax.swing.JLabel medida;
    public javax.swing.JPopupMenu menuPopProducto;
    private javax.swing.JLabel pCompra;
    private javax.swing.JLabel pVenta;
    public javax.swing.JPanel panelBuscarProducto;
    private javax.swing.JPanel panelProductos;
    public javax.swing.JMenuItem popEliminarProducto;
    public javax.swing.JMenuItem popReingresarProducto;
    private javax.swing.JLabel proveedor;
    private javax.swing.JScrollPane scrollPaneProducto;
    public rojerusan.RSTableMetro tableProducto;
    // End of variables declaration//GEN-END:variables
}
