import java.util.Scanner;

public class Conversor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        
        char resposta;

        do{
            System.out.printf("Informe uma temperatura em celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;

            System.out.printf("Convertido para Fahrenheit fica: %.1f%n ", fahrenheit);
            System.out.println("Deseja repetir? (s para sair) ");

            resposta = sc.next().charAt(0);
        }
        while(resposta != 's' && resposta != 'S');


        sc.close();
    }
}

