package academy.devGabriel.maratonajava.javaCore.modificarFinal.dominio;

//     nenhuma classe pode mais herdar de Carro
public /*final*/ class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;     // O static nesse caso é utilizado para voce poder utilizar a variavel em um ambiente static, como no psvm
    public final Comprador COMPRADOR = new Comprador();     // Muito utilizado no padrao Singleton

    // O metodo passa a não poder ser reescrito, nem modificado
    public final void imprime(){
        System.out.println("Carro: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
