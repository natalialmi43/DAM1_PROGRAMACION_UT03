package Ut03RepasoIA02GestionStreaming;

public class Usuario {

    private String nombre;
    private boolean esPremium;
    private static final int MAX_SIZE = 5;
    private Contenido [] historial = new Contenido[MAX_SIZE];


    public Usuario(String nombre) {
        this.nombre = nombre;
        this.esPremium = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    public Contenido[] getHistorial() {
        return historial;
    }

    public void setHistorial(Contenido[] historial) {
        this.historial = historial;
    }

    public void verContenido(Contenido c){

        if (!esPremium && c.esLargo()){
            System.out.println("Error: Necesitas ser Premium para ver películas largas.");
            return;
        }
        c.marcarComoVisto();

        boolean guardado = false;

        // Buscar el primer hueco vacío (null)
        for (int i = 0; i < historial.length; i++) {
            if (historial[i] == null) {
                historial[i] = c;
                guardado = true;
            }
        }

        // Si no se guardó (estaba lleno), hay que rotar
        if (!guardado) {

            for (int i = 0; i < historial.length - 1; i++) {
                historial[i] = historial[i + 1]; // Va moviendo de derecha a izquierda. Deja vacio el .length-1
            }
            historial[historial.length - 1] = c; // Ponemos el nuevo en la última posición
        }
    }

    public void hacerPremium() {
        esPremium = true;
    }


}
