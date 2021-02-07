package OO;

//instancia

public class ExemploClasseObjeto {
    public static void main(String[] args) {
        Carro chevette = new Carro("Chevrolet", "Chevette", 1979, 4);
        Carro camaro = new Carro("Chevrolet", "Camaro", 2020, 2);

        chevette.abastecer(40);
        camaro.abastecer(50);
    }

}
