package br.com.gabriel.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("gabrieltestecsv.txt"));
		
		
		
		
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();
			
			String valorFormatado = String.format("%s -  %d %d %s %s", valor1, valor2, valor3, valor4, valor5);
			bw.write(valorFormatado);
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			
			
			
			
//			String[]valores = linha.split(",");
//			System.out.println(valores[2]);
			
		}
		bw.close();
		
		
		
		
		
		scanner.close();
		
		
		

	}

}
