package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("----------");
        System.out.println(this.nome + "\n" + this.idade + "\n" + this.sexo);
    }
}
