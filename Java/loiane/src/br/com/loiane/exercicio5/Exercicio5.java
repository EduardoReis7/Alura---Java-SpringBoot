package br.com.loiane.exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("População do país A: ");
		double paisA = scanner.nextDouble();
		System.out.println("População do país B: ");
		double paisB = scanner.nextDouble();

		
		int anos = 0;
		while (paisA <= paisB) {
			
			paisA += paisA * 0.03;
			paisB += paisB * 0.015;
			anos++;
			System.out.println("Pais A : " + paisA + "    Pais B : " + paisB);
		}
		System.out.println("ano : " + anos);
		
		
	}

}
