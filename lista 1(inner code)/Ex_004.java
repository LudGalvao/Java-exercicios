import java.util.Scanner;

public class Ex_4{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int cod_1;
		int cod_2;
		float val_1;
		float val_2;
		int qntd_1;
		int qntd_2;
		
		cod_1 = sc.nextInt();
		cod_2 = sc.nextInt();
		val_1 = sc.nextFloat();
		val_2 = sc.nextFloat();
		qntd_1 = sc.nextInt();
		qntd_2 = sc.nextInt();
		
		float calc = (val_1 * qntd_1 + val_2 * qntd_2) * (25 / 100 + 1);
		
		System.out.printf("O valor total a pagar é R$ %.2f", calc );
		
		sc.close();
		
	}
}
