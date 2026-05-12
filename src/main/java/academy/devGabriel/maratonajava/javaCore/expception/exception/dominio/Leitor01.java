package academy.devGabriel.maratonajava.javaCore.expception.exception.dominio;

import java.io.Closeable;

public class Leitor01 implements Closeable {
    @Override
    public void close() {
        System.out.println("fechando conexão leitor01");
    }
}
