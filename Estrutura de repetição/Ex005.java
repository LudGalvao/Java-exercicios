import java.util.Scanner;

public class Ex005{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 - +, 2 - -, 3 - x, 4 - /");
			System.out.printf("Informe um expressão e logo seguida os números da expressões: ");
			int escolha = sc.nextInt();
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(escolha == 1) {
				int calc = num1 + num2;
				System.out.printf("A soma entre %d e %d é %d", num1,num2,calc);
			}
			
			else if(escolha == 2) {
				int calc = num1 - num2;
				System.out.printf("A subtração entre %d e %d é %d",num1,num2,Math.abs(calc));
				
			}
			
			else if(escolha == 3) {
				int calc = num1 * num2;
				System.out.printf("A multiplicação entre %d e %d é %d",num1,num2,calc);
			}
			
			else if(escolha == 4) {
				int calc = num1 / num2;
				System.out.printf("A multiplicação entre %d e %d é %d",num1,num2,calc);
			}
			
			else {
				System.out.println("Inválido");
			}
			
			System.out.println(" ");
			System.out.println("Deseja continuar? (n para sair)");
		    String resposta = sc.nextLine();
		    if (resposta.equals("n")|| resposta.equals("N")) {
		        break;
		    }
		}
		
		sc.close();
	}
}
