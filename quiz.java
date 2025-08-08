package desafios;

import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pontuacao = 0;

        // Pergunta 1
        System.out.println("Pergunta 1: Qual é o nome do protagonista de 'Naruto'?");
        System.out.println("a) Sasuke");
        System.out.println("b) Naruto");
        System.out.println("c) Sakura");
        System.out.print("Sua resposta: ");
        String resposta1 = ler.nextLine().toLowerCase();

        if (resposta1.equals("b") || resposta1.equals("naruto")) {
            System.out.println("Resposta correta!\n");
            pontuacao++;
        } else {
            System.out.println("Resposta incorreta! A resposta correta era b) Naruto.\n");
        }

        // Pergunta 2
        System.out.println("Pergunta 2: Em qual jogo você encontra o personagem 'Master Chief'?");
        System.out.println("a) Halo");
        System.out.println("b) Call of Duty");
        System.out.println("c) Battlefield");
        System.out.print("Sua resposta: ");
        String resposta2 = ler.nextLine().toLowerCase();

        if (resposta2.equals("a") || resposta2.equals("halo")) {
            System.out.println("Resposta correta!\n");
            pontuacao++;
        } else {
            System.out.println("Resposta incorreta! A resposta correta era a) Halo.\n");
        }

        // Pergunta 3
        System.out.println("Pergunta 3: Qual série tem como personagem principal o personagem conhecido como 'Eleven'?");
        System.out.println("a) Stranger Things");
        System.out.println("b) Dark");
        System.out.println("c) The Witcher");
        System.out.print("Sua resposta: ");
        String resposta3 = ler.nextLine().toLowerCase();

        if (resposta3.equals("a") || resposta3.equals("stranger things") || resposta3.equals("stranger")) {
            System.out.println("Resposta correta!\n");
            pontuacao++;
        } else {
            System.out.println("Resposta incorreta! A resposta correta era a) Stranger Things.\n");
        }

        System.out.println("Fim do quiz! Sua pontuação final é: " + pontuacao + " pontos.");
        ler.close();
    }
}