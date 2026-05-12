package academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_PORCENTAGEM = 0.15;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
