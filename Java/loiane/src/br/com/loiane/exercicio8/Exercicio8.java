package br.com.loiane.exercicio8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		double media = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + "� numero: ");
			int n = scanner.nextInt();
			soma += n;
		}
		
		media = soma / 5;
		System.out.println("A soma dos valores digitados: " + soma);
		System.out.println("A m�dia: " + media);
		
		scanner.close();
	}
}