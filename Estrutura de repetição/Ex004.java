import java.util.Scanner;

public class Ex004{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe um número positivo: ");
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i <= num) {
			if(i % 3 != 1) {
				System.out.println(i);
			}
			
			i = i + 1;
		}
		
		sc.close();
	}
}