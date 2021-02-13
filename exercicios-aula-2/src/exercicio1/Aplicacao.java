package exercicio1;

public class Aplicacao {
    public static void main(String[] args) {

        Diretor alfred = new Diretor("Alfred Hitchcok", 121, 15, Genero.MASCULINO);
        Diretor victor = new Diretor("Victor Flemming", 158, 12, Genero.MASCULINO);

        Filme vento = new Filme("E o vento levou", "Classico de época", 238, 1939,4, victor);
        Filme psicose = new Filme("Psicose", "Terror clássico", 125, 1960,4, alfred);

        Ator rami = new Ator("Rami Malek",31,1,Genero.MASCULINO);


//é necessario instanciar "diretor" antes do "filme" porque o diretor é atributo do filme

        vento.reproduzir();
        psicose.reproduzir();
        rami.imprimir();
        victor.imprimir();
    }

}
