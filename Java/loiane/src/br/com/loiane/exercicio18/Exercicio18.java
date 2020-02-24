package br.com.loiane.exercicio18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = scanner.nextInt();
		
		boolean primo = true;
		
		for ( int i = 2; i < valor; i++) {
			if ( valor % i == 0) {
				System.out.println("Não é primo! - Divisível por " + i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("É primo!");
		}
		
		scanner.close();
	}

}
