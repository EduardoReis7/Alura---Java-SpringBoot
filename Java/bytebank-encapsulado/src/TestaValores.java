public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(3212, 231354);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		System.out.println(Conta.getTotal());
		
		Conta conta2 = new Conta(2313, 426142);
		System.out.println(Conta.getTotal());
	}
}
