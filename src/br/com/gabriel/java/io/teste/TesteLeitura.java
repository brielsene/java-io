package br.com.gabriel.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Classe para receber o arquivo de fora
		InputStream fis = new FileInputStream("gabriel.txt");
		
		
		//Classe para transformar os bits e bytes em String
		Reader isr = new InputStreamReader(fis);
		
		
		//Classe com método que pega as Strings
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
		

	}

}
