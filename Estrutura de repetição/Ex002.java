import java.util.Scanner;

public class Ex002{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número positivo: ");
		int num = sc.nextInt();
		
		int i = 0;
		
		while(i <= num) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i = i + 1;
		}
		
		sc.close();
	}
}