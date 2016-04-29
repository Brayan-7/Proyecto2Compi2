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
 * @author Brayan Escobedo
 */
@ManagedBean
@RequestScoped
public class access {
    //VARIABLES PARA GUARDAR LOS DATOS DE LA BD
    public String Repos1;    public String Repos2;    public String Repos3;    public String Repos4;
    public String Repos5;    public String Repos6;    public String Repos7;    public String Repos8;
    public String Repos9;    public String Repos10;    public String Repos11;    public String Repos12;
    public String Repos13;    public String Repos14;    public String Repos15;    public String Repos16;
    public String Repos17;    public String Repos18;  public String Repos19;
    
    //public static String AC1, AC2, AC3, AC4, AC5, AC6, AC7, AC8, AC9, AC10; 
    
    public ConexionBD con;
    
    //VARIABLES PARA SABER SI CODIGO DE PROYECTO PERTENECE CADA LINK
    public static String SubCod1, SubNom1;    public static String SubCod2, SubNom2;
    public static String SubCod3, SubNom3;    public static String SubCod4, SubNom4;
    public static String SubCod5, SubNom5;    public static String SubCod6, SubNom6;
    public static String SubCod7, SubNom7;    public static String SubCod8, SubNom8;
    public static String SubCod9, SubNom9;    public static String SubCod10, SubNom10;
    public static String SubCod11, SubNom11;    public static String SubCod12, SubNom12;
    public static String SubCod13, SubNom13;    public static String SubCod14, SubNom14;
    public static String SubCod15, SubNom15;    public static String SubCod16, SubNom16;
    public static String SubCod17, SubNom17;    public static String SubCod18, SubNom18;

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
    //*******
    
    //METODO #1
    public String ObRepo() {
        con = new ConexionBD(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String msj = "";
        int contador = 0;String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        PreparedStatement st = null;
        if (cn == null) {
            //JOptionPane.showMessageDialog(null, "EEROR AL CONECTAR AL BD");
            msj = "ERROR AL CONECTAR A LA BD";
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        } else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Proyecto");
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    if(contador==0){
                        Repos1 = datos[1];
                        SubCod1 = datos[0];
                        SubNom1 = Repos1;
                    }else if(contador==1){
                        Repos2 = datos[1];
                        SubCod2 = datos[0];
                        SubNom2 = Repos2;
                    }else if(contador==2){
                        Repos3 = datos[1];
                        SubCod3 = datos[0];
                        SubNom3 = Repos3;
                    }else if(contador==4){
                        Repos4 = datos[1];
                        SubCod4 = datos[0];
                        SubNom4 = Repos4;
                    }else if(contador==5){
                        Repos5 = datos[1];
                        SubCod5 = datos[0];
                        SubNom5 = Repos5;
                    }else if(contador==6){
                        Repos6 = datos[1];
                        SubCod6 = datos[0];
                        SubNom6 = Repos6;
                    }else if(contador==7){
                        Repos7 = datos[1];
                        SubCod7 = datos[0];
                        SubNom7 = Repos7;
                    }else if(contador==8){
                        Repos8 = datos[1];
                        SubCod8 = datos[0];
                        SubNom8 = Repos8;
                    }else if(contador==9){
                        Repos9 = datos[1];
                        SubCod9 = datos[0];
                        SubNom9 = Repos9;
                    }else if(contador==10){
                        Repos10 = datos[1];
                        SubCod10 = datos[0];
                        SubNom10 = Repos10;
                    }else if(contador==11){
                        Repos11 = datos[1];
                        SubCod11 = datos[0];
                        SubNom11 = Repos11;
                    }else if(contador==12){
                        Repos12 = datos[1];
                        SubCod12 = datos[0];
                        SubNom12 = Repos12;
                    }else if(contador==13){
                        Repos13 = datos[1];
                        SubCod13 = datos[0];
                        SubNom13 = Repos13;
                    }else if(contador==14){
                        Repos14 = datos[1];
                        SubCod14 = datos[0];
                        SubNom14 = Repos14;
                    }else if(contador==15){
                        Repos15 = datos[1];
                        SubCod15 = datos[0];
                        SubNom15 = Repos15;
                    }else if(contador==16){
                        Repos16 = datos[1];
                        SubCod16 = datos[0];
                        SubNom16 = Repos16;
                    }else if(contador==17){
                        Repos17 = datos[1];
                        SubCod17 = datos[0];
                        SubNom17 = Repos17;
                    }else if(contador==18){
                        Repos18 = datos[1];
                        SubCod18 = datos[0];
                        SubNom18 = Repos18;
                    }
                    System.out.println("%%%%%" + datos[0]+ " "+ datos[1]);
                    contador++;
                }
                System.out.println("???? "+SubCod1 +"-"+SubNom1);
                System.out.println("¿¿¿¿ "+SubCod2 +"-"+SubNom2);
                System.out.println("++++ "+SubCod3 +"-"+SubNom3);
//                if (Usuario.equalsIgnoreCase(datos[7]) && this.Pass.equalsIgnoreCase(datos[6])) {
//                    msj = "Bienvenido.xhtml";
//                }else{
//                    msj = "ErrorL.xhtml";
//                }
                System.out.println("////////CONECTADO///////");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "index.xhtml";
    }
    
    //METODO #2
    public String Creates(){
        String repo="ventana2.xhtml";
        return repo;
    } 

    /**
     * Creates a new instance of access
     */
    public access() {
    }

}
