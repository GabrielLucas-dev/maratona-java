package academy.devGabriel.maratonajava.javaCore.expception.runtine.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
         try{

         } catch(ArrayIndexOutOfBoundsException e){
             System.out.println("dentro do ArrayIndexOutOfBoundsException");
         } catch(IndexOutOfBoundsException e){
             System.out.println("dentro do IndexOutOfBoundsException");
         } catch(IllegalArgumentException e){
             System.out.println("dentro do IllegalArgumentException");
         } catch(RuntimeException e) {
             System.out.println("dentro do RuntimeException");
         }
         //quanto mais generico, mais para baixo ela deve ficar
         //todas herdam de RuntimeException, ou seja, ela deve ficar no final

        try{
            talvezLanceException();
              //esse catch funciona para excecões que não estão na mesma linha de herança e que podem ser tratadas da mesma forma
        }catch(FileNotFoundException | SQLException e) {

        }
    }
    public static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
