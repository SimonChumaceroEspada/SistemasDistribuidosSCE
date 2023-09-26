package parcial1;

import java.io.Serializable;

import java.io.Serializable;

public class Cuenta implements Serializable {
    Banco banco;
    String nrocuenta;
    String ci;
    String nombres;
    String apellidos;
    Double saldo;

    public Cuenta(Banco banco, String nrocuenta, String ci, String nombres, String apellidos, Double saldo) {
        this.banco = banco;
        this.nrocuenta = nrocuenta;
        this.ci = ci;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNrocuenta() {
        return this.nrocuenta;
    }

    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public String getCi() {
        return this.ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{" +
                " banco='" + getBanco() + "'" +
                ", nrocuenta='" + getNrocuenta() + "'" +
                ", ci='" + getCi() + "'" +
                ", nombres='" + getNombres() + "'" +
                ", apellidos='" + getApellidos() + "'" +
                ", saldo='" + getSaldo() + "'" +
                "}";
    }

}
