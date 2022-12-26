import java.util.Scanner;

public class Ex_5 {
  public static void main(String[] args) {
	  
    double salario_minimo = 1212.00;
    double salario;
    double calc;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe o salário do usuário: ");
    salario = sc.nextDouble();
    
    calc = salario / salario_minimo;
    
    System.out.printf("Seu salário corresponde a %.0f salários minimos", calc);
    
    sc.close();
    
  }
}
