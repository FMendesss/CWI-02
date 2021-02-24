package domain;

import domain.Data;
import domain.conta.ContaBancaria;

import java.time.LocalDate;
import java.util.List;


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
