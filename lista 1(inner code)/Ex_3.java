import java.util.Scanner;

public class Ex_3{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu saldo: ");
		double saldo;
		saldo = sc.nextFloat();
		
		double reajuste = saldo * 1 / 100;
		
		System.out.printf("Saldo:R$ %.2f ", saldo);
		System.out.println();
		System.out.printf("Saldo com o reajuste:R$ %.2f", saldo + reajuste);
		
		sc.close();
	}
}
