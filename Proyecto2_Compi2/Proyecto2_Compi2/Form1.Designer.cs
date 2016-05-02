namespace Proyecto2_Compi2
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.PanelConsola = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.AddPesta = new System.Windows.Forms.Button();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.PanelResultados = new System.Windows.Forms.Panel();
            this.tabControl2 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.TablaSimbolos = new System.Windows.Forms.RichTextBox();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.Resultados = new System.Windows.Forms.RichTextBox();
            this.tabPage3 = new System.Windows.Forms.TabPage();
            this.Errores = new System.Windows.Forms.RichTextBox();
            this.PanelConsola.SuspendLayout();
            this.PanelResultados.SuspendLayout();
            this.tabControl2.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.tabPage2.SuspendLayout();
            this.tabPage3.SuspendLayout();
            this.SuspendLayout();
            // 
            // PanelConsola
            // 
            this.PanelConsola.Controls.Add(this.label1);
            this.PanelConsola.Controls.Add(this.AddPesta);
            this.PanelConsola.Controls.Add(this.tabControl1);
            this.PanelConsola.Location = new System.Drawing.Point(12, 12);
            this.PanelConsola.Name = "PanelConsola";
            this.PanelConsola.Size = new System.Drawing.Size(891, 262);
            this.PanelConsola.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(275, 4);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(150, 20);
            this.label1.TabIndex = 2;
            this.label1.Text = "Client FileVersion";
            // 
            // AddPesta
            // 
            this.AddPesta.Location = new System.Drawing.Point(714, 18);
            this.AddPesta.Name = "AddPesta";
            this.AddPesta.Size = new System.Drawing.Size(152, 23);
            this.AddPesta.TabIndex = 1;
            this.AddPesta.Text = "Agregar Pestaña";
            this.AddPesta.UseVisualStyleBackColor = true;
            this.AddPesta.Click += new System.EventHandler(this.AddPesta_Click);
            // 
            // tabControl1
            // 
            this.tabControl1.Location = new System.Drawing.Point(15, 47);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(873, 212);
            this.tabControl1.TabIndex = 0;
            // 
            // PanelResultados
            // 
            this.PanelResultados.Controls.Add(this.tabControl2);
            this.PanelResultados.Location = new System.Drawing.Point(12, 280);
            this.PanelResultados.Name = "PanelResultados";
            this.PanelResultados.Size = new System.Drawing.Size(891, 196);
            this.PanelResultados.TabIndex = 1;
            // 
            // tabControl2
            // 
            this.tabControl2.Controls.Add(this.tabPage1);
            this.tabControl2.Controls.Add(this.tabPage2);
            this.tabControl2.Controls.Add(this.tabPage3);
            this.tabControl2.Location = new System.Drawing.Point(15, 12);
            this.tabControl2.Name = "tabControl2";
            this.tabControl2.SelectedIndex = 0;
            this.tabControl2.Size = new System.Drawing.Size(873, 181);
            this.tabControl2.TabIndex = 0;
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.TablaSimbolos);
            this.tabPage1.Location = new System.Drawing.Point(4, 22);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(865, 155);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "Tabla de Simbolos";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // TablaSimbolos
            // 
            this.TablaSimbolos.Location = new System.Drawing.Point(7, 7);
            this.TablaSimbolos.Name = "TablaSimbolos";
            this.TablaSimbolos.Size = new System.Drawing.Size(852, 142);
            this.TablaSimbolos.TabIndex = 0;
            this.TablaSimbolos.Text = "";
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.Resultados);
            this.tabPage2.Location = new System.Drawing.Point(4, 22);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(865, 155);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "Resultados";
            this.tabPage2.UseVisualStyleBackColor = true;
            // 
            // Resultados
            // 
            this.Resultados.Location = new System.Drawing.Point(4, 7);
            this.Resultados.Name = "Resultados";
            this.Resultados.Size = new System.Drawing.Size(855, 142);
            this.Resultados.TabIndex = 0;
            this.Resultados.Text = "";
            // 
            // tabPage3
            // 
            this.tabPage3.Controls.Add(this.Errores);
            this.tabPage3.Location = new System.Drawing.Point(4, 22);
            this.tabPage3.Name = "tabPage3";
            this.tabPage3.Size = new System.Drawing.Size(865, 155);
            this.tabPage3.TabIndex = 2;
            this.tabPage3.Text = "Errores";
            this.tabPage3.UseVisualStyleBackColor = true;
            // 
            // Errores
            // 
            this.Errores.Location = new System.Drawing.Point(4, 4);
            this.Errores.Name = "Errores";
            this.Errores.Size = new System.Drawing.Size(858, 148);
            this.Errores.TabIndex = 0;
            this.Errores.Text = "";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(915, 488);
            this.Controls.Add(this.PanelResultados);
            this.Controls.Add(this.PanelConsola);
            this.Name = "Form1";
            this.Text = "FileVersion 3D";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.PanelConsola.ResumeLayout(false);
            this.PanelConsola.PerformLayout();
            this.PanelResultados.ResumeLayout(false);
            this.tabControl2.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage2.ResumeLayout(false);
            this.tabPage3.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel PanelConsola;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.Panel PanelResultados;
        private System.Windows.Forms.Button AddPesta;
        private System.Windows.Forms.TabControl tabControl2;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.TabPage tabPage3;
        private System.Windows.Forms.RichTextBox TablaSimbolos;
        private System.Windows.Forms.RichTextBox Resultados;
        private System.Windows.Forms.RichTextBox Errores;
        private System.Windows.Forms.Label label1;
    }
}

