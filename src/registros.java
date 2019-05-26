import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class registros {
    /**
     * ATRIBUTOS GENERALES
     */
    private String hora;
    private String nombre_cliente;
    private String telefono_cliente;
    
    /**
    * CONSTRCUTORES
    */
    
    public registros(){
        this.hora = "";
        this.nombre_cliente = "";
        this.telefono_cliente = "";
    }
    
    public registros(String hora, String nombre_cliente, String telefono_cliente) {
        this.hora = hora;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
    }
    
    /**
     * METODOS GETTERS Y SETTERS
     */
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }
    
    
    
}
