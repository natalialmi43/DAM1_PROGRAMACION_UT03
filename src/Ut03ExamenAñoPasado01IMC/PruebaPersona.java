package Ut03ExamenAñoPasado01IMC;

public class PruebaPersona {
    static void main(String[] args) {


        Persona p1 = new Persona(1.58,61);
        p1.mostrar();
        System.out.println("Su IMC es de " + p1.calcularIMC());
        System.out.println(p1.determinarCategoria());
    }
}
