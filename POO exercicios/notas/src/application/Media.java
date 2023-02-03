package application;

import java.util.Scanner;
import entidade.sub;

public class Media {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		sub Sub = new sub();
		
		System.out.printf("Informe seu nome: ");
		Sub.aluno = sc.nextLine();
		
		System.out.printf("Informe a sua primeira nota: ");
		Sub.nota1 = sc.nextDouble();
		
		
		while(Sub.nota1 > 30) {
			System.out.println();
			System.out.println("Nota inválida");
			System.out.println();
			
			System.out.printf("Informe a sua primeira nota: ");
			Sub.nota1 = sc.nextDouble();
		}
		
		System.out.printf("Informe a sua segunda nota: ");
		Sub.nota2 = sc.nextDouble();
		
		
		while(Sub.nota2 > 35) {
			System.out.println();
			System.out.println("Nota inválida");
			System.out.println();
			
			System.out.printf("Informe a sua segunda nota: ");
			Sub.nota2 = sc.nextDouble();
		}
		
		System.out.printf("Informe a sua terceira nota: ");
		Sub.nota3 = sc.nextDouble();
		
		
		while(Sub.nota3 > 35) {
			System.out.println();
			System.out.println("Nota inválida");
			System.out.println();
			
			System.out.printf("Informe a sua terceira nota: ");
			Sub.nota3 = sc.nextDouble();
		}
		
		System.out.printf("Media: %.2f%n", Sub.media());
		
		if(Sub.media() < 60) {
			System.out.println("RECUPERAÇÃO");
			System.out.printf("Faltou %.2f pontos%n", Sub.notaBaixa());
		}
		
		else {
			System.out.println("PASSOU");
		}
		
		
		sc.close();
	}
}
