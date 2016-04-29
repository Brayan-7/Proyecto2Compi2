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
public class accessN60 {
    public access6 A6 =  new access6();
    public ConexionBD con; //INSTANCIANDO LA CONEXION CON LA BD
    
    //MOSTRAR ARCHIVOS O CARPETAS ASOCIADAS
    public static String Repos1, Repos2, Repos3, Repos4;
    public static String Repos5, Repos6, Repos7, Repos8;
    public static String Repos9, Repos10, Repos11, Repos12;
    public static String Repos13, Repos14, Repos15, Repos16;
    public static String Repos17, Repos18, Repos19, Repos20;
    
    //VARIABLES PARA SABER SI EL CODIGO CORRESPONDE A CIERTA CARPETA
    public static String CodSu1, NomSu1, CodSu2, NomSu2, CodSu3, NomSu3;
    public static String CodSu4, NomSu4, CodSu5, NomSu5, CodSu6, NomSu6;
    public static String CodSu7, NomSu7, CodSu8, NomSu8, CodSu9, NomSu9;
    public static String CodSu10, NomSu10, CodSu11, NomSu11, CodSu12, NomSu12;
    public static String CodSu13, NomSu13, CodSu14, NomSu14, CodSu15, NomSu15;
    public static String CodSu16, NomSu16, CodSu17, NomSu17, CodSu18, NomSu18;
    public static String CodSu19, NomSu19, CodSu20, NomSu20, CodSu21, NomSu21;
    
    //
    String compCod, compNom;

    public static String getRepos1() {
        return Repos1;
    }

    public static void setRepos1(String Repos1) {
        accessN60.Repos1 = Repos1;
    }

    public static String getRepos2() {
        return Repos2;
    }

    public static void setRepos2(String Repos2) {
        accessN60.Repos2 = Repos2;
    }

    public static String getRepos3() {
        return Repos3;
    }

    public static void setRepos3(String Repos3) {
        accessN60.Repos3 = Repos3;
    }

    public static String getRepos4() {
        return Repos4;
    }

    public static void setRepos4(String Repos4) {
        accessN60.Repos4 = Repos4;
    }

    public static String getRepos5() {
        return Repos5;
    }

    public static void setRepos5(String Repos5) {
        accessN60.Repos5 = Repos5;
    }

    public static String getRepos6() {
        return Repos6;
    }

    public static void setRepos6(String Repos6) {
        accessN60.Repos6 = Repos6;
    }

    public static String getRepos7() {
        return Repos7;
    }

    public static void setRepos7(String Repos7) {
        accessN60.Repos7 = Repos7;
    }

    public static String getRepos8() {
        return Repos8;
    }

    public static void setRepos8(String Repos8) {
        accessN60.Repos8 = Repos8;
    }

    public static String getRepos9() {
        return Repos9;
    }

    public static void setRepos9(String Repos9) {
        accessN60.Repos9 = Repos9;
    }

    public static String getRepos10() {
        return Repos10;
    }

    public static void setRepos10(String Repos10) {
        accessN60.Repos10 = Repos10;
    }

    public static String getRepos11() {
        return Repos11;
    }

    public static void setRepos11(String Repos11) {
        accessN60.Repos11 = Repos11;
    }

    public static String getRepos12() {
        return Repos12;
    }

    public static void setRepos12(String Repos12) {
        accessN60.Repos12 = Repos12;
    }

    public static String getRepos13() {
        return Repos13;
    }

    public static void setRepos13(String Repos13) {
        accessN60.Repos13 = Repos13;
    }

    public static String getRepos14() {
        return Repos14;
    }

    public static void setRepos14(String Repos14) {
        accessN60.Repos14 = Repos14;
    }

    public static String getRepos15() {
        return Repos15;
    }

    public static void setRepos15(String Repos15) {
        accessN60.Repos15 = Repos15;
    }

    public static String getRepos16() {
        return Repos16;
    }

    public static void setRepos16(String Repos16) {
        accessN60.Repos16 = Repos16;
    }

    public static String getRepos17() {
        return Repos17;
    }

    public static void setRepos17(String Repos17) {
        accessN60.Repos17 = Repos17;
    }

    public static String getRepos18() {
        return Repos18;
    }

    public static void setRepos18(String Repos18) {
        accessN60.Repos18 = Repos18;
    }

    public static String getRepos19() {
        return Repos19;
    }

