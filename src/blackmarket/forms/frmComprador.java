/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackmarket.forms;

import blackmarket.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author tarco
 */
public class frmComprador extends javax.swing.JFrame {
    
    //DATOS DEL LOGIN
    private String nombre;
    
    public frmComprador() {
        initComponents();
    }
    
    public void setDatos(String dato){
        this.nombre=dato;
        txtComprador.setText(dato);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtComprador = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel2.setText("Bienvenido, ");

        txtComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtComprador.setText("txtComprador");

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtComprador)
                .addGap(0, 436, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComprador)
                    .addComponent(btnCerrarSesion))
                .addContainerGap(484, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //ESTO CAMBIA SEGUN LA UBICACION DEL ARCHIVO
        ImageIcon icono=new ImageIcon("C:\\Users\\tarco\\OneDrive\\Documentos\\NetBeansProjects\\BlackMarket\\src\\blackmarket\\images\\sad.png");
        int salida=JOptionPane.showConfirmDialog(null,"¿Deseas volver a la página de Inicio de Sesión?","Cerrar Sesión",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,icono);
        if(salida==0){
            frmInicio login=new frmInicio();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComprador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtComprador;
    // End of variables declaration//GEN-END:variables
}
