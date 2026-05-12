package academy.devGabriel.maratonajava.javaCore.modificarFinal.test;

import academy.devGabriel.maratonajava.javaCore.modificarFinal.dominio.Carro;
import academy.devGabriel.maratonajava.javaCore.modificarFinal.dominio.Comprador;
import academy.devGabriel.maratonajava.javaCore.modificarFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        /*
        os dados dentro do objeto podem ser alterado, mas a referencia não.
        ou seja, voce não pode instanciar novamente o comprador, impede que a variavel aponte para outro objeto
        */
        carro.COMPRADOR.setNome("Bielzera");
        //carro.COMPRADOR.setNome("Bielzera 2");    alterando o atributo (CERTO)
        //carro.COMPRADOR = new Comprador();        alterando a instancia (ERRADO)
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari");
        ferrari.imprime();
    }
}
