package academy.devGabriel.maratonajava.javaCore.associacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void imprime() {
        System.out.println(nome + ", " + idade);
        System.out.println(seminario.getTitulo());
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
