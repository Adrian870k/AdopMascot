/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;


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
        String sql = "SELECT ms.idMascota,ms.nombre,tm.nombre,ms.edad,ms.foto,ms.descripcion,ms.vacuna,ms.telefono,ms.correo,ms.id_persona "
                + "FROM soulmate.mascota ms inner join soulmate.tipo_especie tm on ms.id_especie = tm.id_especie";
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
    
    public List listaFlitrada(int especie){
        List<mascota> lista = new ArrayList<>();
        String sql = "SELECT ms.idMascota,ms.nombre,tm.nombre,ms.edad,ms.foto,ms.descripcion,ms.vacuna,ms.telefono,ms.correo,ms.id_persona "
                + "FROM soulmate.mascota ms inner join soulmate.tipo_especie tm on ms.id_especie = tm.id_especie where ms.id_especie ="+especie;
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
    
    public List mascotaAdoptar(String id){
        List<mascota> lista = new ArrayList<>();
        System.out.println("!!id. "+id);
        String sql = "select ms.idMascota,ms.nombre,tm.nombre,ms.edad,ms.foto,ms.descripcion,ms.vacuna,ms.telefono,ms.correo,ms.id_persona "
                + "from soulmate.mascota ms inner join soulmate.tipo_especie tm on ms.id_especie = tm.id_especie where ms.idMascota = "+id;
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
            System.out.println(""+lista.get(0).nombre+"d");
        } catch (Exception e) {
            System.err.println("error");
        }
        return lista;
    }
    
    public void eliminarMascota(String id){
        String sql = "DELETE FROM soulmate.mascota WHERE (`idMascota` = '"+id+"');";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al borrar la mascota "+ e);
        }
        
    }    
    public List listarMisMascotas(String id) {
        List<mascota> lista = new ArrayList<>();
        String sql = "select ms.idMascota,ms.nombre,tm.nombre,ms.edad,ms.foto,ms.descripcion,ms.vacuna,ms.telefono,ms.correo,ms.id_persona "
                + "from soulmate.mascota ms inner join soulmate.tipo_especie tm on ms.id_especie = tm.id_especie where ms.id_persona = '"+id+"'";
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
    


    public void agregar(mascota m) {
        String sql = "insert into mascota(nombre,id_especie,edad,foto,descripcion,vacuna,telefono,correo,id_persona)values(?,?,?,?,?,?,?,?,?)";
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
