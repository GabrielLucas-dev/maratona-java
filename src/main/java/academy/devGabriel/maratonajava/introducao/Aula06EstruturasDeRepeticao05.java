package academy.devGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000.0;
        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal / i;
            if(valorParcela < 1000) {   // "só passe pro sout quando o valorParcela for maior que 1000"
                continue;
            }
            System.out.println("parcela: " + i + " | Valor da parcela: " + valorParcela);
        }
    }
}
