package br.com.gabriel.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Pessoa p = new Pessoa();
		p.setNome("Gabriel Sene");
		p.setCpf("518709999");
		p.setDt_nascimento("30/03/2005");
		
		//Escrevendo objeto para binário , serearilização
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto2.bin"));
		oos.writeObject(p);
		oos.close();
		
		/**
		 * Lendo binário para objeto
		 */
//		
//		ObjectInputStream ois = new ObjectInputStream (new FileInputStream("objeto2.bin"));
//		Pessoa pessoa = (Pessoa) ois.readObject();
//		System.out.println(pessoa.getCpf());
//		System.out.println();
//		System.out.println(pessoa.getDt_nascimento());
//		System.out.println();
//		System.out.println(pessoa.getNome());
		
		
		
		
		
		
		

	}

}
