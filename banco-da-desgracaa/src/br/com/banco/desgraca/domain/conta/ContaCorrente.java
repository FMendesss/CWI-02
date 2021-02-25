package br.com.banco.desgraca.domain.conta;


import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.SaqueCCException;

import java.time.LocalDate;
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
    public InstituicaoBancaria getInstituicaoBancaria() {
        return null;
    }

    @Override
    public Double consultarSaldo() {
        return null;
    }

    @Override
    public void depositar(Double valor) {
        System.out.println("Depositando " + valor + "na conta " + numero);
        this.saldo = this.saldo + valor;
        Transacao transacao = new Transacao(TipoTransacao.ENTRADA, Data.getDataTransacao(), valor);
        this.transacao.add(transacao);

    }

    @Override
    public void sacar(Double valor) {
        if (valor % 5 == 0) {
            if (this.saldo >= valor) {
                System.out.println("Sacando " + valor + "da conta " + numero);
                this.saldo = this.saldo - valor;
                Transacao transacao = new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor);
                this.transacao.add(transacao);

            }
            else {
                throw new SaldoInsuficienteException("A conta não possui saldo suficiente para a operação");
            }

        }
        else {
            throw new SaqueCCException("Operação inválida: o valor deve ser múltiplo de 5");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (this.saldo >= valor) {
            if (contaDestino.getInstituicaoBancaria() != instituicao) {
                System.out.println("transferindo " + valor + "da conta " + numero + "para a conta " + contaDestino);
                System.out.println("Cobrado taxa de 1%");
                Double taxa = 0.01 * valor;
                this.saldo = this.saldo - valor - taxa;
                contaDestino.depositar(valor);
                this.transacao.add(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
                this.transacao.add(transacao);
            }

            else {

                System.out.println("transferindo " + valor + "da conta " + numero + "para a conta " + contaDestino);
                this.saldo = this.saldo - valor;
                contaDestino.depositar(valor);
                this.transacao.add(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
                this.transacao.add(transacao);


            }

        } else {
            throw new SaldoInsuficienteException("A conta não possui saldo suficiente para a operação");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", instituicao=" + instituicao +
                '}';
    }
}
