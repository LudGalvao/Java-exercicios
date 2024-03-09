package maior;

import java.util.Scanner;

public class maior_posicao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int quantidade = sc.nextInt();
		
		double[] vectMaior = new double[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite um numero: ");
			vectMaior[i] = sc.nextDouble();
		}
		
		double maior = vectMaior[0];
		int posMaior = 0;
		
		for(int i = 1; i < quantidade; i++) {
			if(vectMaior[i] > maior) {
				maior = vectMaior[i];
				posMaior = i;
			}
		}
		
		System.out.printf("Maior valor = %.1f\n", maior);
		System.out.printf("Posição do maior valor = %d\n", posMaior);
		
		sc.close();
	}
}
