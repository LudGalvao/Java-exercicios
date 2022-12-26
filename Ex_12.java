import java.util.Scanner;

public class Ex_12{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome, o codigo da peça, preço e a quantidade vendida(nessa ordem)");
		
		String nome = sc.nextLine();
		int codigo = sc.nextInt();
		double preco = sc.nextDouble();
		int qntd = sc.nextInt();
		
		double total_venda = preco * qntd;
		
		double comissao = total_venda * 0.05;
		
		System.out.printf("O vendedor %s recebeu uma comissão de R$%.2f por vender %d produtos no valor total de R$%.2f.",nome,comissao,qntd,total_venda);
		
		sc.close();
	}
}
