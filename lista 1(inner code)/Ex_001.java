import java.util.Scanner;

public class Ex_1{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade, meses e dias. EX: 3 anos, 2 meses e 15 dias = 1170 dias.");
		
		int ano;
		int meses;
		int dia;
		
		ano = sc.nextInt();
		meses = sc.nextInt();
		dia = sc.nextInt();
		
		int calc_ano = ano * 365;
		int calc_meses = meses * 30;
		int calc_total = calc_ano + calc_meses + dia;
		
		System.out.printf("%d anos, %d meses e %d dias = %d dias", ano, meses, dia, calc_total);
		
		sc.close();
	}
}
