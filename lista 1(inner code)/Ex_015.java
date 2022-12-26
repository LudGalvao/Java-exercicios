import java.util.Scanner;

public class Ex_15{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 

	    System.out.print("Informe o peso dos peixes (em quilos): ");
	    double peso = sc.nextDouble(); 

	    double excesso = peso - 50;

	    excesso = Math.max(excesso, 0); 
	    double multa = excesso * 4; 

	    System.out.println("Excesso de peso: " + excesso + " quilos. Multa: R$ " + multa);
	    
	    sc.close();
	  }
	}
