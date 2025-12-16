package Ut03Clase04CuentaCorriente;

import java.util.Scanner;

public class Cuenta {

    private  double saldo;


    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString () {
        return "Saldo: " + saldo;
    }

    public double imposicion (double ingreso){
        return this.saldo += ingreso;
    }

    public double reintegro (double retirada){
        return this.saldo -= retirada;
    }
}
