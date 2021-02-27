package br.com.cwi.reset.exemploreset.repository;

import br.com.cwi.reset.exemploreset.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    static List<Usuario> usuarios = new ArrayList();

    public List<Usuario> getUsuario(){
        return usuarios;

    }

    public Usuario addUsuario(Usuario usuario){
        usuarios.add(usuario);
        //return usuarios;

    }

}
