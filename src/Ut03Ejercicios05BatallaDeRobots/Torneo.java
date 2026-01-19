package Ut03Ejercicios05BatallaDeRobots;

public class Torneo {
    public static void main(String[] args) {

        Robot mazinger = new Robot("Mazinger", "metal");
        Robot optimus = new Robot("Optimos", "madera");

        mazinger.mostrarEstadisticas();
        optimus.mostrarEstadisticas();

        while (mazinger.estaVivo() && optimus.estaVivo()){
            mazinger.atacar(optimus);
            if (optimus.estaVivo()){
                optimus.atacar(mazinger);
            }
            System.out.println("Mazinger tiene " + mazinger.getVida() + " de vida");
            System.out.println("Optimus tiene "+ optimus.getVida()+ " de vida\n");
        }

        if(mazinger.estaVivo()){
            System.out.println("Mazinger esta vivo, y ha ganado");
        }

        if (optimus.estaVivo()){
            System.out.println("Optimus está vivo, y ha ganado");
        }
    }
}
