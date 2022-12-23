import java.util.Scanner;


public class EX_4{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int h;
		double v;
		
		n = sc.nextInt();
		h = sc.nextInt();
		v = sc.nextDouble();
		
		double sal = h * v;
		
		System.out.println("Número: " + n);
		System.out.printf("Sálario = %.2f%n", sal);
		
		sc.close();
	}
}
