package br.com.loiane.exercicio22;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos CDs voc� comprou? ");
		int cd = scanner.nextInt();
		
		double soma = 0;
		
		for (int i = 0; i <= cd; i++) {
			System.out.println("Pre�o do CD: ");
			double preco = scanner.nextDouble();
			soma += preco;
		}
		double media = soma / cd;
		
		System.out.println("A m�dia final foi de R$" + media + " investidos.");
		
		scanner.close();
	}

}
