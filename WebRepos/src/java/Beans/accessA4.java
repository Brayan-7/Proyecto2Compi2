/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;
import Clases.*;

/**
 *
 * @author brayan7
 */
@ManagedBean
@RequestScoped
public class accessA4 {
    public ConexionBD con; //INSTANCIANDO LA CONEXION CON LA BD
    public accessN4 A4 = new accessN4();

    /**
     * Creates a new instance of accessA4
     */
    public accessA4() {
    }
    
    //OBTINE EL NOMBRE DEL ARCHIVO SELECCIONADO
    public String AnalFile(){
        con = new ConexionBD(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String msj = "", NomAr="";
        int contador = 0; String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            msj = "ERROR AL CONECTAR A LA BD";
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Archivo");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3); datos[3] = rs.getString(4);
                    NomAr = datos[1];
                    if(datos[3].equals("7") && A4.NomSuSu1.equals(NomAr)){
                        msj = NomAr;
                    }
                }
                System.out.println("++++++++++CONECTADO+++++++++");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return msj;
    }
    
    //OBTIENE EL CONTENIDO DEL ARCHVIO SELECCIONADO
    public String SeeFile(){
       con = new ConexionBD(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String msj = "", NomAr="";
        int contador = 0; String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            msj = "ERROR AL CONECTAR A LA BD";
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Archivo");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3); datos[3] = rs.getString(4);
                    NomAr = datos[1];
                    if(datos[3].equals("7") && A4.NomSuSu1.equals(NomAr)){
                        msj = datos[2];
                    }
                }
                System.out.println("¬¬¬¬¬¬¬¬CONECTADO¬¬¬¬¬¬¬");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return msj;
    }
}
