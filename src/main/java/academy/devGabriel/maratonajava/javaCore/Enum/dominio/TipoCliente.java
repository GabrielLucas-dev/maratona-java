package academy.devGabriel.maratonajava.javaCore.Enum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String TIPO_RELATORIO;

    //construtor privado para nunca poder ser chamado
    TipoCliente(int valor, String TIPO_RELATORIO){
        this.VALOR = valor;
        this.TIPO_RELATORIO = TIPO_RELATORIO;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente: values()){
            if(tipoCliente.getTipoRelatorio().equals(nomeRelatorio)) return tipoCliente;
        }
            return null;
    }

    public int getValor() {
        return VALOR;
    }

    public String getTipoRelatorio(){
        return TIPO_RELATORIO;
    }
}
