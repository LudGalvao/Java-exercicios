import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe suas 4 notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

      
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7.0) {
            System.out.printf("Você foi aprovado e a sua média foi %.2f", media);
        } 
        else {
            System.out.println("Informe a nota da recuperação: ");
            double recuperacao = sc.nextDouble();

            double media_recu = (media + recuperacao) / 5;

            if (media_recu >= 7.0) {
                System.out.printf("Você foi aprovado com recuperação e a média foi %.2f", media_recu);
            } 
            else {
                System.out.println("Você foi reprovado");
            }
        }

        sc.close();
    }
}
