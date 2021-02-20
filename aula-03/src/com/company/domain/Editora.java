package com.company.domain;

import com.company.exceptions.EditoraException;

public class Editora {
    private String nome;
    private String localizacao;

    public Editora(final String nome, final String localizacao) {

        this.nome = nome;
        this.localizacao = localizacao;
        validarNome(nome);
        }

    public void validarNome(nome) {

        if (nome.equals("DC Comics")){
            throw new EditoraException("O nome não pode ser DC Comics");
        }

    }

    public String getNome() {
        return nome;
    }
}
