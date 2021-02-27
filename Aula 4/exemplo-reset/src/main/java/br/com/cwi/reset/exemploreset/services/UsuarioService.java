package br.com.cwi.reset.exemploreset.services;

import br.com.cwi.reset.exemploreset.Usuario;
import br.com.cwi.reset.exemploreset.exceptions.BadRequestException;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> obterUsuario(){
        return repository.getUsuario();

    }

    public Usuario criarUsuario(Usuario usuario){
        if(usuario.getId() == null || usuario.getNome() == null || usuario.getSenha() || usuario.getEmail()){
            throw new BadRequestException();

        }

        return repository.addUsuario(usuario);
    }



}
