package JavaOO;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.numero = 1;
        c1.nome = "Clayton";
        c1.saldo = 100;
        c1.limite = 10000;

        System.out.println("Numero da conta: " + c1.numero);
        System.out.println("Titular: " + c1.nome);
        System.out.println("Saldo atual: " + c1.saldo);
        System.out.println("Limite: " + c1.limite);

        int saque = 900;

        boolean resultado = c1.sacar(saque);
        if (resultado) {
            System.out.println("Voce sacou R$ " + saque + " e seu saldo atual eh R$ " + c1.saldo);
        } else {
            System.out.println("Saque não efetuado, valor acima do possível");
        }

        Conta c2 = new Conta();

        c2.numero = 2;
        c2.nome = "Jorge";
        c2.saldo = 200;
        c2.limite = 10000;

    }
}
