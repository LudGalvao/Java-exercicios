package entidade;

public class sub{
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double aumento;
	
	public double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumentoSalario() {
		salarioBruto += salarioBruto * (aumento / 100) - imposto;
		return salarioBruto;
	}
}