package br.com.loiane.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean parar = false;
		
		while (parar != true) {
			
			System.out.println("Você quer ver a tabuada de qual número? (0 - 10)");
			int tabuada = scanner.nextInt();
			System.out.println("Tabuada do " + tabuada);
			
			for (int i = 0; i <= 10 ; i++) {
				System.out.println("Tabuada do " + tabuada + ":");
				System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			}
			
			System.out.println("Quer ver a tabuada de algum outro valor? (s - n)");
			Character continuacao = scanner.next().charAt(0);
				if (continuacao.equals('s')) {
					parar = false;
				} else if( continuacao.equals('n')) {
					parar = true;
				} else {
					System.out.println("Valor inválido");
				}
		}
		
		scanner.close();
	}

}
