package br.com.gabriel.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Classe FileWriter
//		FileWriter fw = new FileWriter("teste.txt");
		
		//Que é a mesma coisa que:
		//OutputStream fos = new FileOutputStream("gabriel2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter ("teste2.txt"));
		
		bw.write("Olá");
		
		bw.newLine();
	
		bw.write("tudo bem?");
		
		bw.newLine();
		
		
		bw.close();
	}

}
