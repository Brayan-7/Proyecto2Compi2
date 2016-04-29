/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_fileversion;
import org.apache.thrift.TException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CLASH OF CLANS
 */
public class ConexionImp implements conexion.Iface{   

    @Override
    public String DoLog(String instruccion) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String cuerpoLog ="";
        cuerpoLog = cuerpoLog + instruccion;
        String ruta = "C:\\Users\\CLASH OF CLANS\\Desktop\\Grap\\LogFileServer.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(cuerpoLog);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ConexionImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("------LOG-----");
        System.out.println(">>> " + instruccion);
        System.out.println("--------------");
        return "Sentencia LOG Recibida";
    }

    @Override
    public String DoRepo(String repo) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String resultado;
        System.out.println("------CREAR-----");
        System.out.println(">>> " + repo);
        System.out.println("--------------");
        resultado = "Se creo el repositorio " + repo +"exitosamente";
        return resultado;
    }

    @Override
    public String DelRepor(String repo) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String SWRepo(String repoA, String repoN) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String UpFiles(String instruccion) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Update(String repo) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String UpdateKey(String llave) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String PruebaR(String llaveU, String llaveC) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Prueba3D(String llaveU) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Release3Do(String llaveU) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Release3D(String llaveU) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ReleaseASM(String llaveU) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Release(String llaveU) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
