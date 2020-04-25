package pruebasUnitarias;

import coneccion.consultas;
import static org.junit.Assert.*;
import org.junit.Test;


public class pruebaLogin {

    public static void main(String[] args) {
        System.out.println("¿Paso?: " + pruebaLoginUnitaria());
        

    }

    @Test
    public static boolean pruebaLoginUnitaria() {
        int expected = 10;
        boolean respuesta = false;
        consultas co = new consultas();
        int actual = 0;
        actual = co.autenticacion("juan@juan", "abc");
        if (actual != 0) {
            System.out.println("Id: " + actual);
            respuesta = true;

        }
        assertEquals(expected, actual);
        return respuesta;
    }
    
    @Test
    public static boolean pruebaLoginFallida() {
        int expected = 1213;
        boolean respuesta = false;
        consultas co = new consultas();
        int actual = 0;
        actual = co.autenticacion("juan@juan", "abc");
        if (actual != 0) {
            System.out.println("Id: " + actual);
            respuesta = true;

        }
        assertEquals(expected, actual);
        return respuesta;
    }

}
