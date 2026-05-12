package academy.devGabriel.maratonajava.javaCore.expception.runtine.test;

public class RuntimeExcepitonTest01 {
    public static void main(String[] args) {
        //Exception unchecked - filhas da classe RuntimeException (codigo precisa ser melhorado)

        //NullPointerException
        Object object = null;
        object.toString();

        //ArrayIndexOutOfBoundsException
        int[] nums = {1,2};
        System.out.println(nums[2]);

        //Exception checked - se não tratadas da erro em tempo de compilação (precisa de tratamento, se não codigo nao compila)
        
    }
}
