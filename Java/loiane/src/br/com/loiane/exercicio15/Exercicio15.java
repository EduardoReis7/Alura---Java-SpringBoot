package br.com.loiane.exercicio15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quer ver a sequência Fibonacci até qual número?");
		int n = scanner.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		System.out.println(primeiro);
		System.out.println(segundo);
		for(int i = 3; i <= n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
	
	}

}
