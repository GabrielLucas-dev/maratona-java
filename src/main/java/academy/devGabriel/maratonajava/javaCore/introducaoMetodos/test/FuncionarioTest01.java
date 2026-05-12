package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.test;

import academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{1500.00, 2800.00, 5500.00});

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Giovanna");
        funcionario2.setIdade(25);
        funcionario2.setSalarios(new double[]{750.00, 2500.00, 6000.00});

        funcionario.imprimir();
        //double mediaSalarios = funcionario.mediaSalarios();
        //System.out.println("Média dos salários: " + mediaSalarios);

        funcionario2.imprimir();
        //double mediaSalarios2 = funcionario2.mediaSalarios();
        //System.out.println("Média salarial: " + mediaSalarios2);
    }

}
