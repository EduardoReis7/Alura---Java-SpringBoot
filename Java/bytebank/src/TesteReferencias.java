public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		if (segundaConta == primeiraConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("conta diferente");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
