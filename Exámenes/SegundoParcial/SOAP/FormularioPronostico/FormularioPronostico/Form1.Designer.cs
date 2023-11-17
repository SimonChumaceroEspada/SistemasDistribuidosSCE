using System;

namespace FormularioPronostico
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
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.textBoxFecha = new System.Windows.Forms.TextBox();
            this.textBoxTemperatura = new System.Windows.Forms.TextBox();
            this.textBoxLluvia = new System.Windows.Forms.TextBox();
            this.buttonFecha = new System.Windows.Forms.Button();
            this.buttonTemperatura = new System.Windows.Forms.Button();
            this.buttonLluvia = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(186, 87);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(136, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "PronosticoPorFecha";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(165, 212);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(157, 17);
            this.label2.TabIndex = 1;
            this.label2.Text = "PronosticoTemperatura";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(198, 339);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(124, 17);
            this.label3.TabIndex = 2;
            this.label3.Text = "ProbabilidadLluvia";
            // 
            // textBoxFecha
            // 
            this.textBoxFecha.Location = new System.Drawing.Point(403, 82);
            this.textBoxFecha.Name = "textBoxFecha";
            this.textBoxFecha.Size = new System.Drawing.Size(100, 22);
            this.textBoxFecha.TabIndex = 3;
            this.textBoxFecha.TextChanged += new System.EventHandler(this.TextBoxFecha_TextChanged);
            // 
            // textBoxTemperatura
            // 
            this.textBoxTemperatura.Location = new System.Drawing.Point(403, 207);
            this.textBoxTemperatura.Name = "textBoxTemperatura";
            this.textBoxTemperatura.Size = new System.Drawing.Size(100, 22);
            this.textBoxTemperatura.TabIndex = 4;
            this.textBoxTemperatura.TextChanged += new System.EventHandler(this.textBoxTemperatura_TextChanged);
            // 
            // textBoxLluvia
            // 
            this.textBoxLluvia.Location = new System.Drawing.Point(403, 339);
            this.textBoxLluvia.Name = "textBoxLluvia";
            this.textBoxLluvia.Size = new System.Drawing.Size(100, 22);
            this.textBoxLluvia.TabIndex = 5;
            this.textBoxLluvia.TextChanged += new System.EventHandler(this.textBoxLluvia_TextChanged);
            // 
            // buttonFecha
            // 
            this.buttonFecha.Location = new System.Drawing.Point(578, 45);
            this.buttonFecha.Name = "buttonFecha";
            this.buttonFecha.Size = new System.Drawing.Size(136, 96);
            this.buttonFecha.TabIndex = 6;
            this.buttonFecha.Text = "ObtenerPronosticoPorFecha";
            this.buttonFecha.UseVisualStyleBackColor = true;
            this.buttonFecha.Click += new System.EventHandler(this.buttonFecha_Click);
            // 
            // buttonTemperatura
            // 
            this.buttonTemperatura.Location = new System.Drawing.Point(578, 177);
            this.buttonTemperatura.Name = "buttonTemperatura";
            this.buttonTemperatura.Size = new System.Drawing.Size(135, 82);
            this.buttonTemperatura.TabIndex = 7;
            this.buttonTemperatura.Text = "ObtenerPronosticoPorTemperatura";
            this.buttonTemperatura.UseVisualStyleBackColor = true;
            this.buttonTemperatura.Click += new System.EventHandler(this.buttonTemperatura_Click);
            // 
            // buttonLluvia
            // 
            this.buttonLluvia.Location = new System.Drawing.Point(578, 299);
            this.buttonLluvia.Name = "buttonLluvia";
            this.buttonLluvia.Size = new System.Drawing.Size(135, 85);
            this.buttonLluvia.TabIndex = 8;
            this.buttonLluvia.Text = "ObtenerPronosticoPorProbabilidadLluvia";
            this.buttonLluvia.UseVisualStyleBackColor = true;
            this.buttonLluvia.Click += new System.EventHandler(this.buttonLluvia_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(283, 389);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(220, 49);
            this.button1.TabIndex = 9;
            this.button1.Text = "ObtenerTodosLosPronosticos";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.buttonLluvia);
            this.Controls.Add(this.buttonTemperatura);
            this.Controls.Add(this.buttonFecha);
            this.Controls.Add(this.textBoxLluvia);
            this.Controls.Add(this.textBoxTemperatura);
            this.Controls.Add(this.textBoxFecha);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox textBoxFecha;
        private System.Windows.Forms.TextBox textBoxTemperatura;
        private System.Windows.Forms.TextBox textBoxLluvia;
        private System.Windows.Forms.Button buttonFecha;
        private System.Windows.Forms.Button buttonTemperatura;
        private System.Windows.Forms.Button buttonLluvia;
        private EventHandler textBoxFecha_TextChanged;
        private System.Windows.Forms.Button button1;
    }
}

