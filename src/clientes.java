/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class clientes {
    /**
     * ATRIBUTOS GENERALES
     */
    private String nombre;
    private String telefono;
    
    /**
     * CONSTRUCTOR GENERAL
     */
    public clientes (){
        this.nombre = "";
        this.telefono = "";
    }

    public clientes(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    /**
     * FUNCIONES GETTERS Y SETTERS
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
}
