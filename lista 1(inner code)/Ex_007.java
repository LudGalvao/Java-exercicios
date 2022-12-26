import java.util.Scanner;

public class Ex_7{
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade mínima");
		int qntd_min;
		
		System.out.println("Informe a quantidade máxima");
		int qntd_max;
		
		qntd_min = sc.nextInt();
		qntd_max = sc.nextInt();
		
		int estoque = (qntd_min + qntd_max) / 2;
		
		System.out.printf("A média do estoque é " + estoque);
		
		sc.close();
	}
}