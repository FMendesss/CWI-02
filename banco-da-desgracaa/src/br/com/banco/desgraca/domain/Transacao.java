
package br.com.banco.desgraca.domain;

import java.time.LocalDate;

public class Transacao {

    private TipoTransacao tipo;
    private LocalDate data;
    private Double valor;


    public Transacao(TipoTransacao tipo, LocalDate data, Double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;

    }

}
