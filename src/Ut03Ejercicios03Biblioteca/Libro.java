package Ut03Ejercicios03Biblioteca;

/*
2. La Clase Libro:
Atributos privados:
titulo (String)
escritor (Autor): Aquí aplicamos la composición.
prestado (boolean): Por defecto será false.
Constructor: Debe recibir el título y un objeto de tipo Autor.
Métodos:
prestar(): Si el libro no está prestado, cambia el estado a true y muestra: "Has alquilado [titulo]". Si ya está prestado, muestra: "Error: [titulo] no está disponible".
devolver(): Cambia el estado a false.
informacion(): Imprime el título del libro y usa el método del autor para mostrar quién lo escribió.
 */

public class Libro {

    private String titulo;
    private Autor escritor;
    private boolean prestado;


    public Libro(String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.prestado = false;

    }

    public void prestar (){

        if (this.prestado == false){
            this.prestado = true;
            System.out.println("Has alquilado " + this.titulo);
        } else {
            System.out.println("Error: " +  this.titulo + " no está disponible");
        }
    }

    public void devolver (){
        this.prestado = false;
    }

    public void informacion (){
        System.out.println("El libro " + this.titulo + " lo ha escrito " + escritor.mostrarAutor());
    }
}
