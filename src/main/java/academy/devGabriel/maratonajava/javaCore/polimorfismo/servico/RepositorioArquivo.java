package academy.devGabriel.maratonajava.javaCore.polimorfismo.servico;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Arquivo");
    }
}
