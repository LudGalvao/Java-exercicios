import java.util.Scanner;

public class Ex006 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número de 1 a 10: ");
        int num = sc.nextInt();

        while(num != 7){
            System.out.println("Número errado.");
            System.out.println(" ");
            System.out.printf("Informe um número de 1 a 10: ");
            num = sc.nextInt();
        }

        System.out.println("Você acertou o número secreto.");

        sc.close();
    }
}
