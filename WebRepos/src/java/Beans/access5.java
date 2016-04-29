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
public class access5 {
    access A1 = new access();
    public ConexionBD con;
    
    //VARIABLES PARA SABER SI EL CODIGO CORRESPONDE A CIERTA CARPETA
    public static String CodS1, NomS1, CodS2, NomS2, CodS3, NomS3;
    public static String CodS4, NomS4, CodS5, NomS5, CodS6, NomS6;
    public static String CodS7, NomS7, CodS8, NomS8, CodS9, NomS9;
    public static String CodS10, NomS10, CodS11, NomS11, CodS12, NomS12;
    public static String CodS13, NomS13, CodS14, NomS14, CodS15, NomS15;
    public static String CodS16, NomS16, CodS17, NomS17, CodS18, NomS18, CodS19, NomS19;
    public static String CodS20, NomS20;
    
    //VARIABLES PARA GUARDAR LOS DATOS DE LA BD
    public String Repos1, Repos2, Repos3, Repos4, Repos5;
    public String Repos6, Repos7, Repos8, Repos9, Repos10;
    public String Repos11, Repos12, Repos13, Repos14, Repos15;
    public String Repos16, Repos17, Repos18, Repos19, Repos20;
    
    public static String CodC, NomC;
//******* 

    public String getRepos1() {
        return Repos1;
    }

    public void setRepos1(String Repos1) {
        this.Repos1 = Repos1;
    }

    public String getRepos2() {
        return Repos2;
    }

    public void setRepos2(String Repos2) {
        this.Repos2 = Repos2;
    }

    public String getRepos3() {
        return Repos3;
    }

    public void setRepos3(String Repos3) {
        this.Repos3 = Repos3;
    }

    public String getRepos4() {
        return Repos4;
    }

    public void setRepos4(String Repos4) {
        this.Repos4 = Repos4;
    }

    public String getRepos5() {
        return Repos5;
    }

    public void setRepos5(String Repos5) {
        this.Repos5 = Repos5;
    }

    public String getRepos6() {
        return Repos6;
    }

    public void setRepos6(String Repos6) {
        this.Repos6 = Repos6;
    }

    public String getRepos7() {
        return Repos7;
    }

    public void setRepos7(String Repos7) {
        this.Repos7 = Repos7;
    }

    public String getRepos8() {
        return Repos8;
    }

    public void setRepos8(String Repos8) {
        this.Repos8 = Repos8;
    }

    public String getRepos9() {
        return Repos9;
    }

    public void setRepos9(String Repos9) {
        this.Repos9 = Repos9;
    }

    public String getRepos10() {
        return Repos10;
    }

    public void setRepos10(String Repos10) {
        this.Repos10 = Repos10;
    }

    public String getRepos11() {
        return Repos11;
    }

    public void setRepos11(String Repos11) {
        this.Repos11 = Repos11;
    }

    public String getRepos12() {
        return Repos12;
    }

    public void setRepos12(String Repos12) {
        this.Repos12 = Repos12;
    }

    public String getRepos13() {
        return Repos13;
    }

    public void setRepos13(String Repos13) {
        this.Repos13 = Repos13;
    }

    public String getRepos14() {
        return Repos14;
    }

    public void setRepos14(String Repos14) {
        this.Repos14 = Repos14;
    }

    public String getRepos15() {
        return Repos15;
    }

    public void setRepos15(String Repos15) {
        this.Repos15 = Repos15;
    }

    public String getRepos16() {
        return Repos16;
    }

    public void setRepos16(String Repos16) {
        this.Repos16 = Repos16;
    }

    public String getRepos17() {
        return Repos17;
    }

    public void setRepos17(String Repos17) {
        this.Repos17 = Repos17;
    }

    public String getRepos18() {
        return Repos18;
    }

    public void setRepos18(String Repos18) {
        this.Repos18 = Repos18;
    }

    public String getRepos19() {
        return Repos19;
    }

    public void setRepos19(String Repos19) {
        this.Repos19 = Repos19;
    }

    public String getRepos20() {
        return Repos20;
    }

    public void setRepos20(String Repos20) {
        this.Repos20 = Repos20;
    }

    
    
