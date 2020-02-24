package br.com.loiane.exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int n2 = scanner.nextInt();
		
		int soma = 0;
		
		
		if (n1 < n2) {
			while (n1 <= n2) {
				System.out.println(n1);
				soma += n1;
				n1++;
			}
		} else {
			while (n1 >= n2) {
				System.out.println(n1);
				soma += n1;
				n1--;
			}
		}
		
		System.out.println(soma);
	}

}
