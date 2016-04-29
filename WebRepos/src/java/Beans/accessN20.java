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
public class accessN20 {
    public access2 A2 =  new access2();
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
    
    public String getRepos1(){    
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

    //****GETTER Y SETTERS
    public void setRepos20(String Repos20) {    
        this.Repos20 = Repos20;
    }

    //*****
    ///METODO PARA VERIFICAR A QUE CARPETA PERTENECE
    public String VerificarSubC() {
        System.out.println("MetodN20-> CodS1: "+A2.CodS1);
        if(A2.CodS1.equals("4")){//Verifica si es la carpeta Seleccionada
            compCod = A2.CodS1;
            compNom = A2.NomS1;
            System.out.println("AccessSubCarpeta1--"+compNom +"%%" + compCod);
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
                    if(Proj.equals("1") && Sub.equals("4")){ //Verificar q venga project=1 y subc=4
                        if(contador==5){
                            Repos1 = datos[1];
                            CodSu1 = datos[0];
                            NomSu1 = Repos1;
                            //System.out.println(">>>Dato1: "+CodSu1);
                        }else if(contador==6){
                            Repos2 = datos[1];
                            CodSu2 = datos[0];
                            NomSu2 = Repos2;
                            //System.out.println("**Dato2: "+CodSu2);
                        }else if(contador==7){
                            Repos3 = datos[1];
                            CodSu3 = datos[0];
                            NomSu3 = Repos3;
                            //System.out.println("**Dato3: "+CodSu3);
                        }else if(contador==8){
                            Repos4 = datos[1];
                            CodSu4 = datos[0];
                            NomSu4 = Repos4;
                            //System.out.println("**Dato4: "+CodSu4);
                        }else if(contador==9){
                            Repos5 = datos[1];
                            CodSu5 = datos[0];
                            NomSu5 = Repos5;
                           // System.out.println("**Dato5: "+CodSu5);
                        }else if(contador==10){
                            Repos6 = datos[1];
                            CodSu6 = datos[0];
                            NomSu6 = Repos6;
                            //System.out.println("**Dato6: "+CodSu6);
                        }else if(contador==11){
                            Repos7 = datos[1];
                            CodSu7 = datos[0];
                            NomSu7 = Repos7;
                            //System.out.println("**Dato7: "+CodSu7);
                        }else if(contador==12){
                            Repos8 = datos[1];
                            CodSu8 = datos[0];
                            NomSu8 = Repos8;
                            System.out.println("Dato8: "+CodSu8);
                        }else if(contador==13){
                            Repos9 = datos[1];
                            CodSu9 = datos[0];
                            NomSu9 = Repos9;
                            System.out.println("Dato9: "+CodSu9);
                        }else if(contador==14){
                            Repos10 = datos[1];
                            CodSu10 = datos[0];
                            NomSu10 = Repos10;
                            System.out.println("Dato10: "+CodSu10);
                        }else if(contador==15){
                            Repos11 = datos[1];
                            CodSu11 = datos[0];
                            NomSu11 = Repos11;
                        }else if(contador==16){
                            Repos12 = datos[1];
                            CodSu12 = datos[0];
                            NomSu12 = Repos12;
                        }else if(contador==17){
                            Repos13 = datos[1];
                            CodSu13 = datos[0];
                            NomSu13 = Repos13;
                        }else if(contador==18){
                            Repos14 = datos[1];
                            CodSu14 = datos[0];
                            NomSu14 = Repos14;
                        }else if(contador==19){
                            Repos15 = datos[1];
                            CodSu15 = datos[0];
                            NomSu15 = Repos15;
                        }else if(contador==20){
                            Repos16 = datos[1];
                            CodSu16 = datos[0];
                            NomSu16 = Repos16;
                        }else if(contador==21){
                            Repos17 = datos[1];
                            CodSu17 = datos[0];
                            NomSu17 = Repos17;
                        }else if(contador==22){
                            Repos18 = datos[1];
                            CodSu18 = datos[0];
                            NomSu18 = Repos18;
                        }else if(contador==23){
                            Repos19 = datos[1];
                            CodSu19 = datos[0];
                            NomSu19 = Repos19;
                        }else if(contador==24){
                            Repos20 = datos[1];
                            CodSu20 = datos[0];
                            NomSu20 = Repos20;
                        }
                    }
                    System.out.println("AN2: " + datos[0]+ " "+ datos[1]);
                    contador++;
                }
                System.out.println("////////CONECTADO///////");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return "ventana21.xhtml";
    }
    
    
    /**
     * Creates a new instance of accessN20
     */
    public accessN20() {
    }
    
}
