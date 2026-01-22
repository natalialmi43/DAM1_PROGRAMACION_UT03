package Ut03Repaso02ElGimnasio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SocioTest {

    @Test
    void probarIds (){
        Socio socio1 = new Socio("José Luis");
        assertEquals(1, Socio.getContadorSocios());
        Socio socio2 = new Socio("María Perez");
        assertEquals(2, Socio.getContadorSocios());
    }

}