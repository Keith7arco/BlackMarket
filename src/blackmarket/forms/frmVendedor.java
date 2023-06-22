/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackmarket.forms;

import blackmarket.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class frmVendedor extends javax.swing.JFrame {

    //DATOS DEL LOGIN
    private String nombre;
    
    public frmVendedor() {
        initComponents();
    }

    public void setDatos(String dato){
        this.nombre=dato;
        txtVendedor.setText(dato);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        txtImagen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarImg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ImagenShow = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Imagen:");

        txtProducto.setBackground(new java.awt.Color(102, 102, 102));
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCategoria.setBackground(new java.awt.Color(102, 102, 102));
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGuardar.setBackground(new java.awt.Color(102, 153, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/diskette.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtImagen.setBackground(new java.awt.Color(102, 102, 102));
        txtImagen.setForeground(new java.awt.Color(255, 255, 255));
        txtImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtImagen.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido, ");

        txtVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtVendedor.setText("txtVendedor");

        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto:");

        btnBuscarImg.setBackground(new java.awt.Color(51, 0, 0));
        btnBuscarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/search-file.png"))); // NOI18N
        btnBuscarImg.setBorderPainted(false);
        btnBuscarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarImgActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad:");

        btnCerrarSesion.setBackground(new java.awt.Color(51, 0, 0));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrar Producto");

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/broom.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Imagen del Producto");

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenShow, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenShow, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        txtPrecio.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtVendedor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProducto)
                                            .addComponent(txtCategoria)
                                            .addComponent(txtPrecio))
                                        .addGap(67, 67, 67))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtImagen)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuscarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrarSesion)))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrarSesion)
                                .addGap(120, 120, 120)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtVendedor))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnBuscarImg)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

        int salida=JOptionPane.showConfirmDialog(null,"¿Deseas volver a la página de Inicio de Sesión?","Cerrar Sesión",
            JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(salida==0){
            frmInicio login=new frmInicio();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnBuscarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImgActionPerformed
        File archivoImg;
        JFileChooser flcAbrirArchivo=new JFileChooser();
        flcAbrirArchivo.setFileFilter(new FileNameExtensionFilter("archivo de imagen","jpg","jpeg","png"));
        int respuesta=flcAbrirArchivo.showOpenDialog(this);
        if(respuesta==JFileChooser.APPROVE_OPTION){
            archivoImg=flcAbrirArchivo.getSelectedFile();
            txtImagen.setText(archivoImg.getAbsolutePath());
            Image productoimg=getToolkit().getImage(txtImagen.getText());
            productoimg=productoimg.getScaledInstance(262,234,1);
            ImagenShow.setIcon(new ImageIcon(productoimg));
        }
    }//GEN-LAST:event_btnBuscarImgActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Conexion db =new Conexion();
        FileInputStream archivoImg;
        File nombreImg;
        if("".equals(txtProducto.getText())){
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto.");
        }else
        if("".equals(txtCategoria.getText())){
            JOptionPane.showMessageDialog(this, "Ingrese la categoria del producto.");
        }else
        if("".equals(txtPrecio.getText())||!validarNumeros(txtPrecio.getText())){
            JOptionPane.showMessageDialog(this, "Ingrese el precio correctamente.");
        }else
        if(txtCantidad.getValue().equals(0)){
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad mayor a 0.");
        }else{
            if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null,"¿Desea publicar el Producto?")){
            try{
                Connection cn=db.Conectar();
                PreparedStatement pst=cn.prepareStatement("Insert into Producto(producto,categoria,cantidad,precio,imagen) values(?,?,?,?,?)");
                nombreImg=new File(txtImagen.getText());
                archivoImg=new FileInputStream(nombreImg);
                pst.setString(1,txtProducto.getText());
                pst.setString(2,txtCategoria.getText());
                pst.setInt(3,(Integer)txtCantidad.getValue());
                pst.setFloat(4,Float.parseFloat(txtPrecio.getText()));
                pst.setBinaryStream(5,archivoImg,archivoImg.available());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto Publicado con Exito!!");
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtProducto.setText("");
        txtCategoria.setText("");
        txtPrecio.setText("");
        txtCantidad.setValue(0);
        txtImagen.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validarNumeros(String inputText) {
        Pattern pattern = Pattern.compile("\\d"); // Expresión regular para buscar dígitos
        Matcher matcher = pattern.matcher(inputText);
        return matcher.find();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenShow;
    private javax.swing.JButton btnBuscarImg;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtImagen;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JLabel txtVendedor;
    // End of variables declaration//GEN-END:variables
}
