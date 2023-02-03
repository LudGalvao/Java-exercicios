package entidades;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
