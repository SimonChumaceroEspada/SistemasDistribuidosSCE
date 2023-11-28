using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using FormularioSERECU.ServiciosSERECU;

namespace FormularioSERECU
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void buttonObtenerDatos_Click(object sender, EventArgs e)
        {
            ServicioSERECUSoapClient client = new ServicioSERECUSoapClient();

            string ci = textBoxObtenerDatos.Text;

            // Llama al método ObtenerPronosticoPorFecha del servicio web
            string mensaje = client.ObtenerDatos(ci);


            // Muestra el resultado en un MessageBox
            MessageBox.Show(mensaje, "Persona encontrada");
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void buttonObtenerCertificado_Click(object sender, EventArgs e)
        {
            ServicioSERECUSoapClient client = new ServicioSERECUSoapClient();

            string ci = textBoxObtenerCertificado.Text;

            // Llama al método ObtenerPronosticoPorFecha del servicio web
            string mensaje = client.ObtenerCertificadoNacimiento(ci);


            // Muestra el resultado en un MessageBox
            MessageBox.Show(mensaje, "Certificado encontrado");
        }
    }
}
