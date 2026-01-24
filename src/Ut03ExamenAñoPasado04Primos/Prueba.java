package Ut03ExamenAñoPasado04Primos;

public class Prueba {
    static void main(String[] args) {

        NumeroPrimo n1 = new NumeroPrimo(3);
        NumeroPrimo n2 = n1.siguiente();



        System.out.println("original " + n1.getPrimo());
        System.out.println("siguiente " + n2.getPrimo());
        System.out.println( "Posicion: " + n1.posicion());
        System.out.println("Suma: " + n1.sumaAnteriores());
    }
}
