package Ut03Ejercicios04AvilaExpress;

/*
2.La Clase ControladorFlota
En el método main:
Crea un Array para almacenar 3 naves.
//Instancia las 3 naves con nombres y capacidades distintas.
Simula la siguiente situación:
Haz que la primera nave viaje una distancia de 30.
Haz que la segunda nave viaje una distancia de 60.
Muestra el estado de todas las naves usando un bucle for o for-each.
Reposta la nave que se quedó sin combustible y vuelve a mostrar su estado.
Muestra cual es la nave que tiene más energía actualmente.
 */

public class ControladorFlota {
    public static void main(String[] args) {

        //Se inicializan
        NaveEspacial n1 = new NaveEspacial("Nave Blanca", 3.3);
        NaveEspacial n2 = new NaveEspacial("Nave Azul", 9.7);
        NaveEspacial n3 = new NaveEspacial("Nave Negra", 10.8);

        //Se meten al array
        NaveEspacial [] flota = new NaveEspacial[3];
        flota[0] = n1;
        flota[1] = n2;
        flota[2] = n3;

        //Si no, se puede hacer declarandolo directamente en flota [] = new NaveEspacial..., y luego llamar a los metodos como flota [].viajar

        //Metodos
        n1.viajar(30);
        n2.viajar(60);

        //For each
        for (NaveEspacial n : flota){ // Para cada nave espacial del array flota, muestra estado
            n.mostrarEstado();
        }

        //Repostar y mostrar estado
        n2.repostar();
        n2.mostrarEstado();

        //Mostrar nave con mas combustible
        /*
        if (n1.calcularCombustible()>=n2.calcularCombustible() && n1.calcularCombustible()>=n3.calcularCombustible()){
            System.out.println("La nave con mas energia es la nave Blanca");
        } else if (n2.calcularCombustible()>= n1.calcularCombustible() && n2.calcularCombustible()>= n3.calcularCombustible()) {
            System.out.println("La nave con mas energia es la nave Azul");
        } else {
            System.out.println("La nave con mas energia es la nave Negra");
        }
         */

        for (int i = 0; i < flota.length; i++) {
            if (flota[i]>flota[i+1]){


            }
        }
    }
}
