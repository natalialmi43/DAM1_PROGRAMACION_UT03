package Ut03Repaso03AlquilerVehiculos;

public class Vehiculo {

    private String modelo;
    private double tarifaBase;
    private boolean esElectrico;
    private int diasAlquiler;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifa) {
        this.tarifaBase = tarifa;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }


    public Vehiculo(String modelo, double tarifa, boolean esElectrico, int diasAlquiler) {
        this.modelo = modelo;
        this.tarifaBase = tarifa;
        this.esElectrico = esElectrico;
        this.diasAlquiler = diasAlquiler;
    }

    public double calcularPrecioFinal(int edadConductor) {
        double precioInicial = this.tarifaBase * this.diasAlquiler;

        if (edadConductor < 18 || edadConductor > 105){
            return 0;
        } else if (edadConductor < 25){
            precioInicial += 50;
        }

        if (this.diasAlquiler > 15) {
            precioInicial *= 0.90;
        } else if (this.diasAlquiler > 7) {
            precioInicial *= 0.80;
        }

        if (this.esElectrico){
            precioInicial -= -15;
        }

        return precioInicial;
    }

}
