import java.util.Scanner;

public class EX_3{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int dif = (a * b -c * d);
		
		System.out.printf("DIFERENÇA: " + dif);
		
		sc.close();
	}
}