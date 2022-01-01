package org.jgp.system.views.component;

import org.jgp.system.controller.VentaController;
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.views.IndexProgram;

public class SubFormVenta extends javax.swing.JPanel {
Productos producto = new Productos();
    ProductosDao productosD = new ProductosDao();
   Clientes clientes = new Clientes();
    ClientesDao clientesD = new ClientesDao();

    public SubFormVenta(String name) {
        initComponents();
        setOpaque(false);
        labelForm.setText( name);
        boxIdVenta.setVisible(false);
        VentaController product = new VentaController(producto, productosD,clientes ,clientesD ,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopVenta = new javax.swing.JPopupMenu();
        popEliminarVenta = new javax.swing.JMenuItem();
        popReingresarVenta = new javax.swing.JMenuItem();
        labelForm = new javax.swing.JLabel();
        btnBack = new org.jgp.system.views.swing.Button();
        panelVenta = new javax.swing.JPanel();
        Codigo = new javax.swing.JLabel();
        boxCodigoVenta = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        boxProductoVenta = new javax.swing.JTextField();
        Stock = new javax.swing.JLabel();
        boxStockPro = new javax.swing.JTextField();
        Cantidad = new javax.swing.JLabel();
        boxCantidadVenta = new javax.swing.JTextField();
        Total = new javax.swing.JLabel();
        boxTotalVenta = new javax.swing.JTextField();
        Cliente = new javax.swing.JLabel();
        comboClienteVenta = new javax.swing.JComboBox<>();
        btnNuevaVenta = new org.jgp.system.views.swing.Button();
        pagarcon = new javax.swing.JLabel();
        boxPago = new javax.swing.JTextField();
        Cambio = new javax.swing.JLabel();
        boxCambio = new javax.swing.JTextField();
        pagar = new javax.swing.JLabel();
        TotalPagar = new javax.swing.JLabel();
        scrollPaneVenta = new javax.swing.JScrollPane();
        tableVenta = new rojerusan.RSTableMetro();
        boxIdVenta = new javax.swing.JTextField();
        Total3 = new javax.swing.JLabel();
        boxPrecioVenta = new javax.swing.JTextField();

        popEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/eliminar.png"))); // NOI18N
        popEliminarVenta.setText("Eliminar Usuario");
        menuPopVenta.add(popEliminarVenta);

        popReingresarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/change-user-30.png"))); // NOI18N
        popReingresarVenta.setText("Reingrasar Usuario");
        menuPopVenta.add(popReingresarVenta);

        setMaximumSize(new java.awt.Dimension(1180, 750));
        setMinimumSize(new java.awt.Dimension(1180, 750));
        setPreferredSize(new java.awt.Dimension(1180, 750));

        labelForm.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        labelForm.setForeground(new java.awt.Color(212, 212, 212));
        labelForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panelVenta.setBackground(new java.awt.Color(102, 115, 255));
        panelVenta.setForeground(new java.awt.Color(212, 212, 212));

        Codigo.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Codigo.setForeground(new java.awt.Color(212, 212, 212));
        Codigo.setText("Codigo");

        boxCodigoVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxCodigoVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCodigoVenta.setForeground(new java.awt.Color(0, 0, 0));

        Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(212, 212, 212));
        Nombre.setText("Producto");

        boxProductoVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxProductoVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxProductoVenta.setForeground(new java.awt.Color(0, 0, 0));

        Stock.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Stock.setForeground(new java.awt.Color(212, 212, 212));
        Stock.setText("Stock");

        boxStockPro.setBackground(new java.awt.Color(255, 255, 255));
        boxStockPro.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxStockPro.setForeground(new java.awt.Color(0, 0, 0));

        Cantidad.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(212, 212, 212));
        Cantidad.setText("Cantidad");

        boxCantidadVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxCantidadVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxCantidadVenta.setForeground(new java.awt.Color(0, 0, 0));

        Total.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Total.setForeground(new java.awt.Color(212, 212, 212));
        Total.setText("Total");

        boxTotalVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxTotalVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxTotalVenta.setForeground(new java.awt.Color(0, 0, 0));

        Cliente.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Cliente.setForeground(new java.awt.Color(212, 212, 212));
        Cliente.setText("Cliente");

        comboClienteVenta.setBackground(new java.awt.Color(255, 255, 255));
        comboClienteVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        comboClienteVenta.setForeground(new java.awt.Color(0, 0, 0));

        btnNuevaVenta.setText("Generar");

        pagarcon.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagarcon.setText("Pagar Con");

        boxPago.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N

        Cambio.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        Cambio.setText("Cambio");

        boxCambio.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N

        pagar.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        pagar.setText("Total a Pagar");

        TotalPagar.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        TotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalPagar.setText("-----");

        tableVenta.setBackground(new java.awt.Color(204, 204, 204));
        tableVenta.setForeground(new java.awt.Color(51, 51, 51));
        tableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ));
        tableVenta.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        tableVenta.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        tableVenta.setColorBordeHead(new java.awt.Color(204, 204, 204));
        tableVenta.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        tableVenta.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        tableVenta.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tableVenta.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tableVenta.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        tableVenta.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        tableVenta.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tableVenta.setComponentPopupMenu(menuPopVenta);
        scrollPaneVenta.setViewportView(tableVenta);

        Total3.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        Total3.setForeground(new java.awt.Color(212, 212, 212));
        Total3.setText("Precio");

        boxPrecioVenta.setBackground(new java.awt.Color(255, 255, 255));
        boxPrecioVenta.setFont(new java.awt.Font("Roboto Medium", 0, 19)); // NOI18N
        boxPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));
        boxPrecioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVentaLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(pagarcon)
                        .addGap(18, 18, 18)
                        .addComponent(boxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(Cambio)
                        .addGap(18, 18, 18)
                        .addComponent(boxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(pagar)
                        .addGap(18, 18, 18)
                        .addComponent(TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVentaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneVenta)
                            .addGroup(panelVentaLayout.createSequentialGroup()
                                .addComponent(boxIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelVentaLayout.createSequentialGroup()
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                                        .addComponent(Codigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                                        .addComponent(Cliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)))
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(Stock)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boxStockPro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(Cantidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(Total3)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(Total)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(boxCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre)
                    .addComponent(boxProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxStockPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stock)
                    .addComponent(Total3)
                    .addComponent(boxPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Total)
                        .addComponent(boxTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cantidad)
                        .addComponent(boxCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cliente)
                        .addComponent(comboClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(scrollPaneVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagar)
                    .addComponent(TotalPagar)
                    .addComponent(pagarcon)
                    .addComponent(Cambio))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        IndexProgram.getInstance().getSlideShow().slideTo(0);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cambio;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Cliente;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Total3;
    public javax.swing.JLabel TotalPagar;
    public javax.swing.JTextField boxCambio;
    public javax.swing.JTextField boxCantidadVenta;
    public javax.swing.JTextField boxCodigoVenta;
    public javax.swing.JTextField boxIdVenta;
    public javax.swing.JTextField boxPago;
    public javax.swing.JTextField boxPrecioVenta;
    public javax.swing.JTextField boxProductoVenta;
    public javax.swing.JTextField boxStockPro;
    public javax.swing.JTextField boxTotalVenta;
    private org.jgp.system.views.swing.Button btnBack;
    public org.jgp.system.views.swing.Button btnNuevaVenta;
    public javax.swing.JComboBox<Object> comboClienteVenta;
    private javax.swing.JLabel labelForm;
    public javax.swing.JPopupMenu menuPopVenta;
    private javax.swing.JLabel pagar;
    private javax.swing.JLabel pagarcon;
    private javax.swing.JPanel panelVenta;
    public javax.swing.JMenuItem popEliminarVenta;
    public javax.swing.JMenuItem popReingresarVenta;
    private javax.swing.JScrollPane scrollPaneVenta;
    public rojerusan.RSTableMetro tableVenta;
    // End of variables declaration//GEN-END:variables
}
