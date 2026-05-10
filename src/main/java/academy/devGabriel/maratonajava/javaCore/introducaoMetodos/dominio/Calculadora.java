package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio;

public class Calculadora {

    // RETORNO != SAÍDA
    // RETORNO devolve algo, SAÍDA não devolve resposta apenas mostra

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num / num2;
    }

    public double divideDoisNumeros02(double num, double num2) {
        if(num2 == 0) {
            return 0;
        } else {
            return num / num2;
        }
    }

    public void imprimeDivisaoDoisNumeros(double num, double num2) {
        if(num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num/num2);
    }

    public void alteraDoisValores(int num, int num2) {
        num = 99;
        num2 = 33;
        System.out.println("dentro do alteraDoisValores");
        System.out.println("num: " + num);
        System.out.println("num2: " + num2);
    }

    public int somaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
        return soma;
    }

    // Dessa forma o parametro que é o array (int...), tem que ser o ultimo parametro da função
    public int somaVarArgs(int... numeros) {
     int soma = 0;
     for(int num: numeros){
         soma += num;
     }
     return soma;
    }


    // DESAFIO 1 - DEV MAGRO
    // como verificar se o numero é primo?
    // - se o numero tiver resto 0 nas divisoes por 1 e ele mesmo = primo
    // - se o numero quando dividido por algum outro numero tem resto 0 = não primo
    public boolean isPrimo(int num) {
        boolean primo = false;
        for(int i = 1; i < num - 1; i++) {
            if(num % i == 0) {
                primo = false;
            }
            primo = true;
        }
        return primo;
    }

    //DESAFIO 2 - DEV MAGRO
    public int[] dobrarLista(int[] nums) {
        int[] listaNova = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            listaNova[i] = nums[i] * 2;
        }
        return listaNova;
    }

}
