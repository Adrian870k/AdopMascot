/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.io.InputStream;

/**
 *
 * @author hp
 */
public class mascota {
    int id;
    String nombre;
    String especie;
    int edad;
    String foto;
    String descripcion;
    String vacuna;
    int telefono;
    String correo;
    int id_dueño;

    public mascota() {
        
    }

    public mascota(int id, String nombre, String especie, int edad, String foto, String descripcion, String vacuna,int telefono,String correo,int dueño) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.foto = foto;
        this.descripcion = descripcion;
        this.vacuna = vacuna;
        this.telefono = telefono;
        this.correo = correo;
        this.id_dueño = dueño;
    }

    

   
    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }
     public int getDueño() {
        return id_dueño;
    }

    public void setDueño(int dueño) {
        this.id_dueño = dueño;
    }
    
}
