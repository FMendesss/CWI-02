package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String nome;
    private String descricao;
    private int duracao;
    private int ano;
    private int avaliacao;
    private List<Pessoa> elenco;

    //a variavel 'diretor' é do tipo 'Diretor'

    public Filme(String nome, String descricao, int duracao, int ano, int avaliacao, List<Pessoa> elenco) {
        defineAvaliacaoConformeRange(avaliacao);
        defineAvaliacaoComBaseNoNome(nome);
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.elenco = elenco;

        //o this permite usar o mesmo nome do atributo e variavel
        //quando não usar o mesmo nome não precisa o this, porem boa pratica é usar
    }

    public void reproduzir(){
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("");

        // usado getNome() para diretor para buscar essa variavel em outra classe
        // segurando ctrl e clicando no getNome se descobre a origem

    }

    private void defineAvaliacaoConformeRange(Integer avaliacao){
        if(avaliacao <1 || avaliacao >5 ){
            this.avaliacao = 3;
        }
        else {
            this.avaliacao = avaliacao;
        }


    }

    private void defineAvaliacaoComBaseNoNome(String nome) {
        if ("Batman vs Superman".equals(nome)) {
            this.avaliacao = 1;

        }

        if ("Clube da Luta".equals(nome)) {
            this.avaliacao = 5;

        }

    }
    public void adicionarAtor(Ator ator){
        this.elenco.add(ator);
    }

    public void adicionarDiretor(Diretor diretor){
        if (this.elenco == null){
            this.elenco = new ArrayList<>();
        }
        this.elenco.add(diretor);
    }

    public void exibirCreditos(){
        for (Pessoa pessoa : elenco){
            pessoa.imprimir();
        }
    }


}
