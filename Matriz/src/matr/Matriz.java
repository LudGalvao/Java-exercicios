package matr;

import java.util.Scanner;

public class Matriz {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da matriz(n x n): ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n]; // dois colchetes = arranjo bidimensional
		
		for(int i = 0; i < n; i++) { // for das linhas
			for(int j = 0; j < n; j++) { // for das colunas
				System.out.print("Digite um número: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int numerosNegativos = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		
		System.out.println("Números negativos = " + numerosNegativos);
		
		sc.close();
	}
}
