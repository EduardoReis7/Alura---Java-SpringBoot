package br.com.loiane.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean login = false;
		
		while (login != true) {
			System.out.println("Usu�rio: ");
			String usuario = scanner.next();
			System.out.println("Senha: ");
			String senha = scanner.next();
			
			if ( senha.equals(usuario)) {
				System.out.println("N�o � permitido o uso de usu�rio ou senha iguais.");
			} else { 
				System.out.println("Bem-vindo!");
				login = true;
			}
		}
		
		scanner.close();
	}

}
