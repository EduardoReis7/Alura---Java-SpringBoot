package br.com.loiane.exercicio3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Validador validador = new Validador();
		
		boolean correto = false;
		
		while( correto != true) {
			
			System.out.println("Nome: ");
			String nome = scanner.next();
			
			System.out.println("Idade: ");
			int idade = scanner.nextInt();
			
			System.out.println("Sal�rio: ");
			BigDecimal salario = scanner.nextBigDecimal();	
			
			System.out.println("Sexo(m - f): ");
			Character sexo = scanner.next().charAt(0);
			
			System.out.println("Estado Civil(s - c - v - d): ");
			Character estadoCivil = scanner.next().charAt(0);
			
			if ((validador.validaNome(nome) && validador.validaIdade(idade) && validador.validaSalario(salario) && validador.validaSexo(sexo) && validador.validaEstadoCivil(estadoCivil)) != true ) { 
				correto = false;
				System.out.println("Algum dos valores digitados est� incorreto. Tente novamente.");
			} else {
				correto = true;
				System.out.println("Todas as informa��es foram validadas com sucesso.");
			}
		}
		scanner.close();
	}
	
	
}
