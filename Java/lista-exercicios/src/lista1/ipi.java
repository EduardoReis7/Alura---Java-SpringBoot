package lista1;
import java.util.Scanner;

public class ipi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoPeca1 = 1234;
		int codigoPeca2 = 4321;
		double valorPeca1 = 240;
		double valorPeca2 = 320;
		
		
		System.out.println("Quantidade de pe�as 1: ");
		int quantidade1 = scanner.nextInt();
		System.out.println("Quantidade de pe�as 2: ");
		int quantidade2 = scanner.nextInt();
		
		double ipi = (valorPeca1 * quantidade1 + valorPeca2 * quantidade2) * (0.01 + 1);
		
		System.out.println("Pe�a 1, c�digo: " + codigoPeca1 + ", quantidade de pe�as: " + quantidade1);
		System.out.println("Pe�a 2, c�digo: " + codigoPeca2 + ", quantidade de pe�as: " + quantidade2);
		System.out.println("Total a pagar: " + ipi);
		
	}

}
