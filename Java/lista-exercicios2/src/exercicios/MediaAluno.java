package exercicios;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] notas = new int[5];
		int soma = 0;
		double media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.print("Digite a nota: ");
			
			int nota = scanner.nextInt();
				if(nota >= 0 && nota <= 10) {
					notas[i] = nota;
					System.out.println(notas[i]);
					soma += notas[i];
			} else {
				System.out.println("S� � poss�vel inserir valores inteiros entre 0 e 100.");
				i--;
			}
		}
		
		media = soma / notas.length;
		System.out.println("Media: " + media);
	}

}
