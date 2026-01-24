package Ut03RepasoIA01Flotas;

public class Vehiculo {

    private static final double MANTENIMIENTO = 200;
    private static final double CAPACIDADMCARGAMAX = 2000;

    private String idVehiculo;
    private double kilometraje;
    private double cargaActual;
    private String tipoMotor;

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Vehiculo(String idVehiculo, double kilometraje, double cargaActual, String tipoMotor) {
        this.idVehiculo = idVehiculo;
        this.kilometraje = kilometraje;
        this.cargaActual = cargaActual;
        this.tipoMotor = tipoMotor;
    }

    public double calcularCostoMantenimiento() {

        double precio = MANTENIMIENTO;

        if (kilometraje > 100000) {
            precio +=100;
        }

        if (tipoMotor.equalsIgnoreCase("Diesel")){
            precio *= 1.15;
        } else if (tipoMotor.equalsIgnoreCase("Gasolina")) {
            precio *= 1.1;
        } else if (tipoMotor.equalsIgnoreCase("Electrico")) {
            precio *=0.95;
        }

        return precio;
    }

    public boolean cargarPaquete(double pesoPaquete) {

        double pesofinal = pesoPaquete + cargaActual;

        if (pesofinal < CAPACIDADMCARGAMAX){
            this.cargaActual = pesofinal;
            return true;
        } else {
            System.out.println("Se supera la carga máxima");
            return false;
        }
    }

    public String obtenerCategoriaEmisiones(){

        String c = " ";
        if (tipoMotor.equalsIgnoreCase("Diesel")){
            c += "Industrial ";
        } else if (tipoMotor.equalsIgnoreCase("Gasolina")) {
            c += "Estandar";
        } else if (tipoMotor.equalsIgnoreCase("Electrico")) {
            c += "Eco";
        } else {
            c += "No valido";
        }
        return c;
    }

    public void realizarViaje(double distancia){

        if (distancia < 0){
            System.out.println("Error ");
        } else {
            this.kilometraje += distancia;
        }
    }
}
