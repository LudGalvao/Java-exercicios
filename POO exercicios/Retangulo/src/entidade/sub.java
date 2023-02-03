package entidade;

public class sub {
	public double altura;
	public double largura;
	
	public double area(){
		return largura * altura;
	}
	
	public double perimetro() {
		return (altura + largura) * 2;
	}
	
	public double Diagonal() {
	    return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
}
