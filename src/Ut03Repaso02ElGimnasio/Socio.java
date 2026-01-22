package Ut03Repaso02ElGimnasio;

public class Socio {

    static int contadorSocios = 0;
    private int id;
    private String nombre;

    public Socio(String nombre) {
        this.nombre = nombre;
        contadorSocios++;
        this.id = contadorSocios;
    }

    static int getContadorSocios() {
        return contadorSocios;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}