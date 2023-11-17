using System;
using System.Collections.Generic;

namespace practicaParcial2
{
    public class DetalleFactura
    {
        public int cantidad;
        public string producto;
        public double precioUnitario;
        public double precioTotal;

        public DetalleFactura(int cantidad, string producto, double precioUnitario)
        {
            this.cantidad = cantidad;
            this.producto = producto;
            this.precioUnitario = precioUnitario;
            this.precioTotal = cantidad * precioUnitario;
        }

        public DetalleFactura()
        {

        }

        public static implicit operator List<object>(DetalleFactura v)
        {
            throw new NotImplementedException();
        }
    }
}