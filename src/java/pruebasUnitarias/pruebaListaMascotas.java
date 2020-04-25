/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitarias;

import coneccion.mascota;
import coneccion.mascotaDAO;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author monto
 */
public class pruebaListaMascotas {

    public static void main(String[] args) {
        System.out.println("¿Paso?: " + pruebaListar());

    }

    @Test
    public static boolean pruebaListar() {
        int expected = 2;
        boolean respuesta = false;

        mascotaDAO co = new mascotaDAO();
        mascota ma = new mascota();

        //List<mascota> mas = co.listarMisMascotas("200");
        int actual = co.listarMisMascotas("9").size();
        System.out.println(actual);

        if (actual > 0) {
            respuesta = true;

        }
        assertEquals(expected, actual);
        return respuesta;
    }

}
