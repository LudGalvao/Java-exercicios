package main;

import java.util.Scanner;

public class ex3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int vezes = sc.nextInt();
		
		double[] vectNumeros = new double [vezes];
		
		for(int i = 0; i < vectNumeros.length; i++) {
			System.out.print("Digite um número: ");
			vectNumeros[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < vectNumeros.length; i++) {
			soma += vectNumeros[i];
		}
		
		double media = soma / vezes;
		
		System.out.print("Valores: ");
		for(int i = 0; i < vectNumeros.length; i++) {
			System.out.print(vectNumeros[i]);
			if( i < vectNumeros.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", media);
		
		
		sc.close();
	}
}
