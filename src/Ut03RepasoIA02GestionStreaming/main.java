package Ut03RepasoIA02GestionStreaming;

import java.util.Arrays;

public class main {

    static void main(String[] args) {
        Contenido c1 = new Contenido("AAA", 112);
        Contenido c2 = new Contenido("BBB", 122);
        Contenido c3 = new Contenido("CCC", 70);

        Usuario u1 = new Usuario("Nat");

        u1.verContenido(c2);

        u1.hacerPremium();
        u1.verContenido(c2);
        u1.verContenido(c1);
        u1.verContenido(c3);


        System.out.println(Arrays.toString(u1.getHistorial()));
    }
}
