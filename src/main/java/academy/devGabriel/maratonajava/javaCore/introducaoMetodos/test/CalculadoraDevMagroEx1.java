package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraDevMagroEx1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        boolean result = calculadora.isPrimo(10);
        System.out.println(result);
    }
}
