package br.com.gabriel.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscreverArquivoCsv {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("gabrie.csv");
		
		BufferedWriter bw  =new BufferedWriter(fw);
		
		
		
		bw.write("CC, 12, 24, Gabriel de Sene, 1200.00");
		
		bw.close();

	}

}
