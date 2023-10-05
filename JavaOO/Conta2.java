package JavaOO;

public class Conta2 {
    private static int contadorContas;
    int numero;
    //	String nome;
    Cliente cliente = new Cliente();
    double saldo;
    double limite;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static void setContadorContas(int contadorContas) {
        Conta2.contadorContas = contadorContas;
    }

    public Conta2(String nome, String cpf){
        this.cliente.nome = nome;
        this.cliente.cpf = cpf;
        System.out.println("Teste da classe Conta2 com construtor");
        Conta2.contadorContas++;
    }

    public static int getContadorContas() {
        return Conta2.contadorContas;
    }

    public boolean sacar(double valor) {
        if (valor > this.saldo + this.limite) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }

    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
//		saldo += valor;
    }

}