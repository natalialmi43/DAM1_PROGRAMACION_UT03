package Ut03Clase04CuentaCorriente;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cA = new Cuenta(1);

        System.out.println(cA);

        cA.imposicion(100);
        System.out.println(cA);

        cA.reintegro(0.5);
        System.out.println(cA);


        //Esto se usuaria para imprimir si no tengo hecho el toString
        System.out.println(cA.getSaldo());

    }
}
