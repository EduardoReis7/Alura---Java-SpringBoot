import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa código");
		palavras.add("Caelum");
	
		palavras.sort((s1, s2) -> { //Forma de ordenação anterior
				
			if (s1.length() < s2.length()) {
				return -1;
			} else if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		
		//Forma de ordenação usando Lambda com compare
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

	System.out.println(palavras);

	palavras.forEach(s->System.out.println(s));

}

}