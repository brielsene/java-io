package br.com.gabriel.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Classe para receber o arquivo de fora
		FileInputStream fis = new FileInputStream("gabriel.txt");
		
		
		//Classe para transformar os bits e bytes em String
		InputStreamReader isr = new InputStreamReader(fis);
		
		
		//Classe com método que pega as Strings
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		

	}

}
