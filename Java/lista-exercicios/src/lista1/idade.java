package lista1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class idade {
	public static void main(String[] args) throws ParseException {
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
//		
//		System.out.println("Digite a data de nascimento(dd/MM/yyyy):");
//		String inputDataNascimentoRecebida = scanner.next();
//		Date date = simpleDateFormat.parse(inputDataNascimentoRecebida);
//		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//		System.out.println(dateTimeFormatter.format(localDate));
		
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy)");
		System.out.println("Digite a sua data de nascimento");
		String str = scanner.next();
		
		String[] separaData = str.split("/");
		String dia = separaData[0];
		String mes = separaData[1];
		String ano = separaData[2];
		int diaInt = Integer.parseInt(dia);
		int mesInt = Integer.parseInt(mes);
		int anoInt = Integer.parseInt(ano);
		mesInt *= 30;
		anoInt *= 365;
		System.out.println(diaInt + mesInt + anoInt);
		
		scanner.close();
		
		
		
	}
}
