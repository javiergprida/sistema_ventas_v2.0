/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jgp.system.views;


/**
 *
 * @author javie
 */
public class ScreenSplashSystem extends javax.swing.JFrame {

    
    
    public ScreenSplashSystem() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        panel2 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        cargando = new javax.swing.JLabel();
        fondoanimado = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(0, 102, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SYSTEM JPG");
        panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 360, 50));

        progressbar.setBackground(new java.awt.Color(255, 255, 255));
        progressbar.setForeground(new java.awt.Color(80, 70, 190));
        panel.add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 690, 20));

        panel2.setBackground(new java.awt.Color(240, 240, 240));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/java.png"))); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(icon)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        panel.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 510));

        cargando.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        cargando.setForeground(new java.awt.Color(255, 255, 255));
        cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargando.setText("--");
        panel.add(cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 60, -1));

        fondoanimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jgp/system/img/7fPN.gif"))); // NOI18N
        panel.add(fondoanimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 680, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(710, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ScreenSplashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenSplashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenSplashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenSplashSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cargando;
    private static javax.swing.JLabel fondoanimado;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    public static javax.swing.JProgressBar progressbar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
