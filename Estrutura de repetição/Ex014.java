import java.util.Scanner;

public class Ex014 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe a quantidade de vezes que deseja fazer a divisão: ");
        int quantidade = sc.nextInt();

        for(int i=0; i<quantidade; i++){
            System.out.printf("Informe dois números: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            if(num2 == 0){
                System.out.println("Impossivel");
            }

            else{
                double div = (double) num1 / num2;
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();
    }
}
