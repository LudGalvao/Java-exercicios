package abaixo_media;

import java.util.Scanner;

public class abaixo_da_media {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int elementos = sc.nextInt();
		
		double[] numeros = new double[elementos];
		
		for(int i = 0; i < elementos; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < elementos; i++) {
			soma += numeros[i];
		}
		
		double media = soma / elementos;
		
		System.out.printf("Media do vetor = %.2f\n", media );
		System.out.println("Elementos abaixo da media: ");
		
		for(int i = 0; i < elementos; i++) {
			if(numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}
		
		sc.close();
	}
}
