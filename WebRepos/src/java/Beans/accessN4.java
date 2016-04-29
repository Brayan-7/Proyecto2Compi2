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
public class accessN4 {
    public access4 AS4 =  new access4();
    public ConexionBD con; //INSTANCIANDO LA CONEXION CON LA BD
    
    //MOSTRAR ARCHIVOS O CARPETAS ASOCIADAS
    public String A1, A2, A3, A4;
    public String A5, A6, A7, A8;
    public String A9, A10, A11, A12;
    public String A13, A14, A15, A16;
    public String A17, A18, A19, A20;
    
    //VARIABLES PARA SABER SI EL CODIGO CORRESPONDE A CIERTA CARPETA
    public static String CodSuSu1, NomSuSu1, CodSuSu2, NomSuSu2, CodSuSu3, NomSuSu3;
    public static String CodSuSu4, NomSuSu4, CodSuSu5, NomSuSu5, CodSuSu6, NomSuSu6;
    public static String CodSuSu7, NomSuSu7, CodSuSu8, NomSuSu8, CodSuSu9, NomSuSu9;
    public static String CodSuSu10, NomSuSu10, CodSuSu11, NomSuSu11, CodSuSu12, NomSuSu12;
    public static String CodSuSu13, NomSuSu13, CodSuSu14, NomSuSu14, CodSuSu15, NomSuSu15;
    public static String CodSuSu16, NomSuSu16, CodSuSu17, NomSuSu17, CodSuSu18, NomSuSu18;
    public static String CodSuSu19, NomSuSu19, CodSuSu20, NomSuSu20, CodSuSu21, NomSuSu21;
    
    String compCod, compNom;

    public String getA1() {
        return A1;
    }

    public void setA1(String A1) {
        this.A1 = A1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public String getA4() {
        return A4;
    }

    public void setA4(String A4) {
        this.A4 = A4;
    }

    public String getA5() {
        return A5;
    }

    public void setA5(String A5) {
        this.A5 = A5;
    }

    public String getA6() {
        return A6;
    }

    public void setA6(String A6) {
        this.A6 = A6;
    }

    public String getA7() {
        return A7;
    }

    public void setA7(String A7) {
        this.A7 = A7;
    }

    public String getA8() {
        return A8;
    }

    public void setA8(String A8) {
        this.A8 = A8;
    }

    public String getA9() {
        return A9;
    }

    public void setA9(String A9) {
        this.A9 = A9;
    }

    public String getA10() {
        return A10;
    }

    public void setA10(String A10) {
        this.A10 = A10;
    }

    public String getA11() {
        return A11;
    }

    public void setA11(String A11) {
        this.A11 = A11;
    }

    public String getA12() {
        return A12;
    }

    public void setA12(String A12) {
        this.A12 = A12;
    }

    public String getA13() {
        return A13;
    }

    public void setA13(String A13) {
        this.A13 = A13;
    }

    public String getA14() {
        return A14;
    }

    public void setA14(String A14) {
        this.A14 = A14;
    }

    public String getA15() {
        return A15;
    }

    public void setA15(String A15) {
        this.A15 = A15;
    }

    public String getA16() {
        return A16;
    }

    public void setA16(String A16) {
        this.A16 = A16;
    }

    public String getA17() {
        return A17;
    }

    public void setA17(String A17) {
        this.A17 = A17;
    }

    public String getA18() {
        return A18;
    }

    public void setA18(String A18) {
        this.A18 = A18;
    }

    public String getA19() {
        return A19;
    }

    public void setA19(String A19) {
        this.A19 = A19;
    }

    public String getA20() {
        return A20;
    }

    public void setA20(String A20) {
        this.A20 = A20;
    }

    
    
    
    
    /**
     * Creates a new instance of accessN4
     */
    public accessN4() {
    }
    
    ///METODO PARA VERIFICAR A QUE ARCHIVO PERTENECE
    public String VerificarSubA() {
        System.out.println("MetodNA4-> CodSu1: "+AS4.CodS1);
        if(AS4.CodS1.equals("7")){//Verifica si es la carpeta Seleccionada
            compCod = AS4.CodS1;
            compNom = AS4.NomS1;
            System.out.println("AccessSubCompi--"+compNom +"%%" + compCod);
        }else{
            compNom ="Error";
        }
        return compNom;
    }
    
   //METODO PARA OBTENER LOS ARCHIVOS DE LA CARPETA
    public String ShowAr(){
        con = new ConexionBD(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String msj = "", Sub="";
        int contador = 0;String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        PreparedStatement st = null;
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
                    Sub = datos[3];
                    if(Sub.equals("7")){ //Verificar q venga subc=7
                        if(contador==1){
                            A1 = datos[1];
                            CodSuSu1 = datos[0];
                            NomSuSu1 = A1;
                        }else if(contador==2){
                            A2 = datos[1];
                            CodSuSu2 = datos[0];
                            NomSuSu2 = A2;
                        }else if(contador==3){
                            A3 = datos[1];
                            CodSuSu3 = datos[0];
                            NomSuSu3 = A3;
                        }else if(contador==4){
                            A4 = datos[1];
                            CodSuSu4 = datos[0];
                            NomSuSu4 = A4;
                        }else if(contador==5){
                            A5 = datos[1];
                            CodSuSu5 = datos[0];
                            NomSuSu5 = A5;
                        }else if(contador==6){
                            A6 = datos[1];
                            CodSuSu6 = datos[0];
                            NomSuSu6 = A6;
                        }else if(contador==7){
                            A7 = datos[1];
                            CodSuSu7 = datos[0];
                            NomSuSu7 = A7;
                        }else if(contador==8){
                            A8 = datos[1];
                            CodSuSu8 = datos[0];
                            NomSuSu8 = A8;
                        }else if(contador==9){
                            A9 = datos[1];
                            CodSuSu9 = datos[0];
                            NomSuSu9 = A9;
                        }else if(contador==10){
                            A10 = datos[1];
                            CodSuSu10 = datos[0];
                            NomSuSu10 = A10;
                        }else if(contador==11){
                            A11 = datos[1];
                            CodSuSu11 = datos[0];
                            NomSuSu11 = A11;
                        }else if(contador==12){
                            A12 = datos[1];
                            CodSuSu12 = datos[0];
                            NomSuSu12 = A12;
                        }else if(contador==13){
                            A13 = datos[1];
                            CodSuSu13 = datos[0];
                            NomSuSu13 = A13;
                        }else if(contador==14){
                            A14 = datos[1];
                            CodSuSu14 = datos[0];
                            NomSuSu14 = A14;
                        }else if(contador==15){
                            A15 = datos[1];
                            CodSuSu15 = datos[0];
                            NomSuSu15 = A15;
                        }else if(contador==16){
                            A16 = datos[1];
                            CodSuSu16 = datos[0];
                            NomSuSu16 = A16;
                        }else if(contador==17){
                            A17 = datos[1];
                            CodSuSu17 = datos[0];
                            NomSuSu17 = A17;
                        }else if(contador==18){
                            A18 = datos[1];
                            CodSuSu18 = datos[0];
                            NomSuSu18 = A18;
                        }else if(contador==19){
                            A19 = datos[1];
                            CodSuSu19 = datos[0];
                            NomSuSu19 = A19;
                        }else if(contador==20){
                            A20 = datos[1];
                            CodSuSu20 = datos[0];
                            NomSuSu20 = A20;
                        }
                    }
                    System.out.println("AN4: " + datos[0]+ " "+ datos[1]);
                    contador++;
                }
                System.out.println("////////CONECTADO///////");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return "ventana41.xhtml";
    }
    
}
