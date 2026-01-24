package Ut03ExamenAñoPasado05Seguros;

public class Persona {
    private String nombre;
    private int edad;
    private boolean esFumador;
    private String estadoSalud;

    private final static double BASE = 500;

    private final int LIMITE1 = 17;
    private final int LIMITE2 = 80;
    private final int MENOR25 = 25;
    private final int MAYOR40 = 40;
    private final int MAYOR60 = 60;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public Persona(String nombre, int edad, boolean esFumador, String estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.esFumador = esFumador;
        this.estadoSalud = estadoSalud;
    }

    public double calcularImporteSeguro(){
        double precio = BASE;

        if (edad < LIMITE1 || edad > LIMITE2){
            return 0.0000000000000000000000000;
        } else if (edad < MENOR25){
            precio = BASE * 1.20;
        } else if (edad < MAYOR40) {
            precio = BASE;
        } else  {
            precio = BASE * 1.1;
        }

        return precio;
    }

    public String evaluarRiesgo () {
        if (edad > MAYOR60 || (esFumador && estadoSalud.equalsIgnoreCase("malo"))) {
            return "Riesgo Alto";
        } else if ((edad > MAYOR40 && edad < MAYOR60) || (esFumador && estadoSalud.equalsIgnoreCase("excelente"))){
            return "Riesgo Moderado";
        } else {
            return "Riesgo Bajo";
        }
    }

    public boolean esApto (){
        if (edad > LIMITE2){
            return false;
        } else if (edad < LIMITE1){
            return false;
        } else {
            return true;
        }
    }

    public double aplicarPromo (String descuento){

        double importePromo = calcularImporteSeguro();
        if (descuento.equals("SALUD2026") && estadoSalud.equalsIgnoreCase("excelente")){
            importePromo *=0.95;
        }

        if (descuento.equals("NUEVO CLIENTE")){
            importePromo -= 20;
        }
        return importePromo;
    }

    public void imprimirPoliza (){
        System.out.println("La poliza de " + this.nombre.toUpperCase() + "tiene un costo final de " + this.BASE);
    }
}
