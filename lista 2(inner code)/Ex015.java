import java.util.Scanner;

public class Ex015 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    System.out.println("Escolha uma opção:");
    System.out.println("1 - Verificar se um dos números é múltiplo do outro");
    System.out.println("2 - Verificar se os dois números são pares");
    System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
    System.out.println("4 - Sair");
    System.out.print("Opção: ");
    int opcao = scanner.nextInt();

    if (opcao == 1) {
      if (num1 % num2 == 0) {
        System.out.println(num1 + " é múltiplo de " + num2);
      } else if (num2 % num1 == 0) {
        System.out.println(num2 + " é múltiplo de " + num1);
      } else {
        System.out.println("Nenhum dos números é múltiplo do outro.");
      }
    } else if (opcao == 2) {
      if (num1 % 2 == 0 && num2 % 2 == 0) {
        System.out.println("Os dois números são pares.");
      } else {
        System.out.println("Os dois números não são pares.");
      }
    } else if (opcao == 3) {
      double media = (num1 + num2) / 2.0;
      if (media >= 7) {
        System.out.println("A média dos dois números é maior ou igual a 7.");
      } else {
        System.out.println("A média dos dois números é menor que 7.");
      }
    } else if (opcao == 4) {
      System.out.println("Saindo do programa.");
    } else {
      System.out.println("Opção inválida.");
    }

    scanner.close();
  }
}