import java.util.Scanner;

public class Ex003{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - alcool, 2 - gasolina, 3 - diesel, 4 - sair");
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int total = sc.nextInt();
		
		while(total != 4) {
			
			if(total == 1) {
				alcool = alcool + 1;
			}
			
			else if(total == 2) {
				gasolina = gasolina + 1;
			}
			
			else if(total == 3) {
				diesel = diesel + 1;
			}
			
			total = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}