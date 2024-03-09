package mais_velho;

import java.util.Scanner;

public class velho {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar: ");
		int quantidade = sc.nextInt();
		
		String[] vectNome = new String[quantidade];
		int[] vectIdade = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Dados da %da pepssoa: \n", i + 1);
			System.out.print("Nome: ");
			vectNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
		}
		
		int maiorIdade = vectIdade[0];
		int posMaior = 0;
		
		for(int i = 1; i < quantidade; i++) {
			if(vectIdade[i] > maiorIdade) {
				maiorIdade = vectIdade[i];
				posMaior = i;
			}
		}
		
		System.out.printf("Pessoa mais velha = %s\n", vectNome[posMaior]);
		
		
		
		sc.close();
	}
}
