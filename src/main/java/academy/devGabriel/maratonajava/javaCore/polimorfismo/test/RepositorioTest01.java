package academy.devGabriel.maratonajava.javaCore.polimorfismo.test;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.repositorio.Repositorio;
import academy.devGabriel.maratonajava.javaCore.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar(); 
    }
}
