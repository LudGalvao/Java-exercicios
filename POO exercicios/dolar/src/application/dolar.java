package application;

import java.util.Scanner;
import calculo.cotacao;

public class dolar {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual a cotação do dolar: ");
		double valorCota = sc.nextDouble();
		
		System.out.printf("Informe a quantidade de dolar que deseja comprar: ");
		double valorDolar = sc.nextDouble();
		
		double total = cotacao.totalReais(valorCota, valorDolar);
		
		System.out.printf("Total em reais: R$ %.2f%n", total);
		
		sc.close();
	}
}
