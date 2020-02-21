package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaiorNumero {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(10);
		numeros.add(33);
		
		numeros.sort((s1, s2) -> Integer.compare(s1, s2));
		System.out.println(Collections.max(numeros));
	}

}
