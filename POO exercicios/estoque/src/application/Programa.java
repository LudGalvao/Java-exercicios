package application;

import java.util.Scanner;
import entidade.Produto;

public class Programa {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com as informações do produto: ");
		
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		
		System.out.println();
		System.out.println("Informações: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Informações atualizadas: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Informações atualizadas: " + produto);
		
		sc.close();
	}
}
