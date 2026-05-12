package academy.devGabriel.maratonajava.javaCore.interfaces.dominio;

public interface DataRemover {
    void remove();

    /*
    defualt faz com que o metodo deixe de ser abstrato
    com isso, ele não precisa prover uma implementação nas classes "filhas" dele, ele pode ser inicializado aqui mesmo
    */
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
