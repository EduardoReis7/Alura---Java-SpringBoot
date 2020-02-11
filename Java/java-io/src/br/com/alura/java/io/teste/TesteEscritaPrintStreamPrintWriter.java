package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

import org.omg.CORBA.Current;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada com Arquivo
		
		long ini = System.currentTimeMillis();
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		ps.println();
		ps.println();
		ps.println("éeéééé´ÇÇÇ");
		
		
		
//		long fim = System.currentTimeMillis();
//		System.out.println(System.currentTimeMillis());
//		
//      System.out.println("Passaram " + (fim - ini) + " milissegundos");
//		
		ps.close();
	}

}
