package academy.devGabriel.maratonajava.javaCore.expception.exception.test;

import academy.devGabriel.maratonajava.javaCore.expception.exception.dominio.Leitor01;
import academy.devGabriel.maratonajava.javaCore.expception.exception.dominio.Leitor02;

import java.io.IOException;

public class TryWithResoursesTest01 {
    public static void main(String[] args) {
        lerArquivo();
        Leitor01 leitor = new Leitor01();
        leitor.close();
    }

    public static void lerArquivo(){
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()) {

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
