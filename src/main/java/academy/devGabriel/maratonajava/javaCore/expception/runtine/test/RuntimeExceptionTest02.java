package academy.devGabriel.maratonajava.javaCore.expception.runtine.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(-1, 1);
    }

    /**
     * @param a não pode ser negativo
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException se b = 0
     * @throws IllegalArgumentException se a < 0
     * */
    private static int divisao(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Argumento inválido, impossível dividir por 0");
        }
        if(a < 0){
            throw new IllegalArgumentException("Argumento inválido, dividendo não pode ser negativo");
        }
        return a/b;

        /*try{
            return a/b;
        } catch(RuntimeException e){
            e.printStackTrace();
        }
        return 0;*/
    }
}
