package academy.devGabriel.maratonajava.javaCore.introducaoClasses.test;

import academy.devGabriel.maratonajava.javaCore.introducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Citroen";
        carro.modelo = "C3";
        carro.ano = 2019;

        carro2.nome = "Chevrolet";
        carro2.modelo = "Spin";
        carro2.ano = 2025;

        System.out.println(carro.nome + "\n" + carro.modelo + "\n" + carro.ano);
        System.out.println("-------------");
        System.out.println(carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);
    }
}
