package academy.devGabriel.maratonajava.javaCore.expception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExcepitonTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("src/main/java/academy/devGabriel/maratonajava/arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Criado? " + isCriado);
        } catch (IOException e) {
            //printa no console o erro (dentro da "árvore" stack)
            e.printStackTrace();
        }
    }
}

