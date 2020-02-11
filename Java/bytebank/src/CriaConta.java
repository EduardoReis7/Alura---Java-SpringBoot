import javax.swing.plaf.synth.SynthSeparatorUI;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 300;
		segundaConta.agencia = 146;
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.agencia);

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		if (primeiraConta == segundaConta) {
			System.out.println("identico");
		} else {
			System.out.println("diferente");
		}
	}
}
