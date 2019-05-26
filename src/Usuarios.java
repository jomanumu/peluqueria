
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KL1917
 */
public class Usuarios extends trabajador{
    private String nomusu;
    private String password;
    private boolean admin;

    public Usuarios(String nomusu, String password, boolean admin, String nombre, String DNI, File curriculum, String telefono, String email) {
        super(nombre, DNI, curriculum, telefono, email);
        this.nomusu = nomusu;
        this.password = password;
        this.admin = admin;
    }

    public Usuarios(String nomusu, String password, boolean admin) {
        this.nomusu = nomusu;
        this.password = password;
        this.admin = admin;
    }
    
    
    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
