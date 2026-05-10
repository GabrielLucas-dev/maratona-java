package academy.devGabriel.maratonajava.javaCore.Enum.test;

import academy.devGabriel.maratonajava.javaCore.Enum.dominio.Cliente;
import academy.devGabriel.maratonajava.javaCore.Enum.dominio.TipoCliente;
import academy.devGabriel.maratonajava.javaCore.Enum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
    Cliente cliente = new Cliente("Renato", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    Cliente cliente2 = new Cliente("Gerson", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

    System.out.println(cliente);
    System.out.println(cliente2);
    System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

    TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
    System.out.println(tipoCliente);
    TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
    System.out.println(tipoCliente2);

    }
}
