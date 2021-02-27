package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.SaqueCPException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca implements ContaBancaria{
    private Integer numero;
    private InstituicaoBancaria instituicao;
    private Double saldo;

    private List<Transacao> transacao = new ArrayList<>();

    public ContaPoupanca(Integer numero, InstituicaoBancaria instituicao) {
        this.numero = numero;
        this.instituicao = instituicao;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicao;
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
        if (valor >= 50) {
            if (this.saldo >= valor) {
                System.out.println("Sacando " + valor + "da conta " + numero);
                System.out.println("Cobrado taxa de 2%");
                Double taxa = 0.02 * valor;
                this.saldo = this.saldo - valor - taxa;
                Transacao transacao = new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor);
                this.transacao.add(transacao);

            }
            else {
                throw new SaldoInsuficienteException("A conta não possui saldo suficiente para a operação");
            }

        }
        else {
            throw new SaqueCPException ("Operação inválida: o valor mínimo para saque é de R$ 50,00");
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
                System.out.println("Cobrado taxa de 0,5%");
                Double taxa = 0.005 * valor;
                this.saldo = this.saldo - valor - taxa;
                contaDestino.depositar(valor);
                this.transacao.add(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
                this.transacao.add(transacao);


            }

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
