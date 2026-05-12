package academy.devGabriel.maratonajava.javaCore.polimorfismo.test;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Computador;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Produto;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
    Produto produto = new Computador("Mac Book Pro", 8000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        
        System.out.println("-----------");

        Produto produto2 = new Tomate("Tomate Americano", 6);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
