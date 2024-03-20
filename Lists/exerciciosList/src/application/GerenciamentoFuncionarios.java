package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoFuncionarios {
    public static void main(String[] args) {
        int contador = 0;
        double soma = 0.0;

        Scanner sc = new Scanner(System.in);

        List<String> nomeFuncionarios = new ArrayList<>();
        List<String> cargoFuncionarios = new ArrayList<>();
        List<Double> salarioFuncionarios = new ArrayList<>();

        while (true) {
            System.out.print("Funcionario #" + contador + "\n");
            System.out.print("Informe o nome do funcionario: ");
            String nome = sc.nextLine();
            nomeFuncionarios.add(nome);

            System.out.print("Informe o cargo do funcionario: ");
            String cargo = sc.nextLine();
            cargoFuncionarios.add(cargo);

            System.out.print("Informe o salario do funcionario. R$");
            double salario = sc.nextDouble();
            salarioFuncionarios.add(salario);
            soma += salario;

            System.out.print("adicionar mais um funcionario? (s | n): ");
            String continuar = sc.next();
            if (!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("S")) {
                break;
            }

            contador++;
            sc.nextLine(); // Limpa o buffer do scanner
        }

        sc.close(); // Fechamento do scanner

        System.out.println("Lista de Funcionários:");
        for (int i = 0; i < nomeFuncionarios.size(); i++) {
            System.out.println("Nome: " + nomeFuncionarios.get(i) + " - Cargo: " + cargoFuncionarios.get(i) + " - Salário: R$" + salarioFuncionarios.get(i));
        }
        System.out.println("Media salarial: " + (soma / nomeFuncionarios.size()));
    }
}
