package br.com.gabriel.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeituraEscrita {

	public static void main(String[] args) throws IOException {
		
		//Leitura
		InputStream fis = new FileInputStream("gabriel.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		//Escrita
		OutputStream osl = new FileOutputStream("gabriel.txt3");
		Writer osw = new OutputStreamWriter(osl);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//Copia da Leitura para escrita
//		bw.write(br.readLine());
//		bw.newLine();
//		bw.write(br.readLine());
//		bw.newLine();
//		bw.write(br.readLine());
//		bw.newLine();
		
		//Automatizar
		for(int i=0;i<=2;i++) {
			bw.write(br.readLine());
			bw.newLine();
			
		}
		
		
		
		br.close();
		bw.close();

	}

}
