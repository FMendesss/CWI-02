package exercicio1;

public class Filme {

    private String nome;
    private String descricao;
    private int duracao;
    private int ano;
    private int avaliacao;
    private Diretor diretor;

    //a variavel 'diretor' é do tipo 'Diretor'

    public Filme(String nome, String descricao, int duracao, int ano, int avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.avaliacao = avaliacao;
        this.diretor = diretor;

        //o this permite usar o mesmo nome do atributo e variavel
        //quando não usar o mesmo nome não precisa o this, porem boa pratica é usar igual
    }

    public void reproduzir(){
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Diretor: " + this.diretor.getNome());
        System.out.println("");

        // usado getNome() para diretor para buscar essa variavel em outra classe
        // segurando ctrl e clicando no getNome se descobre a origem

    }
}
