/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author monto
 */
public class metodosAlternos {

    public String rutaCarpeta()  throws IOException{
        String ruta = "";
        File f = new File("."); // Creamos un objeto file
        ruta = f.getCanonicalPath();
        System.out.println("ruta necesaria: " + f.getCanonicalPath());
        System.out.println("una: "+ruta);
        return ruta; 
    }

}
