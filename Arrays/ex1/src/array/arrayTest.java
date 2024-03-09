package array;

import java.util.Scanner;

public class arrayTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade no vector: ");
		int vezes = sc.nextInt();
		
		double[] alturaVect = new double[vezes];
		
		for(int i = 0; i < vezes; i++) {
			System.out.print("Informe uma altura: ");
			alturaVect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < vezes; i++) {
			soma += alturaVect[i];
		}
		
		double media = soma / vezes;
		
		System.out.printf("Media geral: %.2f%n", media);
		
		
		sc.close();
	}
}
