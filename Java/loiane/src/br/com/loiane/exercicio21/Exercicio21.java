package br.com.loiane.exercicio21;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o número de turmas: ");
		int turmas = scanner.nextInt();
		
		int somaAlunos = 0;
		
		for (int i = 1; i <= turmas; i++) {
			System.out.println("Informe o número de alunos: ");
			int alunos = scanner.nextInt();
			
			if (alunos > 40) {
				System.out.println("Número de alunos inválido.(Máx: 40).");
				i--;
			} else {
				somaAlunos += alunos;
			}
		}
		double media = somaAlunos / turmas;
		
		System.out.println("A média de alunos por turma é " + media);
		
		scanner.close();
	}

}
