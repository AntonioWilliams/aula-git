package br.curso.modelo;

import java.util.Calendar;

public class Funcionario {

	private String nome;
	private String matricula;
	private Calendar dataNascimento;

	public Funcionario(String nome, String matricula, Calendar dataNascimento) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString(){
		return "Funcionario: " + nome;
	}

}
