package sistemabancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static GerenciadoraClientes gerClientes;
	static GerenciadoraContas gerContas;
	
	public static void main(String[]args) {
		
		inicializaSistemaBancario(); // criar algumas contas e clientes fictios
		
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		
		while(continua) {
			
			printMenu();
			
			int opcao = sc.nextInt();
			
			switch(opcao) {
			// Consultar por um cliente
			case 1:
				System.out.println("Digite o id do cliente: ");
				int idCliente = sc.nextInt();
				Cliente cliente = gerClientes.pesquisaCliente(idCliente);
				
				if(cliente != null) {
					System.out.println(cliente.toString());
				}
				else {
					System.out.println("Cliente não encontrado");
				}
				break;
			case 2:
				System.out.println("Digite o id da conta: ");
				int idConta = sc.nextInt();
				ContaCorrente conta= gerContas.pesquisaConta(idConta);
				
				if(conta!= null) {
					System.out.println(conta.toString());
				}
				else {
					System.out.println("Conta não encontrado");
				}
				break;
			case 3:
				System.out.println("Digite o ID do cliente: ");
				int idCliente2 = sc.nextInt();
				Cliente cliente2 = gerClientes.pesquisaCliente(idCliente2);
				
				if(cliente2 != null) {
					cliente2.setAtivo(true);
					System.out.println("Cliente ativado com sucesso");
				}
				else {
					System.out.println("Cliente não encontrado");
				}
				break;
			case 4:
				System.out.println("Digite o ID do cliente: ");
				int idCliente3 = sc.nextInt();
				Cliente cliente3 = gerClientes.pesquisaCliente(idCliente3);
				
				if(cliente3 != null) {
					cliente3.setAtivo(false);
					System.out.println("Cliente desativado com sucesso");
				}
				else {
					System.out.println("Cliente não encontrado");
				}
				break;
			case 5:
				continua = false;
				System.out.println("Sistema encerrado");
				break;
			}
			
		}
		
	}
	
	private static void printMenu() {
		System.out.println("Escolha o que voce deseja fazer? \n");
		System.out.println("1) Consultar um cliente;");
		System.out.println("2) Consultar uma conta corrente;");
		System.out.println("3) Ativar um cliente;");
		System.out.println("4) Desativar um cliente;");
		System.out.println("5) Sair;");
		System.out.println();
		
	}

	private static void inicializaSistemaBancario() {
		// criando lista vazia de contas e clientes
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		List<Cliente> clientesDoBanco = new ArrayList<>();
		
		// criando e inserido duas contas na lista de contas correntes do banco
		ContaCorrente conta01 = new ContaCorrente(1, 0, true);
		ContaCorrente conta02 = new ContaCorrente(1, 0, true);
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		// criando dois clientes e associando as contas criadas acima a eles
		Cliente cliente01 = new Cliente(1, "Joao da Silva", 20, "joaodasilva@gmail", conta01.getId(), true);
		Cliente cliente02 = new Cliente(2, "Maria da Silva", 22, "mariasilva@gmail", conta02.getId(), true);
		
		// inserido os clientes criados na lista de clientes do banco
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		gerContas = new GerenciadoraContas(contasDoBanco);
		
		
	}
	
	

}
