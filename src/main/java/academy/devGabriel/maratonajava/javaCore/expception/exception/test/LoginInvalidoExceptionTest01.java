package academy.devGabriel.maratonajava.javaCore.expception.exception.test;

import academy.devGabriel.maratonajava.javaCore.expception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        } catch(LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    //para utilizar a exceção no metodo precisa ter a assinatura dela no metodo
    private static void logar() throws LoginInvalidoException {
        String usernameDB = "biel";
        String senhaDB = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String usernameScanner = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaScanner = scanner.nextLine();

        if(!usernameDB.equals(usernameScanner) || !senhaDB.equals(senhaScanner)){
            throw new LoginInvalidoException();
        }

        System.out.println("Usuário logado!");
    }
}
