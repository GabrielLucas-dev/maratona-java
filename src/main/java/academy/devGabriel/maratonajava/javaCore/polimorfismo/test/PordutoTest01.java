package academy.devGabriel.maratonajava.javaCore.polimorfismo.test;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Computador;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Produto;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Televisao;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio.Tomate;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.servico.CalcularImposto;

public class PordutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ASUS Vivobook", 3000);
        Tomate tomate = new Tomate("Tomate Cereja", 18);
        Televisao tv = new Televisao("Sansung 303", 7000);

        /*CalcularImposto calculadoraImposto = new CalcularImposto();*/
        CalcularImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalcularImposto.calcularImposto(tv);



    }
}

