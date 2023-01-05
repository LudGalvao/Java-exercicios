import java.util.Scanner;

public class Ex008{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Informe o valor de a: ");
		    double a = sc.nextDouble();

		    if (a == 0) {
		      System.out.println("A equação não é do segundo grau.");
		      return;
		    }

		    System.out.print("Informe o valor de b: ");
		    double b = sc.nextDouble();

		    System.out.print("Informe o valor de c: ");
		    double c = sc.nextDouble();

		    double delta = b * b - 4 * a * c;

		    if (delta < 0) {
		      System.out.println("A equação não possui raízes reais.");
		      return;
		    }

		    if (delta == 0) {
		      double x = -b / (2 * a);
		      System.out.println("A equação possui uma raiz real: " + x);
		      return;
		    }

		    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		    System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);
		    
		    sc.close();
		  }
		}