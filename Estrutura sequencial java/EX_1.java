import java.util.Scanner;

public class EX_1{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.printf("A soma entre o número %d e o número %d é: %d",x, y, x + y);
		
		sc.close();
	}
}
