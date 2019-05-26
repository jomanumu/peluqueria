/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class producto {
    /**
     * ATRIBUTOS COMUNES
     */
    private String n_lote;
    private String nombre;
    private double precio;
    private String localizacion;
    private int stock;
    private String caducidad;
    
    /**
     * CONSTRUCTOR GENERAL
     */
    public producto(){
        this.n_lote = "";
        this.nombre = "";
        this.precio = 0;
        this.localizacion = "";
        this.stock = 0;
        this.caducidad = "";
    }    
    
    public producto(String n_lote, String nombre, double precio, String localizacion, int stock, String caducidad) {
        this.n_lote = n_lote;
        this.nombre = nombre;
        this.precio = precio;
        this.localizacion = localizacion;
        this.stock = stock;
        this.caducidad = caducidad;
    }
    
    /**
     * FUNCIONES GETTERS Y SETTERS
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getN_lote() {
        return n_lote;
    }

    public void setN_lote(String n_lote) {
        this.n_lote = n_lote;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    
}
