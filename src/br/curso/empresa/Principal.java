package br.curso.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.curso.modelo.Funcionario;


/*
 * Cada macaco do seu galho.
 * 
 * Vamos ver como fazer isso.
 * 
 */


public class Principal {
	
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1988, 10, 01);
		Funcionario funcionario = new Funcionario("Antonio",  "132465", dataNascimento);
		
		System.out.println(funcionario);
		
	}
}
