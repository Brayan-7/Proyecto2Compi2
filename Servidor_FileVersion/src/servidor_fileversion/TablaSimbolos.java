/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_fileversion;

import java.util.Hashtable;


/**
 *
 * @author brayan7
 */
public class TablaSimbolos {
    private Hashtable<String, Propiedades> TSimb = new Hashtable<String, Propiedades>();
    
    public void GuardarDato(String dato){
        //**VERIFICAR SI EXISTE EL DATO EN LA TABLA HASH
        if(TSimb.containsKey(dato)){
            System.out.println("Dato ya existente");
        }else{
            //SINO EXISTE EL DATO LO INGRESA EN LA TABLA
            
        }
    }
}
