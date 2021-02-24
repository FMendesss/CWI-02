package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements ContaBancaria {
    private Integer numero;
    private InstituicaoBancaria instituicao;
    private Double saldo;

    private List<Transacao> transacao = new ArrayList<>();

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

    void transferir(Double valor, ContaBancaria contaDestino) {
        if()

    }

    void sacar(Double valor) {
        if (valor % 5 == 0) {
            if (this saldo >= valor){
                System.out.println("sacando " + valor + "da conta " + numero);
                this.saldo = this.saldo - valor;
                Transacao transacao = new Transacao(TipoTransacao.SAQUE, br.com.banco.desgraca.Data.getDataTransacao(), valor);
                this.transacao.add(transacao);

            }

        else{
                //FIXME exception saldo insuficiente
            }

        }

        else{
            //FIXME exception divisivel por 5
        }
    }

}
