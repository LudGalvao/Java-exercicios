import java.util.Scanner;

public class Ex_9{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius para converter para Fahrenheit");
		double celsius;
		
		celsius = sc.nextDouble();
		
		double conv = (9 * celsius + 160) / 5;
		
		System.out.printf("A temperatura em Fahrenheit é %.1f F", conv);
		
		sc.close();
	}
}
