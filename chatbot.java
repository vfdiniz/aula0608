package desafios;

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner ler	 = new Scanner(System.in);

        System.out.println("Chat Bot do Amor");
        System.out.print("Você é legal? (sim/não): ");
        String resposta = ler.nextLine();

        if (resposta.equals("sim")) {
            System.out.println("Você merece um bombom ");
        } else {
            System.out.println("Todo mundo tem seus dias ");
        }

        ler.close();
    }
}