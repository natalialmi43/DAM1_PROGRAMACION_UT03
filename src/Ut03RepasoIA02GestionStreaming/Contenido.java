package Ut03RepasoIA02GestionStreaming;

public class Contenido {

    private String titulo;
    private int duracionMinutos;
    private boolean visto;
    private String genero;

    public Contenido(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.visto = false;
        this.genero = "Desconocido";
    }

    public Contenido(String titulo, int duracionMinutos, String genero) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.visto = false;
        this.genero = genero;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if( duracionMinutos < 0 ){
            this.duracionMinutos = 0;
        } else {
            this.duracionMinutos = duracionMinutos;
        }
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void marcarComoVisto() {
        visto = true;
        System.out.println(this.titulo + " ha sido reproducido.");
    }

    public boolean esLargo(){
        if (duracionMinutos > 120){
            return true;
        } else {
            return false;
        }
    }

    public String toString (){
        return "La pelicula " +this.titulo + "\n" +
                "genero: " + this.genero + " ...";

    }
}
