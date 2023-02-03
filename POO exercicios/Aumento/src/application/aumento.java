package application;

import java.util.Scanner;
import entidade.sub;

public class aumento {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		sub Sub = new sub();
		
		System.out.printf("Nome: ");
		Sub.nome = sc.nextLine();
		
		System.out.printf("Sálario Bruto: ");
		Sub.salarioBruto = sc.nextDouble();
		
		System.out.printf("Imposto: ");
		Sub.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + Sub.nome + " , " + "R$ " + Sub.SalarioLiquido());
		
		System.out.printf("Informe a porcetagem do aumento: ");
		Sub.aumento = sc.nextDouble();
		
		System.out.println();
		System.out.println("Atualização: " + Sub.nome + " , " + "R$ " + Sub.aumentoSalario() );
		
		
		sc.close();
	}
}
