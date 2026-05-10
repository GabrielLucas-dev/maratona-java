package academy.devGabriel.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000.0;
        String doar = "Eu vou doar 500 pro dev dojo";
        String naoDoar = "Ainda nao tenho condições mas vou ter!";
        String resultado = (salario > 5000) ? doar : naoDoar;
        System.out.println(resultado);

        // EX: estruturas condicionais
        double salarioAnual = 40000;
        double taxa;
        double valorImposto;

        if(salarioAnual > 0 && salarioAnual <= 34712) {
            taxa = 9.7 / 100;
            valorImposto = salarioAnual * taxa;
        } else if(salarioAnual >= 34713 && salarioAnual <= 68507) {
            taxa = 37.35 / 100;
            valorImposto = salarioAnual * taxa;
        } else {
            taxa = 49.50 / 100;
            valorImposto = salarioAnual * taxa;
        }

        System.out.println("Você deve pagar " + taxa + " de taxa");
        System.out.println("Imposto descontado: " + valorImposto);
        System.out.println("Valor livre de imposto: " + (salarioAnual - valorImposto));
    }
}
