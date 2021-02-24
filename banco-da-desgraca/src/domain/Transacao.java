package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.conta.ContaBancaria;

import java.time.LocalDate;
import java.util.List;
//import br.com.banco.desgraca.domain.TipoTransacao;

public class Transacao {
    private br.com.banco.desgraca.domain.TipoTransacao tipo;
    private LocalDate data;
    private Double valor;


    public Transacao(br.com.banco.desgraca.domain.TipoTransacao tipo, LocalDate data, Double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;

    }
}
