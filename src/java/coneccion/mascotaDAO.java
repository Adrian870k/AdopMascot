/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import static coneccion.conexion.getConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class mascotaDAO {

    PreparedStatement pst = null;
    conexion cn = new conexion();

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listar() {
        List<mascota> lista = new ArrayList<>();
        String sql = "select * from soulmate.mascota";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mascota m = new mascota();
                m.setId(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setEspecie(rs.getString(3));
                m.setEdad(rs.getInt(4));
                m.setFoto(rs.getString(5));
                m.setDescripcion(rs.getString(6));
                m.setVacuna(rs.getString(7));
                m.setTelefono(rs.getInt(8));
                m.setCorreo(rs.getString(9));

                lista.add(m);

            }
        } catch (Exception e) {
            System.err.println("error");
        }
        return lista;
    }

    public List listarMisMascotas(String id) {
        List<mascota> lista = new ArrayList<>();
        String sql = "select * from soulmate.mascota where id_persona = '"+id+"'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mascota m = new mascota();
                m.setId(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setEspecie(rs.getString(3));
                m.setEdad(rs.getInt(4));
                m.setFoto(rs.getString(5));
                m.setDescripcion(rs.getString(6));
                m.setVacuna(rs.getString(7));
                m.setTelefono(rs.getInt(8));
                m.setCorreo(rs.getString(9));

                lista.add(m);

            }
        } catch (Exception e) {
            System.err.println("error");
        }
        return lista;
    }
    
    public void listarIMG(int id, HttpServletResponse response) {
        String sql = "select * from mascota where id = " + id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        response.setContentType("image/*");

        try {
            outputStream = response.getOutputStream();
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                inputStream = rs.getBinaryStream(5);

            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);

            }
        } catch (Exception e) {
        }
    }

    public void agregar(mascota m) {
        String sql = "insert into mascota(nombre,especie,edad,foto,descripcion,vacuna,telefono,correo,id_persona)values(?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setString(2, m.getEspecie());
            ps.setInt(3, m.getEdad());
            ps.setString(4, m.getFoto());
            ps.setString(5, m.getDescripcion());
            ps.setString(6, m.getVacuna());
            ps.setInt(7, m.getTelefono());
            ps.setString(8, m.getCorreo());
            ps.setInt(9, m.getDueño());

            ps.executeUpdate();
            

        } catch (Exception e) {
        }

    }
}
