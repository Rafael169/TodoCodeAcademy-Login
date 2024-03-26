package com.mycompany.loginjpa.logica;

import com.mycompany.loginjpa.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPer = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contracenia) {

        String mensaje = "";
        List<Usuario> listaUsuario = controlPer.traerUsuario();
        
        for (Usuario usu : listaUsuario) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContracenia().equals(contracenia)) {
                    mensaje = "Usuario y contraceña correcta. Bienvenido";
                } 
                else {
                    mensaje = "Contraceña no valida";
                }
            } 
            else {
                mensaje = "Usuario no encontrado";
            }
        }
        return mensaje;
    }

}
