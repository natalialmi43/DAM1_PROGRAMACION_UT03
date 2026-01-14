package Ut03Ejercicios04AvilaExpress;

/*
1.La Clase NaveEspacial

Atributos (privados):
nombre (String)
combustible (int): Valor entre 0 y 100.
capacidadCarga (double): En toneladas.
enMision (boolean): Indica si la nave está fuera trabajando.

Constructor: Debe recibir el nombre y la capacidadCarga. Al crearse, el combustible siempre empieza al 100 y enMision
siempre es false. Además, hay otro constructor que recibe sólo el nombre, ya que normalmente trabajan con un modelo
estándar con capacidad para 6 toneladas.

Métodos:
viajar(int distancia): Cada unidad de distancia consume 2 de combustible. Si tiene combustible suficiente, resta el gasto
y pone enMision a true. Si no tiene suficiente, muestra un mensaje: "Combustible insuficiente para la misión".
repostar(): Pone el combustible al 100 y enMision a false.
mostrarEstado(): Imprime una línea con todos los datos de la nave de forma elegante.
 */

public class NaveEspacial {

    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;


// Se mete solo en el parentesis lo que nos pida para "meter por escaner" si nos dan datos van solo en el this.
    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.combustible = 100;
        this.capacidadCarga = capacidadCarga;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
        this.capacidadCarga = 6;
    }

    public void  viajar (int distancia){

        int sobra = this.combustible - (distancia*2);

        if (sobra <0) {

        }

        if (this.combustible < distancia*2){
            System.out.println("Combustible de la " + this.nombre + " es insuficiente para la misión");
        } else {
            this.enMision = true;
            sobra= this.combustible - (distancia*2);
            this.combustible = sobra;
        }
    }

    public void repostar (){
        this.combustible =100;
        this.enMision = false;

    }


    public void mostrarEstado (){
        System.out.print( "La nave " + this.nombre + " tiene " + this.combustible + " de combustible, actualmente la capacidad de carga es de " + this.capacidadCarga);
        if (this.enMision){
            System.out.println(" y la nave esta en misión");
        } else {
            System.out.println(" y la nave no esta en misión");
        }
    }

    public int calcularCombustible (){
        return this.combustible;
    }



}
