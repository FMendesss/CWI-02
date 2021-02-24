package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaBancaria contaA = new ContaCorrente(125, InstituicaoBancaria.NUBANK);

        contaA.depositar(1000);

    }
}