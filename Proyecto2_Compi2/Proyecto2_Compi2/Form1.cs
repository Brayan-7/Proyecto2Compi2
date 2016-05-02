using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;
using System.Text.RegularExpressions;
using System.IO;
using Thrift.Transport;
using Thrift.Protocol;

namespace Proyecto2_Compi2
{
    public partial class Form1 : Form
    {
        ArrayList ListaPestaña = new ArrayList();
        ArrayList listatexto = new ArrayList();
        int ContarPestaña = 1;
        int llaveCommit = 500;
        RichTextBox nuevotexto = new RichTextBox();

        public Form1()
        {
            InitializeComponent();
        }

        //***AÑADIR UNA NUEVA PESTAÑA
        private void AddPesta_Click(object sender, EventArgs e)
        {
            TabPage NuevaPestaña = new TabPage("Tab " + ContarPestaña); // Creamos una nueva pestaña
            nuevotexto = new RichTextBox();
            nuevotexto.SetBounds(0, 0, 880, 400);
            nuevotexto.BackColor = Color.Black; //Color del richtextbox
            nuevotexto.ForeColor = Color.White; //Color del texto del richtextbox
            ListaPestaña.Add(NuevaPestaña); // cada pestaña creada los añadimos en un arraylist
            listatexto.Add(nuevotexto);
            tabControl1.TabPages.Add(NuevaPestaña); //cargamos la pestaña en el control4
            NuevaPestaña.Controls.Add(nuevotexto);
            ContarPestaña++; //variable que lleva el control de la cantidad de pestaña creada
            tabControl1.SelectedTab = NuevaPestaña; //seleccionamos la pestaña
            this.nuevotexto.KeyDown += new System.Windows.Forms.KeyEventHandler(this.nuevotexto_KeyDown);
        }

