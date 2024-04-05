package Ex2.Solucao.Solucao.Banco.src.main.java.banco;

public class Conta {

    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {

        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {

        if (valor > saldo) {
            return false;
        }
        else {
            saldo = saldo - valor;
            return true;
        }
    }

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

}
