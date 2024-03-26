
package com.mycompany.loginjpa.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int idUser;
    private String nombreUsuario;
    private String contracenia;

    public Usuario() {
    }

    public Usuario(int idUser, String nombreUsuario, String contracenia) {
        this.idUser = idUser;
        this.nombreUsuario = nombreUsuario;
        this.contracenia = contracenia;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContracenia() {
        return contracenia;
    }

    public void setContracenia(String contracenia) {
        this.contracenia = contracenia;
    }
    

    
}
