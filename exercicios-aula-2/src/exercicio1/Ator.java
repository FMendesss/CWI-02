package exercicio1;

public class Ator {
    private String nome;
    private int idade;
    private int oscar;
    private Genero genero;

    public Ator(String nome, int idade, int oscar, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.oscar = oscar;
        this.genero = genero;
    }

    public void imprimir () {
        System.out.println("Nome: " + nome + " Idade: " + idade + " Gênero: " + genero.getDescricao());
    }

}
