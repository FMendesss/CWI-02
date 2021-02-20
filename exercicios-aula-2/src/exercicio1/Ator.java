package exercicio1;

public class Ator extends Pessoa {
    private int oscar;

    public Ator(String nome, int idade, int oscar, Genero genero) {
        super(nome, idade, genero);
        this.oscar = oscar;

    }

    @Override
    public void imprimir () {
        System.out.println("Ator: " + getNome() + "." + " Quantidade de Oscars: " + oscar);
    }


}
