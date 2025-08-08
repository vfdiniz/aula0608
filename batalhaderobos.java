package desafios;

import java.util.Random;
import java.util.Scanner;

public class batalhaderobos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int forcaRobo1, forcaRobo2;
        int pontuacaoRobo1 = 0, pontuacaoRobo2 = 0;

        System.out.println("Digite a força inicial do Robo 1 (de 1 a 100): ");
        forcaRobo1 = ler.nextInt();

        System.out.println("Digite a força inicial do Robo 2 (de 1 a 100): ");
        forcaRobo2 = ler.nextInt();


        for (int i = 1; i <= 5; i++) {
            int forçaRodadaRobo1 = random.nextInt(100) + 1;
            int forçaRodadaRobo2 = random.nextInt(100) + 1;


            System.out.println("Rodada " + i + ":");
            System.out.println("Força do Robo 1: " + forçaRodadaRobo1);
            System.out.println("Força do Robo 2: " + forçaRodadaRobo2);

            if (forçaRodadaRobo1 > forçaRodadaRobo2) {
                System.out.println("Robo 1 vence esta rodada!");
                pontuacaoRobo1++;
            } else if (forçaRodadaRobo2 > forçaRodadaRobo1) {
                System.out.println("Robo 2 vence esta rodada!");
                pontuacaoRobo2++;
            } else {
                System.out.println("Empate nesta rodada!");
            }

            System.out.println();
        }
        System.out.println("Placar final:");
        System.out.println("Robo 1: " + pontuacaoRobo1);
        System.out.println("Robo 2: " + pontuacaoRobo2);

        if (pontuacaoRobo1 > pontuacaoRobo2) {
            System.out.println("Robo 1 é o vencedor!");
        } else if (pontuacaoRobo2 > pontuacaoRobo1) {
            System.out.println("Robo 2 é o vencedor!");
        } else {
            System.out.println("O resultado final é um empate!");
        }

        ler.close();
    }
}