package entities;

public class Sub {
	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public Sub(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
	    double aumento = salarioBruto * (porcentagem / 100);
	    salarioBruto += aumento;
	}

	
	public String toString() {
		return "Nome : " + nome
		+  "\nSalario Bruto: " + salarioBruto 
		+  "\nImposto: " + imposto
		+ "\nSalario liquido: " + salarioLiquido();
	}
}
