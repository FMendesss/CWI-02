package Exercicios;

public class NotasAlunos {
    private String nome;
    private float nota1;
    private float nota2;
    boolean resultado;


    //Construtor

    public NotasAlunos(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Metodo

    public float calcularMedia(){

        float media = (nota1 + nota2)/2;
        System.out.println("O(A) aluno(a) " + nome + " ficou com media " + media );
        if (media>=7){
            System.out.println("O(A) aluno(a) " + nome + " foi aprovado" );
        }
        else{
            System.out.println("O(A) aluno(a) " + nome + " foi reprovado(a)" );
        }

        return media;


    }

}

