import java.util.Scanner;

public class Ex011{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe primeiro o número da operação e logo em seguida um número.");
		System.out.println("Ex: 1 = impar ou par, 2 = positivo ou negativo ou 3 = inteiro ou decimal");
		
		int num1 = sc.nextInt();
		double num2 = sc.nextDouble();
		int numero2 = (int)num2;
		
		if(num1 == 1) {
			if(num2 % 2 == 0) {
				System.out.println(numero2 + " é par");
			}
			
			else {
				System.out.println(numero2 + " é impar");
			}
		}
		
		else if(num1 == 2) {
			if(num2 >= 0) {
				System.out.println(numero2 + " é um número positivo");
			}
			
			else {
				System.out.println(numero2 + " é um número negativo");
			}
		}
		
		else if(num1 == 3) {
			if(num2 % 1 == 0) {
				System.out.println(num2 + " é um número inteiro");
			}
			
			else {
				System.out.println(num2 + " é um número decimal");
			}
		}
		
		else {
			System.out.println("Opção inválida");
		}
		
		sc.close();
	}
}