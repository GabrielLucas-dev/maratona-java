package academy.devGabriel.maratonajava.javaCore.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissão ao banco de dados");
    }
}
