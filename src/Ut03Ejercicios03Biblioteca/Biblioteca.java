package Ut03Ejercicios03Biblioteca;

/*
3. El Main en la clase Biblioteca:
Crear un autor (ej: "Miguel de Cervantes", "Española").
Crear un libro pasando ese autor y el título "Don Quijote".
Intentar prestar el libro dos veces seguidas (la segunda debe fallar).
Llamar al método informacion() del libro para ver cómo imprime los datos de ambos objetos a la vez.
 */

public class Biblioteca {
    public static void main(String[] args) {

        Autor a1 = new Autor("Miguel de Cervantes", "Española");
        Libro l1 = new Libro("Don Quijote", a1);

        // probar metodo prestar
        l1.prestar();
        l1.prestar();
        l1.devolver();

        l1.informacion();


    }
}
