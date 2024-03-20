package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutosCadastro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos produtos serão cadastrados: ");
		int quantidade = sc.nextInt();
		sc.nextLine(); 
		
		List<String> idProduto = new ArrayList<>();
		List<String> nomeProduto = new ArrayList<>();
		List<Double> precoProduto = new ArrayList<>();
		
		for(int i = 0; quantidade > i; i++) {
			System.out.println("\nProduto #" + (i + 1) + ":");
			
			System.out.print("Informe o id do produto: ");
			String id = sc.next();
			idProduto.add(id);
			
			System.out.print("Informe o nome do produto: ");
			String nome = sc.nextLine();
			nomeProduto.add(nome);
			
			System.out.print("Informe o preço do produto. R$");
			double preco = sc.nextDouble();
			precoProduto.add(preco);
		}
		
		System.out.println("Lista de Produtos: ");
		System.out.println("-------------------");
		
		for(int i = 0; i < quantidade; i++) {
		System.out.println("ID Produto: " + idProduto.get(i) + ", " +  "Nome do Produto" + nomeProduto.get(i) + ", " + "R$"+ precoProduto.get(i));
		}
		
		sc.close();
	}
}
