public class Att1 {
    public static void main(String[] args) {

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];

        for (int i = 0; i < 10; i++) {
            vet1[i] = 100 + i;
            vet2[i] = 250 + i;
            vet3[i] = vet1[i] + vet2[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(vet1[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(vet2[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(vet3[i] + " ");
        }

        System.out.println("\n");
    }
}