using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace practicaParcial2
{
    public class Pronostico
    {
        public DateTime fecha;
        public int temperatura;
        public double probabilidadLluvia;


        public Pronostico(DateTime fecha, int temperatura, double probabilidadLluvia)
        {
            this.fecha = fecha;
            this.temperatura = temperatura;
            this.probabilidadLluvia = probabilidadLluvia;
        }

        public Pronostico()
        {

        }

        //Pronostico pronostico1 = new Pronostico(new DateTime(2021, 02, 04), 21, 36.74);
        //Pronostico pronostico2 = new Pronostico(new DateTime(2021, 02, 05), 22, 80);
        //Pronostico pronostico3 = new Pronostico(new DateTime(2021, 02, 06), 25, 1.26);
        //Pronostico pronostico4 = new Pronostico(new DateTime(2021, 02, 07), 26, 0.42);
        //Pronostico pronostico5 = new Pronostico(new DateTime(2021, 02, 08), 28, 46.85);
        //Pronostico pronostico6 = new Pronostico(new DateTime(2021, 02, 09), 19, 4.21);
        //Pronostico pronostico7 = new Pronostico(new DateTime(2021, 02, 10), 22, 8.79);
        //Pronostico pronostico8 = new Pronostico(new DateTime(2021, 02, 11), 12, 0.69);
        //Pronostico pronostico9 = new Pronostico(new DateTime(2021, 02, 12), 18, 0.65);

    }
}