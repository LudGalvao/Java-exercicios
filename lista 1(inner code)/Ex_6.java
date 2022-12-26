import java.util.Scanner;

public class Ex_6{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe um número inteiro");
		int num;
		
		num = sc.nextInt();
		
		int cal_ant = num - 1;
		int cal_suc = num + 1;
		
		System.out.println("Seu antecesssor é " + cal_ant);
		System.out.println("Seu sucessor é " + cal_suc);
		
		sc.close();
	}
}
