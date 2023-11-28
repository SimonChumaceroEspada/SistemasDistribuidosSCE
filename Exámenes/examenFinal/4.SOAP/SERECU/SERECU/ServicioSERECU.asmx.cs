using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace SERECU
{
    /// <summary>
    /// Summary description for ServicioSERECU
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]


    public class ServicioSERECU : System.Web.Services.WebService

    {

        private List<Persona> personas = new List<Persona>();

        private List<CertificadoNacimiento> certificados= new List<CertificadoNacimiento>();


        public ServicioSERECU()
        {
            Persona persona1 = new Persona("7504877", "Simon", "Chumacero", "Espada", new DateTime(1999, 07, 26), "Masculino", "Soltero");
            Persona persona2 = new Persona("7504872", "Simon", "Chumacero", "Espada", new DateTime(2001, 05, 29), "Masculino", "Soltero");

            Persona personaPadre = new Persona("3638368", "Omar", "Chumacero", "Cors", new DateTime(1976, 08, 21), "Masculino", "Casado");
            Persona personaMadre = new Persona("3638366", "Jhovana", "Espada", "Achucarro", new DateTime(1978, 06, 14), "Femenino", "Casado");
            personas.Add(persona1);
            personas.Add(persona2);
            personas.Add(personaPadre);
            personas.Add(personaMadre);

            CertificadoNacimiento certificado1 = new CertificadoNacimiento("7504877", "Simon", "Chumacero", "Espada", new DateTime(1999, 07, 26), personaPadre, personaMadre);
            CertificadoNacimiento certificado2 = new CertificadoNacimiento("7504872", "Simon", "Chumacero", "Espada", new DateTime(2001, 05, 29), personaPadre, personaMadre);


            certificados.Add(certificado1);
            certificados.Add(certificado2);
            // certificados.Add( )

        }

        [WebMethod]
        public string HelloWorld()
        {
            return "Hello World";
        }

        //Persona persona = new Persona("7504877", "Simon", "Chumacero", "Espada", "26-07-1999", "Masculino", "Soltero");
        //Persona persona2 = new Persona("7504872", "Simon", "Chumacero", "Espada", "26-07-1999", "Masculino", "Soltero");

        [WebMethod]
        public string ObtenerDatos(string ci)
        {

            Persona personaEncontrada = personas.FirstOrDefault(p => p.ci == ci);

            if (personaEncontrada != null)
            {
                string mensaje = $"Carnet: {personaEncontrada.ci} \n" +
                                 $"Nombres: {personaEncontrada.nombres} \n" +
                                 $"primerApellido: {personaEncontrada.primerApellido} \n" +
                                 $"segundoApellido: {personaEncontrada.segundoApellido} \n" +
                                 $"FechaNacimiento: {personaEncontrada.fechaNacimiento.ToShortDateString()} \n" +
                                 $"Sexo: {personaEncontrada.sexo} \n" +
                                 $"Estado Civil: {personaEncontrada.estadoCivil}% \n";
                return mensaje;
            }
            else
            {
                return "persona no encontrada";
            }





            //Factura factura = new Factura(nit, razonSocial, fecha, numeroFactura, cufd, nombreCliente, detalleFactura);

            //// Formatea la información de la factura en una cadena
            //string facturaString = $"Número de Factura: {factura.numeroFactura} \nNit: {factura.NIT}, \nRazon Social: {factura.razonSocial}, \nFecha: {factura.fecha}, \nCUFD: {factura.cufd}, \nNombre del Cliente: {factura.nombreCliente}\n";
            //facturaString += $"\nDetalle de Factura: \nCantidad: {detalleFactura.cantidad}, \nProducto: {detalleFactura.producto}, \nPrecio Unitario: {detalleFactura.precioUnitario}, \nPrecio Total: {detalleFactura.precioTotal}";



            //return facturaString;
        }


        [WebMethod]
        public string ObtenerCertificadoNacimiento(string ci)
        {

            CertificadoNacimiento certificadoEncontrado = certificados.FirstOrDefault(p => p.ci == ci);

            if (certificadoEncontrado != null)
            {
                string mensaje = $"Carnet: {certificadoEncontrado.ci} \n" +
                                 $"Nombres: {certificadoEncontrado.nombres} \n" +
                                 $"primerApellido: {certificadoEncontrado.primerApellido} \n" +
                                 $"segundoApellido: {certificadoEncontrado.segundoApellido} \n" +
                                 $"FechaNacimiento: {certificadoEncontrado.fechaNacimiento.ToShortDateString()} \n" +
                                 "-----DATOS PADRE \n" +
                                 $"CiPadre: {certificadoEncontrado.personaPadre.ci}\n" +
                                 $"NombrePadre: {certificadoEncontrado.personaPadre.nombres}\n" +
                                 $"primerApellidoPadre: {certificadoEncontrado.personaPadre.primerApellido}\n" +
                                 $"segundoApellidoPadre: {certificadoEncontrado.personaPadre.segundoApellido}\n" +
                                 $"FechaNacimiento: {certificadoEncontrado.personaPadre.fechaNacimiento.ToShortDateString()} \n" +
                                 "-----DATOS MADRE \n" +
                                 $"CiMadre: {certificadoEncontrado.personaMadre.ci}\n" +
                                 $"NombrePadre: {certificadoEncontrado.personaMadre.nombres}\n" +
                                 $"primerApellidoPadre: {certificadoEncontrado.personaMadre.primerApellido}\n" +
                                 $"segundoApellidoPadre: {certificadoEncontrado.personaMadre.segundoApellido}\n" +
                                 $"FechaNacimiento: {certificadoEncontrado.personaMadre.fechaNacimiento.ToShortDateString()} \n";
                                 //$"Sexo: {certificadoEncontrado.sexo} \n" +
                                 //$"Estado Civil: {certificadoEncontrado.estadoCivil}% \n";
                return mensaje;
            }
            else
            {
                return "persona no encontrada";
            }

        }
    }
}
