package academy.devGabriel.maratonajava.javaCore.heranca.test;

import academy.devGabriel.maratonajava.javaCore.heranca.dominio.Endereco;
import academy.devGabriel.maratonajava.javaCore.heranca.dominio.Funcionario;
import academy.devGabriel.maratonajava.javaCore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 310");
        endereco.setCep("71964-360");

        Pessoa pessoa = new Pessoa("Pedro", "000.000.000-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------");

        Funcionario funcionario = new Funcionario("Heitor", "111.111.111-11");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7000.0);

        funcionario.imprime();
        System.out.println("---------");
        funcionario.relarotioPagamento();
    }
}
