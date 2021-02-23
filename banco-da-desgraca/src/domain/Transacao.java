package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;

public class Transacao {
    private br.com.banco.desgraca.domain.TipoTransacao tipo;
    private br.com.banco.desgraca.Data data;
    private Double valor;

    public Transacao(br.com.banco.desgraca.domain.TipoTransacao tipo, Data data, Double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }

}
