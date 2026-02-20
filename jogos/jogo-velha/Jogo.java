import java.util.Scanner;
public class Jogo{
    private Tabuleiro tabuleiro;

    public Jogo(){
        Scanner scanner = new Scanner(System.in);
        tabuleiro = new Tabuleiro();
        CPU cpu = new CPU();

        boolean jogada = false, jogoEmAndamento = true, temVitoria = false, velha = false;

        System.out.println("Bem vindo ao jogo da velha!");
        System.out.println("O tabuleiro é representado por uma matriz 3x3, onde você é o jogador 'X' e a CPU o jogador 'O'.");
        verTabuleiro();
        System.out.println("Você escolhe a sua jogada informando a linha e coluna");
        
            while(jogoEmAndamento){
            do{
                System.out.println("Faça sua jogada");
                System.out.print("Informe a linha: ");
                int linha = scanner.nextInt();
                System.out.print("Informe a coluna: ");
                int coluna = scanner.nextInt();
                jogada = jogada(linha, coluna, 'X');
            } while (!jogada);

            temVitoria = tabuleiro.temVitoria('X');
            if (temVitoria){
                jogoEmAndamento = false;
                System.out.println("Parabéns! Você venceu!");
                verTabuleiro();
                break;
            }
            
            System.out.println("Vez da CPU agora...");
            cpu.jogar(tabuleiro);
            System.out.println("A jogada da CPU foi:");
            verTabuleiro();
            velha = tabuleiro.velha();
            if (velha){
                System.out.println("Deu velha, jogue de novo e tente ganhar!");
                jogoEmAndamento = false;
                break;
            }
            
            temVitoria = tabuleiro.temVitoria('O');
            if (temVitoria){
                jogoEmAndamento = false;
                System.out.println("A CPU venceu!");
                break;
            }

        }
        scanner.close();

    }

    public void verTabuleiro(){
        System.out.println(tabuleiro.verTabuleiro());
    }

    public boolean jogada(int linha, int coluna, char simbolo){
        boolean jogadaValida = tabuleiro.marcarPosicao(linha, coluna, simbolo),temVitoria = false;
        if (!jogadaValida){
            System.out.println("Jogada inválida. Tente novamente.");
            return false;
        } else {
            return true;
        }
    }
}