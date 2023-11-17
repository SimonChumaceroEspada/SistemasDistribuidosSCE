using System;
using System.Collections.Generic;

namespace practicaParcial2
{
    public class Factura
    {
        public int NIT;
        public string razonSocial;
        public DateTime fecha;
        public int numeroFactura;
        public string cufd;
        public string nombreCliente;
        //public List<DetalleFactura> detalleFactura;
        //private string cufd;
        private DetalleFactura detalleFactura1;

        public Factura(int nit, string razonSocial, DateTime fecha, int numeroFactura, string cufd, string nombreCliente, DetalleFactura detalleFactura1)
        {
            this.NIT = nit;
            this.razonSocial = razonSocial;
            this.fecha = fecha;
            this.numeroFactura = numeroFactura;
            this.cufd = cufd;
            this.nombreCliente = nombreCliente;
            this.detalleFactura1 = detalleFactura1;
        }

        public Factura()
        {
        }

    }
}