/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Conexion {
    Connection con;
    String url="jdbc:postgresql://localhost:5432/eps";
    String user="postgres";
    String pass="1234";
    public Connection Conexion() throws SQLException{
        try{
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("CONEXION EXITOSA A LA BD ");
        }catch (ClassNotFoundException ex){
            System.out.println("error 1 en driver BD: " + ex.getMessage());
        } catch(SQLException ex){
            System.out.println("error2 en driver BD: " + ex.getMessage());
        }
        return con;
    }
            
}

