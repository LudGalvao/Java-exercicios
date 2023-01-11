import java.util.Scanner;

public class Ex012 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o número que deseja fazer a tabuada: ");
        int num = sc.nextInt();
        int vezes = 0;

        for(int i = 0; i<= 10; i++){
            vezes = num * i;
            System.out.println(num + "x" + i + " = " + vezes);
        }


        sc.close();
    }
}
