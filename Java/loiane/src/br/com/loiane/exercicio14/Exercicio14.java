package br.com.loiane.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º valor: ");
			int n = scanner.nextInt();
			
			if ( n % 2 == 0) {
				pares ++;
			} else if (n % 2 == 1) {
				impares ++;
			}
		}
		
		System.out.println("Total de valores pares informados: " + pares);
		System.out.println("Total de valores impares informados: " + impares);
		
		scanner.close();
	}

}
