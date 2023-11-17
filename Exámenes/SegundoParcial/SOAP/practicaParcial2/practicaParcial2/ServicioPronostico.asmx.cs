using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace practicaParcial2
{
    /// <summary>
    /// Summary description for ServicioPronostico
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class ServicioPronostico : System.Web.Services.WebService
    {


        private List<Pronostico> pronosticos = new List<Pronostico>();

        public ServicioPronostico()
        {

            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 04), 21, 36.74));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 05), 22, 80));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 06), 25, 1.26));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 07), 26, 0.42));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 08), 28, 46.85));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 09), 19, 4.21));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 10), 22, 8.79));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 11), 12, 0.69));
            pronosticos.Add(new Pronostico(new DateTime(2021, 02, 12), 18, 0.65));
        }

        [WebMethod]
        public string HelloWorld()
        {
            return "Hello World";
        }


        [WebMethod]
        public string SaludoPrueba()
        {
            return "Wiii";
        }


        [WebMethod]
        public string ObtenerPronosticoPorFecha(DateTime fecha)
        {
            // Buscar el pronóstico
            Pronostico pronosticoEncontrado = pronosticos.FirstOrDefault(p => p.fecha.Date == fecha.Date);

            if (pronosticoEncontrado != null)
            {
                string mensaje = $"Fecha: {pronosticoEncontrado.fecha.ToShortDateString()} \n" +
                                 $"Temperatura: {pronosticoEncontrado.temperatura}°C \n" +
                                 $"Probabilidad de Lluvia: {pronosticoEncontrado.probabilidadLluvia}% \n";
                return mensaje;
            }
            else
            {
                return "No un pronostico con esa fecha";
            }
        }

        [WebMethod]
        public string ObtenerPronosticosPorTemperatura(int temperatura)
        {
            List<Pronostico> pronosticosFiltrados = pronosticos
                .Where(p => p.temperatura == temperatura)
                .ToList();

            if (pronosticosFiltrados.Count > 0)
            {
                string mensaje = "Pronósticos para la temperatura " + temperatura + "°C:\n";
                foreach (var pronostico in pronosticosFiltrados)
                {
                    mensaje += $"Fecha: {pronostico.fecha.ToShortDateString()}, " +
                               $"Temperatura: {pronostico.temperatura}°C, " +
                               $"Probabilidad de Lluvia: {pronostico.probabilidadLluvia}%\n";
                }
                return mensaje;
            }
            else
            {
                return "No existe un pronostico con esa temperatura";
            }
        }

        [WebMethod]
        public string ObtenerPronosticosPorProbabilidadLluvia(double probabilidadLluvia)
        {
            List<Pronostico> pronosticosFiltrados = pronosticos
                .Where(p => p.probabilidadLluvia == probabilidadLluvia)
                .ToList();

            if (pronosticosFiltrados.Count > 0)
            {
                string mensaje = "\n\nPronósticos para la probabilidad de lluvia " + probabilidadLluvia + "%:\n";
                foreach (var pronostico in pronosticosFiltrados)
                {
                    mensaje += $"Fecha: {pronostico.fecha.ToShortDateString()}, " +
                               $"\nTemperatura: {pronostico.temperatura}°C, " +
                               $"\nProbabilidad de Lluvia: {pronostico.probabilidadLluvia}%\n";
                }
                return mensaje;
            }
            else
            {
                return "No existe un pronostico con esa probabilidad de lluevia";
            }
        }

        [WebMethod]
        public string ObtenerTodosLosPronosticos()
        {
            string mensaje = "Pronósticos:\n";
            foreach (var pronostico in pronosticos)
            {
                mensaje += $"Fecha: {pronostico.fecha.ToShortDateString()}, " +
                           $"Temperatura: {pronostico.temperatura}°C, " +
                           $"Probabilidad de Lluvia: {pronostico.probabilidadLluvia}%\n";
            }
            return mensaje;
        }


    }
}
