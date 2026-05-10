package academy.devGabriel.maratonajava.javaCore.associacao.dominio;

public class Local {
    private String endereco;

    public void imprime() {
        System.out.println(endereco);
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
