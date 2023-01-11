import java.util.Scanner;

public class Ex007 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        int num = sc.nextInt();
        int i = 1;

        while(i <= num){
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
