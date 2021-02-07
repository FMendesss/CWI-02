package OO;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int portas;
    private float quantidadeDeCombustivel;
    private String estacionado;
    private String velocidadeAtual ;

    //Construtor

    public Carro(String marca, String modelo, int ano, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.portas = portas;
    }

    //Metodo
    public void abastecer(float quantidade){
        quantidadeDeCombustivel = quantidade;
    }

}
