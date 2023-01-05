import java.util.Scanner;

public class Ex_001{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe dois números inteiros: ");
		
		int var_1 = sc.nextInt();
		int var_2 = sc.nextInt();
		
		if (var_1 != var_2) {
			System.out.printf("O primeiro valor é %d e o segundo é %d", var_2, var_1);
		}
		else {
			System.out.printf("Os números são iguais.");
		}
		
		sc.close();
	}
}