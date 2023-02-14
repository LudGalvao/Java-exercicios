package application;

import java.util.Scanner;
import entities.Conta;

public class Bank {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta(0, "");
		
		System.out.println("Informe os seus dados: ");
		
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Entre com o seu titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Tem depósito inicial(s/n): ");
		char x = sc.next().charAt(0);
		
		if(x == 's') {
			System.out.print("Entre com o depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		
		else if(x == 'n') {
			conta = new Conta(numero, titular);
		}
		
		else {
			System.out.println("Opção inválida");
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Conta atualizada: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.retirar(valorSaque);
		
		System.out.println("Conta atualizada: ");
		System.out.println(conta);
		
		sc.close();
	}
}
