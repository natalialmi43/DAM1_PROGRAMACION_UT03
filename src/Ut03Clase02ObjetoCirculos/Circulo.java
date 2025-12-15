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

    //Se crean metodos, no hace falta incluir en parametro entre parentesis, se añade el this
    public double area () {
        double area = Math.PI*(this.radio*this.radio);
        return area;
    }

    public double perimetro () {
        double perimetro = 2*Math.PI*this.radio;
        return perimetro;
    }

    public String toString () {
        return ("Teniendo un radio de " + radio + " el ciculo tiene un area de " + area () + " y un perimetro de " +  perimetro());

    }


}
