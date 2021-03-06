/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_fileversion;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author CLASH OF CLANS
 */
public class VentanaFileVersion extends javax.swing.JFrame {
    BDConexion con = new BDConexion();
    public static String LlaveU,PKFolder1,PKFolder2,PKProject,PKFile,PKKey;
    
    /**
     * Creates new form VentanaFileVersion
     */
    public VentanaFileVersion() {
        initComponents();
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConectServer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor FileVersion");

        ConectServer.setText("Conectar Servidor");
        ConectServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectServerActionPerformed(evt);
            }
        });

        jButton2.setText("SELECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConectServer)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton2)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConectServer)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectServerActionPerformed
        CarpetaPrincipal();
        RealizarConexion();
    }//GEN-LAST:event_ConectServerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //ConsultaDB1("Datos1");
        //InsertarDB1("Datos2");
        //ConsultaLlave("<?php echo(\"Palabra\");?>");
        //EliminarR("<?php echo(\"Cliente C# Repositorio: ProyectoWrite5()\");?>");        
        //SwitchR("2", "<?php echo(\"Palabra\");?>");
        //ArchivosEnCarpeta();
        //InsertComm(6, "<?php echo(\"Palabra\"); if($file){}?>");
        String ValorAsigF2="";
            float variableL2 = Float.parseFloat(ValorAsigF2);
        System.out.println("----"+variableL2);
    }//GEN-LAST:event_jButton2ActionPerformed

    //**CONEXIÓN CON ENTRE JAVA Y C# CON APACHE THRIFT
    public void RealizarConexion(){
        try {
            TServerSocket ST = new TServerSocket(8885);
            conexion.Processor pro = new conexion.Processor(new ConexionImp());
            TServer S = new TThreadPoolServer(new TThreadPoolServer.Args(ST).processor(pro));
            System.out.println("Starting server on port 8885...");
            S.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
    
    //***CREAR CARPETA PRINCIPAL DEL REPOSITORIO
    public void CarpetaPrincipal(){
        File folder = new File("/home/brayan7/NetBeansProjects/Servidor_FileVersion/FileVersionServer");
        folder.mkdir();
        System.out.println("Carpeta Creada!!");
    }
    
    //***ELIMINAR CARPETA DEL REPOSITORIO
    public void EliminarF(String carpeta){
        deleteWC("/home/brayan7/NetBeansProjects/Servidor_FileVersion/"+carpeta);
        System.out.println("Carpeta Eliminada Correctamente");
    }
    
    //---------METOOD PARA ELIMINAR UNA CARPETA DEL SERVIDOR
    public boolean deleteWC(String path){
        File file = new File(path);
        if(!file.exists()){
            return true;
        }
        if(!file.isDirectory()){
            return file.delete();
        }
        return this.deleteC(file) & file.delete();
    }
    
    private boolean deleteC(File dir){
        File[] children = dir.listFiles();
        boolean childrenDeleted = true;
        for(int i=0; children !=null && i<children.length; i++){
            File child = children[i];
            if(child.isDirectory()){
                childrenDeleted = this.deleteC(child) && childrenDeleted;
            }
            if(child.exists()){
                childrenDeleted = child.delete() && childrenDeleted;
            }
            
        }
        return childrenDeleted;
    }
    //---------
    
    //***CONSULTA A LA BASE DE DATOS POR MEDIO DE LA APP
    public void ConsultaDB1(String Repo){
        con = new BDConexion(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String[] datos = new String[8];
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            System.out.println(">>>Exito en la BD");
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Proyecto");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    System.out.println("D1>> "+datos[0]+" D2>> "+datos[1]);
                }
                System.out.println("++++++++++CONECTADO+++++++++");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
    }
    
    //***CONSULTA A LA BASE DE DATOS PARA OBTENER LA LLAVE PRIMARIA DE LA TABLA PROYECTO
    public String ConsultaLlave(String Repo){
        con = new BDConexion(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String[] datos = new String[8]; String Valor="";
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Proyecto WHERE Nombre ='"+ Repo+"'");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    Valor = datos[0];
                    //System.out.println("D1>> "+datos[0]+" D2>> "+datos[1]);
                    System.out.println(Valor);
                }
                System.out.println("++++++++++CONECTADO MetodoConsultaLlave+++++++++");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
        return Valor;
    }
    
    //*****INSERTAR DATOS A LA BASE DE DATOS A LA TABLA PROYECTO
    public void InsertarDB1(String Repo){
        con = new BDConexion();
        PreparedStatement st =null;
        Connection cn = con.conexion();
        if (cn==null) {
            System.out.println("EEROR AL CONECTAR AL BD!!!!!!!");
        } else {
            try {
                st = cn.prepareStatement("INSERT INTO Proyecto (Nombre) values(?);");
                st.setString(1, Repo );
                //st.setString(2,"<?php echo(\""+Repo+"\");?>" );
                st.executeUpdate();
                LlaveU = ConsultaLlave(Repo);
                System.out.println(LlaveU);
                System.out.println("Exito en el INSERT del repositorio: "+Repo);
            } catch (Exception e) {
                System.out.println("*********" + e.getMessage());
                e.printStackTrace();
            } finally{
                try {
                    st.close();
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("////////TODO BIEN///////");
        }
    }
    
    //****BORRAR DATOS DE LA BASE DE DATOS DE LA TABLA PROYECTO
    public void EliminarR(String Repo){
        con = new BDConexion();
        PreparedStatement st =null;
        Connection cn = con.conexion();
        if (cn==null) {
            System.out.println("EEROR AL CONECTAR AL BD!!!!!!!");
        } else {
            try {
                st = cn.prepareStatement("DELETE FROM ArchivoPhp WHERE Contenido =?");
                st.setString(1,Repo);
                //st.setString(2,"<?php echo(\""+Repo+"\");?>" );
                st.execute();
                System.out.println("Se Borro del repositorio: "+Repo);
            } catch (Exception e) {
                System.out.println("*********" + e.getMessage());
                e.printStackTrace();
            } finally{
                try {
                    st.close();
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("////////TODO BIEN///////");
        }
    }
    
    //*****CONSULTA A LA BASE DE DATOS PARA VERIFICAR SI EXISTE EL REPOSITORIO
    public void SwitchR(String llave, String Repo){
        con = new BDConexion(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String[] datos = new String[8]; String Valor1="", Valor2="";
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM ArchivoPhp WHERE Contenido ='"+ Repo+"' AND IdArchivo="+llave);
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    Valor1 = datos[0];
                    Valor2 = datos[1];
                    //System.out.println("D1>> "+datos[0]+" D2>> "+datos[1]);
                }
                if(Valor1.equals(llave) && Valor2.equals(Repo)){
                        System.out.println("El repositorio existente Enviandolo..");
                        System.out.println(Valor1 +" >> "+Valor2);
                        //metodo enviar repo al cliente
                    }else{
                        System.out.println("El repositorio NO existe");
                    }
                System.out.println("++++++++++CONECTADO MetodoSW+++++++++");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
    }
    
    public void VerificarCarpeta(){
        String directori ="/home/brayan7/NetBeansProjects/Servidor_FileVersion/Server"; ///Proyecto2
        File f = new File(directori);
        String archivos;
        if(f.exists()){
            File[] ficheros = f.listFiles();
            for(int x=0; x<ficheros.length; x++){
                System.out.println(ficheros[x].getName());
                if(ficheros[x].isFile()){
                    archivos = ficheros[x].getName();
                    System.out.println(">> " +archivos);
                }
            }
        }else{
            System.out.println("No existe ruta");
        }
    }
    
    public void ArchivosEnCarpeta(){
        //String dir1 = System.getProperty("/home/brayan7/NetBeansProjects/Servidor_FileVersion/Server");
        String dir1 =  "/home/brayan7/NetBeansProjects/Servidor_FileVersion/Server";
        File dir = new File(dir1);
        System.out.println(">> Archvios en la CArpeta: " + dir.getPath()+":");
        String[] ficheros = dir.list();
        if(ficheros == null){
            System.out.println("No hay ficheros en el direct");
        }else{
            for(int x=0; x<ficheros.length;x++){
                System.out.println(ficheros[x]);
            }
        }
        System.out.println("***Recursivo:");
        System.out.println("-->Archivos en la carpeta" + dir.getPath());
        ListarDirectorio(dir, "");
    }
    
    public void ListarDirectorio(File f,String separador){
        File[] ficheros = f.listFiles();
        for (int x = 0; x < ficheros.length; x++) {
            System.out.println(separador + ficheros[x].getName());
            if(ficheros[x].isDirectory()){
                String nuevo_se;
                nuevo_se = separador + "";
                ListarDirectorio(ficheros[x], nuevo_se);
            }
        }
    }
    
    //******COMPROBAR SI EXISTE LA CARPETA ANTES DE REALIZAR UN COMMIT
    public void ComprobarCarpeta(String Folder1, String Folder2, String Repo){
        con = new BDConexion(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String[] datos = new String[8]; 
        PreparedStatement pt1 =null; PreparedStatement pt2 =null;
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                //**VERIFICAR QUE EXISTA LA SUBCARPETA1
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Carpeta WHERE Nombre ='"+ Folder1+"'");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    PKFolder1 = datos[0];
                }
                //SI LA SUBCARPETA1 NO EXISTE, VERIFICAR QUE EXISTA LA SUBCARPETA2
                Statement st2 = cn.createStatement();
                ResultSet rs1 = st2.executeQuery("SELECT * FROM Carpeta WHERE Nombre='"+Folder2+"'");
                while(rs1.next()){
                    datos[0] = rs1.getString(1); datos[1] = rs1.getString(2);
                    PKFolder2 = datos[0];
                }
                //**VERIFICAR QUE EXISTA EL PROYECTO
                Statement st3 = cn.createStatement();
                ResultSet rs2 = st3.executeQuery("SELECT * FROM Proyecto WHERE Nombre='"+Repo+"'");
                while(rs2.next()){
                    datos[0]= rs2.getString(1); datos[1]= rs2.getString(2);
                    PKProject = datos[0];
                }
                if(PKProject != null){
                    if(PKFolder1 == null ){
                        if(PKFolder2 == null){
//                            pt1 = cn.prepareStatement("INSERT INTO Carpeta (IdProyecto,Nombre,Subcarpeta) values(?,?,?);");
//                            pt1.setString(1, PKProject);
//                            pt1.setString(2, Folder2);
//                            pt1.setString(3, PKProject);
//                            pt1.executeUpdate();
                            System.out.println("Subcarpeta2 Insertada!!");
                        }else{
                            System.out.println("Subcarpeta2 Existe**");
                        }
//                        pt2 = cn.prepareStatement("INSERT INTO Carpeta (IdProyecto,Nombre,Subcarpeta) values(?,?,?);");
//                        pt2.setString(1, PKProject);
//                        pt2.setString(2, Folder2);
//                        pt2.setString(3, PKFolder2);
//                        pt2.executeUpdate();
                        System.out.println("Subcarpeta1 Insertada!!");
                    }else{
                        System.out.println("Subcarpeta1 Existe**");
                    }                    
                }else{
                    System.out.println("No exite el proyecto");
                }
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
    }
    
    //********INSERTAR ARCHIVO NUEVO DEL COMMIT HECHO
    public void InsertFile(String file, String Contenido){
        con = new BDConexion();
        PreparedStatement st =null;
        Connection cn = con.conexion();
        if (cn==null) {
            System.out.println("EEROR AL CONECTAR AL BD!!!!!!!");
        } else {
            try {
                st = cn.prepareStatement("INSERT INTO Archivo (Nombre, Contenido, IdCarpeta) values(?,?,?);");
                st.setString(1, file);
                st.setString(2, Contenido);
                st.setString(3, PKFolder1);
                st.executeUpdate();
                System.out.println("Exito en el INSERTAR el archivo: "+file);
            } catch (Exception e) {
                System.out.println("*********" + e.getMessage());
                e.printStackTrace();
            } finally{
                try {
                    st.close();
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("////////TODO BIEN///////");
        }
    }
    
    //********INSERTAR DATOS A LA TABAL COMMIT
    public void InsertComm(int key, String conte){
        con = new BDConexion();
        PreparedStatement st =null;
        String[] datos = new String[8]; 
        Connection cn = con.conexion();
        if (cn==null) {
            System.out.println("EEROR AL CONECTAR AL BD!!!!!!!");
        } else {
            try {
                //BUSCAR EL ID DEL ARCHIVO NUEVO
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Archivo WHERE Contenido ='"+ conte+"'");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    PKFile = datos[0];
                }
                //
                st = cn.prepareStatement("INSERT INTO Commit( LlaveCommit, Fecha, Contenido, IdArchivo ) VALUES (?,?,?,?);");
                st.setString(1, String.valueOf(key));
                st.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
                st.setString(3, conte);
                st.setString(4, PKFile);
                st.executeUpdate();
                System.out.println("Exito al INSERTAR el commit: "+key);
            } catch (Exception e) {
                System.out.println("*********" + e.getMessage());
                e.printStackTrace();
            } finally{
                try {
                    st.close();
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("////////TODO BIEN >> InsertarCommit///////");
        }
    }
    
    public static String Namekey="";
    //********VERIFICAR SI EXISTE EL COMMIT SOLICITADO EN LA BD
    public void BuscarComm(String key){
        con = new BDConexion(); //INSTANCIAMOS LA CLASE QUE CONTIENE LA CONEXIÒN
        String[] datos = new String[8]; 
        Connection cn = con.conexion(); //LLAMAMOS AL METODO PARA CONECTARNOS A LA BD
        if (cn == null) {
            System.out.println("*********ERROR AL CONECTAR A LA BD");
        }else {
            try {
                Statement st1 = cn.createStatement();
                ResultSet rs = st1.executeQuery("SELECT * FROM Commit WHERE LlaveCommit ="+ key+"");
                while (rs.next()) {
                    datos[0] = rs.getString(1); datos[1] = rs.getString(2);
                    PKKey = datos[0];
                    Namekey = datos[1];
                    //System.out.println("D1>> "+datos[0]+" D2>> "+datos[1]);
                    System.out.println(PKKey);
                }
                System.out.println("++++++++++CONECTADO MetodoConsultaLlave+++++++++");
            } catch (Exception e) {
                e.printStackTrace(); System.out.println("ERROR!!");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaFileVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFileVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFileVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFileVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFileVersion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConectServer;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
