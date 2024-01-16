package main;

import orm.dados;
import orm.dados.personagem;
import orm.dados.mostro;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o nome do personagem: ");
        String nome_personagem = sc.nextLine();
        System.out.println("Escreva o sexo do personagem: ");
        String sexo_personagem = sc.nextLine();


        dados.personagem jogador = new personagem(nome_personagem, sexo_personagem, 20, 3);
        dados.mostro mostro = new mostro("Goblin", 12, 4);

        while (jogador.getVida() > 0 && mostro.getVida() > 0){
            System.out.println("Status Atuais: ");
            System.out.println("Vida do Jogador: " + jogador.getVida());
            System.out.println("Vida do Goblin: " + mostro.getVida());

            System.out.println("\nTurno do Jogador:");
            jogador.atacar(mostro);

            if(mostro.getVida() <= 0){
                System.out.println("Voce derrotou o " + mostro.getNome());
                break;
            }

            System.out.println("\nTurno do Globin:");
            mostro.atacar(jogador);

            if(jogador.getVida() <= 0){
                System.out.println("Voce derrotou o " + jogador.getNome());
                break;
            }
        }

        sc.close();
    }
}
