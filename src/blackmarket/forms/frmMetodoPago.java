/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackmarket.forms;

import blackmarket.clases.PanelCallback;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;


public class frmMetodoPago extends javax.swing.JFrame implements PanelCallback{

    private boolean formularioCompletado;
    private Tarjeta mp1;
    private Yape mp2;
    
    public frmMetodoPago() {
        initComponents();
        formularioCompletado = false;

        mp1=new Tarjeta();
        mp1.setCallback((PanelCallback) this);
   
        mp1.setSize(500, 420);
        mp1.setLocation(0, 0);
        
        content.removeAll();
        content.add(mp1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnYape = new javax.swing.JButton();
        btnTarjeta = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnYape.setBackground(new java.awt.Color(115, 39, 125));
        btnYape.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnYape.setForeground(new java.awt.Color(255, 255, 255));
        btnYape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/qr-code.png"))); // NOI18N
        btnYape.setText("Pago por Yape");
        btnYape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYapeActionPerformed(evt);
            }
        });

        btnTarjeta.setBackground(new java.awt.Color(153, 153, 255));
        btnTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/tarjetaLog.png"))); // NOI18N
        btnTarjeta.setText("Pago por Tarjeta");
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });

        content.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/close.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnYape, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYape, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean isFormularioCompletado() {
        return formularioCompletado;
    }
    
    private void verificarPago(){
        if (mp1 != null) {
            boolean completadas1=mp1.actividadesCompletadas();
            if(completadas1){
            formularioCompletado=true;
            }
        if (mp2 != null) {
            boolean completadas2=mp2.actividadesCompletadas();
            if(completadas2){
            formularioCompletado=true;
                }
            }
        }
    }
    
    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaActionPerformed

        mp1=new Tarjeta();
        mp1.setCallback((PanelCallback) this);
        mp1.setSize(500, 420);
        mp1.setLocation(0, 0);
        
        content.removeAll();
        content.add(mp1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnTarjetaActionPerformed

    private void btnYapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYapeActionPerformed

        mp2=new Yape();
        mp2.setCallback((PanelCallback) this);
        mp2.setSize(500, 420);
        mp2.setLocation(0, 0);
        
        content.removeAll();
        content.add(mp2,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();  
    }//GEN-LAST:event_btnYapeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verificarPago();
        if(JOptionPane.showConfirmDialog(null, "¿Está seguro de proceder con la compra?\nSi ya lo pagó pulse SI", "Confirmar compra", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            if(formularioCompletado==false){
                JOptionPane.showMessageDialog(this, "Metodo de pago no colocado.");
            }else{
                this.dispose();
            }    
        }else if(formularioCompletado==true){
            JOptionPane.showMessageDialog(this, "La compra ya ha sido registrada con su metodo de pago...");
        }else{
            this.dispose();
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMetodoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTarjeta;
    private javax.swing.JButton btnYape;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void pagoCompleto(boolean pagoCompleto) {
        if(pagoCompleto){
            formularioCompletado=true;
        } 
    }
}
