using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using FormularioPronostico.ServicioPronostico;

namespace FormularioPronostico
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


        //private void buttonFecha_Click(object sender, EventArgs e)
        //{

        //}
        private void buttonFecha_Click(object sender, EventArgs e)
        {
            // Obtén la fecha ingresada en el textBoxFecha
            if (DateTime.TryParse(textBoxFecha.Text, out DateTime fechaSeleccionada))
            {
                // Crea una instancia del servicio web
                //ServicioPronostico.ServicioPronostico servicio = new ServicioPronostico.ServicioPronostico();
                ServicioPronosticoSoapClient client = new ServicioPronosticoSoapClient();




                // Llama al método ObtenerPronosticoPorFecha del servicio web
                string mensaje = client.ObtenerPronosticoPorFecha(fechaSeleccionada);

                // Muestra el resultado en un MessageBox
                MessageBox.Show(mensaje, "Pronóstico para la fecha seleccionada");
            }
            else
            {
                MessageBox.Show("Fecha no válida. Ingresa una fecha en el formato correcto.", "Error");
            }
        }

        private void textBoxTemperatura_TextChanged(object sender, EventArgs e)
        {

        }
        private void TextBoxFecha_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBoxLluvia_TextChanged(object sender, EventArgs e)
        {
            //if (double.TryParse(textBoxLluvia.Text, out double probabilidadLluviaSeleccionada))
            //{
            //    ServicioPronosticoSoapClient client = new ServicioPronosticoSoapClient();

            //    string mensaje = client.ObtenerPronosticosPorProbabilidadLluvia(probabilidadLluviaSeleccionada);

            //    MessageBox.Show(mensaje, "Pronósticos para la probabilidad de lluvia seleccionada");
            //}
            //else
            //{
            //    MessageBox.Show("Probabilidad de lluvia no válida. Ingresa un valor numérico.", "Error");
            //}
        }

        private void buttonTemperatura_Click(object sender, EventArgs e)
        {
            if (int.TryParse(textBoxTemperatura.Text, out int temperaturaSeleccionada))
            {
                ServicioPronosticoSoapClient client = new ServicioPronosticoSoapClient();

                string mensaje = client.ObtenerPronosticosPorTemperatura(temperaturaSeleccionada);

                MessageBox.Show(mensaje, "Pronósticos para la temperatura seleccionada");
            }
            else
            {
                MessageBox.Show("Temperatura no válida. Ingresa un valor numérico.", "Error");
            }
        }

        private void buttonLluvia_Click(object sender, EventArgs e)
        {
            if (double.TryParse(textBoxLluvia.Text, out double probabilidadLluviaSeleccionada))
            {
                ServicioPronosticoSoapClient client = new ServicioPronosticoSoapClient();

                string mensaje = client.ObtenerPronosticosPorProbabilidadLluvia(probabilidadLluviaSeleccionada);

                MessageBox.Show(mensaje, "Pronósticos para la probabilidad de lluvia seleccionada");
            }
            else
            {
                MessageBox.Show("Probabilidad de lluvia no válida. Ingresa un valor numérico.", "Error");
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {

                ServicioPronosticoSoapClient client = new ServicioPronosticoSoapClient();

                string mensaje = client.ObtenerTodosLosPronosticos();

                MessageBox.Show(mensaje, "Pronósticos para la probabilidad de lluvia seleccionada");
            

        }
    }
}
