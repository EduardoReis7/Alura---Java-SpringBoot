package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		boolean tem = scanner.hasNextLine();
		
		while(scanner.hasNextLine()) {
			
			
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
//			String valores[] = linha.split(",");
//			System.out.println(valores[3]);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
//			String valoresFormatados = String.
			
			System.out.format(new Locale("pt", "br"), "%s - %04d-%08d, %20s: %8.2f %n", valor1, valor2, valor3, valor4, valor5);
		}
		
		scanner.close();
	}

}
