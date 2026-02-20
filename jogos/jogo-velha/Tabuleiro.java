public class Tabuleiro {

    private char[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new char[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public String verTabuleiro() {
        String resultado = "";

        for(int i = 0; i < 3; i++){
            resultado += tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2] + "\n";

            if(i < 2){
                resultado += "--+---+--\n";
            }
        }

        return resultado;
    }

    public boolean marcarPosicao(int linha, int coluna, char simbolo){
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2){
            return false;
        }
        else if (tabuleiro[linha][coluna] == ' '){
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
                if(tabuleiro[i][x] == ' '){
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