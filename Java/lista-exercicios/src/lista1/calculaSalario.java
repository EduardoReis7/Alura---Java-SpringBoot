package lista1;
import java.util.Scanner;

public class calculaSalario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salarioMinimo = 1045;
		
		System.out.println("Digite seu sal�rio: ");
		double salario = scanner.nextDouble();
		
		int quantidadeSM = 0;
		
		while (salarioMinimo <= salario) {
			quantidadeSM++;
			salarioMinimo+= 1045;
		}
		System.out.println(quantidadeSM);
	}

}
