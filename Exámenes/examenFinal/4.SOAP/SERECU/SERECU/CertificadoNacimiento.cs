using System;

namespace SERECU
{
    internal class CertificadoNacimiento
    {

        public string ci;
        public string nombres;
        public string primerApellido;
        public string segundoApellido;
        public DateTime fechaNacimiento;
        public Persona personaPadre;
        public Persona personaMadre;

        public CertificadoNacimiento(string ci, string nombres, string primerApellido, string segundoApellido, DateTime fechaNacimiento, Persona personaPadre, Persona personaMadre)
        {
            this.ci = ci;
            this.nombres = nombres;
            this.primerApellido = primerApellido;
            this.segundoApellido = segundoApellido;
            this.fechaNacimiento = fechaNacimiento;
            this.personaPadre = personaPadre;
            this.personaMadre = personaMadre;
        }
    }
}