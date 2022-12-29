import java.util.Scanner;

public class Ex004{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe dois números inteiros de 1 a 24: ");
		int hora_inicial = sc.nextInt();
		int hora_final = sc.nextInt();
		
		int tempo;
		
		if (hora_inicial < hora_final) {
			tempo = hora_final - hora_inicial;
		}
		else {
			tempo = 24 - hora_inicial + hora_final;
		}
		
		System.out.println("O jogo durou " + tempo + " hora(s)");
		
		sc.close();
	}
}
