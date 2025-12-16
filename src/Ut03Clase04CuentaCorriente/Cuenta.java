package Ut03Clase04CuentaCorriente;

import java.util.Scanner;

public class Cuenta {

    private  double saldo;

    //Constructor
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    //Getter
    public double getSaldo() {
        return saldo;
    }

    //toString
    public String toString() {
        return "Saldo: " + saldo;
    }

    // Metodos para calcular lo que pide
    public double imposicion (double ingreso){
        return this.saldo += ingreso;
    }

    public double reintegro (double retirada){
        return this.saldo -= retirada;
    }
}
