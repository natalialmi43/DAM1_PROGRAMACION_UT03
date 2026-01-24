package Ut03RepasoIA01Flotas;

public class Prueba {
    static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("V1", 95000,450, "Diesel");

        v1.cargarPaquete(2500);
        v1.realizarViaje(6000);
        System.out.println(v1.calcularCostoMantenimiento());
    }
}
