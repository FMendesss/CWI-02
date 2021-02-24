package domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class ContaDigital implements br.com.banco.desgraca.domain.conta.ContaBancaria {

    private Integer numero;
    private br.com.banco.desgraca.domain.InstituicaoBancaria instituicao;

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
