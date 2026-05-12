package academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_PORCENTAGEM = 0.05;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_PORCENTAGEM;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
