package academy.devGabriel.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoAComprar = idade >= 18;
        if(isAutorizadoAComprar) {
            System.out.println("Pode comprar bebida");
        } else if (!isAutorizadoAComprar){
            System.out.println("Não pode comprar bebida");
        }

    }
}
