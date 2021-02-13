package Exercicios;

public class Comparador {
    boolean a;
    public boolean menorQue (float valor1, float valor2){
        if (valor1 < valor2){
            a = true;
        }
        else{
            a = false;
        }

        return a;

    }
}

//return valor1 < valor2;