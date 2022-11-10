package br.com.gabriel.java.io.teste;

import java.io.Serializable;

public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9205117266306915548L;
	private String nome;
	private String cpf;
	private String dt_nascimento;
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	@Override
	public String toString() {
		
		return this.getNome();
	}
	
	
}
