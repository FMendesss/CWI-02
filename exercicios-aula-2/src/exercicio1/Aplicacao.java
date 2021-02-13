package exercicio1;

public class Aplicacao {
    public static void main(String[] args) {

        Diretor alfred = new Diretor("Alfred Hitchcok", 121, 15);
        Diretor victor = new Diretor("Victor Flemming", 158, 12);

        Filme vento = new Filme("E o vento levou", "Classico de época", 238, 1939,4, victor);
        Filme psicose = new Filme("Psicose", "Terror clássico", 125, 1960,4, alfred);



        vento.reproduzir();
        psicose.reproduzir();
    }

}
