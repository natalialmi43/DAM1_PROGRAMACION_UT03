package Ut03Ejercicios02Persona;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Teclea tu edad");
        int edad = sc.nextInt();
        System.out.println("Teclea tu sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("Teclea tu peso");
        double peso = sc.nextDouble();
        System.out.println("Teclea tu altura");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre,edad,sexo,peso, altura);

        Persona p2 = new Persona(nombre,edad,sexo);

        Persona p3 = new Persona(nombre);

        System.out.println("Resultados p1:");
        rtdosIMC(p1);
        esMayor(p1);

        System.out.println("Resultados p2:");
        rtdosIMC(p2);
        esMayor(p2);

        System.out.println("Resultados p3:");
        rtdosIMC(p3);
        esMayor(p3);


        sc.close();
    }

    public static void rtdosIMC (Persona p) {
        int imc = p.IMC();
        if (imc == -1) {
            System.out.println("IMC: Está por debajo de su peso ideal.");
        } else if (imc == 0) {
            System.out.println("IMC: Está en su peso ideal.");
        } else {
            System.out.println("IMC: Tiene sobrepeso.");
        }
    }

    public static void esMayor (Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}

