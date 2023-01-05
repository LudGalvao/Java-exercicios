import java.util.Scanner;

public class Ex010{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe os 3 lados do triângulo: ");
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		
		if(lado1 + lado2 < lado3) {
			System.out.println("Não forma um triângulo");
		}
		
		else if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero");
		}
		
		else if(lado1 != lado2 && lado2 != lado3) {
			System.out.println("Triângulo Escaleno");
		}
		
		else {
			System.out.println("Triângulo Isósceles");
		}
		
		sc.close();
	}
}