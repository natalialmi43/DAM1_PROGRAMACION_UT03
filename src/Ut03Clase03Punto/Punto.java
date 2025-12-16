package Ut03Clase03Punto;

public class Punto {

    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public String toString () {
        return "Punto (" + x + ", " + y+ ")";
    }


    // En el metodo usamos solo un parametro externo, porque el que queremos sacar forma parte del objeto
    // seria redundante volverle a llamar.
    public double distancia (Punto otroPunto){

        // El dos se pone porque Math.pow dice que lo eleves y 2, seria al cuadrado
        double distancia = Math.sqrt(Math.pow(this.x - otroPunto.x,2) + (Math.pow(this.y - otroPunto.y,2)));
        return distancia;
    }

}
