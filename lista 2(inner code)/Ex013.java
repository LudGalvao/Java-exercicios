import java.util.Scanner;

public class Ex013{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 = +  2 = -  3 = x  4 = /");
		System.out.printf("Informe um número correspodente para fazer uma operação: ");
		
		int operador = sc.nextInt();
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		if(operador == 1) {
			int calc = numero1 + numero2;
			System.out.printf("O resultado da soma é " + calc);
		}
		
		else if(operador == 2) {
			int calc = numero1 - numero2;
			System.out.printf("O resultado da subtração é " + calc);
		}
		
		else if(operador == 3) {
			int calc = numero1 * numero2;
			System.out.printf("O resultado da multiplicação é " + calc);
		}
		
		else if(operador == 4) {
			int calc = numero1 / numero2;
			System.out.printf("O resultado da divisão é " + calc);
		}
		
		else {
			System.out.println("Inválido");
		}
		
		sc.close();
	}
}