import java.util.Scanner;

public class Ex010 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        int x = sc.nextInt();

        for(int i = 1; i<=x; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
