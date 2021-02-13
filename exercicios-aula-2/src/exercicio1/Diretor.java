package exercicio1;

public class Diretor {
    private String nome;
    private int idade;
    private int quantidadeFilmes;
    private Genero genero;

    public Diretor(String nome, int idade, int quantidadeFilmes, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmes = quantidadeFilmes;
        this.genero = genero;
    }

    //é necessário criar um get publico para que a variavel nome possa ser usada em outras classes

public String getNome(){
        return nome;
}

    public void imprimir () {
        System.out.println("Nome: " + nome + " Idade: " + idade + " Gênero: " + genero.getDescricao());
    }


}
