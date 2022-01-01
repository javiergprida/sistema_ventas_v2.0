
package org.jgp.system.views;

import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jgp.system.models.Clientes;
import org.jgp.system.models.ClientesDao;
import org.jgp.system.models.Configuracion;
import org.jgp.system.models.Productos;
import org.jgp.system.models.ProductosDao;
import org.jgp.system.models.UsersDao;


public class PrintDetalleVenta extends javax.swing.JFrame {
    Productos producto = new Productos();
    ProductosDao productoD = new ProductosDao();
    Configuracion cf = new Configuracion();
    UsersDao usD = new UsersDao();
    Clientes cl = new Clientes();
    ClientesDao cld = new ClientesDao();
    DefaultTableModel modeloDetalle = new DefaultTableModel();

 
    public PrintDetalleVenta(int id) {
        initComponents();
        folioFactura.setText("" + id);
        listar(id);
        calcularVenta();
        cf = usD.getConfig();
        cuitEmpresa.setText(cf.getCuit());
        nombreEmpresa.setText(cf.getNombre());
        cl = cld.getClientes(id);
        nombreCliente.setText(cl.getNombre());
        direccioncliente.setText(cl.getDireccion());
        telefonocliente.setText(cl.getTelefono());
        
    }

     public void listar(int id) {
        List<Productos> lista = productoD.ListaPrintVenta(id);
        modeloDetalle = (DefaultTableModel) TableDetalle.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCantidad();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPrecioCompra();
            ob[3] = lista.get(i).getPrecioVenta();
            modeloDetalle.addRow(ob);
        }
        TableDetalle.setModel(modeloDetalle);
        
    }

    private void calcularVenta() {
        double total = 0.00;
        int numFila = TableDetalle.getRowCount();
        for (int i = 0; i < numFila; i++) {
            total = total + Double.parseDouble(String.valueOf(TableDetalle.getValueAt(i, 3)));
        }
        labeltotal.setText("" + total);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrint = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labeltotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        direccioncliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cuitEmpresa = new javax.swing.JLabel();
        folioFactura = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        scrollPaneCompra = new javax.swing.JScrollPane();
        TableDetalle = new rojerusan.RSTableMetro();
        jLabel9 = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefonocliente = new javax.swing.JLabel();
        btnImprimir = new org.jgp.system.views.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(50, 50, 50));
        setMinimumSize(new java.awt.Dimension(596, 728));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrint.setBackground(new java.awt.Color(255, 255, 255));
        panelPrint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 115, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del Cliente");
        panelPrint.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("GitHub: https://github.com/javierprida ");
        panelPrint.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema Ventas V2.0");
        panelPrint.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 150, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 30));
        jLabel4.setText("Total: ");
        panelPrint.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        labeltotal.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        labeltotal.setForeground(new java.awt.Color(0, 0, 0));
        labeltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltotal.setText("------");
        panelPrint.add(labeltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 110, -1));

        jLabel5.setForeground(new java.awt.Color(30, 30, 30));
        jLabel5.setText("Nombre: ");
        panelPrint.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        nombreCliente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        nombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        nombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreCliente.setText("------");
        panelPrint.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 20));

        jLabel6.setForeground(new java.awt.Color(30, 30, 30));
        jLabel6.setText("Direccion: ");
        panelPrint.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        direccioncliente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        direccioncliente.setForeground(new java.awt.Color(0, 0, 0));
        direccioncliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccioncliente.setText("------");
        panelPrint.add(direccioncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 150, 20));

        jLabel7.setForeground(new java.awt.Color(30, 30, 30));
        jLabel7.setText("Cuit");
        panelPrint.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 30, 30));

        jLabel8.setForeground(new java.awt.Color(30, 30, 30));
        jLabel8.setText("Folio");
        panelPrint.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 30, 20));

        cuitEmpresa.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        cuitEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        cuitEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuitEmpresa.setText("----");
        cuitEmpresa.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cuitEmpresaComponentAdded(evt);
            }
        });
        panelPrint.add(cuitEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 130, 20));

        folioFactura.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        folioFactura.setForeground(new java.awt.Color(0, 0, 0));
        folioFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folioFactura.setText("----");
        panelPrint.add(folioFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 130, 20));
        panelPrint.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 510, 10));
        panelPrint.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 510, 10));

        TableDetalle.setBackground(new java.awt.Color(204, 204, 204));
        TableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant", "Nombre", "Precio", "subTotal"
            }
        ));
        TableDetalle.setAltoHead(30);
        TableDetalle.setColorBackgoundHead(new java.awt.Color(102, 115, 255));
        TableDetalle.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        TableDetalle.setColorBordeHead(new java.awt.Color(204, 204, 204));
        TableDetalle.setColorFilasBackgound1(new java.awt.Color(204, 204, 255));
        TableDetalle.setColorFilasBackgound2(new java.awt.Color(153, 153, 255));
        TableDetalle.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        TableDetalle.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        TableDetalle.setColorForegroundHead(new java.awt.Color(212, 212, 212));
        TableDetalle.setColorSelBackgound(new java.awt.Color(102, 51, 255));
        TableDetalle.setColorSelForeground(new java.awt.Color(212, 212, 212));
        scrollPaneCompra.setViewportView(TableDetalle);
        if (TableDetalle.getColumnModel().getColumnCount() > 0) {
            TableDetalle.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableDetalle.getColumnModel().getColumn(1).setPreferredWidth(160);
            TableDetalle.getColumnModel().getColumn(2).setPreferredWidth(60);
            TableDetalle.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        panelPrint.add(scrollPaneCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 210, 480, 250));

        jLabel9.setForeground(new java.awt.Color(30, 30, 30));
        jLabel9.setText("Nombre: ");
        panelPrint.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        nombreEmpresa.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        nombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        nombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa.setText("------");
        panelPrint.add(nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, 20));

        jLabel10.setForeground(new java.awt.Color(30, 30, 30));
        jLabel10.setText("Telefono:");
        panelPrint.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        telefonocliente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        telefonocliente.setForeground(new java.awt.Color(0, 0, 0));
        telefonocliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonocliente.setText("------");
        panelPrint.add(telefonocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 20));

        getContentPane().add(panelPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 530, 590));

        btnImprimir.setForeground(new java.awt.Color(0, 0, 0));
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Toolkit tk = panelPrint.getToolkit();
        PrintJob pj = tk.getPrintJob(this, null, null);
        Graphics g = pj.getGraphics();
        panelPrint.print(g);
        g.dispose();
        pj.end();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void cuitEmpresaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cuitEmpresaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cuitEmpresaComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrintDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojerusan.RSTableMetro TableDetalle;
    private org.jgp.system.views.swing.Button btnImprimir;
    public javax.swing.JLabel cuitEmpresa;
    public javax.swing.JLabel direccioncliente;
    public javax.swing.JLabel folioFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel labeltotal;
    public javax.swing.JLabel nombreCliente;
    public javax.swing.JLabel nombreEmpresa;
    private javax.swing.JPanel panelPrint;
    private javax.swing.JScrollPane scrollPaneCompra;
    public javax.swing.JLabel telefonocliente;
    // End of variables declaration//GEN-END:variables
}
