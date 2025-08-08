package desafios;

import java.util.Random;

public class aventuradodragao {
    public static void main(String[] args) {
        int vidaJogador = 100;
        Random rand = new Random();

        while (vidaJogador > 0) {
            int dano = rand.nextInt(16) + 5; 
            vidaJogador -= dano;

            if (vidaJogador < 0) {
                vidaJogador = 0; 
            }

            System.out.println("O dragão atacou com dano de: " + dano);
            System.out.println("Vida do jogador: " + vidaJogador);
            System.out.println("------------------------------");
        }

        System.out.println("O jogador foi derrotado!");
    }
}