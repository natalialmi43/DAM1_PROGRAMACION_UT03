package Ut03Clase05Coche;

public class Coche {

    // El static afecta a toda la clase, lo comparte toda la clase.
    static int numeroObjetos = 0;

    private  String matricula;
    private  String color;
    private  String marca;
    private  double km;


    public void conducir (int cuantosKMConcuces){
        km += cuantosKMConcuces;
    }

    public void pintar (String nuevoColor){
        color = nuevoColor;
    }

    public Coche(String matricula, String color, String marca, double km) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.km = km;
        numeroObjetos ++;
    }

    public Coche (String matricula, String color, String marca){
        this(matricula,color,marca,0);
    }

    public String toString (){
        return "("+ numeroObjetos+")coche de marca " + marca+ " y color "+ color + " con " + km + "km";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
