import java.util.Scanner;

public class Ex014{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe seu sexo e a sua altura. Ex: h para homem e m para mulher: ");
		String sexo = sc.next();
		double altura = sc.nextDouble();
		
		if(sexo.equals("h") || sexo.equals("H")) {
			double peso = (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é %.2f", peso);
		}
		
		else if(sexo.equals("m") || sexo.equals("M")) {
			double peso = (62.1 * altura) - 44.7;
			System.out.printf("Seu peso ideal é %.2f", peso);
		}
		
		else {
			System.out.println("Inválido");
		}
		
		sc.close();
	}
}