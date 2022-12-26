import java.util.Scanner;

public class Ex_10{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio e a altura(nessa ordem)");
		
		double raio;
		double altura;
		
		raio = sc.nextDouble();
		altura = sc.nextDouble();
		
		double volume = Math.PI * raio * raio * altura;
		
		System.out.printf("O volume da lata de óleo é %.2f ", volume);
		
		sc.close();
	}
}
