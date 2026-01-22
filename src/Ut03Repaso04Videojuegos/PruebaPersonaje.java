package Ut03Repaso04Videojuegos;

public class PruebaPersonaje {

    static void main(String[] args) {

        Personaje p1 = new Personaje("Estrella", true);

        p1.recibirDaño(45);

        System.out.println(p1.getPuntosVida());

        p1.curar();
        System.out.println(p1.getPuntosVida());
    }
}
