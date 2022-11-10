package br.com.gabriel.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
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
		
		BufferedReader br = new BufferedReader(new FileReader("gabriel.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter ("teste2.csv"));
		
		bw.write(br.readLine());
		bw.newLine();
		bw.write(br.readLine());
		bw.newLine();
		bw.write(br.readLine());
		bw.newLine();
		
		
		bw.close();
		br.close();
	}

}
