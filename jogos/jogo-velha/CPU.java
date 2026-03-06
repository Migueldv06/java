import java.util.Random;

public class CPU {

    public void jogar(Tabuleiro tabuleiro){

        char[][] matriz = tabuleiro.getTabuleiroCPU();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if(matriz[i][j] == ' '){

                    matriz[i][j] = 'O';

                    if(tabuleiro.temVitoria('O')){
                        return;
                    }

                    matriz[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if(matriz[i][j] == ' '){

                    matriz[i][j] = 'X';

                    if(tabuleiro.temVitoria('X')){
                        matriz[i][j] = 'O';
                        return;
                    }

                    matriz[i][j] = ' ';
                }
            }
        }

        if(matriz[1][1] == ' '){
            matriz[1][1] = 'O';
            return;
        }

        Random random = new Random();
        int linha, coluna;
        boolean jogada = false;

        while(!jogada){
            linha = random.nextInt(3);
            coluna = random.nextInt(3);

            jogada = tabuleiro.marcarPosicao(linha, coluna, 'O');
        }
    }
}