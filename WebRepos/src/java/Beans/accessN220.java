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
public class accessN220 {
    public accessN20 AN2 =  new accessN20();
    public ConexionBD con; //INSTANCIANDO LA CONEXION CON LA BD
    
    //MOSTRAR ARCHIVOS O CARPETAS ASOCIADAS
    public String Repos1, Repos2, Repos3, Repos4;
    public String Repos5, Repos6, Repos7, Repos8;
    public String Repos9, Repos10, Repos11, Repos12;
    public String Repos13, Repos14, Repos15, Repos16;
    public String Repos17, Repos18, Repos19, Repos20;
    
    //VARIABLES PARA SABER SI EL CODIGO CORRESPONDE A CIERTA CARPETA
    public static String CodSuSu1, NomSuSu1, CodSuSu2, NomSuSu2, CodSuSu3, NomSuSu3;
    public static String CodSuSu4, NomSuSu4, CodSuSu5, NomSuSu5, CodSuSu6, NomSuSu6;
    public static String CodSuSu7, NomSuSu7, CodSuSu8, NomSuSu8, CodSuSu9, NomSuSu9;
    public static String CodSuSu10, NomSuSu10, CodSuSu11, NomSuSu11, CodSuSu12, NomSuSu12;
    public static String CodSuSu13, NomSuSu13, CodSuSu14, NomSuSu14, CodSuSu15, NomSuSu15;
    public static String CodSuSu16, NomSuSu16, CodSuSu17, NomSuSu17, CodSuSu18, NomSuSu18;
    public static String CodSuSu19, NomSuSu19, CodSuSu20, NomSuSu20, CodSuSu21, NomSuSu21;
    
    String compCod, compNom;
    //**

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
    
    //**

    /**
     * Creates a new instance of accessN220
     */
    public accessN220() {
    }
    
    ///METODO PARA VERIFICAR A QUE CARPETA PERTENECE
    public String VerificarSubC() {
        System.out.println("MetodN220-> CodSu1: "+AN2.CodSu1);
        if(AN2.CodSu1.equals("8")){//Verifica si es la carpeta Seleccionada
            compCod = AN2.CodSu1;
            compNom = AN2.NomSu1;
            System.out.println("AccessSubCarpeta2--"+compNom +"%%" + compCod);
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
                        if(contador==9){
                            Repos1 = datos[1];
                            CodSuSu1 = datos[0];
                            NomSuSu1 = Repos1;
                            //System.out.println("Valor>>> "+CodSuSu1);
                        }else if(contador==10){
                            Repos2 = datos[1];
                            CodSuSu2 = datos[0];
                            NomSuSu2 = Repos2;
                        }else if(contador==11){
                            Repos3 = datos[1];
                            CodSuSu3 = datos[0];
                            NomSuSu3 = Repos3;
                        }else if(contador==12){
                            Repos4 = datos[1];
                            CodSuSu4 = datos[0];
                            NomSuSu4 = Repos4;
                        }else if(contador==13){
                            Repos5 = datos[1];
                            CodSuSu5 = datos[0];
                            NomSuSu5 = Repos5;
                        }else if(contador==14){
                            Repos6 = datos[1];
                            CodSuSu6 = datos[0];
                            NomSuSu6 = Repos6;
                        }else if(contador==15){
                            Repos7 = datos[1];
                            CodSuSu7 = datos[0];
                            NomSuSu7 = Repos7;
                        }else if(contador==16){
                            Repos8 = datos[1];
                            CodSuSu8 = datos[0];
                            NomSuSu8 = Repos8;
                        }else if(contador==17){
                            Repos9 = datos[1];
                            CodSuSu9 = datos[0];
                            NomSuSu9 = Repos9;
                        }else if(contador==18){
                            Repos10 = datos[1];
                            CodSuSu10 = datos[0];
                            NomSuSu10 = Repos10;
                        }else if(contador==19){
                            Repos11 = datos[1];
                            CodSuSu11 = datos[0];
                            NomSuSu11 = Repos11;
                        }else if(contador==20){
                            Repos12 = datos[1];
                            CodSuSu12 = datos[0];
                            NomSuSu12 = Repos12;
                        }else if(contador==21){
                            Repos13 = datos[1];
                            CodSuSu13 = datos[0];
                            NomSuSu13 = Repos13;
                        }else if(contador==22){
                            Repos14 = datos[1];
                            CodSuSu14 = datos[0];
                            NomSuSu14 = Repos14;
                        }else if(contador==23){
                            Repos15 = datos[1];
                            CodSuSu15 = datos[0];
                            NomSuSu15 = Repos15;
                        }else if(contador==24){
                            Repos16 = datos[1];
                            CodSuSu16 = datos[0];
                            NomSuSu16 = Repos16;
                        }else if(contador==25){
                            Repos17 = datos[1];
                            CodSuSu17 = datos[0];
                            NomSuSu17 = Repos17;
                        }else if(contador==26){
                            Repos18 = datos[1];
                            CodSuSu18 = datos[0];
                            NomSuSu18 = Repos18;
                        }else if(contador==27){
                            Repos19 = datos[1];
                            CodSuSu19 = datos[0];
                            NomSuSu19 = Repos19;
                        }else if(contador==28){
                            Repos20 = datos[1];
                            CodSuSu20 = datos[0];
                            NomSuSu20 = Repos20;
                        }
                    }
                    System.out.println("AN220: " + datos[0]+ " "+ datos[1]);
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
