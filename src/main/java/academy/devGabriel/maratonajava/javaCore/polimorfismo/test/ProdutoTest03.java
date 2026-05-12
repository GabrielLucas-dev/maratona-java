package academy.devGabriel.maratonajava.javaCore.polimorfismo.test;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Computador;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Produto;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Tomate;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.servico.CalcularImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Mac Book Pro", 8000);
        CalcularImposto.calcularImposto(produto);

        System.out.println("_________");
        Tomate tomate = new Tomate("Cereja", 18);
        tomate.setDataValidade("13/05/2026");

        CalcularImposto.calcularImposto(tomate);
    }
}