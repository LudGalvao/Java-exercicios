package JavaOO;

public class TestaConta4 {
    public static void main(String[] args) {
        Conta c1; //declaração
        c1 = new Conta(); //instanciação
        c1.nome = "Clayton"; //inicialização

        Conta c2; //declaração
        c2 = new Conta(); //instanciação
        c2.nome = "Clayton"; //inicialização

        if (c1 == c2) {
            System.out.println("As contas são iguais");
        } else {
            System.out.println("As contas são diferentes");
        }

        int i1 = 10;
        int i2 = 10;

        if (i1 == i2) {
            System.out.println("As variáveis são iguais");
        } else {
            System.out.println("As variáveis são diferentes");
        }

    }

}
