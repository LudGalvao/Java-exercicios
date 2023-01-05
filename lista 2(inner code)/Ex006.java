import java.util.Scanner;

public class Ex006{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o preço de 3 produtos: ");
		double produto1 = sc.nextDouble();
		double produto2 = sc.nextDouble();
		double produto3 = sc.nextDouble();
		
		if(produto1 <= produto2 && produto1 <= produto3) {
			System.out.printf("O produto 1 é o mais barato custando R$" + produto1);
		}
		
		else {
			if(produto2 <= produto1 && produto2 <= produto3) {
				System.out.printf("O produto 2 é o mais barato custando R$ " + produto2);
			}
			else {
				System.out.printf("O produto 3 é o mais barato custando R$ " + produto3);
			}
		}
		sc.close();
	}
}