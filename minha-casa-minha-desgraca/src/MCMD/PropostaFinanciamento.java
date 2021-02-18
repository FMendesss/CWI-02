package MCMD;

import java.util.Arrays;

public class PropostaFinanciamento {
    private Beneficiario beneficiario;
    private Imovel imovel;
    private int mesesParaPagamento;
    private UnidadeFederativa estado;


    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.mesesParaPagamento = mesesParaPagamento;
        }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     * <p>
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     * for equivalente a pelo menos 50% do valor do imóvel.
     * <p>
     * Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     * o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        Double valorImovel = imovel.getValor();
        Double validador = this.beneficiario.getSalario() * mesesParaPagamento;

        if(estado == UnidadeFederativa.SP) {
            if (validador >= (valorImovel * 0.65)) {
                imprimirPropostaAprovada();
            }
            else {
                imprimirPropostaNegada();
            }
        }

        else if(estado == UnidadeFederativa.RJ) {
            if (validador >= (valorImovel * 0.6)) {
                imprimirPropostaAprovada();

            }
            else {
                imprimirPropostaNegada();
            }
        }

        else{
            if (validador >= (valorImovel * 0.5)) {
                imprimirPropostaAprovada();
            }
            else {
                imprimirPropostaNegada();
            }

        }

        }

        private void imprimirPropostaAprovada(){
        System.out.println("Meus pêsames " + this.beneficiario.getNome());
        System.out.println("Seu financiamento para o imovel localizado no endereço");
        System.out.println(this.imovel.getEndereco());
        System.out.println("com o prazo de pagamento de " + mesesParaPagamento);
        System.out.println("foi aprovado");

        }

        private void imprimirPropostaNegada(){
        System.out.println("Prezado " + this.beneficiario.getNome() + " seu financiamento para o imovel localizado no endereço");
        System.out.println(this.imovel.getEndereco());
        System.out.println("com o prazo de pagamento de " + mesesParaPagamento);
        System.out.println("não foi aceito porque o sistema acredita que você não conseguirá pagar.");
        System.out.println("Favor ler os requisitos antes de fazer eu perder meu tempo analisando.");
        }

    }




