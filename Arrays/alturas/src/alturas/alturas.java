package alturas;

import java.util.Scanner;

public class alturas {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int nMenores;
		double alturaTotal, alturaMedia, percentualMenores;
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int pessoas = sc.nextInt();
		
		String[] vectNome = new String[pessoas];
		int[] vectIdade = new int[pessoas];
		double[] vectAltura = new double[pessoas];
		
		for(int i = 0; i < pessoas; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			vectNome[i] = sc.next();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectAltura[i] = sc.nextDouble();
		}
		
		alturaTotal = 0.0;
		nMenores = 0;
		for(int i = 0; i < vectAltura.length; i++) {
			if( vectIdade[i] < 16) {
				nMenores++;
			}
			alturaTotal += vectAltura[i];
		}
		
		alturaMedia = alturaTotal / pessoas;
		percentualMenores = ((double)nMenores / pessoas) * 100.0;
		
		System.out.printf("\nAltura Media = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for(int i = 0; i < pessoas; i++) {
			if(vectIdade[i] < 16) {
				System.out.printf("%s\n", vectNome[i]);
			}
		}
		
		sc.close();
	}
}
