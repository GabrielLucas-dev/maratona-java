package academy.devGabriel.maratonajava.javaCore.expception.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando pessoa");
    }
}
