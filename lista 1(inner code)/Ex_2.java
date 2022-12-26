public class Ex_2{
	public static void main(String[]args){
		
		float media_1 = (8 + 9 + 7) / 3;
		float media_2 = (4 + 5 + 6) / 3;
		float soma = media_1 + media_2;
		float media_3 = (media_1 + media_2 + soma) / 3;
		
		System.out.printf("A media total é: %.2f", media_3);
		
	}
}