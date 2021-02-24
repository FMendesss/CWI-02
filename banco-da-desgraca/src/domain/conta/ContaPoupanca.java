package domain.conta;

import domain.InstituicaoBancaria;

public class ContaPoupanca implements domain.conta.ContaBancaria {

    private Integer numero;
    private domain.InstituicaoBancaria instituicao;

    public ContaPoupanca(Integer numero, InstituicaoBancaria instituicao) {
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
}
