import java.util.Random;

public class CPU {

    public void jogar(Tabuleiro tabuleiro){

        char[][] matriz = tabuleiro.getTabuleiroCPU();
        char casaorn;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if(matriz[i][j] != 'X' && matriz[i][j] != 'O'){
                    
                    casaorn = matriz[i][j];
                    matriz[i][j] = 'O';

                    if(tabuleiro.temVitoria('O')){
                        return;
                    }

                    matriz[i][j] = casaorn;
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if(matriz[i][j] != 'X' && matriz[i][j] != 'O'){
                    casaorn = matriz[i][j];
                    matriz[i][j] = 'X';

                    if(tabuleiro.temVitoria('X')){
                        matriz[i][j] = 'O';
                        return;
                    }

                    matriz[i][j] = casaorn;
                }
            }
        }

        if(matriz[1][1] != 'X' && matriz[1][1] != 'O'){
            matriz[1][1] = 'O';
            return;
        }

        Random random = new Random();
        int casajgd;
        boolean jogada = false;

        while(!jogada){
            casajgd = random.nextInt(9) + 1;

            jogada = tabuleiro.marcarPosicao(casajgd, 'O');
        }
    }
}