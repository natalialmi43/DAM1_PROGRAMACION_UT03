package Ut03Clase05Coche;

public class PruebaCoche {
    public static void main(String[] args) {

        Coche cocheLaura = new Coche("548945F", "azul", "ford");
        System.out.println(cocheLaura);
        cocheLaura.conducir(120);
        System.out.println(cocheLaura);
        cocheLaura.conducir(130);
        System.out.println(cocheLaura);

        // Dos variables apuntan a un mismo objeto
        Coche cocheMartin = cocheLaura;
        cocheMartin.conducir(100);
        System.out.println(cocheLaura);

        // Un nuevo objeto
        Coche cocheJose = new Coche("54545G", "verde", "opel", 3400);
        System.out.println(cocheJose);

        // Un nuevo objeto, la flecha de la variable apunta a un nuevo objeto
        cocheMartin = new Coche("54564G", "rojo", "peugot", 4500);
        System.out.println(cocheMartin);
        cocheMartin.conducir(100);
        System.out.println("Martin: " +cocheMartin);
        System.out.println("Laura: "+ cocheLaura);

        // Un nuevo objeto, la flecha de la variable apunta a un nuevo obejto
        cocheJose = new Coche("65458F", "rojo", "Ferrari", 12000);
        System.out.println(cocheJose);

        /*
        Si ninguna flecha esta apuntando al objeto el "contador" queda a 0, y ahí Java lo elimina
        se guarda en el GC (Garbage Collector)
        */
    }
}
