package academy.devGabriel.maratonajava.javaCore.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("dentro do bloco estatico Funcionario");
    }

    {
        System.out.println("dentro do bloco de inicialização Funcionario");
    }
    {
        System.out.println("dentro do bloco de inicialização Funcionario 2");
    }

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
        System.out.println("dentro do construtor Funcionario");
    }

    // sobrescrevendo um metodo da classe mãe, tem comportamentos diferentes dependendo do objeto que a chama
    public void imprime(){
        super.imprime();
        System.out.println(salario);
    }

    public void relarotioPagamento(){
        System.out.println("Eu, " + this.nome + ", recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
