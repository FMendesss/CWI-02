package MCMD;

public class Imovel{
    private Endereco endereco;
    private Double valor;

    public Imovel(Endereco endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }





    public String apresentacao(){
        return "Imovel localizado no endereço " + endereco.getLogradouro() + "n" + endereco.getNumero()"." + "Valor: " + valor;
        //FIXME colocar demais atributos no endereço
        }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }
}
