import java.util.Scanner;

	public class Ex005{
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("Informe o código e a quantidade em ordem(ex: cod 3 e qntd 4): ");
			
			int cod = sc.nextInt();
			int qntd = sc.nextInt();
			
			double total = 0;
			
			if(cod == 1) {
				total = qntd * 4.0;
			}
			else if(cod == 2) {
				total = qntd * 4.50;
			}
			else if(cod == 3) {
				total = qntd * 5.0;
			}
			else if(cod == 4) {
				total = qntd * 2.0;
			}
			else if (cod == 5) {
				total = qntd * 1.50;
			}
			else{
				System.out.printf("Código inválido");
			}
		
			
			if (total > 0) {
	            System.out.printf("O total foi R$ %.2f", total);
	        }
			
			sc.close();
		}
	}
