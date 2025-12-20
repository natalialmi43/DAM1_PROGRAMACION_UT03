package Ut03Ejercicios01Rectangulo;

public class Rectangulo {

    private int ancho;
    private int largo;
    private int anchoPorDefecto = 1;
    private int largoPorDefecto = 2;


    // Se crea constructor sin parámetros
    public Rectangulo() {
        this.ancho = anchoPorDefecto;
        this.largo = largoPorDefecto;
    }

    //Se crea constructor con parámetros que revise que son positivos
    public Rectangulo(int ancho, int largo) {
        if (ancho > 0 ){
            this.ancho = ancho;
        } else {
            this.ancho = anchoPorDefecto;
        }

        if (largo > 0){
            this.largo = largo;
        } else {
          this.largo = largoPorDefecto;
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

    //Calcular y retornar el área
    public double area (){
        double area = this.ancho * this.largo;
        return area;
    }

    //Calcular y retornar el perímetro
    public double perimetro (){
        double perimetro = 2 * (this.ancho + this.largo);
        return perimetro;
    }

    // Horizontal o vertical
    public String comprueba (){
        if (this. largo > this.ancho){
            return "horizontal";
        } else {
            return "vertical";
        }
    }

    //Calcular diagonal
    public double diagonal () {
        double diagonal = Math.sqrt(this.ancho * this.ancho + this.largo * this.largo);
        return diagonal;
    }

    // Imprime la dimension
    public void dimension () {
        System.out.println("Estas son las dimensiones del rectángulo: ");
        System.out.println("El ancho es: " + this.ancho);
        System.out.println("El largo es: " + this.largo);
        System.out.println("El área  es "+ this.area());
        System.out.println("El perimetro es "+this.perimetro());
        System.out.println("La diagonal es "+this.diagonal());
    }

    public void dibujar (){
        for (int i = 1; i <= this.ancho; i++) {
            for (int j = 1; j <= this.largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Imprimir
    public String toString (){
        return "";
    }
}
