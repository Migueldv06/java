public class Att3{
    public static void main(String[] args){

        int matriz[][] = new int[10][10];
        int matriza[][] = new int[10][10];
        int matrizb[][] = new int[10][10];

        int valora = 1, valorb = 200;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matriza[i][j] = valora++;
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matrizb[i][j] = valorb--;
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = matriza[i][j] * matrizb[i][j];
            }
        }

        System.out.println("Matriz A:\n");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(matriza[i][j] + " ");
            }
            System.out.println("\n\n");
        }
        System.out.println("Matriz B:\n");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(matrizb[i][j] + " ");
            }
            System.out.println("\n\n");
        }

        System.out.println("Matriz A * B:\n");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}