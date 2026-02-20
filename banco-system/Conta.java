public class Conta{
    private float saldo;
    private String[] extrato;
    private int totalOperacoes;

    public Conta(float saldoinicial){
        this.saldo = saldoinicial;
        extrato = new String[100];
        totalOperacoes = 0;

        registrar("Abertura de conta com saldo: " + saldoinicial);
    }

    private void registrar(String operacao){
        if (totalOperacoes < extrato.length){
            extrato[totalOperacoes] = operacao;
            totalOperacoes++;
        }
    }

    public float verSaldo(){
        return saldo;
    }

    public boolean deposito(float valor){
        if (valor <= 0){
            return false;
        } else {
            saldo = saldo + valor;
            registrar("Depósito de " + valor);
            return true;
        }
    }

    public boolean saque(float valor){
        if (valor > saldo || valor <= 0){
            return false;
        } else {
            saldo = saldo - valor;
            registrar("Saque de " + valor);
            return true;
        }
    }

    public String verExtrato(){
        String resultado = "\n\n+-----Extrato da conta:";
        for (int i = 0; i < totalOperacoes; i++){
            resultado += "|" + extrato[i] + "\n";
        }
        resultado += "+-----Fim do extrato.\n|\n+-----Saldo atual: " + saldo;
        return resultado;
    }
}