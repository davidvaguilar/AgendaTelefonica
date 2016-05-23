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
    
    public static final String URL= "jdbc:mysql://192.168.0.2:3306/AgendaTelefonica?zeroDateTimeBehavior=convertToNull";
    public static final String USERNAME= "15979446";
    public static final String PASSWORD= "david";
    
   
    
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
