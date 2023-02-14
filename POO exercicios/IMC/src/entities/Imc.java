package entities;

public class Imc {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Imc(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	} 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double calculo() {
	    return peso / (altura * altura);
	}
	
	public String toString() {
		return "nome: " 
				+ nome
				+ ", idade: "
				+ idade
				+ ", Seu IMC é : "
				+ String.format("%.2f", calculo());
	}
	
	
}
