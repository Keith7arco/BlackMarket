/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackmarket;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author tarco
 */
public class Conexion {
    Connection conexion=null;
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BLACKMARKET?serverTimezone=UTC","root","1234");     
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString());
            e.printStackTrace();
        }
        return conexion;
    }
    public void Desconectar(){
        try{
            this.conexion.close();
        }catch(Exception e){}
    }
}
