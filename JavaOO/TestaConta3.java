package JavaOO;

public class TestaConta3 {
    public static void main(String[] args) {
        Conta c1; //declaração
        c1 = new Conta(); //instanciação
        c1.limite = 100; //inicialização

        System.out.println("Limite de c1: "+c1.limite);

        Conta c2; //declaração
        c2 = c1;
        c2.limite = 200;

        System.out.println("Limite de c2: "+c2.limite);
        System.out.println("Limite de c1: "+c1.limite);

    }

}
