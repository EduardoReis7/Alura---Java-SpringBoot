public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(783, 0234);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
