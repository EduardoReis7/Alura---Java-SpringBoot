package br.com.loiane.exercicio22;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos CDs você comprou? ");
		int cd = scanner.nextInt();
		
		double soma = 0;
		
		for (int i = 0; i <= cd; i++) {
			System.out.println("Preço do CD: ");
			double preco = scanner.nextDouble();
			soma += preco;
		}
		double media = soma / cd;
		
		System.out.println("A média final foi de R$" + media + " investidos.");
		
		scanner.close();
	}

}
