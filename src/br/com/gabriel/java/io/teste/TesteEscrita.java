package br.com.gabriel.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("gabriel2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Oi, tudo bem??");
//		bw.newLine();
		bw.newLine();
		bw.write("eu sou o seu arquivo txt,");
		bw.newLine();
		bw.write("aproveite");
		
		
		

		bw.close();

	}

}
