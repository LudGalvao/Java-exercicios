package negativo;

import java.util.Scanner;

public class arrayNegativos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantidade do vetor(1 a 10): ");
		int vezes = sc.nextInt();
		
		int[] vect = new int [vezes];
		
		for(int i = 0; i < vezes; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Numeros negativos: ");
		
		for(int i = 0; i < vezes; i++) {
			if(vect[i] < 0) {
				System.out.print(vect[i]);
			}
			
			else {
				break;
			}
		}
		
		sc.close();
	}
}
