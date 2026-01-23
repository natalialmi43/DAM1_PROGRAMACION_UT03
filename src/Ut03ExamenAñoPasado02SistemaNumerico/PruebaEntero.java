package Ut03ExamenAñoPasado02SistemaNumerico;

public class PruebaEntero {
    static void main(String[] args) {


        Entero e1 = new Entero(3);
        Entero e2 = new Entero("4", 8);

        System.out.println(e1.getEntero());
        System.out.println(e1.enBinario());

        System.out.println(e2.getEntero());
        System.out.println(e2.enBinario());
    }
}
