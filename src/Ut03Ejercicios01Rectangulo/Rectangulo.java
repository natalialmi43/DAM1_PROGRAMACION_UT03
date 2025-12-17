package Ut03Ejercicios01Rectangulo;

public class Rectangulo {

    private int ancho;
    private int largo;

    // Se crea constructor sin parametros
    public Rectangulo() {
        this.ancho = 1;
        this.largo = 2;
    }

    //Se crea constructor con parametros y que chequé que son positivos
    public Rectangulo(int ancho, int largo) {
        if (ancho > 0 ){
            this.ancho;
        } else {
            this.ancho = 1;
        }

        if (largo > 0){
            this.largo;
        } else {
          this.largo = 1;
        }
    }

    // Getter and setter
    public int getAncho() {
        return ancho;
    }

    // En el set se comprueba que sea positivo
    public void setAncho(int ancho) {
        if (ancho >0){
            this.ancho = ancho;
        } else {
            System.out.println("Error: el ancho debe ser un entero positivo");
        }
    }

    public int getLargo() {
        return largo;
    }

    // En el set se comprueba que sea positivo
    public void setLargo(int largo) {
        if (largo > 0){
            this.largo = largo;
        } else {
            System.out.println("Error: el largo debe ser un entero positivo");
        }
    }
}
