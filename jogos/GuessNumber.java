import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(49) + 1;
        int Tries=3;
        boolean win=false;
        System.out.println("Bem vindo ao jogo de adivinhação, tente adivinhar um numero entre 1 e 50!");
        while (Tries>0){
            System.out.println("Digite um numero(Você tem " + Tries + " tentativas): ");
            int UserNumber = scanner.nextInt();
            if (UserNumber==randomNumber){
                win=true;
                break;
            } else if (UserNumber>randomNumber){
                System.out.println("O numero é menor que " + UserNumber);
            } else {
                System.out.println("O numero é maior que " + UserNumber);
            }
            Tries--;
        }
        if (win){
            System.out.println("Parabéns, você acertou o numero!");
        }else{
            System.out.println("Infelizmente, você perdeu! O numero era " + randomNumber + ".");
        }
        scanner.close();
    }
}