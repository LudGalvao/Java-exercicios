import java.util.Scanner;

public class Ex004{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número: ");
		int num = sc.nextInt();
		
		int calc = num * (-1);
		
		if(num >= 0) {
			System.out.printf("O modulo é %d", num);
		}
		else {
			System.out.printf("O modulo é -%d", calc);
		}
		
		sc.close();
	}
}