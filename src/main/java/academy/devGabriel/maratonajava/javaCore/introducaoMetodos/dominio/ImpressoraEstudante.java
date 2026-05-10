package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante e) {
        System.out.println("----------");
        System.out.println(e.nome + "\n" + e.idade + "\n" + e.sexo);
    }
}
