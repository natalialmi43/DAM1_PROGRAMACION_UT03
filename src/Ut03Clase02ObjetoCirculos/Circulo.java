package Ut03Clase02ObjetoCirculos;

public class Circulo {

    // Se meten variables
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter and setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Se crean metodos
    public double area (double radio) {
        double area = Math.PI*(radio*radio);
        return area;
    }

    public double perimetro (double radio) {
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }

    public String toString () {
        return ("Teniendo un radio de " + radio + " el ciculo tiene un area de " + area(radio) + " y un perimetro de " +  perimetro(radio));

    }


}
