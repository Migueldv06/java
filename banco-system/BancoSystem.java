import java.util.Scanner;
public class BancoSystem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta(1000);

        float saldo,deposito,saque;
        int option;
        String[] extrato;
        boolean sair = false,status;
        System.out.println("Bem vindo ao Banco MDV Bank.");
        while (!sair){
            System.out.println("\nSelecione uma das opções abaixo:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Extrato");
            System.out.println("5. Sair");

            System.out.print("\nOpção desejada: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    saldo = conta.verSaldo();
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                case 2:
                    System.out.print("\nDigite o valor que quer depositar: ");
                    deposito = scanner.nextFloat();
                    status = conta.deposito(deposito);
                    if (status){
                        System.out.println("\nDepósito realizado com sucesso!");
                    } else {
                        System.out.println("\nErro ao realizar o depósito. Tente novamente.");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o valor que quer sacar: ");
                    saque = scanner.nextFloat();
                    status = conta.saque(saque);
                    if (!status){
                        System.out.println("\nErro aoa realizar o saque.");
                    } else {
                        System.out.println("\nSaque realizado com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println(conta.verExtrato());
                    break;
                case 5:
                    System.out.println("\n\nObrigado por usar o Banco MDV Bank! Tenha um ótimo dia!");
                    sair = true;
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
        scanner.close();

    }
}