package academy.devGabriel.maratonajava.javaCore.polimorfismo.servico;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Computador;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Produto;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Tomate;

public class CalcularImposto {
    /*public double calcularImpostoComputador(Computador computador){
        System.out.println(computador.getNome());
        System.out.println("Preço: "+computador.getValor());
        System.out.println("Imposto sobre o computador: ");
        double imposto = computador.calcularImposto();
        System.out.println(imposto);
        return imposto;
    }

    public double calcularImpostoTomate(Tomate tomate){
        System.out.println(tomate.getNome());
        System.out.println("Preço: "+tomate.getValor());
        System.out.println("Imposto sobre o tomate: ");
        double imposto = tomate.calcularImposto();
        System.out.println(imposto);
        return imposto;
    }*/

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
