package academy.devGabriel.maratonajava.javaCore.polimorfismo.dominio;

public class Televisao extends Produto {
    public static final double PORCENTAGEM_IMPOSTO = 0.12;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * PORCENTAGEM_IMPOSTO;
    }
}
