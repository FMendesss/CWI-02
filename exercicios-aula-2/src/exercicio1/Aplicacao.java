package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        Diretor alfred = new Diretor("Alfred Hitchcok", 121, 15, Genero.MASCULINO);
        Diretor victor = new Diretor("Victor Flemming", 158, 12, Genero.MASCULINO);

        Filme vento = new Filme("E o vento levou", "Classico de época", 238, 1939,4, new ArrayList<Pessoa>());
        Filme psicose = new Filme("Psicose", "Terror clássico", 125, 1960,4,  new ArrayList<Pessoa>());
        Filme clube = new Filme("Clube da Luta", "Terror clássico", 125, 1960,4, null);

        //adiciona itens na lista inicialmente vazia que é atributo dos filmes
        clube.adicionarDiretor(victor);


        Ator rami0 = new Ator("Rami0 Malek",31,1,Genero.MASCULINO);
        Ator rami1 = new Ator("Rami1 Malek",31,1,Genero.MASCULINO);
        Ator rami2 = new Ator("Rami2 Malek",31,1,Genero.MASCULINO);


        //cria lista para posteriormente adicionar como atributo no filme batman
        List<Pessoa> elenco = new ArrayList<>();
        elenco.add(alfred);
        elenco.add(rami0);
        elenco.add(rami1);
        elenco.add(rami2);

        Filme batman = new Filme("Batman vs Superman", "Terror clássico", 125, 1960,4, elenco);

        batman.exibirCreditos();
        clube.exibirCreditos();

//é necessario instanciar "diretor" antes do "filme" porque o diretor é atributo do filme

       /* vento.reproduzir();
        psicose.reproduzir();
        clube.reproduzir();
        batman.reproduzir();
        rami0.imprimir();
        victor.imprimir();*/
    }

}
