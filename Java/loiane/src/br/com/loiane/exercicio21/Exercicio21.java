package br.com.loiane.exercicio21;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o n�mero de turmas: ");
		int turmas = scanner.nextInt();
		
		int somaAlunos = 0;
		
		for (int i = 1; i <= turmas; i++) {
			System.out.println("Informe o n�mero de alunos: ");
			int alunos = scanner.nextInt();
			
			if (alunos > 40) {
				System.out.println("N�mero de alunos inv�lido.(M�x: 40).");
				i--;
			} else {
				somaAlunos += alunos;
			}
		}
		double media = somaAlunos / turmas;
		
		System.out.println("A m�dia de alunos por turma � " + media);
		
		scanner.close();
	}

}
