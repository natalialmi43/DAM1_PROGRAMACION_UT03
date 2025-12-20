package Ut03Ejercicios02Persona;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private final static int infrapeso = -1;
    private final static int pesoIdeal = 0;
    private final static int sobrepeso = 1;

    //Getters, se añaden todos para que el programa pueda verlos.
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //Setters, se ponen solo los que se puedan modificar a posteriori. Ej. DNI no se puede modificar nunca.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Constructores:
    public Persona(String nombre) {
        this.nombre = nombre;
        this.sexo = 'H'; // Se añade H por defecto
        this.edad = 0; // Se añaden el resto de valores por defecto
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo); // Se añade el metodo porque nos pide comprobarlo
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public int IMC (){
        double IMC = (this.peso/(this.altura * this.altura));
        if(IMC > 25){
            return sobrepeso;
        } else if (IMC > 20 ) {
            return pesoIdeal;
        } else {
            return infrapeso;
        }
    }

    public boolean esMayorDeEdad(){
        if (this.edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm'){
            return 'M';
        } else {
            return 'H';
        }
    }

    public String toString (){
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", Sexo=" + sexo +
                ", Peso=" + peso + " kg" +
                ", Altura=" + altura + " m" +
                '}';
    }

    private String generaDNI() {

        String cadena = "";
        //Importante guardar las letras tal cual vienen en el ejemplo
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Casteamos con int y ademas se multiplica por 10 elevado a 8 para mover la coma 8 veces
        int n = (int) (Math.random() * 100000000);
        cadena += n;

        int resto = n % 23;
        char letra = letras[resto];
        cadena += letra;

        return cadena;

    }
}
