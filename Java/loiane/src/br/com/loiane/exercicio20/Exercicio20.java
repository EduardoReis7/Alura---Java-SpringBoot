package br.com.loiane.exercicio20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o total de alunos da turma? ");
		int alunos = scanner.nextInt();
		int i = 1;
		int soma = 0;
		double media = 0;
		String resultado;
		
		while(i <= alunos) {
			System.out.println("Informe a sua idade: ");
			int idade = scanner.nextInt();
			soma += idade;
			media = soma / alunos;
			i++;
		}
		
		if (media > 0 && media < 25) {
			resultado = "Jovem";
		} else if (media > 25 && media < 60) {
			resultado = "Adulta";
		} else {
			resultado = "Idosa";
		}
		
		System.out.println("A média de idades da turma é : " + media);
		System.out.println("Isso significa que se trata de uma turma " + resultado);
		
		scanner.close();
	}

}
