using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace practicaParcial2
{
    /// <summary>
    /// Summary description for ServicioImpuestos
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class ServicioImpuestos : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld()
        {
            return "Hello World";
        }

        [WebMethod]
        public DateTime Sincronizar()
        {
            return DateTime.Now;
        }


        [WebMethod]
        public string ObtenerCufd()
        {
            return "AB0000134534521”";
        }

        [WebMethod]
        public Respuesta EmitirFactura(int idAmbiente, int Nit, string Cufd, int Modalidad, Factura factura)
        {
            Respuesta aux = new Respuesta("Valido", "Recibido Correctamente", factura.razonSocial);
            return aux;
        }


        // Variable estática para almacenar el número de factura
        private static int numeroFactura = 1;



        [WebMethod]
        public int ObtenerNumeroFactura()
        {
            // Retorna el número actual y luego incrementa la variable para la próxima llamada
            return numeroFactura++;
        }

        // Crear una lista de Facturas
        //[WebMethod]
        //public List<DetalleFactura> CrearListaDetalleFactura(int cantidad, string producto, double precioUnitario)
        //{
        //    // Crea un nuevo detalle de factura con los parámetros recibidos
        //    DetalleFactura nuevoDetalle = new DetalleFactura(cantidad, producto, precioUnitario);

        //    // Crea una lista y agrega el nuevo detalle
        //    List<DetalleFactura> listaDetalles = new List<DetalleFactura>();
        //    listaDetalles.Add(nuevoDetalle);

        //    // Puedes agregar más detalles a la lista si es necesario

        //    return listaDetalles;
        //}

        [WebMethod]
        public string CrearDetalleFactura(int cantidad, string producto, double precioUnitario)
        {
            try
            {
                // Crea un nuevo objeto DetalleFactura con los parámetros recibidos
                DetalleFactura detalle = new DetalleFactura(cantidad, producto, precioUnitario);

                // Crea una cadena formateada con los datos del objeto
                string detalleString = $"Cantidad: {detalle.cantidad}, Producto: {detalle.producto}, Precio Unitario: {detalle.precioUnitario} ,PrecioTotal: {detalle.precioTotal}" ;

                return detalleString;
            }
            catch (Exception ex)
            {
                return "Error: " + ex.Message;
            }
        }

        [WebMethod]
        public string CrearFactura(int nit, string razonSocial, DateTime fecha, int numeroFactura, string cufd, string nombreCliente, int cantidadProducto, string producto, double precioUnitario)
        {
            // Crea un nuevo objeto DetalleFactura con los parámetros recibidos
            DetalleFactura detalleFactura = new DetalleFactura(cantidadProducto, producto, precioUnitario);

            Factura factura = new Factura(nit, razonSocial, fecha, numeroFactura, cufd, nombreCliente, detalleFactura);

            // Formatea la información de la factura en una cadena
            string facturaString = $"Número de Factura: {factura.numeroFactura} \nNit: {factura.NIT}, \nRazon Social: {factura.razonSocial}, \nFecha: {factura.fecha}, \nCUFD: {factura.cufd}, \nNombre del Cliente: {factura.nombreCliente}\n";
            facturaString += $"\nDetalle de Factura: \nCantidad: {detalleFactura.cantidad}, \nProducto: {detalleFactura.producto}, \nPrecio Unitario: {detalleFactura.precioUnitario}, \nPrecio Total: {detalleFactura.precioTotal}";



            return facturaString;
        }


    }
}
