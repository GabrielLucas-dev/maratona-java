package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] array = new int[]{1, 7, 6, 3};
        int total = calculadora.somaArray(array);
        System.out.println(total);

        // Com VarArgs
        int total2 = calculadora.somaVarArgs(1,2,3,4,5);
        System.out.println(total2);

    }
}
