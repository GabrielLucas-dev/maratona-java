package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num = 1;    //pelo que entendi, essas variaveis do tipo primitivo não alteram o valor dos parametros passados no metodo da classe Calculadora
        int num2 = 2;

        calculadora.alteraDoisValores(num, num2);
        System.out.println("dentro CalcualdoraTest04");
        System.out.println("num: " + num);
        System.out.println("num2: " + num2);
    }
}
