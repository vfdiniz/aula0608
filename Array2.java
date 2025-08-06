package Desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Integer> listaNumero = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números que deseja inserir:");
        int quantidade = ler.nextInt();

        // PROCESAMENTO
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int numero = ler.nextInt();
            listaNumero.add(numero);
        }

        // SAIDA
        System.out.println("Números pares:");
        for (int numero : listaNumero) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        ler.close();
    }
}