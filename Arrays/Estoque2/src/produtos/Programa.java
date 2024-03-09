package produtos;

import java.util.Scanner;

import entities.Produto;

public class Programa {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("");
		int vezes = sc.nextInt();
		
		Produto[] vectProduto = new Produto[vezes];
		
		for(int i = 0; i < vezes; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vectProduto[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < vezes; i++) {
			soma += vectProduto[i].getPreco();
		}
		
		double media = soma / vezes;
		
		System.out.printf("Media dos preço produto: %.2f%n", media);
		
		sc.close();
	}
}
