package academy.devGabriel.maratonajava.javaCore.modificadoresEstaticos.test;

import academy.devGabriel.maratonajava.javaCore.modificadoresEstaticos.dominio.Carro;

public class CarroTest01 {
    //String nome           (Não pode ser acessado dentro do static main, por ter a possibilidade de não existir)
    //static String nome    (Pode ser acessado dentro do main, seu valor é inicializado antes de "carregar")
    public static void main(String[] args) {

    Carro carro = new Carro("BMW", 280);
    Carro carro2 = new Carro("Mercedes", 275);
    Carro carro3 = new Carro("Audi", 290);

    Carro.setVelocidadeLimite(180);   // afeta todas as instancias/objetos (carro, carro2 e carro3)

    carro.imprime();
    carro2.imprime();
    carro3.imprime();
    }
}
