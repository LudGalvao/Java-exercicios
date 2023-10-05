package JavaOO;

public class TestaConta2Cliente {
    public static void main(String[] args) {
        Conta2 c2 = new Conta2("Mike", "111.222.333-44");
        c2.numero = 2;
        System.out.println("Numero da conta: "+c2.numero);
        c2.cliente.nome = "Clayton";
        System.out.println("Nome do cliente: "+c2.cliente.nome);
        System.out.println("Quantidade de contas: "+c2.getContadorContas());

        Conta2 c3 = new Conta2("Mickey", "111.222.333-45");

        Conta2 c4 = new Conta2("Mouse", "111.222.333-46");
        System.out.println("Quantidade de contas: "+c2.getContadorContas());//funciona
        System.out.println("Quantidade de contas: "+c3.getContadorContas());//funciona
        System.out.println("Quantidade de contas: "+c4.getContadorContas());//funciona
        System.out.println("Quantidade de contas: "+Conta2.getContadorContas());//funciona
    }
}
