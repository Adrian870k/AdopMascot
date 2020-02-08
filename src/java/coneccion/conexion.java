package coneccion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class conexion {

   Connection con;

    public Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "usuarioejemplo", "pablo");

        } catch (Exception e) {
            con = null;
        }
        return con;
    }
    /*  public static void main(String[] args) {
    Connection pruebaCon = conexion.getConnection();
    if (pruebaCon != null) {
    System.out.println("Conectado");
    System.out.println(""+pruebaCon);
    
    }else{
    System.out.println("Desconectado");}
    }*/

}
