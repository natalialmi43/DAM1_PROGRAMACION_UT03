package Ut03Ejercicios05BatallaDeRobots;

import java.util.Random;

public class Robot {
    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;



    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public void setPotenciaAtaque(double potenciaAtaque) {
        this.potenciaAtaque = potenciaAtaque;
    }

    public double getBlindaje() {
        return blindaje;
    }

    public void setBlindaje(double blindaje) {
        this.blindaje = blindaje;
    }


    public Robot(String nombre, String modelo) {
        Random r = new Random();
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100;
        this.potenciaAtaque = r.nextDouble(10,20);
        this.blindaje = r.nextDouble(0,10);
    }


    public void mostrarEstadisticas() {

        System.out.println("El nombre es "+ this.nombre + "\nEl modelo es: "+ this.modelo + "\nTiene un " + this.vida + " de vida \nLa potencia de ataque es " + this.potenciaAtaque + " \nTiene un blindaje de " + this.blindaje + "\n" );
    }


    public void recibirDano(double cantidad){

        double danoReal = cantidad - this.blindaje;

        if (danoReal>0){
            this.vida -= danoReal;
            if (this.vida <0){
                this.vida = 0;
            }
        }
    }


    public void atacar (Robot enemigo){
        if (this.vida == 0){
            System.out.println("El robot" + this.nombre +" está destruido y no puede atacar");
        }
        else if (enemigo.vida == 0){
            System.out.println("El enemigo ya está vencido");
        } else {
            enemigo.recibirDano(this.potenciaAtaque);
        }
    }

    public boolean estaVivo() {
        if (this.vida > 0){
            return true;
        }
        else {
            return false;
        }
    }

}
