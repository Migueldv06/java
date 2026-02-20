import java.util.Scanner;
public class LoginSystem{
    public static void main(String[] args){
        Usuario user = new Usuario("Miguel", "1234");
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        int Tries=2;
        
        System.out.println("Bem vindo ao sistema de login, por favor, insira seu username e senha para acessar o sistema.");
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        
        if (inputUsername.equals(user.username)){
            System.out.print("Senha: ");
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(user.password)){
                System.out.println("Login bem sucedido! Bem vindo, " + user.username + "!");
                loggedIn = true;
            } else {
                while (Tries>0){
                    System.out.println("Senha incorreta. Mais " + Tries + " tetativas restantes.");
                    System.out.print("Senha: ");
                    inputPassword = scanner.nextLine();
                    if (inputPassword.equals(user.password)){
                        System.out.println("Login bem sucedido! Bem vindo, " + user.username + "!");
                        loggedIn = true;
                        break;
                    }
                    Tries--;
                }
                System.out.println("Login falhou. Tente novamente mais tarde.");
            }
        } else {
            System.out.println("Username não encontrado. Tente novamente.");
        }
    }
}