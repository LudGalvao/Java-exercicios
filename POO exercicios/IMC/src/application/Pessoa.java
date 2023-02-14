package application;

import java.util.Scanner;
import entities.Imc;

public class Pessoa {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seus dados");
		System.out.println();
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Informe seu peso: ");
		double peso = sc.nextDouble();
		
		Imc imc = new Imc(nome, idade, altura, peso);
		
		System.out.println();
		System.out.println("Dados atualizados: ");
		System.out.println(imc);
		
		sc.close();
	}
}