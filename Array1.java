package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String entrada;

        System.out.println("Digite números inteiros. Para parar, digite 'fim'.");

        while (true) {
            System.out.print("Digite um número: ");
            entrada = ler.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro ou 'fim' para encerrar.");
            }
        }

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("A soma de todos os números é: " + soma);
        ler.close();
    }
}