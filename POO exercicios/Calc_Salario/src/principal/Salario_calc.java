package principal;

import java.util.Scanner;
import entities.Sub;

public class Salario_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("Informe seu salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.printf("Informe o valor do imposto: ");
        double imposto = sc.nextDouble();

        Sub sub = new Sub(nome, salarioBruto, imposto);

        System.out.println(sub.toString());

        System.out.println();
        System.out.printf("Informe a porcentagem de aumento salarial: ");
        double porcentagemAumento = sc.nextDouble();
        sub.aumentarSalario(porcentagemAumento);

        System.out.println("Dados atualizados: " + sub.getNome() + ", Salário Líquido: " + sub.salarioLiquido());

        sc.close();
    }
}
