package lista1;
import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();
		
		System.out.println("O n�mero anterior � " + numero + " �: " + (numero-1) + ", e o pr�ximo n�mero �: " + (numero+1));
		
		
	}

}
