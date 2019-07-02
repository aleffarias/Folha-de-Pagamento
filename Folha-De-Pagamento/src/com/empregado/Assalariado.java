package com.empregado;

import java.util.ArrayList;
import java.util.Scanner;

public class Assalariado extends Empregado {
	
	Scanner input = new Scanner(System.in);
	
	// Construtor 
	public Assalariado(int numeroEmpregado, String nome, String endereco, int metodoPagamento, int isSindicato, int tipo, String tipoAgenda, int diaSemana) {
		super(numeroEmpregado, nome, endereco, metodoPagamento, isSindicato, tipo, tipoAgenda, diaSemana);
	}
	
	
	// Salário
	private double salarioAssalariadoFixo;
	private double salarioAssalariadoLiq;
	
	@Override
	public void salario() {
		System.out.print("\nInforme o salário fixo mensal:\nExemplo: 1500 - 3000.56\nR$ ");
		double salarioTemp = input.nextDouble();
		input.nextLine();
		
		this.salarioAssalariadoFixo = salarioTemp;
		
	}
	
	@Override
	public void pagarEmpregado(ArrayList<Empregado> empregado, int index) {
		this.salarioAssalariadoLiq = salarioAssalariadoFixo - getSindicato().getTaxaSindicall() - getSindicato().getValorTaxaServico();
		System.out.println(empregado.get(index).toString() + "\n");
		this.salarioAssalariadoLiq = 0;
	}
	
	//======================================= Get/Set =================================================
	
	
	public double getSalarioAssalariadoFixo() {
		return salarioAssalariadoFixo;
	}

	public double getSalarioAssalariadoLiq() {
		return salarioAssalariadoLiq;
	}
	
	@Override
	public String toString() {
		String string;
		
		string = super.toString();
		
		string += "Tipo: Assalariado		Salário Bruto: R$ " + this.salarioAssalariadoFixo;
		string += "\n--------------------------------------------------------------------------------------------------------\n";
		string += "Agenda de Pagamento: " + this.getTipoAgenda() + "	Dia: " + this.getDiaFrequencia();
		string += "\n________________________________________________________________________________________________________\n";
		string += "Salário Líquido: R$ " + this.salarioAssalariadoLiq;
		
		return string;
	}

}
