package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaBancaria contaA = new ContaCorrente(125, InstituicaoBancaria.NUBANK);
        ContaBancaria contaB = new ContaCorrente(126, InstituicaoBancaria.BANCO_DO_BRASIL);

        ContaBancaria contaC = new ContaPoupanca(127, InstituicaoBancaria.ITAU);
        ContaBancaria contaD = new ContaPoupanca(128, InstituicaoBancaria.CAIXA);

        contaA.depositar(1000.0);
        contaB.depositar(1000.0);


        contaB.transferir(200.0, contaA);


    }
}