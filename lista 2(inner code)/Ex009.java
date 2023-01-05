import java.util.Scanner;

public class Ex009 {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    double num = sc.nextDouble(); 

    if (Math.ceil(num) == Math.floor(num)) {
      System.out.println("O número é inteiro");
    } 
    
    else {
      System.out.println("O número é decimal");
    }
    
    sc.close();
  }
}
