import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		//Exibe a data de hoje
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println("----------------");
		//Grava e exibe a data desejada
		LocalDate olimpiadasToquio = LocalDate.of(2020, Month.JULY, 24);
		System.out.println(olimpiadasToquio);
		
		System.out.println("----------------");
		//Captura e exibe a quantidade de dias entre uma data e outra
		int meses = olimpiadasToquio.getMonthValue() - hoje.getMonthValue();
		System.out.println(meses);
		
		System.out.println("----------------");
		//Exibe um período entre datas
		Period periodo = Period.between(hoje, olimpiadasToquio);
		System.out.println(periodo);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		System.out.println("----------------");
		//Adiciona e subtrai a quantidade de dias, meses e anos desejados
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2));
		
		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		System.out.println("----------------");
		//Adiciona a quantidade desejada de anos, partindo do valor padrão
		olimpiadasToquio.plusYears(4);
		System.out.println(olimpiadasToquio);
		
		LocalDate proximasOlimpiadas = olimpiadasToquio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		System.out.println("----------------");
		//Formata a data para o padrão desejado
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		System.out.println("----------------");
		//Formata a data e hora para o padrão desejado
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		System.out.println("----------------");
		//Exibe apenas o ano e mês desejado
		YearMonth anoEMes = YearMonth.of(2020, Month.FEBRUARY);
		System.out.println(anoEMes);
		
		System.out.println("----------------");
		//Exibe apenas um intervalo de tempo
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
	}

}
