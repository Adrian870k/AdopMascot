/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class consultas extends conexion {

    public boolean autenticacion(String correo, String password) {
        PreparedStatement pst = null;

        ResultSet rs = null;
        try {
            String consulta = "select * from usuario where correo = ? and password = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, correo);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
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

        return false;
    }

    public boolean registrar(String nombre, int edad, int documento, int telefono, String correo, String password) {
        PreparedStatement pst = null;
        try {
            String consulta = "insert into usuario (nombre,edad,documento,telefono,correo,password) values(?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
            //pst.setInt(1, id);
            pst.setString(1, nombre);
            pst.setInt(2, edad);
            pst.setInt(3, documento);
            pst.setInt(4, telefono);
            pst.setString(5, correo);
            pst.setString(6, password);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("error" + e);
        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }

            } catch (Exception e) {
                System.err.println("error" + e);
            }
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
