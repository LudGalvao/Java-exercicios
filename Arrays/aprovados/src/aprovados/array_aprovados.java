package aprovados;

import java.util.Scanner;

public class array_aprovados {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados: ");
		int alunos = sc.nextInt();
		
		String[] vectNomes = new String[alunos];
		double[] vectNota1 = new double[alunos];
		double[] vectNota2 = new double[alunos];
		
		for(int i = 0; i < alunos; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			vectNomes[i] = sc.next();
			vectNota1[i] = sc.nextDouble();
			vectNota2[i] = sc.nextDouble();
		}
		
		double soma1 = 0.0;
		double soma2 = 0.0;
		for(int i = 0; i < alunos; i++) {
			soma1 += vectNota1[i];
			soma2 += vectNota2[i];
		}
		
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < alunos; i++) {
			double media = (soma1 + soma2) / 2;
			
			if(media >= 6) {
				System.out.println(vectNomes[i]);
			}
		}
		
		
		sc.close();
	}
}
