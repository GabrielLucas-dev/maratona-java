package academy.devGabriel.maratonajava.javaCore.expception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
                                        //cria na assinatura do metodo (meio que obriga a utilizar um try catch no main, para tratar essa possivel Exception)
    public static void criarNovoArquivo() throws IOException {
        File file = new File("src/main/java/academy/devGabriel/maratonajava/arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Criado? " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
