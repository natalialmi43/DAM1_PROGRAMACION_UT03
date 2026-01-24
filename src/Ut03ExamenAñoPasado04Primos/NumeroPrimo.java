package Ut03ExamenAñoPasado04Primos;

public class NumeroPrimo {

    private int primo;

    public int getPrimo() {
        return primo;
    }

    public void setPrimo(int primo) {
        this.primo = primo;
    }

    public NumeroPrimo(int primo) {
        this.primo = primo;
    }


    public boolean esPrimo (){

        //Se devuevle directamente el false
        if(this.primo < 2){
            return false;
        }

        // Empezamos a dividir en 2 porque el 1 siempre va a dar % = 0
        // Si no se encuentran divisores en la primera mitad, no habra en la segunda. Eficiencia
        // Se corta en cuanto encuentra 1 porque ya no va a llegar a dividirse entre si mismo si no es primo
        for (int i = 2; i <= this.primo / 2; i++) {
            if (this.primo % i == 0){
                return false;
            }
        }

        return true;
    }

    public NumeroPrimo siguiente (){

        int posiblePrimo = this.primo + 1;

        // Esto es un while infinito hasta que encuentre el siguiente, sale del bucle con el return.
        while (true){
            // Se crea el objeto.
            NumeroPrimo siguiente = new NumeroPrimo(posiblePrimo);

            if (siguiente.esPrimo()){
                return siguiente;
            }
            //imp no olvidar el ++
            posiblePrimo++;
        }
    }


    public int posicion (){
        int k = 0;

        for (int i = 2; i <= this.primo ; i++) {
            //Se crea este objeto para preguntar a i si es primo y luego se pasa por esPrimo().
            NumeroPrimo aux = new NumeroPrimo(i);
            if(aux.esPrimo()){
                k++;
            }
        }
        return k;
    }


    public int sumaAnteriores () {
        int suma = 0;

        for (int i = 2; i < this.primo; i++) {

            NumeroPrimo aux = new NumeroPrimo(i);

            if (aux.esPrimo()){
                suma += i;
            }
        }
        return suma;
    }
}
