package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        br.com.banco.desgraca.domain.conta.ContaBancaria contaA = new br.com.banco.desgraca.domain.conta.ContaCorrente(125, InstituicaoBancaria.NUBANK);

        contaA.depositar(1000);

    }
}