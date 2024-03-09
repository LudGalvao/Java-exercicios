package media_pares;

import java.util.Scanner;

public class media_par {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int quantidade = sc.nextInt();
		
		int[] pares = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();
		}
		
		int nPares = 0;
		double soma = 0.0;
		
		for(int i = 0; i < quantidade; i++) {
			if(pares[i] % 2 == 0) {
				soma += pares[i];
				nPares++;
			}
		}
		
		if(nPares == 0) {
			System.out.println("Nenhum número Par");
		}
		else {
			double media = soma / quantidade;
			System.out.printf("Media dos pares = %.2f\n", media);
		}
		sc.close();
	}
}
