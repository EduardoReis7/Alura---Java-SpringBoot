package exercicios;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numero:");
		
		int numero = scanner.nextInt();
				
		for(int i = numero ; i >= 0; i--) {
			System.out.println(i);
		}
				
	}

}
