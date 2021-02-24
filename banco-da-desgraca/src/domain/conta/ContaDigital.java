package domain.conta;

import InstituicaoBancaria;

public class ContaDigital implements domain.conta.ContaBancaria {

    private Integer numero;
    private domain.InstituicaoBancaria instituicao;

    public ContaDigital(Integer numero, InstituicaoBancaria instituicao) {
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
