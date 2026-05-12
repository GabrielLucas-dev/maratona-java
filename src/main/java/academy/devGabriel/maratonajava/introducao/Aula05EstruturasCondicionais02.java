package academy.devGabriel.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 16;
        String categoria;

        if(idade < 15) {
            categoria = "Categoria infantil";
        } else if(idade >= 15 && idade < 18) {
           categoria = "Cateogira juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);  //variavel local precisa ser inicializada antes de executar, se não da erro na compilação
    }
}
