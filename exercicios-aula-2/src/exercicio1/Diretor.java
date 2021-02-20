package exercicio1;

public class Diretor extends Pessoa{
   private int quantidadeFilmes;


    public Diretor(String nome, int idade, int quantidadeFilmes, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeFilmes = quantidadeFilmes;

    }

    @Override
    public void imprimir () {
        System.out.println("Diretor: " + getNome() + "." + " Quantidade de Filmes Dirigidos: " + quantidadeFilmes);
    }


    //é necessário criar um get publico para que a variavel nome possa ser usada em outras classes




}
