package br.curso.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.curso.modelo.Funcionario;
import br.curso.modelo.Gasto;

public class TestaGasto {
	
	public static void main(String[] args) {
		Calendar dataNascimento = new  GregorianCalendar(1987, 5, 14);
		Funcionario funcionario = new Funcionario("maleta", "456", dataNascimento );
		Calendar hoje = Calendar.getInstance();
		
		Gasto gasto = new Gasto(40, "taxi", funcionario, hoje);
		Gasto gasto2 = new Gasto(40, "taxi", funcionario, hoje);
		Gasto gasto3 = new Gasto(40, "taxi", funcionario, hoje);
		
		System.out.println(gasto );
		System.out.println(gasto2 );
		System.out.println(gasto3 );
	}
}
