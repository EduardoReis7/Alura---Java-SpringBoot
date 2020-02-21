import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa código");
		palavras.add("Caelum");
	
//		palavras.sort((s1, s2) -> { //Forma de ordenação anterior
//				
//			if (s1.length() < s2.length()) {
//				return -1;
//			} else if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		
		//Forma de ordenação usando Lambda com compare
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Formas resumidas com Lambda e Method references
		palavras.sort(Comparator.comparing(s -> s.length())); 
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		
		//Forma sem lambda
		Function<String, Integer> funcao3 = new Function<String, Integer>() { 

			@Override
			public Integer apply(String s) {
				return s.length();
			}
			
		};
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		palavras.forEach(System.out::println);

	}

}