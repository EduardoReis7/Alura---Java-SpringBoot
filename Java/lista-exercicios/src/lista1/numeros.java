package lista1;
import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = scanner.nextInt();
		
		System.out.println("O número anterior à " + numero + " é: " + (numero-1) + ", e o próximo número é: " + (numero+1));
		
		
	}

}
