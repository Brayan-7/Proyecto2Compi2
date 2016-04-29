/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import Clases.*;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author brayan7
 */
@ManagedBean
@RequestScoped
public class accessN30 {
    public accessN20 AN1 =  new accessN20();
    public ConexionBD con; //INSTANCIANDO LA CONEXION CON LA BD
    
    //MOSTRAR ARCHIVOS O CARPETAS ASOCIADAS
    public String Repos1, Repos2, Repos3, Repos4;
    public String Repos5, Repos6, Repos7, Repos8;
    public String Repos9, Repos10, Repos11, Repos12;
    public String Repos13, Repos14, Repos15, Repos16;
    public String Repos17, Repos18, Repos19, Repos20;
    
    //VARIABLES PARA SABER SI EL CODIGO CORRESPONDE A CIERTA CARPETA
    public String CodSu1, NomSu1, CodSu2, NomSu2, CodSu3, NomSu3;
    public String CodSu4, NomSu4, CodSu5, NomSu5, CodSu6, NomSu6;
    public String CodSu7, NomSu7, CodSu8, NomSu8, CodSu9, NomSu9;
    public String CodSu10, NomSu10, CodSu11, NomSu11, CodSu12, NomSu12;
    public String CodSu13, NomSu13, CodSu14, NomSu14, CodSu15, NomSu15;
    public String CodSu16, NomSu16, CodSu17, NomSu17, CodSu18, NomSu18;
    public String CodSu19, NomSu19, CodSu20, NomSu20, CodSu21, NomSu21;

    String compCod, compNom;
    
    /**
     * Creates a new instance of accessN30
     */
    public accessN30() {
    }
    
    //*****
    ///METODO PARA VERIFICAR A QUE CARPETA PERTENECE
    public String VerificarSubC() {
        System.out.println("Metod-> CodS1: "+AN1.CodSu1);
        if(AN1.CodSu1.equals("8")){//Verifica si es la carpeta Seleccionada
            compCod = AN1.CodSu1;
            compNom = AN1.NomSu1;
            System.out.println("AccessSubCarpetaN30--"+compNom +"%%" + compCod);
        }else{
            compNom ="Error";
        }
        return compNom;
    }
    
    //METODO PARA OBTENER LAS SUBCARPETAS DE LA CARPETA
    public String ShowRepos(){
        con = new ConexionBD(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String msj = "", Proj="", Sub="";
        int contador = 0;String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        PreparedStatement st = null;
        if (cn == null) {
            msj = "ERROR AL CONECTAR A LA BD";
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Carpeta");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3); datos[3] = rs.getString(4);
                    Proj = datos[2]; Sub = datos[3];
                    if(Proj.equals("1") && Sub.equals("8")){ //Verificar q venga project=1 y subc=8
                        if(contador==1){
                            Repos1 = datos[1];
                            CodSu1 = datos[0];
                            NomSu1 = Repos1;
                        }else if(contador==2){
                            Repos2 = datos[1];
                            CodSu2 = datos[0];
                            NomSu2 = Repos2;
                        }else if(contador==3){
                            Repos3 = datos[1];
                            CodSu3 = datos[0];
                            NomSu3 = Repos3;
                        }else if(contador==4){
                            Repos4 = datos[1];
                            CodSu4 = datos[0];
                            NomSu4 = Repos4;
                        }else if(contador==5){
                            Repos5 = datos[1];
                            CodSu5 = datos[0];
                            NomSu5 = Repos5;
                        }else if(contador==6){
                            Repos6 = datos[1];
                            CodSu6 = datos[0];
                            NomSu6 = Repos6;
                        }else if(contador==7){
                            Repos7 = datos[1];
                            CodSu7 = datos[0];
                            NomSu7 = Repos7;
                        }else if(contador==8){
                            Repos8 = datos[1];
                            CodSu8 = datos[0];
                            NomSu8 = Repos8;
                        }else if(contador==9){
                            Repos9 = datos[1];
                            CodSu9 = datos[0];
                            NomSu9 = Repos9;
                        }else if(contador==10){
                            Repos10 = datos[1];
                            CodSu10 = datos[0];
                            NomSu10 = Repos10;
                        }else if(contador==11){
                            Repos11 = datos[1];
                            CodSu11 = datos[0];
                            NomSu11 = Repos11;
                        }else if(contador==12){
                            Repos12 = datos[1];
                            CodSu12 = datos[0];
                            NomSu12 = Repos12;
                        }else if(contador==13){
                            Repos13 = datos[1];
                            CodSu13 = datos[0];
                            NomSu13 = Repos13;
                        }else if(contador==14){
                            Repos14 = datos[1];
                            CodSu14 = datos[0];
                            NomSu14 = Repos14;
                        }else if(contador==15){
                            Repos15 = datos[1];
                            CodSu15 = datos[0];
                            NomSu15 = Repos15;
                        }else if(contador==16){
                            Repos16 = datos[1];
                            CodSu16 = datos[0];
                            NomSu16 = Repos16;
                        }else if(contador==17){
                            Repos17 = datos[1];
                            CodSu17 = datos[0];
                            NomSu17 = Repos17;
                        }else if(contador==18){
                            Repos18 = datos[1];
                            CodSu18 = datos[0];
                            NomSu18 = Repos18;
                        }else if(contador==19){
                            Repos19 = datos[1];
                            CodSu19 = datos[0];
                            NomSu19 = Repos19;
                        }else if(contador==20){
                            Repos20 = datos[1];
                            CodSu20 = datos[0];
                            NomSu20 = Repos20;
                        }
                    }
                    System.out.println("AN30: " + datos[0]+ " "+ datos[1]);
                    contador++;
                }
                System.out.println("////////CONECTADO///////");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return "ventana221.xhtml";
    }
    
}