    ///*****METODO PARA VERIFICAR EL NOMBRE DE LA CARPETA
    public String VerificarSubC(){
        if(A1.SubCod4.equals("5")){//Ver PROYECTO PERTENECIENTE
            CodS2 = A1.SubCod4;
            NomS2 = A1.SubNom4;
            System.out.println("Access5--"+NomS2 +"%%" + CodS2);
        }else{
            NomS2 ="Error";
        }
        return NomS2;
    }
    
    //METODO PARA MOSTRAR LAS CARPETAS DEL PROYECTO PRESENTE
    public String ShowRepos(){
        con = new ConexionBD(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String msj = "", Proj="", Sub="";
        int contador = 0;String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        PreparedStatement st = null;
        if (cn == null) {
            msj = "ERROR AL CONECTAR A LA BD";
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        } else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Carpeta");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3); datos[3] = rs.getString(4);
                    Proj = datos[2]; Sub = datos[3];
                    if(Proj.equals("5") && Sub.equals("1")){
                        if(contador==5){
                            Repos1 = datos[1];
                            CodS1 = datos[0];
                            NomS1 = Repos1;
                            CodC=CodS1; NomC=NomS1;
                        }else if(contador==6){
                            Repos2 = datos[1];
                            CodS2 = datos[0];
                            NomS2 = Repos2;
                        }else if(contador==7){
                            Repos3 = datos[1];
                            CodS3 = datos[0];
                            NomS3 = Repos3;
                        }else if(contador==8){
                            Repos4 = datos[1];
                            CodS4 = datos[0];
                            NomS4 = Repos4;
                        }else if(contador==9){
                            Repos5 = datos[1];
                            CodS5 = datos[0];
                            NomS5 = Repos5;
                        }else if(contador==10){
                            Repos6 = datos[1];
                            CodS6 = datos[0];
                            NomS6 = Repos6;
                        }else if(contador==11){
                            Repos7 = datos[1];
                            CodS7 = datos[0];
                            NomS7 = Repos7;
                        }else if(contador==12){
                            Repos8 = datos[1];
                            CodS8 = datos[0];
                            NomS8 = Repos8;
                        }else if(contador==13){
                            Repos9 = datos[1];
                            CodS9 = datos[0];
                            NomS9 = Repos9;
                        }else if(contador==14){
                            Repos10 = datos[1];
                            CodS10 = datos[0];
                            NomS10 = Repos10;
                        }else if(contador==15){
                            Repos11 = datos[1];
                            CodS11 = datos[0];
                            NomS11 = Repos11;
                        }else if(contador==16){
                            Repos12 = datos[1];
                            CodS12 = datos[0];
                            NomS12 = Repos12;
                        }else if(contador==17){
                            Repos13 = datos[1];
                            CodS13 = datos[0];
                            NomS13 = Repos13;
                        }else if(contador==18){
                            Repos14 = datos[1];
                            CodS14 = datos[0];
                            NomS14 = Repos14;
                        }else if(contador==19){
                            Repos15 = datos[1];
                            CodS15 = datos[0];
                            NomS15 = Repos15;
                        }else if(contador==20){
                            Repos16 = datos[1];
                            CodS16 = datos[0];
                            NomS16 = Repos16;
                        }else if(contador==21){
                            Repos17 = datos[1];
                            CodS17 = datos[0];
                            NomS17 = Repos17;
                        }else if(contador==22){
                            Repos18 = datos[1];
                            CodS18 = datos[0];
                            NomS18 = Repos18;
                        }else if(contador==23){
                            Repos19 = datos[1];
                            CodS19 = datos[0];
                            NomS19 = Repos19;
                        }else if(contador==24){
                            Repos20 = datos[1];
                            CodS20 = datos[0];
                            NomS20 = Repos20;
                        }
                    }
                    System.out.println("A5: " + datos[0]+ " "+ datos[1]);
                    contador++;
                }
                System.out.println("////////CONECTADO///////");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return "ventana5.xhtml";
    }
    
    
    /**
     * Creates a new instance of access5
     */
    public access5() {
    }
    
}
