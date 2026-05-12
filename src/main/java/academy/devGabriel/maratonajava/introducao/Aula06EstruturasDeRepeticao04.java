package academy.devGabriel.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        /*double valorCarro = 50000;
        double valorParcela = 1200;
        double quantidadeDeParcelas = 0;
        for(double i = 0; i < valorCarro; i+=valorParcela) {
            quantidadeDeParcelas++;
        }
        System.out.println(quantidadeDeParcelas);*/

        double valorTotal = 30000.0;
        for (int i = 0; i <= valorTotal; i++) {
            double valorParcela = valorTotal / i;
            if(valorParcela >= 1000){
                System.out.println("parcela: " + i + " | Valor da parcela: " + valorParcela);
            } else {
                break;
            }
            System.out.println(i);
        }
    }
}
