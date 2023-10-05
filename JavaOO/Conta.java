package JavaOO;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    boolean sacar(double valor) {
        if (valor > this.saldo + this.limite) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }

    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

}