import java.util.Scanner;

public class Ex007{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe seu sálario: ");
		double salario = sc.nextDouble();
		
		if(salario <= 280) {
			double aumento20 = (salario * 1.20) - salario;
			System.out.printf("O seu sálario antes do reajuste era R$ %.2f \n", salario );
			System.out.println("O percentual do aumento foi de 20%");
			System.out.printf("O valor do aumento foi R$ %.2f \n",  aumento20);
			System.out.printf("O seu sálario atual é R$%.2f ", (aumento20 + salario));
		}
		else if (salario > 280 && salario <= 700) {
            double aumento15 = (salario * 1.15) - salario;
            System.out.printf("O seu sálario antes do reajuste era R$ %.2f \n", salario);
            System.out.println("O percentual do aumento foi de 15%");
            System.out.printf("O valor do aumento foi R$ %.2f \n", aumento15);
            System.out.printf("O seu sálario atual é R$%.2f ", (aumento15 + salario));
        } 
		
		else if (salario > 700 && salario <= 1500) {
            double aumento10 = (salario * 1.10) - salario;
            System.out.printf("O seu sálario antes do reajuste era R$ %.2f \n", salario);
            System.out.println("O percentual do aumento foi de 10%");
            System.out.printf("O valor do aumento foi R$ %.2f \n", aumento10);
            System.out.printf("O seu sálario atual é R$%.2f ", (aumento10 + salario));
		}
		
         else {
            double aumento5 = (salario * 1.05) - salario;
            System.out.printf("O seu sálario antes do reajuste era R$ %.2f \n", salario);
            System.out.println("O percentual do aumento foi de 5%");
            System.out.printf("O valor do aumento foi R$ %.2f \n", aumento5);
            System.out.printf("O seu sálario atual é R$%.2f ", (aumento5 + salario));
        }
		
		sc.close();
    }
}