        //Evento ENTER del RichTextBox
        string commando = "", NomPro = "", NClave = "", NClaveCom = "", Repo = "";
        private void nuevotexto_KeyDown(object sender, KeyEventArgs e) {
            string richs = nuevotexto.Text;
            string com = "";
            if (e.KeyValue == Convert.ToChar(Keys.Enter)) {
                string[] Datos = nuevotexto.Lines;
                Console.WriteLine(">>>>>> " + Datos.Count());
                for (int c = 0; c < Datos.Length; c++) {
                    if (Datos.Length == 1 && c == 0){
                        string[] cadena = Datos[0].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("--" + Datos[0]);
                        //SendLog(Datos[0]);
                    }else if (Datos.Length == 2 && c==0){
                        string[] cadena = Datos[1].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("**" + Datos[1]);
                        //SendLog(Datos[1]);
                    }else if (Datos.Length == 3 && c == 0){
                        string[] cadena = Datos[2].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("//" + Datos[2]);
                        //SendLog(Datos[2]);
                    }else if (Datos.Length == 4 && c == 0){
                        string[] cadena = Datos[3].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("@@" + Datos[3]);
                        //SendLog(Datos[3]);
                    }else if (Datos.Length == 5 && c == 0){
                        string[] cadena = Datos[4].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("==" + Datos[4]);
                        //SendLog(Datos[4]);
                    }else if (Datos.Length == 6 && c == 0){
                        string[] cadena = Datos[5].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("++" + Datos[5]);
                        //SendLog(Datos[5]);
                    }else if (Datos.Length == 7 && c == 0){
                        string[] cadena = Datos[6].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("%%" + Datos[6]);
                        //SendLog(Datos[6]);
                    }else if (Datos.Length == 8 && c == 0){
                        string[] cadena = Datos[7].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("!!" + Datos[7]);
                        //SendLog(Datos[7]);
                    }else if (Datos.Length == 9 && c == 0){
                        string[] cadena = Datos[8].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("??" + Datos[8]);
                        //SendLog(Datos[8]);
                    }else if (Datos.Length == 10 && c == 0){
                        string[] cadena = Datos[9].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("&&" + Datos[9]);
                        //SendLog(Datos[9]);
                    }else if (Datos.Length == 11 && c == 0){
                        string[] cadena = Datos[10].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("##" + Datos[10]);
                        //SendLog(Datos[10]);
                    }else if (Datos.Length == 12 && c == 0){
                        string[] cadena = Datos[11].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("\\" + Datos[11]);
                        //SendLog(Datos[11]);
                    }else if (Datos.Length == 13 && c == 0){
                        string[] cadena = Datos[12].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("çç" + Datos[12]);
                        //SendLog(Datos[12]);
                    }else if (Datos.Length == 14 && c == 0){
                        string[] cadena = Datos[13].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("``" + Datos[13]);
                        //SendLog(Datos[13]);
                    }else if (Datos.Length == 15 && c == 0){
                        string[] cadena = Datos[14].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("¿¿" + Datos[14]);
                        //SendLog(Datos[14]);
                    }else if (Datos.Length == 16 && c == 0){
                        string[] cadena = Datos[15].Split('\"');
                        ActionCommand(cadena);
                        Console.WriteLine("<<" + Datos[15]);
                        //SendLog(Datos[15]);
                    }
                }
            }
               
        }
        //-----------------------------METODO PARA ACCEDER A CADA ACCIÓN DE CADA COMANDO----------------------------------------
        public void ActionCommand(string[] Resultado) {
            if (Resultado[0].Equals("Source init ")){
                commando = Resultado[0];
                NomPro = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nProyecto: " + NomPro);
                //La llave unica será la llave primaria de la BD generada pro DBMS
                SendCRepo(NomPro);
                //MakeFolder(NomPro);
            }else if (Resultado[0].Equals("Source -d ")){
                commando = Resultado[0];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nClave: " + NClave);
                //SendDelRepo(NClave);
            }else if (Resultado[0].Equals("Source -s ")){
                commando = Resultado[0];
                NomPro = Resultado[1];
                NClave = Resultado[3];
                Console.WriteLine("Comando: " + commando + "\nProyecto: " + NomPro + "\nClave: " + NClave);
                //SendSwitch(NomPro,NClave);
            }else if (Resultado[0].Equals("Source commit ")){
                commando = Resultado[0];  Repo = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nRepositorio: " + Repo);
                llaveCommit++;   //Crea la Llave commit de los archivos
                //SendCommit(llaveCommit, Repo);
            }else if (Resultado[0].Equals("Source update.")){
                commando = Resultado[0];
                Console.WriteLine("Comando: " + commando);
                //SendUpdate(NomPro);
            }else if (Resultado[0].Equals("Source update -r ")){
                commando = Resultado[0];
                NClaveCom = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nLlaveCommit: " + NClaveCom);
            }else if (Resultado[0].Equals("Prueba ")){
                commando = Resultado[0];
                NClaveCom = Resultado[3];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nLlaveUnica: " + NClave + "\nLlaveCommit: " + NClaveCom);
            }else if (Resultado[0].Equals("Prueba -3D ")){
                commando = Resultado[0];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nClave: " + NClave);
            }else if (Resultado[0].Equals("Release -3D -o ")){
                commando = Resultado[0];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nClave: " + NClave);
            }else if (Resultado[0].Equals("Release -3D ")){
                commando = Resultado[0];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nClave: " + NClave);
            }else if (Resultado[0].Equals("Release -asm ")){
                commando = Resultado[0];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nClave: " + NClave);
            }else if (Resultado[0].Equals("Release ")){
                commando = Resultado[0];
                NClave = Resultado[1];
                Console.WriteLine("Comando: " + commando + "\nClave: " + NClave);
            }else if (Resultado[0].Equals("Limpiar")){
                commando = Resultado[0];
                nuevotexto.Text = "";
                Resultados.Text = Resultados.Text + "\n" + "Comando Limpiar ejecutado Correctamente!";
                Console.WriteLine("Comando: " + commando);
            }else if (Resultado[0].Equals("AcercaDe")){
                commando = Resultado[0];
                Resultados.Text = Resultados.Text + "\n" + "Acerca de: Brayan Escobedo 200819229, Proyecto 2 de Compiladores 2";
                Console.WriteLine("Comando: " + commando);
            }else {
                Resultados.Text = Resultados.Text + "\n" + "Error no se reconocoe el comando: " + Resultado[0];
                Console.WriteLine("Error no se reconocoe el comando: " + Resultado[0]);
            }
        }



        //-------------------------------------CREACIÓN DE DIRECTORIOS------------------------------------------
        //METODO PARA CREAR LA CARPETA EN C:\FileVersionClient DONDE SE GUARDAN LOS PROYECTOS
        public void MakeFolderFirst() {
            string path = @"A:\FileVersionClient";
            try{
                if(Directory.Exists(path)){
                    Console.WriteLine("The path exist");
                }
                //Create the directoy
                DirectoryInfo DI = Directory.CreateDirectory(path);
                Console.WriteLine("The directory was created at {0}", Directory.GetCreationTime(path));
            }catch (Exception e){
                Console.WriteLine("The process faile: {0}", e.ToString());
                throw;
            }
        }

        //METODO PARA CREAR LOS PROYECTOS EN CARPETAS
        public void MakeFolder(string nombreC) {
            string path = @"A:\FileVersionClient";
            try{
                if (Directory.Exists(path)){
                    Console.WriteLine("The path exist");
                }
                //Create the directoy
                string valor = path + nombreC;
                DirectoryInfo DI = Directory.CreateDirectory(valor);
                Console.WriteLine("The directory was created at {0}", Directory.GetCreationTime(path));
            }catch (Exception e){
                Console.WriteLine("The process faile: {0}", e.ToString());
                throw;
            }
        }

