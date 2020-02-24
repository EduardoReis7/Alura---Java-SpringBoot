package br.com.loiane.exercicio17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int n = scanner.nextInt();
		
		System.out.println(n + "! = ");
		
		int fatorial = 1;
		
		for(int i = n; i > 0 ; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado" + fatorial);
		
		scanner.close();
	}

}
