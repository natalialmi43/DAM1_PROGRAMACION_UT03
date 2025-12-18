package Ut03Ejercicios01Rectangulo;

public class PruebaRectangulo {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(4,8);

        System.out.println("El rectángulo es " + r1.comprueba());

        r1.dimension();

        System.out.println("El dibujo del rectángulo seria:");
        r1.dibujar();

    }
}
