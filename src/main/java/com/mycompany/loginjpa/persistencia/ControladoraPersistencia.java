
package com.mycompany.loginjpa.persistencia;

import com.mycompany.loginjpa.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuario() {
        return usuJpa.findUsuarioEntities();
    }
    
}
