package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante2.nome = "Giovanna";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        estudante.imprime();
        estudante2.imprime();
    }
}
