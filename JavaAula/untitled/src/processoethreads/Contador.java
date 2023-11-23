package processoethreads;

public class Contador implements Runnable {
    private  int cont;

    public void setContador(int cont){
        this.cont = cont;
    }


    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("Thread "+cont+" valor:"+i);
        }
    }
}
