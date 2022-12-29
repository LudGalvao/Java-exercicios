import java.util.Scanner;

public class Ex_8{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número para saber que é par ou impar: ");
		
		int num_1 = sc.nextInt();

		
		if (num_1 % 2 == 0) {
			System.out.println("Número par");
		}
		
		else {
			System.out.println("Número impar");
		}
		
		sc.close();
	}
}