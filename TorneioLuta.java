package desafios;

import java.util.Random;

public class TorneioLuta {

    public static void main(String[] args) {

        int vidaPersonagem1 = 100;
        int vidaPersonagem2 = 100;
        Random gerador = new Random();

        int rodada = 1;

        do {
            System.out.println("--- Rodada " + rodada + " ---");

         
            int dano1 = gerador.nextInt(20) + 1; 
            vidaPersonagem2 -= dano1;
            if (vidaPersonagem2 < 0) {
                vidaPersonagem2 = 0;
            }
            System.out.println("Personagem 1 atacou! Dano: " + dano1);
            System.out.println("Vida do Personagem 2: " + vidaPersonagem2);

            
            if (vidaPersonagem2 > 0) { 
                int dano2 = gerador.nextInt(20) + 1; 
                vidaPersonagem1 -= dano2;
                if (vidaPersonagem1 < 0) {
                    vidaPersonagem1 = 0;
                }
                System.out.println("Personagem 2 atacou! Dano: " + dano2);
                System.out.println("Vida do Personagem 1: " + vidaPersonagem1);
            }

            System.out.println();
            rodada++;

        } while (vidaPersonagem1 > 0 && vidaPersonagem2 > 0);

        System.out.println("--- Fim da Luta ---");
        if (vidaPersonagem1 == 0) {
            System.out.println("O Vencedor é o Personagem 2!");
        } else {
            System.out.println("O Vencedor é o Personagem 1!");
        }
    }
}