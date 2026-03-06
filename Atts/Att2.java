public class Att2{
    public static void main(String[] args){

        int matriz[][] = new int[10][10];
        int valor = 1;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = valor++;
            }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}