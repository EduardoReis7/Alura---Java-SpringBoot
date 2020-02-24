package br.com.loiane.exercicio25;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean parar = false;
		String continuarCompra;
		int quantidadeProdutos;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;
		
		
		do {
			
			System.out.println("Deseja informar uma nova compra? (s - n)");
			continuarCompra = scanner.next();
			
			if(continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				System.out.print("Digite a quantidade de produtos da compra: ");
				quantidadeProdutos = scanner.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= quantidadeProdutos; i++) {
					System.out.print("Informe o preço: R$");
					preco = scanner.nextDouble();
					total += preco;
					
					output += "Produto " + i + " R$" + preco + "\n";
				}
				
				output += "Total: R$" + total + "\n";
				
				System.out.println("Total: R$" + total);
				
				System.out.print("Entre com o valor pago: R$");
				valorPago = scanner.nextDouble();
				
				output += "Dinheiro: R$" + valorPago + "\n";
				
				troco = valorPago - total;
				
				output += "Troco: R$" + troco;
				
				System.out.println(output);
			} else {
				parar = true;
			}
		} while(!parar);
		scanner.close();
	}
}
