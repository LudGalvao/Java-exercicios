import java.util.Scanner;

public class Ex009{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe a quantidade de números que deseja digitar: ");
        int N = sc.nextInt();
        
        int in = 0;
        int out = 0;

        for(int i=0; i<N; i= i+1){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in = in + 1;
            }

            else{
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}