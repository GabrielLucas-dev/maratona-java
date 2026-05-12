package academy.devGabriel.maratonajava.javaCore.modificadoresEstaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;   //static diz que faz parte da classe carro em si, e não as instacias (carro, carro2...)
                                                    // não pertence mais a uma instancia especifica, e sim a todas, incluindo em caso de alterações, todos os objetos criados a partir da classe vão compartilhar do mesmo valor

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("---------");
        System.out.println("Nome: " + nome + "\n"
                + "Velocidade max: " + velocidadeMax + "\n"
                + "Velocidade limite: " + Carro.velocidadeLimite
        );
    }

    // Atributo que pertence a classe e não as instacias/objetos
    public static void setVelocidadeLimite(double velocidadeLimite) {
        //"this" faz referencia a instancia, e pode não haver uma instacia, logo, dá erro
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
