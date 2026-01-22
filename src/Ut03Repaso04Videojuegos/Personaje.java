package Ut03Repaso04Videojuegos;

public class Personaje {

    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean esMagico;
    final int MAXIMOVIDA  = 100;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public boolean isEsMagico() {
        return esMagico;
    }

    public void setEsMagico(boolean esMagico) {
        this.esMagico = esMagico;
    }


    public Personaje(String nombre, boolean esMagico) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntosVida = MAXIMOVIDA;
        this.esMagico = true;
    }

    public void recibirDaño (int daño) {

        if (this.esMagico){
            daño += 0.8;
            this.puntosVida -= daño;

            if (this.puntosVida < 0){
                this.puntosVida = 0;
            }
        }
    }


    public void curar (){

        if (nivel < 5){
            puntosVida += 10;
        } else {
            puntosVida += 25;
        }

        if (puntosVida >= MAXIMOVIDA){
            puntosVida = MAXIMOVIDA;
        }

    }

}
