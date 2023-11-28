using System;

namespace SERECU
{
    internal class Persona
    {
        public  string ci;
        public  string nombres;
        public  string primerApellido;
        public  string segundoApellido;
        public  DateTime fechaNacimiento;
        public  string sexo;
        public  string estadoCivil;

        public Persona(string ci, string nombres, string primerApellido, string segundoApellido, DateTime fechaNacimiento, string sexo, string estadoCivil)
        {
            this.ci = ci;
            this.nombres = nombres;
            this.primerApellido = primerApellido;
            this.segundoApellido = segundoApellido;
            this.fechaNacimiento = fechaNacimiento;
            this.sexo = sexo;
            this.estadoCivil = estadoCivil;
        }

    }
}