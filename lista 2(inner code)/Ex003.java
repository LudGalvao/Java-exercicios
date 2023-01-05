import java.util.Scanner;

public class Ex003{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe dois números: ");
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		
		int calc = num_1 - num_2;
		
		if(num_1 > num_2) {
			System.out.printf("A diferença entre o número %d e o número %d é %d", num_1, num_2,calc);
		}
		
		else {
			System.out.printf("A diferença entre o número %d e o número %d é %d", num_1, num_2, Math.abs(calc));
		}
		
		sc.close();
	}
}