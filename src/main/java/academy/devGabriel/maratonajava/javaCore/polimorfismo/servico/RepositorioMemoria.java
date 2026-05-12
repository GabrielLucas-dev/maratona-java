package academy.devGabriel.maratonajava.javaCore.polimorfismo.servico;

import academy.devGabriel.maratonajava.javaCore.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Memória");
    }
}
