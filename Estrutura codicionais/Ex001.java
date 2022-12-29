import java.util.Scanner;

public class Ex_7{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número inteiro para saber que é negativo ou positivo: ");
		
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.printf("O número " + num + " é um número negativo");
		}
		
		else {
			System.out.printf("O número " + num + " é positivo");
		}
		
		sc.close();
			
	}
}