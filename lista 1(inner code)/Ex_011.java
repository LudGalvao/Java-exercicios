import java.util.Scanner;

public class Ex_11{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tempo da viagem(em minutos ex: 1hr = 60min) e a velocidade média do carro");
		
		 int tempo_viagem;
		 int vel_carro;
		 
		 tempo_viagem = sc.nextInt();
		 vel_carro = sc.nextInt();
		 
		 int dist = tempo_viagem * vel_carro;
		 int litro = dist / 12;
		 
		 System.out.println("A sua velocidade média foi " + vel_carro + " km");
		 System.out.println("O tempo gasto com a viagem foi " + tempo_viagem + " minutos");
		 System.out.println("A distância percorrida foi " + dist + " km");
		 System.out.println("A quantidade de litros usada foi " + litro + " litros");
		 
		 sc.close();
	}
}