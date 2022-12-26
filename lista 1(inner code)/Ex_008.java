import java.util.Scanner;

public class Ex_8{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da cotação");
		double cotacao;
		
		System.out.println("Informe o valor em dólar");
		double dolar;
		
		cotacao = sc.nextDouble();
		dolar = sc.nextDouble();
		
		double conv = dolar * cotacao;
		
		System.out.printf("O valor em reais é R$ %.2f ", conv);
		
		sc.close();
	}
}
