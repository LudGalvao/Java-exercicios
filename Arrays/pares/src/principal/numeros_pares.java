package principal;

import java.util.Scanner;

public class numeros_pares {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar: ");
		int quantidade = sc.nextInt();
		
		int[] numeros = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("\nNumeros Pares: ");
		
		int contador = 0;
		
		for(int i = 0; i < quantidade; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				contador++;
			}
		}
		
		System.out.printf("\n\nQuantidade de pares = %d\n", contador);
		
		sc.close();
	}
}
