public class Main {

    public static void main(String[] args){

        int valor1 = 3, valor2 = 6, mult = 0, resto = 0;
        Boolean maior = false;

        mult = valor1 * valor2;
        resto = valor2 % valor1;
        maior = valor2 > valor1;


        System.out.println("resultado multiplicação = " + mult);
        System.out.println("resto = " + resto);
        System.out.println("6 é maior que 3? " + maior);
    }
}
