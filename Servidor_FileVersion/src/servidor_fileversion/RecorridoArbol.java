/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_fileversion;

import java.util.*;
import jjt.*;

/**
 *
 * @author brayan7
 */
public class RecorridoArbol implements phpTreeConstants{
    
    public ArrayList<String> ESema = new ArrayList<>();
    
    public void FillTable (SimpleNode ActNode, String NameAm){
        int NoChildAct = ActNode.jjtGetNumChildren();
        //NodoVariable Outcome = null;
        String EA = phpTreeConstants.jjtNodeName[ActNode.getId()];
        int AuxHijoEvaluar=0;
        int contadorPos=0;
        int contadorTam=0;
        
        //INICIO DEL SWTICH
        switch(ActNode.getId()){
            case JJTPROGRAMAINICIO:
                FillTable((SimpleNode) ActNode.children[0], "-----");
                break;
            case JJTCUERPOPROGRAMA:
                //
                break;
            case JJTMINCLUDE:
                String rutaInclude = ((SimpleNode) ActNode.children[0]).Nombre;
                Readfile(rutaInclude);
                break;
            case JJTMETODOMAIN:
            case JJTCLASE:
                String ClaseN = ((SimpleNode) ActNode.children[0]).Nombre;
                if(NoChildAct > 1){
                }
                break;
            case JJTCONSTRUCTOR:
            case JJTCUERPOCLASE:
            case JJTCVARIABLES:
            case JJTASIGNACIONVAR:
            case JJTDECFUNCTION:
            case JJTCUERPOMATRIZ:
            case JJTPARAMETROSFOR:
            case JJTCUERPOFOR:
            case JJTCUERPOVECFOR:
            case JJTASIGNARMATVECT:
            case JJTIMPRIMIR:
            case JJTOPERACIONESARIT1:
            case JJTPARAMETROSFUCTION:
            case JJTCUERPOCONSTRUCTOR:
            case JJTMETPARENT:
            case JJTMETTHIS:
            case JJTPARAMETROSIF:
            case JJTSENTENCIASIF:
            case JJTCUERPOIF:
            case JJTIMPRIMIR2:
            case JJTCUERPOWH:
            case JJTCUERPOFOR2:
            case JJTPARAMETROSMAIN:
        }
    } 
    
    public void Readfile(String Archivo){
    }
    
}
