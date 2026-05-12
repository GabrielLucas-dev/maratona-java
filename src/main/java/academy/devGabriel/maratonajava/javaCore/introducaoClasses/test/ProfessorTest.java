package academy.devGabriel.maratonajava.javaCore.introducaoClasses.test;

import academy.devGabriel.maratonajava.javaCore.introducaoClasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Emerson Gerin";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println(professor.nome + "\n" + professor.idade + "\n" + professor.sexo);
    }
}
