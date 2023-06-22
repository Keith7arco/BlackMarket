/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackmarket.forms;

import blackmarket.Conexion;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmComprador extends javax.swing.JFrame {
        
    private String nombre;
    private int estado;
    private Map<Integer, Integer> carrito; // Mapa para almacenar los productos en el carrito (ID del producto y cantidad)
    
    public frmComprador() {
        initComponents();
        carrito = new HashMap<>(); // Inicializar el carrito vacío
        mostrarProductos();
    }
    
    private void mostrarProductos() {
        Conexion db = new Conexion();

        try {
            Connection cn = db.Conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM Producto");
            ResultSet rs = pst.executeQuery();

            // Crear un modelo de tabla para contener los datos
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Producto");
            modeloTabla.addColumn("Categoría");
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Precio");
            //modeloTabla.addColumn("Imagen");

            // Procesar el conjunto de resultados y agregar filas al modelo de tabla
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getInt("idProducto");
                fila[1] = rs.getString("producto");
                fila[2] = rs.getString("categoria");
                fila[3] = rs.getInt("cantidad");
                fila[4] = rs.getFloat("precio");

                modeloTabla.addRow(fila);
            }

            // Establecer el modelo de tabla en la tabla de productos
            tablaProductos.setModel(modeloTabla);

            // Cerrar el conjunto de resultados, la declaración y la conexión
            rs.close();
            pst.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void setDatos(String dato){
        this.nombre=dato;
        txtComprador.setText(dato);
    }
    public void confirmacion(int estado){
        this.estado=estado;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtComprador = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnAgregarCarrito = new javax.swing.JButton();
        scrollPaneCarrito = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        txtIGV = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JLabel();
        btnProcesarCompra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido, ");

        txtComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtComprador.setForeground(new java.awt.Color(255, 255, 255));
        txtComprador.setText("txtComprador");

        btnCerrarSesion.setBackground(new java.awt.Color(204, 102, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnAgregarCarrito.setBackground(new java.awt.Color(204, 102, 0));
        btnAgregarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/shopping-cart.png"))); // NOI18N
        btnAgregarCarrito.setBorder(null);
        btnAgregarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCarrito.setFocusPainted(false);
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCarrito.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        scrollPaneCarrito.setViewportView(tablaCarrito);

        txtIGV.setForeground(new java.awt.Color(255, 255, 255));
        txtIGV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtMontoTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnProcesarCompra.setText("PROCESAR LA COMPRA");
        btnProcesarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarCompraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRODUCTOS BLACKMARKET");

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackmarket/images/delete.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProcesarCompra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollPaneCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtComprador)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrarSesion))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnCerrarSesion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarCarrito)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtComprador))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcesarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        // Obtener la fila seleccionada en la tabla de productos
        int filaSeleccionada = tablaProductos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un producto de la tabla");
            return;
        }
        // Obtener el ID y la cantidad del producto seleccionado
        int idProducto = (int) tablaProductos.getValueAt(filaSeleccionada, 0);
        int cantidadProducto = (int) tablaProductos.getValueAt(filaSeleccionada, 3);

        // Solicitar al usuario la cantidad deseada
        String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese la cantidad deseada:");
        if (cantidadStr == null || cantidadStr.isEmpty()) {
            return; // El usuario canceló o no ingresó una cantidad
        }

        // Validar que la cantidad ingresada sea un número entero
        int cantidadSeleccionada;
        try {
            cantidadSeleccionada = Integer.parseInt(cantidadStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida");
            return;
        }

        // Validar que la cantidad seleccionada no supere el stock disponible
        if (cantidadSeleccionada > cantidadProducto) {
            JOptionPane.showMessageDialog(this, "La cantidad seleccionada supera el stock disponible");
            return;
        }

        // Verificar si el producto ya está en el carrito
        if (carrito.containsKey(idProducto)) {
            // Si el producto ya está en el carrito, sumar la cantidad seleccionada
            int cantidadActual = carrito.get(idProducto);
            cantidadSeleccionada += cantidadActual;
        }

        // Agregar el producto al carrito con la cantidad seleccionada
        carrito.put(idProducto, cantidadSeleccionada);
        actualizarTablaCarrito();

        // Calcular el monto total
        float montoTotal = calcularMontoTotal();
        float igv=(float) (montoTotal*0.18);
        txtIGV.setText("IGV: S/."+igv);
        txtMontoTotal.setText("Total: S/. " + (montoTotal+igv));

    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void btnProcesarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarCompraActionPerformed
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío...");
            return;
        }
        frmMetodoPago metodoPagoForm = new frmMetodoPago();
        metodoPagoForm.setVisible(true);
        metodoPagoForm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                verificarFormularioSecundario(metodoPagoForm);
                
            }
        });
    }//GEN-LAST:event_btnProcesarCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener la fila seleccionada en la tabla de carrito
        int filaSeleccionada = tablaCarrito.getSelectedRow();
        if (filaSeleccionada == -1) {
          JOptionPane.showMessageDialog(this, "Selecciona un producto del carrito");
          return;
        }
        // Obtener el ID del producto seleccionado
        int idProducto = (int) tablaCarrito.getValueAt(filaSeleccionada, 0);
        // Eliminar el producto del carrito
        carrito.remove(idProducto);
        actualizarTablaCarrito();
        // Calcular el monto total
        float montoTotal = calcularMontoTotal();
        float igv=(float) (montoTotal*0.18);
        txtIGV.setText("IGV: S/."+igv);
        txtMontoTotal.setText("Total: S/." + (montoTotal+igv));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void actualizarTablaCarrito() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Cantidad");

        for (Map.Entry<Integer, Integer> entry : carrito.entrySet()) {
            int idProducto = entry.getKey();
            int cantidad = entry.getValue();
            String producto = obtenerNombreProducto(idProducto);
            float precio = obtenerPrecioProducto(idProducto);
            Object[] fila = {idProducto, producto, precio, cantidad};
            modeloTabla.addRow(fila);
        }

        tablaCarrito.setModel(modeloTabla);
    
    }
    
    private String obtenerNombreProducto(int idProducto) {
        Conexion db = new Conexion();

        try {
            Connection cn = db.Conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT producto FROM Producto WHERE idProducto = ?");
            pst.setInt(1, idProducto);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String producto = rs.getString("producto");
                rs.close();
                pst.close();
                cn.close();
                return producto;
            }

            rs.close();
            pst.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "";
    }
    
    private float obtenerPrecioProducto(int idProducto) {
        Conexion db = new Conexion();

        try {
            Connection cn = db.Conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT precio FROM Producto WHERE idProducto = ?");
            pst.setInt(1, idProducto);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                float precio = rs.getFloat("precio");
                rs.close();
                pst.close();
                cn.close();
                return precio;
            }

            rs.close();
            pst.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0;
    
    }
    
    private float calcularMontoTotal() {
        float montoTotal = 0;

        for (Map.Entry<Integer, Integer> entry : carrito.entrySet()) {
            int idProducto = entry.getKey();
            int cantidad = entry.getValue();
            float precio = obtenerPrecioProducto(idProducto);
            montoTotal += precio * cantidad;
        }

        return montoTotal;
    }
    
    private void disminuirStock(int idProducto, int cantidad) {
               Conexion db = new Conexion();

        try {
            Connection cn = db.Conectar();
            PreparedStatement pst = cn.prepareStatement("UPDATE Producto SET cantidad = cantidad - ? WHERE idProducto = ?");
            pst.setInt(1, cantidad);
            pst.setInt(2, idProducto);
            pst.executeUpdate();

            pst.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void verificarFormularioSecundario(frmMetodoPago frmMP) {
        // Aquí puedes verificar si el formulario secundario se cerró correctamente
        if (frmMP.isFormularioCompletado()) {
            for (Map.Entry<Integer, Integer> entry : carrito.entrySet()) {
                int idProducto = entry.getKey();
                int cantidad = entry.getValue();
                disminuirStock(idProducto, cantidad);
                // Limpiar el carrito
                carrito.clear();
                actualizarTablaCarrito();

                // Calcular el monto total
                float montoTotal = calcularMontoTotal();
                float igv=(float) (montoTotal*0.18);
                txtIGV.setText("IGV: S/."+igv);
                txtMontoTotal.setText("Monto Total: S/." + (montoTotal+igv));

                // Actualizar la tabla de productos
                mostrarProductos();
            }
            System.out.println("El metodo de pago se completó correctamente.");
        } else {
            System.out.println("El metodo de pago no se completó correctamente.");
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComprador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnProcesarCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scrollPaneCarrito;
    private javax.swing.JTable tablaCarrito;
    public javax.swing.JTable tablaProductos;
    private javax.swing.JLabel txtComprador;
    private javax.swing.JLabel txtIGV;
    private javax.swing.JLabel txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}
