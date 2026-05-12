package academy.devGabriel.maratonajava.javaCore.interfaces.test;

import academy.devGabriel.maratonajava.javaCore.interfaces.dominio.DatabaseLoader;
import academy.devGabriel.maratonajava.javaCore.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        System.out.println("----------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
