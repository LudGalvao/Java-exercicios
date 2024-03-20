package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunosCadastro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos alunos serão cadastrados: ");
		int quantidadeAlunos = sc.nextInt();
		
		List<String> listMatricula = new ArrayList<>();
		List<String> listNome = new ArrayList<>();
		List<Double> listNotas = new ArrayList<>();
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("\nAluno #" + (i + 1)+ ":");
			System.out.print("Informe o número da matricula: ");
			String matricula = sc.next();
			listMatricula.add(matricula);
			
			System.out.print("Informe o Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			listNome.add(nome);
			
			System.out.print("Informe a nota: ");
			double nota = sc.nextDouble();
			listNotas.add(nota);
		}
		
		double soma = 0.0;
		for(int i = 0; i < quantidadeAlunos; i++ ) {
			soma += listNotas.get(i);
		}
		
		double media = soma / quantidadeAlunos;
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			if(listNotas.get(i) >= 6.0) {
				System.out.println(listNome.get(i) + " - " + listNotas.get(i));
				System.out.println("Media geral dos alunos - " + media);
			}
			else {
				System.out.println("Media geral dos alunos - " + media);
				break;
			}
		}
	}
}
