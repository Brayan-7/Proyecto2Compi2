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
    public VentanaFileVersion VFV = new VentanaFileVersion();
    BDConexion con = new BDConexion();

    @Override
    public String DoLog(String instruccion) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String cuerpoLog ="";
        cuerpoLog = cuerpoLog + instruccion +"\n";
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
        return "Sentencia LOG Recibida y almacenada";
    }

    @Override
    public String DoRepo(String repo) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String resultado;
        System.out.println("------CREANDO-----");
        System.out.println(">>> " + repo);
        System.out.println("--------------");
        ///SE CREA LA CARPETA EN EL SERVIDOR
        File folder1 = new File("A:\\FileVersionServer\\"+repo);
        folder1.mkdir();
        ///SE INGRESARA EL REPOSITORIO A LA BASE DE DATOS
        VFV.InsertarDB1(repo);
        System.out.println("Repositorio Creado..");
        resultado = "Se creo el repositorio " + repo +"exitosamente, cuya clate es: "+VFV.LlaveU;
        System.out.println(resultado);
        return resultado;
    }

    @Override
    public String DelRepo(String repo) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String rrepoD="", Resultado="";
        //ELIMINANDO LA CARPETA RESPECTIVA AL REPOSITORIO
        VFV.EliminarF(repo);
        //ELIMINANDO EL REPOSITORIO DE LA BD
        VFV.EliminarR(repo);
        System.out.println("Repositorio Eliminado..");
        Resultado = "El repositorio " + repo +"se elimino exitosamente";
        System.out.println(Resultado);
        return Resultado;
    }

    @Override
    public String SWRepo(String repoA, String repoN) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String Resultado="";
        //METODO PARA VERIFICAR SI EXISTE EL REPO EN LA BD Y ENVIO
        VFV.SwitchR(repoN, repoA);
        System.out.println("Repositorio Enviado SW..");
        Resultado = "El repositorio " + repoA +"Existe, Repositorio Enviado";
        System.out.println(Resultado);
        return Resultado;
    }

    @Override
    public String UpFiles(int Llave, String instr, String NomArch, String SubCarp, String Conten, String Proyecto, String SubCarp2) throws TException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String Resultado = "";
        //Verificar que exita el repositorio y sus carpetas
        VFV.ComprobarCarpeta(SubCarp,SubCarp2,Proyecto);
        //Insertar archivos a la tabla
        VFV.InsertFile(NomArch,Conten);
        //Realizacion de los datos a la tabla commit
        VFV.InsertComm(Llave,Conten);
        System.out.println("Se logro hacer el commmit de Repositorio" + Proyecto);
        Resultado = "Se logro hacer el commmit de Repositorio" + Proyecto;
        System.out.println(Resultado);
        return Resultado;
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
