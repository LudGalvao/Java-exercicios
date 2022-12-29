import java.util.Scanner;

public class Ex003{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe dois números inteiros: ");
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		
		if (num_1 % num_2 == 0 || num_2 % num_1 == 0) {
			System.out.println("São multiplos");
		}
		
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}
}
