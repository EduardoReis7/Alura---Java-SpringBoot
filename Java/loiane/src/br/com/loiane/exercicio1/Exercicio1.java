package br.com.loiane.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		
		while ( i >= 0 && i <= 10) {
			System.out.println("Digite uma nota (0-10): ");
			int nota = scanner.nextInt();
			if (nota < 0 || nota > 10) {
				System.out.println("Valor inv�lido");
				break;
			} else {
				System.out.println(nota);
			}
		}
		
	}

}
