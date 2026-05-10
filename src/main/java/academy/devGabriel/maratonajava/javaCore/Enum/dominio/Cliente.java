package academy.devGabriel.maratonajava.javaCore.Enum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagemento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagemento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagemento = tipoPagemento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome= '" + nome + '\'' +
                ", tipoCliente= " + tipoCliente.TIPO_RELATORIO +
                ", tipoCliente= " + tipoCliente.VALOR +
                ", TipoPagemento= " + tipoPagemento +
                '}';
    }
}
