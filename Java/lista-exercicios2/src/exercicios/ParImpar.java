package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ParImpar {

	public static void main(String[] args) {
		List<Integer> impares = new ArrayList<Integer>();
		List<Integer> pares = new ArrayList<Integer>();
		
		int somaImpar = 0;
		long multiplicaPar = 1L;
		
		for(int i = 1; i <= 30; i++) {
			if ( i % 2 == 0) {
				multiplicaPar *= (i + 2);
				
			} else if (i % 2 == 1) {
				somaImpar += i;
				
			}
		}
		System.out.println(multiplicaPar);
		System.out.println(somaImpar);
	}

}
