import java.util.Scanner;

public class Ex12{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número de 0 a 100: ");
		double num = sc.nextDouble();
		
		if (num < 0.0 || num > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (num <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (num <= 50.0) {
			System.out.println("Intervalo [25,50]");
		}
		else if (num <= 75.0) {
			System.out.println("Intervalo [50,75]");
		}		
		else {
			System.out.println("Intervalo [75,100]");
		}
		
		sc.close();
		}
	}
