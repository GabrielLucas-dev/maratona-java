package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraDevMagroEx2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] lista = new int[]{1, 2, 3};

        int[] listaVezesDois = calculadora.dobrarLista(lista);

        for(int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("----------");
        for(int i = 0; i < listaVezesDois.length; i++) {
            System.out.println(listaVezesDois[i]);
        }
    }
}
