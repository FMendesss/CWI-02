package br.com.cwi.reset.exemploreset.controller;

import br.com.cwi.reset.exemploreset.Usuario;
import br.com.cwi.reset.exemploreset.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Random;

import java.util.List;

@RestController


public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/usuarios")

    @GetMapping
        public List<Usuario> getUsuario(){
        return usuarioService.obterUsuario();
    }

    @PostMapping
    public Usuario
    private int id = gerarId();



    @RequestMapping("/usuarios/1")

    @DeleteMapping





    @RequestMapping("/usuarios/1/esqueci-minha-senha")


private int gerarId(){
        Random random = new Random();
        int id = random.nextInt(9999);
        return id;
    }

}
