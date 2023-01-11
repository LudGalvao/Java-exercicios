import java.util.Scanner;

public class Ex011 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe quantos número você deseja somar: ");
        int vezes =sc.nextInt();
        int soma = 0;

        for(int i=0; i<vezes; i++){
            System.out.printf("Informe um número: ");
            int num = sc.nextInt();
            soma = num + soma;
        }

        System.out.println("O total da soma é " + soma);

        sc.close();
    }
}
