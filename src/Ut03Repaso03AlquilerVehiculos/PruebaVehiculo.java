package Ut03Repaso03AlquilerVehiculos;

public class PruebaVehiculo {

    static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Fiat", 4.50, true, 8);

        System.out.println(v1.calcularPrecioFinal(177));
    }
}
