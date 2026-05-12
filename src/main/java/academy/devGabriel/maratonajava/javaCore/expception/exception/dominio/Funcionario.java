package academy.devGabriel.maratonajava.javaCore.expception.exception.dominio;

public class Funcionario extends Pessoa{

    // não é obrigado a implementar as exceções da classe mãe
    // não pode usar exceções mais genericas do que na classe mãe
    public void salvar(){
        System.out.println("salvando funcionario");
    }
}
