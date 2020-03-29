package coneccion;

import com.sun.mail.imap.protocol.ID;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class consultas extends conexion {

    public int autenticacion(String correo, String password) {
        PreparedStatement pst = null;
        mascota m = new mascota();

        ResultSet rs = null;
        int id = 0;
        try {
            String consulta = "select * from usuario where correo = ? and password = ?";
            
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, correo);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
                return id;
            }
        } catch (SQLException e) {
            System.err.print("Error" + e);
        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.print("Error" + e);
            }
        }

        return id;
    }

    public boolean registrar(String nombre, int edad, int documento, int telefono, String correo, String password) {
        Connection pruebaCon = conexion.getConnection();
        if (pruebaCon != null) {
            try {
                PreparedStatement pst;
                pst = getConnection().prepareStatement("insert into soulmate.usuario (nombre,edad,documento,telefono,correo,password) values(?,?,?,?,?,?)");
                pst.setString(1, nombre);
                pst.setInt(2, edad);
                pst.setInt(3, documento);
                pst.setInt(4, telefono);
                pst.setString(5, correo);
                pst.setString(6, password);

                if (pst.executeUpdate() == 1) {
                    System.out.println("yes");
                    return true;
                }

            } catch (Exception e) {
                System.err.println("error: " + e);
            } finally {
                try {
                    if (getConnection() != null) {
                        getConnection().close();
                    }

                } catch (Exception e) {
                    System.err.println("error" + e);
                }
            }

        } else {
            System.out.println("Desconectado");
        }
        return false;
    }

    /*public static void main(String[] args) {
        consultas co =  new consultas();
        System.out.println(co.registrar("pablo",Integer,17171,54,"pablo@correo", "1234"));
        
    }*/
    public static void main(String[] args) {
        consultas co = new consultas();
        System.out.println(co.autenticacion("pablo@correo", "1234"));

    }

}
