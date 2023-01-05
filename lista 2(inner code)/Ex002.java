import java.util.Scanner;

public class Ex002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe três números: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if (num1 >= num2 && num1 >= num3) {
      if (num2 >= num3) {
        System.out.printf("A ordem decrescente é %d, %d e %d", num1, num2, num3);
      } 
      
      else {
        System.out.printf("A ordem decrescente é %d, %d e %d", num1, num3, num2);
      }
     } 
    
    else if (num2 >= num1 && num2 >= num3) {
      if (num1 >= num3) {
        System.out.printf("A ordem decrescente é %d, %d e %d", num2, num1, num3);
      } 
      
      else {
        System.out.printf("A ordem decrescente é %d, %d e %d", num2, num3, num1);
      }
    } 
    
    else {
      if (num1 >= num2) {
        System.out.printf("A ordem decrescente é %d, %d e %d", num3, num1, num2);
      } 
      
      else {
        System.out.printf("A ordem decrescente é %d, %d e %d", num3, num2, num1);
      }
    }

    sc.close();
  }
}