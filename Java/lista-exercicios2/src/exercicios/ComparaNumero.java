package exercicios;

import java.util.Comparator;
import java.util.Scanner;

public class ComparaNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer n1 = scanner.nextInt();
		Integer n2 = scanner.nextInt();
		
		Integer comparador = n1.compare(n1, n2);
		if ( comparador == 0) {
			System.out.println("Os valores s�o iguais");
		} else {
			System.out.println("Os valores s�o diferentes");
		}
	}

}
