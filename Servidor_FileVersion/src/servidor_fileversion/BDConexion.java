/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_fileversion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author brayan7
 */
public class BDConexion {
    Connection conectar = null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/PruebasTablas","root","root");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("//////EXITE ERROR");
        }
        return conectar;
    }
    
}
