package application;

import java.util.Scanner;
import entidade.sub;

public class retangulo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		sub Sub = new sub();
		
		System.out.println("Entre com a altura e a largura do Retângulo: ");
		Sub.altura = sc.nextDouble();
		Sub.largura = sc.nextDouble();
		
		System.out.println("Area: " + Sub.area() );
		System.out.println("Perimetro: " + Sub.perimetro() );
		System.out.println("Diagonal: " + Sub.Diagonal() );
		
		sc.close();
	}
}
