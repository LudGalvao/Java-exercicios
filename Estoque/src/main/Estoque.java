package main;

import produtos.Produtos;  // Corrigindo a importação
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Estoque {  // Nome da classe com 'E' maiúsculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produtos> listarProdutos = new ArrayList<>();
        
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("Estoque atualizado: ");

            if(!listarProdutos.isEmpty()){
                int index = 0;
                for (Produtos produto : listarProdutos){
                    System.out.println("Índice: " + index + " - " + produto);
                    index++;
                }
            } else {
                System.out.println("Nenhum produto na lista.");
            }

            System.out.println();
            System.out.println("Opções:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produtos do estoque");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha a opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer após a leitura do inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer após a leitura do double

                    System.out.print("Quantidade do Produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer após a leitura do inteiro

                
                    Produtos novoProduto = new Produtos(nome, preco, quantidade);  // Corrigindo o nome do objeto
                    listarProdutos.add(novoProduto);
                    break;

                case 2:
                    if (!listarProdutos.isEmpty()) {
                        System.out.print("Entre com o índice do produto para remover: ");
                        int indiceRemover = sc.nextInt();
                
                        if (indiceRemover >= 0 && indiceRemover < listarProdutos.size()) {
                            listarProdutos.remove(indiceRemover);
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    } else {
                        System.out.println("Nenhum produto na lista para remover.");
                    }
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}

