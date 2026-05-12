package academy.devGabriel.maratonajava.javaCore.expception.runtine.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            //serve para quando um recurso precisa ser fechado, o finally é SEMPRE executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
