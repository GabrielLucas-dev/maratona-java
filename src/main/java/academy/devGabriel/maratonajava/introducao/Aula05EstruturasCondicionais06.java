package academy.devGabriel.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 8;
        String isDiaUtil = (dia == 1 || dia == 7) ? "Não é dia útil" : "É dia útil";

        switch(dia) {
            case 1 -> System.out.println(isDiaUtil);
            case 2 -> System.out.println(isDiaUtil);
            case 3 -> System.out.println(isDiaUtil);
            case 4 -> System.out.println(isDiaUtil);
            case 5 -> System.out.println(isDiaUtil);
            case 6 -> System.out.println(isDiaUtil);
            case 7 -> System.out.println(isDiaUtil);
            default -> System.out.println("Dia inválido");
        }
    }
}
