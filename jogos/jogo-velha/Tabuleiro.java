public class Tabuleiro {

    private char[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new char[3][3];
        int casa = 1;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = (char) ('0' + casa++);
            }
        }
    }

    public String colorir(char simbolo){
        String verde = "\u001B[32m";
        String vermelho = "\u001B[31m";
        String reset = "\u001B[0m";

        if(simbolo == 'X') return verde + simbolo + reset;
        if(simbolo == 'O') return vermelho + simbolo + reset;

        return String.valueOf(simbolo);

    }

    public String verTabuleiro() {
        String resultado = "";

        resultado += "┌───┬───┬───┐\n";

        for (int i = 0; i < 3; i++) {

            resultado += "│ " + colorir(tabuleiro[i][0]) +
                        " │ " + colorir(tabuleiro[i][1]) +
                        " │ " + colorir(tabuleiro[i][2]) + " │\n";

            if (i < 2) {
                resultado += "├───┼───┼───┤\n";
            }
        }

        resultado += "└───┴───┴───┘\n";

        return resultado;
    }

    public char[][] getTabuleiroCPU(){
        return tabuleiro;
    }

    public boolean marcarPosicao(int casajgd, char simbolo){
        int casalc = 1, linha=0, coluna=0;
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(casalc == casajgd){
                    linha = i;
                    coluna = j;
                }
                casalc++;
            }
        }

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2){
            return false;
        }
        else if (tabuleiro[linha][coluna] != 'X' && tabuleiro[linha][coluna] != 'O'){
            tabuleiro[linha][coluna] = simbolo;
            return true;
        } else {
            return false;
        }
    }

    public boolean velha(){
        boolean temlivre = false;
        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 3; x++){
                if(tabuleiro[i][x] != 'X' && tabuleiro[i][x] != 'O'){
                    temlivre = true;
                }
            }
        }
        if(temlivre){
            return false;
        } else {
            return true;
        }
    }

    public boolean temVitoria(char s){

        for(int i = 0; i < 3; i++){
            if(tabuleiro[i][0] == s &&
            tabuleiro[i][1] == s &&
            tabuleiro[i][2] == s){
                return true;
            }
        }

        for(int i = 0; i < 3; i++){
            if(tabuleiro[0][i] == s &&
            tabuleiro[1][i] == s &&
            tabuleiro[2][i] == s){
                return true;
            }
        }

        if(tabuleiro[0][0] == s &&
        tabuleiro[1][1] == s &&
        tabuleiro[2][2] == s){
            return true;
        }

        if(tabuleiro[0][2] == s &&
        tabuleiro[1][1] == s &&
        tabuleiro[2][0] == s){
            return true;
        }

        return false;
    }

}