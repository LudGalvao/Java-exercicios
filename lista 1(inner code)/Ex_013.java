import java.util.Scanner;

public class Ex_13{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a idade em anos, meses e dias:");
        int ano = sc.nextInt();
        int mes = sc.nextInt();
        int dia = sc.nextInt();

        int total = ano * 365 + mes * 30 + dia;
        System.out.println("A idade em dias é: " + total + "dias");
        
        sc.close();
	}
}
