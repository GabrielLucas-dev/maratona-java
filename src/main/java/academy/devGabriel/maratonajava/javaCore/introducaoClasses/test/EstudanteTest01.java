package academy.devGabriel.maratonajava.javaCore.introducaoClasses.test;

import academy.devGabriel.maratonajava.javaCore.introducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';
        System.out.println(estudante.nome +"\n"+ estudante.idade+"\n"+ estudante.sexo);
    }
}
