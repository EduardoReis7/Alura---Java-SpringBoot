package br.com.loiane.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Potenciação:");
		
		System.out.println("Digite a base: ");
		int base = scanner.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = scanner.nextInt();
		
		int potencia = 1;
		for (int i = 1; i <= expoente; i++) {
			potencia *= base;
		}
		
		System.out.println("Resultado: " + potencia);
		
		scanner.close();
	}

}
