package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements br.com.banco.desgraca.domain.conta.ContaBancaria {

    private Integer numero;
    private br.com.banco.desgraca.domain.InstituicaoBancaria instituicao;
    private Double saldo;

    private List<br.com.banco.desgraca.domain.Transacao> transacao = new ArrayList<>();

    public ContaCorrente(Integer numero, InstituicaoBancaria instituicao) {
        this.numero = numero;
        this.instituicao = instituicao;
    }



    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", instituicao=" + instituicao +
                '}';
    }

    void transferir(Double valor, br.com.banco.desgraca.domain.conta.ContaBancaria contaDestino) {

    }

    void sacar(Double valor) {
        if (this saldo >= valor){
            System.out.println("sacando " + valor + "da conta " + numero);
            this.saldo = this.saldo - valor;
            br.com.banco.desgraca.domain.Transacao transacao = new br.com.banco.desgraca.domain.Transacao(TipoTransacao.SAQUE, br.com.banco.desgraca.Data.getDataTransacao(), valor );
            this.transacao.add(transacao);

        }

        else{
            //FIXME exception falta de saldo
        }
    }
}