        //-------------------------------------CONEXIÓN APACHE THRIFT-----------------------------------
        TSocket tranasport;
        TProtocol protocol;
        conexion.Client cliente;
        //***CONECTAR C# CON JAVA POR MEDIO DE APACHE THRIFT
        public void MakeConection() {
            Console.WriteLine("Conectando al puerto 8885");
            tranasport = new TSocket("192.168.1.7", 8885); //Se asigna IP y puerto
            protocol = new TBinaryProtocol(tranasport);
            cliente = new conexion.Client(protocol);
            tranasport.Open();
            Console.WriteLine("Conexion exitosa!!!");
        }

        //*****ENVIAR ATRAVES DE APACHE LA INSTRUCCIÓN DE CREAR REPOSITORIO
        public void SendCRepo(string Datos) {
            //Enviando Información al Servidor JAVA
            String res = cliente.DoRepo("Cliente C#" + " Repositorio: " + Datos);
            Console.WriteLine(res);
            Resultados.Text = Resultados.Text + "\n" + res;
            Console.WriteLine("_______");
        }
        //*****ENVIAR ATRAVES DE APACHE LAS INSTRUCCIONES ENVIADAS POR EL USUARIO PARA EL LOG
        public void SendLog(string instr) {
            //Enviando Información al Servidor JAVA
            String res = cliente.DoLog("Soy el Cliente C#" + " Instruccion: " + instr);
            Console.WriteLine(res);
            Resultados.Text = Resultados.Text + "\n" + res;
            Console.WriteLine("_______");
        }
        //***ENVIAR ATRAVES DE APACHE LAS INSTRUCCIONES ENVIADAS POR EL USUARIO PARA ELIMINAR REPOSITORIO
        public void SendDelRepo(string instr) {
            String res = cliente.DelRepo("Soy el Cliente C#" + " Instruccion: " + instr);
            Console.WriteLine(res);
            Resultados.Text = Resultados.Text + "\n" + res;
            Console.WriteLine("_______");
        }
        //****ENVIAR ATRAVES DE APACHE LAS INSTRUCCIONES ENVIADAS POR EL USUARIO PARA CAMBIAR DE REPOSITORIO
        public void SendSwitch(string PA, string NP) {//COMPARAR
            String res = cliente.SWRepo(" Proj_Act: " + PA, " Proj_Nue: " + NP);
            Console.WriteLine("El proyecto Actual es: " + res);
            NomPro = res;
            Resultados.Text = Resultados.Text + "\n" + "El proyecto Actual es: " + res;
            Console.WriteLine("_______");
        }
        //******ENVIAR ATRAVES DE APACHE LAS INSTRUCCIONES ENVIADAS POR EL USUARIO PARA SUBIR EL REPOSITORIO AL SERVIDOR
        public void SendCommit(int llave, string repos) {
            String res = cliente.UpFiles(llave,repos);
            //ENVIA DATOS AL SERVIDOR
            if (repos == "." || repos == "+"){
                //ExecuteCommand();
            }
            else {
                //ExecuteCommand();
            }
            Console.WriteLine("Datos guardados exitosamente " + res);
            Resultados.Text = Resultados.Text + "\n" + res;
            Console.WriteLine("_______");
        }
        //*****ENVIAR ATRAVES DE APACHE LAS INSTRUCCIONES ENVIADAS POR EL USUARIO PARA DESCARGAR LA ÚLTIMA VERSION DEL REPOSITORIO
        public void SendUpdate(String RepoAct) {
            String res = cliente.Update("Soy el Cliente C# enviando la solicitud de descargar el repositorio: "+RepoAct);
            Console.WriteLine(res);
            Resultados.Text = Resultados.Text + "\n" + res;
            Console.WriteLine("_______");
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            //MakeFolderFirst();
            //MakeConection();
        }

        ///******EJECUTANDO COMANDO EN EL CMD 
        public static void ExecuteCommand(string _Command) { 
            //INDICAMOS QUE DESEAMOS INICIALIZAR EL PROCESO CMD.EXE
            System.Diagnostics.ProcessStartInfo procS = new System.Diagnostics.ProcessStartInfo("cmd","/c" + _Command);
            //INDICAMOS QUE LA SALIDA DEL PROCESO SE REDIRECCIONA EN UN STREAM
            procS.RedirectStandardOutput = true;
            procS.UseShellExecute = false;
            //INDICA QUE EL PROCESO NO DESPLIEGUE UNA PANTALLA NEGRA
            procS.CreateNoWindow = false;
            //INICIALIZA EL PROCESO
            System.Diagnostics.Process pro = new System.Diagnostics.Process();
            pro.StartInfo = procS;
            pro.Start();
            //CONSIGUE LA SALIDA DE LA CONSOLA "STREAM" Y DEVUELVE UNA CADENA DE TEXTO
            string resultado = pro.StandardOutput.ReadToEnd();
            //MUESTRA EN PANTALLA LA SALIDA DEL COMANDO
            Console.WriteLine(resultado);
        }
    }
}