    public static void setRepos19(String Repos19) {
        accessN60.Repos19 = Repos19;
    }

    public static String getRepos20() {
        return Repos20;
    }

    public static void setRepos20(String Repos20) {
        accessN60.Repos20 = Repos20;
    }

    
    
    
    /**
     * Creates a new instance of accessN60
     */
    public accessN60() {
    }
    
    ///METODO PARA VERIFICAR A QUE CARPETA PERTENECE
    public String VerificarSubC() {
        System.out.println("MetodN60-> CodS1: "+A6.CodS1);
        if(A6.CodS1.equals("4")){//Verifica si es la carpeta Seleccionada
            compCod = A6.CodS1;
            compNom = A6.NomS1;
            System.out.println("AccessSubCarpeta1V6--"+compNom +"%%" + compCod);
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
                    if(Proj.equals("6") && Sub.equals("14")){ //Verificar q venga project=6 y subc=14
                        if(contador==6){
                            Repos1 = datos[1];
                            CodSu1 = datos[0];
                            NomSu1 = Repos1;
                        }else if(contador==7){
                            Repos2 = datos[1];
                            CodSu2 = datos[0];
                            NomSu2 = Repos2;
                        }else if(contador==8){
                            Repos3 = datos[1];
                            CodSu3 = datos[0];
                            NomSu3 = Repos3;
                        }else if(contador==9){
                            Repos4 = datos[1];
                            CodSu4 = datos[0];
                            NomSu4 = Repos4;
                            //System.out.println("**Dato4: "+CodSu4);
                        }else if(contador==10){
                            Repos5 = datos[1];
                            CodSu5 = datos[0];
                            NomSu5 = Repos5;
                           // System.out.println("**Dato5: "+CodSu5);
                        }else if(contador==11){
                            Repos6 = datos[1];
                            CodSu6 = datos[0];
                            NomSu6 = Repos6;
                            //System.out.println("**Dato6: "+CodSu6);
                        }else if(contador==12){
                            Repos7 = datos[1];
                            CodSu7 = datos[0];
                            NomSu7 = Repos7;
                            //System.out.println("**Dato7: "+CodSu7);
                        }else if(contador==13){
                            Repos8 = datos[1];
                            CodSu8 = datos[0];
                            NomSu8 = Repos8;
                            //System.out.println("Dato8: "+CodSu8);
                        }else if(contador==14){
                            Repos9 = datos[1];
                            CodSu9 = datos[0];
                            NomSu9 = Repos9;
                            //System.out.println("Dato9: "+CodSu9);
                        }else if(contador==15){
                            Repos10 = datos[1];
                            CodSu10 = datos[0];
                            NomSu10 = Repos10;
                            //System.out.println("Dato10: "+CodSu10);
                        }else if(contador==16){
                            Repos11 = datos[1];
                            CodSu11 = datos[0];
                            NomSu11 = Repos11;
                        }else if(contador==17){
                            Repos12 = datos[1];
                            CodSu12 = datos[0];
                            NomSu12 = Repos12;
                        }else if(contador==18){
                            Repos13 = datos[1];
                            CodSu13 = datos[0];
                            NomSu13 = Repos13;
                        }else if(contador==19){
                            Repos14 = datos[1];
                            CodSu14 = datos[0];
                            NomSu14 = Repos14;
                        }else if(contador==20){
                            Repos15 = datos[1];
                            CodSu15 = datos[0];
                            NomSu15 = Repos15;
                        }else if(contador==21){
                            Repos16 = datos[1];
                            CodSu16 = datos[0];
                            NomSu16 = Repos16;
                        }else if(contador==22){
                            Repos17 = datos[1];
                            CodSu17 = datos[0];
                            NomSu17 = Repos17;
                        }else if(contador==23){
                            Repos18 = datos[1];
                            CodSu18 = datos[0];
                            NomSu18 = Repos18;
                        }else if(contador==24){
                            Repos19 = datos[1];
                            CodSu19 = datos[0];
                            NomSu19 = Repos19;
                        }else if(contador==25){
                            Repos20 = datos[1];
                            CodSu20 = datos[0];
                            NomSu20 = Repos20;
                        }
                    }
                    System.out.println("AN60: " + datos[0]+ " "+ datos[1]);
                    contador++;
                }
                System.out.println("////////CONECTADO///////");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return "ventana6.xhtml";
    }
    
}
