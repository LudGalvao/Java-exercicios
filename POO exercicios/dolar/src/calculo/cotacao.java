package calculo;

public class cotacao {
	
	public static final double IOF = 0.06;
	
	public static double totalReais(double valorCota, double valorDolar) {
		return valorCota * valorDolar * (1.0 + IOF);
	}
	
}
