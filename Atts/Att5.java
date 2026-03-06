import java.util.Scanner;
public class Att5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[6][5];
        int valor;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                valor = scanner.nextInt();
                matriz[i][j] = valor;
            }
        }

        System.out.println("Matriz digitada:\n");
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
        scanner.close();
    }
}