package Ut03Ejercicios03Biblioteca;

/*
1. La Clase Autor: Es la clase base que será un atributo de la otra.
Atributos privados: nombre (String) y nacionalidad (String).
Constructor: Que inicialice ambos campos.
Método: mostrarAutor() que devuelva un String con el formato: "Nombre (Nacionalidad)".
 */

public class Autor {

    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }


    public String mostrarAutor(){
        return (this.nombre + " (" + this.nacionalidad +")");
    }
}
