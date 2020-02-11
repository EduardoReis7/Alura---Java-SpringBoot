public class TesteIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		double deducao = 0;
		if (salario < 1903.98) {
			System.out.println("Isento de dedução no IRPF.");
		}else if(salario >= 1903.99 && salario <= 2826.65) {
			deducao = 142.80;
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			deducao = 354.80;
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			deducao = 636.13;
		} else {
			deducao = 869.35;
		}
		
		System.out.println("Para o salario R$" + salario + " a dedução total foi: R$"+deducao);
		System.out.println("Reajustando, o valor ficou: R$" + (salario - deducao));
	}
}
