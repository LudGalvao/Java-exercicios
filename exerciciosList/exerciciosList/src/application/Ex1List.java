package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1List {
	public static void main(String[]args) {
		List<String> listID = new ArrayList<>();
		List<String> listNome = new ArrayList<>();
		List<Double> listSalario = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas pessoas serão registradas: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
	        System.out.println("\nPessoa #" + (i + 1) + ":");
            System.out.print("Informe o id: ");
            String id = sc.next();
            listID.add(id);

            System.out.print("Nome: ");
            sc.nextLine(); 
            String nome = sc.nextLine(); 
            listNome.add(nome);

            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            listSalario.add(salario);
		}
		
		System.out.print("Entre com o id para aumentar o salario: ");
		String idAumento = sc.next();
		int index = listID.indexOf(idAumento); // vai conferir a posição do id
		
		if(index == -1) {
			System.out.println("O id não existe");
		}
		else {
			System.out.print("Entre com a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			double salarioAtual = listSalario.get(index) * (1 + porcentagem / 100);
			listSalario.set(index, salarioAtual);
		}
		
		
		System.out.println("\nLista de funcionarios: ");
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("%s, %s, %.2f\n" ,listID.get(i) + ", " + listNome.get(i) + ", " + listSalario.get(i));
		}
		
		sc.close();
	}
}
