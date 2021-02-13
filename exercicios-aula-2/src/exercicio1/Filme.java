package exercicio1;

public class Filme {

    private String nome;
    private String descricao;
    private int duracao;
    private int ano;
    private int avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, int duracao, int ano, int avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproduzir(){
        System.out.println(this.nome + " " + this.descricao + " " + this.duracao + " " + this.diretor.getNome());

    }
}
