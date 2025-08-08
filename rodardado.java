package desafios;

import java.util.Random;

public class rodardado {
    public static void main(String[] args) {
        Random rand = new Random();
        int tentativas = 0;
        int dado;

        do {
            dado = rand.nextInt(6) + 1; 
            tentativas++;
            System.out.println("Tentativa " + tentativas + ": Saiu " + dado);
        } while (dado != 6);

        System.out.println("Foram necessárias " + tentativas + " tentativas para sair 6.");
    }
}