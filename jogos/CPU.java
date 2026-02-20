import java.util.Random;
public class CPU{
    public void jogar(Tabuleiro tabuleiro){
        Random random = new Random();
        int linha, coluna;
        boolean jogada = false;

        while (!jogada) {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);

            jogada = tabuleiro.marcarPosicao(linha, coluna, 'O');
        }
    }
}