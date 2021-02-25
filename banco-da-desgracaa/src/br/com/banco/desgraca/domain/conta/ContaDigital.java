package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.SaqueCCException;
import br.com.banco.desgraca.exception.SaqueCDException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaDigital implements ContaBancaria{
    private Integer numero;
    private InstituicaoBancaria instituicao;
    private Double saldo;

    private List<Transacao> transacao = new ArrayList<>();

    public ContaDigital(Integer numero, InstituicaoBancaria instituicao) {
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
        if (valor >= 10) {
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
            throw new SaqueCDException("Operação inválida: o valor minimo para saque é R$ 10,00");
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (this.saldo >= valor) {
                System.out.println("transferindo " + valor + "da conta " + numero + "para a conta " + contaDestino);
                this.saldo = this.saldo - valor;
                contaDestino.depositar(valor);
                this.transacao.add(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
                this.transacao.add(transacao);
            }

        else {
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



