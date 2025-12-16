package Ut03Clase03Punto;

public class PruebaPunto {
    public static void main(String[] args) {

        Punto pA = new Punto(100,200);
        Punto pB = new Punto(400, 800);

        double distancia = pA.distancia(pB);
        System.out.println("La distancia seria: " + distancia);

    }
}
