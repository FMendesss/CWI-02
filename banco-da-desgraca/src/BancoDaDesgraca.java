package domain;

import domain.InstituicaoBancaria;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaBancaria contaA = new ContaCorrente(125, InstituicaoBancaria.NUBANK);

        contaA.depositar(1000);

    }
}