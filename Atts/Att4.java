public class Att4{
    public static void main(String[] args){
        
        int matriz[][] = new int[10][10];
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int valor = 0;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                while(valor % 2 != 0){
                    valor++;
                }
            matriz[i][j] = valor++;
            }
        }

        System.out.println("Matriz de números pares:\n");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                String formattedValue = String.format("%03d", matriz[i][j]);
                System.out.print(formattedValue + "   ");
            }
            System.out.println("\n");
        }

        for(int i=0, j=0; i < 10 && j < 10; i++, j++){
            vet1[i] = matriz[i][j];
        }

        System.out.println("Vetor 1 (diagonal principal):\n");
        for(int i = 0; i < 10; i++){
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\n");

        for(int i=0, j=9; i < 10 && j >= 0; i++, j--){
            vet2[i] = matriz[i][j];
        }

        System.out.println("Vetor 2 (diagonal secundária):\n");
        for(int i = 0; i < 10; i++){
            System.out.print(vet2[i] + " ");
        }
        System.out.println("\n");
    }
}