package Ut03Clase01ObjetoLibros;

public class EjemploLibros {
    public static void main(String[] args) {

        //Esto son los objetos con los parametros definidos.
        Libro libro01 = new Libro("Sapiens", "Yuval Noaḥ Harari", 2011, "Debate", 9780062316097l );
        Libro libro02= new Libro("El principito", "Antoine de Saint-Exupéry", 1943, "Debate", 9783140464079l);

        // Se usa el metodo y se imprime entero
        System.out.println(libro01);

    }
}
