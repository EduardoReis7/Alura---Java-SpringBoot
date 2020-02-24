package br.com.loiane.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		boolean parar = false;
		double media = 0;
		double somaNotas = 0;
		int n = 0;
		
		while (parar != true) {
			
			System.out.println("Digite uma nota: ");
			double nota = scanner.nextDouble();
			somaNotas += nota;
			n++;
			System.out.println("Deseja inserir uma nova nota? (s - n)");
			Character continuar = scanner.next().charAt(0);
				if (continuar.equals('s')) {
					parar = false;
				} else {
					parar = true;
				}
		}
		media = somaNotas / n;
		System.out.println("Soma: " + somaNotas);
		System.out.println("Media: " + media);

		scanner.close();
	}
}
