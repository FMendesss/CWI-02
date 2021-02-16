package MCMD;

public class Imovel {
    private Endereco endereco;
    private Double valor;

    public Imovel(String endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public String apresentacao(){

        return "Imovel localizado no endereço " + endereco + "." + "Valor: " + valor;

        }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }
}
