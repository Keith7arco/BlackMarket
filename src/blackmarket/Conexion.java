/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackmarket;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conexion=null;
    public Connection Conectar(){
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("localhost");
            dataSource.setPort(3306);
            dataSource.setDatabaseName("BLACKMARKET");
            dataSource.setUser("root");
            dataSource.setPassword("1234");
            dataSource.setServerTimezone("UTC");

            conexion = dataSource.getConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return conexion;
    }
    public void Desconectar(){
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
        }
    }
    
}
