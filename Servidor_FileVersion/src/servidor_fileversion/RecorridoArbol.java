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
        }
    } 
    
}
