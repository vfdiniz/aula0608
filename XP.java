package desafios;

import java.util.Scanner;

public class XP {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a quantidade de XP: ");
		int pontuacao = ler.nextInt();
		if (pontuacao <= 100) {
			System.out.println("Seu nivel é: Noob");
	    } else if (pontuacao <= 500) {
		System.out.println("Seu nível é: Aprendiz");
	   } else if (pontuacao <= 1000) { 
	   
	    System.out.println("Seu Nível é: Pro");
	   } else if (pontuacao > 1000) {
	   }
	   System.out.println("Seu Nivel é: Lendário");
	    

		
		
	}
}
