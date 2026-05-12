package academy.devGabriel.maratonajava.javaCore.classesAbstratas.test;

import academy.devGabriel.maratonajava.javaCore.classesAbstratas.dominio.Desenvolvedor;
import academy.devGabriel.maratonajava.javaCore.classesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
    Gerente gerente = new Gerente("Marcelo Ramada", 24000.0);
    Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel L. Silva", 28573.91);

    System.out.println(gerente);
    System.out.println(desenvolvedor);

    gerente.imprime();
    desenvolvedor.imprime();
    }
}
