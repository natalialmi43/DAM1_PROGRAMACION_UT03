package Ut03Repaso01GestionInventario;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public void mostrarInfo (){
        System.out.println("El nombre del producto es: " + this.nombre + "\n" +
                "El precio es: " + this.precio + "\nEl stock es: " + this.stock);
    }
}
