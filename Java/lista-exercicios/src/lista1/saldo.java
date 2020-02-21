package lista1;

public class saldo {
	public static void main(String[] args) {
		double saldo = 300;
		double novoSaldo = (saldo * 0.01) + saldo;
		
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo com reajuste: "+ novoSaldo);
	}
}
