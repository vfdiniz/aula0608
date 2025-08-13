package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //ENTRADA
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números inteiros. Para parar, digite 'fim'.");

        //PROCESSAMENTO
        while (true) {
            System.out.print("Digite um número ou 'fim' para parar: ");
            if (ler.hasNextInt()) {
                numeros.add(ler.nextInt());
            } else {
                String entrada = ler.next();
                if (entrada.equalsIgnoreCase("fim")) {
                    
                    break;
                } else {
                
                    System.out.println("Entrada inválida. Tente novamente.");
                }
            }
        }

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        //SAIDA
        System.out.println("\nA soma de todos os números é: " + soma);
        ler.close();
    }
}
