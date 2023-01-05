import java.util.Scanner;

public class Ex012{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número de 0 a 9: ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 9) {
			System.out.println("Valor válido");
		}
		
		else {
			System.out.println("Valor inválido");
		}
		
		sc.close();
	}
}