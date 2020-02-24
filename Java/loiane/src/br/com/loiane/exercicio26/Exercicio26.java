package br.com.loiane.exercicio26;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Fatorial: ");
		int n = scanner.nextInt();
		
		System.out.println("Fatorial de: "+ n);
		System.out.print(n + "! = ");
		
		for (int i = n; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print("1 = " + fatorial);
		
	}

}
