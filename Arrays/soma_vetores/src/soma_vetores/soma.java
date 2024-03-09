package soma_vetores;

import java.util.Scanner;

public class soma {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor: ");
		int quantidade = sc.nextInt();
		
		int[] vetorA = new int[quantidade];
		int[] vetorB = new int[quantidade];
		int[] vetorC = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite os valores do vetor A: ");
			vetorA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite os valores do vetor B: ");
			vetorB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < quantidade; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Valor resultante: ");
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println(vetorC[i]);
		}
		
		
		sc.close();
	}
}
