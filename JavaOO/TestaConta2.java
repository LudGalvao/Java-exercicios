package JavaOO;

public class TestaConta2 {
    public static void main(String[] args) {
        Conta c1; //declaração
        c1 = new Conta(); //instanciação
        c1.limite = 100; //inicialização

        Conta c2;
        c2 = new Conta();
        c2.limite = 200;

        System.out.println("Limite de c1: "+c1.limite);
        System.out.println("Limite de c2: "+c2.limite);

        c2.limite = 300;
        System.out.println("Limite de c1: "+c1.limite);
        System.out.println("Limite de c2: "+c2.limite);


    }

}