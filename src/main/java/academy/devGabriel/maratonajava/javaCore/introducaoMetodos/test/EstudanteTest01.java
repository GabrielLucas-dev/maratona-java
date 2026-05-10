package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Estudante;
import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante2.nome = "Giovanna";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        impressora.imprime(estudante);      // assim que o programa termina de ser executado, a variavel estudante "deixa de existir" para o metodo 'imprime'
        impressora.imprime(estudante2);
    }
}
