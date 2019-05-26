
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class trabajador {
    /**
     * VARIABLES GLOBALES DE LA CLASE trabajador
     */
    private String nombre;
    private String DNI;
    private File curriculum;
    private String telefono;
    private String email;
    private String admin;
    
    /**
     * FUNCIÓN CONSTRUCTOR INICIAL
     */
    public trabajador(){
        this.nombre = "";
        this.DNI = "";
        this.curriculum = null;
        this.telefono = "";
        this.email = "";
        this.admin = "";
    }

    public trabajador(String nombre, String DNI, File curriculum, String telefono, String email, String admin) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.curriculum = curriculum;
        this.telefono = telefono;
        this.email = email;
        this.admin = admin;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public File getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(File curriculum) {
        this.curriculum = curriculum;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
    
}
