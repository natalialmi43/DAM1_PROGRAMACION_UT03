package Ut03ExamenAñoPasado01IMC;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private double alturaEnMetros;
    private double pesoKg;
    private final double BAJO = 18.5;
    private final double NORMAL = 24.9;
    private final double SOBREPESO = 29.9;
    private final double OBESIDAD = 30;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAlturaEnMetros() {
        return alturaEnMetros;
    }

    public void setAlturaEnMetros(double alturaEnMetros) {
        this.alturaEnMetros = alturaEnMetros;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Persona(String nombre, String apellidos, int edad, double alturaEnMetros, double pesoKg) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.alturaEnMetros = alturaEnMetros;
        this.pesoKg = pesoKg;
    }

    public Persona(double alturaEnMetros, double pesoKg) {
        this.nombre = "El/la usuairio/a";
        this.edad = 30;
        this.alturaEnMetros = alturaEnMetros;
        this.pesoKg = pesoKg;
    }

    public double calcularIMC (){
        return pesoKg/ (alturaEnMetros*alturaEnMetros);
    }

    
    public String determinarCategoria (){
        double imc = calcularIMC();

        if (imc < BAJO){
            return "Bajo peso";
        } else if (imc < NORMAL){
            return "Peso normal";
        } else if (imc < SOBREPESO){
            return "Sobrepeso";
        } else{
            return "Obesidad";
        }



    }

    public void mostrar (){
        System.out.println(this.nombre + " pesa " + this.pesoKg + " kg y mide " + this.alturaEnMetros + " metros");
    }
    
    
}
