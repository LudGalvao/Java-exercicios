package processoethreads;

public class TestaContador {
    public static void main(String[]args){
        Contador c1 = new Contador();
        c1.setContador(1);
        Thread t1 = new Thread(c1);
        t1.start();

        Contador c2 = new Contador();
        c2.setContador(2);
        Thread t2 = new Thread(c2);
        t2.start();
    }
}
