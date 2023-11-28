namespace FormularioSERECU
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
            this.label1 = new System.Windows.Forms.Label();
            this.textBoxObtenerDatos = new System.Windows.Forms.TextBox();
            this.buttonObtenerDatos = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.textBoxObtenerCertificado = new System.Windows.Forms.TextBox();
            this.buttonObtenerCertificado = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(177, 91);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(20, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "CI";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // textBoxObtenerDatos
            // 
            this.textBoxObtenerDatos.Location = new System.Drawing.Point(249, 91);
            this.textBoxObtenerDatos.Name = "textBoxObtenerDatos";
            this.textBoxObtenerDatos.Size = new System.Drawing.Size(100, 22);
            this.textBoxObtenerDatos.TabIndex = 1;
            // 
            // buttonObtenerDatos
            // 
            this.buttonObtenerDatos.Location = new System.Drawing.Point(408, 69);
            this.buttonObtenerDatos.Name = "buttonObtenerDatos";
            this.buttonObtenerDatos.Size = new System.Drawing.Size(179, 66);
            this.buttonObtenerDatos.TabIndex = 2;
            this.buttonObtenerDatos.Text = "ObtenerDatos";
            this.buttonObtenerDatos.UseVisualStyleBackColor = true;
            this.buttonObtenerDatos.Click += new System.EventHandler(this.buttonObtenerDatos_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(177, 185);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(20, 17);
            this.label2.TabIndex = 3;
            this.label2.Text = "CI";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // textBoxObtenerCertificado
            // 
            this.textBoxObtenerCertificado.Location = new System.Drawing.Point(249, 185);
            this.textBoxObtenerCertificado.Name = "textBoxObtenerCertificado";
            this.textBoxObtenerCertificado.Size = new System.Drawing.Size(100, 22);
            this.textBoxObtenerCertificado.TabIndex = 4;
            // 
            // buttonObtenerCertificado
            // 
            this.buttonObtenerCertificado.Location = new System.Drawing.Point(408, 160);
            this.buttonObtenerCertificado.Name = "buttonObtenerCertificado";
            this.buttonObtenerCertificado.Size = new System.Drawing.Size(179, 66);
            this.buttonObtenerCertificado.TabIndex = 5;
            this.buttonObtenerCertificado.Text = "ObtenerCertificado";
            this.buttonObtenerCertificado.UseVisualStyleBackColor = true;
            this.buttonObtenerCertificado.Click += new System.EventHandler(this.buttonObtenerCertificado_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.buttonObtenerCertificado);
            this.Controls.Add(this.textBoxObtenerCertificado);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.buttonObtenerDatos);
            this.Controls.Add(this.textBoxObtenerDatos);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBoxObtenerDatos;
        private System.Windows.Forms.Button buttonObtenerDatos;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox textBoxObtenerCertificado;
        private System.Windows.Forms.Button buttonObtenerCertificado;
    }
}

