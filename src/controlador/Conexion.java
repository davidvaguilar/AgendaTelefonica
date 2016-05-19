/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author David
 */
public class Conexion {
    
    public static final String URL= "jdbc:mysql://localhost:3306/AgendaTelefonica";
    public static final String USERNAME= "alumno";
    public static final String PASSWORD= "alu";
    
   
    
    public static Connection getConexion(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
    
}
