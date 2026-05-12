package academy.devGabriel.maratonajava.javaCore.associacao.test;

import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Aluno;
import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Local;
import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Professor;
import academy.devGabriel.maratonajava.javaCore.associacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local endereco = new Local("Fenda do Bikini");
        Local endereco2 = new Local("Estufa da Sandy");

        Aluno aluno = new Aluno("Bob Esponja", 30);
        Aluno aluno2 = new Aluno("Patrick Estrela", 35);
        Aluno aluno3 = new Aluno("Lula Molusco", 40);
        Aluno aluno4 = new Aluno("Plankton", 38);
        Aluno aluno5 = new Aluno("Gary", 10);
        Aluno aluno6 = new Aluno("Águas vívas", 38);
        Aluno[] alunos = {aluno, aluno2, aluno3, aluno4};
        Aluno[] alunos2 = {aluno5, aluno6};

        Professor professor = new Professor("Seu Sirigueijo", "Hamburguer de Siri");
        Professor professor2 = new Professor("Sandy Cheakbox", "Estufas");


        Seminario seminario = new Seminario("Como Fazer o melhor Hamburguer de Siri", endereco, alunos);
        Seminario seminario2 = new Seminario("Administrando uma hamburgueria", endereco, alunos2);
        Seminario seminario3 = new Seminario("Como fazer uma estufa eficiente", endereco2, alunos2);

        Seminario[] seminariosProf = {seminario, seminario2};
        Seminario[] seminariosProf2 = {seminario3};
        professor.setSeminarios(seminariosProf);
        professor2.setSeminarios(seminariosProf2);

        //professor.imprime2();
        professor2.imprime2();

        /*seminario.imprime();
        seminario2.imprime();
        seminario3.imprime();

        System.out.println("_______");
        professor.imprime();
        professor2.imprime();

        System.out.println("_______");
        aluno.imprime();*/
    }
}
