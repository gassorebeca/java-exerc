/*
Escreva um programa que faça a validação do login de um usuário, considere que o nome de usuário 
correto é "usuarioAutenticado123" e a senha correta é "senhaAutenticada123".

O programa deverá retornar uma das seguintes mensagens:
LOGIN INCORRETO caso a senha esteja certa e o usuário errado.
SENHA INCORRETA caso a senha esteja errada e o usuário certo.
ACESSO NEGADO caso usuário e senha estejam errados.
ACESSO PERMITIDO caso usuário e senha estejam corretos.

*/

import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String usuarioCorreto = "usuarioAutenticado123";
        String senhaCorreta = "senhaAutenticada123";
       
        System.out.println("Login:");
        String login = scan.next();

        System.out.println("Senha:");
        String senha = scan.next();

        if(!login.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
            System.out.println("LOGIN INCORRETO");
        }else if(login.equals(usuarioCorreto) && !senha.equals(senhaCorreta)){
            System.out.println("SENHA INCORRETA");
        }else if(!login.equals(usuarioCorreto) && !senha.equals(senhaCorreta)){
            System.out.println("ACESSO NEGADO");
        }else {
            System.out.println("ACESSO PERMITIDO ");
        }

        scan.close();
    }
}
