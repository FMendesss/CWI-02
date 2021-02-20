package exercicio1;

public class Pessoa {
    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void imprimir () {
        System.out.println("Nome: " + nome + " Idade: " + idade + " Gênero: " + genero.getDescricao());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }


}

