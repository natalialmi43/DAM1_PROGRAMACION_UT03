package Ut03ExamenAñoPasado02SistemaNumerico;

public class Entero {

    private int entero;

    public Entero(int entero) {
        this.entero = entero;
    }

    public Entero(String numeroTexto, int base) {
        this.entero = Integer.parseInt(numeroTexto,base);
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }


    public String enDecimal (){
        return Integer.toString(this.entero);
    }

    public String enBinario (){
        return Integer.toBinaryString(this.entero);
    }

    public String enOctal (){
        return Integer.toOctalString(this.entero);
    }

    public String enHexadecimal () {
        return Integer.toHexString(this.entero);
    }
}
