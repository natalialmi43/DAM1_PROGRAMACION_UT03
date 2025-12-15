package Ut03Clase01ObjetoLibros;

public class Libro {

    // Se meten las variables
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String editorial;
    private long ISBN;

    // Se hace el constructor para ver que queremos rellenar en el main. Se pueden tener varios, sobrecarga ok, pero
    // tiene que haber diferencias, es decir no coger dos veces un String, por ej. coger un String y un int.
    public Libro(String titulo, String autor, int anioPublicacion, String editorial, long ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    // Getter (obtener info) and setter (añadir info)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    // "Metodo" para imprimirlo

    public String toString () {
        return ("Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Año: " + this.anioPublicacion + "\n" +
                "Editorial: " + this.editorial + "\n" +
                "ISBN " + this.ISBN);
    }

}