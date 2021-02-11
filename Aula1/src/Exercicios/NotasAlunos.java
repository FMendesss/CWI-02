package Exercicios;

public class NotasAlunos {
    private String nome;
    private float nota1;
    private float nota2;

    //Construtor

    public NotasAlunos(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Metodo

    public void media(float media){
        media = (nota1 + nota2)/2;
    }

}

